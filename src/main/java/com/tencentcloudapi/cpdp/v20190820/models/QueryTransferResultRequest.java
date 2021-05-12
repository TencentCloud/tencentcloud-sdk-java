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
package com.tencentcloudapi.cpdp.v20190820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryTransferResultRequest extends AbstractModel{

    /**
    * 商户号
    */
    @SerializedName("MerchantId")
    @Expose
    private String MerchantId;

    /**
    * 申请商户号的appid或者商户号绑定的appid
    */
    @SerializedName("MerchantAppId")
    @Expose
    private String MerchantAppId;

    /**
    * 1、 微信企业付款 
2、 支付宝转账 
3、 平安银企直联代发转账
    */
    @SerializedName("TransferType")
    @Expose
    private Long TransferType;

    /**
    * 交易流水流水号（与 OrderId 不能同时为空）
    */
    @SerializedName("TradeSerialNo")
    @Expose
    private String TradeSerialNo;

    /**
    * 订单号（与 TradeSerialNo 不能同时为空）
    */
    @SerializedName("OrderId")
    @Expose
    private String OrderId;

    /**
    * 接入环境。沙箱环境填sandbox。
    */
    @SerializedName("Profile")
    @Expose
    private String Profile;

    /**
     * Get 商户号 
     * @return MerchantId 商户号
     */
    public String getMerchantId() {
        return this.MerchantId;
    }

    /**
     * Set 商户号
     * @param MerchantId 商户号
     */
    public void setMerchantId(String MerchantId) {
        this.MerchantId = MerchantId;
    }

    /**
     * Get 申请商户号的appid或者商户号绑定的appid 
     * @return MerchantAppId 申请商户号的appid或者商户号绑定的appid
     */
    public String getMerchantAppId() {
        return this.MerchantAppId;
    }

    /**
     * Set 申请商户号的appid或者商户号绑定的appid
     * @param MerchantAppId 申请商户号的appid或者商户号绑定的appid
     */
    public void setMerchantAppId(String MerchantAppId) {
        this.MerchantAppId = MerchantAppId;
    }

    /**
     * Get 1、 微信企业付款 
2、 支付宝转账 
3、 平安银企直联代发转账 
     * @return TransferType 1、 微信企业付款 
2、 支付宝转账 
3、 平安银企直联代发转账
     */
    public Long getTransferType() {
        return this.TransferType;
    }

    /**
     * Set 1、 微信企业付款 
2、 支付宝转账 
3、 平安银企直联代发转账
     * @param TransferType 1、 微信企业付款 
2、 支付宝转账 
3、 平安银企直联代发转账
     */
    public void setTransferType(Long TransferType) {
        this.TransferType = TransferType;
    }

    /**
     * Get 交易流水流水号（与 OrderId 不能同时为空） 
     * @return TradeSerialNo 交易流水流水号（与 OrderId 不能同时为空）
     */
    public String getTradeSerialNo() {
        return this.TradeSerialNo;
    }

    /**
     * Set 交易流水流水号（与 OrderId 不能同时为空）
     * @param TradeSerialNo 交易流水流水号（与 OrderId 不能同时为空）
     */
    public void setTradeSerialNo(String TradeSerialNo) {
        this.TradeSerialNo = TradeSerialNo;
    }

    /**
     * Get 订单号（与 TradeSerialNo 不能同时为空） 
     * @return OrderId 订单号（与 TradeSerialNo 不能同时为空）
     */
    public String getOrderId() {
        return this.OrderId;
    }

    /**
     * Set 订单号（与 TradeSerialNo 不能同时为空）
     * @param OrderId 订单号（与 TradeSerialNo 不能同时为空）
     */
    public void setOrderId(String OrderId) {
        this.OrderId = OrderId;
    }

    /**
     * Get 接入环境。沙箱环境填sandbox。 
     * @return Profile 接入环境。沙箱环境填sandbox。
     */
    public String getProfile() {
        return this.Profile;
    }

    /**
     * Set 接入环境。沙箱环境填sandbox。
     * @param Profile 接入环境。沙箱环境填sandbox。
     */
    public void setProfile(String Profile) {
        this.Profile = Profile;
    }

    public QueryTransferResultRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryTransferResultRequest(QueryTransferResultRequest source) {
        if (source.MerchantId != null) {
            this.MerchantId = new String(source.MerchantId);
        }
        if (source.MerchantAppId != null) {
            this.MerchantAppId = new String(source.MerchantAppId);
        }
        if (source.TransferType != null) {
            this.TransferType = new Long(source.TransferType);
        }
        if (source.TradeSerialNo != null) {
            this.TradeSerialNo = new String(source.TradeSerialNo);
        }
        if (source.OrderId != null) {
            this.OrderId = new String(source.OrderId);
        }
        if (source.Profile != null) {
            this.Profile = new String(source.Profile);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MerchantId", this.MerchantId);
        this.setParamSimple(map, prefix + "MerchantAppId", this.MerchantAppId);
        this.setParamSimple(map, prefix + "TransferType", this.TransferType);
        this.setParamSimple(map, prefix + "TradeSerialNo", this.TradeSerialNo);
        this.setParamSimple(map, prefix + "OrderId", this.OrderId);
        this.setParamSimple(map, prefix + "Profile", this.Profile);

    }
}

