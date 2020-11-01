package com.leojack.feign;


import com.leojack.dto.GoodsDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(value = "report-service")
public interface GoodsFeignClient {


    @PostMapping(value = "/goods/insert",consumes = "application/json")
    String insertOne(@RequestBody GoodsDTO goods);

}
