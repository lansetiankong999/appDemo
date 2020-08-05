package com.springboot.cloud.common.web.entity.form;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.springboot.cloud.common.web.entity.param.BaseParam;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;

/**
 * @author Jump
 */
@EqualsAndHashCode(callSuper = true)
@ApiModel
@Slf4j
@Data
public class BaseQueryForm<P extends BaseParam> extends BaseForm {

    /**
     * 分页查询的参数，当前页数
     */
    private long current = 1;

    /**
     * 分页查询的参数，当前页面每页显示的数量
     */
    private long size = 10;

    /**
     * Form转化为Param
     *
     * @param clazz clazz
     * @return P
     */
    public P toParam(Class<P> clazz) {
        P p = BeanUtils.instantiateClass(clazz);
        BeanUtils.copyProperties(this, p);
        return p;
    }

    /**
     * 从form中获取page参数，用于分页查询参数
     *
     * @return Page
     */
    public Page getPage() {
        return new Page(this.getCurrent(), this.getSize());
    }

}
