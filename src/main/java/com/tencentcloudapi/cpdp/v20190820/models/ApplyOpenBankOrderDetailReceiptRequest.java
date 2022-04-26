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

public class ApplyOpenBankOrderDetailReceiptRequest extends AbstractModel{

    /**
    * 外部回单申请编号
    */
    @SerializedName("OutApplyId")
    @Expose
    private String OutApplyId;

    /**
    * 渠道商户ID
    */
    @SerializedName("ChannelMerchantId")
    @Expose
    private String ChannelMerchantId;

    /**
    * 渠道子商户ID
    */
    @SerializedName("ChannelSubMerchantId")
    @Expose
    private String ChannelSubMerchantId;

    /**
    * 渠道名称，目前只支持ALIPAY
    */
    @SerializedName("ChannelName")
    @Expose
    private String ChannelName;

    /**
    * 支付方式，目前只支持SAFT_ISV
    */
    @SerializedName("PaymentMethod")
    @Expose
    private String PaymentMethod;

    /**
    * 云企付平台订单号
    */
    @SerializedName("ChannelOrderId")
    @Expose
    private String ChannelOrderId;

    /**
     * Get 外部回单申请编号 
     * @return OutApplyId 外部回单申请编号
     */
    public String getOutApplyId() {
        return this.OutApplyId;
    }

    /**
     * Set 外部回单申请编号
     * @param OutApplyId 外部回单申请编号
     */
    public void setOutApplyId(String OutApplyId) {
        this.OutApplyId = OutApplyId;
    }

    /**
     * Get 渠道商户ID 
     * @return ChannelMerchantId 渠道商户ID
     */
    public String getChannelMerchantId() {
        return this.ChannelMerchantId;
    }

    /**
     * Set 渠道商户ID
     * @param ChannelMerchantId 渠道商户ID
     */
    public void setChannelMerchantId(String ChannelMerchantId) {
        this.ChannelMerchantId = ChannelMerchantId;
    }

    /**
     * Get 渠道子商户ID 
     * @return ChannelSubMerchantId 渠道子商户ID
     */
    public String getChannelSubMerchantId() {
        return this.ChannelSubMerchantId;
    }

    /**
     * Set 渠道子商户ID
     * @param ChannelSubMerchantId 渠道子商户ID
     */
    public void setChannelSubMerchantId(String ChannelSubMerchantId) {
        this.ChannelSubMerchantId = ChannelSubMerchantId;
    }

    /**
     * Get 渠道名称，目前只支持ALIPAY 
     * @return ChannelName 渠道名称，目前只支持ALIPAY
     */
    public String getChannelName() {
        return this.ChannelName;
    }

    /**
     * Set 渠道名称，目前只支持ALIPAY
     * @param ChannelName 渠道名称，目前只支持ALIPAY
     */
    public void setChannelName(String ChannelName) {
        this.ChannelName = ChannelName;
    }

    /**
     * Get 支付方式，目前只支持SAFT_ISV 
     * @return PaymentMethod 支付方式，目前只支持SAFT_ISV
     */
    public String getPaymentMethod() {
        return this.PaymentMethod;
    }

    /**
     * Set 支付方式，目前只支持SAFT_ISV
     * @param PaymentMethod 支付方式，目前只支持SAFT_ISV
     */
    public void setPaymentMethod(String PaymentMethod) {
        this.PaymentMethod = PaymentMethod;
    }

    /**
     * Get 云企付平台订单号 
     * @return ChannelOrderId 云企付平台订单号
     */
    public String getChannelOrderId() {
        return this.ChannelOrderId;
    }

    /**
     * Set 云企付平台订单号
     * @param ChannelOrderId 云企付平台订单号
     */
    public void setChannelOrderId(String ChannelOrderId) {
        this.ChannelOrderId = ChannelOrderId;
    }

    public ApplyOpenBankOrderDetailReceiptRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApplyOpenBankOrderDetailReceiptRequest(ApplyOpenBankOrderDetailReceiptRequest source) {
        if (source.OutApplyId != null) {
            this.OutApplyId = new String(source.OutApplyId);
        }
        if (source.ChannelMerchantId != null) {
            this.ChannelMerchantId = new String(source.ChannelMerchantId);
        }
        if (source.ChannelSubMerchantId != null) {
            this.ChannelSubMerchantId = new String(source.ChannelSubMerchantId);
        }
        if (source.ChannelName != null) {
            this.ChannelName = new String(source.ChannelName);
        }
        if (source.PaymentMethod != null) {
            this.PaymentMethod = new String(source.PaymentMethod);
        }
        if (source.ChannelOrderId != null) {
            this.ChannelOrderId = new String(source.ChannelOrderId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OutApplyId", this.OutApplyId);
        this.setParamSimple(map, prefix + "ChannelMerchantId", this.ChannelMerchantId);
        this.setParamSimple(map, prefix + "ChannelSubMerchantId", this.ChannelSubMerchantId);
        this.setParamSimple(map, prefix + "ChannelName", this.ChannelName);
        this.setParamSimple(map, prefix + "PaymentMethod", this.PaymentMethod);
        this.setParamSimple(map, prefix + "ChannelOrderId", this.ChannelOrderId);

    }
}

