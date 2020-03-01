package com.wenhao.designpatterns.v2.chainresponsibility.handler.impl;

import com.wenhao.designpatterns.v2.chainresponsibility.handler.GatewayHandler;

public class CurrentLimitHandler extends GatewayHandler {

    private BlacklistHandler blacklistHandler;

    @Override
    public void service() {
        System.out.println("第一关》》》》》》");
        blacklistHandler.service();
    }

    public void setNextHandler(BlacklistHandler blacklistHandler) {
        this.blacklistHandler = blacklistHandler;
    }
}
