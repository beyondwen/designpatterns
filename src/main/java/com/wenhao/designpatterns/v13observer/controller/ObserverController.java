package com.wenhao.designpatterns.v13observer.controller;


import com.wenhao.designpatterns.v13observer.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ObserverController {

    @Autowired
    private Subject subject;

    @GetMapping("/v13_observer")
    public void index() {
        subject.notifyMsg();
    }
}
