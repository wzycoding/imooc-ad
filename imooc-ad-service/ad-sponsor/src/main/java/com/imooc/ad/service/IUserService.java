package com.imooc.ad.service;

import com.imooc.ad.exception.AdException;
import com.imooc.ad.vo.CreateUserRequest;
import com.imooc.ad.vo.CreateUserResponse;

/**
 * 用户service接口
 *
 * @author wzy
 * @version 1.0
 * @date 2021/7/4 2:46 下午
 */
public interface IUserService {
    /**
     * 创建用户
     *
     * @param request 请求对象
     * @return 响应对象
     * @throws AdException 广告异常
     */
    CreateUserResponse createUser(CreateUserRequest request) throws AdException;
}