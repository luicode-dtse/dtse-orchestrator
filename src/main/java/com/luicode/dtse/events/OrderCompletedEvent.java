package com.luicode.dtse.events;

import java.io.Serializable;

public class OrderCompletedEvent implements Serializable {
    private Long orderId;

    public OrderCompletedEvent() {
    }

    public OrderCompletedEvent(Long orderId) {
        this.orderId = orderId;
    }

    public Long getOrderId() {
        return orderId;
    }
}

