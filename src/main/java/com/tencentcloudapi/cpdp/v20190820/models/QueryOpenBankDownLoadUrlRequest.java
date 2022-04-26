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

public class QueryOpenBankDownLoadUrlRequest extends AbstractModel{

    /**
    * 渠道商户号，外部接入平台方入驻云企付平台后下发。
EBANK_PAYMENT支付方式下，填写渠道商户号；
SAFT_ISV支付方式下，填写渠道子商户号。
    */
    @SerializedName("ChannelMerchantId")
    @Expose
    private String ChannelMerchantId;

    /**
    * 账单日期,yyyy-MM-dd。
    */
    @SerializedName("BillDate")
    @Expose
    private String BillDate;

    /**
    * 账单类型，默认交易账单。
    */
    @SerializedName("BillType")
    @Expose
    private String BillType;

    /**
    * 接入环境。沙箱环境填 sandbox。缺省默认调用生产环境。
    */
    @SerializedName("Environment")
    @Expose
    private String Environment;

    /**
    * 渠道名称。不填默认为商企付。
__TENPAY__: 商企付
__WECHAT__: 微信支付
__ALIPAY__: 支付宝
    */
    @SerializedName("ChannelName")
    @Expose
    private String ChannelName;

    /**
    * 支付方式。不填默认为ebank支付。
__EBANK_PAYMENT__: ebank支付
__OPENBANK_PAYMENT__: openbank支付
__SAFT_ISV__: 人资ISV支付
    */
    @SerializedName("PaymentMethod")
    @Expose
    private String PaymentMethod;

    /**
     * Get 渠道商户号，外部接入平台方入驻云企付平台后下发。
EBANK_PAYMENT支付方式下，填写渠道商户号；
SAFT_ISV支付方式下，填写渠道子商户号。 
     * @return ChannelMerchantId 渠道商户号，外部接入平台方入驻云企付平台后下发。
EBANK_PAYMENT支付方式下，填写渠道商户号；
SAFT_ISV支付方式下，填写渠道子商户号。
     */
    public String getChannelMerchantId() {
        return this.ChannelMerchantId;
    }

    /**
     * Set 渠道商户号，外部接入平台方入驻云企付平台后下发。
EBANK_PAYMENT支付方式下，填写渠道商户号；
SAFT_ISV支付方式下，填写渠道子商户号。
     * @param ChannelMerchantId 渠道商户号，外部接入平台方入驻云企付平台后下发。
EBANK_PAYMENT支付方式下，填写渠道商户号；
SAFT_ISV支付方式下，填写渠道子商户号。
     */
    public void setChannelMerchantId(String ChannelMerchantId) {
        this.ChannelMerchantId = ChannelMerchantId;
    }

    /**
     * Get 账单日期,yyyy-MM-dd。 
     * @return BillDate 账单日期,yyyy-MM-dd。
     */
    public String getBillDate() {
        return this.BillDate;
    }

    /**
     * Set 账单日期,yyyy-MM-dd。
     * @param BillDate 账单日期,yyyy-MM-dd。
     */
    public void setBillDate(String BillDate) {
        this.BillDate = BillDate;
    }

    /**
     * Get 账单类型，默认交易账单。 
     * @return BillType 账单类型，默认交易账单。
     */
    public String getBillType() {
        return this.BillType;
    }

    /**
     * Set 账单类型，默认交易账单。
     * @param BillType 账单类型，默认交易账单。
     */
    public void setBillType(String BillType) {
        this.BillType = BillType;
    }

    /**
     * Get 接入环境。沙箱环境填 sandbox。缺省默认调用生产环境。 
     * @return Environment 接入环境。沙箱环境填 sandbox。缺省默认调用生产环境。
     */
    public String getEnvironment() {
        return this.Environment;
    }

    /**
     * Set 接入环境。沙箱环境填 sandbox。缺省默认调用生产环境。
     * @param Environment 接入环境。沙箱环境填 sandbox。缺省默认调用生产环境。
     */
    public void setEnvironment(String Environment) {
        this.Environment = Environment;
    }

    /**
     * Get 渠道名称。不填默认为商企付。
__TENPAY__: 商企付
__WECHAT__: 微信支付
__ALIPAY__: 支付宝 
     * @return ChannelName 渠道名称。不填默认为商企付。
__TENPAY__: 商企付
__WECHAT__: 微信支付
__ALIPAY__: 支付宝
     */
    public String getChannelName() {
        return this.ChannelName;
    }

    /**
     * Set 渠道名称。不填默认为商企付。
__TENPAY__: 商企付
__WECHAT__: 微信支付
__ALIPAY__: 支付宝
     * @param ChannelName 渠道名称。不填默认为商企付。
__TENPAY__: 商企付
__WECHAT__: 微信支付
__ALIPAY__: 支付宝
     */
    public void setChannelName(String ChannelName) {
        this.ChannelName = ChannelName;
    }

    /**
     * Get 支付方式。不填默认为ebank支付。
__EBANK_PAYMENT__: ebank支付
__OPENBANK_PAYMENT__: openbank支付
__SAFT_ISV__: 人资ISV支付 
     * @return PaymentMethod 支付方式。不填默认为ebank支付。
__EBANK_PAYMENT__: ebank支付
__OPENBANK_PAYMENT__: openbank支付
__SAFT_ISV__: 人资ISV支付
     */
    public String getPaymentMethod() {
        return this.PaymentMethod;
    }

    /**
     * Set 支付方式。不填默认为ebank支付。
__EBANK_PAYMENT__: ebank支付
__OPENBANK_PAYMENT__: openbank支付
__SAFT_ISV__: 人资ISV支付
     * @param PaymentMethod 支付方式。不填默认为ebank支付。
__EBANK_PAYMENT__: ebank支付
__OPENBANK_PAYMENT__: openbank支付
__SAFT_ISV__: 人资ISV支付
     */
    public void setPaymentMethod(String PaymentMethod) {
        this.PaymentMethod = PaymentMethod;
    }

    public QueryOpenBankDownLoadUrlRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryOpenBankDownLoadUrlRequest(QueryOpenBankDownLoadUrlRequest source) {
        if (source.ChannelMerchantId != null) {
            this.ChannelMerchantId = new String(source.ChannelMerchantId);
        }
        if (source.BillDate != null) {
            this.BillDate = new String(source.BillDate);
        }
        if (source.BillType != null) {
            this.BillType = new String(source.BillType);
        }
        if (source.Environment != null) {
            this.Environment = new String(source.Environment);
        }
        if (source.ChannelName != null) {
            this.ChannelName = new String(source.ChannelName);
        }
        if (source.PaymentMethod != null) {
            this.PaymentMethod = new String(source.PaymentMethod);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChannelMerchantId", this.ChannelMerchantId);
        this.setParamSimple(map, prefix + "BillDate", this.BillDate);
        this.setParamSimple(map, prefix + "BillType", this.BillType);
        this.setParamSimple(map, prefix + "Environment", this.Environment);
        this.setParamSimple(map, prefix + "ChannelName", this.ChannelName);
        this.setParamSimple(map, prefix + "PaymentMethod", this.PaymentMethod);

    }
}

