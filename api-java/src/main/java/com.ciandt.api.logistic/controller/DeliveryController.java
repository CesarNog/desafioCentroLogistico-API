package com.ciandt.api.logistic.controller;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

import com.ciandt.api.logistic.Delivery;
import com.ciandt.api.logistic.DeliveryStep;

@RestController
public class DeliveryController {

    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/delivery")
    public Delivery delivery(@RequestParam("vehicle") String vehicle, @RequestParam("deliveryId") int deliveryId, @RequestParam("packages") String packages) {
        return new Delivery(vehicle, deliveryId, packages);
    }

    @RequestMapping("/delivery/{deliveryId}/step", method = RequestMethod.GET)
    public Delivery deliveryStep(@PathVariable int deliveryId) {
        return new DeliveryStep(counter.incrementAndGet(), deliveryId, packages);
    }
}
