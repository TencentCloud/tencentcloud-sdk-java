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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClusterPodInfo extends AbstractModel {

    /**
    * Pod名称.
    */
    @SerializedName("PodName")
    @Expose
    private String PodName;

    /**
    * Pod状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Pod IP
    */
    @SerializedName("PodIP")
    @Expose
    private String PodIP;

    /**
    * 节点内网Ip
    */
    @SerializedName("NodeLanIP")
    @Expose
    private String NodeLanIP;

    /**
    * 所属的工作负载名字
    */
    @SerializedName("WorkloadName")
    @Expose
    private String WorkloadName;

    /**
    * 所属工作负载类型
    */
    @SerializedName("WorkloadKind")
    @Expose
    private String WorkloadKind;

    /**
    * 所属集群名字
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * 所属集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 所属命名空间
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * 所属地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 运行时间
    */
    @SerializedName("Age")
    @Expose
    private String Age;

    /**
    * 创建时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 重启次数
    */
    @SerializedName("Restarts")
    @Expose
    private Long Restarts;

    /**
    * 关联的service名字
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * 关联的service数量
    */
    @SerializedName("ServiceCount")
    @Expose
    private Long ServiceCount;

    /**
    * 关联的容器名字
    */
    @SerializedName("ContainerName")
    @Expose
    private String ContainerName;

    /**
    * 关联的容器数量
    */
    @SerializedName("ContainerCount")
    @Expose
    private Long ContainerCount;

    /**
    * CPU占用率
    */
    @SerializedName("CPU")
    @Expose
    private Long CPU;

    /**
    * 内存占用量
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * Pod标签
    */
    @SerializedName("Labels")
    @Expose
    private String Labels;

    /**
    * 集群状态
    */
    @SerializedName("ClusterStatus")
    @Expose
    private String ClusterStatus;

    /**
    * 工作负载标签
    */
    @SerializedName("WorkloadLabels")
    @Expose
    private String WorkloadLabels;

    /**
    * 容器Id
    */
    @SerializedName("ContainerId")
    @Expose
    private String ContainerId;

    /**
    * 主机名称
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * 主机Id
    */
    @SerializedName("HostId")
    @Expose
    private String HostId;

    /**
    * 集群类型
    */
    @SerializedName("ClusterType")
    @Expose
    private String ClusterType;

    /**
    * abc
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
    * NORMAL：普通节点 SUPER：超级节点
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
    * 计费核数
    */
    @SerializedName("ChargeCoresCnt")
    @Expose
    private Long ChargeCoresCnt;

    /**
     * Get Pod名称. 
     * @return PodName Pod名称.
     */
    public String getPodName() {
        return this.PodName;
    }

    /**
     * Set Pod名称.
     * @param PodName Pod名称.
     */
    public void setPodName(String PodName) {
        this.PodName = PodName;
    }

    /**
     * Get Pod状态 
     * @return Status Pod状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Pod状态
     * @param Status Pod状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Pod IP 
     * @return PodIP Pod IP
     */
    public String getPodIP() {
        return this.PodIP;
    }

    /**
     * Set Pod IP
     * @param PodIP Pod IP
     */
    public void setPodIP(String PodIP) {
        this.PodIP = PodIP;
    }

    /**
     * Get 节点内网Ip 
     * @return NodeLanIP 节点内网Ip
     */
    public String getNodeLanIP() {
        return this.NodeLanIP;
    }

    /**
     * Set 节点内网Ip
     * @param NodeLanIP 节点内网Ip
     */
    public void setNodeLanIP(String NodeLanIP) {
        this.NodeLanIP = NodeLanIP;
    }

    /**
     * Get 所属的工作负载名字 
     * @return WorkloadName 所属的工作负载名字
     */
    public String getWorkloadName() {
        return this.WorkloadName;
    }

    /**
     * Set 所属的工作负载名字
     * @param WorkloadName 所属的工作负载名字
     */
    public void setWorkloadName(String WorkloadName) {
        this.WorkloadName = WorkloadName;
    }

    /**
     * Get 所属工作负载类型 
     * @return WorkloadKind 所属工作负载类型
     */
    public String getWorkloadKind() {
        return this.WorkloadKind;
    }

    /**
     * Set 所属工作负载类型
     * @param WorkloadKind 所属工作负载类型
     */
    public void setWorkloadKind(String WorkloadKind) {
        this.WorkloadKind = WorkloadKind;
    }

    /**
     * Get 所属集群名字 
     * @return ClusterName 所属集群名字
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set 所属集群名字
     * @param ClusterName 所属集群名字
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get 所属集群ID 
     * @return ClusterId 所属集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 所属集群ID
     * @param ClusterId 所属集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 所属命名空间 
     * @return Namespace 所属命名空间
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 所属命名空间
     * @param Namespace 所属命名空间
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get 所属地域 
     * @return Region 所属地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 所属地域
     * @param Region 所属地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 运行时间 
     * @return Age 运行时间
     */
    public String getAge() {
        return this.Age;
    }

    /**
     * Set 运行时间
     * @param Age 运行时间
     */
    public void setAge(String Age) {
        this.Age = Age;
    }

    /**
     * Get 创建时间 
     * @return StartTime 创建时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 创建时间
     * @param StartTime 创建时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 重启次数 
     * @return Restarts 重启次数
     */
    public Long getRestarts() {
        return this.Restarts;
    }

    /**
     * Set 重启次数
     * @param Restarts 重启次数
     */
    public void setRestarts(Long Restarts) {
        this.Restarts = Restarts;
    }

    /**
     * Get 关联的service名字 
     * @return ServiceName 关联的service名字
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set 关联的service名字
     * @param ServiceName 关联的service名字
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get 关联的service数量 
     * @return ServiceCount 关联的service数量
     */
    public Long getServiceCount() {
        return this.ServiceCount;
    }

    /**
     * Set 关联的service数量
     * @param ServiceCount 关联的service数量
     */
    public void setServiceCount(Long ServiceCount) {
        this.ServiceCount = ServiceCount;
    }

    /**
     * Get 关联的容器名字 
     * @return ContainerName 关联的容器名字
     */
    public String getContainerName() {
        return this.ContainerName;
    }

    /**
     * Set 关联的容器名字
     * @param ContainerName 关联的容器名字
     */
    public void setContainerName(String ContainerName) {
        this.ContainerName = ContainerName;
    }

    /**
     * Get 关联的容器数量 
     * @return ContainerCount 关联的容器数量
     */
    public Long getContainerCount() {
        return this.ContainerCount;
    }

    /**
     * Set 关联的容器数量
     * @param ContainerCount 关联的容器数量
     */
    public void setContainerCount(Long ContainerCount) {
        this.ContainerCount = ContainerCount;
    }

    /**
     * Get CPU占用率 
     * @return CPU CPU占用率
     */
    public Long getCPU() {
        return this.CPU;
    }

    /**
     * Set CPU占用率
     * @param CPU CPU占用率
     */
    public void setCPU(Long CPU) {
        this.CPU = CPU;
    }

    /**
     * Get 内存占用量 
     * @return Memory 内存占用量
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set 内存占用量
     * @param Memory 内存占用量
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get Pod标签 
     * @return Labels Pod标签
     */
    public String getLabels() {
        return this.Labels;
    }

    /**
     * Set Pod标签
     * @param Labels Pod标签
     */
    public void setLabels(String Labels) {
        this.Labels = Labels;
    }

    /**
     * Get 集群状态 
     * @return ClusterStatus 集群状态
     */
    public String getClusterStatus() {
        return this.ClusterStatus;
    }

    /**
     * Set 集群状态
     * @param ClusterStatus 集群状态
     */
    public void setClusterStatus(String ClusterStatus) {
        this.ClusterStatus = ClusterStatus;
    }

    /**
     * Get 工作负载标签 
     * @return WorkloadLabels 工作负载标签
     */
    public String getWorkloadLabels() {
        return this.WorkloadLabels;
    }

    /**
     * Set 工作负载标签
     * @param WorkloadLabels 工作负载标签
     */
    public void setWorkloadLabels(String WorkloadLabels) {
        this.WorkloadLabels = WorkloadLabels;
    }

    /**
     * Get 容器Id 
     * @return ContainerId 容器Id
     */
    public String getContainerId() {
        return this.ContainerId;
    }

    /**
     * Set 容器Id
     * @param ContainerId 容器Id
     */
    public void setContainerId(String ContainerId) {
        this.ContainerId = ContainerId;
    }

    /**
     * Get 主机名称 
     * @return HostName 主机名称
     */
    public String getHostName() {
        return this.HostName;
    }

    /**
     * Set 主机名称
     * @param HostName 主机名称
     */
    public void setHostName(String HostName) {
        this.HostName = HostName;
    }

    /**
     * Get 主机Id 
     * @return HostId 主机Id
     */
    public String getHostId() {
        return this.HostId;
    }

    /**
     * Set 主机Id
     * @param HostId 主机Id
     */
    public void setHostId(String HostId) {
        this.HostId = HostId;
    }

    /**
     * Get 集群类型 
     * @return ClusterType 集群类型
     */
    public String getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set 集群类型
     * @param ClusterType 集群类型
     */
    public void setClusterType(String ClusterType) {
        this.ClusterType = ClusterType;
    }

    /**
     * Get abc 
     * @return NodeName abc
     */
    public String getNodeName() {
        return this.NodeName;
    }

    /**
     * Set abc
     * @param NodeName abc
     */
    public void setNodeName(String NodeName) {
        this.NodeName = NodeName;
    }

    /**
     * Get NORMAL：普通节点 SUPER：超级节点 
     * @return NodeType NORMAL：普通节点 SUPER：超级节点
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set NORMAL：普通节点 SUPER：超级节点
     * @param NodeType NORMAL：普通节点 SUPER：超级节点
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get 计费核数 
     * @return ChargeCoresCnt 计费核数
     */
    public Long getChargeCoresCnt() {
        return this.ChargeCoresCnt;
    }

    /**
     * Set 计费核数
     * @param ChargeCoresCnt 计费核数
     */
    public void setChargeCoresCnt(Long ChargeCoresCnt) {
        this.ChargeCoresCnt = ChargeCoresCnt;
    }

    public ClusterPodInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClusterPodInfo(ClusterPodInfo source) {
        if (source.PodName != null) {
            this.PodName = new String(source.PodName);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.PodIP != null) {
            this.PodIP = new String(source.PodIP);
        }
        if (source.NodeLanIP != null) {
            this.NodeLanIP = new String(source.NodeLanIP);
        }
        if (source.WorkloadName != null) {
            this.WorkloadName = new String(source.WorkloadName);
        }
        if (source.WorkloadKind != null) {
            this.WorkloadKind = new String(source.WorkloadKind);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Age != null) {
            this.Age = new String(source.Age);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.Restarts != null) {
            this.Restarts = new Long(source.Restarts);
        }
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
        if (source.ServiceCount != null) {
            this.ServiceCount = new Long(source.ServiceCount);
        }
        if (source.ContainerName != null) {
            this.ContainerName = new String(source.ContainerName);
        }
        if (source.ContainerCount != null) {
            this.ContainerCount = new Long(source.ContainerCount);
        }
        if (source.CPU != null) {
            this.CPU = new Long(source.CPU);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.Labels != null) {
            this.Labels = new String(source.Labels);
        }
        if (source.ClusterStatus != null) {
            this.ClusterStatus = new String(source.ClusterStatus);
        }
        if (source.WorkloadLabels != null) {
            this.WorkloadLabels = new String(source.WorkloadLabels);
        }
        if (source.ContainerId != null) {
            this.ContainerId = new String(source.ContainerId);
        }
        if (source.HostName != null) {
            this.HostName = new String(source.HostName);
        }
        if (source.HostId != null) {
            this.HostId = new String(source.HostId);
        }
        if (source.ClusterType != null) {
            this.ClusterType = new String(source.ClusterType);
        }
        if (source.NodeName != null) {
            this.NodeName = new String(source.NodeName);
        }
        if (source.NodeType != null) {
            this.NodeType = new String(source.NodeType);
        }
        if (source.ChargeCoresCnt != null) {
            this.ChargeCoresCnt = new Long(source.ChargeCoresCnt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PodName", this.PodName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "PodIP", this.PodIP);
        this.setParamSimple(map, prefix + "NodeLanIP", this.NodeLanIP);
        this.setParamSimple(map, prefix + "WorkloadName", this.WorkloadName);
        this.setParamSimple(map, prefix + "WorkloadKind", this.WorkloadKind);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Age", this.Age);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "Restarts", this.Restarts);
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamSimple(map, prefix + "ServiceCount", this.ServiceCount);
        this.setParamSimple(map, prefix + "ContainerName", this.ContainerName);
        this.setParamSimple(map, prefix + "ContainerCount", this.ContainerCount);
        this.setParamSimple(map, prefix + "CPU", this.CPU);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Labels", this.Labels);
        this.setParamSimple(map, prefix + "ClusterStatus", this.ClusterStatus);
        this.setParamSimple(map, prefix + "WorkloadLabels", this.WorkloadLabels);
        this.setParamSimple(map, prefix + "ContainerId", this.ContainerId);
        this.setParamSimple(map, prefix + "HostName", this.HostName);
        this.setParamSimple(map, prefix + "HostId", this.HostId);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);
        this.setParamSimple(map, prefix + "NodeName", this.NodeName);
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamSimple(map, prefix + "ChargeCoresCnt", this.ChargeCoresCnt);

    }
}

