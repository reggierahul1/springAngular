package com.mytutorial.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.mytutorial.model.Account;

@Service
public class AccountServiceImpl implements AccountService {

    public List<Account> getAccounts() {
        List<Account> accounts = new ArrayList<Account>();
        Account account1 = new Account("001", "John", 256.00f);
        Account account2 = new Account("002", "Peter", 386.00f);
        accounts.add(account1);
        accounts.add(account2);

        return accounts;
    }
}