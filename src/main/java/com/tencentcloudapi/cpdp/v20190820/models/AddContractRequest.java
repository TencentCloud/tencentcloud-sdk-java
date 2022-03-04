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

public class AddContractRequest extends AbstractModel{

    /**
    * 收单系统分配的开放ID
    */
    @SerializedName("OpenId")
    @Expose
    private String OpenId;

    /**
    * 收单系统分配的密钥
    */
    @SerializedName("OpenKey")
    @Expose
    private String OpenKey;

    /**
    * 机构合同主键（系统有唯一性校验），建议使用合同表的主键ID，防止重复添加合同
    */
    @SerializedName("OutContractId")
    @Expose
    private String OutContractId;

    /**
    * 合同编号（系统有唯一性校验）
    */
    @SerializedName("Code")
    @Expose
    private String Code;

    /**
    * 支付方式编号
    */
    @SerializedName("PaymentId")
    @Expose
    private String PaymentId;

    /**
    * 支付方式行业分类编号
    */
    @SerializedName("PaymentClassificationId")
    @Expose
    private String PaymentClassificationId;

    /**
    * 封顶值（分为单位，无封顶填0）
    */
    @SerializedName("PaymentClassificationLimit")
    @Expose
    private String PaymentClassificationLimit;

    /**
    * 商户编号
    */
    @SerializedName("MerchantNo")
    @Expose
    private String MerchantNo;

    /**
    * 签约扣率百分比（如：0.32）
    */
    @SerializedName("Fee")
    @Expose
    private String Fee;

    /**
    * 合同生效日期（yyyy-mm-dd）
    */
    @SerializedName("StartDate")
    @Expose
    private String StartDate;

    /**
    * 合同过期日期（yyyy-mm-dd）
    */
    @SerializedName("EndDate")
    @Expose
    private String EndDate;

    /**
    * 合同签约人
    */
    @SerializedName("SignMan")
    @Expose
    private String SignMan;

    /**
    * 签购单名称，建议使用商户招牌名称
    */
    @SerializedName("SignName")
    @Expose
    private String SignName;

    /**
    * 合同签署日期（yyyy-mm-dd）
    */
    @SerializedName("SignDate")
    @Expose
    private String SignDate;

    /**
    * 是否自动续签（1是，0否）
    */
    @SerializedName("AutoSign")
    @Expose
    private String AutoSign;

    /**
    * 联系人
    */
    @SerializedName("Contact")
    @Expose
    private String Contact;

    /**
    * 联系人电话
    */
    @SerializedName("ContactTelephone")
    @Expose
    private String ContactTelephone;

    /**
    * 合同照片【私密区】
    */
    @SerializedName("PictureOne")
    @Expose
    private String PictureOne;

    /**
    * 合同照片【私密区】
    */
    @SerializedName("PictureTwo")
    @Expose
    private String PictureTwo;

    /**
    * 渠道扩展字段，json格式
    */
    @SerializedName("ChannelExtJson")
    @Expose
    private String ChannelExtJson;

    /**
    * 沙箱环境填sandbox，正式环境不填
    */
    @SerializedName("Profile")
    @Expose
    private String Profile;

    /**
    * 合同选项1（不同支付方式规则不一样，请以支付方式规定的格式传值）
    */
    @SerializedName("PaymentOptionOne")
    @Expose
    private String PaymentOptionOne;

    /**
    * 合同选项2（不同支付方式规则不一样，请以支付方式规定的格式传值）
    */
    @SerializedName("PaymentOptionTwo")
    @Expose
    private String PaymentOptionTwo;

    /**
    * 合同选项3（不同支付方式规则不一样，请以支付方式规定的格式传值）
    */
    @SerializedName("PaymentOptionThree")
    @Expose
    private String PaymentOptionThree;

    /**
    * 合同选项4（不同支付方式规则不一样，请以支付方式规定的格式传值）
    */
    @SerializedName("PaymentOptionFour")
    @Expose
    private String PaymentOptionFour;

    /**
    * 合同证书选项1（不同支付方式规则不一样，请以支付方式规定的格式传值）
    */
    @SerializedName("PaymentOptionFive")
    @Expose
    private String PaymentOptionFive;

    /**
    * 合同证书选项2（不同支付方式规则不一样，请以支付方式规定的格式传值）
    */
    @SerializedName("PaymentOptionSix")
    @Expose
    private String PaymentOptionSix;

