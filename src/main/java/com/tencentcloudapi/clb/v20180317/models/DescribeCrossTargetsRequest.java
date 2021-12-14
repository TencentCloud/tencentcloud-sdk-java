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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCrossTargetsRequest extends AbstractModel{

    /**
    * 返回后端服务列表数目，默认20，最大值100。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 返回后端服务列表起始偏移量，默认0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 查询跨域2.0版本云联网后端子机和网卡服务列表条件，详细的过滤条件如下：
<li> vpc-id - String - 是否必填：否 - （过滤条件）按照 本地私有网络ID，即负载均衡的VpcId 过滤，如："vpc-12345678"。</li>
<li> ip - String - 是否必填：否 - （过滤条件）按照 后端服务ip 过滤，如："192.168.0.1"。</li>
<li> listener-id - String - 是否必填：否 - （过滤条件）按照 监听器ID 过滤，如："lbl-12345678"。</li>
<li> location-id - String - 是否必填：否 - （过滤条件）按照 七层监听器规则ID 过滤，如："loc-12345678"。</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get 返回后端服务列表数目，默认20，最大值100。 
     * @return Limit 返回后端服务列表数目，默认20，最大值100。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回后端服务列表数目，默认20，最大值100。
     * @param Limit 返回后端服务列表数目，默认20，最大值100。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 返回后端服务列表起始偏移量，默认0。 
     * @return Offset 返回后端服务列表起始偏移量，默认0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 返回后端服务列表起始偏移量，默认0。
     * @param Offset 返回后端服务列表起始偏移量，默认0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 查询跨域2.0版本云联网后端子机和网卡服务列表条件，详细的过滤条件如下：
<li> vpc-id - String - 是否必填：否 - （过滤条件）按照 本地私有网络ID，即负载均衡的VpcId 过滤，如："vpc-12345678"。</li>
<li> ip - String - 是否必填：否 - （过滤条件）按照 后端服务ip 过滤，如："192.168.0.1"。</li>
<li> listener-id - String - 是否必填：否 - （过滤条件）按照 监听器ID 过滤，如："lbl-12345678"。</li>
<li> location-id - String - 是否必填：否 - （过滤条件）按照 七层监听器规则ID 过滤，如："loc-12345678"。</li> 
     * @return Filters 查询跨域2.0版本云联网后端子机和网卡服务列表条件，详细的过滤条件如下：
<li> vpc-id - String - 是否必填：否 - （过滤条件）按照 本地私有网络ID，即负载均衡的VpcId 过滤，如："vpc-12345678"。</li>
<li> ip - String - 是否必填：否 - （过滤条件）按照 后端服务ip 过滤，如："192.168.0.1"。</li>
<li> listener-id - String - 是否必填：否 - （过滤条件）按照 监听器ID 过滤，如："lbl-12345678"。</li>
<li> location-id - String - 是否必填：否 - （过滤条件）按照 七层监听器规则ID 过滤，如："loc-12345678"。</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 查询跨域2.0版本云联网后端子机和网卡服务列表条件，详细的过滤条件如下：
<li> vpc-id - String - 是否必填：否 - （过滤条件）按照 本地私有网络ID，即负载均衡的VpcId 过滤，如："vpc-12345678"。</li>
<li> ip - String - 是否必填：否 - （过滤条件）按照 后端服务ip 过滤，如："192.168.0.1"。</li>
<li> listener-id - String - 是否必填：否 - （过滤条件）按照 监听器ID 过滤，如："lbl-12345678"。</li>
<li> location-id - String - 是否必填：否 - （过滤条件）按照 七层监听器规则ID 过滤，如："loc-12345678"。</li>
     * @param Filters 查询跨域2.0版本云联网后端子机和网卡服务列表条件，详细的过滤条件如下：
<li> vpc-id - String - 是否必填：否 - （过滤条件）按照 本地私有网络ID，即负载均衡的VpcId 过滤，如："vpc-12345678"。</li>
<li> ip - String - 是否必填：否 - （过滤条件）按照 后端服务ip 过滤，如："192.168.0.1"。</li>
<li> listener-id - String - 是否必填：否 - （过滤条件）按照 监听器ID 过滤，如："lbl-12345678"。</li>
<li> location-id - String - 是否必填：否 - （过滤条件）按照 七层监听器规则ID 过滤，如："loc-12345678"。</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeCrossTargetsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCrossTargetsRequest(DescribeCrossTargetsRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

