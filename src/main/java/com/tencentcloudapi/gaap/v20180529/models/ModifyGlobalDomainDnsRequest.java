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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyGlobalDomainDnsRequest extends AbstractModel{

    /**
    * 解析记录ID
    */
    @SerializedName("DnsRecordId")
    @Expose
    private Long DnsRecordId;

    /**
    * 域名ID
    */
    @SerializedName("DomainId")
    @Expose
    private String DomainId;

    /**
    * 国家ID列表
    */
    @SerializedName("NationCountryInnerCodes")
    @Expose
    private String [] NationCountryInnerCodes;

    /**
    * 通道ID列表
    */
    @SerializedName("ProxyIdList")
    @Expose
    private String [] ProxyIdList;

    /**
     * Get 解析记录ID 
     * @return DnsRecordId 解析记录ID
     */
    public Long getDnsRecordId() {
        return this.DnsRecordId;
    }

    /**
     * Set 解析记录ID
     * @param DnsRecordId 解析记录ID
     */
    public void setDnsRecordId(Long DnsRecordId) {
        this.DnsRecordId = DnsRecordId;
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
     * Get 国家ID列表 
     * @return NationCountryInnerCodes 国家ID列表
     */
    public String [] getNationCountryInnerCodes() {
        return this.NationCountryInnerCodes;
    }

    /**
     * Set 国家ID列表
     * @param NationCountryInnerCodes 国家ID列表
     */
    public void setNationCountryInnerCodes(String [] NationCountryInnerCodes) {
        this.NationCountryInnerCodes = NationCountryInnerCodes;
    }

    /**
     * Get 通道ID列表 
     * @return ProxyIdList 通道ID列表
     */
    public String [] getProxyIdList() {
        return this.ProxyIdList;
    }

    /**
     * Set 通道ID列表
     * @param ProxyIdList 通道ID列表
     */
    public void setProxyIdList(String [] ProxyIdList) {
        this.ProxyIdList = ProxyIdList;
    }

    public ModifyGlobalDomainDnsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyGlobalDomainDnsRequest(ModifyGlobalDomainDnsRequest source) {
        if (source.DnsRecordId != null) {
            this.DnsRecordId = new Long(source.DnsRecordId);
        }
        if (source.DomainId != null) {
            this.DomainId = new String(source.DomainId);
        }
        if (source.NationCountryInnerCodes != null) {
            this.NationCountryInnerCodes = new String[source.NationCountryInnerCodes.length];
            for (int i = 0; i < source.NationCountryInnerCodes.length; i++) {
                this.NationCountryInnerCodes[i] = new String(source.NationCountryInnerCodes[i]);
            }
        }
        if (source.ProxyIdList != null) {
            this.ProxyIdList = new String[source.ProxyIdList.length];
            for (int i = 0; i < source.ProxyIdList.length; i++) {
                this.ProxyIdList[i] = new String(source.ProxyIdList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DnsRecordId", this.DnsRecordId);
        this.setParamSimple(map, prefix + "DomainId", this.DomainId);
        this.setParamArraySimple(map, prefix + "NationCountryInnerCodes.", this.NationCountryInnerCodes);
        this.setParamArraySimple(map, prefix + "ProxyIdList.", this.ProxyIdList);

    }
}

