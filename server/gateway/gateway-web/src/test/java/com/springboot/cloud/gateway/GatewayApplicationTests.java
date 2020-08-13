package com.springboot.cloud.gateway;

import com.springboot.cloud.gateway.service.impl.RouteServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class GatewayApplicationTests {

    @Resource
    private RouteServiceImpl routeService;

    @Test
    public void contextLoads() {
        routeService.loadRouteDefinition();
    }
}
