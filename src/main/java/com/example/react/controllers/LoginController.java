package com.example.react.controllers;

import com.example.react.dto.ContactTo;
import com.example.react.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class LoginController {
    @Autowired
    private LoginService service;

    @GetMapping("/login/{name}/{password}")
    public ContactTo login(@PathVariable String name, @PathVariable String password) {
        return service.findByNameAndPassword(name, password);
    }
}
