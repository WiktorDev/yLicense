package tech.wiktor.projects.license.ylicense.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import tech.wiktor.projects.license.ylicense.model.License;
import tech.wiktor.projects.license.ylicense.repository.LicenseRepository;
import tech.wiktor.projects.license.ylicense.utils.RandomUtil;

import java.util.ArrayList;
import java.util.Date;

@Controller
public class MainController {
    @Autowired
    private LicenseRepository repository;
    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/panel")
    public String panel(){
        return "panel";
    }

    @GetMapping("/panel/license")
    public String license(Model model){
        ArrayList<License> licenses = (ArrayList<License>) repository.findAll();
        model.addAttribute("licenses", licenses);
        return "license";
    }

    @PostMapping("/panel/license")
    public String handleForm(@RequestParam("service") String service, @RequestParam("owner") String owner, @RequestParam("license") String license) {
        if(license.isEmpty() == true){
            license = RandomUtil.getSaltString(25);
        }
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String currentPrincipalName = authentication.getName();

        License newLicense = new License();
        newLicense.setLicense_key(license);
        newLicense.setService(service);
        newLicense.setOwner(owner);
        newLicense.setCreateUser(currentPrincipalName);
        newLicense.setCreateDate(System.currentTimeMillis());
        repository.save(newLicense);
        return "redirect:/panel/license?success";
    }
}