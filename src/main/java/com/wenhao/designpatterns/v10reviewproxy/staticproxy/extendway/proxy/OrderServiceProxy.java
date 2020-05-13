package com.wenhao.designpatterns.v10reviewproxy.staticproxy.extendway.proxy;


import com.wenhao.designpatterns.v10reviewproxy.staticproxy.extendway.service.impl.OrderServiceImpl;

public class OrderServiceProxy extends OrderServiceImpl {


    @Override
    public void add() {
        System.out.println("方法前置执行");
        super.add();
        System.out.println("方法后置执行");
    }
}
