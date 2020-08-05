package com.springboot.cloud.demos.producer.entity.po;

import com.baomidou.mybatisplus.annotation.TableLogic;
import com.springboot.cloud.common.web.entity.po.BasePo;
import lombok.*;

/**
 * @author Jump
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Product extends BasePo {
    private String name;
    private String description;
    @TableLogic
    private String deleted = "N";
}
