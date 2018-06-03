package com.rrtx.shopdemolonghu.domain.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "/createOrder 请求参数")
public class CreateOrderRequest {

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
    @ApiModelProperty(value = "订单号", example = "GY201805261101100000000001", notes = "", position = 10)
    private String orderNo;
    @ApiModelProperty(value = "目标机构ID", example = "1000", notes = "", position = 11)
    private String ageNO;
    @ApiModelProperty(value = "商品名称", example = "Iphone6 16G", notes = "", position = 12)
    private String subject;
    @ApiModelProperty(value = "商品说明", example = "Iphone6 16G", notes = "", position = 13)
    private String body;
    @ApiModelProperty(value = "用户标识", example = "1234567890", notes = "", position = 14)
    private String openId;
    @ApiModelProperty(value = "用户子标识", example = "1234567890", notes = "", position = 15)
    private String subOpenId;
    @ApiModelProperty(value = "币种", example = "CNY", notes = "", position = 16)
    private String crytype;
    @ApiModelProperty(value = "订单创建时间yyyyMMddhhmmss", example = "20180522185420", notes = "", position = 17)
    private String createTime;
    @ApiModelProperty(value = "订单失效时间yyyyMMddhhmmss", example = "20180522205420", notes = "", position = 18)
    private String timeout;
    @ApiModelProperty(value = "订单金额，单位（分）", example = "688800", notes = "", position = 19)
    private String totalAmount;
    @ApiModelProperty(value = "支付结果通知地址", example = "http://www.longhupay.com", notes = "", position = 20)
    private String notifyurl;
    @ApiModelProperty(value = "客户端IP", example = "127.0.0.1", notes = "", position = 21)
    private String reqip;
    @ApiModelProperty(value = "是否可以使用信用卡支付", example = "0", notes = "", position = 22)
    private String limitPay;
    @ApiModelProperty(value = "用户手机号", example = "13051811633", notes = "", position = 23)
    private String mobile;
    @ApiModelProperty(value = "商品信息预留", example = "", notes = "", position = 24)
    private String description;
    @ApiModelProperty(value = "优惠信息预留", example = "", notes = "", position = 25)
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

    public String getAgeNO() {
        return ageNO;
    }

    public void setAgeNO(String ageNO) {
        this.ageNO = ageNO;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
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
