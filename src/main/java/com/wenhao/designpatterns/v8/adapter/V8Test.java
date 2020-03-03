package com.wenhao.designpatterns.v8.adapter;

import com.wenhao.designpatterns.v8.adapter.domain.LogBean;
import com.wenhao.designpatterns.v8.adapter.service.LogWriteDbService;
import com.wenhao.designpatterns.v8.adapter.service.impl.LogAdapter;
import com.wenhao.designpatterns.v8.adapter.service.impl.LogWriteFileServiceImpl;

public class V8Test {

    public static void main(String[] args) {
        //LogWriteFileService logWriteFileService = new LogWriteFileServiceImpl();
        //logWriteFileService.logWriteFile();
        /*LogWriteDbService logWriteDbService = new ClassAdapter();
        LogBean logBean = new LogBean();
        logBean.setLogId("111");
        logBean.setLogText("22222");
        logWriteDbService.writeDbFile(logBean);*/
        /*LogWriteFileService logWriteDbService = new ClassAdapter();
        LogBean logBean = new LogBean();
        logBean.setLogId("111");
        logBean.setLogText("22222");
        logWriteDbService.logWriteFile();*/
        LogWriteDbService logWriteDbService = new LogAdapter(new LogWriteFileServiceImpl());
        LogBean logBean = new LogBean();
        logBean.setLogId("111");
        logBean.setLogText("22222");
        logWriteDbService.writeDbFile(logBean);
    }
}
