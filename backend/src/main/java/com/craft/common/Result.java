package com.craft.common;

public class Result<T> {
    private int code;   // 0 成功，其它失败
    private String msg;
    private T data;

    public static <T> Result<T> ok(T data) {
        return new Result<>(0, "success", data);
    }
    public static Result<Void> ok() {
        return new Result<>(0, "success", null);
    }
    public static Result<Void> fail(String msg) {
        return new Result<>(1, msg, null);
    }

    private Result(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    /* === Getter === */
    public int getCode() { return code; }
    public String getMsg() { return msg; }
    public T getData() { return data; }
}