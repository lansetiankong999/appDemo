package com.springboot.cloud.demos.feign.service;

import com.springboot.cloud.common.core.entity.vo.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * @author Jump
 */
@FeignClient(name = "producer", fallback = ClassServiceFallbackImpl.class)
public interface ClassService {

    /**
     * Result
     *
     * @param name name
     * @return Result
     */
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    Result users(@RequestParam("name") String name);

    /**
     * Result
     *
     * @param map map
     * @return Result
     */
    @RequestMapping(value = "/hello/", method = RequestMethod.POST)
    Result users(@RequestBody Map map);
}
