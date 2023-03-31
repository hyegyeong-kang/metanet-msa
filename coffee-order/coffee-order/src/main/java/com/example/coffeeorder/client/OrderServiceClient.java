package com.example.coffeeorder.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "coffee-member")
public interface OrderServiceClient {
    @GetMapping("coffee-member/existMember/{memberName}")
    boolean getCoffeeMember(@PathVariable String memberName);


}