    /**
    * 合同选项5（不同支付方式规则不一样，请以支付方式规定的格式传值）
    */
    @SerializedName("PaymentOptionSeven")
    @Expose
    private String PaymentOptionSeven;

    /**
    * 合同选项6（不同支付方式规则不一样，请以支付方式规定的格式传值）
    */
    @SerializedName("PaymentOptionOther")
    @Expose
    private String PaymentOptionOther;

    /**
    * 合同选项8
    */
    @SerializedName("PaymentOptionTen")
    @Expose
    private String PaymentOptionTen;

    /**
    * 合同选项7（不同支付方式规则不一样，请以支付方式规定的格式传值）
    */
    @SerializedName("PaymentOptionNine")
    @Expose
    private String PaymentOptionNine;

    /**
     * Get 收单系统分配的开放ID 
     * @return OpenId 收单系统分配的开放ID
     */
    public String getOpenId() {
        return this.OpenId;
    }

    /**
     * Set 收单系统分配的开放ID
     * @param OpenId 收单系统分配的开放ID
     */
    public void setOpenId(String OpenId) {
        this.OpenId = OpenId;
    }

    /**
     * Get 收单系统分配的密钥 
     * @return OpenKey 收单系统分配的密钥
     */
    public String getOpenKey() {
        return this.OpenKey;
    }

    /**
     * Set 收单系统分配的密钥
     * @param OpenKey 收单系统分配的密钥
     */
    public void setOpenKey(String OpenKey) {
        this.OpenKey = OpenKey;
    }

    /**
     * Get 机构合同主键（系统有唯一性校验），建议使用合同表的主键ID，防止重复添加合同 
     * @return OutContractId 机构合同主键（系统有唯一性校验），建议使用合同表的主键ID，防止重复添加合同
     */
    public String getOutContractId() {
        return this.OutContractId;
    }

    /**
     * Set 机构合同主键（系统有唯一性校验），建议使用合同表的主键ID，防止重复添加合同
     * @param OutContractId 机构合同主键（系统有唯一性校验），建议使用合同表的主键ID，防止重复添加合同
     */
    public void setOutContractId(String OutContractId) {
        this.OutContractId = OutContractId;
    }

    /**
     * Get 合同编号（系统有唯一性校验） 
     * @return Code 合同编号（系统有唯一性校验）
     */
    public String getCode() {
        return this.Code;
    }

    /**
     * Set 合同编号（系统有唯一性校验）
     * @param Code 合同编号（系统有唯一性校验）
     */
    public void setCode(String Code) {
        this.Code = Code;
    }

    /**
     * Get 支付方式编号 
     * @return PaymentId 支付方式编号
     */
    public String getPaymentId() {
        return this.PaymentId;
    }

    /**
     * Set 支付方式编号
     * @param PaymentId 支付方式编号
     */
    public void setPaymentId(String PaymentId) {
        this.PaymentId = PaymentId;
    }

    /**
     * Get 支付方式行业分类编号 
     * @return PaymentClassificationId 支付方式行业分类编号
     */
    public String getPaymentClassificationId() {
        return this.PaymentClassificationId;
    }

    /**
     * Set 支付方式行业分类编号
     * @param PaymentClassificationId 支付方式行业分类编号
     */
    public void setPaymentClassificationId(String PaymentClassificationId) {
        this.PaymentClassificationId = PaymentClassificationId;
    }

    /**
     * Get 封顶值（分为单位，无封顶填0） 
     * @return PaymentClassificationLimit 封顶值（分为单位，无封顶填0）
     */
    public String getPaymentClassificationLimit() {
        return this.PaymentClassificationLimit;
    }

    /**
     * Set 封顶值（分为单位，无封顶填0）
     * @param PaymentClassificationLimit 封顶值（分为单位，无封顶填0）
     */
    public void setPaymentClassificationLimit(String PaymentClassificationLimit) {
        this.PaymentClassificationLimit = PaymentClassificationLimit;
    }

    /**
     * Get 商户编号 
     * @return MerchantNo 商户编号
     */
    public String getMerchantNo() {
        return this.MerchantNo;
    }

    /**
     * Set 商户编号
     * @param MerchantNo 商户编号
     */
    public void setMerchantNo(String MerchantNo) {
        this.MerchantNo = MerchantNo;
    }

    /**
     * Get 签约扣率百分比（如：0.32） 
     * @return Fee 签约扣率百分比（如：0.32）
     */
    public String getFee() {
        return this.Fee;
    }

