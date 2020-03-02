package com.wenhao.designpatterns.v5.proxy.advanced.cglib.client;

import com.wenhao.designpatterns.v5.proxy.advanced.cglib.service.CglibProxy;
import com.wenhao.designpatterns.v5.proxy.advanced.jdk.service.impl.OrderServiceImpl;
import net.sf.cglib.proxy.Enhancer;


public class Client {

    public static void main(String[] args) {
        CglibProxy cglibProxy = new CglibProxy();
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(OrderServiceImpl.class);
        enhancer.setCallback(cglibProxy);
        OrderServiceImpl orderService = (OrderServiceImpl) enhancer.create();
        orderService.service();
    }
}
