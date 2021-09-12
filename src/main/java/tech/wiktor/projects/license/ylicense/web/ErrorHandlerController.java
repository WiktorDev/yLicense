package tech.wiktor.projects.license.ylicense.web;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ErrorHandlerController implements ErrorController {

    @RequestMapping("/error")
    public String handleError(Model model, HttpServletRequest httpRequest) {
        int httpErrorCode = getErrorCode(httpRequest);
        String errorMsg = "";
        switch (httpErrorCode){
            case 404:
                errorMsg = "Page not found!";
            break;
            case 500:
                errorMsg = "Internal Server Error!";
            break;
            default:
                errorMsg = "Page error!";
        }
        model.addAttribute("errorCode", httpErrorCode);
        model.addAttribute("errorMsg", errorMsg);
        return "error";
    }

    @Override
    public String getErrorPath() {
        return "/error";
    }
    private int getErrorCode(HttpServletRequest httpRequest) {
        return (Integer) httpRequest
                .getAttribute("javax.servlet.error.status_code");
    }
}