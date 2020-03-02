package com.wenhao.designpatterns.v4.decoration.decorator.impl;

import com.wenhao.designpatterns.v4.decoration.decorator.AbstractDecorator;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LogDecorator extends AbstractDecorator {

    //GatewayComponent gatewayComponent;

    @Override
    public void service() {
        /*if (gatewayComponent != null) {
            gatewayComponent.service();
        }*/
        super.service();
        log.info("第二步》》》》 日志打印");
    }

    /*public void setGatewayComponent(GatewayComponent gatewayComponent) {
        this.gatewayComponent = gatewayComponent;
    }*/
}
