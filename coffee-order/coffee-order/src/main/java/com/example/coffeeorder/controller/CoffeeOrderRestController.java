package com.example.coffeeorder.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coffee-order")
public class CoffeeOrderRestController {

    @GetMapping("/")
    public String coffeeOrder() {
        return "coffee-order Serivce";
    }
}
