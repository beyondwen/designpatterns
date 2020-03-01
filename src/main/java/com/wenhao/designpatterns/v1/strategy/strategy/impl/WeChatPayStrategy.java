package com.wenhao.designpatterns.v1.strategy.strategy.impl;

import com.wenhao.designpatterns.v1.strategy.strategy.PayStrategy;
import org.springframework.stereotype.Component;

@Component
public class WeChatPayStrategy implements PayStrategy {
    @Override
    public String payToHtml() {
        return "调用微信支付。。。";
    }
}
