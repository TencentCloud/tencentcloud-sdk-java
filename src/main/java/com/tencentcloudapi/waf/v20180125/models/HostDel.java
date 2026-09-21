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

public class HostDel extends AbstractModel {

    /**
    * <p>域名</p>
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * <p>域名ID，使用DescribeDomains接口可以查询获取</p>
    */
    @SerializedName("DomainId")
    @Expose
    private String DomainId;

    /**
    * <p>实例类型</p>
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
     * Get <p>域名</p> 
     * @return Domain <p>域名</p>
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set <p>域名</p>
     * @param Domain <p>域名</p>
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get <p>域名ID，使用DescribeDomains接口可以查询获取</p> 
     * @return DomainId <p>域名ID，使用DescribeDomains接口可以查询获取</p>
     */
    public String getDomainId() {
        return this.DomainId;
    }

    /**
     * Set <p>域名ID，使用DescribeDomains接口可以查询获取</p>
     * @param DomainId <p>域名ID，使用DescribeDomains接口可以查询获取</p>
     */
    public void setDomainId(String DomainId) {
        this.DomainId = DomainId;
    }

    /**
     * Get <p>实例类型</p> 
     * @return InstanceID <p>实例类型</p>
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set <p>实例类型</p>
     * @param InstanceID <p>实例类型</p>
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    public HostDel() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HostDel(HostDel source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.DomainId != null) {
            this.DomainId = new String(source.DomainId);
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
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);

    }
}

