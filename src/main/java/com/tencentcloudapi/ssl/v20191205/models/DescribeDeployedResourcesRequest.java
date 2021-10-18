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

public class DescribeDeployedResourcesRequest extends AbstractModel{

    /**
    * 证书ID
    */
    @SerializedName("CertificateIds")
    @Expose
    private String [] CertificateIds;

    /**
    * 资源类型:clb,cdn,live,waf,antiddos
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
     * Get 证书ID 
     * @return CertificateIds 证书ID
     */
    public String [] getCertificateIds() {
        return this.CertificateIds;
    }

    /**
     * Set 证书ID
     * @param CertificateIds 证书ID
     */
    public void setCertificateIds(String [] CertificateIds) {
        this.CertificateIds = CertificateIds;
    }

    /**
     * Get 资源类型:clb,cdn,live,waf,antiddos 
     * @return ResourceType 资源类型:clb,cdn,live,waf,antiddos
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set 资源类型:clb,cdn,live,waf,antiddos
     * @param ResourceType 资源类型:clb,cdn,live,waf,antiddos
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    public DescribeDeployedResourcesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDeployedResourcesRequest(DescribeDeployedResourcesRequest source) {
        if (source.CertificateIds != null) {
            this.CertificateIds = new String[source.CertificateIds.length];
            for (int i = 0; i < source.CertificateIds.length; i++) {
                this.CertificateIds[i] = new String(source.CertificateIds[i]);
            }
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "CertificateIds.", this.CertificateIds);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);

    }
}

