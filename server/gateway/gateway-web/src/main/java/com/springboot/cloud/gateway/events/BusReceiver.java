package com.springboot.cloud.gateway.events;

import com.springboot.cloud.gateway.service.IRouteService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.route.RouteDefinition;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author Jump
 */
@Component
@Slf4j
public class BusReceiver {

    @Resource
    private IRouteService routeService;

    public void handleMessage(RouteDefinition routeDefinition) {
        log.info("Received Message:<{}>", routeDefinition);
        // 待实现动态del路由
        routeService.save(routeDefinition);
    }
}
