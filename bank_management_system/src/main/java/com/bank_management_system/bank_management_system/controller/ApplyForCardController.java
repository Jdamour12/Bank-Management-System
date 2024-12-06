package com.bank_management_system.bank_management_system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bank_management_system.bank_management_system.entity.Cards;
import com.bank_management_system.bank_management_system.repository.ApplyForCardRepository;

@Controller
@RequestMapping
public class ApplyForCardController {
    @GetMapping("/apply_for_card")
    public String applyForCard() {
        return "apply_for_card";
    }

    @Autowired
    private ApplyForCardRepository applyForCardRepository;
    @PostMapping("/apply_for_card")
    public String submitApplication(@ModelAttribute Cards cards) {
        applyForCardRepository.save(cards);
        return "/apply_for_card";
    }
}
