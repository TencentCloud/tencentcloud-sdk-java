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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVpcEndPointRequest extends AbstractModel{

    /**
    * 过滤条件。
<li> end-point-service-id- String - （过滤条件）终端节点服务ID。</li>
<li>end-point-name - String - （过滤条件）终端节点实例名称。</li>
<li> end-point-id- String - （过滤条件）终端节点实例ID。</li>
<li> vpc-id- String - （过滤条件）VPC实例ID。</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 偏移量，默认为0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 单页返回数量，默认为20，最大值为100。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 终端节点ID列表。
    */
    @SerializedName("EndPointId")
    @Expose
    private String [] EndPointId;

    /**
     * Get 过滤条件。
<li> end-point-service-id- String - （过滤条件）终端节点服务ID。</li>
<li>end-point-name - String - （过滤条件）终端节点实例名称。</li>
<li> end-point-id- String - （过滤条件）终端节点实例ID。</li>
<li> vpc-id- String - （过滤条件）VPC实例ID。</li> 
     * @return Filters 过滤条件。
<li> end-point-service-id- String - （过滤条件）终端节点服务ID。</li>
<li>end-point-name - String - （过滤条件）终端节点实例名称。</li>
<li> end-point-id- String - （过滤条件）终端节点实例ID。</li>
<li> vpc-id- String - （过滤条件）VPC实例ID。</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件。
<li> end-point-service-id- String - （过滤条件）终端节点服务ID。</li>
<li>end-point-name - String - （过滤条件）终端节点实例名称。</li>
<li> end-point-id- String - （过滤条件）终端节点实例ID。</li>
<li> vpc-id- String - （过滤条件）VPC实例ID。</li>
     * @param Filters 过滤条件。
<li> end-point-service-id- String - （过滤条件）终端节点服务ID。</li>
<li>end-point-name - String - （过滤条件）终端节点实例名称。</li>
<li> end-point-id- String - （过滤条件）终端节点实例ID。</li>
<li> vpc-id- String - （过滤条件）VPC实例ID。</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 偏移量，默认为0。 
     * @return Offset 偏移量，默认为0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为0。
     * @param Offset 偏移量，默认为0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 单页返回数量，默认为20，最大值为100。 
     * @return Limit 单页返回数量，默认为20，最大值为100。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 单页返回数量，默认为20，最大值为100。
     * @param Limit 单页返回数量，默认为20，最大值为100。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 终端节点ID列表。 
     * @return EndPointId 终端节点ID列表。
     */
    public String [] getEndPointId() {
        return this.EndPointId;
    }

    /**
     * Set 终端节点ID列表。
     * @param EndPointId 终端节点ID列表。
     */
    public void setEndPointId(String [] EndPointId) {
        this.EndPointId = EndPointId;
    }

    public DescribeVpcEndPointRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVpcEndPointRequest(DescribeVpcEndPointRequest source) {
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.EndPointId != null) {
            this.EndPointId = new String[source.EndPointId.length];
            for (int i = 0; i < source.EndPointId.length; i++) {
                this.EndPointId[i] = new String(source.EndPointId[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArraySimple(map, prefix + "EndPointId.", this.EndPointId);

    }
}

