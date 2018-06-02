package com.rrtx.shopdemolonghu.domain.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "/createOrder 请求参数")
public class CreateOrderRequest {

    @ApiModelProperty(value = "商户号", example = "", notes = "", position = 1)
    private String merId;
    @ApiModelProperty(value = "支付方式ID", example = "", notes = "", position = 2)
    private String payID;
    @ApiModelProperty(value = "业务线ID", example = "", notes = "", position = 1)
    private String businessId;
    @ApiModelProperty(value = "请求号", example = "", notes = "", position = 2)
    private String reqtNo;
    @ApiModelProperty(value = "订单号", example = "", notes = "", position = 1)
    private String orderNo;
    @ApiModelProperty(value = "目标机构ID", example = "", notes = "", position = 2)
    private String ageNO;
    @ApiModelProperty(value = "商品名称", example = "", notes = "", position = 1)
    private String goodsinf;
    @ApiModelProperty(value = "商品说明", example = "", notes = "", position = 2)
    private String goodsdescription;
    @ApiModelProperty(value = "用户标识", example = "", notes = "", position = 1)
    private String openId;
    @ApiModelProperty(value = "用户子标识", example = "", notes = "", position = 2)
    private String subOpenId;
    @ApiModelProperty(value = "币种", example = "", notes = "", position = 1)
    private String crytype;
    @ApiModelProperty(value = "订单创建时间yyyyMMddhhmmss", example = "", notes = "", position = 2)
    private String createTime;
    @ApiModelProperty(value = "订单失效时间yyyyMMddhhmmss", example = "", notes = "", position = 2)
    private String timeout;
    @ApiModelProperty(value = "订单金额，单位（分）", example = "", notes = "", position = 2)
    private String totalAmount;
    @ApiModelProperty(value = "支付结果通知地址", example = "", notes = "", position = 2)
    private String notifyurl;
    @ApiModelProperty(value = "客户端IP", example = "", notes = "", position = 2)
    private String reqip;
    @ApiModelProperty(value = "是否可以使用信用卡支付", example = "", notes = "", position = 2)
    private String limitPay;
    @ApiModelProperty(value = "用户手机号", example = "", notes = "", position = 2)
    private String mobile;
    @ApiModelProperty(value = "商品信息预留", example = "", notes = "", position = 2)
    private String description;
    @ApiModelProperty(value = "优惠信息预留", example = "", notes = "", position = 2)
    private String remark;

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

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getAgeNO() {
        return ageNO;
    }

    public void setAgeNO(String ageNO) {
        this.ageNO = ageNO;
    }

    public String getGoodsinf() {
        return goodsinf;
    }

    public void setGoodsinf(String goodsinf) {
        this.goodsinf = goodsinf;
    }

    public String getGoodsdescription() {
        return goodsdescription;
    }

    public void setGoodsdescription(String goodsdescription) {
        this.goodsdescription = goodsdescription;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getSubOpenId() {
        return subOpenId;
    }

    public void setSubOpenId(String subOpenId) {
        this.subOpenId = subOpenId;
    }

    public String getCrytype() {
        return crytype;
    }

    public void setCrytype(String crytype) {
        this.crytype = crytype;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getTimeout() {
        return timeout;
    }

    public void setTimeout(String timeout) {
        this.timeout = timeout;
    }

    public String getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getNotifyurl() {
        return notifyurl;
    }

    public void setNotifyurl(String notifyurl) {
        this.notifyurl = notifyurl;
    }

    public String getReqip() {
        return reqip;
    }

    public void setReqip(String reqip) {
        this.reqip = reqip;
    }

    public String getLimitPay() {
        return limitPay;
    }

    public void setLimitPay(String limitPay) {
        this.limitPay = limitPay;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
