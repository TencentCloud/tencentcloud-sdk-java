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

public class QueryOpenBankExternalSubAccountBookBalanceRequest extends AbstractModel{

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
    * 渠道名称。目前只支持支付宝
__TENPAY__: 商企付
__WECHAT__: 微信支付
__ALIPAY__: 支付宝
    */
    @SerializedName("ChannelName")
    @Expose
    private String ChannelName;

    /**
    * 支付方式。目前只支持安心发支付
__EBANK_PAYMENT__: ebank支付
__OPENBANK_PAYMENT__: openbank支付
__SAFT_ISV__: 安心发支付
    */
    @SerializedName("PaymentMethod")
    @Expose
    private String PaymentMethod;

    /**
    * 外部账本号ID。与ChannelAccountBookId二者选填其一。
    */
    @SerializedName("OutAccountBookId")
    @Expose
    private String OutAccountBookId;

    /**
    * 渠道账本号ID。与OutAccountBookId二者选填其一。
    */
    @SerializedName("ChannelAccountBookId")
    @Expose
    private String ChannelAccountBookId;

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
     * Get 渠道名称。目前只支持支付宝
__TENPAY__: 商企付
__WECHAT__: 微信支付
__ALIPAY__: 支付宝 
     * @return ChannelName 渠道名称。目前只支持支付宝
__TENPAY__: 商企付
__WECHAT__: 微信支付
__ALIPAY__: 支付宝
     */
    public String getChannelName() {
        return this.ChannelName;
    }

    /**
     * Set 渠道名称。目前只支持支付宝
__TENPAY__: 商企付
__WECHAT__: 微信支付
__ALIPAY__: 支付宝
     * @param ChannelName 渠道名称。目前只支持支付宝
__TENPAY__: 商企付
__WECHAT__: 微信支付
__ALIPAY__: 支付宝
     */
    public void setChannelName(String ChannelName) {
        this.ChannelName = ChannelName;
    }

    /**
     * Get 支付方式。目前只支持安心发支付
__EBANK_PAYMENT__: ebank支付
__OPENBANK_PAYMENT__: openbank支付
__SAFT_ISV__: 安心发支付 
     * @return PaymentMethod 支付方式。目前只支持安心发支付
__EBANK_PAYMENT__: ebank支付
__OPENBANK_PAYMENT__: openbank支付
__SAFT_ISV__: 安心发支付
     */
    public String getPaymentMethod() {
        return this.PaymentMethod;
    }

    /**
     * Set 支付方式。目前只支持安心发支付
__EBANK_PAYMENT__: ebank支付
__OPENBANK_PAYMENT__: openbank支付
__SAFT_ISV__: 安心发支付
     * @param PaymentMethod 支付方式。目前只支持安心发支付
__EBANK_PAYMENT__: ebank支付
__OPENBANK_PAYMENT__: openbank支付
__SAFT_ISV__: 安心发支付
     */
    public void setPaymentMethod(String PaymentMethod) {
        this.PaymentMethod = PaymentMethod;
    }

    /**
     * Get 外部账本号ID。与ChannelAccountBookId二者选填其一。 
     * @return OutAccountBookId 外部账本号ID。与ChannelAccountBookId二者选填其一。
     */
    public String getOutAccountBookId() {
        return this.OutAccountBookId;
    }

    /**
     * Set 外部账本号ID。与ChannelAccountBookId二者选填其一。
     * @param OutAccountBookId 外部账本号ID。与ChannelAccountBookId二者选填其一。
     */
    public void setOutAccountBookId(String OutAccountBookId) {
        this.OutAccountBookId = OutAccountBookId;
    }

    /**
     * Get 渠道账本号ID。与OutAccountBookId二者选填其一。 
     * @return ChannelAccountBookId 渠道账本号ID。与OutAccountBookId二者选填其一。
     */
    public String getChannelAccountBookId() {
        return this.ChannelAccountBookId;
    }

    /**
     * Set 渠道账本号ID。与OutAccountBookId二者选填其一。
     * @param ChannelAccountBookId 渠道账本号ID。与OutAccountBookId二者选填其一。
     */
    public void setChannelAccountBookId(String ChannelAccountBookId) {
        this.ChannelAccountBookId = ChannelAccountBookId;
    }

    public QueryOpenBankExternalSubAccountBookBalanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryOpenBankExternalSubAccountBookBalanceRequest(QueryOpenBankExternalSubAccountBookBalanceRequest source) {
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
        if (source.OutAccountBookId != null) {
            this.OutAccountBookId = new String(source.OutAccountBookId);
        }
        if (source.ChannelAccountBookId != null) {
            this.ChannelAccountBookId = new String(source.ChannelAccountBookId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChannelMerchantId", this.ChannelMerchantId);
        this.setParamSimple(map, prefix + "ChannelSubMerchantId", this.ChannelSubMerchantId);
        this.setParamSimple(map, prefix + "ChannelName", this.ChannelName);
        this.setParamSimple(map, prefix + "PaymentMethod", this.PaymentMethod);
        this.setParamSimple(map, prefix + "OutAccountBookId", this.OutAccountBookId);
        this.setParamSimple(map, prefix + "ChannelAccountBookId", this.ChannelAccountBookId);

    }
}

