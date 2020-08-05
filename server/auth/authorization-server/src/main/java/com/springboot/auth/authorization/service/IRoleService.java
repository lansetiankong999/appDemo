package com.springboot.auth.authorization.service;

import com.springboot.auth.authorization.entity.Role;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * @author Jump
 */
@Service
public interface IRoleService {

    /**
     * queryUserRolesByUserId
     *
     * @param userId userId
     * @return Role
     */
    Set<Role> queryUserRolesByUserId(String userId);

}
