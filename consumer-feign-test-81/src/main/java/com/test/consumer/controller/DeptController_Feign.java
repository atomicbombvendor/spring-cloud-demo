package com.test.consumer.controller;

import com.test.api.entity.Dept;
import com.test.api.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DeptController_Feign {

    @Autowired
    private DeptClientService deptClientService;

    @RequestMapping(value = "/fconsumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return this.deptClientService.get(id);
    }

    @RequestMapping(value = "/fconsumer/dept/list")
    public List<Dept> list() {
        return this.deptClientService.list();
    }

    @RequestMapping(value = "/fconsumer/dept/add")
    public Object add(Dept dept) {
        return this.deptClientService.add(dept);
    }
}
 
