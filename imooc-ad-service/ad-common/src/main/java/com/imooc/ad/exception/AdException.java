package com.imooc.ad.exception;

/**
 * 广告系统自定义异常
 *
 * @author wzy
 * @version 1.0
 * @date 2021/7/3 5:35 下午
 */
public class AdException extends Exception {

    public AdException(String message) {
        super(message);
    }
}