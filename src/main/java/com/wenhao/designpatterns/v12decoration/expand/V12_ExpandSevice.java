package com.wenhao.designpatterns.v12decoration.expand;

import com.wenhao.designpatterns.v12decoration.V12_CacheService;

/**
 * 扩展功能接口 比如 原来只有一级缓存  现在添加一个 二级缓存 而不改动已有代码
 */
public abstract class V12_ExpandSevice implements V12_CacheService {

    // 传入 原始功能接口
    V12_CacheService v12_cacheService;

    /**
     * 调用新增功能时 同时 传入 原始接口 因为 调用新增功能 时 不得影响 原有功能 的调用
     * @param v12_cacheService 原始接口
     */
    public V12_ExpandSevice(V12_CacheService v12_cacheService) {
        this.v12_cacheService = v12_cacheService;
    }

    /**
     * 父类方法实现
     * @return Object
     */
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
