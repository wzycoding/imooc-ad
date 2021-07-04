package com.imooc.ad.entity;

import com.imooc.ad.constant.CommonStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

/**
 * 用户实体类
 *
 * @author wzy
 * @version 1.0
 * @date 2021/7/3 11:57 下午
 */
@Entity
@Data
@Table(name = "ad_user")
@NoArgsConstructor
@AllArgsConstructor
public class AdUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    /**
     * 用户名
     */
    @Basic
    @Column(name = "username")
    private String username;

    /**
     * token
     */
    @Basic
    @Column(name = "token")
    private String token;

    /**
     * 用户状态
     */
    @Basic
    @Column(name = "user_status")
    private Integer userStatus;

    /**
     * 创建时间
     */
    @Basic
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 更新时间
     */
    @Basic
    @Column(name = "update_time")
    private Date updateTime;

    public AdUser(String username, String token) {
        this.username = username;
        this.token = token;
        this.userStatus = CommonStatus.VALID.getStatus();
        this.createTime = new Date();
        this.updateTime = this.createTime;
    }
}