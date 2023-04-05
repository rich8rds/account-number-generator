package com.richards.accountnumbergeneration.controller;

import com.richards.accountnumbergeneration.service.AccountNumberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/")
public class AccountNumberController {
    private final AccountNumberService accountNumberService;
    @GetMapping("generate-account-number")
    public String generateAccount() {
        return accountNumberService.generateAccount();
    }
}
