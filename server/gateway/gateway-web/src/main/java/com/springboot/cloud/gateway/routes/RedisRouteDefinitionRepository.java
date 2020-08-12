package com.springboot.cloud.gateway.routes;

import com.springboot.cloud.gateway.service.impl.RouteServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.route.RouteDefinition;
import org.springframework.cloud.gateway.route.RouteDefinitionRepository;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import javax.annotation.Resource;

/**
 * @author Jump
 */
@Component
@Slf4j
public class RedisRouteDefinitionRepository implements RouteDefinitionRepository {

    @Resource
    private RouteServiceImpl routeService;

    @Override
    public Flux<RouteDefinition> getRouteDefinitions() {
        return Flux.fromIterable(routeService.getRouteDefinitions());
    }

    @Override
    public Mono<Void> save(Mono<RouteDefinition> route) {
        return route.flatMap(routeDefinition -> {
            routeService.save(routeDefinition);
            return Mono.empty();
        });
    }

    @Override
    public Mono<Void> delete(Mono<String> routeId) {
        return routeId.flatMap(id -> {
            routeService.delete(id);
            return Mono.empty();
        });
    }
}
