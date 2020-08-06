package com.springboot.cloud.demos.ribbon.service;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.springboot.cloud.common.core.entity.vo.Result;
import com.springboot.cloud.common.core.exception.SystemErrorType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @author Jump
 */
@Service
public class ClassService {

    @Resource
    RestTemplate restTemplate;

    @SentinelResource(fallback = "usersFallback")
    public Result users(String name) {
        return restTemplate.getForEntity("http://producer/product/?name={1}", Result.class, name).getBody();
    }

    @SentinelResource(fallback = "usersFallback")
    public Result users(Map map) {
        return restTemplate.postForEntity("http://producer/product/", map, Result.class).getBody();
    }

    public Result usersFallback(String name) {
        return Result.fail(SystemErrorType.SYSTEM_BUSY);
    }

    public Result usersFallback(Map map) {
        return Result.fail(SystemErrorType.SYSTEM_BUSY);
    }
}
