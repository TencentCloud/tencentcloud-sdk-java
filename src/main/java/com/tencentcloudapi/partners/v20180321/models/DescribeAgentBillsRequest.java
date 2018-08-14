/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.partners.v20180321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAgentBillsRequest  extends AbstractModel{

    /**
    * 支付月份，如2018-02
    */
    @SerializedName("SettleMonth")
    @Expose
    private String SettleMonth;

    /**
    * 客户账号ID
    */
    @SerializedName("ClientUin")
    @Expose
    private String ClientUin;

    /**
    * 支付方式，prepay/postpay
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * 预付费订单号
    */
    @SerializedName("OrderId")
    @Expose
    private String OrderId;

    /**
    * 客户备注名称
    */
    @SerializedName("ClientRemark")
    @Expose
    private String ClientRemark;

    /**
    * 偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Integer Offset;

    /**
    * 限制数目
    */
    @SerializedName("Limit")
    @Expose
    private Integer Limit;

    /**
     * 获取支付月份，如2018-02
     * @return SettleMonth 支付月份，如2018-02
     */
    public String getSettleMonth() {
        return this.SettleMonth;
    }

    /**
     * 设置支付月份，如2018-02
     * @param SettleMonth 支付月份，如2018-02
     */
    public void setSettleMonth(String SettleMonth) {
        this.SettleMonth = SettleMonth;
    }

    /**
     * 获取客户账号ID
     * @return ClientUin 客户账号ID
     */
    public String getClientUin() {
        return this.ClientUin;
    }

    /**
     * 设置客户账号ID
     * @param ClientUin 客户账号ID
     */
    public void setClientUin(String ClientUin) {
        this.ClientUin = ClientUin;
    }

    /**
     * 获取支付方式，prepay/postpay
     * @return PayMode 支付方式，prepay/postpay
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * 设置支付方式，prepay/postpay
     * @param PayMode 支付方式，prepay/postpay
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * 获取预付费订单号
     * @return OrderId 预付费订单号
     */
    public String getOrderId() {
        return this.OrderId;
    }

    /**
     * 设置预付费订单号
     * @param OrderId 预付费订单号
     */
    public void setOrderId(String OrderId) {
        this.OrderId = OrderId;
    }

    /**
     * 获取客户备注名称
     * @return ClientRemark 客户备注名称
     */
    public String getClientRemark() {
        return this.ClientRemark;
    }

    /**
     * 设置客户备注名称
     * @param ClientRemark 客户备注名称
     */
    public void setClientRemark(String ClientRemark) {
        this.ClientRemark = ClientRemark;
    }

    /**
     * 获取偏移量
     * @return Offset 偏移量
     */
    public Integer getOffset() {
        return this.Offset;
    }

    /**
     * 设置偏移量
     * @param Offset 偏移量
     */
    public void setOffset(Integer Offset) {
        this.Offset = Offset;
    }

    /**
     * 获取限制数目
     * @return Limit 限制数目
     */
    public Integer getLimit() {
        return this.Limit;
    }

    /**
     * 设置限制数目
     * @param Limit 限制数目
     */
    public void setLimit(Integer Limit) {
        this.Limit = Limit;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SettleMonth", this.SettleMonth);
        this.setParamSimple(map, prefix + "ClientUin", this.ClientUin);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "OrderId", this.OrderId);
        this.setParamSimple(map, prefix + "ClientRemark", this.ClientRemark);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

