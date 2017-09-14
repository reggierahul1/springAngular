package com.mytutorial.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mytutorial.model.Account;
import com.mytutorial.service.AccountService;

@RestController
@RequestMapping("/v1/forecasting")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping(value = "/accounts", method = RequestMethod.GET)
    public List<Account> getAccounts() {
        List<Account> accounts = accountService.getAccounts();
        return accounts;
    }
}
