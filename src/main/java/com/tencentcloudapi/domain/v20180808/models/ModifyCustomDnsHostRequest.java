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

public class ModifyCustomDnsHostRequest extends AbstractModel {

    /**
    * 域名实例ID
可通过[DescribeDomainNameList](https://cloud.tencent.com/document/api/242/48941)接口获取
    */
    @SerializedName("DomainId")
    @Expose
    private String DomainId;

    /**
    * Dns名称 例如：<>.test.com;其中<>就是Dns名称，可以是任意域名允许的格式
    */
    @SerializedName("DnsName")
    @Expose
    private String DnsName;

    /**
    * IP地址列表 可选择：正常IP地址范围
    */
    @SerializedName("IpSet")
    @Expose
    private String [] IpSet;

    /**
     * Get 域名实例ID
可通过[DescribeDomainNameList](https://cloud.tencent.com/document/api/242/48941)接口获取 
     * @return DomainId 域名实例ID
可通过[DescribeDomainNameList](https://cloud.tencent.com/document/api/242/48941)接口获取
     */
    public String getDomainId() {
        return this.DomainId;
    }

    /**
     * Set 域名实例ID
可通过[DescribeDomainNameList](https://cloud.tencent.com/document/api/242/48941)接口获取
     * @param DomainId 域名实例ID
可通过[DescribeDomainNameList](https://cloud.tencent.com/document/api/242/48941)接口获取
     */
    public void setDomainId(String DomainId) {
        this.DomainId = DomainId;
    }

    /**
     * Get Dns名称 例如：<>.test.com;其中<>就是Dns名称，可以是任意域名允许的格式 
     * @return DnsName Dns名称 例如：<>.test.com;其中<>就是Dns名称，可以是任意域名允许的格式
     */
    public String getDnsName() {
        return this.DnsName;
    }

    /**
     * Set Dns名称 例如：<>.test.com;其中<>就是Dns名称，可以是任意域名允许的格式
     * @param DnsName Dns名称 例如：<>.test.com;其中<>就是Dns名称，可以是任意域名允许的格式
     */
    public void setDnsName(String DnsName) {
        this.DnsName = DnsName;
    }

    /**
     * Get IP地址列表 可选择：正常IP地址范围 
     * @return IpSet IP地址列表 可选择：正常IP地址范围
     */
    public String [] getIpSet() {
        return this.IpSet;
    }

    /**
     * Set IP地址列表 可选择：正常IP地址范围
     * @param IpSet IP地址列表 可选择：正常IP地址范围
     */
    public void setIpSet(String [] IpSet) {
        this.IpSet = IpSet;
    }

    public ModifyCustomDnsHostRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyCustomDnsHostRequest(ModifyCustomDnsHostRequest source) {
        if (source.DomainId != null) {
            this.DomainId = new String(source.DomainId);
        }
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
        this.setParamSimple(map, prefix + "DomainId", this.DomainId);
        this.setParamSimple(map, prefix + "DnsName", this.DnsName);
        this.setParamArraySimple(map, prefix + "IpSet.", this.IpSet);

    }
}

