package com.springboot.cloud.gateway.service.impl;

import com.alicp.jetcache.anno.CacheType;
import com.alicp.jetcache.anno.Cached;
import com.springboot.cloud.auth.client.service.IAuthService;
import com.springboot.cloud.gateway.service.IPermissionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Jump
 */
@Service
public class PermissionServiceImpl implements IPermissionService {

    /**
     * 由authentication-client模块提供签权的feign客户端
     */
    @Resource
    private IAuthService authService;

    @Override
    @Cached(name = "gateway_auth::", key = "#authentication+#method+#url", cacheType = CacheType.LOCAL, expire = 10, localLimit = 10000)
    public boolean permission(String authentication, String url, String method) {
        return authService.hasPermission(authentication, url, method);
    }
}
