package com.ciandt.api.logistic.controller;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ciandt.api.logistic.Delivery;

@RestController
public class DeliveryController {

    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/delivery")
    public Delivery delivery() {
        return new Delivery(counter.incrementAndGet(),
                            String.format(template));
    }

    @RequestMapping("/delivery/{deliveryId}/step")
    public Delivery deliveryStep(@RequestParam(value="deliveryId") long deliveryId) {
        return new Delivery(counter.incrementAndGet(), deliveryId);
    }
}