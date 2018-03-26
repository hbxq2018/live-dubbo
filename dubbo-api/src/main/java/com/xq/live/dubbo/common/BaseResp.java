package com.xq.live.dubbo.common;

import java.io.Serializable;

/**
 * @package: com.xq.live.dubbo.common
 * @description: 数据返回统一格式
 * @author: zhangpeng32
 * @date: 2018/3/25 12:19
 * @version: 1.0
 */
public class BaseResp<T> implements Serializable{
    /**
     * 返回码
     */
    private int code;

    /**
     * 返回信息描述
     */
    private String message;

    /**
     * 返回数据
     */
    private T data;

    private long currentTime;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public long getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(long currentTime) {
        this.currentTime = currentTime;
    }

    public BaseResp() {
    }

    /**
     * @param code    错误码
     * @param message 信息
     * @param data    数据
     */
    public BaseResp(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
        this.currentTime = System.currentTimeMillis();
    }

    /**
     * 不带数据的返回结果
     *
     * @param resultStatus
     */
    public BaseResp(ResultEnums resultStatus) {
        this.code = resultStatus.getErrorCode();
        this.message = resultStatus.getErrorMsg();
        this.data = data;
        this.currentTime = System.currentTimeMillis();
    }

    /**
     * 带数据的返回结果
     *
     * @param resultStatus
     * @param data
     */
    public BaseResp(ResultEnums resultStatus, T data) {
        this.code = resultStatus.getErrorCode();
        this.message = resultStatus.getErrorMsg();
        this.data = data;
        this.currentTime = System.currentTimeMillis();
    }
}
