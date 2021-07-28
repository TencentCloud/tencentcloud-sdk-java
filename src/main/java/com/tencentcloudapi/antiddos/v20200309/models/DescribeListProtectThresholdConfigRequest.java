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

public class DescribeListProtectThresholdConfigRequest extends AbstractModel{

    /**
    * 页起始偏移，取值为(页码-1)*一页条数
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 一页条数，当Limit=0时，默认一页条数为100;最大取值为100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 资源实例ID搜索, 支持资源实例前缀通配搜索，例如bgp-*表示获取高防包类型的资源实例
    */
    @SerializedName("FilterInstanceId")
    @Expose
    private String FilterInstanceId;

    /**
    * IP搜索
    */
    @SerializedName("FilterIp")
    @Expose
    private String FilterIp;

    /**
    * 域名搜索(查询域名与协议的CC防护阈值时使用）
    */
    @SerializedName("FilterDomain")
    @Expose
    private String FilterDomain;

    /**
    * 协议搜索(查询域名与协议的CC防护阈值时使用）
    */
    @SerializedName("FilterProtocol")
    @Expose
    private String FilterProtocol;

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
     * Get 一页条数，当Limit=0时，默认一页条数为100;最大取值为100 
     * @return Limit 一页条数，当Limit=0时，默认一页条数为100;最大取值为100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 一页条数，当Limit=0时，默认一页条数为100;最大取值为100
     * @param Limit 一页条数，当Limit=0时，默认一页条数为100;最大取值为100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 资源实例ID搜索, 支持资源实例前缀通配搜索，例如bgp-*表示获取高防包类型的资源实例 
     * @return FilterInstanceId 资源实例ID搜索, 支持资源实例前缀通配搜索，例如bgp-*表示获取高防包类型的资源实例
     */
    public String getFilterInstanceId() {
        return this.FilterInstanceId;
    }

    /**
     * Set 资源实例ID搜索, 支持资源实例前缀通配搜索，例如bgp-*表示获取高防包类型的资源实例
     * @param FilterInstanceId 资源实例ID搜索, 支持资源实例前缀通配搜索，例如bgp-*表示获取高防包类型的资源实例
     */
    public void setFilterInstanceId(String FilterInstanceId) {
        this.FilterInstanceId = FilterInstanceId;
    }

    /**
     * Get IP搜索 
     * @return FilterIp IP搜索
     */
    public String getFilterIp() {
        return this.FilterIp;
    }

    /**
     * Set IP搜索
     * @param FilterIp IP搜索
     */
    public void setFilterIp(String FilterIp) {
        this.FilterIp = FilterIp;
    }

    /**
     * Get 域名搜索(查询域名与协议的CC防护阈值时使用） 
     * @return FilterDomain 域名搜索(查询域名与协议的CC防护阈值时使用）
     */
    public String getFilterDomain() {
        return this.FilterDomain;
    }

    /**
     * Set 域名搜索(查询域名与协议的CC防护阈值时使用）
     * @param FilterDomain 域名搜索(查询域名与协议的CC防护阈值时使用）
     */
    public void setFilterDomain(String FilterDomain) {
        this.FilterDomain = FilterDomain;
    }

    /**
     * Get 协议搜索(查询域名与协议的CC防护阈值时使用） 
     * @return FilterProtocol 协议搜索(查询域名与协议的CC防护阈值时使用）
     */
    public String getFilterProtocol() {
        return this.FilterProtocol;
    }

    /**
     * Set 协议搜索(查询域名与协议的CC防护阈值时使用）
     * @param FilterProtocol 协议搜索(查询域名与协议的CC防护阈值时使用）
     */
    public void setFilterProtocol(String FilterProtocol) {
        this.FilterProtocol = FilterProtocol;
    }

    public DescribeListProtectThresholdConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeListProtectThresholdConfigRequest(DescribeListProtectThresholdConfigRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.FilterInstanceId != null) {
            this.FilterInstanceId = new String(source.FilterInstanceId);
        }
        if (source.FilterIp != null) {
            this.FilterIp = new String(source.FilterIp);
        }
        if (source.FilterDomain != null) {
            this.FilterDomain = new String(source.FilterDomain);
        }
        if (source.FilterProtocol != null) {
            this.FilterProtocol = new String(source.FilterProtocol);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "FilterInstanceId", this.FilterInstanceId);
        this.setParamSimple(map, prefix + "FilterIp", this.FilterIp);
        this.setParamSimple(map, prefix + "FilterDomain", this.FilterDomain);
        this.setParamSimple(map, prefix + "FilterProtocol", this.FilterProtocol);

    }
}

