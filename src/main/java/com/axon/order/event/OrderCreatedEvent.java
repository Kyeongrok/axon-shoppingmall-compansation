package com.axon.order.event;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class OrderCreatedEvent {
    private String orderId;
    private String productId;
    private int quantity;
}
