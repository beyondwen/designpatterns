package com.wenhao.designpatterns.v5.proxy.advanced.jdk.service.impl;

import com.wenhao.designpatterns.v5.proxy.advanced.jdk.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class OrderServiceImpl implements OrderService {

    @Override
    public void service() {
        log.info("业务处理中。。。。。");
    }
}
