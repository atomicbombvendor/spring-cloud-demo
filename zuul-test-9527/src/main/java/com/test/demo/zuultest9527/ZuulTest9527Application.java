package com.test.demo.zuultest9527;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
@EnableDiscoveryClient
public class ZuulTest9527Application {

    public static void main(String[] args) {
        SpringApplication.run(ZuulTest9527Application.class, args);
    }

}
