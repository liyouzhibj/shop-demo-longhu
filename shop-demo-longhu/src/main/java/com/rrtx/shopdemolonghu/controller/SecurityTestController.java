package com.rrtx.shopdemolonghu.controller;

import com.alibaba.fastjson.JSON;
import com.rrtx.security.domain.PostParams;
import com.rrtx.security.service.ISecurity;
import com.rrtx.security.service.impl.SecurityImpl;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController(value="/securityTest")
@Api(value = "Security Test", description = "安全测试")
public class SecurityTestController {
    @Value("${longhu.request.url}")
    private String url;

    @RequestMapping(value = "/securityTest", method = RequestMethod.POST)
    public String securityTest(){
        ISecurity security = new SecurityImpl();
        Map<String, Object> parentMap = new HashMap<String, Object>();
        Map<String, Object> subMap = new HashMap<String, Object>();
        subMap.put("abc", "subTest1");
        subMap.put("acd", "subTest2");
        subMap.put("adc", "subTest3");
        parentMap.put("name", "zhangsan");
        parentMap.put("email", "zhangsan@163.com");
        parentMap.put("subJson", subMap);

        String jsonString = JSON.toJSONString(parentMap);

        PostParams postParams = new PostParams();
        postParams.setRequestData(jsonString);
        String response = security.post(url + "TestAction.test.do", postParams);

        if("".equals(response)){
            response = "error";
        }
        return response;
    }
}
