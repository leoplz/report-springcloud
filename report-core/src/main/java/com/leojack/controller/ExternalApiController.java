package com.leojack.controller;


import com.leojack.annotation.ApiAccess;
import com.leojack.dto.GoodsDTO;
import com.leojack.feign.GoodsFeignClient;
import com.leojack.utils.ReportResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/external")
public class ExternalApiController {

    @Autowired
    GoodsFeignClient goodsFeignClient;

    @PostMapping("/goods")
    @ResponseBody
    @ApiAccess(ApiAccess.Level.PARTENER)
    public ReportResult addGoods(@RequestBody GoodsDTO goods){

       try{
           String goodsId = goodsFeignClient.insertOne(goods);
           if(goodsId == null){
               return ReportResult.error("新增数据失败！");
           }

           return ReportResult.success(goodsId);
       }catch (Exception e){
           e.printStackTrace();
           return ReportResult.error("服务器内部错误!");
       }

    }


}
