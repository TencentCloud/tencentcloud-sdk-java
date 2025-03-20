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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateSubDomainsAnalyticsFileRequest extends AbstractModel {

    /**
    * 需要查询解析量的域名数组。
    */
    @SerializedName("Domains")
    @Expose
    private SubDomainsAnalyticsParamsItem [] Domains;

    /**
    * 查询解析量的时间区间起点。如：2023-01-01。
    */
    @SerializedName("StartDate")
    @Expose
    private String StartDate;

    /**
    * 查询解析量子域名类型。
1：子域名
2：无解析量子域名
    */
    @SerializedName("SubDomainType")
    @Expose
    private Long SubDomainType;

    /**
    * 查询解析量的统计维度。默认为 DATE。
DATE：按天统计
HOUR：按小时统计
    */
    @SerializedName("DNSFormat")
    @Expose
    private String DNSFormat;

    /**
    * 查询解析量的时间区间终点。如：2023-01-01。默认为当天。
    */
    @SerializedName("EndDate")
    @Expose
    private String EndDate;

    /**
     * Get 需要查询解析量的域名数组。 
     * @return Domains 需要查询解析量的域名数组。
     */
    public SubDomainsAnalyticsParamsItem [] getDomains() {
        return this.Domains;
    }

    /**
     * Set 需要查询解析量的域名数组。
     * @param Domains 需要查询解析量的域名数组。
     */
    public void setDomains(SubDomainsAnalyticsParamsItem [] Domains) {
        this.Domains = Domains;
    }

    /**
     * Get 查询解析量的时间区间起点。如：2023-01-01。 
     * @return StartDate 查询解析量的时间区间起点。如：2023-01-01。
     */
    public String getStartDate() {
        return this.StartDate;
    }

    /**
     * Set 查询解析量的时间区间起点。如：2023-01-01。
     * @param StartDate 查询解析量的时间区间起点。如：2023-01-01。
     */
    public void setStartDate(String StartDate) {
        this.StartDate = StartDate;
    }

    /**
     * Get 查询解析量子域名类型。
1：子域名
2：无解析量子域名 
     * @return SubDomainType 查询解析量子域名类型。
1：子域名
2：无解析量子域名
     */
    public Long getSubDomainType() {
        return this.SubDomainType;
    }

    /**
     * Set 查询解析量子域名类型。
1：子域名
2：无解析量子域名
     * @param SubDomainType 查询解析量子域名类型。
1：子域名
2：无解析量子域名
     */
    public void setSubDomainType(Long SubDomainType) {
        this.SubDomainType = SubDomainType;
    }

    /**
     * Get 查询解析量的统计维度。默认为 DATE。
DATE：按天统计
HOUR：按小时统计 
     * @return DNSFormat 查询解析量的统计维度。默认为 DATE。
DATE：按天统计
HOUR：按小时统计
     */
    public String getDNSFormat() {
        return this.DNSFormat;
    }

    /**
     * Set 查询解析量的统计维度。默认为 DATE。
DATE：按天统计
HOUR：按小时统计
     * @param DNSFormat 查询解析量的统计维度。默认为 DATE。
DATE：按天统计
HOUR：按小时统计
     */
    public void setDNSFormat(String DNSFormat) {
        this.DNSFormat = DNSFormat;
    }

    /**
     * Get 查询解析量的时间区间终点。如：2023-01-01。默认为当天。 
     * @return EndDate 查询解析量的时间区间终点。如：2023-01-01。默认为当天。
     */
    public String getEndDate() {
        return this.EndDate;
    }

    /**
     * Set 查询解析量的时间区间终点。如：2023-01-01。默认为当天。
     * @param EndDate 查询解析量的时间区间终点。如：2023-01-01。默认为当天。
     */
    public void setEndDate(String EndDate) {
        this.EndDate = EndDate;
    }

    public CreateSubDomainsAnalyticsFileRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSubDomainsAnalyticsFileRequest(CreateSubDomainsAnalyticsFileRequest source) {
        if (source.Domains != null) {
            this.Domains = new SubDomainsAnalyticsParamsItem[source.Domains.length];
            for (int i = 0; i < source.Domains.length; i++) {
                this.Domains[i] = new SubDomainsAnalyticsParamsItem(source.Domains[i]);
            }
        }
        if (source.StartDate != null) {
            this.StartDate = new String(source.StartDate);
        }
        if (source.SubDomainType != null) {
            this.SubDomainType = new Long(source.SubDomainType);
        }
        if (source.DNSFormat != null) {
            this.DNSFormat = new String(source.DNSFormat);
        }
        if (source.EndDate != null) {
            this.EndDate = new String(source.EndDate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Domains.", this.Domains);
        this.setParamSimple(map, prefix + "StartDate", this.StartDate);
        this.setParamSimple(map, prefix + "SubDomainType", this.SubDomainType);
        this.setParamSimple(map, prefix + "DNSFormat", this.DNSFormat);
        this.setParamSimple(map, prefix + "EndDate", this.EndDate);

    }
}

