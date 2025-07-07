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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeGlobalRoutesRequest extends AbstractModel {

    /**
    * 过滤条件。
<li>global-route-id - String - （过滤条件）如全局路由唯一 Id，形如：gr-bmenrwu2。</li>
<li>vpc-id - String - （过滤条件）VPC唯一Id， 形如： vpc-mcqaoy0f。</li>
<li>gateway-id - String - （过滤条件）下一跳对象。</li>
<li>gateway-type - String -  是否必填：否 - （过滤条件）按下一跳类型进行过滤。支持 NORMAL_CVM
</li>
<li>cdc-id - String - （过滤条件）CDC实例ID，形如：cluster-gbo27yc4。</li>
<li>description - String - （过滤条件）描述。</li>
<li>dest-cidr - String - （过滤条件）Ipv4目标网段。</li>
<li>subnet-route-algorithm - String - （过滤条件）支持的 ECMP算法有：

   - ECMP_QUINTUPLE_HASH：五元组hash
   - ECMP_SOURCE_DESTINATION_IP_HASH：源和目的IP hash
   - ECMP_DESTINATION_IP_HASH：目的IP hash
   - ECMP_SOURCE_IP_HASH：源IP hash
</li>

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
    * 全局路由唯一Id列表。
    */
    @SerializedName("GlobalRouteIds")
    @Expose
    private String [] GlobalRouteIds;

    /**
     * Get 过滤条件。
<li>global-route-id - String - （过滤条件）如全局路由唯一 Id，形如：gr-bmenrwu2。</li>
<li>vpc-id - String - （过滤条件）VPC唯一Id， 形如： vpc-mcqaoy0f。</li>
<li>gateway-id - String - （过滤条件）下一跳对象。</li>
<li>gateway-type - String -  是否必填：否 - （过滤条件）按下一跳类型进行过滤。支持 NORMAL_CVM
</li>
<li>cdc-id - String - （过滤条件）CDC实例ID，形如：cluster-gbo27yc4。</li>
<li>description - String - （过滤条件）描述。</li>
<li>dest-cidr - String - （过滤条件）Ipv4目标网段。</li>
<li>subnet-route-algorithm - String - （过滤条件）支持的 ECMP算法有：

   - ECMP_QUINTUPLE_HASH：五元组hash
   - ECMP_SOURCE_DESTINATION_IP_HASH：源和目的IP hash
   - ECMP_DESTINATION_IP_HASH：目的IP hash
   - ECMP_SOURCE_IP_HASH：源IP hash
</li>
 
     * @return Filters 过滤条件。
<li>global-route-id - String - （过滤条件）如全局路由唯一 Id，形如：gr-bmenrwu2。</li>
<li>vpc-id - String - （过滤条件）VPC唯一Id， 形如： vpc-mcqaoy0f。</li>
<li>gateway-id - String - （过滤条件）下一跳对象。</li>
<li>gateway-type - String -  是否必填：否 - （过滤条件）按下一跳类型进行过滤。支持 NORMAL_CVM
</li>
<li>cdc-id - String - （过滤条件）CDC实例ID，形如：cluster-gbo27yc4。</li>
<li>description - String - （过滤条件）描述。</li>
<li>dest-cidr - String - （过滤条件）Ipv4目标网段。</li>
<li>subnet-route-algorithm - String - （过滤条件）支持的 ECMP算法有：

   - ECMP_QUINTUPLE_HASH：五元组hash
   - ECMP_SOURCE_DESTINATION_IP_HASH：源和目的IP hash
   - ECMP_DESTINATION_IP_HASH：目的IP hash
   - ECMP_SOURCE_IP_HASH：源IP hash
</li>

     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件。
<li>global-route-id - String - （过滤条件）如全局路由唯一 Id，形如：gr-bmenrwu2。</li>
<li>vpc-id - String - （过滤条件）VPC唯一Id， 形如： vpc-mcqaoy0f。</li>
<li>gateway-id - String - （过滤条件）下一跳对象。</li>
<li>gateway-type - String -  是否必填：否 - （过滤条件）按下一跳类型进行过滤。支持 NORMAL_CVM
</li>
<li>cdc-id - String - （过滤条件）CDC实例ID，形如：cluster-gbo27yc4。</li>
<li>description - String - （过滤条件）描述。</li>
<li>dest-cidr - String - （过滤条件）Ipv4目标网段。</li>
<li>subnet-route-algorithm - String - （过滤条件）支持的 ECMP算法有：

   - ECMP_QUINTUPLE_HASH：五元组hash
   - ECMP_SOURCE_DESTINATION_IP_HASH：源和目的IP hash
   - ECMP_DESTINATION_IP_HASH：目的IP hash
   - ECMP_SOURCE_IP_HASH：源IP hash
</li>

     * @param Filters 过滤条件。
<li>global-route-id - String - （过滤条件）如全局路由唯一 Id，形如：gr-bmenrwu2。</li>
<li>vpc-id - String - （过滤条件）VPC唯一Id， 形如： vpc-mcqaoy0f。</li>
<li>gateway-id - String - （过滤条件）下一跳对象。</li>
<li>gateway-type - String -  是否必填：否 - （过滤条件）按下一跳类型进行过滤。支持 NORMAL_CVM
</li>
<li>cdc-id - String - （过滤条件）CDC实例ID，形如：cluster-gbo27yc4。</li>
<li>description - String - （过滤条件）描述。</li>
<li>dest-cidr - String - （过滤条件）Ipv4目标网段。</li>
<li>subnet-route-algorithm - String - （过滤条件）支持的 ECMP算法有：

   - ECMP_QUINTUPLE_HASH：五元组hash
   - ECMP_SOURCE_DESTINATION_IP_HASH：源和目的IP hash
   - ECMP_DESTINATION_IP_HASH：目的IP hash
   - ECMP_SOURCE_IP_HASH：源IP hash
</li>

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
     * Get 全局路由唯一Id列表。 
     * @return GlobalRouteIds 全局路由唯一Id列表。
     */
    public String [] getGlobalRouteIds() {
        return this.GlobalRouteIds;
    }

    /**
     * Set 全局路由唯一Id列表。
     * @param GlobalRouteIds 全局路由唯一Id列表。
     */
    public void setGlobalRouteIds(String [] GlobalRouteIds) {
        this.GlobalRouteIds = GlobalRouteIds;
    }

    public DescribeGlobalRoutesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeGlobalRoutesRequest(DescribeGlobalRoutesRequest source) {
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
        if (source.GlobalRouteIds != null) {
            this.GlobalRouteIds = new String[source.GlobalRouteIds.length];
            for (int i = 0; i < source.GlobalRouteIds.length; i++) {
                this.GlobalRouteIds[i] = new String(source.GlobalRouteIds[i]);
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
        this.setParamArraySimple(map, prefix + "GlobalRouteIds.", this.GlobalRouteIds);

    }
}

