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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CertificateExtra extends AbstractModel{

    /**
    * 证书可配置域名数量。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DomainNumber")
    @Expose
    private String DomainNumber;

    /**
    * 原始证书 ID。
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
    * 重颁发证书新 ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReplacedFor")
    @Expose
    private String ReplacedFor;

    /**
    * 新订单证书 ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RenewOrder")
    @Expose
    private String RenewOrder;

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
     * Get 原始证书 ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OriginCertificateId 原始证书 ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOriginCertificateId() {
        return this.OriginCertificateId;
    }

    /**
     * Set 原始证书 ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OriginCertificateId 原始证书 ID。
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
     * Get 重颁发证书新 ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReplacedFor 重颁发证书新 ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReplacedFor() {
        return this.ReplacedFor;
    }

    /**
     * Set 重颁发证书新 ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReplacedFor 重颁发证书新 ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReplacedFor(String ReplacedFor) {
        this.ReplacedFor = ReplacedFor;
    }

    /**
     * Get 新订单证书 ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RenewOrder 新订单证书 ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRenewOrder() {
        return this.RenewOrder;
    }

    /**
     * Set 新订单证书 ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RenewOrder 新订单证书 ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRenewOrder(String RenewOrder) {
        this.RenewOrder = RenewOrder;
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

    }
}

