package com.bank_management_system.bank_management_system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
@RequestMapping
public class LoginController {

    @GetMapping("/")
    public String showLoginFormByDefault() {
        return "login";
    }
    @GetMapping("/login")
    public String showLoginForm() {
        return "login";
    }
    
}
