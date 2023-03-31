package com.example.coffeeorder.controller;

import com.example.coffeeorder.client.OrderServiceClient;
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
    private CoffeeOrderService coffeeOrderService;
    @Autowired
    private OrderServiceClient orderServiceClient;

    @GetMapping("/")
    public String coffeeOrder() {
        return "coffee-order Serivce";
    }

    @PostMapping("/coffeeOrder")
    public ResponseEntity<CoffeeOrderVO> coffeeOrder(@RequestBody CoffeeOrderVO vo) {
        // 회원 유무 체크
        if(!orderServiceClient.getCoffeeMember(vo.getCustomerName())) { // 메소드 호출하면 URL 로 이동함 그리고 메소드 호출됨
            System.out.println(vo.getCustomerName() + "is not a member!");

            return new ResponseEntity<CoffeeOrderVO>(vo, HttpStatus.BAD_REQUEST);
        }

        System.out.println(vo.getCustomerName() + "is a member!");

        // 커피 주문
        coffeeOrderService.coffeeOrder(vo);

        return new ResponseEntity<CoffeeOrderVO>(vo, HttpStatus.OK);
    }
}
