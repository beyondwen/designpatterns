package com.wenhao.designpatterns.v2.handle.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

public interface GatewayHandlerRepository extends JpaRepository<GatewayHandlerEnity, String> {

    GatewayHandlerEnity findByPrevHandlerIdIsNull();

    GatewayHandlerEnity findByHandlerId(String id);
}