    /**
     * Set 签约扣率百分比（如：0.32）
     * @param Fee 签约扣率百分比（如：0.32）
     */
    public void setFee(String Fee) {
        this.Fee = Fee;
    }

    /**
     * Get 合同生效日期（yyyy-mm-dd） 
     * @return StartDate 合同生效日期（yyyy-mm-dd）
     */
    public String getStartDate() {
        return this.StartDate;
    }

    /**
     * Set 合同生效日期（yyyy-mm-dd）
     * @param StartDate 合同生效日期（yyyy-mm-dd）
     */
    public void setStartDate(String StartDate) {
        this.StartDate = StartDate;
    }

    /**
     * Get 合同过期日期（yyyy-mm-dd） 
     * @return EndDate 合同过期日期（yyyy-mm-dd）
     */
    public String getEndDate() {
        return this.EndDate;
    }

    /**
     * Set 合同过期日期（yyyy-mm-dd）
     * @param EndDate 合同过期日期（yyyy-mm-dd）
     */
    public void setEndDate(String EndDate) {
        this.EndDate = EndDate;
    }

    /**
     * Get 合同签约人 
     * @return SignMan 合同签约人
     */
    public String getSignMan() {
        return this.SignMan;
    }

    /**
     * Set 合同签约人
     * @param SignMan 合同签约人
     */
    public void setSignMan(String SignMan) {
        this.SignMan = SignMan;
    }

    /**
     * Get 签购单名称，建议使用商户招牌名称 
     * @return SignName 签购单名称，建议使用商户招牌名称
     */
    public String getSignName() {
        return this.SignName;
    }

    /**
     * Set 签购单名称，建议使用商户招牌名称
     * @param SignName 签购单名称，建议使用商户招牌名称
     */
    public void setSignName(String SignName) {
        this.SignName = SignName;
    }

    /**
     * Get 合同签署日期（yyyy-mm-dd） 
     * @return SignDate 合同签署日期（yyyy-mm-dd）
     */
    public String getSignDate() {
        return this.SignDate;
    }

    /**
     * Set 合同签署日期（yyyy-mm-dd）
     * @param SignDate 合同签署日期（yyyy-mm-dd）
     */
    public void setSignDate(String SignDate) {
        this.SignDate = SignDate;
    }

    /**
     * Get 是否自动续签（1是，0否） 
     * @return AutoSign 是否自动续签（1是，0否）
     */
    public String getAutoSign() {
        return this.AutoSign;
    }

    /**
     * Set 是否自动续签（1是，0否）
     * @param AutoSign 是否自动续签（1是，0否）
     */
    public void setAutoSign(String AutoSign) {
        this.AutoSign = AutoSign;
    }

    /**
     * Get 联系人 
     * @return Contact 联系人
     */
    public String getContact() {
        return this.Contact;
    }

    /**
     * Set 联系人
     * @param Contact 联系人
     */
    public void setContact(String Contact) {
        this.Contact = Contact;
    }

    /**
     * Get 联系人电话 
     * @return ContactTelephone 联系人电话
     */
    public String getContactTelephone() {
        return this.ContactTelephone;
    }

    /**
     * Set 联系人电话
     * @param ContactTelephone 联系人电话
     */
    public void setContactTelephone(String ContactTelephone) {
        this.ContactTelephone = ContactTelephone;
    }

    /**
     * Get 合同照片【私密区】 
     * @return PictureOne 合同照片【私密区】
     */
    public String getPictureOne() {
        return this.PictureOne;
    }

    /**
     * Set 合同照片【私密区】
     * @param PictureOne 合同照片【私密区】
     */
    public void setPictureOne(String PictureOne) {
        this.PictureOne = PictureOne;
    }

    /**
     * Get 合同照片【私密区】 
     * @return PictureTwo 合同照片【私密区】
     */
    public String getPictureTwo() {
        return this.PictureTwo;
    }

    /**
     * Set 合同照片【私密区】
     * @param PictureTwo 合同照片【私密区】
     */
    public void setPictureTwo(String PictureTwo) {
        this.PictureTwo = PictureTwo;
    }

    /**
     * Get 渠道扩展字段，json格式 
     * @return ChannelExtJson 渠道扩展字段，json格式
     */
    public String getChannelExtJson() {
        return this.ChannelExtJson;
    }

