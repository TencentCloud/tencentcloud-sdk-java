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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePrometheusTargetsTMPRequest extends AbstractModel {

    /**
    * 实例id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 集成容器服务填绑定的集群id；
集成中心填 non-cluster
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 集群类型(可不填)
    */
    @SerializedName("ClusterType")
    @Expose
    private String ClusterType;

    /**
    * 过滤条件，支持Name=ServiceMonitor/PodMonitor/Probe/RawJob/Job, Value为采集配置名称；Name=Health, Value=up, down, unknown；Name=EndPoint, Value为EndPoint地址
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * targets分页偏移量，默认为0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * targets返回数量，默认为20，最大值200
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 实例id 
     * @return InstanceId 实例id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例id
     * @param InstanceId 实例id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 集成容器服务填绑定的集群id；
集成中心填 non-cluster 
     * @return ClusterId 集成容器服务填绑定的集群id；
集成中心填 non-cluster
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集成容器服务填绑定的集群id；
集成中心填 non-cluster
     * @param ClusterId 集成容器服务填绑定的集群id；
集成中心填 non-cluster
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 集群类型(可不填) 
     * @return ClusterType 集群类型(可不填)
     */
    public String getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set 集群类型(可不填)
     * @param ClusterType 集群类型(可不填)
     */
    public void setClusterType(String ClusterType) {
        this.ClusterType = ClusterType;
    }

    /**
     * Get 过滤条件，支持Name=ServiceMonitor/PodMonitor/Probe/RawJob/Job, Value为采集配置名称；Name=Health, Value=up, down, unknown；Name=EndPoint, Value为EndPoint地址 
     * @return Filters 过滤条件，支持Name=ServiceMonitor/PodMonitor/Probe/RawJob/Job, Value为采集配置名称；Name=Health, Value=up, down, unknown；Name=EndPoint, Value为EndPoint地址
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件，支持Name=ServiceMonitor/PodMonitor/Probe/RawJob/Job, Value为采集配置名称；Name=Health, Value=up, down, unknown；Name=EndPoint, Value为EndPoint地址
     * @param Filters 过滤条件，支持Name=ServiceMonitor/PodMonitor/Probe/RawJob/Job, Value为采集配置名称；Name=Health, Value=up, down, unknown；Name=EndPoint, Value为EndPoint地址
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get targets分页偏移量，默认为0 
     * @return Offset targets分页偏移量，默认为0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set targets分页偏移量，默认为0
     * @param Offset targets分页偏移量，默认为0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get targets返回数量，默认为20，最大值200 
     * @return Limit targets返回数量，默认为20，最大值200
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set targets返回数量，默认为20，最大值200
     * @param Limit targets返回数量，默认为20，最大值200
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribePrometheusTargetsTMPRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePrometheusTargetsTMPRequest(DescribePrometheusTargetsTMPRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ClusterType != null) {
            this.ClusterType = new String(source.ClusterType);
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
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

