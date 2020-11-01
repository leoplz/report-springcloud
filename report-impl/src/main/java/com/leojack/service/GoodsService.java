package com.leojack.service;


import com.leojack.entity.Goods;

/**
 * @author  leojack
 */
public interface GoodsService {

     String insertGoods(Goods goods,boolean flag);

     String insertGoods(Goods goods);

     Goods queryGoodsById(String goodsId);
}
