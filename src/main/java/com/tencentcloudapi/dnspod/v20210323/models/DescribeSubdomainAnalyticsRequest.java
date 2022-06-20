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
package com.tencentcloudapi.dnspod.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSubdomainAnalyticsRequest extends AbstractModel{

    /**
    * 要查询解析量的域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 查询的开始时间，格式：YYYY-MM-DD
    */
    @SerializedName("StartDate")
    @Expose
    private String StartDate;

    /**
    * 查询的结束时间，格式：YYYY-MM-DD
    */
    @SerializedName("EndDate")
    @Expose
    private String EndDate;

    /**
    * 要查询解析量的子域名
    */
    @SerializedName("Subdomain")
    @Expose
    private String Subdomain;

    /**
    * DATE:按天维度统计 HOUR:按小时维度统计
    */
    @SerializedName("DnsFormat")
    @Expose
    private String DnsFormat;

    /**
    * 域名 ID 。参数 DomainId 优先级比参数 Domain 高，如果传递参数 DomainId 将忽略参数 Domain 。
    */
    @SerializedName("DomainId")
    @Expose
    private Long DomainId;

    /**
     * Get 要查询解析量的域名 
     * @return Domain 要查询解析量的域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 要查询解析量的域名
     * @param Domain 要查询解析量的域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 查询的开始时间，格式：YYYY-MM-DD 
     * @return StartDate 查询的开始时间，格式：YYYY-MM-DD
     */
    public String getStartDate() {
        return this.StartDate;
    }

    /**
     * Set 查询的开始时间，格式：YYYY-MM-DD
     * @param StartDate 查询的开始时间，格式：YYYY-MM-DD
     */
    public void setStartDate(String StartDate) {
        this.StartDate = StartDate;
    }

    /**
     * Get 查询的结束时间，格式：YYYY-MM-DD 
     * @return EndDate 查询的结束时间，格式：YYYY-MM-DD
     */
    public String getEndDate() {
        return this.EndDate;
    }

    /**
     * Set 查询的结束时间，格式：YYYY-MM-DD
     * @param EndDate 查询的结束时间，格式：YYYY-MM-DD
     */
    public void setEndDate(String EndDate) {
        this.EndDate = EndDate;
    }

    /**
     * Get 要查询解析量的子域名 
     * @return Subdomain 要查询解析量的子域名
     */
    public String getSubdomain() {
        return this.Subdomain;
    }

    /**
     * Set 要查询解析量的子域名
     * @param Subdomain 要查询解析量的子域名
     */
    public void setSubdomain(String Subdomain) {
        this.Subdomain = Subdomain;
    }

    /**
     * Get DATE:按天维度统计 HOUR:按小时维度统计 
     * @return DnsFormat DATE:按天维度统计 HOUR:按小时维度统计
     */
    public String getDnsFormat() {
        return this.DnsFormat;
    }

    /**
     * Set DATE:按天维度统计 HOUR:按小时维度统计
     * @param DnsFormat DATE:按天维度统计 HOUR:按小时维度统计
     */
    public void setDnsFormat(String DnsFormat) {
        this.DnsFormat = DnsFormat;
    }

    /**
     * Get 域名 ID 。参数 DomainId 优先级比参数 Domain 高，如果传递参数 DomainId 将忽略参数 Domain 。 
     * @return DomainId 域名 ID 。参数 DomainId 优先级比参数 Domain 高，如果传递参数 DomainId 将忽略参数 Domain 。
     */
    public Long getDomainId() {
        return this.DomainId;
    }

    /**
     * Set 域名 ID 。参数 DomainId 优先级比参数 Domain 高，如果传递参数 DomainId 将忽略参数 Domain 。
     * @param DomainId 域名 ID 。参数 DomainId 优先级比参数 Domain 高，如果传递参数 DomainId 将忽略参数 Domain 。
     */
    public void setDomainId(Long DomainId) {
        this.DomainId = DomainId;
    }

    public DescribeSubdomainAnalyticsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSubdomainAnalyticsRequest(DescribeSubdomainAnalyticsRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.StartDate != null) {
            this.StartDate = new String(source.StartDate);
        }
        if (source.EndDate != null) {
            this.EndDate = new String(source.EndDate);
        }
        if (source.Subdomain != null) {
            this.Subdomain = new String(source.Subdomain);
        }
        if (source.DnsFormat != null) {
            this.DnsFormat = new String(source.DnsFormat);
        }
        if (source.DomainId != null) {
            this.DomainId = new Long(source.DomainId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "StartDate", this.StartDate);
        this.setParamSimple(map, prefix + "EndDate", this.EndDate);
        this.setParamSimple(map, prefix + "Subdomain", this.Subdomain);
        this.setParamSimple(map, prefix + "DnsFormat", this.DnsFormat);
        this.setParamSimple(map, prefix + "DomainId", this.DomainId);

    }
}

