package com.wenhao.designpatterns.v10reviewproxy.staticproxy.extendway.service.impl;

import com.wenhao.designpatterns.v10reviewproxy.staticproxy.extendway.service.OrderService;

public class OrderServiceImpl implements OrderService {
    @Override
    public void add() {
        System.out.println("添加订单");
    }
}
