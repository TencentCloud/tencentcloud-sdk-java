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

public class DomainAnalyticsInfo extends AbstractModel {

    /**
    * <p>DATE:按天维度统计 HOUR:按小时维度统计</p>
    */
    @SerializedName("DnsFormat")
    @Expose
    private String DnsFormat;

    /**
    * <p>当前统计周期解析量总计</p>
    */
    @SerializedName("DnsTotal")
    @Expose
    private Long DnsTotal;

    /**
    * <p>当前查询的域名</p>
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * <p>当前统计周期开始时间</p>
    */
    @SerializedName("StartDate")
    @Expose
    private String StartDate;

    /**
    * <p>当前统计周期结束时间</p>
    */
    @SerializedName("EndDate")
    @Expose
    private String EndDate;

    /**
    * <p>解析量数据格式</p><p>枚举值：</p><ul><li>DATE： 按天维度统计</li><li>HOUR： 按小时维度统计</li></ul>
    */
    @SerializedName("DNSFormat")
    @Expose
    private String DNSFormat;

    /**
    * <p>当前统计周期解析量总计</p>
    */
    @SerializedName("DNSTotal")
    @Expose
    private Long DNSTotal;

    /**
     * Get <p>DATE:按天维度统计 HOUR:按小时维度统计</p> 
     * @return DnsFormat <p>DATE:按天维度统计 HOUR:按小时维度统计</p>
     * @deprecated
     */
    @Deprecated
    public String getDnsFormat() {
        return this.DnsFormat;
    }

    /**
     * Set <p>DATE:按天维度统计 HOUR:按小时维度统计</p>
     * @param DnsFormat <p>DATE:按天维度统计 HOUR:按小时维度统计</p>
     * @deprecated
     */
    @Deprecated
    public void setDnsFormat(String DnsFormat) {
        this.DnsFormat = DnsFormat;
    }

    /**
     * Get <p>当前统计周期解析量总计</p> 
     * @return DnsTotal <p>当前统计周期解析量总计</p>
     * @deprecated
     */
    @Deprecated
    public Long getDnsTotal() {
        return this.DnsTotal;
    }

    /**
     * Set <p>当前统计周期解析量总计</p>
     * @param DnsTotal <p>当前统计周期解析量总计</p>
     * @deprecated
     */
    @Deprecated
    public void setDnsTotal(Long DnsTotal) {
        this.DnsTotal = DnsTotal;
    }

    /**
     * Get <p>当前查询的域名</p> 
     * @return Domain <p>当前查询的域名</p>
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set <p>当前查询的域名</p>
     * @param Domain <p>当前查询的域名</p>
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get <p>当前统计周期开始时间</p> 
     * @return StartDate <p>当前统计周期开始时间</p>
     */
    public String getStartDate() {
        return this.StartDate;
    }

    /**
     * Set <p>当前统计周期开始时间</p>
     * @param StartDate <p>当前统计周期开始时间</p>
     */
    public void setStartDate(String StartDate) {
        this.StartDate = StartDate;
    }

    /**
     * Get <p>当前统计周期结束时间</p> 
     * @return EndDate <p>当前统计周期结束时间</p>
     */
    public String getEndDate() {
        return this.EndDate;
    }

    /**
     * Set <p>当前统计周期结束时间</p>
     * @param EndDate <p>当前统计周期结束时间</p>
     */
    public void setEndDate(String EndDate) {
        this.EndDate = EndDate;
    }

    /**
     * Get <p>解析量数据格式</p><p>枚举值：</p><ul><li>DATE： 按天维度统计</li><li>HOUR： 按小时维度统计</li></ul> 
     * @return DNSFormat <p>解析量数据格式</p><p>枚举值：</p><ul><li>DATE： 按天维度统计</li><li>HOUR： 按小时维度统计</li></ul>
     */
    public String getDNSFormat() {
        return this.DNSFormat;
    }

    /**
     * Set <p>解析量数据格式</p><p>枚举值：</p><ul><li>DATE： 按天维度统计</li><li>HOUR： 按小时维度统计</li></ul>
     * @param DNSFormat <p>解析量数据格式</p><p>枚举值：</p><ul><li>DATE： 按天维度统计</li><li>HOUR： 按小时维度统计</li></ul>
     */
    public void setDNSFormat(String DNSFormat) {
        this.DNSFormat = DNSFormat;
    }

    /**
     * Get <p>当前统计周期解析量总计</p> 
     * @return DNSTotal <p>当前统计周期解析量总计</p>
     */
    public Long getDNSTotal() {
        return this.DNSTotal;
    }

    /**
     * Set <p>当前统计周期解析量总计</p>
     * @param DNSTotal <p>当前统计周期解析量总计</p>
     */
    public void setDNSTotal(Long DNSTotal) {
        this.DNSTotal = DNSTotal;
    }

    public DomainAnalyticsInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DomainAnalyticsInfo(DomainAnalyticsInfo source) {
        if (source.DnsFormat != null) {
            this.DnsFormat = new String(source.DnsFormat);
        }
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
        if (source.DNSFormat != null) {
            this.DNSFormat = new String(source.DNSFormat);
        }
        if (source.DNSTotal != null) {
            this.DNSTotal = new Long(source.DNSTotal);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DnsFormat", this.DnsFormat);
        this.setParamSimple(map, prefix + "DnsTotal", this.DnsTotal);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "StartDate", this.StartDate);
        this.setParamSimple(map, prefix + "EndDate", this.EndDate);
        this.setParamSimple(map, prefix + "DNSFormat", this.DNSFormat);
        this.setParamSimple(map, prefix + "DNSTotal", this.DNSTotal);

    }
}

