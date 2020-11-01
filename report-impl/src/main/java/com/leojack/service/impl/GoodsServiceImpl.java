package com.leojack.service.impl;

import com.leojack.dao.GoodsDao;
import com.leojack.entity.Goods;
import com.leojack.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

/**
 * @author leojack
 * @message 商品操作service
 */
@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    GoodsDao goodsDao;


    /**
     *
     * @param goods
     * @param flag  是否自动补全id和状态
     */
    @Override
    public String insertGoods(Goods goods,boolean flag) {

        if(flag){
            goods.setGoodsId(UUID.randomUUID().toString().substring(0,32));
            goods.setIsDelete(0);
        }
        Optional.ofNullable(goods.getGoodsId()).orElseThrow(() -> new RuntimeException("id can not be null"));
        Optional.ofNullable(goods.getIsDelete()).orElseThrow(() -> new RuntimeException("status can not be null"));
        if(goodsDao.insertGoods(goods) != 0)
            return goods.getGoodsId();
        return null ;

    }

    @Override
    public String insertGoods(Goods goods) {
        return this.insertGoods(goods,true);
    }

    @Override
    public Goods queryGoodsById(String goodsId) {
        return goodsDao.queryGoodsById(goodsId);
    }


}
