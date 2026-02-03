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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BindCloudBaseGWDomainRequest extends AbstractModel {

    /**
    * 服务ID
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * 服务域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 证书ID
    */
    @SerializedName("CertId")
    @Expose
    private String CertId;

    /**
    * 是否启用多地域
    */
    @SerializedName("EnableRegion")
    @Expose
    private Boolean EnableRegion;

    /**
     * Get 服务ID 
     * @return ServiceId 服务ID
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set 服务ID
     * @param ServiceId 服务ID
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get 服务域名 
     * @return Domain 服务域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 服务域名
     * @param Domain 服务域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

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
     * Get 是否启用多地域 
     * @return EnableRegion 是否启用多地域
     */
    public Boolean getEnableRegion() {
        return this.EnableRegion;
    }

    /**
     * Set 是否启用多地域
     * @param EnableRegion 是否启用多地域
     */
    public void setEnableRegion(Boolean EnableRegion) {
        this.EnableRegion = EnableRegion;
    }

    public BindCloudBaseGWDomainRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BindCloudBaseGWDomainRequest(BindCloudBaseGWDomainRequest source) {
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.CertId != null) {
            this.CertId = new String(source.CertId);
        }
        if (source.EnableRegion != null) {
            this.EnableRegion = new Boolean(source.EnableRegion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "CertId", this.CertId);
        this.setParamSimple(map, prefix + "EnableRegion", this.EnableRegion);

    }
}

