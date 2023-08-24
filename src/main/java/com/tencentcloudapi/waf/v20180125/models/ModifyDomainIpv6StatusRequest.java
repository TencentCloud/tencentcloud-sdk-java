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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDomainIpv6StatusRequest extends AbstractModel{

    /**
    * 需要修改的域名所属的实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 需要修改的域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 需要修改的域名ID
    */
    @SerializedName("DomainId")
    @Expose
    private String DomainId;

    /**
    * 修改域名的Ipv6开关为Status （0:关闭 1:开启）
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get 需要修改的域名所属的实例ID 
     * @return InstanceId 需要修改的域名所属的实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 需要修改的域名所属的实例ID
     * @param InstanceId 需要修改的域名所属的实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 需要修改的域名 
     * @return Domain 需要修改的域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 需要修改的域名
     * @param Domain 需要修改的域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 需要修改的域名ID 
     * @return DomainId 需要修改的域名ID
     */
    public String getDomainId() {
        return this.DomainId;
    }

    /**
     * Set 需要修改的域名ID
     * @param DomainId 需要修改的域名ID
     */
    public void setDomainId(String DomainId) {
        this.DomainId = DomainId;
    }

    /**
     * Get 修改域名的Ipv6开关为Status （0:关闭 1:开启） 
     * @return Status 修改域名的Ipv6开关为Status （0:关闭 1:开启）
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 修改域名的Ipv6开关为Status （0:关闭 1:开启）
     * @param Status 修改域名的Ipv6开关为Status （0:关闭 1:开启）
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public ModifyDomainIpv6StatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDomainIpv6StatusRequest(ModifyDomainIpv6StatusRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.DomainId != null) {
            this.DomainId = new String(source.DomainId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "DomainId", this.DomainId);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

