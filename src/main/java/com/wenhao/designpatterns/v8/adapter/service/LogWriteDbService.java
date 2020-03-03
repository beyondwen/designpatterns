package com.wenhao.designpatterns.v8.adapter.service;

import com.wenhao.designpatterns.v8.adapter.domain.LogBean;

public interface LogWriteDbService {

    void writeDbFile(LogBean logBean);
}
