package com.wenhao.designpatterns.v4.decoration.decorator.impl;

import com.wenhao.designpatterns.v4.decoration.component.GatewayComponent;
import com.wenhao.designpatterns.v4.decoration.decorator.AbstractDecorator;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LimitDecorator extends AbstractDecorator {
    public LimitDecorator(GatewayComponent gatewayComponent) {
        super(gatewayComponent);
    }

    //GatewayComponent gatewayComponent;

    @Override
    public void service() {
        /*if (gatewayComponent != null) {
            gatewayComponent.service();
        }*/
        super.service();
        log.info("第三步》》》》 网关限流");
    }

    /*public void setGatewayComponent(GatewayComponent gatewayComponent) {
        this.gatewayComponent = gatewayComponent;
    }*/
}
