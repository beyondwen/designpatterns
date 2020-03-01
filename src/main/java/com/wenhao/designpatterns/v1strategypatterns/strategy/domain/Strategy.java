package com.wenhao.designpatterns.v1strategypatterns.strategy.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "strategy")
public class Strategy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", insertable = false, nullable = false)
    private Integer id;

    @Column(name = "channel_name", nullable = false)
    private String channelName;

    @Column(name = "channel_id", nullable = false)
    private String channelId;

    @Column(name = "strategy_bean_id", nullable = false)
    private String strategyBeanId;

    
}