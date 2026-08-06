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
package com.tencentcloudapi.oceanus.v20190422.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeClustersRequest extends AbstractModel {

    /**
    * <p>按照一个或者多个集群 ID 查询，每次请求的集群上限为 100</p>
    */
    @SerializedName("ClusterIds")
    @Expose
    private String [] ClusterIds;

    /**
    * <p>偏移量，默认 0</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>请求的集群数量，默认 20，最大值 100</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>集群信息结果排序规则，1 按时间降序，2 按照时间升序，3  按照状态排序</p>
    */
    @SerializedName("OrderType")
    @Expose
    private Long OrderType;

    /**
    * <p>过滤规则</p><ul><li>Name<br>  按照集群的名字进行模糊查询。例如：测试<br>  类型： String<br>  必选： 否</li></ul>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * <p>工作空间 SerialId</p>
    */
    @SerializedName("WorkSpaceId")
    @Expose
    private String WorkSpaceId;

    /**
     * Get <p>按照一个或者多个集群 ID 查询，每次请求的集群上限为 100</p> 
     * @return ClusterIds <p>按照一个或者多个集群 ID 查询，每次请求的集群上限为 100</p>
     */
    public String [] getClusterIds() {
        return this.ClusterIds;
    }

    /**
     * Set <p>按照一个或者多个集群 ID 查询，每次请求的集群上限为 100</p>
     * @param ClusterIds <p>按照一个或者多个集群 ID 查询，每次请求的集群上限为 100</p>
     */
    public void setClusterIds(String [] ClusterIds) {
        this.ClusterIds = ClusterIds;
    }

    /**
     * Get <p>偏移量，默认 0</p> 
     * @return Offset <p>偏移量，默认 0</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>偏移量，默认 0</p>
     * @param Offset <p>偏移量，默认 0</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>请求的集群数量，默认 20，最大值 100</p> 
     * @return Limit <p>请求的集群数量，默认 20，最大值 100</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>请求的集群数量，默认 20，最大值 100</p>
     * @param Limit <p>请求的集群数量，默认 20，最大值 100</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>集群信息结果排序规则，1 按时间降序，2 按照时间升序，3  按照状态排序</p> 
     * @return OrderType <p>集群信息结果排序规则，1 按时间降序，2 按照时间升序，3  按照状态排序</p>
     */
    public Long getOrderType() {
        return this.OrderType;
    }

    /**
     * Set <p>集群信息结果排序规则，1 按时间降序，2 按照时间升序，3  按照状态排序</p>
     * @param OrderType <p>集群信息结果排序规则，1 按时间降序，2 按照时间升序，3  按照状态排序</p>
     */
    public void setOrderType(Long OrderType) {
        this.OrderType = OrderType;
    }

    /**
     * Get <p>过滤规则</p><ul><li>Name<br>  按照集群的名字进行模糊查询。例如：测试<br>  类型： String<br>  必选： 否</li></ul> 
     * @return Filters <p>过滤规则</p><ul><li>Name<br>  按照集群的名字进行模糊查询。例如：测试<br>  类型： String<br>  必选： 否</li></ul>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>过滤规则</p><ul><li>Name<br>  按照集群的名字进行模糊查询。例如：测试<br>  类型： String<br>  必选： 否</li></ul>
     * @param Filters <p>过滤规则</p><ul><li>Name<br>  按照集群的名字进行模糊查询。例如：测试<br>  类型： String<br>  必选： 否</li></ul>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>工作空间 SerialId</p> 
     * @return WorkSpaceId <p>工作空间 SerialId</p>
     */
    public String getWorkSpaceId() {
        return this.WorkSpaceId;
    }

    /**
     * Set <p>工作空间 SerialId</p>
     * @param WorkSpaceId <p>工作空间 SerialId</p>
     */
    public void setWorkSpaceId(String WorkSpaceId) {
        this.WorkSpaceId = WorkSpaceId;
    }

    public DescribeClustersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeClustersRequest(DescribeClustersRequest source) {
        if (source.ClusterIds != null) {
            this.ClusterIds = new String[source.ClusterIds.length];
            for (int i = 0; i < source.ClusterIds.length; i++) {
                this.ClusterIds[i] = new String(source.ClusterIds[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.OrderType != null) {
            this.OrderType = new Long(source.OrderType);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.WorkSpaceId != null) {
            this.WorkSpaceId = new String(source.WorkSpaceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ClusterIds.", this.ClusterIds);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "OrderType", this.OrderType);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "WorkSpaceId", this.WorkSpaceId);

    }
}

