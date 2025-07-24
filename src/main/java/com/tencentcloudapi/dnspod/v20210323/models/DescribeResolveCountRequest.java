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
    * 要查询解析量的域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 查询的开始时间，格式：YYYY-MM-DD，最多允许查询最近32天的数据。
    */
    @SerializedName("StartDate")
    @Expose
    private String StartDate;

    /**
    * 查询的结束时间，格式：YYYY-MM-DD，最多允许查询最近32天的数据。
    */
    @SerializedName("EndDate")
    @Expose
    private String EndDate;

    /**
    * 数据统计格式，取值为minute、hour、day，分别表示按十分钟、小时、天统计数据
    */
    @SerializedName("DnsFormat")
    @Expose
    private String DnsFormat;

    /**
    * 域名 ID 。参数 DomainId 优先级比参数 Domain 高，如果传递参数 DomainId 将忽略参数 Domain 。可以通过接口DescribeDomainList查到所有的Domain以及DomainId
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
     * Get 查询的开始时间，格式：YYYY-MM-DD，最多允许查询最近32天的数据。 
     * @return StartDate 查询的开始时间，格式：YYYY-MM-DD，最多允许查询最近32天的数据。
     */
    public String getStartDate() {
        return this.StartDate;
    }

    /**
     * Set 查询的开始时间，格式：YYYY-MM-DD，最多允许查询最近32天的数据。
     * @param StartDate 查询的开始时间，格式：YYYY-MM-DD，最多允许查询最近32天的数据。
     */
    public void setStartDate(String StartDate) {
        this.StartDate = StartDate;
    }

    /**
     * Get 查询的结束时间，格式：YYYY-MM-DD，最多允许查询最近32天的数据。 
     * @return EndDate 查询的结束时间，格式：YYYY-MM-DD，最多允许查询最近32天的数据。
     */
    public String getEndDate() {
        return this.EndDate;
    }

    /**
     * Set 查询的结束时间，格式：YYYY-MM-DD，最多允许查询最近32天的数据。
     * @param EndDate 查询的结束时间，格式：YYYY-MM-DD，最多允许查询最近32天的数据。
     */
    public void setEndDate(String EndDate) {
        this.EndDate = EndDate;
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

    /**
     * Get 域名 ID 。参数 DomainId 优先级比参数 Domain 高，如果传递参数 DomainId 将忽略参数 Domain 。可以通过接口DescribeDomainList查到所有的Domain以及DomainId 
     * @return DomainId 域名 ID 。参数 DomainId 优先级比参数 Domain 高，如果传递参数 DomainId 将忽略参数 Domain 。可以通过接口DescribeDomainList查到所有的Domain以及DomainId
     */
    public Long getDomainId() {
        return this.DomainId;
    }

    /**
     * Set 域名 ID 。参数 DomainId 优先级比参数 Domain 高，如果传递参数 DomainId 将忽略参数 Domain 。可以通过接口DescribeDomainList查到所有的Domain以及DomainId
     * @param DomainId 域名 ID 。参数 DomainId 优先级比参数 Domain 高，如果传递参数 DomainId 将忽略参数 Domain 。可以通过接口DescribeDomainList查到所有的Domain以及DomainId
     */
    public void setDomainId(Long DomainId) {
        this.DomainId = DomainId;
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

    }
}

