package com.wenhao.designpatterns.v4.decoration.decorator;

import com.wenhao.designpatterns.v4.decoration.component.GatewayComponent;

public abstract class AbstractDecorator extends GatewayComponent {

    public abstract void service();
}
