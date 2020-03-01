package com.wenhao.designpatterns.v1strategypatterns.strategy.strategycontainer;

/**
 * 具体支付类的容器
 */
@Deprecated
public enum StrategyContainer {

    ALI_PAY("com.wenhao.designpatterns.v1strategypatterns.strategy.strategy.impl.AliPayStrategy"),
    WECHAT_PAY("com.wenhao.designpatterns.v1strategypatterns.strategy.strategy.impl.WeChatPayStrategy");

    private String className;

    StrategyContainer(String className) {
        this.setClassName(className);
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }


}
