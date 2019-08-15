package com.test.provider.controller;

import com.alibaba.fastjson.JSON;
import com.test.api.entity.Dept;
import com.test.provider.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeptController {

    @Autowired
    private DeptService service;

    @Autowired
    private DiscoveryClient discoveryClient;

    @PostMapping(value = "/dept/add")
    public boolean add(@RequestBody Dept dept) {
        return service.add(dept);
    }

    @GetMapping(value = "/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return service.get(id);
    }

    @GetMapping(value = "/dept/list")
    public List<Dept> list() {
        return service.list();
    }

    @GetMapping(value = "/dept/discovery")
    public Object discovery(){
        List<String> list = discoveryClient.getServices();
        System.out.println(list);
        List<ServiceInstance> instances = discoveryClient.getInstances("provider-dept");
        for (ServiceInstance element : instances){
            System.out.println(JSON.toJSONString(element));
        }

        return this.discoveryClient;
    }
}
