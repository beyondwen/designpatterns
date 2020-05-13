package com.wenhao.designpatterns.v10reviewproxy.staticproxy.implway.proxy;

import com.wenhao.designpatterns.v10reviewproxy.staticproxy.implway.service.OrderService;

public class OrderServiceProxy implements OrderService {

    private OrderService orderService;

    public OrderServiceProxy(OrderService orderService) {
        this.orderService = orderService;
    }

    @Override
    public void add() {
        System.out.println("方法之前执行");
        orderService.add();
        System.out.println("方法之后执行");
    }
}
