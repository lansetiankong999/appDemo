package com.springboot.cloud.sysadmin.organization.exception;

import com.springboot.cloud.common.core.exception.BaseException;

/**
 * @author Jump
 */
public class RoleNotFoundException extends BaseException {
    public RoleNotFoundException() {
        super(OrganizationErrorType.ROLE_NOT_FOUND);
    }

    public RoleNotFoundException(String message) {
        super(OrganizationErrorType.ROLE_NOT_FOUND, message);
    }
}
