package com.wenhao.designpatterns.v6.manualproxy.jdk.service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class OrderServiceImpl implements OrderService {
    @Override
    public void order() throws Throwable {
        log.info("业务执行中");
    }
}
