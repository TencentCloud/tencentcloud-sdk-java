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

public class QueryOpenBankDailyReceiptDownloadUrlRequest extends AbstractModel{

    /**
    * 云企付渠道商户号。外部接入平台入驻云企付平台后下发。
    */
    @SerializedName("ChannelMerchantId")
    @Expose
    private String ChannelMerchantId;

    /**
    * 云企付渠道子商户号。入驻在渠道商户下的子商户ID，如付款方的商户ID，对应创建支付订单中接口参数中的PayerInfo中的payerId。
    */
    @SerializedName("ChannelSubMerchantId")
    @Expose
    private String ChannelSubMerchantId;

    /**
    * 渠道名称。
__TENPAY__: 商企付
__WECHAT__: 微信支付
__ALIPAY__: 支付宝
    */
    @SerializedName("ChannelName")
    @Expose
    private String ChannelName;

    /**
    * 付款方式。如
__EBANK_PAYMENT__:ebank付款
__OPENBANK_PAYMENT__: openbank付款
    */
    @SerializedName("PaymentMethod")
    @Expose
    private String PaymentMethod;

    /**
    * 绑卡序列号，银行卡唯一标记，资金账户ID，用于区分商户绑定多卡或多账户场景
    */
    @SerializedName("BindSerialNo")
    @Expose
    private String BindSerialNo;

    /**
    * 查询日期，D日查询D-1日的回单文件
    */
    @SerializedName("QueryDate")
    @Expose
    private String QueryDate;

    /**
    * 环境类型
release:生产环境
sandbox:沙箱环境
缺省默认为生产环境
    */
    @SerializedName("Environment")
    @Expose
    private String Environment;

    /**
     * Get 云企付渠道商户号。外部接入平台入驻云企付平台后下发。 
     * @return ChannelMerchantId 云企付渠道商户号。外部接入平台入驻云企付平台后下发。
     */
    public String getChannelMerchantId() {
        return this.ChannelMerchantId;
    }

    /**
     * Set 云企付渠道商户号。外部接入平台入驻云企付平台后下发。
     * @param ChannelMerchantId 云企付渠道商户号。外部接入平台入驻云企付平台后下发。
     */
    public void setChannelMerchantId(String ChannelMerchantId) {
        this.ChannelMerchantId = ChannelMerchantId;
    }

    /**
     * Get 云企付渠道子商户号。入驻在渠道商户下的子商户ID，如付款方的商户ID，对应创建支付订单中接口参数中的PayerInfo中的payerId。 
     * @return ChannelSubMerchantId 云企付渠道子商户号。入驻在渠道商户下的子商户ID，如付款方的商户ID，对应创建支付订单中接口参数中的PayerInfo中的payerId。
     */
    public String getChannelSubMerchantId() {
        return this.ChannelSubMerchantId;
    }

    /**
     * Set 云企付渠道子商户号。入驻在渠道商户下的子商户ID，如付款方的商户ID，对应创建支付订单中接口参数中的PayerInfo中的payerId。
     * @param ChannelSubMerchantId 云企付渠道子商户号。入驻在渠道商户下的子商户ID，如付款方的商户ID，对应创建支付订单中接口参数中的PayerInfo中的payerId。
     */
    public void setChannelSubMerchantId(String ChannelSubMerchantId) {
        this.ChannelSubMerchantId = ChannelSubMerchantId;
    }

    /**
     * Get 渠道名称。
__TENPAY__: 商企付
__WECHAT__: 微信支付
__ALIPAY__: 支付宝 
     * @return ChannelName 渠道名称。
__TENPAY__: 商企付
__WECHAT__: 微信支付
__ALIPAY__: 支付宝
     */
    public String getChannelName() {
        return this.ChannelName;
    }

    /**
     * Set 渠道名称。
__TENPAY__: 商企付
__WECHAT__: 微信支付
__ALIPAY__: 支付宝
     * @param ChannelName 渠道名称。
__TENPAY__: 商企付
__WECHAT__: 微信支付
__ALIPAY__: 支付宝
     */
    public void setChannelName(String ChannelName) {
        this.ChannelName = ChannelName;
    }

    /**
     * Get 付款方式。如
__EBANK_PAYMENT__:ebank付款
__OPENBANK_PAYMENT__: openbank付款 
     * @return PaymentMethod 付款方式。如
__EBANK_PAYMENT__:ebank付款
__OPENBANK_PAYMENT__: openbank付款
     */
    public String getPaymentMethod() {
        return this.PaymentMethod;
    }

    /**
     * Set 付款方式。如
__EBANK_PAYMENT__:ebank付款
__OPENBANK_PAYMENT__: openbank付款
     * @param PaymentMethod 付款方式。如
__EBANK_PAYMENT__:ebank付款
__OPENBANK_PAYMENT__: openbank付款
     */
    public void setPaymentMethod(String PaymentMethod) {
        this.PaymentMethod = PaymentMethod;
    }

    /**
     * Get 绑卡序列号，银行卡唯一标记，资金账户ID，用于区分商户绑定多卡或多账户场景 
     * @return BindSerialNo 绑卡序列号，银行卡唯一标记，资金账户ID，用于区分商户绑定多卡或多账户场景
     */
    public String getBindSerialNo() {
        return this.BindSerialNo;
    }

    /**
     * Set 绑卡序列号，银行卡唯一标记，资金账户ID，用于区分商户绑定多卡或多账户场景
     * @param BindSerialNo 绑卡序列号，银行卡唯一标记，资金账户ID，用于区分商户绑定多卡或多账户场景
     */
    public void setBindSerialNo(String BindSerialNo) {
        this.BindSerialNo = BindSerialNo;
    }

    /**
     * Get 查询日期，D日查询D-1日的回单文件 
     * @return QueryDate 查询日期，D日查询D-1日的回单文件
     */
    public String getQueryDate() {
        return this.QueryDate;
    }

    /**
     * Set 查询日期，D日查询D-1日的回单文件
     * @param QueryDate 查询日期，D日查询D-1日的回单文件
     */
    public void setQueryDate(String QueryDate) {
        this.QueryDate = QueryDate;
    }

    /**
     * Get 环境类型
release:生产环境
sandbox:沙箱环境
缺省默认为生产环境 
     * @return Environment 环境类型
release:生产环境
sandbox:沙箱环境
缺省默认为生产环境
     */
    public String getEnvironment() {
        return this.Environment;
    }

    /**
     * Set 环境类型
release:生产环境
sandbox:沙箱环境
缺省默认为生产环境
     * @param Environment 环境类型
release:生产环境
sandbox:沙箱环境
缺省默认为生产环境
     */
    public void setEnvironment(String Environment) {
        this.Environment = Environment;
    }

    public QueryOpenBankDailyReceiptDownloadUrlRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryOpenBankDailyReceiptDownloadUrlRequest(QueryOpenBankDailyReceiptDownloadUrlRequest source) {
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
        if (source.BindSerialNo != null) {
            this.BindSerialNo = new String(source.BindSerialNo);
        }
        if (source.QueryDate != null) {
            this.QueryDate = new String(source.QueryDate);
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
        this.setParamSimple(map, prefix + "ChannelSubMerchantId", this.ChannelSubMerchantId);
        this.setParamSimple(map, prefix + "ChannelName", this.ChannelName);
        this.setParamSimple(map, prefix + "PaymentMethod", this.PaymentMethod);
        this.setParamSimple(map, prefix + "BindSerialNo", this.BindSerialNo);
        this.setParamSimple(map, prefix + "QueryDate", this.QueryDate);
        this.setParamSimple(map, prefix + "Environment", this.Environment);

    }
}

