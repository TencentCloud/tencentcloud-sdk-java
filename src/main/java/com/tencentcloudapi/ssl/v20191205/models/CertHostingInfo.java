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

public class CertHostingInfo extends AbstractModel{

    /**
    * 证书ID
    */
    @SerializedName("CertId")
    @Expose
    private String CertId;

    /**
    * 已替换的新证书ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RenewCertId")
    @Expose
    private String RenewCertId;

    /**
    * 云资源托管 ，CDN或CLB：部分开启，CDN,CLB：已开启，null：未开启托管
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
     * Get 证书ID 
     * @return CertId 证书ID
     */
    public String getCertId() {
        return this.CertId;
    }

    /**
     * Set 证书ID
     * @param CertId 证书ID
     */
    public void setCertId(String CertId) {
        this.CertId = CertId;
    }

    /**
     * Get 已替换的新证书ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RenewCertId 已替换的新证书ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRenewCertId() {
        return this.RenewCertId;
    }

    /**
     * Set 已替换的新证书ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param RenewCertId 已替换的新证书ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRenewCertId(String RenewCertId) {
        this.RenewCertId = RenewCertId;
    }

    /**
     * Get 云资源托管 ，CDN或CLB：部分开启，CDN,CLB：已开启，null：未开启托管
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceType 云资源托管 ，CDN或CLB：部分开启，CDN,CLB：已开启，null：未开启托管
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set 云资源托管 ，CDN或CLB：部分开启，CDN,CLB：已开启，null：未开启托管
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceType 云资源托管 ，CDN或CLB：部分开启，CDN,CLB：已开启，null：未开启托管
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    public CertHostingInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CertHostingInfo(CertHostingInfo source) {
        if (source.CertId != null) {
            this.CertId = new String(source.CertId);
        }
        if (source.RenewCertId != null) {
            this.RenewCertId = new String(source.RenewCertId);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CertId", this.CertId);
        this.setParamSimple(map, prefix + "RenewCertId", this.RenewCertId);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

