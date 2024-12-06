package com.bank_management_system.bank_management_system.controller;
import com.bank_management_system.bank_management_system.entity.Transfer;
import com.bank_management_system.bank_management_system.repository.TransferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class TransferController {


    @GetMapping("/transfer")
    public String transfer(){
        return "transfer";
    }    

    @Autowired
    private TransferRepository transferRepository;

    @PostMapping("/transfer")
    public String handleTransfer(@ModelAttribute Transfer transfer) {
        transferRepository.save(transfer);
        return "transfer";
    }
    
}
