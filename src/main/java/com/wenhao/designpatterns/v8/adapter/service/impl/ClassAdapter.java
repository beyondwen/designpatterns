package com.wenhao.designpatterns.v8.adapter.service.impl;

import com.wenhao.designpatterns.v8.adapter.domain.LogBean;
import com.wenhao.designpatterns.v8.adapter.service.LogWriteDbService;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class ClassAdapter extends LogWriteFileServiceImpl implements LogWriteDbService {
    @Override
    public void writeDbFile(LogBean logBean) {
        // 1.从文件中读取日志文件
        List<LogBean> logBeans = readLogFile();
        // 2.写入到数据库中
        logBeans.add(logBean);
        log.info(">>>将数据写入到数据库中..");
        // 3.写入到本地文件中
        logWriteFile();
    }
}
