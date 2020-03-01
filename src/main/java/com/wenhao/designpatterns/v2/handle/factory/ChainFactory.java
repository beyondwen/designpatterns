package com.wenhao.designpatterns.v2.handle.factory;

import com.wenhao.designpatterns.v2.handle.handler.GatewayHandler;
import com.wenhao.designpatterns.v2.handle.handler.impl.BlacklistHandler;
import com.wenhao.designpatterns.v2.handle.handler.impl.ConversationHandler;
import com.wenhao.designpatterns.v2.handle.handler.impl.CurrentLimitHandler;
import org.springframework.stereotype.Component;

/**
 * 通过工厂模式获得具体支付实现类
 */
@Component
public class ChainFactory {
    public GatewayHandler gatewayHandler() {
        GatewayHandler gatewayHandler1 = new CurrentLimitHandler();
        GatewayHandler gatewayHandler2 = new BlacklistHandler();
        GatewayHandler gatewayHandler3 = new ConversationHandler();
        gatewayHandler1.setNextHandler(gatewayHandler2);
        gatewayHandler2.setNextHandler(gatewayHandler3);
        return gatewayHandler1;
    }
}
