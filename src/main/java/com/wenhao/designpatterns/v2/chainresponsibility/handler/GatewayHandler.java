package com.wenhao.designpatterns.v2.chainresponsibility.handler;

public abstract class GatewayHandler {

    protected GatewayHandler nextGatewayHandler;

    public abstract void service();

    public void setNextHandler(GatewayHandler nextGatewayHandler) {
        this.nextGatewayHandler = nextGatewayHandler;
    }

    protected void nextService() {
        if (nextGatewayHandler != null) {
            nextGatewayHandler.service();
        }
    }
}
