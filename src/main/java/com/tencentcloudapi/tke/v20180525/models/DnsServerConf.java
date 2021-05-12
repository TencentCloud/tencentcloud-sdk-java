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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DnsServerConf extends AbstractModel{

    /**
    * 域名。空字符串表示所有域名。
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * dns 服务器地址列表。地址格式 ip:port
    */
    @SerializedName("DnsServers")
    @Expose
    private String [] DnsServers;

    /**
     * Get 域名。空字符串表示所有域名。 
     * @return Domain 域名。空字符串表示所有域名。
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 域名。空字符串表示所有域名。
     * @param Domain 域名。空字符串表示所有域名。
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get dns 服务器地址列表。地址格式 ip:port 
     * @return DnsServers dns 服务器地址列表。地址格式 ip:port
     */
    public String [] getDnsServers() {
        return this.DnsServers;
    }

    /**
     * Set dns 服务器地址列表。地址格式 ip:port
     * @param DnsServers dns 服务器地址列表。地址格式 ip:port
     */
    public void setDnsServers(String [] DnsServers) {
        this.DnsServers = DnsServers;
    }

    public DnsServerConf() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DnsServerConf(DnsServerConf source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.DnsServers != null) {
            this.DnsServers = new String[source.DnsServers.length];
            for (int i = 0; i < source.DnsServers.length; i++) {
                this.DnsServers[i] = new String(source.DnsServers[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamArraySimple(map, prefix + "DnsServers.", this.DnsServers);

    }
}

