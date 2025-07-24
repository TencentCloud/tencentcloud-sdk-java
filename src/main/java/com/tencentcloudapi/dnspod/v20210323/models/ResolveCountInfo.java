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
package com.tencentcloudapi.dnspod.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResolveCountInfo extends AbstractModel {

    /**
    * 当前统计周期解析量总计
    */
    @SerializedName("DnsTotal")
    @Expose
    private Long DnsTotal;

    /**
    * 当前查询的域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 当前统计周期开始时间
    */
    @SerializedName("StartDate")
    @Expose
    private String StartDate;

    /**
    * 当前统计周期结束时间
    */
    @SerializedName("EndDate")
    @Expose
    private String EndDate;

    /**
    * 当前统计的子域名
    */
    @SerializedName("SubDomain")
    @Expose
    private String SubDomain;

    /**
    * 数据统计格式，取值为minute、hour、day，分别表示按十分钟、小时、天统计数据
    */
    @SerializedName("DnsFormat")
    @Expose
    private String DnsFormat;

    /**
     * Get 当前统计周期解析量总计 
     * @return DnsTotal 当前统计周期解析量总计
     */
    public Long getDnsTotal() {
        return this.DnsTotal;
    }

    /**
     * Set 当前统计周期解析量总计
     * @param DnsTotal 当前统计周期解析量总计
     */
    public void setDnsTotal(Long DnsTotal) {
        this.DnsTotal = DnsTotal;
    }

    /**
     * Get 当前查询的域名 
     * @return Domain 当前查询的域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 当前查询的域名
     * @param Domain 当前查询的域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 当前统计周期开始时间 
     * @return StartDate 当前统计周期开始时间
     */
    public String getStartDate() {
        return this.StartDate;
    }

    /**
     * Set 当前统计周期开始时间
     * @param StartDate 当前统计周期开始时间
     */
    public void setStartDate(String StartDate) {
        this.StartDate = StartDate;
    }

    /**
     * Get 当前统计周期结束时间 
     * @return EndDate 当前统计周期结束时间
     */
    public String getEndDate() {
        return this.EndDate;
    }

    /**
     * Set 当前统计周期结束时间
     * @param EndDate 当前统计周期结束时间
     */
    public void setEndDate(String EndDate) {
        this.EndDate = EndDate;
    }

    /**
     * Get 当前统计的子域名 
     * @return SubDomain 当前统计的子域名
     */
    public String getSubDomain() {
        return this.SubDomain;
    }

    /**
     * Set 当前统计的子域名
     * @param SubDomain 当前统计的子域名
     */
    public void setSubDomain(String SubDomain) {
        this.SubDomain = SubDomain;
    }

    /**
     * Get 数据统计格式，取值为minute、hour、day，分别表示按十分钟、小时、天统计数据 
     * @return DnsFormat 数据统计格式，取值为minute、hour、day，分别表示按十分钟、小时、天统计数据
     */
    public String getDnsFormat() {
        return this.DnsFormat;
    }

    /**
     * Set 数据统计格式，取值为minute、hour、day，分别表示按十分钟、小时、天统计数据
     * @param DnsFormat 数据统计格式，取值为minute、hour、day，分别表示按十分钟、小时、天统计数据
     */
    public void setDnsFormat(String DnsFormat) {
        this.DnsFormat = DnsFormat;
    }

    public ResolveCountInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResolveCountInfo(ResolveCountInfo source) {
        if (source.DnsTotal != null) {
            this.DnsTotal = new Long(source.DnsTotal);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.StartDate != null) {
            this.StartDate = new String(source.StartDate);
        }
        if (source.EndDate != null) {
            this.EndDate = new String(source.EndDate);
        }
        if (source.SubDomain != null) {
            this.SubDomain = new String(source.SubDomain);
        }
        if (source.DnsFormat != null) {
            this.DnsFormat = new String(source.DnsFormat);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DnsTotal", this.DnsTotal);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "StartDate", this.StartDate);
        this.setParamSimple(map, prefix + "EndDate", this.EndDate);
        this.setParamSimple(map, prefix + "SubDomain", this.SubDomain);
        this.setParamSimple(map, prefix + "DnsFormat", this.DnsFormat);

    }
}

