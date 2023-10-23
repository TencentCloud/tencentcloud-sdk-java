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
package com.tencentcloudapi.domain.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteCustomDnsHostRequest extends AbstractModel {

    /**
    * 域名实例ID
    */
    @SerializedName("DomainId")
    @Expose
    private String DomainId;

    /**
    * DNS名称
    */
    @SerializedName("DnsName")
    @Expose
    private String DnsName;

    /**
     * Get 域名实例ID 
     * @return DomainId 域名实例ID
     */
    public String getDomainId() {
        return this.DomainId;
    }

    /**
     * Set 域名实例ID
     * @param DomainId 域名实例ID
     */
    public void setDomainId(String DomainId) {
        this.DomainId = DomainId;
    }

    /**
     * Get DNS名称 
     * @return DnsName DNS名称
     */
    public String getDnsName() {
        return this.DnsName;
    }

    /**
     * Set DNS名称
     * @param DnsName DNS名称
     */
    public void setDnsName(String DnsName) {
        this.DnsName = DnsName;
    }

    public DeleteCustomDnsHostRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteCustomDnsHostRequest(DeleteCustomDnsHostRequest source) {
        if (source.DomainId != null) {
            this.DomainId = new String(source.DomainId);
        }
        if (source.DnsName != null) {
            this.DnsName = new String(source.DnsName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DomainId", this.DomainId);
        this.setParamSimple(map, prefix + "DnsName", this.DnsName);

    }
}

