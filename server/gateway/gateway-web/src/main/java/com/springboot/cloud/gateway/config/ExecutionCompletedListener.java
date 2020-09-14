package com.springboot.cloud.gateway.config;

import com.springboot.cloud.gateway.service.impl.RouteServiceImpl;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author Jump
 * @date 2020/9/14 17:21
 */
@Component
@Order(value = 3)
public class ExecutionCompletedListener implements ApplicationRunner {

    @Resource
    private RouteServiceImpl routeService;

    @Override
    public void run(ApplicationArguments args) {
        routeService.loadRouteDefinition();
    }
}
