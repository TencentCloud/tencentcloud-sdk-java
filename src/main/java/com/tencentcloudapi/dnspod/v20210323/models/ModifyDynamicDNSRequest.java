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
    * <p>域名</p>
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * <p>记录ID。 可以通过接口DescribeRecordList查到所有的解析记录列表以及对应的RecordId</p>
    */
    @SerializedName("RecordId")
    @Expose
    private Long RecordId;

    /**
    * <p>记录线路，中文，比如：默认。</p>
    */
    @SerializedName("RecordLine")
    @Expose
    private String RecordLine;

    /**
    * <p>域名 ID 。参数 DomainId 优先级比参数 Domain 高，如果传递参数 DomainId 将忽略参数 Domain 。</p>
    */
    @SerializedName("DomainId")
    @Expose
    private Long DomainId;

    /**
    * <p>主机记录，如 www，如果不传，默认为 @。</p>
    */
    @SerializedName("SubDomain")
    @Expose
    private String SubDomain;

    /**
    * <p>线路的 ID，英文字符串，比如：10=1。参数RecordLineId优先级高于RecordLine，如果同时传递二者，优先使用RecordLineId参数。</p>
    */
    @SerializedName("RecordLineId")
    @Expose
    private String RecordLineId;

    /**
    * <p>IP 地址，支持 IPv4、IPv6，例如 119.29.29.29 或者 2402:4e00::</p>
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * <p>TTL值，如果不传，默认为域名的TTL值。</p>
    */
    @SerializedName("Ttl")
    @Expose
    private Long Ttl;

    /**
    * <p>TTL值，如果不传，默认为域名的TTL值。</p><p>新增规范参数，同时传递TTL和Ttl参数时，后端优先使用TTL参数</p>
    */
    @SerializedName("TTL")
    @Expose
    private Long TTL;

    /**
     * Get <p>域名</p> 
     * @return Domain <p>域名</p>
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set <p>域名</p>
     * @param Domain <p>域名</p>
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get <p>记录ID。 可以通过接口DescribeRecordList查到所有的解析记录列表以及对应的RecordId</p> 
     * @return RecordId <p>记录ID。 可以通过接口DescribeRecordList查到所有的解析记录列表以及对应的RecordId</p>
     */
    public Long getRecordId() {
        return this.RecordId;
    }

    /**
     * Set <p>记录ID。 可以通过接口DescribeRecordList查到所有的解析记录列表以及对应的RecordId</p>
     * @param RecordId <p>记录ID。 可以通过接口DescribeRecordList查到所有的解析记录列表以及对应的RecordId</p>
     */
    public void setRecordId(Long RecordId) {
        this.RecordId = RecordId;
    }

    /**
     * Get <p>记录线路，中文，比如：默认。</p> 
     * @return RecordLine <p>记录线路，中文，比如：默认。</p>
     */
    public String getRecordLine() {
        return this.RecordLine;
    }

    /**
     * Set <p>记录线路，中文，比如：默认。</p>
     * @param RecordLine <p>记录线路，中文，比如：默认。</p>
     */
    public void setRecordLine(String RecordLine) {
        this.RecordLine = RecordLine;
    }

    /**
     * Get <p>域名 ID 。参数 DomainId 优先级比参数 Domain 高，如果传递参数 DomainId 将忽略参数 Domain 。</p> 
     * @return DomainId <p>域名 ID 。参数 DomainId 优先级比参数 Domain 高，如果传递参数 DomainId 将忽略参数 Domain 。</p>
     */
    public Long getDomainId() {
        return this.DomainId;
    }

    /**
     * Set <p>域名 ID 。参数 DomainId 优先级比参数 Domain 高，如果传递参数 DomainId 将忽略参数 Domain 。</p>
     * @param DomainId <p>域名 ID 。参数 DomainId 优先级比参数 Domain 高，如果传递参数 DomainId 将忽略参数 Domain 。</p>
     */
    public void setDomainId(Long DomainId) {
        this.DomainId = DomainId;
    }

    /**
     * Get <p>主机记录，如 www，如果不传，默认为 @。</p> 
     * @return SubDomain <p>主机记录，如 www，如果不传，默认为 @。</p>
     */
    public String getSubDomain() {
        return this.SubDomain;
    }

    /**
     * Set <p>主机记录，如 www，如果不传，默认为 @。</p>
     * @param SubDomain <p>主机记录，如 www，如果不传，默认为 @。</p>
     */
    public void setSubDomain(String SubDomain) {
        this.SubDomain = SubDomain;
    }

    /**
     * Get <p>线路的 ID，英文字符串，比如：10=1。参数RecordLineId优先级高于RecordLine，如果同时传递二者，优先使用RecordLineId参数。</p> 
     * @return RecordLineId <p>线路的 ID，英文字符串，比如：10=1。参数RecordLineId优先级高于RecordLine，如果同时传递二者，优先使用RecordLineId参数。</p>
     */
    public String getRecordLineId() {
        return this.RecordLineId;
    }

    /**
     * Set <p>线路的 ID，英文字符串，比如：10=1。参数RecordLineId优先级高于RecordLine，如果同时传递二者，优先使用RecordLineId参数。</p>
     * @param RecordLineId <p>线路的 ID，英文字符串，比如：10=1。参数RecordLineId优先级高于RecordLine，如果同时传递二者，优先使用RecordLineId参数。</p>
     */
    public void setRecordLineId(String RecordLineId) {
        this.RecordLineId = RecordLineId;
    }

    /**
     * Get <p>IP 地址，支持 IPv4、IPv6，例如 119.29.29.29 或者 2402:4e00::</p> 
     * @return Value <p>IP 地址，支持 IPv4、IPv6，例如 119.29.29.29 或者 2402:4e00::</p>
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set <p>IP 地址，支持 IPv4、IPv6，例如 119.29.29.29 或者 2402:4e00::</p>
     * @param Value <p>IP 地址，支持 IPv4、IPv6，例如 119.29.29.29 或者 2402:4e00::</p>
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get <p>TTL值，如果不传，默认为域名的TTL值。</p> 
     * @return Ttl <p>TTL值，如果不传，默认为域名的TTL值。</p>
     * @deprecated
     */
    @Deprecated
    public Long getTtl() {
        return this.Ttl;
    }

    /**
     * Set <p>TTL值，如果不传，默认为域名的TTL值。</p>
     * @param Ttl <p>TTL值，如果不传，默认为域名的TTL值。</p>
     * @deprecated
     */
    @Deprecated
    public void setTtl(Long Ttl) {
        this.Ttl = Ttl;
    }

    /**
     * Get <p>TTL值，如果不传，默认为域名的TTL值。</p><p>新增规范参数，同时传递TTL和Ttl参数时，后端优先使用TTL参数</p> 
     * @return TTL <p>TTL值，如果不传，默认为域名的TTL值。</p><p>新增规范参数，同时传递TTL和Ttl参数时，后端优先使用TTL参数</p>
     */
    public Long getTTL() {
        return this.TTL;
    }

    /**
     * Set <p>TTL值，如果不传，默认为域名的TTL值。</p><p>新增规范参数，同时传递TTL和Ttl参数时，后端优先使用TTL参数</p>
     * @param TTL <p>TTL值，如果不传，默认为域名的TTL值。</p><p>新增规范参数，同时传递TTL和Ttl参数时，后端优先使用TTL参数</p>
     */
    public void setTTL(Long TTL) {
        this.TTL = TTL;
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
        if (source.TTL != null) {
            this.TTL = new Long(source.TTL);
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
        this.setParamSimple(map, prefix + "TTL", this.TTL);

    }
}

