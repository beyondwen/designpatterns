package com.wenhao.designpatterns.v1.strategy.factory;

import com.wenhao.designpatterns.v1.strategy.strategy.PayStrategy;
import com.wenhao.designpatterns.v1.strategy.strategycontainer.StrategyContainer;

/**
 * 通过工厂模式获得具体支付实现类
 *
 */
@Deprecated
public class PayStrategyFactory {
    public static PayStrategy payStrategy(String strategyType) {
        String className = StrategyContainer.valueOf(strategyType).getClassName();
        try {
            return (PayStrategy) Class.forName(className).newInstance();
        } catch (Exception e) {
            return null;
        }
    }
}
