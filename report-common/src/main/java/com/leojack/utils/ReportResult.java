package com.leojack.utils;

/**
 * @author leojack
 * @message 统一定义返回值格式
 */
public class ReportResult {

    private Integer code;

    private String message;

    private Object data;

    public ReportResult() {
    }

    public ReportResult(Integer code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static ReportResult success(String message){
        return success(message,null);
    }

    public static ReportResult success(Object data){
        return success(null, data);
    }

    public static ReportResult success(String message, Object data){
        return new ReportResult(CommonErrorCode.SUCCESSFUL, message, data);
    }

    public static ReportResult error(String message){
        return error(message, null);
    }

    public static ReportResult commonError(String message){
        return error(CommonErrorCode.ERROR_MSG_COM+message, null);
    }

    public static ReportResult error(Object data){
        return error(null, data);
    }

    public static ReportResult error(String message, Object data){
        return new ReportResult(CommonErrorCode.ERROR, message, data);
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
