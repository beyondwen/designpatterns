package com.wenhao.designpatterns.v4.decoration.adornee;

import com.wenhao.designpatterns.v4.decoration.component.GatewayComponent;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BasicComponentGateway extends GatewayComponent {

    public void service() {
        log.info("第一步》》》参数信息");
    }

}