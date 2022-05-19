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

public class HostCertificateRequest extends AbstractModel{

    /**
    * 证书ID
    */
    @SerializedName("CertificateId")
    @Expose
    private String CertificateId;

    /**
    * 资源类型：目前仅限于CLB,CDN
    */
    @SerializedName("ResourceType")
    @Expose
    private String [] ResourceType;

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
     * Get 资源类型：目前仅限于CLB,CDN 
     * @return ResourceType 资源类型：目前仅限于CLB,CDN
     */
    public String [] getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set 资源类型：目前仅限于CLB,CDN
     * @param ResourceType 资源类型：目前仅限于CLB,CDN
     */
    public void setResourceType(String [] ResourceType) {
        this.ResourceType = ResourceType;
    }

    public HostCertificateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HostCertificateRequest(HostCertificateRequest source) {
        if (source.CertificateId != null) {
            this.CertificateId = new String(source.CertificateId);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String[source.ResourceType.length];
            for (int i = 0; i < source.ResourceType.length; i++) {
                this.ResourceType[i] = new String(source.ResourceType[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CertificateId", this.CertificateId);
        this.setParamArraySimple(map, prefix + "ResourceType.", this.ResourceType);

    }
}

