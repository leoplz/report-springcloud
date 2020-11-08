package com.leojack.exception;

/**
 * @author leojack
 * @message 自定义Api访问权限异常
 */
public class ApiAccessException extends RuntimeException {

    public ApiAccessException(String msg)
    {
        super(msg);
    }

}
