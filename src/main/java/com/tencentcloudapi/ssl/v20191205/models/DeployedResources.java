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

public class DeployedResources extends AbstractModel {

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
    * 不建议使用。字段返回和Resources相同。本字段后续只返回null
    */
    @SerializedName("ResourceIds")
    @Expose
    private String [] ResourceIds;

    /**
    * 关联资源ID或关联域名。
    */
    @SerializedName("Resources")
    @Expose
    private String [] Resources;

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
     * Get 不建议使用。字段返回和Resources相同。本字段后续只返回null 
     * @return ResourceIds 不建议使用。字段返回和Resources相同。本字段后续只返回null
     */
    public String [] getResourceIds() {
        return this.ResourceIds;
    }

    /**
     * Set 不建议使用。字段返回和Resources相同。本字段后续只返回null
     * @param ResourceIds 不建议使用。字段返回和Resources相同。本字段后续只返回null
     */
    public void setResourceIds(String [] ResourceIds) {
        this.ResourceIds = ResourceIds;
    }

    /**
     * Get 关联资源ID或关联域名。 
     * @return Resources 关联资源ID或关联域名。
     */
    public String [] getResources() {
        return this.Resources;
    }

    /**
     * Set 关联资源ID或关联域名。
     * @param Resources 关联资源ID或关联域名。
     */
    public void setResources(String [] Resources) {
        this.Resources = Resources;
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
        if (source.Resources != null) {
            this.Resources = new String[source.Resources.length];
            for (int i = 0; i < source.Resources.length; i++) {
                this.Resources[i] = new String(source.Resources[i]);
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
        this.setParamArraySimple(map, prefix + "Resources.", this.Resources);

    }
}

