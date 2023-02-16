package com.sam.app.resource.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@RestController
public class OrderController {

    @GetMapping("/orders")
    public List<OrderRest> getOrders(){
        OrderRest orderRest1 = new OrderRest(UUID.randomUUID().toString(), "ipad-001-01", "Sam001", 10, OrderStatus.APPROVED);
        OrderRest orderRest2 = new OrderRest(UUID.randomUUID().toString(), "ipad-001-02", "Sam001", 20, OrderStatus.DELIVERED);

        return Arrays.asList(orderRest1, orderRest2);
    }
}
