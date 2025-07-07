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
package com.tencentcloudapi.domain.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CustomDnsHost extends AbstractModel {

    /**
    * DNS名称
    */
    @SerializedName("DnsName")
    @Expose
    private String DnsName;

    /**
    * IP地址列表
    */
    @SerializedName("IpSet")
    @Expose
    private String [] IpSet;

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

    /**
     * Get IP地址列表 
     * @return IpSet IP地址列表
     */
    public String [] getIpSet() {
        return this.IpSet;
    }

    /**
     * Set IP地址列表
     * @param IpSet IP地址列表
     */
    public void setIpSet(String [] IpSet) {
        this.IpSet = IpSet;
    }

    public CustomDnsHost() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CustomDnsHost(CustomDnsHost source) {
        if (source.DnsName != null) {
            this.DnsName = new String(source.DnsName);
        }
        if (source.IpSet != null) {
            this.IpSet = new String[source.IpSet.length];
            for (int i = 0; i < source.IpSet.length; i++) {
                this.IpSet[i] = new String(source.IpSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DnsName", this.DnsName);
        this.setParamArraySimple(map, prefix + "IpSet.", this.IpSet);

    }
}

