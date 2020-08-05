package com.springboot.cloud.sysadmin.organization.entity.vo;

import com.springboot.cloud.common.web.entity.vo.BaseVo;
import com.springboot.cloud.sysadmin.organization.entity.po.User;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

import java.util.Date;
import java.util.Set;

/**
 * @author Jump
 */
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
public class UserVo extends BaseVo {

    public UserVo(User user) {
        BeanUtils.copyProperties(user, this);
    }

    private String name;
    private String mobile;
    private String username;
    private String description;
    private String deleted;
    private Set<String> roleIds;
    private String createdBy;
    private String updatedBy;
    private Date createdTime;
    private Date updatedTime;
}
