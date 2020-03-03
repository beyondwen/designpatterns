package com.wenhao.designpatterns.v7.observer.springobserver.controller;

import com.wenhao.designpatterns.v7.observer.springobserver.observable.OrderCreateEvent;
import lombok.extern.slf4j.Slf4j;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class SobController {

    @Autowired
    private ApplicationContext applicationContext;

    @GetMapping("/order")
    public String addOrder() {
        log.info("创建订单");
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("email", "644064779@qq.com");
        jsonObject.put("phone", "15123456789");
        jsonObject.put("text", "恭喜您以1399.00元购买蚂蚁课堂永久会员.");
        OrderCreateEvent orderCreateEvent = new OrderCreateEvent(this, jsonObject);
        applicationContext.publishEvent(orderCreateEvent);
        return "sucess";
    }
}
