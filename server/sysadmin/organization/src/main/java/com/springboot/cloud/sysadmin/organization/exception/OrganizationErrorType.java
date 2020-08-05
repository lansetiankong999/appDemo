package com.springboot.cloud.sysadmin.organization.exception;

import com.springboot.cloud.common.core.exception.ErrorType;
import lombok.Getter;

/**
 * @author Jump
 */

@Getter
public enum OrganizationErrorType implements ErrorType {

    /**
     * 用户
     */
    USER_NOT_FOUND("030100", "用户未找到！"),
    ROLE_NOT_FOUND("030200", "角色未找到！");

    /**
     * 错误类型码
     */
    private final String code;
    /**
     * 错误类型描述信息
     */
    private final String mesg;

    OrganizationErrorType(String code, String mesg) {
        this.code = code;
        this.mesg = mesg;
    }
}
