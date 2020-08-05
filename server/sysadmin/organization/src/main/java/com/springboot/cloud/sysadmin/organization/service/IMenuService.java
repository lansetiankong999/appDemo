package com.springboot.cloud.sysadmin.organization.service;

import com.springboot.cloud.sysadmin.organization.entity.param.MenuQueryParam;
import com.springboot.cloud.sysadmin.organization.entity.po.Menu;

import java.util.List;

/**
 * @author Jump
 */
public interface IMenuService {

    /**
     * 获取菜单
     *
     * @param id id
     * @return Menu
     */
    Menu get(String id);

    /**
     * 新增菜单
     *
     * @param menu menu
     * @return boolean
     */
    boolean add(Menu menu);

    /**
     * 查询菜单
     *
     * @param menuQueryParam menuQueryParam
     * @return Menu
     */
    List<Menu> query(MenuQueryParam menuQueryParam);

    /**
     * 根据父id查询菜单
     *
     * @param id id
     * @return List<Menu>
     */
    List<Menu> queryByParentId(String id);

    /**
     * 更新菜单信息
     *
     * @param menu menu
     * @return boolean
     */
    boolean update(Menu menu);

    /**
     * 根据id删除菜单
     *
     * @param id id
     * @return boolean
     */
    boolean delete(String id);
}
