package com.wenhao.designpatterns.v2.chainresponsibility.handler.impl;

import com.wenhao.designpatterns.v2.chainresponsibility.handler.GatewayHandler;

public class BlacklistHandler extends GatewayHandler {

    @Override
    public void service() {
        System.out.println("第二关》》》》》》");
        nextService();
    }

}
