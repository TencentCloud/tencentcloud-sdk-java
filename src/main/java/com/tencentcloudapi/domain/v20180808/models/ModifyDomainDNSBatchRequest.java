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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDomainDNSBatchRequest extends AbstractModel{

    /**
    * 批量操作的域名。
    */
    @SerializedName("Domains")
    @Expose
    private String [] Domains;

    /**
    * 域名DNS 数组。
    */
    @SerializedName("Dns")
    @Expose
    private String [] Dns;

    /**
     * Get 批量操作的域名。 
     * @return Domains 批量操作的域名。
     */
    public String [] getDomains() {
        return this.Domains;
    }

    /**
     * Set 批量操作的域名。
     * @param Domains 批量操作的域名。
     */
    public void setDomains(String [] Domains) {
        this.Domains = Domains;
    }

    /**
     * Get 域名DNS 数组。 
     * @return Dns 域名DNS 数组。
     */
    public String [] getDns() {
        return this.Dns;
    }

    /**
     * Set 域名DNS 数组。
     * @param Dns 域名DNS 数组。
     */
    public void setDns(String [] Dns) {
        this.Dns = Dns;
    }

    public ModifyDomainDNSBatchRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDomainDNSBatchRequest(ModifyDomainDNSBatchRequest source) {
        if (source.Domains != null) {
            this.Domains = new String[source.Domains.length];
            for (int i = 0; i < source.Domains.length; i++) {
                this.Domains[i] = new String(source.Domains[i]);
            }
        }
        if (source.Dns != null) {
            this.Dns = new String[source.Dns.length];
            for (int i = 0; i < source.Dns.length; i++) {
                this.Dns[i] = new String(source.Dns[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Domains.", this.Domains);
        this.setParamArraySimple(map, prefix + "Dns.", this.Dns);

    }
}

