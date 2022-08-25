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

public class GlobalDns extends AbstractModel{

    /**
    * 解析记录ID
    */
    @SerializedName("DnsRecordId")
    @Expose
    private Long DnsRecordId;

    /**
    * 域名就近接入地域信息列表
    */
    @SerializedName("CountryAreaList")
    @Expose
    private CountryAreaMap [] CountryAreaList;

    /**
    * 域名解析对应的通道接入点信息列表
    */
    @SerializedName("AccessList")
    @Expose
    private ProxyAccessInfo [] AccessList;

    /**
    * 解析状态：1表示运行中，2表示创建中，3表示修改中，4表示删除中
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

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
     * Get 域名就近接入地域信息列表 
     * @return CountryAreaList 域名就近接入地域信息列表
     */
    public CountryAreaMap [] getCountryAreaList() {
        return this.CountryAreaList;
    }

    /**
     * Set 域名就近接入地域信息列表
     * @param CountryAreaList 域名就近接入地域信息列表
     */
    public void setCountryAreaList(CountryAreaMap [] CountryAreaList) {
        this.CountryAreaList = CountryAreaList;
    }

    /**
     * Get 域名解析对应的通道接入点信息列表 
     * @return AccessList 域名解析对应的通道接入点信息列表
     */
    public ProxyAccessInfo [] getAccessList() {
        return this.AccessList;
    }

    /**
     * Set 域名解析对应的通道接入点信息列表
     * @param AccessList 域名解析对应的通道接入点信息列表
     */
    public void setAccessList(ProxyAccessInfo [] AccessList) {
        this.AccessList = AccessList;
    }

    /**
     * Get 解析状态：1表示运行中，2表示创建中，3表示修改中，4表示删除中 
     * @return Status 解析状态：1表示运行中，2表示创建中，3表示修改中，4表示删除中
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 解析状态：1表示运行中，2表示创建中，3表示修改中，4表示删除中
     * @param Status 解析状态：1表示运行中，2表示创建中，3表示修改中，4表示删除中
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public GlobalDns() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GlobalDns(GlobalDns source) {
        if (source.DnsRecordId != null) {
            this.DnsRecordId = new Long(source.DnsRecordId);
        }
        if (source.CountryAreaList != null) {
            this.CountryAreaList = new CountryAreaMap[source.CountryAreaList.length];
            for (int i = 0; i < source.CountryAreaList.length; i++) {
                this.CountryAreaList[i] = new CountryAreaMap(source.CountryAreaList[i]);
            }
        }
        if (source.AccessList != null) {
            this.AccessList = new ProxyAccessInfo[source.AccessList.length];
            for (int i = 0; i < source.AccessList.length; i++) {
                this.AccessList[i] = new ProxyAccessInfo(source.AccessList[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DnsRecordId", this.DnsRecordId);
        this.setParamArrayObj(map, prefix + "CountryAreaList.", this.CountryAreaList);
        this.setParamArrayObj(map, prefix + "AccessList.", this.AccessList);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

