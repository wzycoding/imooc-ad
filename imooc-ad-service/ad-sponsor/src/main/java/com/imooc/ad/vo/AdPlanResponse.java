package com.imooc.ad.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 推广计划响应对象
 *
 * @author wzy
 * @version 1.0
 * @date 2021/7/4 10:17 下午
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdPlanResponse {
    private Long id;

    private String planName;
}