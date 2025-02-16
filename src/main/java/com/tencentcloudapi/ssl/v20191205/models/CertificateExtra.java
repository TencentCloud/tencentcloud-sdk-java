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

public class CertificateExtra extends AbstractModel {

    /**
    * 证书可配置域名数量。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DomainNumber")
    @Expose
    private String DomainNumber;

    /**
    * 续费原证书 ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OriginCertificateId")
    @Expose
    private String OriginCertificateId;

    /**
    * 重颁发证书原始 ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReplacedBy")
    @Expose
    private String ReplacedBy;

    /**
    * 重颁发证书ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReplacedFor")
    @Expose
    private String ReplacedFor;

    /**
    * 续费证书 ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RenewOrder")
    @Expose
    private String RenewOrder;

    /**
    * 是否是国密证书
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SMCert")
    @Expose
    private Long SMCert;

    /**
    * 公司类型，取值：1（个人）；2（公司）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CompanyType")
    @Expose
    private Long CompanyType;

    /**
     * Get 证书可配置域名数量。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DomainNumber 证书可配置域名数量。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDomainNumber() {
        return this.DomainNumber;
    }

    /**
     * Set 证书可配置域名数量。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DomainNumber 证书可配置域名数量。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDomainNumber(String DomainNumber) {
        this.DomainNumber = DomainNumber;
    }

    /**
     * Get 续费原证书 ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OriginCertificateId 续费原证书 ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOriginCertificateId() {
        return this.OriginCertificateId;
    }

    /**
     * Set 续费原证书 ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OriginCertificateId 续费原证书 ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOriginCertificateId(String OriginCertificateId) {
        this.OriginCertificateId = OriginCertificateId;
    }

    /**
     * Get 重颁发证书原始 ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReplacedBy 重颁发证书原始 ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReplacedBy() {
        return this.ReplacedBy;
    }

    /**
     * Set 重颁发证书原始 ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReplacedBy 重颁发证书原始 ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReplacedBy(String ReplacedBy) {
        this.ReplacedBy = ReplacedBy;
    }

    /**
     * Get 重颁发证书ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReplacedFor 重颁发证书ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReplacedFor() {
        return this.ReplacedFor;
    }

    /**
     * Set 重颁发证书ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReplacedFor 重颁发证书ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReplacedFor(String ReplacedFor) {
        this.ReplacedFor = ReplacedFor;
    }

    /**
     * Get 续费证书 ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RenewOrder 续费证书 ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRenewOrder() {
        return this.RenewOrder;
    }

    /**
     * Set 续费证书 ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RenewOrder 续费证书 ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRenewOrder(String RenewOrder) {
        this.RenewOrder = RenewOrder;
    }

    /**
     * Get 是否是国密证书
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SMCert 是否是国密证书
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSMCert() {
        return this.SMCert;
    }

    /**
     * Set 是否是国密证书
注意：此字段可能返回 null，表示取不到有效值。
     * @param SMCert 是否是国密证书
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSMCert(Long SMCert) {
        this.SMCert = SMCert;
    }

    /**
     * Get 公司类型，取值：1（个人）；2（公司）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CompanyType 公司类型，取值：1（个人）；2（公司）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCompanyType() {
        return this.CompanyType;
    }

    /**
     * Set 公司类型，取值：1（个人）；2（公司）
注意：此字段可能返回 null，表示取不到有效值。
     * @param CompanyType 公司类型，取值：1（个人）；2（公司）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCompanyType(Long CompanyType) {
        this.CompanyType = CompanyType;
    }

    public CertificateExtra() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CertificateExtra(CertificateExtra source) {
        if (source.DomainNumber != null) {
            this.DomainNumber = new String(source.DomainNumber);
        }
        if (source.OriginCertificateId != null) {
            this.OriginCertificateId = new String(source.OriginCertificateId);
        }
        if (source.ReplacedBy != null) {
            this.ReplacedBy = new String(source.ReplacedBy);
        }
        if (source.ReplacedFor != null) {
            this.ReplacedFor = new String(source.ReplacedFor);
        }
        if (source.RenewOrder != null) {
            this.RenewOrder = new String(source.RenewOrder);
        }
        if (source.SMCert != null) {
            this.SMCert = new Long(source.SMCert);
        }
        if (source.CompanyType != null) {
            this.CompanyType = new Long(source.CompanyType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DomainNumber", this.DomainNumber);
        this.setParamSimple(map, prefix + "OriginCertificateId", this.OriginCertificateId);
        this.setParamSimple(map, prefix + "ReplacedBy", this.ReplacedBy);
        this.setParamSimple(map, prefix + "ReplacedFor", this.ReplacedFor);
        this.setParamSimple(map, prefix + "RenewOrder", this.RenewOrder);
        this.setParamSimple(map, prefix + "SMCert", this.SMCert);
        this.setParamSimple(map, prefix + "CompanyType", this.CompanyType);

    }
}

