package com.imooc.ad.dao;

import com.imooc.ad.entity.AdPlan;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * 广告计划dao
 *
 * @author wzy
 * @version 1.0
 * @date 2021/7/4 10:39 下午
 */
public interface AdPlanRepository extends JpaRepository<AdPlan, Long> {

    /**
     * 获取推广计划通过id和用户id
     *
     * @param id     推广计划id
     * @param userId 用户id
     * @return 推广计划对象
     */
    AdPlan findByIdAndUserId(Long id, Long userId);

    /**
     * 获取所有某个用户下指定id列表的推广计划
     *
     * @param ids    推广计划id集合
     * @param userId 用户id
     * @return 推广计划列表
     */
    List<AdPlan> findAllByIdInAndUserId(List<Long> ids, Long userId);

    /**
     * 查询推广计划通过用户id和推广计划名称
     *
     * @param userId   用户id
     * @param planName 推广计划名称
     * @return 推广计划对象
     */
    AdPlan findByUserIdAndPlanName(Long userId, String planName);

    /**
     * 获取所有推广计划通过推广计划状态
     *
     * @param status 推广计划状态
     * @return 推广计划列表
     */
    List<AdPlan> findAllByPlanStatus(Integer status);
}