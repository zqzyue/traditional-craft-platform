package com.craft.common;

import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    // 参数校验失败
    @org.springframework.web.bind.annotation.ExceptionHandler(BindException.class)
    public Result<Void> handleValid(BindException e) {
        String msg = e.getBindingResult().getFieldError().getDefaultMessage();
        return Result.fail(msg);
    }

    // 兜底
    @org.springframework.web.bind.annotation.ExceptionHandler(Exception.class)
    public Result<Void> handleAll(Exception e) {
        return Result.fail(e.getMessage());
    }
}