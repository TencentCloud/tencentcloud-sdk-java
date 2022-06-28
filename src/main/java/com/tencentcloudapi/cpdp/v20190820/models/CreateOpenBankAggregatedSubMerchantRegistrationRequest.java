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

public class CreateOpenBankAggregatedSubMerchantRegistrationRequest extends AbstractModel{

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
    * 外部子商户ID。
    */
    @SerializedName("OutSubMerchantId")
    @Expose
    private String OutSubMerchantId;

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
    * 外部子商户类型。
ENTERPRISE：企业商户 
INSTITUTION：事业单位商户 
INDIVIDUALBISS：个体工商户 
PERSON：个人商户(小微商户) 
SUBJECT_TYPE_OTHERS：其他组织
    */
    @SerializedName("OutSubMerchantType")
    @Expose
    private String OutSubMerchantType;

    /**
    * 外部子商户名称。
HELIPAY渠道(长度不能小于5大于150)。
    */
    @SerializedName("OutSubMerchantName")
    @Expose
    private String OutSubMerchantName;

    /**
    * 商户法人代表信息。
    */
    @SerializedName("LegalPersonInfo")
    @Expose
    private LegalPersonInfo LegalPersonInfo;

    /**
    * 营业证件信息。
    */
    @SerializedName("BusinessLicenseInfo")
    @Expose
    private BusinessLicenseInfo BusinessLicenseInfo;

    /**
    * 支付渠道子商户进件信息。
json字符串，详情见附录-复杂类型-InterConnectionSubMerchantData。
    */
    @SerializedName("InterConnectionSubMerchantData")
    @Expose
    private String InterConnectionSubMerchantData;

    /**
    * 支付方式。详见附录-云企付枚举类说明-PaymentMethod。
合利宝渠道不需要传。
    */
    @SerializedName("PaymentMethod")
    @Expose
    private String PaymentMethod;

    /**
    * 外部子商户简称。
HELIPAY渠道必传(长度不能小于2大于20)。
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
    * 通知地址。
    */
    @SerializedName("NotifyUrl")
    @Expose
    private String NotifyUrl;

    /**
    * 相关自然人信息列表。
HELIPAY渠道必传业务联系人。
    */
    @SerializedName("NaturalPersonList")
    @Expose
    private NaturalPersonInfo [] NaturalPersonList;

    /**
    * 商户结算信息。
HELIPAY渠道必传。
    */
    @SerializedName("SettleInfo")
    @Expose
    private SettleInfo SettleInfo;

    /**
    * 外部子商户其他公用扩展信息。
HELIPAY渠道必传。
    */
    @SerializedName("OutSubMerchantExtensionInfo")
    @Expose
    private OutSubMerchantExtensionInfo OutSubMerchantExtensionInfo;

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
     * Get 外部子商户ID。 
     * @return OutSubMerchantId 外部子商户ID。
     */
    public String getOutSubMerchantId() {
        return this.OutSubMerchantId;
    }

