package com.imooc.ad.controller;

import com.alibaba.fastjson.JSON;
import com.imooc.ad.entity.AdPlan;
import com.imooc.ad.exception.AdException;
import com.imooc.ad.service.IAdPlanService;
import com.imooc.ad.vo.AdPlanGetRequest;
import com.imooc.ad.vo.AdPlanRequest;
import com.imooc.ad.vo.AdPlanResponse;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 推广计划Controller
 *
 * @author wzy
 * @version 1.0
 * @date 2021/7/4 6:34 下午
 */
@Slf4j
@RestController
@AllArgsConstructor
public class AdPlanOPController {

    public final IAdPlanService planService;

    /**
     * 创建推广计划
     *
     * @param request 请求对象
     * @return 创建推广计划响应对象
     */
    @PostMapping("/create/adPlan")
    public AdPlanResponse createAdPlan(@RequestBody AdPlanRequest request) throws AdException {
        log.info("广告投放系统， createAdPlan-> {}", JSON.toJSONString(request));
        return planService.createAdPlan(request);
    }

    /**
     * 批量获取推广计划
     *
     * @param request 请求对象
     * @return 推广计划列表
     */
    @GetMapping("/get/adPlan")
    public List<AdPlan> getAdPlanByIds(AdPlanGetRequest request) {

        return null;
    }

    /**
     * 更新推广计划
     *
     * @param request 请求对象
     * @return 更新推广计划响应对象
     */
    @PostMapping("/update/adPlan")
    public AdPlanResponse updateAdPlan(AdPlanRequest request) {
        return null;
    }

    /**
     * 删除推广计划
     *
     * @param request 删除推广计划请求对象
     */
    @PostMapping("/delete/adPlan")
    public void deleteAdPlan(@RequestBody AdPlanRequest request) {

    }

}