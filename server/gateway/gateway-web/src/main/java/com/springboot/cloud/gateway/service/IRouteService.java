package com.springboot.cloud.gateway.service;

import org.springframework.cloud.gateway.route.RouteDefinition;

import java.util.Collection;

/**
 * @author Jump
 */
public interface IRouteService {

    /**
     * 获取路由
     *
     * @return RouteDefinition
     */
    Collection<RouteDefinition> getRouteDefinitions();

    /**
     * save routeDefinition
     *
     * @param routeDefinition routeDefinition
     * @return boolean
     */
    boolean save(RouteDefinition routeDefinition);

    /**
     * 删除 routeDefinition
     *
     * @param routeId routeId
     * @return boolean
     */
    boolean delete(String routeId);
}
