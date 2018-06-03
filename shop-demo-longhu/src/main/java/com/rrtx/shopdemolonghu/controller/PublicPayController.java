package com.rrtx.shopdemolonghu.controller;

import com.alibaba.fastjson.JSON;
import com.rrtx.security.domain.PostParams;
import com.rrtx.security.service.ISecurity;
import com.rrtx.security.service.impl.SecurityImpl;
import com.rrtx.shopdemolonghu.domain.vo.GetTargetRequest;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController(value="/publicPay")
@Api(value = "公共方法", description = "公共方法")
public class PublicPayController{
	@Value("${longhu.request.url}")
	private String url;

	/**
	  * 获取机构
	  */
	@ApiOperation(value = "获取目标机构")
    @RequestMapping(value = "/getTarget", method = RequestMethod.POST)
	 public String getTarget(@RequestBody GetTargetRequest getTargetRequest) {
		ISecurity security = new SecurityImpl();

		String jsonString = JSON.toJSONString(getTargetRequest);
		PostParams postParams = new PostParams();
		postParams.setRequestData(jsonString);
		String response = security.post(url + "PublicPayAction.getTarget.do", postParams);

		if("".equals(response)){
			response = "error";
		}
		return response;
	 }
}
