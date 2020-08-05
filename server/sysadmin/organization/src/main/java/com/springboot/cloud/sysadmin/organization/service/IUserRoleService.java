package com.springboot.cloud.sysadmin.organization.service;

import java.util.Set;

/**
 * @author Jump
 */
public interface IUserRoleService {

    /**
     * 给用户添加角色
     *
     * @param userId  userId
     * @param roleIds roleIds
     * @return boolean
     */
    boolean saveBatch(String userId, Set<String> roleIds);

    /**
     * 删除用户拥有的角色
     *
     * @param userId userId
     * @return boolean
     */
    boolean removeByUserId(String userId);

    /**
     * 根据userId查询用户拥有角色id集合
     *
     * @param userId userId
     * @return String
     */
    Set<String> queryByUserId(String userId);
}
