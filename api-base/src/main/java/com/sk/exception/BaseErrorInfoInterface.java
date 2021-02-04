package com.sk.exception;

/**
 * @Author jinshi
 * @Date 2021/1/13 10:29
 * @Version 1.0
 */
public interface BaseErrorInfoInterface {
    /** 错误码*/
    String getResultCode();

    /** 错误描述*/
    String getResultMsg();
}