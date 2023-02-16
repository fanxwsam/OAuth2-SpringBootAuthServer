package com.sam.app.resource.controller;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class OrderRest {
    private String orderId;
    private String productId;
    private String userId;
    private int quantity;
    private OrderStatus status;
}
