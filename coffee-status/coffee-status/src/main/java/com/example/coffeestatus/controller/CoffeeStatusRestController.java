package com.example.coffeestatus.controller;


import com.example.coffeestatus.service.CoffeeStatusService;
import com.example.coffeestatus.vo.CoffeeStatusVO;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/coffee-status")
public class CoffeeStatusRestController {

    @Autowired
    CoffeeStatusService coffeeStatusService;

    @GetMapping("/")
    public String coffeeStatus() {
        return "coffee-status Service";
    }

    @GetMapping("/createStatusTable")
    public void createStatusTable() {
        coffeeStatusService.createStatusTable();
    }

    @GetMapping("/coffeeOrderStatus")
    public ResponseEntity<List<CoffeeStatusVO>> coffeeOrderStatus() {
        List<CoffeeStatusVO> list = coffeeStatusService.selectCoffeeOrderStatus();

        return new ResponseEntity<List<CoffeeStatusVO>>(list, HttpStatus.OK);
    }

}
