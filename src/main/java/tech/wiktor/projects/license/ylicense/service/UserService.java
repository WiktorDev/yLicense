package tech.wiktor.projects.license.ylicense.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import tech.wiktor.projects.license.ylicense.model.User;
import tech.wiktor.projects.license.ylicense.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService{
    User save(UserRegistrationDto registrationDto);
}