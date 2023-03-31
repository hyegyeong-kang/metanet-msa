package com.example.coffeestatus.service;

import com.example.coffeestatus.mapper.CoffeeMapper;
import com.example.coffeestatus.vo.CoffeeStatusVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoffeeStatusService {
    @Autowired
    private CoffeeMapper coffeeMapper;

    public int createStatusTable() {
        return coffeeMapper.createStatusTable();
    }

    public int insertCoffeeOrderStatus(CoffeeStatusVO vo) {
        return coffeeMapper.insertCoffeeOrderStatus(vo);
    }

    public List<CoffeeStatusVO> selectCoffeeOrderStatus() {
        return coffeeMapper.selectCoffeeOrderStatus();
    }
}
