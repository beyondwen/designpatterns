package com.wenhao.designpatterns.v2.chainresponsibility.factory;

import com.wenhao.designpatterns.v2.chainresponsibility.handler.GatewayHandler;
import com.wenhao.designpatterns.v2.chainresponsibility.handler.impl.BlacklistHandler;
import com.wenhao.designpatterns.v2.chainresponsibility.handler.impl.ConversationHandler;
import com.wenhao.designpatterns.v2.chainresponsibility.handler.impl.CurrentLimitHandler;
import org.springframework.stereotype.Component;

/**
 * 通过工厂模式获得具体支付实现类
 */
@Component
public class ChainFactory {
    public GatewayHandler gatewayHandler() {
        CurrentLimitHandler currentLimitHandler = new CurrentLimitHandler();
        BlacklistHandler blacklistHandler = new BlacklistHandler();
        ConversationHandler conversationHandler = new ConversationHandler();
        currentLimitHandler.setNextHandler(blacklistHandler);
        blacklistHandler.setNextHandler(conversationHandler);
        return currentLimitHandler;
    }
}
