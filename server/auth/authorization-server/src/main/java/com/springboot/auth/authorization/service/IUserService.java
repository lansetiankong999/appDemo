package com.springboot.auth.authorization.service;

import com.springboot.auth.authorization.entity.User;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @author Jump
 */
@Service
public interface IUserService {

    /**
     * 根据用户唯一标识获取用户信息
     *
     * @param uniqueId uniqueId
     * @return User
     */
    @Cacheable(value = "#id")
    User getByUniqueId(String uniqueId);
}
