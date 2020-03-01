package com.wenhao.designpatterns.v3.template.factory;

import com.wenhao.designpatterns.v1.strategy.utils.SpringUtil;
import com.wenhao.designpatterns.v3.template.template.AbstractPayCallbackTemplate;

public class TemplateFactory {

    public static AbstractPayCallbackTemplate getPayCallbackTemplate(String templateId) {
        return (AbstractPayCallbackTemplate) SpringUtil.getBean(templateId);
    }
}
