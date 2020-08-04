package com.springboot.auth.authorization.service.impl;

import com.springboot.auth.authorization.entity.User;
import com.springboot.auth.authorization.provider.OrganizationProvider;
import com.springboot.auth.authorization.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

    @Qualifier("organization")
    @Autowired
    private OrganizationProvider organizationProvider;

    @Override
    public User getByUniqueId(String uniqueId) {
        return organizationProvider.getUserByUniqueId(uniqueId).getData();
    }
}
