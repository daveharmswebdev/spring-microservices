package com.dave.microservices.limitsservice.controllers;

import com.dave.microservices.limitsservice.bean.Limits;
import com.dave.microservices.limitsservice.configuration.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

    private final Configuration configuration;

    public LimitsController(Configuration configuration) {
        this.configuration = configuration;
    }

    @GetMapping("/limits")
    public Limits retrieveLimits() {

        return new Limits(configuration.getMinimum(), configuration.getMaximum());

//        return new Limits(1, 1000);
    }
}
