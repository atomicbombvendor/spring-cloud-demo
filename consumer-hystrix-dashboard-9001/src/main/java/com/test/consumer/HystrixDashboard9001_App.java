package com.test.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@EnableCircuitBreaker
@EnableHystrixDashboard
public class HystrixDashboard9001_App {

    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboard9001_App.class, args);
    }
}
