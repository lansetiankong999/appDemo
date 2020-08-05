package com.springboot.cloud.demos.producer.entity.param;

import com.springboot.cloud.common.web.entity.param.BaseParam;
import com.springboot.cloud.demos.producer.entity.po.Product;
import lombok.*;

/**
 * @author Jump
 */
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductQueryParam extends BaseParam<Product> {
    private String name;
}
