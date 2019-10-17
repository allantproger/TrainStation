package kz.edu.nu.cs.se.service;

import kz.edu.nu.cs.se.model.User;
import kz.edu.nu.cs.se.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    User findByEmail(String email);

    User save(UserRegistrationDto registration);
}
