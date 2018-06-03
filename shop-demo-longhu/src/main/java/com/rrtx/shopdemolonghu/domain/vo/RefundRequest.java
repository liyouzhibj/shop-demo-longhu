package com.rrtx.shopdemolonghu.domain.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


@ApiModel(description = "/RefundRequest 请求参数")
public class RefundRequest {

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
    @ApiModelProperty(value = "商户退款单号", example = "GYTK201805261101100000000001", notes = "", position = 9)
    private String refundNo;
    @ApiModelProperty(value = "原商户订单号", example = "GY201805261101100000000001", notes = "", position = 10)
    private String orderNo;
    @ApiModelProperty(value = "原订单金额 单位(分)", example = "688800", notes = "", position = 11)
    private String totalAmount;
    @ApiModelProperty(value = "本次退款金额 单位(分)", example = "688800", notes = "", position = 12)
    private String refundAmount;
    @ApiModelProperty(value = "退款原因", example = "假货", notes = "", position = 13)
    private String refundDesc;
    @ApiModelProperty(value = "退款通知地址", example = "http://longhupay.com", notes = "", position = 14)
    private String notifyUrl;

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

    public String getRefundNo() {
        return refundNo;
    }

    public void setRefundNo(String refundNo) {
        this.refundNo = refundNo;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(String refundAmount) {
        this.refundAmount = refundAmount;
    }

    public String getRefundDesc() {
        return refundDesc;
    }

    public void setRefundDesc(String refundDesc) {
        this.refundDesc = refundDesc;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }
}

