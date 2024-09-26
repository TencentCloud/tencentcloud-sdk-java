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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeHighPriorityRoutesRequest extends AbstractModel {

    /**
    * 高优路由表唯一 ID。
    */
    @SerializedName("HighPriorityRouteTableId")
    @Expose
    private String HighPriorityRouteTableId;

    /**
    * <li>gateway-id - String - （过滤条件）网关ID。</li>
<li>description - String - （过滤条件）路由描述。</li>
<li>dest-cidr - String - （过滤条件）目的端地址，支持模糊左匹配。</li>
<li>subnet-route-algorithm - String - （过滤条件）现在支持的算法有：ECMP_QUINTUPLE_HASH：五元组hash，ECMP_SOURCE_DESTINATION_IP_HASH：源和目的IP hash，ECMP_DESTINATION_IP_HASH：目的IP hash，ECMP_SOURCE_IP_HASH：源IP hash。</li>
<li>is-cdc - String - （过滤条件）CDC属性高优路由表。</li>
<li>cdc-id - String - （过滤条件）CDC 集群唯一 ID 。</li>

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
     * Get 高优路由表唯一 ID。 
     * @return HighPriorityRouteTableId 高优路由表唯一 ID。
     */
    public String getHighPriorityRouteTableId() {
        return this.HighPriorityRouteTableId;
    }

    /**
     * Set 高优路由表唯一 ID。
     * @param HighPriorityRouteTableId 高优路由表唯一 ID。
     */
    public void setHighPriorityRouteTableId(String HighPriorityRouteTableId) {
        this.HighPriorityRouteTableId = HighPriorityRouteTableId;
    }

    /**
     * Get <li>gateway-id - String - （过滤条件）网关ID。</li>
<li>description - String - （过滤条件）路由描述。</li>
<li>dest-cidr - String - （过滤条件）目的端地址，支持模糊左匹配。</li>
<li>subnet-route-algorithm - String - （过滤条件）现在支持的算法有：ECMP_QUINTUPLE_HASH：五元组hash，ECMP_SOURCE_DESTINATION_IP_HASH：源和目的IP hash，ECMP_DESTINATION_IP_HASH：目的IP hash，ECMP_SOURCE_IP_HASH：源IP hash。</li>
<li>is-cdc - String - （过滤条件）CDC属性高优路由表。</li>
<li>cdc-id - String - （过滤条件）CDC 集群唯一 ID 。</li>
 
     * @return Filters <li>gateway-id - String - （过滤条件）网关ID。</li>
<li>description - String - （过滤条件）路由描述。</li>
<li>dest-cidr - String - （过滤条件）目的端地址，支持模糊左匹配。</li>
<li>subnet-route-algorithm - String - （过滤条件）现在支持的算法有：ECMP_QUINTUPLE_HASH：五元组hash，ECMP_SOURCE_DESTINATION_IP_HASH：源和目的IP hash，ECMP_DESTINATION_IP_HASH：目的IP hash，ECMP_SOURCE_IP_HASH：源IP hash。</li>
<li>is-cdc - String - （过滤条件）CDC属性高优路由表。</li>
<li>cdc-id - String - （过滤条件）CDC 集群唯一 ID 。</li>

     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <li>gateway-id - String - （过滤条件）网关ID。</li>
<li>description - String - （过滤条件）路由描述。</li>
<li>dest-cidr - String - （过滤条件）目的端地址，支持模糊左匹配。</li>
<li>subnet-route-algorithm - String - （过滤条件）现在支持的算法有：ECMP_QUINTUPLE_HASH：五元组hash，ECMP_SOURCE_DESTINATION_IP_HASH：源和目的IP hash，ECMP_DESTINATION_IP_HASH：目的IP hash，ECMP_SOURCE_IP_HASH：源IP hash。</li>
<li>is-cdc - String - （过滤条件）CDC属性高优路由表。</li>
<li>cdc-id - String - （过滤条件）CDC 集群唯一 ID 。</li>

     * @param Filters <li>gateway-id - String - （过滤条件）网关ID。</li>
<li>description - String - （过滤条件）路由描述。</li>
<li>dest-cidr - String - （过滤条件）目的端地址，支持模糊左匹配。</li>
<li>subnet-route-algorithm - String - （过滤条件）现在支持的算法有：ECMP_QUINTUPLE_HASH：五元组hash，ECMP_SOURCE_DESTINATION_IP_HASH：源和目的IP hash，ECMP_DESTINATION_IP_HASH：目的IP hash，ECMP_SOURCE_IP_HASH：源IP hash。</li>
<li>is-cdc - String - （过滤条件）CDC属性高优路由表。</li>
<li>cdc-id - String - （过滤条件）CDC 集群唯一 ID 。</li>

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

    public DescribeHighPriorityRoutesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeHighPriorityRoutesRequest(DescribeHighPriorityRoutesRequest source) {
        if (source.HighPriorityRouteTableId != null) {
            this.HighPriorityRouteTableId = new String(source.HighPriorityRouteTableId);
        }
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HighPriorityRouteTableId", this.HighPriorityRouteTableId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

