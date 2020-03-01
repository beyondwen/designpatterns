package com.wenhao.designpatterns.v2.handle.jpa;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 责任链
 */
@Entity
@Data
@Table(name = "gateway_handler")
public class GatewayHandlerEnity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", insertable = false, nullable = false)
    private Integer ID;

    /**
     * handler名称
     */
    @Column(name = "handler_name")
    private String handlerName;

    /**
     * handler主键id
     */
    @Column(name = "handler_id")
    private String handlerId;

    @Column(name = "prev_handler_id")
    private String prevHandlerId;

    /**
     * 下一个handler
     */
    @Column(name = "next_handler_id")
    private String nextHandlerId;

    
}