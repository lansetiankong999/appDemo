package com.springboot.cloud.sysadmin.organization.entity.po;

import com.springboot.cloud.common.web.entity.po.BasePo;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
public class Resource extends BasePo {
    private String code;
    private String name;
    private String type;
    private String url;
    private String method;
    private String description;
}
