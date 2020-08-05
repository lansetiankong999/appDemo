package com.springboot.auth.authorization.service.impl;

import com.springboot.auth.authorization.entity.User;
import com.springboot.auth.authorization.provider.OrganizationProvider;
import com.springboot.auth.authorization.service.IUserService;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Jump
 */
@Service
public class UserServiceImpl implements IUserService {

    @Resource
    private OrganizationProvider organizationProvider;

    @Cacheable("#id")
    @Override
    public User getByUniqueId(String uniqueId) {
        return organizationProvider.getUserByUniqueId(uniqueId).getData();
    }
}
