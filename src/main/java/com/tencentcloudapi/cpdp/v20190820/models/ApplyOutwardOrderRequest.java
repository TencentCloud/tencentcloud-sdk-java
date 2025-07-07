/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApplyOutwardOrderRequest extends AbstractModel {

    /**
    * 对接方汇出指令编号
    */
    @SerializedName("TransactionId")
    @Expose
    private String TransactionId;

    /**
    * 定价币种
    */
    @SerializedName("PricingCurrency")
    @Expose
    private String PricingCurrency;

    /**
    * 源币种
    */
    @SerializedName("SourceCurrency")
    @Expose
    private String SourceCurrency;

    /**
    * 目的币种
    */
    @SerializedName("TargetCurrency")
    @Expose
    private String TargetCurrency;

    /**
    * 收款人类型（银行卡填"BANK_ACCOUNT"）
    */
    @SerializedName("PayeeType")
    @Expose
    private String PayeeType;

    /**
    * 收款人账号
    */
    @SerializedName("PayeeAccount")
    @Expose
    private String PayeeAccount;

    /**
    * 源币种金额
    */
    @SerializedName("SourceAmount")
    @Expose
    private Float SourceAmount;

    /**
    * 目的金额
    */
    @SerializedName("TargetAmount")
    @Expose
    private Float TargetAmount;

    /**
    * 收款人姓名（PayeeType为"BANK_COUNT"时必填）
    */
    @SerializedName("PayeeName")
    @Expose
    private String PayeeName;

    /**
    * 收款人地址（PayeeType为"BANK_COUNT"时必填）
    */
    @SerializedName("PayeeAddress")
    @Expose
    private String PayeeAddress;

    /**
    * 收款人银行账号类型（PayeeType为"BANK_COUNT"时必填）
个人填"INDIVIDUAL"
企业填"CORPORATE"
    */
    @SerializedName("PayeeBankAccountType")
    @Expose
    private String PayeeBankAccountType;

    /**
    * 收款人国家或地区编码（PayeeType为"BANK_COUNT"时必填）
    */
    @SerializedName("PayeeCountryCode")
    @Expose
    private String PayeeCountryCode;

    /**
    * 收款人开户银行名称（PayeeType为"BANK_COUNT"时必填）
    */
    @SerializedName("PayeeBankName")
    @Expose
    private String PayeeBankName;

    /**
    * 收款人开户银行地址（PayeeType为"BANK_COUNT"时必填）
    */
    @SerializedName("PayeeBankAddress")
    @Expose
    private String PayeeBankAddress;

    /**
    * 收款人开户银行所在国家或地区编码（PayeeType为"BANK_COUNT"时必填）
    */
    @SerializedName("PayeeBankDistrict")
    @Expose
    private String PayeeBankDistrict;

    /**
    * 收款银行SwiftCode（PayeeType为"BANK_COUNT"时必填）
    */
    @SerializedName("PayeeBankSwiftCode")
    @Expose
    private String PayeeBankSwiftCode;

    /**
    * 收款银行国际编码类型
    */
    @SerializedName("PayeeBankType")
    @Expose
    private String PayeeBankType;

    /**
    * 收款银行国际编码
    */
    @SerializedName("PayeeBankCode")
    @Expose
    private String PayeeBankCode;

    /**
    * 收款人附言
    */
    @SerializedName("ReferenceForBeneficiary")
    @Expose
    private String ReferenceForBeneficiary;

    /**
    * 接入环境。沙箱环境填sandbox
    */
    @SerializedName("Profile")
    @Expose
    private String Profile;

    /**
     * Get 对接方汇出指令编号 
     * @return TransactionId 对接方汇出指令编号
     */
    public String getTransactionId() {
        return this.TransactionId;
    }

    /**
     * Set 对接方汇出指令编号
     * @param TransactionId 对接方汇出指令编号
     */
    public void setTransactionId(String TransactionId) {
        this.TransactionId = TransactionId;
    }

    /**
     * Get 定价币种 
     * @return PricingCurrency 定价币种
     */
    public String getPricingCurrency() {
        return this.PricingCurrency;
    }

    /**
     * Set 定价币种
     * @param PricingCurrency 定价币种
     */
    public void setPricingCurrency(String PricingCurrency) {
        this.PricingCurrency = PricingCurrency;
    }

    /**
     * Get 源币种 
     * @return SourceCurrency 源币种
     */
    public String getSourceCurrency() {
        return this.SourceCurrency;
    }

    /**
     * Set 源币种
     * @param SourceCurrency 源币种
     */
    public void setSourceCurrency(String SourceCurrency) {
        this.SourceCurrency = SourceCurrency;
    }

    /**
     * Get 目的币种 
     * @return TargetCurrency 目的币种
     */
    public String getTargetCurrency() {
        return this.TargetCurrency;
    }

    /**
     * Set 目的币种
     * @param TargetCurrency 目的币种
     */
    public void setTargetCurrency(String TargetCurrency) {
        this.TargetCurrency = TargetCurrency;
    }

    /**
     * Get 收款人类型（银行卡填"BANK_ACCOUNT"） 
     * @return PayeeType 收款人类型（银行卡填"BANK_ACCOUNT"）
     */
    public String getPayeeType() {
        return this.PayeeType;
    }

    /**
     * Set 收款人类型（银行卡填"BANK_ACCOUNT"）
     * @param PayeeType 收款人类型（银行卡填"BANK_ACCOUNT"）
     */
    public void setPayeeType(String PayeeType) {
        this.PayeeType = PayeeType;
    }

    /**
     * Get 收款人账号 
     * @return PayeeAccount 收款人账号
     */
    public String getPayeeAccount() {
        return this.PayeeAccount;
    }

    /**
     * Set 收款人账号
     * @param PayeeAccount 收款人账号
     */
    public void setPayeeAccount(String PayeeAccount) {
        this.PayeeAccount = PayeeAccount;
    }

    /**
     * Get 源币种金额 
     * @return SourceAmount 源币种金额
     */
    public Float getSourceAmount() {
        return this.SourceAmount;
    }

    /**
     * Set 源币种金额
     * @param SourceAmount 源币种金额
     */
    public void setSourceAmount(Float SourceAmount) {
        this.SourceAmount = SourceAmount;
    }

    /**
     * Get 目的金额 
     * @return TargetAmount 目的金额
     */
    public Float getTargetAmount() {
        return this.TargetAmount;
    }

    /**
     * Set 目的金额
     * @param TargetAmount 目的金额
     */
    public void setTargetAmount(Float TargetAmount) {
        this.TargetAmount = TargetAmount;
    }

    /**
     * Get 收款人姓名（PayeeType为"BANK_COUNT"时必填） 
     * @return PayeeName 收款人姓名（PayeeType为"BANK_COUNT"时必填）
     */
    public String getPayeeName() {
        return this.PayeeName;
    }

    /**
     * Set 收款人姓名（PayeeType为"BANK_COUNT"时必填）
     * @param PayeeName 收款人姓名（PayeeType为"BANK_COUNT"时必填）
     */
    public void setPayeeName(String PayeeName) {
        this.PayeeName = PayeeName;
    }

    /**
     * Get 收款人地址（PayeeType为"BANK_COUNT"时必填） 
     * @return PayeeAddress 收款人地址（PayeeType为"BANK_COUNT"时必填）
     */
    public String getPayeeAddress() {
        return this.PayeeAddress;
    }

    /**
     * Set 收款人地址（PayeeType为"BANK_COUNT"时必填）
     * @param PayeeAddress 收款人地址（PayeeType为"BANK_COUNT"时必填）
     */
    public void setPayeeAddress(String PayeeAddress) {
        this.PayeeAddress = PayeeAddress;
    }

    /**
     * Get 收款人银行账号类型（PayeeType为"BANK_COUNT"时必填）
个人填"INDIVIDUAL"
企业填"CORPORATE" 
     * @return PayeeBankAccountType 收款人银行账号类型（PayeeType为"BANK_COUNT"时必填）
个人填"INDIVIDUAL"
企业填"CORPORATE"
     */
    public String getPayeeBankAccountType() {
        return this.PayeeBankAccountType;
    }

    /**
     * Set 收款人银行账号类型（PayeeType为"BANK_COUNT"时必填）
个人填"INDIVIDUAL"
企业填"CORPORATE"
     * @param PayeeBankAccountType 收款人银行账号类型（PayeeType为"BANK_COUNT"时必填）
个人填"INDIVIDUAL"
企业填"CORPORATE"
     */
    public void setPayeeBankAccountType(String PayeeBankAccountType) {
        this.PayeeBankAccountType = PayeeBankAccountType;
    }

    /**
     * Get 收款人国家或地区编码（PayeeType为"BANK_COUNT"时必填） 
     * @return PayeeCountryCode 收款人国家或地区编码（PayeeType为"BANK_COUNT"时必填）
     */
    public String getPayeeCountryCode() {
        return this.PayeeCountryCode;
    }

    /**
     * Set 收款人国家或地区编码（PayeeType为"BANK_COUNT"时必填）
     * @param PayeeCountryCode 收款人国家或地区编码（PayeeType为"BANK_COUNT"时必填）
     */
    public void setPayeeCountryCode(String PayeeCountryCode) {
        this.PayeeCountryCode = PayeeCountryCode;
    }

    /**
     * Get 收款人开户银行名称（PayeeType为"BANK_COUNT"时必填） 
     * @return PayeeBankName 收款人开户银行名称（PayeeType为"BANK_COUNT"时必填）
     */
    public String getPayeeBankName() {
        return this.PayeeBankName;
    }

    /**
     * Set 收款人开户银行名称（PayeeType为"BANK_COUNT"时必填）
     * @param PayeeBankName 收款人开户银行名称（PayeeType为"BANK_COUNT"时必填）
     */
    public void setPayeeBankName(String PayeeBankName) {
        this.PayeeBankName = PayeeBankName;
    }

    /**
     * Get 收款人开户银行地址（PayeeType为"BANK_COUNT"时必填） 
     * @return PayeeBankAddress 收款人开户银行地址（PayeeType为"BANK_COUNT"时必填）
     */
    public String getPayeeBankAddress() {
        return this.PayeeBankAddress;
    }

    /**
     * Set 收款人开户银行地址（PayeeType为"BANK_COUNT"时必填）
     * @param PayeeBankAddress 收款人开户银行地址（PayeeType为"BANK_COUNT"时必填）
     */
    public void setPayeeBankAddress(String PayeeBankAddress) {
        this.PayeeBankAddress = PayeeBankAddress;
    }

    /**
     * Get 收款人开户银行所在国家或地区编码（PayeeType为"BANK_COUNT"时必填） 
     * @return PayeeBankDistrict 收款人开户银行所在国家或地区编码（PayeeType为"BANK_COUNT"时必填）
     */
    public String getPayeeBankDistrict() {
        return this.PayeeBankDistrict;
    }

    /**
     * Set 收款人开户银行所在国家或地区编码（PayeeType为"BANK_COUNT"时必填）
     * @param PayeeBankDistrict 收款人开户银行所在国家或地区编码（PayeeType为"BANK_COUNT"时必填）
     */
    public void setPayeeBankDistrict(String PayeeBankDistrict) {
        this.PayeeBankDistrict = PayeeBankDistrict;
    }

    /**
     * Get 收款银行SwiftCode（PayeeType为"BANK_COUNT"时必填） 
     * @return PayeeBankSwiftCode 收款银行SwiftCode（PayeeType为"BANK_COUNT"时必填）
     */
    public String getPayeeBankSwiftCode() {
        return this.PayeeBankSwiftCode;
    }

    /**
     * Set 收款银行SwiftCode（PayeeType为"BANK_COUNT"时必填）
     * @param PayeeBankSwiftCode 收款银行SwiftCode（PayeeType为"BANK_COUNT"时必填）
     */
    public void setPayeeBankSwiftCode(String PayeeBankSwiftCode) {
        this.PayeeBankSwiftCode = PayeeBankSwiftCode;
    }

    /**
     * Get 收款银行国际编码类型 
     * @return PayeeBankType 收款银行国际编码类型
     */
    public String getPayeeBankType() {
        return this.PayeeBankType;
    }

    /**
     * Set 收款银行国际编码类型
     * @param PayeeBankType 收款银行国际编码类型
     */
    public void setPayeeBankType(String PayeeBankType) {
        this.PayeeBankType = PayeeBankType;
    }

    /**
     * Get 收款银行国际编码 
     * @return PayeeBankCode 收款银行国际编码
     */
    public String getPayeeBankCode() {
        return this.PayeeBankCode;
    }

    /**
     * Set 收款银行国际编码
     * @param PayeeBankCode 收款银行国际编码
     */
    public void setPayeeBankCode(String PayeeBankCode) {
        this.PayeeBankCode = PayeeBankCode;
    }

    /**
     * Get 收款人附言 
     * @return ReferenceForBeneficiary 收款人附言
     */
    public String getReferenceForBeneficiary() {
        return this.ReferenceForBeneficiary;
    }

    /**
     * Set 收款人附言
     * @param ReferenceForBeneficiary 收款人附言
     */
    public void setReferenceForBeneficiary(String ReferenceForBeneficiary) {
        this.ReferenceForBeneficiary = ReferenceForBeneficiary;
    }

    /**
     * Get 接入环境。沙箱环境填sandbox 
     * @return Profile 接入环境。沙箱环境填sandbox
     */
    public String getProfile() {
        return this.Profile;
    }

    /**
     * Set 接入环境。沙箱环境填sandbox
     * @param Profile 接入环境。沙箱环境填sandbox
     */
    public void setProfile(String Profile) {
        this.Profile = Profile;
    }

    public ApplyOutwardOrderRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApplyOutwardOrderRequest(ApplyOutwardOrderRequest source) {
        if (source.TransactionId != null) {
            this.TransactionId = new String(source.TransactionId);
        }
        if (source.PricingCurrency != null) {
            this.PricingCurrency = new String(source.PricingCurrency);
        }
        if (source.SourceCurrency != null) {
            this.SourceCurrency = new String(source.SourceCurrency);
        }
        if (source.TargetCurrency != null) {
            this.TargetCurrency = new String(source.TargetCurrency);
        }
        if (source.PayeeType != null) {
            this.PayeeType = new String(source.PayeeType);
        }
        if (source.PayeeAccount != null) {
            this.PayeeAccount = new String(source.PayeeAccount);
        }
        if (source.SourceAmount != null) {
            this.SourceAmount = new Float(source.SourceAmount);
        }
        if (source.TargetAmount != null) {
            this.TargetAmount = new Float(source.TargetAmount);
        }
        if (source.PayeeName != null) {
            this.PayeeName = new String(source.PayeeName);
        }
        if (source.PayeeAddress != null) {
            this.PayeeAddress = new String(source.PayeeAddress);
        }
        if (source.PayeeBankAccountType != null) {
            this.PayeeBankAccountType = new String(source.PayeeBankAccountType);
        }
        if (source.PayeeCountryCode != null) {
            this.PayeeCountryCode = new String(source.PayeeCountryCode);
        }
        if (source.PayeeBankName != null) {
            this.PayeeBankName = new String(source.PayeeBankName);
        }
        if (source.PayeeBankAddress != null) {
            this.PayeeBankAddress = new String(source.PayeeBankAddress);
        }
        if (source.PayeeBankDistrict != null) {
            this.PayeeBankDistrict = new String(source.PayeeBankDistrict);
        }
        if (source.PayeeBankSwiftCode != null) {
            this.PayeeBankSwiftCode = new String(source.PayeeBankSwiftCode);
        }
        if (source.PayeeBankType != null) {
            this.PayeeBankType = new String(source.PayeeBankType);
        }
        if (source.PayeeBankCode != null) {
            this.PayeeBankCode = new String(source.PayeeBankCode);
        }
        if (source.ReferenceForBeneficiary != null) {
            this.ReferenceForBeneficiary = new String(source.ReferenceForBeneficiary);
        }
        if (source.Profile != null) {
            this.Profile = new String(source.Profile);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TransactionId", this.TransactionId);
        this.setParamSimple(map, prefix + "PricingCurrency", this.PricingCurrency);
        this.setParamSimple(map, prefix + "SourceCurrency", this.SourceCurrency);
        this.setParamSimple(map, prefix + "TargetCurrency", this.TargetCurrency);
        this.setParamSimple(map, prefix + "PayeeType", this.PayeeType);
        this.setParamSimple(map, prefix + "PayeeAccount", this.PayeeAccount);
        this.setParamSimple(map, prefix + "SourceAmount", this.SourceAmount);
        this.setParamSimple(map, prefix + "TargetAmount", this.TargetAmount);
        this.setParamSimple(map, prefix + "PayeeName", this.PayeeName);
        this.setParamSimple(map, prefix + "PayeeAddress", this.PayeeAddress);
        this.setParamSimple(map, prefix + "PayeeBankAccountType", this.PayeeBankAccountType);
        this.setParamSimple(map, prefix + "PayeeCountryCode", this.PayeeCountryCode);
        this.setParamSimple(map, prefix + "PayeeBankName", this.PayeeBankName);
        this.setParamSimple(map, prefix + "PayeeBankAddress", this.PayeeBankAddress);
        this.setParamSimple(map, prefix + "PayeeBankDistrict", this.PayeeBankDistrict);
        this.setParamSimple(map, prefix + "PayeeBankSwiftCode", this.PayeeBankSwiftCode);
        this.setParamSimple(map, prefix + "PayeeBankType", this.PayeeBankType);
        this.setParamSimple(map, prefix + "PayeeBankCode", this.PayeeBankCode);
        this.setParamSimple(map, prefix + "ReferenceForBeneficiary", this.ReferenceForBeneficiary);
        this.setParamSimple(map, prefix + "Profile", this.Profile);

    }
}

