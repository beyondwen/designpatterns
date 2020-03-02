package com.wenhao.designpatterns.v4.decoration.factory;

import com.wenhao.designpatterns.v4.decoration.adornee.BasicComponentGateway;
import com.wenhao.designpatterns.v4.decoration.component.GatewayComponent;
import com.wenhao.designpatterns.v4.decoration.decorator.impl.LimitDecorator;
import com.wenhao.designpatterns.v4.decoration.decorator.impl.LogDecorator;

public class DecoraFactory {

    public static GatewayComponent gatewayComponent() {
        LogDecorator logDecorator = new LogDecorator();
        LimitDecorator limitDecorator = new LimitDecorator();
        BasicComponentGateway basicComponentGateway = new BasicComponentGateway();
        limitDecorator.setGatewayComponent(logDecorator);
        logDecorator.setGatewayComponent(basicComponentGateway);
        return limitDecorator;
    }

    public static void main(String[] args) {
        GatewayComponent gatewayComponent = DecoraFactory.gatewayComponent();
        gatewayComponent.service();
    }
}
