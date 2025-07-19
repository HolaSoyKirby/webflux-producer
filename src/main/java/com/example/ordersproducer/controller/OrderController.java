package com.example.ordersproducer.controller;

import com.example.ordersproducer.model.OrderRequest;
import com.example.ordersproducer.producer.OrderKafkaProducer;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("order")
public class OrderController {

    private final OrderKafkaProducer orderKafkaProducer;

    public OrderController(
            OrderKafkaProducer orderKafkaProducer
    ) {
        this.orderKafkaProducer = orderKafkaProducer;
    }

    @PostMapping("new-order")
    public ResponseEntity<String> sendOrder(@RequestBody OrderRequest orderRequest) {
        return new ResponseEntity<>(orderKafkaProducer.sendMessage(orderRequest), HttpStatus.CREATED);
    }
}