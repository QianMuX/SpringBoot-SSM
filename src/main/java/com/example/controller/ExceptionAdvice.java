package com.example.controller;

import com.example.exception.BusinessException;
import com.example.exception.SystemException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionAdvice {
    @ExceptionHandler(SystemException.class)
    public Result systemException(SystemException ex) {
        // 保存日志并通知运维人员
        // 发送邮件给开发人员
        return new Result(ex.getCode(), ex.getMessage(), null);
    }

    @ExceptionHandler(BusinessException.class)
    public Result businessException(BusinessException ex) {
        // 保存日志并通知运维人员
        // 发送邮件给开发人员
        return new Result(ex.getCode(), ex.getMessage(), null);
    }

    @ExceptionHandler(Exception.class)
    public Result exception() {
        return new Result(Code.SYSTEM_TIMEOUT_ERR, "系统异常，请稍后重试！！", null);
    }
}
