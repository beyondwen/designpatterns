package com.wenhao.designpatterns.v2.chainresponsibility.controller;

import com.wenhao.designpatterns.v2.chainresponsibility.factory.ChainFactory;
import com.wenhao.designpatterns.v2.chainresponsibility.handler.GatewayHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HandlerController {

    @Autowired
    private ChainFactory chainFactory;

    @GetMapping("/handler")
    public void handler() {
        GatewayHandler gatewayHandler = chainFactory.gatewayHandler();
        gatewayHandler.service();
    }
}
