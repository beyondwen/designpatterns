package com.wenhao.designpatterns.v5.proxy.advanced.jdk.client;

import com.wenhao.designpatterns.v5.proxy.advanced.jdk.service.OrderService;
import com.wenhao.designpatterns.v5.proxy.advanced.jdk.service.impl.JdkInvocationHandler;
import com.wenhao.designpatterns.v5.proxy.advanced.jdk.service.impl.OrderServiceImpl;


public class Client {

    public static void main(String[] args) {
        OrderService orderService = new JdkInvocationHandler(new OrderServiceImpl()).getProxy();
        System.out.println(orderService);
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        orderService.service();
    }
}
