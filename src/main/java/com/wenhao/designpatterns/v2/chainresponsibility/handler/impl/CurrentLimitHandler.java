package com.wenhao.designpatterns.v2.chainresponsibility.handler.impl;

import com.wenhao.designpatterns.v2.chainresponsibility.handler.GatewayHandler;

public class CurrentLimitHandler extends GatewayHandler {

    @Override
    public void service() {
        System.out.println("第一关》》》》》》");
        nextService();
    }

}
