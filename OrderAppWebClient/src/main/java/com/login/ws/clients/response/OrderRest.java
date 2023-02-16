package com.login.ws.clients.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderRest {
    private String orderId;
    private String productId;
    private String userId;
    private int quantity;

}
