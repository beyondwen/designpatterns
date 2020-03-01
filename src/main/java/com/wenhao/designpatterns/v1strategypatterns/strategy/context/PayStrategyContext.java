package com.wenhao.designpatterns.v1strategypatterns.strategy.context;

import com.wenhao.designpatterns.v1strategypatterns.strategy.domain.Strategy;
import com.wenhao.designpatterns.v1strategypatterns.strategy.jpa.StrategyRepository;
import com.wenhao.designpatterns.v1strategypatterns.strategy.strategy.PayStrategy;
import com.wenhao.designpatterns.v1strategypatterns.strategy.utils.SpringUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 支付上下文
 */
@Component
public class PayStrategyContext {

    @Autowired
    StrategyRepository strategyRepository;

    public String toPayHtml(String payCode) {
        if (StringUtils.isEmpty(payCode)) {
            return "payCode 不能为空";
        }
        //此处可以使用 工厂模式 但是只能再学习阶段适用，
        // 线上还是要通过数据库来获取，进行维护
        Strategy strategy = strategyRepository.findByChannelId(payCode);
        if (strategy == null) {
            return "策略为空";
        }
        String strategyBeanId = strategy.getStrategyBeanId();
        if (StringUtils.isEmpty(strategyBeanId)) {
            return "没有找到该支付方式";
        }
        PayStrategy payStrategy = SpringUtil.getBean(strategyBeanId, PayStrategy.class);
        return payStrategy.payToHtml();
    }
}
