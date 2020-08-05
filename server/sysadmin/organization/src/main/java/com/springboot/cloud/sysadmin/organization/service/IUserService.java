package com.springboot.cloud.sysadmin.organization.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.springboot.cloud.sysadmin.organization.entity.param.UserQueryParam;
import com.springboot.cloud.sysadmin.organization.entity.po.User;
import com.springboot.cloud.sysadmin.organization.entity.vo.UserVo;

/**
 * @author Jump
 */
public interface IUserService {

    /**
     * 获取用户
     *
     * @param id 用户id
     * @return UserVo
     */
    UserVo get(String id);

    /**
     * 根据用户唯一标识获取用户信息
     * 目前用户标识不用户名或mobile
     *
     * @param uniqueId uniqueId
     * @return User
     */
    User getByUniqueId(String uniqueId);

    /**
     * 新增用户
     *
     * @param user user
     * @return boolean
     */
    boolean add(User user);

    /**
     * 查询用户
     *
     * @param page           page
     * @param userQueryParam userQueryParam
     * @return UserVo
     */
    IPage<UserVo> query(Page<User> page, UserQueryParam userQueryParam);

    /**
     * 更新用户信息
     *
     * @param user user
     * @return boolean
     */
    boolean update(User user);

    /**
     * 根据id删除用户
     *
     * @param id id
     * @return boolean
     */
    boolean delete(String id);
}
