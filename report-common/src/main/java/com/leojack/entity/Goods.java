package com.leojack.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author leojack
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Goods {
    /**
     * 商品id
     */
    private String goodsId;

    /**
     * 商品类型
     */
    private String goodsType;

    /**
     * 商品名称
     */
    private String goodsName;

    /**
     * 商品父id
     */
    private String goodsParentId;

    /**
     * 商品价格
     */
    private BigDecimal goodsPrice;

    private Date createTime;

    private Date modifyTime;

    /**
     * 1 为已删除
     * 0 为未删除
     */
    private Integer isDelete;

    private static enum DP {

        goodsId,
        goodsType,
        goodsName,
        goodsParentId,
        goodsPrice,
        isDelete;

    };
}
