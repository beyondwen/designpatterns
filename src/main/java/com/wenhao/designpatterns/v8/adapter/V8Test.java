package com.wenhao.designpatterns.v8.adapter;

import com.wenhao.designpatterns.v8.adapter.domain.LogBean;
import com.wenhao.designpatterns.v8.adapter.service.LogWriteFileService;
import com.wenhao.designpatterns.v8.adapter.service.impl.ClassAdapter;

public class V8Test {

    public static void main(String[] args) {
        //LogWriteFileService logWriteFileService = new LogWriteFileServiceImpl();
        //logWriteFileService.logWriteFile();
        /*LogWriteDbService logWriteDbService = new ClassAdapter();
        LogBean logBean = new LogBean();
        logBean.setLogId("111");
        logBean.setLogText("22222");
        logWriteDbService.writeDbFile(logBean);*/
        LogWriteFileService logWriteDbService = new ClassAdapter();
        LogBean logBean = new LogBean();
        logBean.setLogId("111");
        logBean.setLogText("22222");
        logWriteDbService.logWriteFile();
    }
}
