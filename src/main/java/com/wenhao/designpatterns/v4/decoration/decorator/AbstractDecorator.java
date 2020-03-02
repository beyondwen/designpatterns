package com.wenhao.designpatterns.v4.decoration.decorator;

import com.wenhao.designpatterns.v4.decoration.component.GatewayComponent;

public abstract class AbstractDecorator extends GatewayComponent {
    GatewayComponent gatewayComponent;

    public void service() {
        if (gatewayComponent != null) {
            gatewayComponent.service();
        }
    }

    public void setGatewayComponent(GatewayComponent gatewayComponent) {
        this.gatewayComponent = gatewayComponent;
    }

}
