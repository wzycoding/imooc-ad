package com.imooc.ad.entity.unit_condition;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * 推广单元地域限制实体类
 *
 * @author wzy
 * @version 1.0
 * @date 2021/7/4 2:03 下午
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ad_unit_district")
public class AdUnitDistrict {
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
     * 省
     */
    @Basic
    @Column(name = "provice", nullable = false)
    private String province;

    /**
     * 市
     */
    @Basic
    @Column(name = "city", nullable = false)
    private String city;

    public AdUnitDistrict(Long unitId, String province,
                          String city) {
        this.unitId = unitId;
        this.province = province;
        this.city = city;
    }
}