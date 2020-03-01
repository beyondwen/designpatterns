package com.wenhao.designpatterns.v1.strategy.controller;

import com.wenhao.designpatterns.v1.strategy.context.PayStrategyContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/")
@RestController
public class PayController {

    @Autowired
    private PayStrategyContext payStrategyContext;

    @GetMapping("/payToHtml")
    public String payToHtml(String payCode) {
        return payStrategyContext.toPayHtml(payCode);
    }
}
