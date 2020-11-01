package com.leojack.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GoodsDTO {

    /**
     * 商品id
     */
    private String goodsId;

    /**
     * 商品父id
     */
    private String goodsParentId;

    /**
     * 商品类型
     */
    private String goodsType;

    /**
     * 商品名称
     */
    private String goodsName;

    /**
     * 商品价格
     */
    private BigDecimal goodsPrice;

}
