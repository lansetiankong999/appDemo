package com.springboot.cloud.sysadmin.organization.entity.param;

import com.springboot.cloud.common.web.entity.param.BaseParam;
import com.springboot.cloud.sysadmin.organization.entity.po.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @author Jump
 */
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserQueryParam extends BaseParam<User> {
    private String name;
    private String mobile;
    private String username;
}
