package com.leojack.exception;

import com.leojack.utils.ReportResult;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author leojack
 * @message 统一异常捕获控制
 */
@ControllerAdvice
public class ExceptionController {

    /**
     * 全局异常捕捉处理
     * @param ex
     * @return
     */
    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public ReportResult errorHandler(Exception ex) {

        return ReportResult.error(ex.getMessage());
    }



}
