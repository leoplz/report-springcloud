package com.leojack.controller;


import com.leojack.dto.GoodsDTO;
import com.leojack.entity.Goods;
import com.leojack.service.GoodsService;
import com.leojack.utils.DtoUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * @author leojack
 */
@Component
@RequestMapping("/goods")
public class GoodsController {

    @Autowired
    GoodsService goodsService;

    @PostMapping("/insert")
    @Transactional
    @ResponseBody
    public String insertOne(@RequestBody GoodsDTO goods_dto) {

        Goods goods = DtoUtils.dtoToDo(goods_dto, Goods.class);

        return  goodsService.insertGoods(goods);

    }
}
