package com.springboot.cloud.auth.authentication.config;

import com.springboot.cloud.auth.authentication.service.IResourceService;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

/**
 * @author Jump
 */
@Component
class LoadResourceDefine {

    @Resource
    private IResourceService resourceService;

    /**
     * 取消返回的bean防止外部出现线程安全问题
     * 2020/5/15
     */
    @PostConstruct
    public void resourceConfigAttributes() {
        resourceService.loadResource();
    }
}
