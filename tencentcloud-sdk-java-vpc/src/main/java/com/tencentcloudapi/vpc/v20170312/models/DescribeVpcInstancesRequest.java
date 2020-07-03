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

public class DescribeVpcInstancesRequest extends AbstractModel{

    /**
    * 过滤条件，参数不支持同时指定RouteTableIds和Filters。
<li>vpc-id - String - （过滤条件）VPC实例ID，形如：vpc-f49l6u0z。</li>
<li>instance-id - String - （过滤条件）云主机实例ID。</li>
<li>instance-name - String - （过滤条件）云主机名称。</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 偏移量。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 请求对象个数。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 过滤条件，参数不支持同时指定RouteTableIds和Filters。
<li>vpc-id - String - （过滤条件）VPC实例ID，形如：vpc-f49l6u0z。</li>
<li>instance-id - String - （过滤条件）云主机实例ID。</li>
<li>instance-name - String - （过滤条件）云主机名称。</li> 
     * @return Filters 过滤条件，参数不支持同时指定RouteTableIds和Filters。
<li>vpc-id - String - （过滤条件）VPC实例ID，形如：vpc-f49l6u0z。</li>
<li>instance-id - String - （过滤条件）云主机实例ID。</li>
<li>instance-name - String - （过滤条件）云主机名称。</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件，参数不支持同时指定RouteTableIds和Filters。
<li>vpc-id - String - （过滤条件）VPC实例ID，形如：vpc-f49l6u0z。</li>
<li>instance-id - String - （过滤条件）云主机实例ID。</li>
<li>instance-name - String - （过滤条件）云主机名称。</li>
     * @param Filters 过滤条件，参数不支持同时指定RouteTableIds和Filters。
<li>vpc-id - String - （过滤条件）VPC实例ID，形如：vpc-f49l6u0z。</li>
<li>instance-id - String - （过滤条件）云主机实例ID。</li>
<li>instance-name - String - （过滤条件）云主机名称。</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 偏移量。 
     * @return Offset 偏移量。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量。
     * @param Offset 偏移量。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 请求对象个数。 
     * @return Limit 请求对象个数。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 请求对象个数。
     * @param Limit 请求对象个数。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

