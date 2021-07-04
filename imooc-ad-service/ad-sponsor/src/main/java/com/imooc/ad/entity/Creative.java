package com.imooc.ad.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

/**
 * @author wzy
 * @version 1.0
 * @date 2021/7/3 11:57 下午
 */
@Entity
@Data
@AllArgsConstructor
@Table(name = "ad_creative")
@NoArgsConstructor
public class Creative {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    /**
     * 创意名称
     */
    @Basic
    @Column(name = "name", nullable = false)
    private String name;

    /**
     * 创意的主类型，如视频、图片等
     */
    @Basic
    @Column(name = "type", nullable = false)
    private Integer type;

    /**
     * 物料的类型：如图片是png、jpg
     */
    @Basic
    @Column(name = "material_type", nullable = false)
    private Integer materialType;

    /**
     * 物料的高度
     */
    @Basic
    @Column(name = "height", nullable = false)
    private Integer height;

    /**
     * 物料的宽度
     */
    @Basic
    @Column(name = "width", nullable = false)
    private Integer width;

    /**
     * 物料的大小
     */
    @Basic
    @Column(name = "size", nullable = false)
    private Long size;

    /**
     * 物料的时长（特指视频时长）
     */
    @Basic
    @Column(name = "duration", nullable = false)
    private Integer duration;

    /**
     * 审核状态
     */
    @Basic
    @Column(name = "audit_status", nullable = false)
    private Integer auditStatus;

    /**
     * 用户id
     */
    @Basic
    @Column(name = "user_id", nullable = false)
    private Long userId;

    /**
     * 物料url
     */
    @Basic
    @Column(name = "url", nullable = false)
    private String url;

    /**
     * 创建时间
     */
    @Basic
    @Column(name = "create_time", nullable = false)
    private Date createTime;

    /**
     * 更新时间
     */
    @Basic
    @Column(name = "update_time", nullable = false)
    private Date updateTime;
}