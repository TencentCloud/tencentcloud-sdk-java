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

public class DBCustomClusterNodeResource extends AbstractModel {

    /**
    * <p>节点ID</p>
    */
    @SerializedName("NodeId")
    @Expose
    private String NodeId;

    /**
    * <p>节点物理资源总容量</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Capacity")
    @Expose
    private MetaResource Capacity;

    /**
    * <p>节点可分配容量= Capacity - 系统预留</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Allocatable")
    @Expose
    private MetaResource Allocatable;

    /**
    * <p>节点上所有非终态 Pod 的 requests 申请量之和（含系统 Pod）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Requests")
    @Expose
    private MetaResource Requests;

    /**
    * <p>节点上所有非终态 Pod 的 limits 上限之和（含系统 Pod）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Limits")
    @Expose
    private MetaResource Limits;

    /**
    * <p>节点可再调度余量 = max(0, Allocatable - Requests)</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Available")
    @Expose
    private MetaResource Available;

    /**
     * Get <p>节点ID</p> 
     * @return NodeId <p>节点ID</p>
     */
    public String getNodeId() {
        return this.NodeId;
    }

    /**
     * Set <p>节点ID</p>
     * @param NodeId <p>节点ID</p>
     */
    public void setNodeId(String NodeId) {
        this.NodeId = NodeId;
    }

    /**
     * Get <p>节点物理资源总容量</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Capacity <p>节点物理资源总容量</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MetaResource getCapacity() {
        return this.Capacity;
    }

    /**
     * Set <p>节点物理资源总容量</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Capacity <p>节点物理资源总容量</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCapacity(MetaResource Capacity) {
        this.Capacity = Capacity;
    }

    /**
     * Get <p>节点可分配容量= Capacity - 系统预留</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Allocatable <p>节点可分配容量= Capacity - 系统预留</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MetaResource getAllocatable() {
        return this.Allocatable;
    }

    /**
     * Set <p>节点可分配容量= Capacity - 系统预留</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Allocatable <p>节点可分配容量= Capacity - 系统预留</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAllocatable(MetaResource Allocatable) {
        this.Allocatable = Allocatable;
    }

    /**
     * Get <p>节点上所有非终态 Pod 的 requests 申请量之和（含系统 Pod）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Requests <p>节点上所有非终态 Pod 的 requests 申请量之和（含系统 Pod）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MetaResource getRequests() {
        return this.Requests;
    }

    /**
     * Set <p>节点上所有非终态 Pod 的 requests 申请量之和（含系统 Pod）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Requests <p>节点上所有非终态 Pod 的 requests 申请量之和（含系统 Pod）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRequests(MetaResource Requests) {
        this.Requests = Requests;
    }

    /**
     * Get <p>节点上所有非终态 Pod 的 limits 上限之和（含系统 Pod）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Limits <p>节点上所有非终态 Pod 的 limits 上限之和（含系统 Pod）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MetaResource getLimits() {
        return this.Limits;
    }

    /**
     * Set <p>节点上所有非终态 Pod 的 limits 上限之和（含系统 Pod）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Limits <p>节点上所有非终态 Pod 的 limits 上限之和（含系统 Pod）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLimits(MetaResource Limits) {
        this.Limits = Limits;
    }

    /**
     * Get <p>节点可再调度余量 = max(0, Allocatable - Requests)</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Available <p>节点可再调度余量 = max(0, Allocatable - Requests)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MetaResource getAvailable() {
        return this.Available;
    }

    /**
     * Set <p>节点可再调度余量 = max(0, Allocatable - Requests)</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Available <p>节点可再调度余量 = max(0, Allocatable - Requests)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAvailable(MetaResource Available) {
        this.Available = Available;
    }

    public DBCustomClusterNodeResource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DBCustomClusterNodeResource(DBCustomClusterNodeResource source) {
        if (source.NodeId != null) {
            this.NodeId = new String(source.NodeId);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NodeId", this.NodeId);
        this.setParamObj(map, prefix + "Capacity.", this.Capacity);
        this.setParamObj(map, prefix + "Allocatable.", this.Allocatable);
        this.setParamObj(map, prefix + "Requests.", this.Requests);
        this.setParamObj(map, prefix + "Limits.", this.Limits);
        this.setParamObj(map, prefix + "Available.", this.Available);

    }
}

