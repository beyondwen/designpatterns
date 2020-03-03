package com.wenhao.designpatterns.v8.adapter.service;

import com.wenhao.designpatterns.v8.adapter.domain.LogBean;

import java.util.List;

public interface LogWriteFileService {

    void logWriteFile();

    List<LogBean> readLogFile();
}
