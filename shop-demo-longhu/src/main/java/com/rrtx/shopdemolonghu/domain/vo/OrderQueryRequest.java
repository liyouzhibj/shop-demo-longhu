package com.rrtx.shopdemolonghu.domain.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "/orderQuery 请求参数")
public class OrderQueryRequest {

    @ApiModelProperty(value = "商户号", example = "M10000000000001", notes = "", position = 1)
    private String merId;
    @ApiModelProperty(value = "支付方式ID", example = "1", notes = "", position = 2)
    private String payID;
    @ApiModelProperty(value = "业务线ID", example = "10000001", notes = "", position = 3)
    private String businessId;
    @ApiModelProperty(value = "请求流水号", example = "2018052610433610000001", notes = "", position = 4)
    private String reqtNo;
    @ApiModelProperty(value = "请求时间", example = "20180526104336", notes = "", position = 5)
    private String timestamp;
    @ApiModelProperty(value = "报文格式", example = "JSON", notes = "", position = 6)
    private String format;
    @ApiModelProperty(value = "编码格式", example = "UTF-8", notes = "", position = 7)
    private String charset;
    @ApiModelProperty(value = "接口版本号", example = "1.0", notes = "", position = 8)
    private String version;
    @ApiModelProperty(value = "商户订单号", example = "GY201805261101100000000001", notes = "", position = 9)
    private String orderNo;

    public String getMerId() {
        return merId;
    }

    public void setMerId(String merId) {
        this.merId = merId;
    }

    public String getPayID() {
        return payID;
    }

    public void setPayID(String payID) {
        this.payID = payID;
    }

    public String getBusinessId() {
        return businessId;
    }

    public void setBusinessId(String businessId) {
        this.businessId = businessId;
    }

    public String getReqtNo() {
        return reqtNo;
    }

    public void setReqtNo(String reqtNo) {
        this.reqtNo = reqtNo;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getCharset() {
        return charset;
    }

    public void setCharset(String charset) {
        this.charset = charset;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }
}
