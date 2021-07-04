package com.imooc.ad.service.impl;

import com.imooc.ad.constant.Constants;
import com.imooc.ad.dao.AdPlanRepository;
import com.imooc.ad.dao.AdUserRepository;
import com.imooc.ad.entity.AdPlan;
import com.imooc.ad.entity.AdUser;
import com.imooc.ad.exception.AdException;
import com.imooc.ad.service.IAdPlanService;
import com.imooc.ad.util.CommonUtils;
import com.imooc.ad.vo.AdPlanGetRequest;
import com.imooc.ad.vo.AdPlanRequest;
import com.imooc.ad.vo.AdPlanResponse;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * 推广计划 Service实现类
 *
 * @author wzy
 * @version 1.0
 * @date 2021/7/4 10:48 下午
 */
@Slf4j
@Service
@AllArgsConstructor
public class AdPlanServiceImpl implements IAdPlanService {

    private final AdPlanRepository planRepository;

    private final AdUserRepository userRepository;

    @Override
    @Transactional
    public AdPlanResponse createAdPlan(AdPlanRequest request) throws AdException {

        if (!request.createValidate()) {
            throw new AdException(Constants.ErrorMsg.REQUEST_PARAM_ERROR);
        }

        //确保关联的userId是存在的
        Optional<AdUser> adUser = userRepository.findById(request.getUserId());
        if (!adUser.isPresent()) {
            throw new AdException(Constants.ErrorMsg.CAN_NOT_FIND_RECORD);
        }

        //查询当前用户下是否有同名的推广计划
        AdPlan oldUser = planRepository.findByUserIdAndPlanName(request.getUserId(), request.getPlanName());

        if (oldUser != null) {
            throw new AdException(Constants.ErrorMsg.SAME_NAME_PLAN_ERROR);
        }

        //保存推广计划
        AdPlan newPlan = planRepository.save(
                new AdPlan(request.getUserId(),
                        request.getPlanName(),
                        CommonUtils.parseStringDate(request.getStartDate()),
                        CommonUtils.parseStringDate(request.getEndDate())));

        return new AdPlanResponse(newPlan.getId(), newPlan.getPlanName());
    }

    @Override
    public List<AdPlan> getAdPlanByIds(AdPlanGetRequest request) throws AdException {
        return null;
    }

    @Override
    public AdPlanResponse updateAdPlan(AdPlanRequest request) throws AdException {
        return null;
    }

    @Override
    public void deleteAdPlan(AdPlanRequest request) throws AdException {

    }
}