package com.example.coffeeorder.messagequeue;

import com.example.coffeeorder.vo.CoffeeOrderVO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public CoffeeOrderVO send(String kafkaTopic, CoffeeOrderVO vo) {
        ObjectMapper mapper = new ObjectMapper();
        String jsonString = "";

        try {
            jsonString = mapper.writeValueAsString(vo);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        kafkaTemplate.send(kafkaTopic, jsonString);
        System.out.println("메시지 발행:" + vo);

        return vo;
    }

}
