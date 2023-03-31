package com.example.coffeemember.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coffee-member")
public class CoffeeMemberRestController {

    @GetMapping("/")
    public String coffeeMember() {
        return "coffee-member Service";
    }
}
