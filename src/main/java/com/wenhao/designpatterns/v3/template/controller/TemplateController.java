package com.wenhao.designpatterns.v3.template.controller;

import com.wenhao.designpatterns.v3.template.factory.TemplateFactory;
import com.wenhao.designpatterns.v3.template.template.AbstractPayCallbackTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TemplateController {

    @GetMapping("/template")
    public String asyncService(String templateId) {
        AbstractPayCallbackTemplate payCallbackTemplate = TemplateFactory.getPayCallbackTemplate(templateId);
        return payCallbackTemplate.asyncCallBack();
    }
}
