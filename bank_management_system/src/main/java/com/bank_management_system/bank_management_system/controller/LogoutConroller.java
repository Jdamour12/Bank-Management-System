package com.bank_management_system.bank_management_system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LogoutConroller {
    @GetMapping("/logout")
    public String logout() {
        // Implement logout logic here
        return "redirect:/";
    }
}
