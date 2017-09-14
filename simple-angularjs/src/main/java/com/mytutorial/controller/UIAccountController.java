package com.mytutorial.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/ui")
public class UIAccountController {

    @RequestMapping(value = "/accounts", method = RequestMethod.GET)
    public String listAccounts() {
        return "accounts"; // i.e. accounts.jsp
    }
}
