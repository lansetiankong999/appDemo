package com.springboot.cloud.gateway.admin.service;

import com.springboot.cloud.gateway.admin.entity.ov.GatewayRouteVo;
import com.springboot.cloud.gateway.admin.entity.param.GatewayRouteQueryParam;
import com.springboot.cloud.gateway.admin.entity.po.GatewayRoute;

import java.util.List;

/**
 * @author Jump
 */
public interface IGatewayRouteService {

    /**
     * 获取网关路由
     *
     * @param id id
     * @return GatewayRoute
     */
    GatewayRoute get(String id);

    /**
     * 新增网关路由
     *
     * @param gatewayRoute gatewayRoute
     * @return boolean
     */
    boolean add(GatewayRoute gatewayRoute);

    /**
     * 查询网关路由
     *
     * @return GatewayRouteVo
     * @param gatewayRouteQueryParam gatewayRouteQueryParam
     */
    List<GatewayRouteVo> query(GatewayRouteQueryParam gatewayRouteQueryParam);

    /**
     * 更新网关路由信息
     *
     * @param gatewayRoute gatewayRoute
     * @return boolean
     */
    boolean update(GatewayRoute gatewayRoute);

    /**
     * 根据id删除网关路由
     *
     * @param id id
     * @return boolean
     */
    boolean delete(String id);

    /**
     * 重新加载网关路由配置到redis
     *
     * @return 成功返回true
     */
    boolean overload();
}
