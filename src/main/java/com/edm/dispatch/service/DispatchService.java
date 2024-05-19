package com.edm.dispatch.service;

import com.edm.dispatch.model.OrderCreated;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DispatchService {
    public void process(OrderCreated payload) {
        log.info("Payload processed: {}", payload);
    }
}
