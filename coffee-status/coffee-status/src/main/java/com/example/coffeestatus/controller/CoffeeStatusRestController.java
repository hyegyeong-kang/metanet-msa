package com.example.coffeestatus.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coffee-status")
public class CoffeeStatusRestController {

    @GetMapping("/")
    public String coffeeStatus() {
        return "coffee-status Service";
    }
}
