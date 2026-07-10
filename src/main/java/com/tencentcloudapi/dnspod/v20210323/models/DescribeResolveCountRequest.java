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

public class DescribeResolveCountRequest extends AbstractModel {

    /**
    * <p>要查询解析量的域名</p>
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * <p>查询的开始时间，格式：YYYY-MM-DD，最多允许查询最近32天的数据。</p>
    */
    @SerializedName("StartDate")
    @Expose
    private String StartDate;

    /**
    * <p>查询的结束时间，格式：YYYY-MM-DD，最多允许查询最近32天的数据。</p>
    */
    @SerializedName("EndDate")
    @Expose
    private String EndDate;

    /**
    * <p>数据统计格式</p><p>枚举值：</p><ul><li>minute： 按十分钟维度统计数据</li><li>hour： 按小时维度统计数据</li><li>day： 按天维度统计数据</li></ul>
    */
    @SerializedName("DnsFormat")
    @Expose
    private String DnsFormat;

    /**
    * <p>域名 ID 。参数 DomainId 优先级比参数 Domain 高，如果传递参数 DomainId 将忽略参数 Domain 。可以通过接口DescribeDomainList查到所有的Domain以及DomainId</p>
    */
    @SerializedName("DomainId")
    @Expose
    private Long DomainId;

    /**
    * <p>数据统计格式</p><p>枚举值：</p><ul><li>minute： 按十分钟维度统计数据</li><li>hour： 按小时维度统计数据</li><li>day： 按天维度统计数据</li></ul><p>新增规范参数，同时传递DNSFormat和DnsFormat参数时，后端优先使用DNSFormat参数</p>
    */
    @SerializedName("DNSFormat")
    @Expose
    private String DNSFormat;

    /**
     * Get <p>要查询解析量的域名</p> 
     * @return Domain <p>要查询解析量的域名</p>
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set <p>要查询解析量的域名</p>
     * @param Domain <p>要查询解析量的域名</p>
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get <p>查询的开始时间，格式：YYYY-MM-DD，最多允许查询最近32天的数据。</p> 
     * @return StartDate <p>查询的开始时间，格式：YYYY-MM-DD，最多允许查询最近32天的数据。</p>
     */
    public String getStartDate() {
        return this.StartDate;
    }

    /**
     * Set <p>查询的开始时间，格式：YYYY-MM-DD，最多允许查询最近32天的数据。</p>
     * @param StartDate <p>查询的开始时间，格式：YYYY-MM-DD，最多允许查询最近32天的数据。</p>
     */
    public void setStartDate(String StartDate) {
        this.StartDate = StartDate;
    }

    /**
     * Get <p>查询的结束时间，格式：YYYY-MM-DD，最多允许查询最近32天的数据。</p> 
     * @return EndDate <p>查询的结束时间，格式：YYYY-MM-DD，最多允许查询最近32天的数据。</p>
     */
    public String getEndDate() {
        return this.EndDate;
    }

    /**
     * Set <p>查询的结束时间，格式：YYYY-MM-DD，最多允许查询最近32天的数据。</p>
     * @param EndDate <p>查询的结束时间，格式：YYYY-MM-DD，最多允许查询最近32天的数据。</p>
     */
    public void setEndDate(String EndDate) {
        this.EndDate = EndDate;
    }

    /**
     * Get <p>数据统计格式</p><p>枚举值：</p><ul><li>minute： 按十分钟维度统计数据</li><li>hour： 按小时维度统计数据</li><li>day： 按天维度统计数据</li></ul> 
     * @return DnsFormat <p>数据统计格式</p><p>枚举值：</p><ul><li>minute： 按十分钟维度统计数据</li><li>hour： 按小时维度统计数据</li><li>day： 按天维度统计数据</li></ul>
     * @deprecated
     */
    @Deprecated
    public String getDnsFormat() {
        return this.DnsFormat;
    }

