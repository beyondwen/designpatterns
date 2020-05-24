package com.wenhao.designpatterns.v12decoration.expand;

import com.wenhao.designpatterns.v12decoration.V12_CacheService;

/**
 * 扩展功能接口 比如 原来只有一级缓存  现在添加一个 二级缓存 而不改动已有代码
 */
public abstract class V12_ExpandSevice implements V12_CacheService {

    V12_CacheService v12_cacheService;

    public V12_ExpandSevice(V12_CacheService v12_cacheService) {
        this.v12_cacheService = v12_cacheService;
    }

    public Object get() {
        if (v12_cacheService != null) {
            return v12_cacheService.get();
        }
        return null;
    }

    public void setV12_cacheService(V12_CacheService v12_cacheService) {
        this.v12_cacheService = v12_cacheService;
    }
}
