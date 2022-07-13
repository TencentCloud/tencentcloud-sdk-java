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
package com.tencentcloudapi.oceanus.v20190422.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeClustersRequest extends AbstractModel{

    /**
    * 按照一个或者多个集群 ID 查询，每次请求的集群上限为 100
    */
    @SerializedName("ClusterIds")
    @Expose
    private String [] ClusterIds;

    /**
    * 偏移量，默认 0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 请求的集群数量，默认 20，最大值 100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 集群信息结果排序规则，1 按时间降序，2 按照时间升序，3  按照状态排序
    */
    @SerializedName("OrderType")
    @Expose
    private Long OrderType;

    /**
    * 过滤规则
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 工作空间 SerialId
    */
    @SerializedName("WorkSpaceId")
    @Expose
    private String WorkSpaceId;

    /**
     * Get 按照一个或者多个集群 ID 查询，每次请求的集群上限为 100 
     * @return ClusterIds 按照一个或者多个集群 ID 查询，每次请求的集群上限为 100
     */
    public String [] getClusterIds() {
        return this.ClusterIds;
    }

    /**
     * Set 按照一个或者多个集群 ID 查询，每次请求的集群上限为 100
     * @param ClusterIds 按照一个或者多个集群 ID 查询，每次请求的集群上限为 100
     */
    public void setClusterIds(String [] ClusterIds) {
        this.ClusterIds = ClusterIds;
    }

    /**
     * Get 偏移量，默认 0 
     * @return Offset 偏移量，默认 0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认 0
     * @param Offset 偏移量，默认 0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 请求的集群数量，默认 20，最大值 100 
     * @return Limit 请求的集群数量，默认 20，最大值 100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 请求的集群数量，默认 20，最大值 100
     * @param Limit 请求的集群数量，默认 20，最大值 100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 集群信息结果排序规则，1 按时间降序，2 按照时间升序，3  按照状态排序 
     * @return OrderType 集群信息结果排序规则，1 按时间降序，2 按照时间升序，3  按照状态排序
     */
    public Long getOrderType() {
        return this.OrderType;
    }

    /**
     * Set 集群信息结果排序规则，1 按时间降序，2 按照时间升序，3  按照状态排序
     * @param OrderType 集群信息结果排序规则，1 按时间降序，2 按照时间升序，3  按照状态排序
     */
    public void setOrderType(Long OrderType) {
        this.OrderType = OrderType;
    }

    /**
     * Get 过滤规则 
     * @return Filters 过滤规则
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤规则
     * @param Filters 过滤规则
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 工作空间 SerialId 
     * @return WorkSpaceId 工作空间 SerialId
     */
    public String getWorkSpaceId() {
        return this.WorkSpaceId;
    }

    /**
     * Set 工作空间 SerialId
     * @param WorkSpaceId 工作空间 SerialId
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

