package com.springboot.cloud.sysadmin.organization.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.springboot.cloud.sysadmin.organization.entity.param.GroupQueryParam;
import com.springboot.cloud.sysadmin.organization.entity.po.Group;

import java.util.List;

/**
 * @author Jump
 */
public interface IGroupService extends IService<Group> {

    /**
     * 获取用户组
     *
     * @param id id
     * @return Group
     */
    Group get(String id);

    /**
     * 新增用户组
     *
     * @param group group
     * @return true为新增成功
     */
    boolean add(Group group);

    /**
     * 查询用户组
     *
     * @param groupQueryParam groupQueryParam
     * @return List<Group>
     */
    List<Group> query(GroupQueryParam groupQueryParam);

    /**
     * 根据父id查询用户组
     *
     * @return Group
     */
    List<Group> queryByParentId(String id);

    /**
     * 更新用户组信息
     *
     * @param group group
     * @return boolean
     */
    boolean update(Group group);

    /**
     * 根据id删除用户组
     *
     * @param id id
     * @return boolean
     */
    boolean delete(String id);
}
