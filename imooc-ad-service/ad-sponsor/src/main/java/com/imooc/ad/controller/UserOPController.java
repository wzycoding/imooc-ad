package com.imooc.ad.controller;

import com.imooc.ad.exception.AdException;
import com.imooc.ad.service.IUserService;
import com.imooc.ad.vo.CreateUserRequest;
import com.imooc.ad.vo.CreateUserResponse;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户操作Controller
 *
 * @author wzy
 * @version 1.0
 * @date 2021/7/4 2:40 下午
 */
@Slf4j
@RestController
@AllArgsConstructor
public class UserOPController {

    private final IUserService userService;

    @PostMapping("/create/user")
    public CreateUserResponse createUser(
            @RequestBody CreateUserRequest request) throws AdException {
        return userService.createUser(request);
    }
}