package com.imooc.ad.dao;

import com.imooc.ad.entity.AdUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 用户dao
 *
 * @author wzy
 * @version 1.0
 * @date 2021/7/4 2:52 下午
 */
public interface AdUserRepository extends JpaRepository<AdUser, Long> {
    /**
     * 根据用户名查找用户信息
     *
     * @param username 用户名
     * @return 用户信息
     */
    AdUser findByUsername(String username);
}