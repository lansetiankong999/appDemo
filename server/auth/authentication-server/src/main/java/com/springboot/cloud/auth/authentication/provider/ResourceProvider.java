package com.springboot.cloud.auth.authentication.provider;

import com.springboot.cloud.sysadmin.organization.entity.po.Resource;
import com.springboot.cloud.common.core.entity.vo.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Set;

/**
 * @author Jump
 */
@FeignClient(name = "organization", fallback = ResourceProviderFallback.class)
public interface ResourceProvider {

    /**
     * 获取所有资源
     *
     * @return Set<Resource>
     */
    @GetMapping(value = "/resource/all")
    Result<Set<Resource>> resources();

    /**
     * 获取该用户所有资源
     *
     * @param username username
     * @return Set<Resource>
     */
    @GetMapping(value = "/resource/user/{username}")
    Result<Set<Resource>> resources(@PathVariable("username") String username);
}
