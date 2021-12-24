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
package com.tencentcloudapi.iecp.v20210914.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EdgeNodePodInfo extends AbstractModel{

    /**
    * Pod名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Pod状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 所在节点IP
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NodeIp")
    @Expose
    private String NodeIp;

    /**
    * 实例IP
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * CPU Request
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CpuRequest")
    @Expose
    private String CpuRequest;

    /**
    * Memory Request
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MemoryRequest")
    @Expose
    private String MemoryRequest;

    /**
    * 命名空间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * 工作负载类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkloadType")
    @Expose
    private String WorkloadType;

    /**
    * 工作负载名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkloadName")
    @Expose
    private String WorkloadName;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 重启次数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RestartCount")
    @Expose
    private Long RestartCount;

    /**
    * 集群ID
    */
    @SerializedName("ClusterID")
    @Expose
    private String ClusterID;

    /**
     * Get Pod名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name Pod名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Pod名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name Pod名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Pod状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status Pod状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Pod状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status Pod状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 所在节点IP
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NodeIp 所在节点IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNodeIp() {
        return this.NodeIp;
    }

    /**
     * Set 所在节点IP
注意：此字段可能返回 null，表示取不到有效值。
     * @param NodeIp 所在节点IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNodeIp(String NodeIp) {
        this.NodeIp = NodeIp;
    }

    /**
     * Get 实例IP
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Ip 实例IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set 实例IP
注意：此字段可能返回 null，表示取不到有效值。
     * @param Ip 实例IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get CPU Request
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CpuRequest CPU Request
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCpuRequest() {
        return this.CpuRequest;
    }

    /**
     * Set CPU Request
注意：此字段可能返回 null，表示取不到有效值。
     * @param CpuRequest CPU Request
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCpuRequest(String CpuRequest) {
        this.CpuRequest = CpuRequest;
    }

    /**
     * Get Memory Request
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MemoryRequest Memory Request
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMemoryRequest() {
        return this.MemoryRequest;
    }

    /**
     * Set Memory Request
注意：此字段可能返回 null，表示取不到有效值。
     * @param MemoryRequest Memory Request
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMemoryRequest(String MemoryRequest) {
        this.MemoryRequest = MemoryRequest;
    }

    /**
     * Get 命名空间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Namespace 命名空间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 命名空间
注意：此字段可能返回 null，表示取不到有效值。
     * @param Namespace 命名空间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get 工作负载类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkloadType 工作负载类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkloadType() {
        return this.WorkloadType;
    }

    /**
     * Set 工作负载类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkloadType 工作负载类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkloadType(String WorkloadType) {
        this.WorkloadType = WorkloadType;
    }

    /**
     * Get 工作负载名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkloadName 工作负载名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkloadName() {
        return this.WorkloadName;
    }

    /**
     * Set 工作负载名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkloadName 工作负载名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkloadName(String WorkloadName) {
        this.WorkloadName = WorkloadName;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 重启次数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RestartCount 重启次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRestartCount() {
        return this.RestartCount;
    }

    /**
     * Set 重启次数
注意：此字段可能返回 null，表示取不到有效值。
     * @param RestartCount 重启次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRestartCount(Long RestartCount) {
        this.RestartCount = RestartCount;
    }

    /**
     * Get 集群ID 
     * @return ClusterID 集群ID
     */
    public String getClusterID() {
        return this.ClusterID;
    }

    /**
     * Set 集群ID
     * @param ClusterID 集群ID
     */
    public void setClusterID(String ClusterID) {
        this.ClusterID = ClusterID;
    }

    public EdgeNodePodInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EdgeNodePodInfo(EdgeNodePodInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.NodeIp != null) {
            this.NodeIp = new String(source.NodeIp);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.CpuRequest != null) {
            this.CpuRequest = new String(source.CpuRequest);
        }
        if (source.MemoryRequest != null) {
            this.MemoryRequest = new String(source.MemoryRequest);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.WorkloadType != null) {
            this.WorkloadType = new String(source.WorkloadType);
        }
        if (source.WorkloadName != null) {
            this.WorkloadName = new String(source.WorkloadName);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.RestartCount != null) {
            this.RestartCount = new Long(source.RestartCount);
        }
        if (source.ClusterID != null) {
            this.ClusterID = new String(source.ClusterID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "NodeIp", this.NodeIp);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "CpuRequest", this.CpuRequest);
        this.setParamSimple(map, prefix + "MemoryRequest", this.MemoryRequest);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "WorkloadType", this.WorkloadType);
        this.setParamSimple(map, prefix + "WorkloadName", this.WorkloadName);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "RestartCount", this.RestartCount);
        this.setParamSimple(map, prefix + "ClusterID", this.ClusterID);

    }
}

