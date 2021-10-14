package com.dave.microservices.limitsservice.configuration;

import org.springframework.beans.factory.annotation.Value;

@org.springframework.context.annotation.Configuration
public class Configuration {

    @Value("${limits-service.minimum}")
    private int minimum;

    @Value("${limits-service.maximum}")
    private int maximum;

    public int getMinimum() {
        return minimum;
    }

    public int getMaximum() {
        return maximum;
    }
}
