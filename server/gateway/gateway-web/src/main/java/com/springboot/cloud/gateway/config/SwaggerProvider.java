package com.springboot.cloud.gateway.config;

import com.springboot.cloud.gateway.service.impl.RouteServiceImpl;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Jump
 */
@Component
@Primary
@AllArgsConstructor
@Slf4j
public class SwaggerProvider implements SwaggerResourcesProvider {
    public static final String API_URI = "/v2/api-docs";

    @Resource
    private final RouteServiceImpl routeService;

    @Override
    public List<SwaggerResource> get() {
        List<SwaggerResource> resources = new ArrayList<>();
        routeService.getRouteDefinitions()
                .forEach(routeDefinition -> routeDefinition.getPredicates().stream()
                        .filter(predicateDefinition -> "Path".equalsIgnoreCase(predicateDefinition.getName()))
                        .peek(predicateDefinition -> log.debug("路由配置参数：{}", predicateDefinition.getArgs()))
                        .forEach(predicateDefinition -> resources.add(swaggerResource(routeDefinition.getId(),
                                predicateDefinition.getArgs().get("pattern").replace("/**", API_URI)))));
        log.debug("resources:{}", resources);
        return resources;
    }

    private SwaggerResource swaggerResource(String name, String location) {
        SwaggerResource swaggerResource = new SwaggerResource();
        swaggerResource.setName(name);
        swaggerResource.setSwaggerVersion("2.0");
        swaggerResource.setUrl(location);
        return swaggerResource;
    }
}
