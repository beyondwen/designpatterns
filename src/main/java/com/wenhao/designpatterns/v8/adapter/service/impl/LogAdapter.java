package com.wenhao.designpatterns.v8.adapter.service.impl;

import com.wenhao.designpatterns.v8.adapter.domain.LogBean;
import com.wenhao.designpatterns.v8.adapter.service.LogWriteDbService;
import com.wenhao.designpatterns.v8.adapter.service.LogWriteFileService;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class LogAdapter implements LogWriteDbService {

    private LogWriteFileService logWriteFileService;

    public LogAdapter(LogWriteFileService logWriteFileService) {
        this.logWriteFileService = logWriteFileService;
    }

    @Override
    public void writeDbFile(LogBean logBean) {
        //1从文件中读取日志
        List<LogBean> logBeans = logWriteFileService.readLogFile();
        //2写入数据库
        logBeans.add(logBean);
        log.info("将数据写入到数据库中。。。");
        logWriteFileService.logWriteFile();
    }
}
