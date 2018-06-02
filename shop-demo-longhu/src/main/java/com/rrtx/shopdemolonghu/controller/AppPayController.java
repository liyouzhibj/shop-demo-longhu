package com.rrtx.shopdemolonghu.controller;

import com.rrtx.shopdemolonghu.domain.vo.CreateOrderRequest;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "App Pay", description = "App Pay")
public class AppPayController {

    @ApiOperation(value = "平台下单接口")
    @RequestMapping(value = "/createOrder", method = RequestMethod.POST)
    public String createOrder(@RequestBody CreateOrderRequest createOrderRequest){
        return "success";
    }
}
