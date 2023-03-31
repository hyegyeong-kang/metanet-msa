package com.example.coffeeorder.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoffeeOrderRestController {

    @GetMapping("/order")
    public String order() {
        return "coffee order";
    }
}
