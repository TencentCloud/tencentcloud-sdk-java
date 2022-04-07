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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCcBlackWhiteIpListRequest extends AbstractModel{

    /**
    * 大禹子产品代号（bgp-multip：表示高防包；bgpip：表示高防IP）
    */
    @SerializedName("Business")
    @Expose
    private String Business;

    /**
    * 指定特定实例Id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 页起始偏移，取值为(页码-1)*一页条数
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 一页条数
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * IP地址，普通高防IP要传该字段
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 域名，普通高防IP要传该字段
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 协议，普通高防IP要传该字段
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 筛选IP，需要筛选黑白名单IP时传该字段
    */
    @SerializedName("FilterIp")
    @Expose
    private String FilterIp;

    /**
    * 黑白名单筛选字段，需要筛选黑白名单列表时传该字段
    */
    @SerializedName("FilterType")
    @Expose
    private String FilterType;

    /**
     * Get 大禹子产品代号（bgp-multip：表示高防包；bgpip：表示高防IP） 
     * @return Business 大禹子产品代号（bgp-multip：表示高防包；bgpip：表示高防IP）
     */
    public String getBusiness() {
        return this.Business;
    }

    /**
     * Set 大禹子产品代号（bgp-multip：表示高防包；bgpip：表示高防IP）
     * @param Business 大禹子产品代号（bgp-multip：表示高防包；bgpip：表示高防IP）
     */
    public void setBusiness(String Business) {
        this.Business = Business;
    }

    /**
     * Get 指定特定实例Id 
     * @return InstanceId 指定特定实例Id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 指定特定实例Id
     * @param InstanceId 指定特定实例Id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 页起始偏移，取值为(页码-1)*一页条数 
     * @return Offset 页起始偏移，取值为(页码-1)*一页条数
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 页起始偏移，取值为(页码-1)*一页条数
     * @param Offset 页起始偏移，取值为(页码-1)*一页条数
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 一页条数 
     * @return Limit 一页条数
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 一页条数
     * @param Limit 一页条数
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get IP地址，普通高防IP要传该字段 
     * @return Ip IP地址，普通高防IP要传该字段
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set IP地址，普通高防IP要传该字段
     * @param Ip IP地址，普通高防IP要传该字段
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get 域名，普通高防IP要传该字段 
     * @return Domain 域名，普通高防IP要传该字段
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 域名，普通高防IP要传该字段
     * @param Domain 域名，普通高防IP要传该字段
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 协议，普通高防IP要传该字段 
     * @return Protocol 协议，普通高防IP要传该字段
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 协议，普通高防IP要传该字段
     * @param Protocol 协议，普通高防IP要传该字段
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 筛选IP，需要筛选黑白名单IP时传该字段 
     * @return FilterIp 筛选IP，需要筛选黑白名单IP时传该字段
     */
    public String getFilterIp() {
        return this.FilterIp;
    }

    /**
     * Set 筛选IP，需要筛选黑白名单IP时传该字段
     * @param FilterIp 筛选IP，需要筛选黑白名单IP时传该字段
     */
    public void setFilterIp(String FilterIp) {
        this.FilterIp = FilterIp;
    }

    /**
     * Get 黑白名单筛选字段，需要筛选黑白名单列表时传该字段 
     * @return FilterType 黑白名单筛选字段，需要筛选黑白名单列表时传该字段
     */
    public String getFilterType() {
        return this.FilterType;
    }

    /**
     * Set 黑白名单筛选字段，需要筛选黑白名单列表时传该字段
     * @param FilterType 黑白名单筛选字段，需要筛选黑白名单列表时传该字段
     */
    public void setFilterType(String FilterType) {
        this.FilterType = FilterType;
    }

    public DescribeCcBlackWhiteIpListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCcBlackWhiteIpListRequest(DescribeCcBlackWhiteIpListRequest source) {
        if (source.Business != null) {
            this.Business = new String(source.Business);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.FilterIp != null) {
            this.FilterIp = new String(source.FilterIp);
        }
        if (source.FilterType != null) {
            this.FilterType = new String(source.FilterType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Business", this.Business);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "FilterIp", this.FilterIp);
        this.setParamSimple(map, prefix + "FilterType", this.FilterType);

    }
}

