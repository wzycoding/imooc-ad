package com.imooc.ad.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 统一响应对象
 *
 * @author wzy
 * @version 1.0
 * @date 2021/7/3 5:40 下午
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonResponse<T> {
    private int code;

    private String msg;

    private T data;

    public CommonResponse(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}