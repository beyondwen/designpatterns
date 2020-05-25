package com.wenhao.designpatterns.v13observer;

import com.wenhao.designpatterns.v13observer.impl.QQObserver;
import com.wenhao.designpatterns.v13observer.impl.WeChatObserver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class StartService implements ApplicationRunner {

    @Autowired
    private Subject subject;
    @Autowired
    private QQObserver qqObserver;
    @Autowired
    private WeChatObserver weChatObserver;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        subject.addObserver(qqObserver);
        subject.addObserver(weChatObserver);
    }
}
