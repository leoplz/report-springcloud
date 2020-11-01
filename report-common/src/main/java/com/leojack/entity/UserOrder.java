package com.leojack.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author leojack
 */
@Data
@AllArgsConstructor
public class UserOrder {
    /**
     * 用户Id
     */
    private String userId;

    /**
     * 订单Id,自动生成的32位UUID
     */
    private String orderId;

    /**
     * 商品名称
     */
    private String goodsName;

    /**
     * 商品详情
     */
    private String goodsDetail;

    /**
     * 商品标单价
     */
    private BigDecimal goodsOffPrice;

    /**
     * 用户支付实际单价
     */
    private BigDecimal goodsOnPrice;

    /**
     * 商品数量
     */
    private String goodsNum;

    /**
     * 用户国家
     */
    private String userCountryId;

    /**
     * 用户省份
     */
    private String userProvinceId;

    /**
     * 用户城市
     */
    private String userCityId;

    /**
     * 用户具体地址
     */
    private String userAddress;

    /**
     * 创建时间
     */
    private Date createTime;

    public static enum DP {
        userId,
        orderId,
        goodsName,
        goodsDetail,
        goodsOffPrice,
        goodsOnPrice,
        goodsNum,
        userCountryId,
        userProvinceId,
        userCityId,
        userAddress,
        createTime


    }
}
