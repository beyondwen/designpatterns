package com.wenhao.designpatterns.v1strategypatterns.strategy.strategy.impl;

import com.wenhao.designpatterns.v1strategypatterns.strategy.strategy.PayStrategy;
import org.springframework.stereotype.Component;

@Component
public class AliPayStrategy implements PayStrategy {
    @Override
    public String payToHtml() {
        return "调用阿里支付。。。";
    }
}
