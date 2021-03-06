package com.springboot.cloud.sysadmin.organization.config;

import com.springboot.cloud.common.web.redis.RedisConfig;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;

/**
 * @author Jump
 */
@Configuration
@EnableCaching
public class MyRedisConfig extends RedisConfig {

}
