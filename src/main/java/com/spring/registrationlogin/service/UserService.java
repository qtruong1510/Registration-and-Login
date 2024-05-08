package com.spring.registrationlogin.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.spring.registrationlogin.model.User;
import com.spring.registrationlogin.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);
}
