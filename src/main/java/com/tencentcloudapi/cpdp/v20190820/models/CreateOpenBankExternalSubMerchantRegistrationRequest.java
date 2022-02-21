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

public class CreateOpenBankExternalSubMerchantRegistrationRequest extends AbstractModel{

    /**
    * 外部进件序列号。
    */
    @SerializedName("OutRegistrationNo")
    @Expose
    private String OutRegistrationNo;

    /**
    * 渠道商户ID。
    */
    @SerializedName("ChannelMerchantId")
    @Expose
    private String ChannelMerchantId;

    /**
    * 外部子商户ID,平台侧商户唯一ID。
    */
    @SerializedName("OutSubMerchantId")
    @Expose
    private String OutSubMerchantId;

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
    * 支付方式。
__EBANK_PAYMENT__: ebank支付
__OPENBANK_PAYMENT__: openbank支付
    */
    @SerializedName("PaymentMethod")
    @Expose
    private String PaymentMethod;

    /**
    * 社会信用代码。
    */
    @SerializedName("BusinessLicenseNumber")
    @Expose
    private String BusinessLicenseNumber;

    /**
    * 外部子商户名称。
    */
    @SerializedName("OutSubMerchantName")
    @Expose
    private String OutSubMerchantName;

    /**
    * 法人姓名。
    */
    @SerializedName("LegalName")
    @Expose
    private String LegalName;

    /**
    * 外部子商户简称。
    */
    @SerializedName("OutSubMerchantShortName")
    @Expose
    private String OutSubMerchantShortName;

    /**
    * 外部子商户描述。
    */
    @SerializedName("OutSubMerchantDescription")
    @Expose
    private String OutSubMerchantDescription;

    /**
    * 第三方子商户进件信息，为JSON格式字符串。详情见附录-复杂类型。
    */
    @SerializedName("ExternalSubMerchantRegistrationData")
    @Expose
    private String ExternalSubMerchantRegistrationData;

    /**
    * 通知地址。
    */
    @SerializedName("NotifyUrl")
    @Expose
    private String NotifyUrl;

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
     * Get 外部进件序列号。 
     * @return OutRegistrationNo 外部进件序列号。
     */
    public String getOutRegistrationNo() {
        return this.OutRegistrationNo;
    }

