package com.imooc.ad.service;

import com.imooc.ad.entity.AdPlan;
import com.imooc.ad.exception.AdException;
import com.imooc.ad.vo.AdPlanGetRequest;
import com.imooc.ad.vo.AdPlanRequest;
import com.imooc.ad.vo.AdPlanResponse;

import java.util.List;

/**
 * 推广计划service接口
 *
 * @author wzy
 * @version 1.0
 * @date 2021/7/4 10:48 下午
 */
public interface IAdPlanService {

    /**
     * 创建推广计划
     *
     * @param request 请求对象
     * @return 推广计划响应对象
     * @throws AdException 广告异常
     */
    AdPlanResponse createAdPlan(AdPlanRequest request) throws AdException;

    /**
     * 获取推广计划通过id列表
     *
     * @param request 请求对象
     * @return 推广计划列表
     * @throws AdException 广告异常
     */
    List<AdPlan> getAdPlanByIds(AdPlanGetRequest request) throws AdException;

    /**
     * 更新推广计划
     *
     * @param request 请求对象
     * @return 推广计划响应对象
     * @throws AdException 广告异常
     */
    AdPlanResponse updateAdPlan(AdPlanRequest request) throws AdException;

    /**
     * 删除推广计划
     *
     * @param request 请求对象
     * @throws AdException 广告异常
     */
    void deleteAdPlan(AdPlanRequest request) throws AdException;
}