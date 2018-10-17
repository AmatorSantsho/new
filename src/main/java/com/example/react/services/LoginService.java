package com.example.react.services;

import com.example.react.dto.ContactTo;

public interface LoginService {
    public ContactTo findByNameAndPassword(String name, String password);
}
