package com.springboot.cloud.auth.authentication.service;

import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Jump
 */
@Service
public interface IAuthenticationService {
    /**
     * 校验权限
     *
     * @param authRequest req
     * @return 是否有权限
     */
    boolean decide(HttpServletRequest authRequest);

}
