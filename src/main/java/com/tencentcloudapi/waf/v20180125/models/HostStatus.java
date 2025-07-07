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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HostStatus extends AbstractModel {

    /**
    * 域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 域名ID
    */
    @SerializedName("DomainId")
    @Expose
    private String DomainId;

    /**
    * WAF的开关，1：开，0：关
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 实例ID
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
     * Get 域名 
     * @return Domain 域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 域名
     * @param Domain 域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 域名ID 
     * @return DomainId 域名ID
     */
    public String getDomainId() {
        return this.DomainId;
    }

    /**
     * Set 域名ID
     * @param DomainId 域名ID
     */
    public void setDomainId(String DomainId) {
        this.DomainId = DomainId;
    }

    /**
     * Get WAF的开关，1：开，0：关 
     * @return Status WAF的开关，1：开，0：关
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set WAF的开关，1：开，0：关
     * @param Status WAF的开关，1：开，0：关
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 实例ID 
     * @return InstanceID 实例ID
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set 实例ID
     * @param InstanceID 实例ID
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    public HostStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HostStatus(HostStatus source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.DomainId != null) {
            this.DomainId = new String(source.DomainId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "DomainId", this.DomainId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);

    }
}