    /**
     * Set 渠道扩展字段，json格式
     * @param ChannelExtJson 渠道扩展字段，json格式
     */
    public void setChannelExtJson(String ChannelExtJson) {
        this.ChannelExtJson = ChannelExtJson;
    }

    /**
     * Get 沙箱环境填sandbox，正式环境不填 
     * @return Profile 沙箱环境填sandbox，正式环境不填
     */
    public String getProfile() {
        return this.Profile;
    }

    /**
     * Set 沙箱环境填sandbox，正式环境不填
     * @param Profile 沙箱环境填sandbox，正式环境不填
     */
    public void setProfile(String Profile) {
        this.Profile = Profile;
    }

    /**
     * Get 合同选项1（不同支付方式规则不一样，请以支付方式规定的格式传值） 
     * @return PaymentOptionOne 合同选项1（不同支付方式规则不一样，请以支付方式规定的格式传值）
     */
    public String getPaymentOptionOne() {
        return this.PaymentOptionOne;
    }

    /**
     * Set 合同选项1（不同支付方式规则不一样，请以支付方式规定的格式传值）
     * @param PaymentOptionOne 合同选项1（不同支付方式规则不一样，请以支付方式规定的格式传值）
     */
    public void setPaymentOptionOne(String PaymentOptionOne) {
        this.PaymentOptionOne = PaymentOptionOne;
    }

    /**
     * Get 合同选项2（不同支付方式规则不一样，请以支付方式规定的格式传值） 
     * @return PaymentOptionTwo 合同选项2（不同支付方式规则不一样，请以支付方式规定的格式传值）
     */
    public String getPaymentOptionTwo() {
        return this.PaymentOptionTwo;
    }

    /**
     * Set 合同选项2（不同支付方式规则不一样，请以支付方式规定的格式传值）
     * @param PaymentOptionTwo 合同选项2（不同支付方式规则不一样，请以支付方式规定的格式传值）
     */
    public void setPaymentOptionTwo(String PaymentOptionTwo) {
        this.PaymentOptionTwo = PaymentOptionTwo;
    }

    /**
     * Get 合同选项3（不同支付方式规则不一样，请以支付方式规定的格式传值） 
     * @return PaymentOptionThree 合同选项3（不同支付方式规则不一样，请以支付方式规定的格式传值）
     */
    public String getPaymentOptionThree() {
        return this.PaymentOptionThree;
    }

    /**
     * Set 合同选项3（不同支付方式规则不一样，请以支付方式规定的格式传值）
     * @param PaymentOptionThree 合同选项3（不同支付方式规则不一样，请以支付方式规定的格式传值）
     */
    public void setPaymentOptionThree(String PaymentOptionThree) {
        this.PaymentOptionThree = PaymentOptionThree;
    }

    /**
     * Get 合同选项4（不同支付方式规则不一样，请以支付方式规定的格式传值） 
     * @return PaymentOptionFour 合同选项4（不同支付方式规则不一样，请以支付方式规定的格式传值）
     */
    public String getPaymentOptionFour() {
        return this.PaymentOptionFour;
    }

    /**
     * Set 合同选项4（不同支付方式规则不一样，请以支付方式规定的格式传值）
     * @param PaymentOptionFour 合同选项4（不同支付方式规则不一样，请以支付方式规定的格式传值）
     */
    public void setPaymentOptionFour(String PaymentOptionFour) {
        this.PaymentOptionFour = PaymentOptionFour;
    }

    /**
     * Get 合同证书选项1（不同支付方式规则不一样，请以支付方式规定的格式传值） 
     * @return PaymentOptionFive 合同证书选项1（不同支付方式规则不一样，请以支付方式规定的格式传值）
     */
    public String getPaymentOptionFive() {
        return this.PaymentOptionFive;
    }

    /**
     * Set 合同证书选项1（不同支付方式规则不一样，请以支付方式规定的格式传值）
     * @param PaymentOptionFive 合同证书选项1（不同支付方式规则不一样，请以支付方式规定的格式传值）
     */
    public void setPaymentOptionFive(String PaymentOptionFive) {
        this.PaymentOptionFive = PaymentOptionFive;
    }

    /**
     * Get 合同证书选项2（不同支付方式规则不一样，请以支付方式规定的格式传值） 
     * @return PaymentOptionSix 合同证书选项2（不同支付方式规则不一样，请以支付方式规定的格式传值）
     */
    public String getPaymentOptionSix() {
        return this.PaymentOptionSix;
    }

