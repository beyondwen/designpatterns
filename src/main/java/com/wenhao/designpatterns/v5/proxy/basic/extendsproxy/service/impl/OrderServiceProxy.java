package com.wenhao.designpatterns.v5.proxy.basic.extendsproxy.service.impl;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class OrderServiceProxy extends OrderServiceImpl {

    @Override
    public void service() {
        log.info("日志记录开始");
        super.service();
        log.info("日志记录结束");
    }
}
