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

public class RegisterInfo extends AbstractModel{

    /**
    * 法人证件号码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LegalPersonIdCode")
    @Expose
    private String LegalPersonIdCode;

    /**
    * 法人证件类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LegalPersonIdType")
    @Expose
    private String LegalPersonIdType;

    /**
    * 法人名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LegalPersonName")
    @Expose
    private String LegalPersonName;

    /**
    * 公司证件号码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OrganizationCode")
    @Expose
    private String OrganizationCode;

    /**
    * 公司名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OrganizationName")
    @Expose
    private String OrganizationName;

    /**
    * 公司证件类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OrganizationType")
    @Expose
    private String OrganizationType;

    /**
     * Get 法人证件号码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LegalPersonIdCode 法人证件号码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLegalPersonIdCode() {
        return this.LegalPersonIdCode;
    }

    /**
     * Set 法人证件号码
注意：此字段可能返回 null，表示取不到有效值。
     * @param LegalPersonIdCode 法人证件号码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLegalPersonIdCode(String LegalPersonIdCode) {
        this.LegalPersonIdCode = LegalPersonIdCode;
    }

    /**
     * Get 法人证件类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LegalPersonIdType 法人证件类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLegalPersonIdType() {
        return this.LegalPersonIdType;
    }

    /**
     * Set 法人证件类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param LegalPersonIdType 法人证件类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLegalPersonIdType(String LegalPersonIdType) {
        this.LegalPersonIdType = LegalPersonIdType;
    }

    /**
     * Get 法人名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LegalPersonName 法人名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLegalPersonName() {
        return this.LegalPersonName;
    }

    /**
     * Set 法人名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param LegalPersonName 法人名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLegalPersonName(String LegalPersonName) {
        this.LegalPersonName = LegalPersonName;
    }

    /**
     * Get 公司证件号码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OrganizationCode 公司证件号码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOrganizationCode() {
        return this.OrganizationCode;
    }

    /**
     * Set 公司证件号码
注意：此字段可能返回 null，表示取不到有效值。
     * @param OrganizationCode 公司证件号码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOrganizationCode(String OrganizationCode) {
        this.OrganizationCode = OrganizationCode;
    }

    /**
     * Get 公司名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OrganizationName 公司名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOrganizationName() {
        return this.OrganizationName;
    }

    /**
     * Set 公司名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param OrganizationName 公司名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOrganizationName(String OrganizationName) {
        this.OrganizationName = OrganizationName;
    }

    /**
     * Get 公司证件类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OrganizationType 公司证件类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOrganizationType() {
        return this.OrganizationType;
    }

    /**
     * Set 公司证件类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param OrganizationType 公司证件类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOrganizationType(String OrganizationType) {
        this.OrganizationType = OrganizationType;
    }

    public RegisterInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RegisterInfo(RegisterInfo source) {
        if (source.LegalPersonIdCode != null) {
            this.LegalPersonIdCode = new String(source.LegalPersonIdCode);
        }
        if (source.LegalPersonIdType != null) {
            this.LegalPersonIdType = new String(source.LegalPersonIdType);
        }
        if (source.LegalPersonName != null) {
            this.LegalPersonName = new String(source.LegalPersonName);
        }
        if (source.OrganizationCode != null) {
            this.OrganizationCode = new String(source.OrganizationCode);
        }
        if (source.OrganizationName != null) {
            this.OrganizationName = new String(source.OrganizationName);
        }
        if (source.OrganizationType != null) {
            this.OrganizationType = new String(source.OrganizationType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LegalPersonIdCode", this.LegalPersonIdCode);
        this.setParamSimple(map, prefix + "LegalPersonIdType", this.LegalPersonIdType);
        this.setParamSimple(map, prefix + "LegalPersonName", this.LegalPersonName);
        this.setParamSimple(map, prefix + "OrganizationCode", this.OrganizationCode);
        this.setParamSimple(map, prefix + "OrganizationName", this.OrganizationName);
        this.setParamSimple(map, prefix + "OrganizationType", this.OrganizationType);

    }
}

