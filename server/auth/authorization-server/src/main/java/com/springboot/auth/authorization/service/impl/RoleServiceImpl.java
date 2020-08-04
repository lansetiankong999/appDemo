package com.springboot.auth.authorization.service.impl;

import com.springboot.auth.authorization.entity.Role;
import com.springboot.auth.authorization.provider.OrganizationProvider;
import com.springboot.auth.authorization.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * @author xxx
 */
@Service
public class RoleServiceImpl implements IRoleService {

    @Qualifier("organization")
    @Autowired
    private OrganizationProvider organizationProvider;

    @Override
    public Set<Role> queryUserRolesByUserId(String userId) {
        return organizationProvider.queryRolesByUserId(userId).getData();
    }

}
