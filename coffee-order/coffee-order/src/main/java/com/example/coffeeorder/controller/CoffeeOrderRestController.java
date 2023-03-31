package com.example.coffeeorder.controller;

import com.example.coffeeorder.service.CoffeeOrderService;
import com.example.coffeeorder.vo.CoffeeOrderVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/coffee-order")
public class CoffeeOrderRestController {

    @Autowired
    CoffeeOrderService coffeeOrderService;

    @GetMapping("/")
    public String coffeeOrder() {
        return "coffee-order Serivce";
    }

    @PostMapping("/coffeeOrder")
    public ResponseEntity<CoffeeOrderVO> coffeeOrder(@RequestBody CoffeeOrderVO vo) {
        // 회원 유무 체크

        // 커피 주문
        coffeeOrderService.coffeeOrder(vo);

        return new ResponseEntity<CoffeeOrderVO>(vo, HttpStatus.OK);
    }
}
