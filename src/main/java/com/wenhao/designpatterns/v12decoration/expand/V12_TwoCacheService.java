package com.wenhao.designpatterns.v12decoration.expand;

import com.wenhao.designpatterns.v12decoration.V12_CacheService;

public class V12_TwoCacheService extends V12_ExpandSevice {

    public V12_TwoCacheService(V12_CacheService v12_cacheService) {
        super(v12_cacheService);
    }

    @Override
    public Object get() {
        System.out.println("二级缓存");
        return super.get();
    }
}