    /**
     * Set 外部进件序列号。
     * @param OutRegistrationNo 外部进件序列号。
     */
    public void setOutRegistrationNo(String OutRegistrationNo) {
        this.OutRegistrationNo = OutRegistrationNo;
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
     * Get 外部子商户ID,平台侧商户唯一ID。 
     * @return OutSubMerchantId 外部子商户ID,平台侧商户唯一ID。
     */
    public String getOutSubMerchantId() {
        return this.OutSubMerchantId;
    }

    /**
     * Set 外部子商户ID,平台侧商户唯一ID。
     * @param OutSubMerchantId 外部子商户ID,平台侧商户唯一ID。
     */
    public void setOutSubMerchantId(String OutSubMerchantId) {
        this.OutSubMerchantId = OutSubMerchantId;
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
     * Get 支付方式。
__EBANK_PAYMENT__: ebank支付
__OPENBANK_PAYMENT__: openbank支付 
     * @return PaymentMethod 支付方式。
__EBANK_PAYMENT__: ebank支付
__OPENBANK_PAYMENT__: openbank支付
     */
    public String getPaymentMethod() {
        return this.PaymentMethod;
    }

    /**
     * Set 支付方式。
__EBANK_PAYMENT__: ebank支付
__OPENBANK_PAYMENT__: openbank支付
     * @param PaymentMethod 支付方式。
__EBANK_PAYMENT__: ebank支付
__OPENBANK_PAYMENT__: openbank支付
     */
    public void setPaymentMethod(String PaymentMethod) {
        this.PaymentMethod = PaymentMethod;
    }

    /**
     * Get 社会信用代码。 
     * @return BusinessLicenseNumber 社会信用代码。
     */
    public String getBusinessLicenseNumber() {
        return this.BusinessLicenseNumber;
    }

    /**
     * Set 社会信用代码。
     * @param BusinessLicenseNumber 社会信用代码。
     */
    public void setBusinessLicenseNumber(String BusinessLicenseNumber) {
        this.BusinessLicenseNumber = BusinessLicenseNumber;
    }

    /**
     * Get 外部子商户名称。 
     * @return OutSubMerchantName 外部子商户名称。
     */
    public String getOutSubMerchantName() {
        return this.OutSubMerchantName;
    }

    /**
     * Set 外部子商户名称。
     * @param OutSubMerchantName 外部子商户名称。
     */
    public void setOutSubMerchantName(String OutSubMerchantName) {
        this.OutSubMerchantName = OutSubMerchantName;
    }

    /**
     * Get 法人姓名。 
     * @return LegalName 法人姓名。
     */
    public String getLegalName() {
        return this.LegalName;
    }

    /**
     * Set 法人姓名。
     * @param LegalName 法人姓名。
     */
    public void setLegalName(String LegalName) {
        this.LegalName = LegalName;
    }

    /**
     * Get 外部子商户简称。 
     * @return OutSubMerchantShortName 外部子商户简称。
     */
    public String getOutSubMerchantShortName() {
        return this.OutSubMerchantShortName;
    }

    /**
     * Set 外部子商户简称。
     * @param OutSubMerchantShortName 外部子商户简称。
     */
    public void setOutSubMerchantShortName(String OutSubMerchantShortName) {
        this.OutSubMerchantShortName = OutSubMerchantShortName;
    }

    /**
     * Get 外部子商户描述。 
     * @return OutSubMerchantDescription 外部子商户描述。
     */
    public String getOutSubMerchantDescription() {
        return this.OutSubMerchantDescription;
    }

    /**
     * Set 外部子商户描述。
     * @param OutSubMerchantDescription 外部子商户描述。
     */
    public void setOutSubMerchantDescription(String OutSubMerchantDescription) {
        this.OutSubMerchantDescription = OutSubMerchantDescription;
    }

    /**
     * Get 第三方子商户进件信息，为JSON格式字符串。详情见附录-复杂类型。 
     * @return ExternalSubMerchantRegistrationData 第三方子商户进件信息，为JSON格式字符串。详情见附录-复杂类型。
     */
    public String getExternalSubMerchantRegistrationData() {
        return this.ExternalSubMerchantRegistrationData;
    }

    /**
     * Set 第三方子商户进件信息，为JSON格式字符串。详情见附录-复杂类型。
     * @param ExternalSubMerchantRegistrationData 第三方子商户进件信息，为JSON格式字符串。详情见附录-复杂类型。
     */
    public void setExternalSubMerchantRegistrationData(String ExternalSubMerchantRegistrationData) {
        this.ExternalSubMerchantRegistrationData = ExternalSubMerchantRegistrationData;
    }

    /**
     * Get 通知地址。 
     * @return NotifyUrl 通知地址。
     */
    public String getNotifyUrl() {
        return this.NotifyUrl;
    }

    /**
     * Set 通知地址。
     * @param NotifyUrl 通知地址。
     */
    public void setNotifyUrl(String NotifyUrl) {
        this.NotifyUrl = NotifyUrl;
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

    public CreateOpenBankExternalSubMerchantRegistrationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateOpenBankExternalSubMerchantRegistrationRequest(CreateOpenBankExternalSubMerchantRegistrationRequest source) {
        if (source.OutRegistrationNo != null) {
            this.OutRegistrationNo = new String(source.OutRegistrationNo);
        }
        if (source.ChannelMerchantId != null) {
            this.ChannelMerchantId = new String(source.ChannelMerchantId);
        }
        if (source.OutSubMerchantId != null) {
            this.OutSubMerchantId = new String(source.OutSubMerchantId);
        }
        if (source.ChannelName != null) {
            this.ChannelName = new String(source.ChannelName);
        }
        if (source.PaymentMethod != null) {
            this.PaymentMethod = new String(source.PaymentMethod);
        }
        if (source.BusinessLicenseNumber != null) {
            this.BusinessLicenseNumber = new String(source.BusinessLicenseNumber);
        }
        if (source.OutSubMerchantName != null) {
            this.OutSubMerchantName = new String(source.OutSubMerchantName);
        }
        if (source.LegalName != null) {
            this.LegalName = new String(source.LegalName);
        }
        if (source.OutSubMerchantShortName != null) {
            this.OutSubMerchantShortName = new String(source.OutSubMerchantShortName);
        }
        if (source.OutSubMerchantDescription != null) {
            this.OutSubMerchantDescription = new String(source.OutSubMerchantDescription);
        }
        if (source.ExternalSubMerchantRegistrationData != null) {
            this.ExternalSubMerchantRegistrationData = new String(source.ExternalSubMerchantRegistrationData);
        }
        if (source.NotifyUrl != null) {
            this.NotifyUrl = new String(source.NotifyUrl);
        }
        if (source.Environment != null) {
            this.Environment = new String(source.Environment);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OutRegistrationNo", this.OutRegistrationNo);
        this.setParamSimple(map, prefix + "ChannelMerchantId", this.ChannelMerchantId);
        this.setParamSimple(map, prefix + "OutSubMerchantId", this.OutSubMerchantId);
        this.setParamSimple(map, prefix + "ChannelName", this.ChannelName);
        this.setParamSimple(map, prefix + "PaymentMethod", this.PaymentMethod);
        this.setParamSimple(map, prefix + "BusinessLicenseNumber", this.BusinessLicenseNumber);
        this.setParamSimple(map, prefix + "OutSubMerchantName", this.OutSubMerchantName);
        this.setParamSimple(map, prefix + "LegalName", this.LegalName);
        this.setParamSimple(map, prefix + "OutSubMerchantShortName", this.OutSubMerchantShortName);
        this.setParamSimple(map, prefix + "OutSubMerchantDescription", this.OutSubMerchantDescription);
        this.setParamSimple(map, prefix + "ExternalSubMerchantRegistrationData", this.ExternalSubMerchantRegistrationData);
        this.setParamSimple(map, prefix + "NotifyUrl", this.NotifyUrl);
        this.setParamSimple(map, prefix + "Environment", this.Environment);

    }
}

