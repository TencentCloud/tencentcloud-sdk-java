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

public class SubDomainsAnalyticsParamsItem extends AbstractModel {

    /**
    * 要查询解析量的主域名。
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 要查询解析量的子域名主机头。
    */
    @SerializedName("SubDomain")
    @Expose
    private String SubDomain;

    /**
    * 查询子域名列表的偏移量。没有指定查询的 Subdomain 参数时，根据分页参数返回每页子域名解析量。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 查询子域名列表的每页条数。没有指定查询的 Subdomain 参数时，根据分页参数返回每页子域名解析量。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 要查询解析量的主域名。 
     * @return Domain 要查询解析量的主域名。
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 要查询解析量的主域名。
     * @param Domain 要查询解析量的主域名。
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 要查询解析量的子域名主机头。 
     * @return SubDomain 要查询解析量的子域名主机头。
     */
    public String getSubDomain() {
        return this.SubDomain;
    }

    /**
     * Set 要查询解析量的子域名主机头。
     * @param SubDomain 要查询解析量的子域名主机头。
     */
    public void setSubDomain(String SubDomain) {
        this.SubDomain = SubDomain;
    }

    /**
     * Get 查询子域名列表的偏移量。没有指定查询的 Subdomain 参数时，根据分页参数返回每页子域名解析量。 
     * @return Offset 查询子域名列表的偏移量。没有指定查询的 Subdomain 参数时，根据分页参数返回每页子域名解析量。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 查询子域名列表的偏移量。没有指定查询的 Subdomain 参数时，根据分页参数返回每页子域名解析量。
     * @param Offset 查询子域名列表的偏移量。没有指定查询的 Subdomain 参数时，根据分页参数返回每页子域名解析量。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 查询子域名列表的每页条数。没有指定查询的 Subdomain 参数时，根据分页参数返回每页子域名解析量。 
     * @return Limit 查询子域名列表的每页条数。没有指定查询的 Subdomain 参数时，根据分页参数返回每页子域名解析量。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 查询子域名列表的每页条数。没有指定查询的 Subdomain 参数时，根据分页参数返回每页子域名解析量。
     * @param Limit 查询子域名列表的每页条数。没有指定查询的 Subdomain 参数时，根据分页参数返回每页子域名解析量。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public SubDomainsAnalyticsParamsItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubDomainsAnalyticsParamsItem(SubDomainsAnalyticsParamsItem source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.SubDomain != null) {
            this.SubDomain = new String(source.SubDomain);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "SubDomain", this.SubDomain);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

