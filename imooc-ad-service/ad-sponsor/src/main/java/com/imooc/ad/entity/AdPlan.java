package com.imooc.ad.entity;

import com.imooc.ad.constant.CommonStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

/**
 * 推广计划实体类
 *
 * @author wzy
 * @version 1.0
 * @date 2021/7/3 11:23 下午
 */
@Entity
@Data
@Table(name = "ad_plan")
@NoArgsConstructor
@AllArgsConstructor
public class AdPlan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    /**
     * 用户id
     */
    @Basic
    @Column(name = "user_id", nullable = false)
    private Long userId;

    /**
     * 计划名称
     */
    @Basic
    @Column(name = "plan_name", nullable = false)
    private String planName;

    /**
     * 计划状态
     */
    @Basic
    @Column(name = "plan_status", nullable = false)
    private Integer planStatus;

    /**
     * 开始日期（超过开始和结束日期，则推广计划要被下架）
     */
    @Basic
    @Column(name = "start_date", nullable = false)
    private Date startDate;

    /**
     * 结束日期
     */
    @Basic
    @Column(name = "end_date", nullable = false)
    private Date endDate;

    @Basic
    @Column(name = "create_time", nullable = false)
    private Date createTime;

    @Basic
    @Column(name = "update_time", nullable = false)
    private Date updateTime;

    public AdPlan(Long userId, String planName,
                  Date startDate, Date endDate) {
        this.userId = userId;
        this.planName = planName;
        this.planStatus = CommonStatus.VALID.getStatus();
        this.startDate = startDate;
        this.endDate = endDate;
        this.createTime = new Date();
        this.updateTime = this.createTime;
    }
}