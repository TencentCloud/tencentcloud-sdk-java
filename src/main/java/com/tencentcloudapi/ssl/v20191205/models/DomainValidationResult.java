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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DomainValidationResult extends AbstractModel {

    /**
    * 域名。
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 验证类型。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VerifyType")
    @Expose
    private String VerifyType;

    /**
    * 本地检查结果。
    */
    @SerializedName("LocalCheck")
    @Expose
    private Long LocalCheck;

    /**
    * CA检查结果。
    */
    @SerializedName("CaCheck")
    @Expose
    private Long CaCheck;

    /**
    * 检查失败原因。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LocalCheckFailReason")
    @Expose
    private String LocalCheckFailReason;

    /**
    * 检查到的值。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CheckValue")
    @Expose
    private String [] CheckValue;

    /**
    * 是否频繁请求。
    */
    @SerializedName("Frequently")
    @Expose
    private Boolean Frequently;

    /**
    * 是否已经签发。
    */
    @SerializedName("Issued")
    @Expose
    private Boolean Issued;

    /**
     * Get 域名。 
     * @return Domain 域名。
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 域名。
     * @param Domain 域名。
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 验证类型。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VerifyType 验证类型。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVerifyType() {
        return this.VerifyType;
    }

    /**
     * Set 验证类型。
注意：此字段可能返回 null，表示取不到有效值。
     * @param VerifyType 验证类型。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVerifyType(String VerifyType) {
        this.VerifyType = VerifyType;
    }

    /**
     * Get 本地检查结果。 
     * @return LocalCheck 本地检查结果。
     */
    public Long getLocalCheck() {
        return this.LocalCheck;
    }

    /**
     * Set 本地检查结果。
     * @param LocalCheck 本地检查结果。
     */
    public void setLocalCheck(Long LocalCheck) {
        this.LocalCheck = LocalCheck;
    }

    /**
     * Get CA检查结果。 
     * @return CaCheck CA检查结果。
     */
    public Long getCaCheck() {
        return this.CaCheck;
    }

    /**
     * Set CA检查结果。
     * @param CaCheck CA检查结果。
     */
    public void setCaCheck(Long CaCheck) {
        this.CaCheck = CaCheck;
    }

    /**
     * Get 检查失败原因。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LocalCheckFailReason 检查失败原因。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLocalCheckFailReason() {
        return this.LocalCheckFailReason;
    }

    /**
     * Set 检查失败原因。
注意：此字段可能返回 null，表示取不到有效值。
     * @param LocalCheckFailReason 检查失败原因。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLocalCheckFailReason(String LocalCheckFailReason) {
        this.LocalCheckFailReason = LocalCheckFailReason;
    }

    /**
     * Get 检查到的值。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CheckValue 检查到的值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getCheckValue() {
        return this.CheckValue;
    }

    /**
     * Set 检查到的值。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CheckValue 检查到的值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCheckValue(String [] CheckValue) {
        this.CheckValue = CheckValue;
    }

    /**
     * Get 是否频繁请求。 
     * @return Frequently 是否频繁请求。
     */
    public Boolean getFrequently() {
        return this.Frequently;
    }

    /**
     * Set 是否频繁请求。
     * @param Frequently 是否频繁请求。
     */
    public void setFrequently(Boolean Frequently) {
        this.Frequently = Frequently;
    }

    /**
     * Get 是否已经签发。 
     * @return Issued 是否已经签发。
     */
    public Boolean getIssued() {
        return this.Issued;
    }

    /**
     * Set 是否已经签发。
     * @param Issued 是否已经签发。
     */
    public void setIssued(Boolean Issued) {
        this.Issued = Issued;
    }

    public DomainValidationResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DomainValidationResult(DomainValidationResult source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.VerifyType != null) {
            this.VerifyType = new String(source.VerifyType);
        }
        if (source.LocalCheck != null) {
            this.LocalCheck = new Long(source.LocalCheck);
        }
        if (source.CaCheck != null) {
            this.CaCheck = new Long(source.CaCheck);
        }
        if (source.LocalCheckFailReason != null) {
            this.LocalCheckFailReason = new String(source.LocalCheckFailReason);
        }
        if (source.CheckValue != null) {
            this.CheckValue = new String[source.CheckValue.length];
            for (int i = 0; i < source.CheckValue.length; i++) {
                this.CheckValue[i] = new String(source.CheckValue[i]);
            }
        }
        if (source.Frequently != null) {
            this.Frequently = new Boolean(source.Frequently);
        }
        if (source.Issued != null) {
            this.Issued = new Boolean(source.Issued);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "VerifyType", this.VerifyType);
        this.setParamSimple(map, prefix + "LocalCheck", this.LocalCheck);
        this.setParamSimple(map, prefix + "CaCheck", this.CaCheck);
        this.setParamSimple(map, prefix + "LocalCheckFailReason", this.LocalCheckFailReason);
        this.setParamArraySimple(map, prefix + "CheckValue.", this.CheckValue);
        this.setParamSimple(map, prefix + "Frequently", this.Frequently);
        this.setParamSimple(map, prefix + "Issued", this.Issued);

    }
}

