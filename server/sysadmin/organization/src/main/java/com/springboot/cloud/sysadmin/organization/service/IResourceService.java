package com.springboot.cloud.sysadmin.organization.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.springboot.cloud.sysadmin.organization.entity.param.ResourceQueryParam;
import com.springboot.cloud.sysadmin.organization.entity.po.Resource;

import java.util.List;

/**
 * @author Jump
 */
public interface IResourceService {

    /**
     * 获取资源
     *
     * @param id id
     * @return Resource
     */
    Resource get(String id);

    /**
     * 新增资源
     *
     * @param resource resource
     * @return boolean
     */
    boolean add(Resource resource);

    /**
     * 查询资源,分页
     *
     * @param page               page
     * @param resourceQueryParam resourceQueryParam
     * @return Resource
     */
    IPage<Resource> query(Page page, ResourceQueryParam resourceQueryParam);

    /**
     * 查询所有资源
     *
     * @return Resource
     */
    List<Resource> getAll();

    /**
     * 根据username查询角色拥有的资源
     *
     * @param username username
     * @return Resource
     */
    List<Resource> query(String username);

    /**
     * 更新资源信息
     *
     * @param resource resource
     * @return boolean
     */
    boolean update(Resource resource);

    /**
     * 根据id删除资源
     *
     * @param id id
     * @return boolean
     */
    boolean delete(String id);
}
