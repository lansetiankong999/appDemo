package com.springboot.cloud.demos.producer.entity.form;

import com.springboot.cloud.common.web.entity.form.BaseForm;
import com.springboot.cloud.demos.producer.entity.po.Product;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;

/**
 * @author Jump
 */
@EqualsAndHashCode(callSuper = true)
@ApiModel
@Data
public class ProductForm extends BaseForm<Product> {

    @NotBlank(message = "产品名称不能为空")
    @ApiModelProperty(value = "产品名称")
    private String name;

    @ApiModelProperty(value = "产品描述")
    private String description;
}
