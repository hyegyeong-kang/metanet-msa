package com.example.coffeeorder.service;

import com.example.coffeeorder.entity.OrderEntity;
import com.example.coffeeorder.repository.CoffeeOrderRepository;
import com.example.coffeeorder.vo.CoffeeOrderVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CoffeeOrderService {

    @Autowired
    private CoffeeOrderRepository coffeeOrderRepository;

    public int coffeeOrder(CoffeeOrderVO vo) {
        OrderEntity orderEntity = new OrderEntity();
        orderEntity.setOrderNumber(vo.getOrderNumber());
        orderEntity.setCoffeeName(vo.getCoffeeName());
        orderEntity.setCoffeeCount(vo.getCoffeeCount());
        orderEntity.setCustomerName(vo.getCustomerName());

        coffeeOrderRepository.save(orderEntity);

        return orderEntity.getId();
    }
}
