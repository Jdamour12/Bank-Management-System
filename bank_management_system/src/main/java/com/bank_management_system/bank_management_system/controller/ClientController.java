package com.bank_management_system.bank_management_system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClientController {
    @GetMapping("/")
    public String defaultPage() {
        return "transfer";
    }
    @GetMapping("/transfer")
    public String home() {
        return "transfer";
    }

    @GetMapping("/account")
    public String account() {
        return "account"; // Maps to account.html
    }

    @GetMapping("/cards")
    public String cards() {
        return "cards"; // Maps to cards.html
    }

    @GetMapping("/profile")
    public String profile() {
        return "profile"; // Maps to profile.html
    }

    @GetMapping("/apply_for_card")
    public String applyForCard() {
        return "apply_for_card"; // Maps to apply_for_card.html
    }

}
