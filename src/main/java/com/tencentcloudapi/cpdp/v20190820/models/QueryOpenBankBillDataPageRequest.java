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

public class QueryOpenBankBillDataPageRequest extends AbstractModel{

    /**
    * 渠道商户号，外部接入平台方入驻云企付平台后下发。
EBANK_PAYMENT支付方式下，填写渠道商户号；
SAFT_ISV支付方式下，填写渠道子商户号;
HELIPAY渠道下，填写渠道子商户号。
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
    * 渠道名称。详见附录-云企付枚举类说明-ChannelName。
__TENPAY__: 商企付
__WECHAT__: 微信支付
__ALIPAY__: 支付宝
HELIPAY：合利宝
    */
    @SerializedName("ChannelName")
    @Expose
    private String ChannelName;

    /**
    * 分页页码。
    */
    @SerializedName("PageNo")
    @Expose
    private Long PageNo;

    /**
    * 分页大小，最大1000。
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 账单类型，默认交易账单。
    */
    @SerializedName("BillType")
    @Expose
    private String BillType;

    /**
    * 支付方式。详见附录-云企付枚举类说明-PaymentMethod。
    */
    @SerializedName("PaymentMethod")
    @Expose
    private String PaymentMethod;

    /**
    * 环境类型。
__release__:生产环境
__sandbox__:沙箱环境
_不填默认为生产环境_
    */
    @SerializedName("Environment")
    @Expose
    private String Environment;

    /**
     * Get 渠道商户号，外部接入平台方入驻云企付平台后下发。
EBANK_PAYMENT支付方式下，填写渠道商户号；
SAFT_ISV支付方式下，填写渠道子商户号;
HELIPAY渠道下，填写渠道子商户号。 
     * @return ChannelMerchantId 渠道商户号，外部接入平台方入驻云企付平台后下发。
EBANK_PAYMENT支付方式下，填写渠道商户号；
SAFT_ISV支付方式下，填写渠道子商户号;
HELIPAY渠道下，填写渠道子商户号。
     */
    public String getChannelMerchantId() {
        return this.ChannelMerchantId;
    }

    /**
     * Set 渠道商户号，外部接入平台方入驻云企付平台后下发。
EBANK_PAYMENT支付方式下，填写渠道商户号；
SAFT_ISV支付方式下，填写渠道子商户号;
HELIPAY渠道下，填写渠道子商户号。
     * @param ChannelMerchantId 渠道商户号，外部接入平台方入驻云企付平台后下发。
EBANK_PAYMENT支付方式下，填写渠道商户号；
SAFT_ISV支付方式下，填写渠道子商户号;
HELIPAY渠道下，填写渠道子商户号。
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
     * Get 渠道名称。详见附录-云企付枚举类说明-ChannelName。
__TENPAY__: 商企付
__WECHAT__: 微信支付
__ALIPAY__: 支付宝
HELIPAY：合利宝 
     * @return ChannelName 渠道名称。详见附录-云企付枚举类说明-ChannelName。
__TENPAY__: 商企付
__WECHAT__: 微信支付
__ALIPAY__: 支付宝
HELIPAY：合利宝
     */
    public String getChannelName() {
        return this.ChannelName;
    }

    /**
     * Set 渠道名称。详见附录-云企付枚举类说明-ChannelName。
__TENPAY__: 商企付
__WECHAT__: 微信支付
__ALIPAY__: 支付宝
HELIPAY：合利宝
     * @param ChannelName 渠道名称。详见附录-云企付枚举类说明-ChannelName。
__TENPAY__: 商企付
__WECHAT__: 微信支付
__ALIPAY__: 支付宝
HELIPAY：合利宝
     */
    public void setChannelName(String ChannelName) {
        this.ChannelName = ChannelName;
    }

    /**
     * Get 分页页码。 
     * @return PageNo 分页页码。
     */
    public Long getPageNo() {
        return this.PageNo;
    }

    /**
     * Set 分页页码。
     * @param PageNo 分页页码。
     */
    public void setPageNo(Long PageNo) {
        this.PageNo = PageNo;
    }

    /**
     * Get 分页大小，最大1000。 
     * @return PageSize 分页大小，最大1000。
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 分页大小，最大1000。
     * @param PageSize 分页大小，最大1000。
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
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
     * Get 支付方式。详见附录-云企付枚举类说明-PaymentMethod。 
     * @return PaymentMethod 支付方式。详见附录-云企付枚举类说明-PaymentMethod。
     */
    public String getPaymentMethod() {
        return this.PaymentMethod;
    }

    /**
     * Set 支付方式。详见附录-云企付枚举类说明-PaymentMethod。
     * @param PaymentMethod 支付方式。详见附录-云企付枚举类说明-PaymentMethod。
     */
    public void setPaymentMethod(String PaymentMethod) {
        this.PaymentMethod = PaymentMethod;
    }

    /**
     * Get 环境类型。
__release__:生产环境
__sandbox__:沙箱环境
_不填默认为生产环境_ 
     * @return Environment 环境类型。
__release__:生产环境
__sandbox__:沙箱环境
_不填默认为生产环境_
     */
    public String getEnvironment() {
        return this.Environment;
    }

    /**
     * Set 环境类型。
__release__:生产环境
__sandbox__:沙箱环境
_不填默认为生产环境_
     * @param Environment 环境类型。
__release__:生产环境
__sandbox__:沙箱环境
_不填默认为生产环境_
     */
    public void setEnvironment(String Environment) {
        this.Environment = Environment;
    }

    public QueryOpenBankBillDataPageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryOpenBankBillDataPageRequest(QueryOpenBankBillDataPageRequest source) {
        if (source.ChannelMerchantId != null) {
            this.ChannelMerchantId = new String(source.ChannelMerchantId);
        }
        if (source.BillDate != null) {
            this.BillDate = new String(source.BillDate);
        }
        if (source.ChannelName != null) {
            this.ChannelName = new String(source.ChannelName);
        }
        if (source.PageNo != null) {
            this.PageNo = new Long(source.PageNo);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.BillType != null) {
            this.BillType = new String(source.BillType);
        }
        if (source.PaymentMethod != null) {
            this.PaymentMethod = new String(source.PaymentMethod);
        }
        if (source.Environment != null) {
            this.Environment = new String(source.Environment);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChannelMerchantId", this.ChannelMerchantId);
        this.setParamSimple(map, prefix + "BillDate", this.BillDate);
        this.setParamSimple(map, prefix + "ChannelName", this.ChannelName);
        this.setParamSimple(map, prefix + "PageNo", this.PageNo);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "BillType", this.BillType);
        this.setParamSimple(map, prefix + "PaymentMethod", this.PaymentMethod);
        this.setParamSimple(map, prefix + "Environment", this.Environment);

    }
}

