package com.springboot.cloud.auth.authentication.rest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

/**
 * @author zhoutaoo
 * @date 2018/5/26
 */
public class HttpServletRequestAuthWrapper extends HttpServletRequestWrapper {

    private final String url;
    private final String method;

    /**
     * @param url    url
     * @param method method
     */
    public HttpServletRequestAuthWrapper(HttpServletRequest request, String url, String method) {
        super(request);
        this.url = url;
        this.method = method;
    }

    @Override
    public String getMethod() {
        return this.method;
    }

    @Override
    public String getServletPath() {
        return this.url;
    }
}
