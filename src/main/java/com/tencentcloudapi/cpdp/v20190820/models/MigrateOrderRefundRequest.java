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

public class MigrateOrderRefundRequest extends AbstractModel{

    /**
    * 商户代码
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
    * 正向支付商户订单号
    */
    @SerializedName("PayOrderId")
    @Expose
    private String PayOrderId;

    /**
    * 退款订单号，最长64位，仅支持数字、 字母
    */
    @SerializedName("RefundOrderId")
    @Expose
    private String RefundOrderId;

    /**
    * 退款金额，单位：分。备注：改字段必须大于0 和小于10000000000的整数。
    */
    @SerializedName("RefundAmt")
    @Expose
    private Long RefundAmt;

    /**
    * 第三方支付机构支付交易号
    */
    @SerializedName("ThirdChannelOrderId")
    @Expose
    private String ThirdChannelOrderId;

    /**
    * 原始支付金额，单位：分。备注：当该字段为空或者为0 时，系统会默认使用订单当 实付金额作为退款金额
    */
    @SerializedName("PayAmt")
    @Expose
    private Long PayAmt;

    /**
    * 接入环境。沙箱环境填 sandbox。
    */
    @SerializedName("Profile")
    @Expose
    private String Profile;

    /**
    * 退款原因
    */
    @SerializedName("RefundReason")
    @Expose
    private String RefundReason;

    /**
     * Get 商户代码 
     * @return MerchantId 商户代码
     */
    public String getMerchantId() {
        return this.MerchantId;
    }

    /**
     * Set 商户代码
     * @param MerchantId 商户代码
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
     * Get 正向支付商户订单号 
     * @return PayOrderId 正向支付商户订单号
     */
    public String getPayOrderId() {
        return this.PayOrderId;
    }

    /**
     * Set 正向支付商户订单号
     * @param PayOrderId 正向支付商户订单号
     */
    public void setPayOrderId(String PayOrderId) {
        this.PayOrderId = PayOrderId;
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
     * Get 退款金额，单位：分。备注：改字段必须大于0 和小于10000000000的整数。 
     * @return RefundAmt 退款金额，单位：分。备注：改字段必须大于0 和小于10000000000的整数。
     */
    public Long getRefundAmt() {
        return this.RefundAmt;
    }

    /**
     * Set 退款金额，单位：分。备注：改字段必须大于0 和小于10000000000的整数。
     * @param RefundAmt 退款金额，单位：分。备注：改字段必须大于0 和小于10000000000的整数。
     */
    public void setRefundAmt(Long RefundAmt) {
        this.RefundAmt = RefundAmt;
    }

    /**
     * Get 第三方支付机构支付交易号 
     * @return ThirdChannelOrderId 第三方支付机构支付交易号
     */
    public String getThirdChannelOrderId() {
        return this.ThirdChannelOrderId;
    }

    /**
     * Set 第三方支付机构支付交易号
     * @param ThirdChannelOrderId 第三方支付机构支付交易号
     */
    public void setThirdChannelOrderId(String ThirdChannelOrderId) {
        this.ThirdChannelOrderId = ThirdChannelOrderId;
    }

    /**
     * Get 原始支付金额，单位：分。备注：当该字段为空或者为0 时，系统会默认使用订单当 实付金额作为退款金额 
     * @return PayAmt 原始支付金额，单位：分。备注：当该字段为空或者为0 时，系统会默认使用订单当 实付金额作为退款金额
     */
    public Long getPayAmt() {
        return this.PayAmt;
    }

    /**
     * Set 原始支付金额，单位：分。备注：当该字段为空或者为0 时，系统会默认使用订单当 实付金额作为退款金额
     * @param PayAmt 原始支付金额，单位：分。备注：当该字段为空或者为0 时，系统会默认使用订单当 实付金额作为退款金额
     */
    public void setPayAmt(Long PayAmt) {
        this.PayAmt = PayAmt;
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

    /**
     * Get 退款原因 
     * @return RefundReason 退款原因
     */
    public String getRefundReason() {
        return this.RefundReason;
    }

    /**
     * Set 退款原因
     * @param RefundReason 退款原因
     */
    public void setRefundReason(String RefundReason) {
        this.RefundReason = RefundReason;
    }

    public MigrateOrderRefundRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MigrateOrderRefundRequest(MigrateOrderRefundRequest source) {
        if (source.MerchantId != null) {
            this.MerchantId = new String(source.MerchantId);
        }
        if (source.PayChannel != null) {
            this.PayChannel = new String(source.PayChannel);
        }
        if (source.PayOrderId != null) {
            this.PayOrderId = new String(source.PayOrderId);
        }
        if (source.RefundOrderId != null) {
            this.RefundOrderId = new String(source.RefundOrderId);
        }
        if (source.RefundAmt != null) {
            this.RefundAmt = new Long(source.RefundAmt);
        }
        if (source.ThirdChannelOrderId != null) {
            this.ThirdChannelOrderId = new String(source.ThirdChannelOrderId);
        }
        if (source.PayAmt != null) {
            this.PayAmt = new Long(source.PayAmt);
        }
        if (source.Profile != null) {
            this.Profile = new String(source.Profile);
        }
        if (source.RefundReason != null) {
            this.RefundReason = new String(source.RefundReason);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MerchantId", this.MerchantId);
        this.setParamSimple(map, prefix + "PayChannel", this.PayChannel);
        this.setParamSimple(map, prefix + "PayOrderId", this.PayOrderId);
        this.setParamSimple(map, prefix + "RefundOrderId", this.RefundOrderId);
        this.setParamSimple(map, prefix + "RefundAmt", this.RefundAmt);
        this.setParamSimple(map, prefix + "ThirdChannelOrderId", this.ThirdChannelOrderId);
        this.setParamSimple(map, prefix + "PayAmt", this.PayAmt);
        this.setParamSimple(map, prefix + "Profile", this.Profile);
        this.setParamSimple(map, prefix + "RefundReason", this.RefundReason);

    }
}

