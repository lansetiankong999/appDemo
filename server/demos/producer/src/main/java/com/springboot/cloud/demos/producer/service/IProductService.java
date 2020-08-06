package com.springboot.cloud.demos.producer.service;

import com.springboot.cloud.demos.producer.entity.param.ProductQueryParam;
import com.springboot.cloud.demos.producer.entity.po.Product;

import java.util.List;

/**
 * @author Jump
 */
public interface IProductService {
    /**
     * 获取用户
     *
     * @param id id
     * @return Product
     */
    Product get(String id);

    /**
     * 新增用户
     *
     * @param product product
     * @return boolean
     */
    boolean add(Product product);

    /**
     * 查询用户
     * @param productQueryParam param
     * @return Product
     */
    List<Product> query(ProductQueryParam productQueryParam);

    /**
     * 更新用户信息
     *
     * @param product product
     * @return boolean
     */
    boolean update(Product product);

    /**
     * 根据id删除用户
     *
     * @param id id
     * @return boolean
     */
    boolean delete(String id);
}
