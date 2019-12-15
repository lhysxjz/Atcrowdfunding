package com.lhy.manager.controller;

import com.lhy.manager.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

public class TestController {
    /**
     * 首先根据byType进行查找一个，直接注入，如果查找到多个类
     * 根据名称查找，去过再没有，根据@Qualier进行注入，将其中一个进行注入
     * 如果在没有就会报错
     *
     * 方便替换
     *
     * aop原理是动态代理
     * 如果实现实现类的注入 则必须采用cglib动态代理
     * 如果有接口，采用JDK动态代理（基于接口 InvocationHandler），如果没有接口采用cglib动态代理（基于集成，代理类Proxy是目标类的子类），扫描注入事务时，必须扫描impl实现类
     */
    @Autowired
    private TestService testService;
    @RequestMapping("/test")
    public String test(){
       testService.insert();
        return "success";
    }
}
