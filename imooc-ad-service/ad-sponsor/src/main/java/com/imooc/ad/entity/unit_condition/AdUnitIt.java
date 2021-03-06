package com.imooc.ad.entity.unit_condition;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * 推广单元兴趣限制实体类
 *
 * @author wzy
 * @version 1.0
 * @date 2021/7/4 2:03 下午
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ad_unit_it")
public class AdUnitIt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    /**
     * 推广单元id
     */
    @Basic
    @Column(name = "unit_id", nullable = false)
    private Long unitId;

    /**
     * 兴趣标签
     */
    @Basic
    @Column(name = "it_tag", nullable = false)
    private String itTag;

    public AdUnitIt(Long unitId, String itTag) {
        this.unitId = unitId;
        this.itTag = itTag;
    }
}