    /**
     * Set 外部子商户ID。
     * @param OutSubMerchantId 外部子商户ID。
     */
    public void setOutSubMerchantId(String OutSubMerchantId) {
        this.OutSubMerchantId = OutSubMerchantId;
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
     * Get 外部子商户类型。
ENTERPRISE：企业商户 
INSTITUTION：事业单位商户 
INDIVIDUALBISS：个体工商户 
PERSON：个人商户(小微商户) 
SUBJECT_TYPE_OTHERS：其他组织 
     * @return OutSubMerchantType 外部子商户类型。
ENTERPRISE：企业商户 
INSTITUTION：事业单位商户 
INDIVIDUALBISS：个体工商户 
PERSON：个人商户(小微商户) 
SUBJECT_TYPE_OTHERS：其他组织
     */
    public String getOutSubMerchantType() {
        return this.OutSubMerchantType;
    }

    /**
     * Set 外部子商户类型。
ENTERPRISE：企业商户 
INSTITUTION：事业单位商户 
INDIVIDUALBISS：个体工商户 
PERSON：个人商户(小微商户) 
SUBJECT_TYPE_OTHERS：其他组织
     * @param OutSubMerchantType 外部子商户类型。
ENTERPRISE：企业商户 
INSTITUTION：事业单位商户 
INDIVIDUALBISS：个体工商户 
PERSON：个人商户(小微商户) 
SUBJECT_TYPE_OTHERS：其他组织
     */
    public void setOutSubMerchantType(String OutSubMerchantType) {
        this.OutSubMerchantType = OutSubMerchantType;
    }

    /**
     * Get 外部子商户名称。
HELIPAY渠道(长度不能小于5大于150)。 
     * @return OutSubMerchantName 外部子商户名称。
HELIPAY渠道(长度不能小于5大于150)。
     */
    public String getOutSubMerchantName() {
        return this.OutSubMerchantName;
    }

    /**
     * Set 外部子商户名称。
HELIPAY渠道(长度不能小于5大于150)。
     * @param OutSubMerchantName 外部子商户名称。
HELIPAY渠道(长度不能小于5大于150)。
     */
    public void setOutSubMerchantName(String OutSubMerchantName) {
        this.OutSubMerchantName = OutSubMerchantName;
    }

    /**
     * Get 商户法人代表信息。 
     * @return LegalPersonInfo 商户法人代表信息。
     */
    public LegalPersonInfo getLegalPersonInfo() {
        return this.LegalPersonInfo;
    }

    /**
     * Set 商户法人代表信息。
     * @param LegalPersonInfo 商户法人代表信息。
     */
    public void setLegalPersonInfo(LegalPersonInfo LegalPersonInfo) {
        this.LegalPersonInfo = LegalPersonInfo;
    }

    /**
     * Get 营业证件信息。 
     * @return BusinessLicenseInfo 营业证件信息。
     */
    public BusinessLicenseInfo getBusinessLicenseInfo() {
        return this.BusinessLicenseInfo;
    }

    /**
     * Set 营业证件信息。
     * @param BusinessLicenseInfo 营业证件信息。
     */
    public void setBusinessLicenseInfo(BusinessLicenseInfo BusinessLicenseInfo) {
        this.BusinessLicenseInfo = BusinessLicenseInfo;
    }

    /**
     * Get 支付渠道子商户进件信息。
json字符串，详情见附录-复杂类型-InterConnectionSubMerchantData。 
     * @return InterConnectionSubMerchantData 支付渠道子商户进件信息。
json字符串，详情见附录-复杂类型-InterConnectionSubMerchantData。
     */
    public String getInterConnectionSubMerchantData() {
        return this.InterConnectionSubMerchantData;
    }

    /**
     * Set 支付渠道子商户进件信息。
json字符串，详情见附录-复杂类型-InterConnectionSubMerchantData。
     * @param InterConnectionSubMerchantData 支付渠道子商户进件信息。
json字符串，详情见附录-复杂类型-InterConnectionSubMerchantData。
     */
    public void setInterConnectionSubMerchantData(String InterConnectionSubMerchantData) {
        this.InterConnectionSubMerchantData = InterConnectionSubMerchantData;
    }

    /**
     * Get 支付方式。详见附录-云企付枚举类说明-PaymentMethod。
合利宝渠道不需要传。 
     * @return PaymentMethod 支付方式。详见附录-云企付枚举类说明-PaymentMethod。
合利宝渠道不需要传。
     */
    public String getPaymentMethod() {
        return this.PaymentMethod;
    }

    /**
     * Set 支付方式。详见附录-云企付枚举类说明-PaymentMethod。
合利宝渠道不需要传。
     * @param PaymentMethod 支付方式。详见附录-云企付枚举类说明-PaymentMethod。
合利宝渠道不需要传。
     */
    public void setPaymentMethod(String PaymentMethod) {
        this.PaymentMethod = PaymentMethod;
    }

    /**
     * Get 外部子商户简称。
HELIPAY渠道必传(长度不能小于2大于20)。 
     * @return OutSubMerchantShortName 外部子商户简称。
HELIPAY渠道必传(长度不能小于2大于20)。
     */
    public String getOutSubMerchantShortName() {
        return this.OutSubMerchantShortName;
    }

    /**
     * Set 外部子商户简称。
HELIPAY渠道必传(长度不能小于2大于20)。
     * @param OutSubMerchantShortName 外部子商户简称。
HELIPAY渠道必传(长度不能小于2大于20)。
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
     * Get 相关自然人信息列表。
HELIPAY渠道必传业务联系人。 
     * @return NaturalPersonList 相关自然人信息列表。
HELIPAY渠道必传业务联系人。
     */
    public NaturalPersonInfo [] getNaturalPersonList() {
        return this.NaturalPersonList;
    }

    /**
     * Set 相关自然人信息列表。
HELIPAY渠道必传业务联系人。
     * @param NaturalPersonList 相关自然人信息列表。
HELIPAY渠道必传业务联系人。
     */
    public void setNaturalPersonList(NaturalPersonInfo [] NaturalPersonList) {
        this.NaturalPersonList = NaturalPersonList;
    }

    /**
     * Get 商户结算信息。
HELIPAY渠道必传。 
     * @return SettleInfo 商户结算信息。
HELIPAY渠道必传。
     */
    public SettleInfo getSettleInfo() {
        return this.SettleInfo;
    }

    /**
     * Set 商户结算信息。
HELIPAY渠道必传。
     * @param SettleInfo 商户结算信息。
HELIPAY渠道必传。
     */
    public void setSettleInfo(SettleInfo SettleInfo) {
        this.SettleInfo = SettleInfo;
    }

    /**
     * Get 外部子商户其他公用扩展信息。
HELIPAY渠道必传。 
     * @return OutSubMerchantExtensionInfo 外部子商户其他公用扩展信息。
HELIPAY渠道必传。
     */
    public OutSubMerchantExtensionInfo getOutSubMerchantExtensionInfo() {
        return this.OutSubMerchantExtensionInfo;
    }

    /**
     * Set 外部子商户其他公用扩展信息。
HELIPAY渠道必传。
     * @param OutSubMerchantExtensionInfo 外部子商户其他公用扩展信息。
HELIPAY渠道必传。
     */
    public void setOutSubMerchantExtensionInfo(OutSubMerchantExtensionInfo OutSubMerchantExtensionInfo) {
        this.OutSubMerchantExtensionInfo = OutSubMerchantExtensionInfo;
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

    public CreateOpenBankAggregatedSubMerchantRegistrationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateOpenBankAggregatedSubMerchantRegistrationRequest(CreateOpenBankAggregatedSubMerchantRegistrationRequest source) {
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
        if (source.OutSubMerchantType != null) {
            this.OutSubMerchantType = new String(source.OutSubMerchantType);
        }
        if (source.OutSubMerchantName != null) {
            this.OutSubMerchantName = new String(source.OutSubMerchantName);
        }
        if (source.LegalPersonInfo != null) {
            this.LegalPersonInfo = new LegalPersonInfo(source.LegalPersonInfo);
        }
        if (source.BusinessLicenseInfo != null) {
            this.BusinessLicenseInfo = new BusinessLicenseInfo(source.BusinessLicenseInfo);
        }
        if (source.InterConnectionSubMerchantData != null) {
            this.InterConnectionSubMerchantData = new String(source.InterConnectionSubMerchantData);
        }
        if (source.PaymentMethod != null) {
            this.PaymentMethod = new String(source.PaymentMethod);
        }
        if (source.OutSubMerchantShortName != null) {
            this.OutSubMerchantShortName = new String(source.OutSubMerchantShortName);
        }
        if (source.OutSubMerchantDescription != null) {
            this.OutSubMerchantDescription = new String(source.OutSubMerchantDescription);
        }
        if (source.NotifyUrl != null) {
            this.NotifyUrl = new String(source.NotifyUrl);
        }
        if (source.NaturalPersonList != null) {
            this.NaturalPersonList = new NaturalPersonInfo[source.NaturalPersonList.length];
            for (int i = 0; i < source.NaturalPersonList.length; i++) {
                this.NaturalPersonList[i] = new NaturalPersonInfo(source.NaturalPersonList[i]);
            }
        }
        if (source.SettleInfo != null) {
            this.SettleInfo = new SettleInfo(source.SettleInfo);
        }
        if (source.OutSubMerchantExtensionInfo != null) {
            this.OutSubMerchantExtensionInfo = new OutSubMerchantExtensionInfo(source.OutSubMerchantExtensionInfo);
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
        this.setParamSimple(map, prefix + "OutSubMerchantType", this.OutSubMerchantType);
        this.setParamSimple(map, prefix + "OutSubMerchantName", this.OutSubMerchantName);
        this.setParamObj(map, prefix + "LegalPersonInfo.", this.LegalPersonInfo);
        this.setParamObj(map, prefix + "BusinessLicenseInfo.", this.BusinessLicenseInfo);
        this.setParamSimple(map, prefix + "InterConnectionSubMerchantData", this.InterConnectionSubMerchantData);
        this.setParamSimple(map, prefix + "PaymentMethod", this.PaymentMethod);
        this.setParamSimple(map, prefix + "OutSubMerchantShortName", this.OutSubMerchantShortName);
        this.setParamSimple(map, prefix + "OutSubMerchantDescription", this.OutSubMerchantDescription);
        this.setParamSimple(map, prefix + "NotifyUrl", this.NotifyUrl);
        this.setParamArrayObj(map, prefix + "NaturalPersonList.", this.NaturalPersonList);
        this.setParamObj(map, prefix + "SettleInfo.", this.SettleInfo);
        this.setParamObj(map, prefix + "OutSubMerchantExtensionInfo.", this.OutSubMerchantExtensionInfo);
        this.setParamSimple(map, prefix + "Environment", this.Environment);

    }
}

