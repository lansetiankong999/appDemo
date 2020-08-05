package com.springboot.cloud.sysadmin.organization.service;

import com.springboot.cloud.sysadmin.organization.entity.param.PositionQueryParam;
import com.springboot.cloud.sysadmin.organization.entity.po.Position;

import java.util.List;

/**
 * @author Jump
 */
public interface IPositionService {
    /**
     * 获取职位
     *
     * @param id id
     * @return Position
     */
    Position get(String id);

    /**
     * 新增职位
     *
     * @param position position
     * @return boolean
     */
    boolean add(Position position);

    /**
     * 查询职位
     *
     * @param positionQueryParam positionQueryParam
     * @return Position
     */
    List<Position> query(PositionQueryParam positionQueryParam);

    /**
     * 更新职位信息
     *
     * @param position position
     * @return boolean
     */
    boolean update(Position position);

    /**
     * 根据id删除职位
     *
     * @param id id
     * @return boolean
     */
    boolean delete(String id);
}
