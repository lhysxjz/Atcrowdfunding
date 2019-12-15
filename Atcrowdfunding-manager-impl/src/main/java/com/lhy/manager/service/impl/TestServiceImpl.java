package com.lhy.manager.service.impl;

import com.lhy.manager.dao.TestDao;
import com.lhy.manager.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private TestDao testDao;

    @Override
    public void insert() {
        Map map = new HashMap();
        map.put("name", "张三");
//        testDao.insert(map);
        System.out.println("test");
    }
}
