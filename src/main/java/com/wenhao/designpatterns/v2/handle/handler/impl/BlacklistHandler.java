package com.wenhao.designpatterns.v2.handle.handler.impl;

import com.wenhao.designpatterns.v2.handle.handler.GatewayHandler;
import org.springframework.stereotype.Component;

@Component
public class BlacklistHandler extends GatewayHandler {

    @Override
    public void service() {
        System.out.println("第二关》》》》》》");
        nextService();
    }

}
