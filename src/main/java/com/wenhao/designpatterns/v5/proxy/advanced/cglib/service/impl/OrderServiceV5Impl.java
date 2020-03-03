package com.wenhao.designpatterns.v5.proxy.advanced.cglib.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class OrderServiceV5Impl {

    public void service() {
        log.info("业务处理中。。。。。");
    }
}
