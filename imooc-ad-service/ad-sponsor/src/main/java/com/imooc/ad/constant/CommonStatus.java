package com.imooc.ad.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author wzy
 * @version 1.0
 * @date 2021/7/3 11:30 下午
 */
@Getter
@AllArgsConstructor
public enum CommonStatus {
    /**
     * 通用状态定义
     */
    VALID(1, "有效状态"),
    INVALID(0, "无效状态");

    private Integer status;
    private String desc;
}