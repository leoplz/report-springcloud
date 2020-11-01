package com.leojack.utils;


/**
 * @author leojack
 * @message 基于ReportResult的错误类型
 */
public class CommonErrorCode {

    public static final int ERROR = 500;

    public static final int SUCCESSFUL = 200;

    /**
     * 重复数据
     */
    public static final int ERROR_REPETITION = 201;

    /**
     * 权限验证失败
     */
    public static final int TOKEN_ERROR = 401;

    public static final int ERROR_PAGE = 403;

    public static final String ERROR_MSG = "System error, please contact your administrator";

    public static final String SUCCESS_MSG = "do success!";

    public static final String ERROR_MSG_COM = "System error: ";
}
