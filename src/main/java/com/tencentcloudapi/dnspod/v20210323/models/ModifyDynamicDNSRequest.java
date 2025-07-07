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

public class ModifyDynamicDNSRequest extends AbstractModel {

    /**
    * 域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 记录ID。 可以通过接口DescribeRecordList查到所有的解析记录列表以及对应的RecordId
    */
    @SerializedName("RecordId")
    @Expose
    private Long RecordId;

    /**
    * 记录线路，中文，比如：默认。
    */
    @SerializedName("RecordLine")
    @Expose
    private String RecordLine;

    /**
    * 域名 ID 。参数 DomainId 优先级比参数 Domain 高，如果传递参数 DomainId 将忽略参数 Domain 。
    */
    @SerializedName("DomainId")
    @Expose
    private Long DomainId;

    /**
    * 主机记录，如 www，如果不传，默认为 @。
    */
    @SerializedName("SubDomain")
    @Expose
    private String SubDomain;

    /**
    * 线路的 ID，英文字符串，比如：10=1。参数RecordLineId优先级高于RecordLine，如果同时传递二者，优先使用RecordLineId参数。
    */
    @SerializedName("RecordLineId")
    @Expose
    private String RecordLineId;

    /**
    * IP 地址，支持 IPv4、IPv6，例如 119.29.29.29 或者 2402:4e00::
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * TTL值，如果不传，默认为域名的TTL值。
    */
    @SerializedName("Ttl")
    @Expose
    private Long Ttl;

    /**
     * Get 域名 
     * @return Domain 域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 域名
     * @param Domain 域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 记录ID。 可以通过接口DescribeRecordList查到所有的解析记录列表以及对应的RecordId 
     * @return RecordId 记录ID。 可以通过接口DescribeRecordList查到所有的解析记录列表以及对应的RecordId
     */
    public Long getRecordId() {
        return this.RecordId;
    }

    /**
     * Set 记录ID。 可以通过接口DescribeRecordList查到所有的解析记录列表以及对应的RecordId
     * @param RecordId 记录ID。 可以通过接口DescribeRecordList查到所有的解析记录列表以及对应的RecordId
     */
    public void setRecordId(Long RecordId) {
        this.RecordId = RecordId;
    }

    /**
     * Get 记录线路，中文，比如：默认。 
     * @return RecordLine 记录线路，中文，比如：默认。
     */
    public String getRecordLine() {
        return this.RecordLine;
    }

    /**
     * Set 记录线路，中文，比如：默认。
     * @param RecordLine 记录线路，中文，比如：默认。
     */
    public void setRecordLine(String RecordLine) {
        this.RecordLine = RecordLine;
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

    /**
     * Get 主机记录，如 www，如果不传，默认为 @。 
     * @return SubDomain 主机记录，如 www，如果不传，默认为 @。
     */
    public String getSubDomain() {
        return this.SubDomain;
    }

    /**
     * Set 主机记录，如 www，如果不传，默认为 @。
     * @param SubDomain 主机记录，如 www，如果不传，默认为 @。
     */
    public void setSubDomain(String SubDomain) {
        this.SubDomain = SubDomain;
    }

    /**
     * Get 线路的 ID，英文字符串，比如：10=1。参数RecordLineId优先级高于RecordLine，如果同时传递二者，优先使用RecordLineId参数。 
     * @return RecordLineId 线路的 ID，英文字符串，比如：10=1。参数RecordLineId优先级高于RecordLine，如果同时传递二者，优先使用RecordLineId参数。
     */
    public String getRecordLineId() {
        return this.RecordLineId;
    }

    /**
     * Set 线路的 ID，英文字符串，比如：10=1。参数RecordLineId优先级高于RecordLine，如果同时传递二者，优先使用RecordLineId参数。
     * @param RecordLineId 线路的 ID，英文字符串，比如：10=1。参数RecordLineId优先级高于RecordLine，如果同时传递二者，优先使用RecordLineId参数。
     */
    public void setRecordLineId(String RecordLineId) {
        this.RecordLineId = RecordLineId;
    }

    /**
     * Get IP 地址，支持 IPv4、IPv6，例如 119.29.29.29 或者 2402:4e00:: 
     * @return Value IP 地址，支持 IPv4、IPv6，例如 119.29.29.29 或者 2402:4e00::
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set IP 地址，支持 IPv4、IPv6，例如 119.29.29.29 或者 2402:4e00::
     * @param Value IP 地址，支持 IPv4、IPv6，例如 119.29.29.29 或者 2402:4e00::
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get TTL值，如果不传，默认为域名的TTL值。 
     * @return Ttl TTL值，如果不传，默认为域名的TTL值。
     */
    public Long getTtl() {
        return this.Ttl;
    }

    /**
     * Set TTL值，如果不传，默认为域名的TTL值。
     * @param Ttl TTL值，如果不传，默认为域名的TTL值。
     */
    public void setTtl(Long Ttl) {
        this.Ttl = Ttl;
    }

    public ModifyDynamicDNSRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDynamicDNSRequest(ModifyDynamicDNSRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.RecordId != null) {
            this.RecordId = new Long(source.RecordId);
        }
        if (source.RecordLine != null) {
            this.RecordLine = new String(source.RecordLine);
        }
        if (source.DomainId != null) {
            this.DomainId = new Long(source.DomainId);
        }
        if (source.SubDomain != null) {
            this.SubDomain = new String(source.SubDomain);
        }
        if (source.RecordLineId != null) {
            this.RecordLineId = new String(source.RecordLineId);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.Ttl != null) {
            this.Ttl = new Long(source.Ttl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "RecordId", this.RecordId);
        this.setParamSimple(map, prefix + "RecordLine", this.RecordLine);
        this.setParamSimple(map, prefix + "DomainId", this.DomainId);
        this.setParamSimple(map, prefix + "SubDomain", this.SubDomain);
        this.setParamSimple(map, prefix + "RecordLineId", this.RecordLineId);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "Ttl", this.Ttl);

    }
}

