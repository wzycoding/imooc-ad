package com.imooc.ad.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 批量获取推广计划请求对象
 *
 * @author wzy
 * @version 1.0
 * @date 2021/7/4 10:18 下午
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdPlanGetRequest {
    private Long userId;

    private List<Long> ids;
}