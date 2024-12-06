package com.bank_management_system.bank_management_system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bank_management_system.bank_management_system.entity.Client;
import com.bank_management_system.bank_management_system.repository.RegisterRepository;

@Controller
@RequestMapping
public class RegisterController {

    @GetMapping("/register")
    public String showRegisterForm() {
        return "register";
    }

    @Autowired
    private RegisterRepository registerRepository;
    @PostMapping("/register")
    public String registerUser(@ModelAttribute Client client) {
        // Logic to register the user
        registerRepository.save(client);
        return "login";
    }
}

