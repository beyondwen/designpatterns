package com.wenhao.designpatterns.v2.handle.service;

import com.wenhao.designpatterns.v1.strategy.utils.SpringUtil;
import com.wenhao.designpatterns.v2.handle.handler.GatewayHandler;
import com.wenhao.designpatterns.v2.handle.jpa.GatewayHandlerEnity;
import com.wenhao.designpatterns.v2.handle.jpa.GatewayHandlerRepository;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HandlerService {

    @Autowired
    GatewayHandlerRepository gatewayHandlerRepository;

    /**
     * 通过查询数据库获取handler
     * @return GatewayHandler
     */
    public GatewayHandler getHandleeByDB() {
        //第一步获取第一个handler对应的实体
        GatewayHandlerEnity firstGatewayHandlerEnity = gatewayHandlerRepository.findByPrevHandlerIdIsNull();
        if (firstGatewayHandlerEnity == null) {
            return null;
        }
        //第二步找到第一个handler的id
        String firstHandlerId = firstGatewayHandlerEnity.getHandlerId();
        if (StringUtils.isEmpty(firstHandlerId)) {
            return null;
        }
        //第三步获取到第一个handler
        GatewayHandler firstGatewayHandler = SpringUtil.getBean(firstHandlerId, GatewayHandler.class);
        if (firstGatewayHandler == null) {
            return null;
        }
        //获取到下一个handlerId
        String nextHandlerId = firstGatewayHandlerEnity.getNextHandlerId();
        //设置临时缓存
        GatewayHandler temp = firstGatewayHandler;
        //判断下一个handlerid是否为空
        while (StringUtils.isNotEmpty(nextHandlerId)) {
            //获取下一个handler
            GatewayHandler nextGatewayHandler = SpringUtil.getBean(nextHandlerId, GatewayHandler.class);
            if (nextGatewayHandler == null) {
                break;
            }
            //获取到下一个handler的实体类
            GatewayHandlerEnity nextHandlerEnity = gatewayHandlerRepository.findByHandlerId(nextHandlerId);
            if (nextHandlerEnity == null) {
                break;
            }
            //获取到下一个handler的下一个handler的id
            nextHandlerId = nextHandlerEnity.getNextHandlerId();
            //进行传递
            temp.setNextHandler(nextGatewayHandler);
            //设置到临时缓存中
            temp = nextGatewayHandler;
        }
        return firstGatewayHandler;
    }

}
