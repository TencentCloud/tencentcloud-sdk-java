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

public class MigrateOrderRefundQueryRequest extends AbstractModel{

    /**
    * 商户号
    */
    @SerializedName("MerchantId")
    @Expose
    private String MerchantId;

    /**
    * 支付渠道，ALIPAY对应支付宝渠道；UNIONPAY对应银联渠道
    */
    @SerializedName("PayChannel")
    @Expose
    private String PayChannel;

    /**
    * 退款订单号，最长64位，仅支持数字、 字母
    */
    @SerializedName("RefundOrderId")
    @Expose
    private String RefundOrderId;

    /**
    * 退款流水号
    */
    @SerializedName("TradeSerialNo")
    @Expose
    private String TradeSerialNo;

    /**
    * 接入环境。沙箱环境填 sandbox。
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
     * Get 支付渠道，ALIPAY对应支付宝渠道；UNIONPAY对应银联渠道 
     * @return PayChannel 支付渠道，ALIPAY对应支付宝渠道；UNIONPAY对应银联渠道
     */
    public String getPayChannel() {
        return this.PayChannel;
    }

    /**
     * Set 支付渠道，ALIPAY对应支付宝渠道；UNIONPAY对应银联渠道
     * @param PayChannel 支付渠道，ALIPAY对应支付宝渠道；UNIONPAY对应银联渠道
     */
    public void setPayChannel(String PayChannel) {
        this.PayChannel = PayChannel;
    }

    /**
     * Get 退款订单号，最长64位，仅支持数字、 字母 
     * @return RefundOrderId 退款订单号，最长64位，仅支持数字、 字母
     */
    public String getRefundOrderId() {
        return this.RefundOrderId;
    }

    /**
     * Set 退款订单号，最长64位，仅支持数字、 字母
     * @param RefundOrderId 退款订单号，最长64位，仅支持数字、 字母
     */
    public void setRefundOrderId(String RefundOrderId) {
        this.RefundOrderId = RefundOrderId;
    }

    /**
     * Get 退款流水号 
     * @return TradeSerialNo 退款流水号
     */
    public String getTradeSerialNo() {
        return this.TradeSerialNo;
    }

    /**
     * Set 退款流水号
     * @param TradeSerialNo 退款流水号
     */
    public void setTradeSerialNo(String TradeSerialNo) {
        this.TradeSerialNo = TradeSerialNo;
    }

    /**
     * Get 接入环境。沙箱环境填 sandbox。 
     * @return Profile 接入环境。沙箱环境填 sandbox。
     */
    public String getProfile() {
        return this.Profile;
    }

    /**
     * Set 接入环境。沙箱环境填 sandbox。
     * @param Profile 接入环境。沙箱环境填 sandbox。
     */
    public void setProfile(String Profile) {
        this.Profile = Profile;
    }

    public MigrateOrderRefundQueryRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MigrateOrderRefundQueryRequest(MigrateOrderRefundQueryRequest source) {
        if (source.MerchantId != null) {
            this.MerchantId = new String(source.MerchantId);
        }
        if (source.PayChannel != null) {
            this.PayChannel = new String(source.PayChannel);
        }
        if (source.RefundOrderId != null) {
            this.RefundOrderId = new String(source.RefundOrderId);
        }
        if (source.TradeSerialNo != null) {
            this.TradeSerialNo = new String(source.TradeSerialNo);
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
        this.setParamSimple(map, prefix + "PayChannel", this.PayChannel);
        this.setParamSimple(map, prefix + "RefundOrderId", this.RefundOrderId);
        this.setParamSimple(map, prefix + "TradeSerialNo", this.TradeSerialNo);
        this.setParamSimple(map, prefix + "Profile", this.Profile);

    }
}

