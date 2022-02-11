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

public class DeployedResources extends AbstractModel{

    /**
    * 证书ID
    */
    @SerializedName("CertificateId")
    @Expose
    private String CertificateId;

    /**
    * 数量
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 资源标识:clb,cdn,live,waf,antiddos
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 关联资源ID或关联域名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceIds")
    @Expose
    private String [] ResourceIds;

    /**
     * Get 证书ID 
     * @return CertificateId 证书ID
     */
    public String getCertificateId() {
        return this.CertificateId;
    }

    /**
     * Set 证书ID
     * @param CertificateId 证书ID
     */
    public void setCertificateId(String CertificateId) {
        this.CertificateId = CertificateId;
    }

    /**
     * Get 数量 
     * @return Count 数量
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 数量
     * @param Count 数量
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get 资源标识:clb,cdn,live,waf,antiddos 
     * @return Type 资源标识:clb,cdn,live,waf,antiddos
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 资源标识:clb,cdn,live,waf,antiddos
     * @param Type 资源标识:clb,cdn,live,waf,antiddos
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 关联资源ID或关联域名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceIds 关联资源ID或关联域名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getResourceIds() {
        return this.ResourceIds;
    }

    /**
     * Set 关联资源ID或关联域名
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceIds 关联资源ID或关联域名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceIds(String [] ResourceIds) {
        this.ResourceIds = ResourceIds;
    }

    public DeployedResources() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeployedResources(DeployedResources source) {
        if (source.CertificateId != null) {
            this.CertificateId = new String(source.CertificateId);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.ResourceIds != null) {
            this.ResourceIds = new String[source.ResourceIds.length];
            for (int i = 0; i < source.ResourceIds.length; i++) {
                this.ResourceIds[i] = new String(source.ResourceIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CertificateId", this.CertificateId);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArraySimple(map, prefix + "ResourceIds.", this.ResourceIds);

    }
}

