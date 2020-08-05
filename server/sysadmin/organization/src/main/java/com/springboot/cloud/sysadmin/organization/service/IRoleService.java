package com.springboot.cloud.sysadmin.organization.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.springboot.cloud.sysadmin.organization.entity.param.RoleQueryParam;
import com.springboot.cloud.sysadmin.organization.entity.po.Role;

import java.util.List;

/**
 * @author Jump
 */
public interface IRoleService {

    /**
     * 获取角色
     *
     * @param id id
     * @return Role
     */
    Role get(String id);

    /**
     * 获取所有角色
     *
     * @return Role
     */
    List<Role> getAll();

    /**
     * 新增角色
     *
     * @param role role
     * @return boolean
     */
    boolean add(Role role);

    /**
     * 查询角色
     *
     * @param page           page
     * @param roleQueryParam roleQueryParam
     * @return Role
     */
    IPage<Role> query(Page page, RoleQueryParam roleQueryParam);

    /**
     * 根据用户id查询用户拥有的角色
     *
     * @param userId userId
     * @return Role
     */
    List<Role> query(String userId);

    /**
     * 更新角色信息
     *
     * @param role role
     * @return boolean
     */
    boolean update(Role role);

    /**
     * 根据id删除角色
     *
     * @param id id
     * @return boolean
     */
    boolean delete(String id);
}
