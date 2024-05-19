package com.edm.dispatch.service;

import com.edm.dispatch.model.OrderCreated;
import com.edm.dispatch.util.TestEventData;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.UUID.randomUUID;
import static org.junit.jupiter.api.Assertions.*;

class DispatchServiceTest {

    private DispatchService dispatchService;

    @BeforeEach
    void setUp() {
        dispatchService = new DispatchService();
    }

    @Test
    void process() {
        OrderCreated payload = TestEventData.buildOrderCreatedEventData(randomUUID(), randomUUID().toString());
        dispatchService.process(payload);
    }
}