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
package com.tencentcloudapi.bmvpc.v20180625.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVpcPeerConnectionsRequest extends AbstractModel{

    /**
    * 对等连接实例ID
    */
    @SerializedName("VpcPeerConnectionIds")
    @Expose
    private String [] VpcPeerConnectionIds;

    /**
    * 过滤条件，详见下表：实例过滤条件表。每次请求的Filters的上限为10，Filter.Values的上限为5。参数不支持同时指定VpcPeerConnectionIds和Filters。
过滤条件，参数不支持同时指定VpcPeerConnectionIds和Filters。
<li>peer-name - String - （过滤条件）对等连接名称。</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 偏移量，默认为0。关于Offset的更进一步介绍请参考 API 简介中的相关小节。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回数量，默认为20，最大值为100。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 私有网络ID
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
     * Get 对等连接实例ID 
     * @return VpcPeerConnectionIds 对等连接实例ID
     */
    public String [] getVpcPeerConnectionIds() {
        return this.VpcPeerConnectionIds;
    }

    /**
     * Set 对等连接实例ID
     * @param VpcPeerConnectionIds 对等连接实例ID
     */
    public void setVpcPeerConnectionIds(String [] VpcPeerConnectionIds) {
        this.VpcPeerConnectionIds = VpcPeerConnectionIds;
    }

    /**
     * Get 过滤条件，详见下表：实例过滤条件表。每次请求的Filters的上限为10，Filter.Values的上限为5。参数不支持同时指定VpcPeerConnectionIds和Filters。
过滤条件，参数不支持同时指定VpcPeerConnectionIds和Filters。
<li>peer-name - String - （过滤条件）对等连接名称。</li> 
     * @return Filters 过滤条件，详见下表：实例过滤条件表。每次请求的Filters的上限为10，Filter.Values的上限为5。参数不支持同时指定VpcPeerConnectionIds和Filters。
过滤条件，参数不支持同时指定VpcPeerConnectionIds和Filters。
<li>peer-name - String - （过滤条件）对等连接名称。</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件，详见下表：实例过滤条件表。每次请求的Filters的上限为10，Filter.Values的上限为5。参数不支持同时指定VpcPeerConnectionIds和Filters。
过滤条件，参数不支持同时指定VpcPeerConnectionIds和Filters。
<li>peer-name - String - （过滤条件）对等连接名称。</li>
     * @param Filters 过滤条件，详见下表：实例过滤条件表。每次请求的Filters的上限为10，Filter.Values的上限为5。参数不支持同时指定VpcPeerConnectionIds和Filters。
过滤条件，参数不支持同时指定VpcPeerConnectionIds和Filters。
<li>peer-name - String - （过滤条件）对等连接名称。</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 偏移量，默认为0。关于Offset的更进一步介绍请参考 API 简介中的相关小节。 
     * @return Offset 偏移量，默认为0。关于Offset的更进一步介绍请参考 API 简介中的相关小节。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为0。关于Offset的更进一步介绍请参考 API 简介中的相关小节。
     * @param Offset 偏移量，默认为0。关于Offset的更进一步介绍请参考 API 简介中的相关小节。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回数量，默认为20，最大值为100。 
     * @return Limit 返回数量，默认为20，最大值为100。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，默认为20，最大值为100。
     * @param Limit 返回数量，默认为20，最大值为100。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 私有网络ID 
     * @return VpcId 私有网络ID
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 私有网络ID
     * @param VpcId 私有网络ID
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "VpcPeerConnectionIds.", this.VpcPeerConnectionIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);

    }
}

