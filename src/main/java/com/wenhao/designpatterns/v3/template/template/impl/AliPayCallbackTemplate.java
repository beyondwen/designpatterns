package com.wenhao.designpatterns.v3.template.template.impl;

import com.wenhao.designpatterns.v3.template.template.AbstractPayCallbackTemplate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@Component
public class AliPayCallbackTemplate extends AbstractPayCallbackTemplate {
    @Override
    protected String asyncService(Map<String, String> verifySignature) {
        log.info(">>>>>第三步 解析支付宝据报文.....verifySignature:{}", verifySignature);
        String payMentStatus = verifySignature.get("aliPayMentStatus");
        if ("1".equals(payMentStatus)) {
            String aliPayOrderNumber = verifySignature.get("aliPayOrderNumber");
            log.info(">>>>orderNumber:{},已经支付成功 修改订单状态为已经支付...", aliPayOrderNumber);
        }
        return resultSuccess();
    }

    @Override
    protected Map<String, String> verifySignature() {
        log.info(">>>>>第一步 解析支付宝据报文.....verifySignature()");
        Map<String, String> verifySignature = new HashMap<>();
        verifySignature.put("price", "1399");
        verifySignature.put("desc", "会员充值");
        //支付状态为1 表示支付成功
        verifySignature.put("aliPayMentStatus", "1");
        verifySignature.put("aliPayOrderNumber", "201910101011");
        //解析报文 200为成功
        verifySignature.put("analysisCode", "200");
        return verifySignature;
    }

    @Override
    protected String resultSuccess() {
        return "success";
    }

    @Override
    protected String resultFail() {
        return "fail";
    }
}
