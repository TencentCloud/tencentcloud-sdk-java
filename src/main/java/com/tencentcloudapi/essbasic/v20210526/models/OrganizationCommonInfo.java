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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OrganizationCommonInfo extends AbstractModel {

    /**
    * 组织机构名称。
请确认该名称与企业营业执照中注册的名称一致。
如果名称中包含英文括号()，请使用中文括号（）代替。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OrganizationName")
    @Expose
    private String OrganizationName;

    /**
    * 组织机构企业统一社会信用代码。
请确认该企业统一社会信用代码与企业营业执照中注册的统一社会信用代码一致。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UniformSocialCreditCode")
    @Expose
    private String UniformSocialCreditCode;

    /**
    * 组织机构法人的姓名。
请确认该企业统一社会信用代码与企业营业执照中注册的法人姓名一致。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LegalName")
    @Expose
    private String LegalName;

    /**
    * 组织机构法人的证件类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LegalIdCardType")
    @Expose
    private String LegalIdCardType;

    /**
    * 组织机构法人的证件号码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LegalIdCardNumber")
    @Expose
    private String LegalIdCardNumber;

    /**
    * 组织机构超管姓名。

注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AdminName")
    @Expose
    private String AdminName;

    /**
    * 组织机构超管手机号。

注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AdminMobile")
    @Expose
    private String AdminMobile;

    /**
    * 组织机构超管证件类型

注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AdminIdCardType")
    @Expose
    private String AdminIdCardType;

    /**
    * 组织机构超管证件号码

注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AdminIdCardNumber")
    @Expose
    private String AdminIdCardNumber;

    /**
    * 原超管姓名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OldAdminName")
    @Expose
    private String OldAdminName;

    /**
    * 原超管手机号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OldAdminMobile")
    @Expose
    private String OldAdminMobile;

    /**
    * 原超管证件类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OldAdminIdCardType")
    @Expose
    private String OldAdminIdCardType;

    /**
    * 原超管证件号码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OldAdminIdCardNumber")
    @Expose
    private String OldAdminIdCardNumber;

    /**
     * Get 组织机构名称。
请确认该名称与企业营业执照中注册的名称一致。
如果名称中包含英文括号()，请使用中文括号（）代替。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OrganizationName 组织机构名称。
请确认该名称与企业营业执照中注册的名称一致。
如果名称中包含英文括号()，请使用中文括号（）代替。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOrganizationName() {
        return this.OrganizationName;
    }

    /**
     * Set 组织机构名称。
请确认该名称与企业营业执照中注册的名称一致。
如果名称中包含英文括号()，请使用中文括号（）代替。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OrganizationName 组织机构名称。
请确认该名称与企业营业执照中注册的名称一致。
如果名称中包含英文括号()，请使用中文括号（）代替。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOrganizationName(String OrganizationName) {
        this.OrganizationName = OrganizationName;
    }

    /**
     * Get 组织机构企业统一社会信用代码。
请确认该企业统一社会信用代码与企业营业执照中注册的统一社会信用代码一致。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UniformSocialCreditCode 组织机构企业统一社会信用代码。
请确认该企业统一社会信用代码与企业营业执照中注册的统一社会信用代码一致。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUniformSocialCreditCode() {
        return this.UniformSocialCreditCode;
    }

    /**
     * Set 组织机构企业统一社会信用代码。
请确认该企业统一社会信用代码与企业营业执照中注册的统一社会信用代码一致。
注意：此字段可能返回 null，表示取不到有效值。
     * @param UniformSocialCreditCode 组织机构企业统一社会信用代码。
请确认该企业统一社会信用代码与企业营业执照中注册的统一社会信用代码一致。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUniformSocialCreditCode(String UniformSocialCreditCode) {
        this.UniformSocialCreditCode = UniformSocialCreditCode;
    }

    /**
     * Get 组织机构法人的姓名。
请确认该企业统一社会信用代码与企业营业执照中注册的法人姓名一致。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LegalName 组织机构法人的姓名。
请确认该企业统一社会信用代码与企业营业执照中注册的法人姓名一致。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLegalName() {
        return this.LegalName;
    }

    /**
     * Set 组织机构法人的姓名。
请确认该企业统一社会信用代码与企业营业执照中注册的法人姓名一致。
注意：此字段可能返回 null，表示取不到有效值。
     * @param LegalName 组织机构法人的姓名。
请确认该企业统一社会信用代码与企业营业执照中注册的法人姓名一致。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLegalName(String LegalName) {
        this.LegalName = LegalName;
    }

    /**
     * Get 组织机构法人的证件类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LegalIdCardType 组织机构法人的证件类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLegalIdCardType() {
        return this.LegalIdCardType;
    }

    /**
     * Set 组织机构法人的证件类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param LegalIdCardType 组织机构法人的证件类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLegalIdCardType(String LegalIdCardType) {
        this.LegalIdCardType = LegalIdCardType;
    }

    /**
     * Get 组织机构法人的证件号码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LegalIdCardNumber 组织机构法人的证件号码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLegalIdCardNumber() {
        return this.LegalIdCardNumber;
    }

    /**
     * Set 组织机构法人的证件号码
注意：此字段可能返回 null，表示取不到有效值。
     * @param LegalIdCardNumber 组织机构法人的证件号码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLegalIdCardNumber(String LegalIdCardNumber) {
        this.LegalIdCardNumber = LegalIdCardNumber;
    }

    /**
     * Get 组织机构超管姓名。

注意：此字段可能返回 null，表示取不到有效值。 
     * @return AdminName 组织机构超管姓名。

注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAdminName() {
        return this.AdminName;
    }

    /**
     * Set 组织机构超管姓名。

注意：此字段可能返回 null，表示取不到有效值。
     * @param AdminName 组织机构超管姓名。

注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAdminName(String AdminName) {
        this.AdminName = AdminName;
    }

    /**
     * Get 组织机构超管手机号。

注意：此字段可能返回 null，表示取不到有效值。 
     * @return AdminMobile 组织机构超管手机号。

注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAdminMobile() {
        return this.AdminMobile;
    }

    /**
     * Set 组织机构超管手机号。

注意：此字段可能返回 null，表示取不到有效值。
     * @param AdminMobile 组织机构超管手机号。

注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAdminMobile(String AdminMobile) {
        this.AdminMobile = AdminMobile;
    }

    /**
     * Get 组织机构超管证件类型

注意：此字段可能返回 null，表示取不到有效值。 
     * @return AdminIdCardType 组织机构超管证件类型

注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAdminIdCardType() {
        return this.AdminIdCardType;
    }

    /**
     * Set 组织机构超管证件类型

注意：此字段可能返回 null，表示取不到有效值。
     * @param AdminIdCardType 组织机构超管证件类型

注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAdminIdCardType(String AdminIdCardType) {
        this.AdminIdCardType = AdminIdCardType;
    }

    /**
     * Get 组织机构超管证件号码

注意：此字段可能返回 null，表示取不到有效值。 
     * @return AdminIdCardNumber 组织机构超管证件号码

注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAdminIdCardNumber() {
        return this.AdminIdCardNumber;
    }

    /**
     * Set 组织机构超管证件号码

注意：此字段可能返回 null，表示取不到有效值。
     * @param AdminIdCardNumber 组织机构超管证件号码

注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAdminIdCardNumber(String AdminIdCardNumber) {
        this.AdminIdCardNumber = AdminIdCardNumber;
    }

    /**
     * Get 原超管姓名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OldAdminName 原超管姓名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOldAdminName() {
        return this.OldAdminName;
    }

    /**
     * Set 原超管姓名
注意：此字段可能返回 null，表示取不到有效值。
     * @param OldAdminName 原超管姓名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOldAdminName(String OldAdminName) {
        this.OldAdminName = OldAdminName;
    }

    /**
     * Get 原超管手机号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OldAdminMobile 原超管手机号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOldAdminMobile() {
        return this.OldAdminMobile;
    }

    /**
     * Set 原超管手机号
注意：此字段可能返回 null，表示取不到有效值。
     * @param OldAdminMobile 原超管手机号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOldAdminMobile(String OldAdminMobile) {
        this.OldAdminMobile = OldAdminMobile;
    }

    /**
     * Get 原超管证件类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OldAdminIdCardType 原超管证件类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOldAdminIdCardType() {
        return this.OldAdminIdCardType;
    }

    /**
     * Set 原超管证件类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param OldAdminIdCardType 原超管证件类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOldAdminIdCardType(String OldAdminIdCardType) {
        this.OldAdminIdCardType = OldAdminIdCardType;
    }

    /**
     * Get 原超管证件号码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OldAdminIdCardNumber 原超管证件号码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOldAdminIdCardNumber() {
        return this.OldAdminIdCardNumber;
    }

    /**
     * Set 原超管证件号码
注意：此字段可能返回 null，表示取不到有效值。
     * @param OldAdminIdCardNumber 原超管证件号码
注意：此字段可能返回 null，表示取不到有效值。
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

