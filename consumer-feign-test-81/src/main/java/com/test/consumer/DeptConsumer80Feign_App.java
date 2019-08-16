package com.test.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages= {"com.test"})
@ComponentScan("com.test")
public class DeptConsumer80Feign_App {

    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer80Feign_App.class, args);
    }
}
