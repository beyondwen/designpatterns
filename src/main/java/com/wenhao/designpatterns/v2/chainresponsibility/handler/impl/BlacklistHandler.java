package com.wenhao.designpatterns.v2.chainresponsibility.handler.impl;

import com.wenhao.designpatterns.v2.chainresponsibility.handler.GatewayHandler;

public class BlacklistHandler extends GatewayHandler {

    private ConversationHandler conversationHandler;

    @Override
    public void service() {
        System.out.println("第二关》》》》》》");
        conversationHandler.service();
    }

    public void setNextHandler(ConversationHandler conversationHandler) {
        this.conversationHandler = conversationHandler;
    }
}
