package com.example.coffeeorder.vo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CoffeeOrderVO {
    private String orderNumber;
    private String coffeeName;
    private int coffeeCount;
    private String customerName;
}
