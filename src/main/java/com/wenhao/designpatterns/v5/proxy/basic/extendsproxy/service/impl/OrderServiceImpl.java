package com.wenhao.designpatterns.v5.proxy.basic.extendsproxy.service.impl;

import com.wenhao.designpatterns.v5.proxy.basic.extendsproxy.service.OrderService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class OrderServiceImpl implements OrderService {

    @Override
    public void service() {
        log.info("业务处理中。。。。。");
    }
}
