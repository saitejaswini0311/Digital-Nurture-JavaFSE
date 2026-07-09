package com.cognizant.JWT_handson.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationController {

    @GetMapping("/authenticate")
    public Map<String, String> authenticate() {

        Map<String, String> map = new HashMap<>();

        map.put("token", "dummy-jwt-token");

        return map;
    }
}