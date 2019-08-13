package com.test.provider.service.impl;

import com.test.api.entity.Dept;
import com.test.provider.dao.DeptDao;
import com.test.provider.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptDao dao;

    /**
     * 符合Controller层的接口方法
     * @param dept
     * @return
     */
    @Override
    public boolean add(Dept dept) {
        return dao.addDept(dept);
    }

    @Override
    public Dept get(Long id) {
        return dao.findById(id);
    }

    @Override
    public List<Dept> list() {
        return dao.findAll();
    }

}

