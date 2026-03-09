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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OrganizationCommonInfo extends AbstractModel {

    /**
    * <p>组织机构名称。<br>请确认该名称与企业营业执照中注册的名称一致。<br>如果名称中包含英文括号()，请使用中文括号（）代替。</p>
    */
    @SerializedName("OrganizationName")
    @Expose
    private String OrganizationName;

    /**
    * <p>组织机构企业统一社会信用代码。<br>请确认该企业统一社会信用代码与企业营业执照中注册的统一社会信用代码一致。</p>
    */
    @SerializedName("UniformSocialCreditCode")
    @Expose
    private String UniformSocialCreditCode;

    /**
    * <p>组织机构法人的姓名。<br>请确认该企业统一社会信用代码与企业营业执照中注册的法人姓名一致。</p>
    */
    @SerializedName("LegalName")
    @Expose
    private String LegalName;

    /**
    * <p>组织机构法人的证件类型</p><p>枚举值：</p><ul><li>居民身份证： 中国大陆居民身份证</li></ul>
    */
    @SerializedName("LegalIdCardType")
    @Expose
    private String LegalIdCardType;

    /**
    * <p>组织机构法人的证件号码</p>
    */
    @SerializedName("LegalIdCardNumber")
    @Expose
    private String LegalIdCardNumber;

    /**
    * <p>组织机构超管姓名。</p>
    */
    @SerializedName("AdminName")
    @Expose
    private String AdminName;

    /**
    * <p>组织机构超管手机号。</p>
    */
    @SerializedName("AdminMobile")
    @Expose
    private String AdminMobile;

    /**
    * <p>组织机构超管证件类型</p><p>枚举值：</p><ul><li>居民身份证： 中国大陆居民身份证</li></ul>
    */
    @SerializedName("AdminIdCardType")
    @Expose
    private String AdminIdCardType;

    /**
    * <p>组织机构超管证件号码</p>
    */
    @SerializedName("AdminIdCardNumber")
    @Expose
    private String AdminIdCardNumber;

    /**
    * <p>原超管姓名</p>
    */
    @SerializedName("OldAdminName")
    @Expose
    private String OldAdminName;

    /**
    * <p>原超管手机号</p>
    */
    @SerializedName("OldAdminMobile")
    @Expose
    private String OldAdminMobile;

    /**
    * <p>原超管证件类型</p><p>枚举值：</p><ul><li>居民身份证： 中国大陆居民身份证</li></ul>
    */
    @SerializedName("OldAdminIdCardType")
    @Expose
    private String OldAdminIdCardType;

    /**
    * <p>原超管证件号码</p>
    */
    @SerializedName("OldAdminIdCardNumber")
    @Expose
    private String OldAdminIdCardNumber;

    /**
     * Get <p>组织机构名称。<br>请确认该名称与企业营业执照中注册的名称一致。<br>如果名称中包含英文括号()，请使用中文括号（）代替。</p> 
     * @return OrganizationName <p>组织机构名称。<br>请确认该名称与企业营业执照中注册的名称一致。<br>如果名称中包含英文括号()，请使用中文括号（）代替。</p>
     */
    public String getOrganizationName() {
        return this.OrganizationName;
    }

    /**
     * Set <p>组织机构名称。<br>请确认该名称与企业营业执照中注册的名称一致。<br>如果名称中包含英文括号()，请使用中文括号（）代替。</p>
     * @param OrganizationName <p>组织机构名称。<br>请确认该名称与企业营业执照中注册的名称一致。<br>如果名称中包含英文括号()，请使用中文括号（）代替。</p>
     */
    public void setOrganizationName(String OrganizationName) {
        this.OrganizationName = OrganizationName;
    }

    /**
     * Get <p>组织机构企业统一社会信用代码。<br>请确认该企业统一社会信用代码与企业营业执照中注册的统一社会信用代码一致。</p> 
     * @return UniformSocialCreditCode <p>组织机构企业统一社会信用代码。<br>请确认该企业统一社会信用代码与企业营业执照中注册的统一社会信用代码一致。</p>
     */
    public String getUniformSocialCreditCode() {
        return this.UniformSocialCreditCode;
    }

    /**
     * Set <p>组织机构企业统一社会信用代码。<br>请确认该企业统一社会信用代码与企业营业执照中注册的统一社会信用代码一致。</p>
     * @param UniformSocialCreditCode <p>组织机构企业统一社会信用代码。<br>请确认该企业统一社会信用代码与企业营业执照中注册的统一社会信用代码一致。</p>
     */
    public void setUniformSocialCreditCode(String UniformSocialCreditCode) {
        this.UniformSocialCreditCode = UniformSocialCreditCode;
    }

    /**
     * Get <p>组织机构法人的姓名。<br>请确认该企业统一社会信用代码与企业营业执照中注册的法人姓名一致。</p> 
     * @return LegalName <p>组织机构法人的姓名。<br>请确认该企业统一社会信用代码与企业营业执照中注册的法人姓名一致。</p>
     */
    public String getLegalName() {
        return this.LegalName;
    }

    /**
     * Set <p>组织机构法人的姓名。<br>请确认该企业统一社会信用代码与企业营业执照中注册的法人姓名一致。</p>
     * @param LegalName <p>组织机构法人的姓名。<br>请确认该企业统一社会信用代码与企业营业执照中注册的法人姓名一致。</p>
     */
    public void setLegalName(String LegalName) {
        this.LegalName = LegalName;
    }

    /**
     * Get <p>组织机构法人的证件类型</p><p>枚举值：</p><ul><li>居民身份证： 中国大陆居民身份证</li></ul> 
     * @return LegalIdCardType <p>组织机构法人的证件类型</p><p>枚举值：</p><ul><li>居民身份证： 中国大陆居民身份证</li></ul>
     */
    public String getLegalIdCardType() {
        return this.LegalIdCardType;
    }

    /**
     * Set <p>组织机构法人的证件类型</p><p>枚举值：</p><ul><li>居民身份证： 中国大陆居民身份证</li></ul>
     * @param LegalIdCardType <p>组织机构法人的证件类型</p><p>枚举值：</p><ul><li>居民身份证： 中国大陆居民身份证</li></ul>
     */
    public void setLegalIdCardType(String LegalIdCardType) {
        this.LegalIdCardType = LegalIdCardType;
    }

    /**
     * Get <p>组织机构法人的证件号码</p> 
     * @return LegalIdCardNumber <p>组织机构法人的证件号码</p>
     */
    public String getLegalIdCardNumber() {
        return this.LegalIdCardNumber;
    }

    /**
     * Set <p>组织机构法人的证件号码</p>
     * @param LegalIdCardNumber <p>组织机构法人的证件号码</p>
     */
    public void setLegalIdCardNumber(String LegalIdCardNumber) {
        this.LegalIdCardNumber = LegalIdCardNumber;
    }

    /**
     * Get <p>组织机构超管姓名。</p> 
     * @return AdminName <p>组织机构超管姓名。</p>
     */
    public String getAdminName() {
        return this.AdminName;
    }

    /**
     * Set <p>组织机构超管姓名。</p>
     * @param AdminName <p>组织机构超管姓名。</p>
     */
    public void setAdminName(String AdminName) {
        this.AdminName = AdminName;
    }

    /**
     * Get <p>组织机构超管手机号。</p> 
     * @return AdminMobile <p>组织机构超管手机号。</p>
     */
    public String getAdminMobile() {
        return this.AdminMobile;
    }

    /**
     * Set <p>组织机构超管手机号。</p>
     * @param AdminMobile <p>组织机构超管手机号。</p>
     */
    public void setAdminMobile(String AdminMobile) {
        this.AdminMobile = AdminMobile;
    }

    /**
     * Get <p>组织机构超管证件类型</p><p>枚举值：</p><ul><li>居民身份证： 中国大陆居民身份证</li></ul> 
     * @return AdminIdCardType <p>组织机构超管证件类型</p><p>枚举值：</p><ul><li>居民身份证： 中国大陆居民身份证</li></ul>
     */
    public String getAdminIdCardType() {
        return this.AdminIdCardType;
    }

    /**
     * Set <p>组织机构超管证件类型</p><p>枚举值：</p><ul><li>居民身份证： 中国大陆居民身份证</li></ul>
     * @param AdminIdCardType <p>组织机构超管证件类型</p><p>枚举值：</p><ul><li>居民身份证： 中国大陆居民身份证</li></ul>
     */
    public void setAdminIdCardType(String AdminIdCardType) {
        this.AdminIdCardType = AdminIdCardType;
    }

    /**
     * Get <p>组织机构超管证件号码</p> 
     * @return AdminIdCardNumber <p>组织机构超管证件号码</p>
     */
    public String getAdminIdCardNumber() {
        return this.AdminIdCardNumber;
    }

    /**
     * Set <p>组织机构超管证件号码</p>
     * @param AdminIdCardNumber <p>组织机构超管证件号码</p>
     */
    public void setAdminIdCardNumber(String AdminIdCardNumber) {
        this.AdminIdCardNumber = AdminIdCardNumber;
    }

    /**
     * Get <p>原超管姓名</p> 
     * @return OldAdminName <p>原超管姓名</p>
     */
    public String getOldAdminName() {
        return this.OldAdminName;
    }

    /**
     * Set <p>原超管姓名</p>
     * @param OldAdminName <p>原超管姓名</p>
     */
    public void setOldAdminName(String OldAdminName) {
        this.OldAdminName = OldAdminName;
    }

    /**
     * Get <p>原超管手机号</p> 
     * @return OldAdminMobile <p>原超管手机号</p>
     */
    public String getOldAdminMobile() {
        return this.OldAdminMobile;
    }

    /**
     * Set <p>原超管手机号</p>
     * @param OldAdminMobile <p>原超管手机号</p>
     */
    public void setOldAdminMobile(String OldAdminMobile) {
        this.OldAdminMobile = OldAdminMobile;
    }

    /**
     * Get <p>原超管证件类型</p><p>枚举值：</p><ul><li>居民身份证： 中国大陆居民身份证</li></ul> 
     * @return OldAdminIdCardType <p>原超管证件类型</p><p>枚举值：</p><ul><li>居民身份证： 中国大陆居民身份证</li></ul>
     */
    public String getOldAdminIdCardType() {
        return this.OldAdminIdCardType;
    }

    /**
     * Set <p>原超管证件类型</p><p>枚举值：</p><ul><li>居民身份证： 中国大陆居民身份证</li></ul>
     * @param OldAdminIdCardType <p>原超管证件类型</p><p>枚举值：</p><ul><li>居民身份证： 中国大陆居民身份证</li></ul>
     */
    public void setOldAdminIdCardType(String OldAdminIdCardType) {
        this.OldAdminIdCardType = OldAdminIdCardType;
    }

    /**
     * Get <p>原超管证件号码</p> 
     * @return OldAdminIdCardNumber <p>原超管证件号码</p>
     */
    public String getOldAdminIdCardNumber() {
        return this.OldAdminIdCardNumber;
    }

    /**
     * Set <p>原超管证件号码</p>
     * @param OldAdminIdCardNumber <p>原超管证件号码</p>
     */
    public void setOldAdminIdCardNumber(String OldAdminIdCardNumber) {
        this.OldAdminIdCardNumber = OldAdminIdCardNumber;
    }

    public OrganizationCommonInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OrganizationCommonInfo(OrganizationCommonInfo source) {
        if (source.OrganizationName != null) {
            this.OrganizationName = new String(source.OrganizationName);
        }
        if (source.UniformSocialCreditCode != null) {
            this.UniformSocialCreditCode = new String(source.UniformSocialCreditCode);
        }
        if (source.LegalName != null) {
            this.LegalName = new String(source.LegalName);
        }
        if (source.LegalIdCardType != null) {
            this.LegalIdCardType = new String(source.LegalIdCardType);
        }
        if (source.LegalIdCardNumber != null) {
            this.LegalIdCardNumber = new String(source.LegalIdCardNumber);
        }
        if (source.AdminName != null) {
            this.AdminName = new String(source.AdminName);
        }
        if (source.AdminMobile != null) {
            this.AdminMobile = new String(source.AdminMobile);
        }
        if (source.AdminIdCardType != null) {
            this.AdminIdCardType = new String(source.AdminIdCardType);
        }
        if (source.AdminIdCardNumber != null) {
            this.AdminIdCardNumber = new String(source.AdminIdCardNumber);
        }
        if (source.OldAdminName != null) {
            this.OldAdminName = new String(source.OldAdminName);
        }
        if (source.OldAdminMobile != null) {
            this.OldAdminMobile = new String(source.OldAdminMobile);
        }
        if (source.OldAdminIdCardType != null) {
            this.OldAdminIdCardType = new String(source.OldAdminIdCardType);
        }
        if (source.OldAdminIdCardNumber != null) {
            this.OldAdminIdCardNumber = new String(source.OldAdminIdCardNumber);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OrganizationName", this.OrganizationName);
        this.setParamSimple(map, prefix + "UniformSocialCreditCode", this.UniformSocialCreditCode);
        this.setParamSimple(map, prefix + "LegalName", this.LegalName);
        this.setParamSimple(map, prefix + "LegalIdCardType", this.LegalIdCardType);
        this.setParamSimple(map, prefix + "LegalIdCardNumber", this.LegalIdCardNumber);
        this.setParamSimple(map, prefix + "AdminName", this.AdminName);
        this.setParamSimple(map, prefix + "AdminMobile", this.AdminMobile);
        this.setParamSimple(map, prefix + "AdminIdCardType", this.AdminIdCardType);
        this.setParamSimple(map, prefix + "AdminIdCardNumber", this.AdminIdCardNumber);
        this.setParamSimple(map, prefix + "OldAdminName", this.OldAdminName);
        this.setParamSimple(map, prefix + "OldAdminMobile", this.OldAdminMobile);
        this.setParamSimple(map, prefix + "OldAdminIdCardType", this.OldAdminIdCardType);
        this.setParamSimple(map, prefix + "OldAdminIdCardNumber", this.OldAdminIdCardNumber);

    }
}