    /**
     * Set 合同证书选项2（不同支付方式规则不一样，请以支付方式规定的格式传值）
     * @param PaymentOptionSix 合同证书选项2（不同支付方式规则不一样，请以支付方式规定的格式传值）
     */
    public void setPaymentOptionSix(String PaymentOptionSix) {
        this.PaymentOptionSix = PaymentOptionSix;
    }

    /**
     * Get 合同选项5（不同支付方式规则不一样，请以支付方式规定的格式传值） 
     * @return PaymentOptionSeven 合同选项5（不同支付方式规则不一样，请以支付方式规定的格式传值）
     */
    public String getPaymentOptionSeven() {
        return this.PaymentOptionSeven;
    }

    /**
     * Set 合同选项5（不同支付方式规则不一样，请以支付方式规定的格式传值）
     * @param PaymentOptionSeven 合同选项5（不同支付方式规则不一样，请以支付方式规定的格式传值）
     */
    public void setPaymentOptionSeven(String PaymentOptionSeven) {
        this.PaymentOptionSeven = PaymentOptionSeven;
    }

    /**
     * Get 合同选项6（不同支付方式规则不一样，请以支付方式规定的格式传值） 
     * @return PaymentOptionOther 合同选项6（不同支付方式规则不一样，请以支付方式规定的格式传值）
     */
    public String getPaymentOptionOther() {
        return this.PaymentOptionOther;
    }

    /**
     * Set 合同选项6（不同支付方式规则不一样，请以支付方式规定的格式传值）
     * @param PaymentOptionOther 合同选项6（不同支付方式规则不一样，请以支付方式规定的格式传值）
     */
    public void setPaymentOptionOther(String PaymentOptionOther) {
        this.PaymentOptionOther = PaymentOptionOther;
    }

    /**
     * Get 合同选项8 
     * @return PaymentOptionTen 合同选项8
     */
    public String getPaymentOptionTen() {
        return this.PaymentOptionTen;
    }

    /**
     * Set 合同选项8
     * @param PaymentOptionTen 合同选项8
     */
    public void setPaymentOptionTen(String PaymentOptionTen) {
        this.PaymentOptionTen = PaymentOptionTen;
    }

    /**
     * Get 合同选项7（不同支付方式规则不一样，请以支付方式规定的格式传值） 
     * @return PaymentOptionNine 合同选项7（不同支付方式规则不一样，请以支付方式规定的格式传值）
     */
    public String getPaymentOptionNine() {
        return this.PaymentOptionNine;
    }

    /**
     * Set 合同选项7（不同支付方式规则不一样，请以支付方式规定的格式传值）
     * @param PaymentOptionNine 合同选项7（不同支付方式规则不一样，请以支付方式规定的格式传值）
     */
    public void setPaymentOptionNine(String PaymentOptionNine) {
        this.PaymentOptionNine = PaymentOptionNine;
    }

