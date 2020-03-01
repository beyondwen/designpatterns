package com.wenhao.designpatterns.v1.strategy.jpa;

import com.wenhao.designpatterns.v1.strategy.domain.Strategy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface StrategyRepository extends JpaRepository<Strategy, String> {

    Strategy findByChannelId(String payId);
}