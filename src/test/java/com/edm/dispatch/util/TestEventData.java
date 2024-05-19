package com.edm.dispatch.util;

import com.edm.dispatch.model.OrderCreated;

import java.util.List;
import java.util.UUID;

public class TestEventData {

    public static OrderCreated buildOrderCreatedEventData(UUID uuid, String item) {
        return OrderCreated.builder()
                .id(uuid)
                .item(item)
                .build();
    }
}