    public AddContractRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddContractRequest(AddContractRequest source) {
        if (source.OpenId != null) {
            this.OpenId = new String(source.OpenId);
        }
        if (source.OpenKey != null) {
            this.OpenKey = new String(source.OpenKey);
        }
        if (source.OutContractId != null) {
            this.OutContractId = new String(source.OutContractId);
        }
        if (source.Code != null) {
            this.Code = new String(source.Code);
        }
        if (source.PaymentId != null) {
            this.PaymentId = new String(source.PaymentId);
        }
        if (source.PaymentClassificationId != null) {
            this.PaymentClassificationId = new String(source.PaymentClassificationId);
        }
        if (source.PaymentClassificationLimit != null) {
            this.PaymentClassificationLimit = new String(source.PaymentClassificationLimit);
        }
        if (source.MerchantNo != null) {
            this.MerchantNo = new String(source.MerchantNo);
        }
        if (source.Fee != null) {
            this.Fee = new String(source.Fee);
        }
        if (source.StartDate != null) {
            this.StartDate = new String(source.StartDate);
        }
        if (source.EndDate != null) {
            this.EndDate = new String(source.EndDate);
        }
        if (source.SignMan != null) {
            this.SignMan = new String(source.SignMan);
        }
        if (source.SignName != null) {
            this.SignName = new String(source.SignName);
        }
        if (source.SignDate != null) {
            this.SignDate = new String(source.SignDate);
        }
        if (source.AutoSign != null) {
            this.AutoSign = new String(source.AutoSign);
        }
        if (source.Contact != null) {
            this.Contact = new String(source.Contact);
        }
        if (source.ContactTelephone != null) {
            this.ContactTelephone = new String(source.ContactTelephone);
        }
        if (source.PictureOne != null) {
            this.PictureOne = new String(source.PictureOne);
        }
        if (source.PictureTwo != null) {
            this.PictureTwo = new String(source.PictureTwo);
        }
        if (source.ChannelExtJson != null) {
            this.ChannelExtJson = new String(source.ChannelExtJson);
        }
        if (source.Profile != null) {
            this.Profile = new String(source.Profile);
        }
        if (source.PaymentOptionOne != null) {
            this.PaymentOptionOne = new String(source.PaymentOptionOne);
        }
        if (source.PaymentOptionTwo != null) {
            this.PaymentOptionTwo = new String(source.PaymentOptionTwo);
        }
        if (source.PaymentOptionThree != null) {
            this.PaymentOptionThree = new String(source.PaymentOptionThree);
        }
        if (source.PaymentOptionFour != null) {
            this.PaymentOptionFour = new String(source.PaymentOptionFour);
        }
        if (source.PaymentOptionFive != null) {
            this.PaymentOptionFive = new String(source.PaymentOptionFive);
        }
        if (source.PaymentOptionSix != null) {
            this.PaymentOptionSix = new String(source.PaymentOptionSix);
        }
        if (source.PaymentOptionSeven != null) {
            this.PaymentOptionSeven = new String(source.PaymentOptionSeven);
        }
        if (source.PaymentOptionOther != null) {
            this.PaymentOptionOther = new String(source.PaymentOptionOther);
        }
        if (source.PaymentOptionTen != null) {
            this.PaymentOptionTen = new String(source.PaymentOptionTen);
        }
        if (source.PaymentOptionNine != null) {
            this.PaymentOptionNine = new String(source.PaymentOptionNine);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OpenId", this.OpenId);
        this.setParamSimple(map, prefix + "OpenKey", this.OpenKey);
        this.setParamSimple(map, prefix + "OutContractId", this.OutContractId);
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "PaymentId", this.PaymentId);
        this.setParamSimple(map, prefix + "PaymentClassificationId", this.PaymentClassificationId);
        this.setParamSimple(map, prefix + "PaymentClassificationLimit", this.PaymentClassificationLimit);
        this.setParamSimple(map, prefix + "MerchantNo", this.MerchantNo);
        this.setParamSimple(map, prefix + "Fee", this.Fee);
        this.setParamSimple(map, prefix + "StartDate", this.StartDate);
        this.setParamSimple(map, prefix + "EndDate", this.EndDate);
        this.setParamSimple(map, prefix + "SignMan", this.SignMan);
        this.setParamSimple(map, prefix + "SignName", this.SignName);
        this.setParamSimple(map, prefix + "SignDate", this.SignDate);
        this.setParamSimple(map, prefix + "AutoSign", this.AutoSign);
        this.setParamSimple(map, prefix + "Contact", this.Contact);
        this.setParamSimple(map, prefix + "ContactTelephone", this.ContactTelephone);
        this.setParamSimple(map, prefix + "PictureOne", this.PictureOne);
        this.setParamSimple(map, prefix + "PictureTwo", this.PictureTwo);
        this.setParamSimple(map, prefix + "ChannelExtJson", this.ChannelExtJson);
        this.setParamSimple(map, prefix + "Profile", this.Profile);
        this.setParamSimple(map, prefix + "PaymentOptionOne", this.PaymentOptionOne);
        this.setParamSimple(map, prefix + "PaymentOptionTwo", this.PaymentOptionTwo);
        this.setParamSimple(map, prefix + "PaymentOptionThree", this.PaymentOptionThree);
        this.setParamSimple(map, prefix + "PaymentOptionFour", this.PaymentOptionFour);
        this.setParamSimple(map, prefix + "PaymentOptionFive", this.PaymentOptionFive);
        this.setParamSimple(map, prefix + "PaymentOptionSix", this.PaymentOptionSix);
        this.setParamSimple(map, prefix + "PaymentOptionSeven", this.PaymentOptionSeven);
        this.setParamSimple(map, prefix + "PaymentOptionOther", this.PaymentOptionOther);
        this.setParamSimple(map, prefix + "PaymentOptionTen", this.PaymentOptionTen);
        this.setParamSimple(map, prefix + "PaymentOptionNine", this.PaymentOptionNine);

    }
}

