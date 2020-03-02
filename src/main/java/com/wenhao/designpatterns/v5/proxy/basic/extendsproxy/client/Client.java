package com.wenhao.designpatterns.v5.proxy.basic.extendsproxy.client;

import com.wenhao.designpatterns.v5.proxy.basic.extendsproxy.service.OrderService;
import com.wenhao.designpatterns.v5.proxy.basic.extendsproxy.service.impl.OrderServiceProxy;

public class Client {

    public static void main(String[] args) {
        OrderService orderService = new OrderServiceProxy();
        orderService.service();
    }
}
