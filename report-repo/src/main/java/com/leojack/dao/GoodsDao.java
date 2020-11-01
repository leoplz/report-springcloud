package com.leojack.dao;


import com.leojack.entity.Goods;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface GoodsDao {

     Goods queryGoodsById(String goodsId);

     int insertGoods(Goods goods);
}
