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

public class QueryOpenBankSubMerchantRateConfigureRequest extends AbstractModel{

    /**
    * 渠道进件序列号。
    */
    @SerializedName("ChannelRegistrationNo")
    @Expose
    private String ChannelRegistrationNo;

    /**
    * 渠道商户ID。
    */
    @SerializedName("ChannelMerchantId")
    @Expose
    private String ChannelMerchantId;

    /**
    * 渠道子商户ID。
    */
    @SerializedName("ChannelSubMerchantId")
    @Expose
    private String ChannelSubMerchantId;

    /**
    * 渠道名称。详见附录-云企付枚举类说明-ChannelName。
TENPAY: 商企付
WECHAT: 微信支付
ALIPAY: 支付宝
HELIPAY:合利宝
    */
    @SerializedName("ChannelName")
    @Expose
    private String ChannelName;

    /**
    * 渠道产品费率序列号。与外部产品费率序列号二者选填其一。
    */
    @SerializedName("ChannelProductFeeNo")
    @Expose
    private String ChannelProductFeeNo;

    /**
    * 外部产品费率序列号。与渠道产品费率序列号二者选填其一。
    */
    @SerializedName("OutProductFeeNo")
    @Expose
    private String OutProductFeeNo;

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
     * Get 渠道进件序列号。 
     * @return ChannelRegistrationNo 渠道进件序列号。
     */
    public String getChannelRegistrationNo() {
        return this.ChannelRegistrationNo;
    }

    /**
     * Set 渠道进件序列号。
     * @param ChannelRegistrationNo 渠道进件序列号。
     */
    public void setChannelRegistrationNo(String ChannelRegistrationNo) {
        this.ChannelRegistrationNo = ChannelRegistrationNo;
    }

    /**
     * Get 渠道商户ID。 
     * @return ChannelMerchantId 渠道商户ID。
     */
    public String getChannelMerchantId() {
        return this.ChannelMerchantId;
    }

    /**
     * Set 渠道商户ID。
     * @param ChannelMerchantId 渠道商户ID。
     */
    public void setChannelMerchantId(String ChannelMerchantId) {
        this.ChannelMerchantId = ChannelMerchantId;
    }

    /**
     * Get 渠道子商户ID。 
     * @return ChannelSubMerchantId 渠道子商户ID。
     */
    public String getChannelSubMerchantId() {
        return this.ChannelSubMerchantId;
    }

    /**
     * Set 渠道子商户ID。
     * @param ChannelSubMerchantId 渠道子商户ID。
     */
    public void setChannelSubMerchantId(String ChannelSubMerchantId) {
        this.ChannelSubMerchantId = ChannelSubMerchantId;
    }

    /**
     * Get 渠道名称。详见附录-云企付枚举类说明-ChannelName。
TENPAY: 商企付
WECHAT: 微信支付
ALIPAY: 支付宝
HELIPAY:合利宝 
     * @return ChannelName 渠道名称。详见附录-云企付枚举类说明-ChannelName。
TENPAY: 商企付
WECHAT: 微信支付
ALIPAY: 支付宝
HELIPAY:合利宝
     */
    public String getChannelName() {
        return this.ChannelName;
    }

    /**
     * Set 渠道名称。详见附录-云企付枚举类说明-ChannelName。
TENPAY: 商企付
WECHAT: 微信支付
ALIPAY: 支付宝
HELIPAY:合利宝
     * @param ChannelName 渠道名称。详见附录-云企付枚举类说明-ChannelName。
TENPAY: 商企付
WECHAT: 微信支付
ALIPAY: 支付宝
HELIPAY:合利宝
     */
    public void setChannelName(String ChannelName) {
        this.ChannelName = ChannelName;
    }

    /**
     * Get 渠道产品费率序列号。与外部产品费率序列号二者选填其一。 
     * @return ChannelProductFeeNo 渠道产品费率序列号。与外部产品费率序列号二者选填其一。
     */
    public String getChannelProductFeeNo() {
        return this.ChannelProductFeeNo;
    }

    /**
     * Set 渠道产品费率序列号。与外部产品费率序列号二者选填其一。
     * @param ChannelProductFeeNo 渠道产品费率序列号。与外部产品费率序列号二者选填其一。
     */
    public void setChannelProductFeeNo(String ChannelProductFeeNo) {
        this.ChannelProductFeeNo = ChannelProductFeeNo;
    }

    /**
     * Get 外部产品费率序列号。与渠道产品费率序列号二者选填其一。 
     * @return OutProductFeeNo 外部产品费率序列号。与渠道产品费率序列号二者选填其一。
     */
    public String getOutProductFeeNo() {
        return this.OutProductFeeNo;
    }

    /**
     * Set 外部产品费率序列号。与渠道产品费率序列号二者选填其一。
     * @param OutProductFeeNo 外部产品费率序列号。与渠道产品费率序列号二者选填其一。
     */
    public void setOutProductFeeNo(String OutProductFeeNo) {
        this.OutProductFeeNo = OutProductFeeNo;
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

    public QueryOpenBankSubMerchantRateConfigureRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryOpenBankSubMerchantRateConfigureRequest(QueryOpenBankSubMerchantRateConfigureRequest source) {
        if (source.ChannelRegistrationNo != null) {
            this.ChannelRegistrationNo = new String(source.ChannelRegistrationNo);
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
        if (source.ChannelProductFeeNo != null) {
            this.ChannelProductFeeNo = new String(source.ChannelProductFeeNo);
        }
        if (source.OutProductFeeNo != null) {
            this.OutProductFeeNo = new String(source.OutProductFeeNo);
        }
        if (source.Environment != null) {
            this.Environment = new String(source.Environment);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChannelRegistrationNo", this.ChannelRegistrationNo);
        this.setParamSimple(map, prefix + "ChannelMerchantId", this.ChannelMerchantId);
        this.setParamSimple(map, prefix + "ChannelSubMerchantId", this.ChannelSubMerchantId);
        this.setParamSimple(map, prefix + "ChannelName", this.ChannelName);
        this.setParamSimple(map, prefix + "ChannelProductFeeNo", this.ChannelProductFeeNo);
        this.setParamSimple(map, prefix + "OutProductFeeNo", this.OutProductFeeNo);
        this.setParamSimple(map, prefix + "Environment", this.Environment);

    }
}

