package com.wenhao.designpatterns.v3.factory.template;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;

import java.util.Map;

@Slf4j
public abstract class AbstractPayCallbackTemplate {

    public String asyncCallBack() {
        //1验证签名 每种支付里面的签名都不一样，所以需要子类来实现
        Map<String, String> verifySignature = verifySignature();
        //2写入日志 写入日志的行为都相同，父类实现
        payLog(verifySignature);
        //3修改订单状态，并返回结果 子类实现
        return asyncService(verifySignature);
    }

    protected abstract String asyncService(Map<String, String> verifySignature);


    @Async
    public void payLog(Map<String, String> verifySignature) {
        log.info("写入数据库中...verifySignature:{}", verifySignature);
    }

    protected abstract Map<String, String> verifySignature();
}
