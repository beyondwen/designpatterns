package com.wenhao.designpatterns.v2.chainresponsibility.handler.impl;

import com.wenhao.designpatterns.v2.chainresponsibility.handler.GatewayHandler;

public class ConversationHandler extends GatewayHandler {
    @Override
    public void service() {
        System.out.println("第三关》》》》》》");
    }
}
