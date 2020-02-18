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

public class DescribeAgentBillsRequest extends AbstractModel{

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
    private Long Offset;

    /**
    * 限制数目
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 支付月份，如2018-02 
     * @return SettleMonth 支付月份，如2018-02
     */
    public String getSettleMonth() {
        return this.SettleMonth;
    }

    /**
     * Set 支付月份，如2018-02
     * @param SettleMonth 支付月份，如2018-02
     */
    public void setSettleMonth(String SettleMonth) {
        this.SettleMonth = SettleMonth;
    }

    /**
     * Get 客户账号ID 
     * @return ClientUin 客户账号ID
     */
    public String getClientUin() {
        return this.ClientUin;
    }

    /**
     * Set 客户账号ID
     * @param ClientUin 客户账号ID
     */
    public void setClientUin(String ClientUin) {
        this.ClientUin = ClientUin;
    }

    /**
     * Get 支付方式，prepay/postpay 
     * @return PayMode 支付方式，prepay/postpay
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 支付方式，prepay/postpay
     * @param PayMode 支付方式，prepay/postpay
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get 预付费订单号 
     * @return OrderId 预付费订单号
     */
    public String getOrderId() {
        return this.OrderId;
    }

    /**
     * Set 预付费订单号
     * @param OrderId 预付费订单号
     */
    public void setOrderId(String OrderId) {
        this.OrderId = OrderId;
    }

    /**
     * Get 客户备注名称 
     * @return ClientRemark 客户备注名称
     */
    public String getClientRemark() {
        return this.ClientRemark;
    }

    /**
     * Set 客户备注名称
     * @param ClientRemark 客户备注名称
     */
    public void setClientRemark(String ClientRemark) {
        this.ClientRemark = ClientRemark;
    }

    /**
     * Get 偏移量 
     * @return Offset 偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量
     * @param Offset 偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 限制数目 
     * @return Limit 限制数目
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 限制数目
     * @param Limit 限制数目
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Internal implementation, normal users should not use it.
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

