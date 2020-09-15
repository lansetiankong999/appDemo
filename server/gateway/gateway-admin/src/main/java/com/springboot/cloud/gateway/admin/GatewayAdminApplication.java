package com.springboot.cloud.gateway.admin;

import com.alicp.jetcache.anno.config.EnableCreateCacheAnnotation;
import com.alicp.jetcache.anno.config.EnableMethodCache;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.config.GatewayClassPathWarningAutoConfiguration;

/**
 * @author Jump
 */
@SpringBootApplication(exclude = GatewayClassPathWarningAutoConfiguration.class, scanBasePackages = {"com.alicp.jetcache.autoconfigure", "com.springboot.cloud"})
@EnableDiscoveryClient
@EnableCircuitBreaker
@EnableMethodCache(basePackages = {"com.alicp.jetcache.autoconfigure", "com.springboot.cloud"})
@EnableCreateCacheAnnotation
public class GatewayAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(GatewayAdminApplication.class, args);
    }
}
