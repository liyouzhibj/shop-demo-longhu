package com.rrtx.shopdemolonghu.controller;

import com.alibaba.fastjson.JSON;
import com.rrtx.security.domain.PostParams;
import com.rrtx.security.service.ISecurity;
import com.rrtx.security.service.impl.SecurityImpl;
import com.rrtx.shopdemolonghu.domain.vo.CreateOrderRequest;
import com.rrtx.shopdemolonghu.domain.vo.OrderQueryRequest;
import com.rrtx.shopdemolonghu.domain.vo.RefundQueryRequest;
import com.rrtx.shopdemolonghu.domain.vo.RefundRequest;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController(value="/appPay")
@Api(value = "App Pay", description = "App支付")
public class AppPayController {
    @Value("${longhu.request.url}")
    private String url;

    @ApiOperation(value = "平台下单接口")
    @RequestMapping(value = "/appPayCreateOrder", method = RequestMethod.POST)
    public String createOrder(@RequestBody CreateOrderRequest createOrderRequest){
        ISecurity security = new SecurityImpl();

        String jsonString = JSON.toJSONString(createOrderRequest);
        PostParams postParams = new PostParams();
        postParams.setRequestData(jsonString);
        String response = security.post(url + "AppPayAction.createOrder.do", postParams);

        if("".equals(response)){
            response = "error";
        }
        return response;
    }

    @ApiOperation(value = "支付结果查询接口")
    @RequestMapping(value = "/appPayOrderQuery", method = RequestMethod.POST)
    public String orderQuery(@RequestBody OrderQueryRequest orderQueryRequest){
        ISecurity security = new SecurityImpl();

        String jsonString = JSON.toJSONString(orderQueryRequest);
        PostParams postParams = new PostParams();
        postParams.setRequestData(jsonString);
        String response = security.post(url + "AppPayAction.orderQuery.do", postParams);

        if("".equals(response)){
            response = "error";
        }
        return response;
    }
    
    @ApiOperation(value = "订单退款接口")
    @RequestMapping(value = "/appPayRefund", method = RequestMethod.POST)
    public String refund(@RequestBody RefundRequest RefundRequest){
        ISecurity security = new SecurityImpl();

        String jsonString = JSON.toJSONString(RefundRequest);
        PostParams postParams = new PostParams();
        postParams.setRequestData(jsonString);
        String response = security.post(url + "AppPayAction.refund.do", postParams);

        if("".equals(response)){
            response = "error";
        }
        return response;
    }
    
    @ApiOperation(value = "退款接口查询")
    @RequestMapping(value = "/appPayRefundQuery", method = RequestMethod.POST)
    public String refundQuery(@RequestBody RefundQueryRequest refundQueryRequest){
        ISecurity security = new SecurityImpl();

        String jsonString = JSON.toJSONString(refundQueryRequest);
        PostParams postParams = new PostParams();
        postParams.setRequestData(jsonString);
        String response = security.post(url + "AppPayAction.refundQuery.do", postParams);

        if("".equals(response)){
            response = "error";
        }
        return response;
    }
    
 
}
