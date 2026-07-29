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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CertificateExtra extends AbstractModel {

    /**
    * <p>证书可配置域名数量。</p>
    */
    @SerializedName("DomainNumber")
    @Expose
    private String DomainNumber;

    /**
    * <p>续费原证书 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OriginCertificateId")
    @Expose
    private String OriginCertificateId;

    /**
    * <p>重颁发证书原始 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReplacedBy")
    @Expose
    private String ReplacedBy;

    /**
    * <p>重颁发证书ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReplacedFor")
    @Expose
    private String ReplacedFor;

    /**
    * <p>续费证书 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RenewOrder")
    @Expose
    private String RenewOrder;

    /**
    * <p>是否是国密证书</p>
    */
    @SerializedName("SMCert")
    @Expose
    private Long SMCert;

    /**
    * <p>公司类型，取值：1（个人）；2（公司）</p>
    */
    @SerializedName("CompanyType")
    @Expose
    private Long CompanyType;

    /**
    * <p>下一张订阅服务续期证书ID</p>
    */
    @SerializedName("ServiceRenewCertificateId")
    @Expose
    private String ServiceRenewCertificateId;

    /**
    * <p>上一张订阅服务来源证书ID</p>
    */
    @SerializedName("ServiceOriginCertificateId")
    @Expose
    private String ServiceOriginCertificateId;

    /**
     * Get <p>证书可配置域名数量。</p> 
     * @return DomainNumber <p>证书可配置域名数量。</p>
     */
    public String getDomainNumber() {
        return this.DomainNumber;
    }

    /**
     * Set <p>证书可配置域名数量。</p>
     * @param DomainNumber <p>证书可配置域名数量。</p>
     */
    public void setDomainNumber(String DomainNumber) {
        this.DomainNumber = DomainNumber;
    }

    /**
     * Get <p>续费原证书 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OriginCertificateId <p>续费原证书 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOriginCertificateId() {
        return this.OriginCertificateId;
    }

    /**
     * Set <p>续费原证书 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param OriginCertificateId <p>续费原证书 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOriginCertificateId(String OriginCertificateId) {
        this.OriginCertificateId = OriginCertificateId;
    }

    /**
     * Get <p>重颁发证书原始 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReplacedBy <p>重颁发证书原始 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReplacedBy() {
        return this.ReplacedBy;
    }

    /**
     * Set <p>重颁发证书原始 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReplacedBy <p>重颁发证书原始 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReplacedBy(String ReplacedBy) {
        this.ReplacedBy = ReplacedBy;
    }

    /**
     * Get <p>重颁发证书ID。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReplacedFor <p>重颁发证书ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReplacedFor() {
        return this.ReplacedFor;
    }

    /**
     * Set <p>重颁发证书ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReplacedFor <p>重颁发证书ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReplacedFor(String ReplacedFor) {
        this.ReplacedFor = ReplacedFor;
    }

    /**
     * Get <p>续费证书 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RenewOrder <p>续费证书 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRenewOrder() {
        return this.RenewOrder;
    }

    /**
     * Set <p>续费证书 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RenewOrder <p>续费证书 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRenewOrder(String RenewOrder) {
        this.RenewOrder = RenewOrder;
    }

    /**
     * Get <p>是否是国密证书</p> 
     * @return SMCert <p>是否是国密证书</p>
     */
    public Long getSMCert() {
        return this.SMCert;
    }

    /**
     * Set <p>是否是国密证书</p>
     * @param SMCert <p>是否是国密证书</p>
     */
    public void setSMCert(Long SMCert) {
        this.SMCert = SMCert;
    }

    /**
     * Get <p>公司类型，取值：1（个人）；2（公司）</p> 
     * @return CompanyType <p>公司类型，取值：1（个人）；2（公司）</p>
     */
    public Long getCompanyType() {
        return this.CompanyType;
    }

    /**
     * Set <p>公司类型，取值：1（个人）；2（公司）</p>
     * @param CompanyType <p>公司类型，取值：1（个人）；2（公司）</p>
     */
    public void setCompanyType(Long CompanyType) {
        this.CompanyType = CompanyType;
    }

    /**
     * Get <p>下一张订阅服务续期证书ID</p> 
     * @return ServiceRenewCertificateId <p>下一张订阅服务续期证书ID</p>
     */
    public String getServiceRenewCertificateId() {
        return this.ServiceRenewCertificateId;
    }

    /**
     * Set <p>下一张订阅服务续期证书ID</p>
     * @param ServiceRenewCertificateId <p>下一张订阅服务续期证书ID</p>
     */
    public void setServiceRenewCertificateId(String ServiceRenewCertificateId) {
        this.ServiceRenewCertificateId = ServiceRenewCertificateId;
    }

    /**
     * Get <p>上一张订阅服务来源证书ID</p> 
     * @return ServiceOriginCertificateId <p>上一张订阅服务来源证书ID</p>
     */
    public String getServiceOriginCertificateId() {
        return this.ServiceOriginCertificateId;
    }

    /**
     * Set <p>上一张订阅服务来源证书ID</p>
     * @param ServiceOriginCertificateId <p>上一张订阅服务来源证书ID</p>
     */
    public void setServiceOriginCertificateId(String ServiceOriginCertificateId) {
        this.ServiceOriginCertificateId = ServiceOriginCertificateId;
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
        if (source.ServiceRenewCertificateId != null) {
            this.ServiceRenewCertificateId = new String(source.ServiceRenewCertificateId);
        }
        if (source.ServiceOriginCertificateId != null) {
            this.ServiceOriginCertificateId = new String(source.ServiceOriginCertificateId);
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
        this.setParamSimple(map, prefix + "ServiceRenewCertificateId", this.ServiceRenewCertificateId);
        this.setParamSimple(map, prefix + "ServiceOriginCertificateId", this.ServiceOriginCertificateId);

    }
}

