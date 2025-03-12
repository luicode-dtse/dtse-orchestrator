package com.luicode.dtse.events;

import java.io.Serializable;

public class OrderFailedEvent implements Serializable {
    private Long orderId;

    public OrderFailedEvent() {
    }

    public OrderFailedEvent(Long orderId) {
        this.orderId = orderId;
    }

    public Long getOrderId() {
        return orderId;
    }
}

