package com.example.react.controllers;

import com.example.react.dto.ContactTo;
import com.example.react.dto.Login;
import com.example.react.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
public class LoginController {
    @Autowired
    private LoginService service;

    @RequestMapping(method = RequestMethod.POST, value = "/login")
    public ContactTo login(@RequestBody Login login) {
        return service.findByNameAndPassword(login.getName(), login.getPassword());
    }
}
