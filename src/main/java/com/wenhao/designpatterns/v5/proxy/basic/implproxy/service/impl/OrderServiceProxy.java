package com.wenhao.designpatterns.v5.proxy.basic.implproxy.service.impl;

import com.wenhao.designpatterns.v5.proxy.basic.implproxy.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

@Slf4j
public class OrderServiceProxy implements OrderService {

    @Autowired
    OrderService orderService;

    public OrderServiceProxy(OrderService orderService) {
        this.orderService = orderService;
    }

    @Override
    public void service() {
        log.info("日志记录开始");
        orderService.service();
        log.info("日志记录结束");
    }
}