    /**
     * Set <p>数据统计格式</p><p>枚举值：</p><ul><li>minute： 按十分钟维度统计数据</li><li>hour： 按小时维度统计数据</li><li>day： 按天维度统计数据</li></ul>
     * @param DnsFormat <p>数据统计格式</p><p>枚举值：</p><ul><li>minute： 按十分钟维度统计数据</li><li>hour： 按小时维度统计数据</li><li>day： 按天维度统计数据</li></ul>
     * @deprecated
     */
    @Deprecated
    public void setDnsFormat(String DnsFormat) {
        this.DnsFormat = DnsFormat;
    }

    /**
     * Get <p>域名 ID 。参数 DomainId 优先级比参数 Domain 高，如果传递参数 DomainId 将忽略参数 Domain 。可以通过接口DescribeDomainList查到所有的Domain以及DomainId</p> 
     * @return DomainId <p>域名 ID 。参数 DomainId 优先级比参数 Domain 高，如果传递参数 DomainId 将忽略参数 Domain 。可以通过接口DescribeDomainList查到所有的Domain以及DomainId</p>
     */
    public Long getDomainId() {
        return this.DomainId;
    }

    /**
     * Set <p>域名 ID 。参数 DomainId 优先级比参数 Domain 高，如果传递参数 DomainId 将忽略参数 Domain 。可以通过接口DescribeDomainList查到所有的Domain以及DomainId</p>
     * @param DomainId <p>域名 ID 。参数 DomainId 优先级比参数 Domain 高，如果传递参数 DomainId 将忽略参数 Domain 。可以通过接口DescribeDomainList查到所有的Domain以及DomainId</p>
     */
    public void setDomainId(Long DomainId) {
        this.DomainId = DomainId;
    }

    /**
     * Get <p>数据统计格式</p><p>枚举值：</p><ul><li>minute： 按十分钟维度统计数据</li><li>hour： 按小时维度统计数据</li><li>day： 按天维度统计数据</li></ul><p>新增规范参数，同时传递DNSFormat和DnsFormat参数时，后端优先使用DNSFormat参数</p> 
     * @return DNSFormat <p>数据统计格式</p><p>枚举值：</p><ul><li>minute： 按十分钟维度统计数据</li><li>hour： 按小时维度统计数据</li><li>day： 按天维度统计数据</li></ul><p>新增规范参数，同时传递DNSFormat和DnsFormat参数时，后端优先使用DNSFormat参数</p>
     */
    public String getDNSFormat() {
        return this.DNSFormat;
    }

    /**
     * Set <p>数据统计格式</p><p>枚举值：</p><ul><li>minute： 按十分钟维度统计数据</li><li>hour： 按小时维度统计数据</li><li>day： 按天维度统计数据</li></ul><p>新增规范参数，同时传递DNSFormat和DnsFormat参数时，后端优先使用DNSFormat参数</p>
     * @param DNSFormat <p>数据统计格式</p><p>枚举值：</p><ul><li>minute： 按十分钟维度统计数据</li><li>hour： 按小时维度统计数据</li><li>day： 按天维度统计数据</li></ul><p>新增规范参数，同时传递DNSFormat和DnsFormat参数时，后端优先使用DNSFormat参数</p>
     */
    public void setDNSFormat(String DNSFormat) {
        this.DNSFormat = DNSFormat;
    }

    public DescribeResolveCountRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeResolveCountRequest(DescribeResolveCountRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.StartDate != null) {
            this.StartDate = new String(source.StartDate);
        }
        if (source.EndDate != null) {
            this.EndDate = new String(source.EndDate);
        }
        if (source.DnsFormat != null) {
            this.DnsFormat = new String(source.DnsFormat);
        }
        if (source.DomainId != null) {
            this.DomainId = new Long(source.DomainId);
        }
        if (source.DNSFormat != null) {
            this.DNSFormat = new String(source.DNSFormat);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "StartDate", this.StartDate);
        this.setParamSimple(map, prefix + "EndDate", this.EndDate);
        this.setParamSimple(map, prefix + "DnsFormat", this.DnsFormat);
        this.setParamSimple(map, prefix + "DomainId", this.DomainId);
        this.setParamSimple(map, prefix + "DNSFormat", this.DNSFormat);

    }
}

