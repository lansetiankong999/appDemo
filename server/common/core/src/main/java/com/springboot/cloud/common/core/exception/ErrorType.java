package com.springboot.cloud.common.core.exception;

/**
 * @author Jump
 */
public interface ErrorType {

    /**
     * 返回code
     *
     * @return String
     */
    String getCode();

    /**
     * 返回mesg
     *
     * @return String
     */
    String getMesg();
}
