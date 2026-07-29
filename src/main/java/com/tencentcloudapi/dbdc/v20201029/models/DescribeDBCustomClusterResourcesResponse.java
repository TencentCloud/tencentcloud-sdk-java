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
package com.tencentcloudapi.dbdc.v20201029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBCustomClusterResourcesResponse extends AbstractModel {

    /**
    * <p>参与汇总的工作节点总数（不含控制面节点）</p><p>单位：台</p>
    */
    @SerializedName("NodeCount")
    @Expose
    private Long NodeCount;

    /**
    * <p>集群所有节点的资源物理总容量之和</p>
    */
    @SerializedName("Capacity")
    @Expose
    private MetaResource Capacity;

    /**
    * <p>集群所有节点的可分配容量之和（= Capacity - 系统预留）</p>
    */
    @SerializedName("Allocatable")
    @Expose
    private MetaResource Allocatable;

    /**
    * <p>集群所有非终态 Pod 的 requests 申请量之和（含系统 Pod）</p>
    */
    @SerializedName("Requests")
    @Expose
    private MetaResource Requests;

    /**
    * <p>集群所有非终态 Pod 的 limits 上限之和（含系统 Pod，Pods 字段无语义，固定为 0）</p>
    */
    @SerializedName("Limits")
    @Expose
    private MetaResource Limits;

    /**
    * <p>集群可再调度余量（所有节点 max(0, Allocatable - Requests) 累加求和）</p>
    */
    @SerializedName("Available")
    @Expose
    private MetaResource Available;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>参与汇总的工作节点总数（不含控制面节点）</p><p>单位：台</p> 
     * @return NodeCount <p>参与汇总的工作节点总数（不含控制面节点）</p><p>单位：台</p>
     */
    public Long getNodeCount() {
        return this.NodeCount;
    }

    /**
     * Set <p>参与汇总的工作节点总数（不含控制面节点）</p><p>单位：台</p>
     * @param NodeCount <p>参与汇总的工作节点总数（不含控制面节点）</p><p>单位：台</p>
     */
    public void setNodeCount(Long NodeCount) {
        this.NodeCount = NodeCount;
    }

    /**
     * Get <p>集群所有节点的资源物理总容量之和</p> 
     * @return Capacity <p>集群所有节点的资源物理总容量之和</p>
     */
    public MetaResource getCapacity() {
        return this.Capacity;
    }

    /**
     * Set <p>集群所有节点的资源物理总容量之和</p>
     * @param Capacity <p>集群所有节点的资源物理总容量之和</p>
     */
    public void setCapacity(MetaResource Capacity) {
        this.Capacity = Capacity;
    }

    /**
     * Get <p>集群所有节点的可分配容量之和（= Capacity - 系统预留）</p> 
     * @return Allocatable <p>集群所有节点的可分配容量之和（= Capacity - 系统预留）</p>
     */
    public MetaResource getAllocatable() {
        return this.Allocatable;
    }

    /**
     * Set <p>集群所有节点的可分配容量之和（= Capacity - 系统预留）</p>
     * @param Allocatable <p>集群所有节点的可分配容量之和（= Capacity - 系统预留）</p>
     */
    public void setAllocatable(MetaResource Allocatable) {
        this.Allocatable = Allocatable;
    }

    /**
     * Get <p>集群所有非终态 Pod 的 requests 申请量之和（含系统 Pod）</p> 
     * @return Requests <p>集群所有非终态 Pod 的 requests 申请量之和（含系统 Pod）</p>
     */
    public MetaResource getRequests() {
        return this.Requests;
    }

    /**
     * Set <p>集群所有非终态 Pod 的 requests 申请量之和（含系统 Pod）</p>
     * @param Requests <p>集群所有非终态 Pod 的 requests 申请量之和（含系统 Pod）</p>
     */
    public void setRequests(MetaResource Requests) {
        this.Requests = Requests;
    }

    /**
     * Get <p>集群所有非终态 Pod 的 limits 上限之和（含系统 Pod，Pods 字段无语义，固定为 0）</p> 
     * @return Limits <p>集群所有非终态 Pod 的 limits 上限之和（含系统 Pod，Pods 字段无语义，固定为 0）</p>
     */
    public MetaResource getLimits() {
        return this.Limits;
    }

    /**
     * Set <p>集群所有非终态 Pod 的 limits 上限之和（含系统 Pod，Pods 字段无语义，固定为 0）</p>
     * @param Limits <p>集群所有非终态 Pod 的 limits 上限之和（含系统 Pod，Pods 字段无语义，固定为 0）</p>
     */
    public void setLimits(MetaResource Limits) {
        this.Limits = Limits;
    }

    /**
     * Get <p>集群可再调度余量（所有节点 max(0, Allocatable - Requests) 累加求和）</p> 
     * @return Available <p>集群可再调度余量（所有节点 max(0, Allocatable - Requests) 累加求和）</p>
     */
    public MetaResource getAvailable() {
        return this.Available;
    }

    /**
     * Set <p>集群可再调度余量（所有节点 max(0, Allocatable - Requests) 累加求和）</p>
     * @param Available <p>集群可再调度余量（所有节点 max(0, Allocatable - Requests) 累加求和）</p>
     */
    public void setAvailable(MetaResource Available) {
        this.Available = Available;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeDBCustomClusterResourcesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDBCustomClusterResourcesResponse(DescribeDBCustomClusterResourcesResponse source) {
        if (source.NodeCount != null) {
            this.NodeCount = new Long(source.NodeCount);
        }
        if (source.Capacity != null) {
            this.Capacity = new MetaResource(source.Capacity);
        }
        if (source.Allocatable != null) {
            this.Allocatable = new MetaResource(source.Allocatable);
        }
        if (source.Requests != null) {
            this.Requests = new MetaResource(source.Requests);
        }
        if (source.Limits != null) {
            this.Limits = new MetaResource(source.Limits);
        }
        if (source.Available != null) {
            this.Available = new MetaResource(source.Available);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NodeCount", this.NodeCount);
        this.setParamObj(map, prefix + "Capacity.", this.Capacity);
        this.setParamObj(map, prefix + "Allocatable.", this.Allocatable);
        this.setParamObj(map, prefix + "Requests.", this.Requests);
        this.setParamObj(map, prefix + "Limits.", this.Limits);
        this.setParamObj(map, prefix + "Available.", this.Available);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

