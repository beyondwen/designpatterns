package com.wenhao.designpatterns.v2.handle.controller;

import com.wenhao.designpatterns.v2.handle.handler.GatewayHandler;
import com.wenhao.designpatterns.v2.handle.service.HandlerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HandlerController {

    /*@Autowired
    private ChainFactory chainFactory;*/

    @Autowired
    private HandlerService handlerService;

    @GetMapping("/handler")
    public void handler() {
        /*GatewayHandler gatewayHandler = chainFactory.gatewayHandler();
        gatewayHandler.service();*/
        GatewayHandler handler = handlerService.getHandleeByDB();
        handler.service();
    }
}
