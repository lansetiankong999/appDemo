package com.springboot.cloud.gateway.service;

/**
 * @author Jump
 */
public interface IPermissionService {
    /**
     * 是否有权限
     *
     * @param authentication authentication
     * @param method         method
     * @param url            url
     * @return boolean
     */
    boolean permission(String authentication, String url, String method);
}
