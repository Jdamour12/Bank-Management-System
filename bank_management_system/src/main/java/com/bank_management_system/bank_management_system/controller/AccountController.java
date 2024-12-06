package com.bank_management_system.bank_management_system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bank_management_system.bank_management_system.entity.Account;
import com.bank_management_system.bank_management_system.repository.AccountRepository;
@Controller
public class AccountController {
    @GetMapping("/account")
    public String account() {
        return "account";
    }

    @Autowired
    private AccountRepository accountRepository;

    @PostMapping("/account")
    public String accountPost(@ModelAttribute Account account) {
        accountRepository.save(account);
        // Implement the logic to handle the form submission
        return "account";
    }
}
