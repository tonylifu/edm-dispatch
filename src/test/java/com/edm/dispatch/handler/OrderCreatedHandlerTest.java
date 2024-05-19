package com.edm.dispatch.handler;

import com.edm.dispatch.model.OrderCreated;
import com.edm.dispatch.service.DispatchService;
import com.edm.dispatch.util.TestEventData;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.UUID;

import static java.util.UUID.randomUUID;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class OrderCreatedHandlerTest {
    private OrderCreatedHandler handler;
    private DispatchService dispatchServiceMock;

    @BeforeEach
    void setUp() {
        dispatchServiceMock = mock(DispatchService.class);
        handler = new OrderCreatedHandler(dispatchServiceMock);
    }

    @Test
    void listen() {
        OrderCreated payload = TestEventData.buildOrderCreatedEventData(randomUUID(), randomUUID().toString());
        handler.listen(payload);
        verify(dispatchServiceMock, times(1)).process(payload);
    }
}