package com.cognizant.JWT_handson.service;

import org.springframework.stereotype.Service;

@Service
public class JwtService {

    public String generateToken(String username) {

        return "dummy-jwt-token";

    }

}