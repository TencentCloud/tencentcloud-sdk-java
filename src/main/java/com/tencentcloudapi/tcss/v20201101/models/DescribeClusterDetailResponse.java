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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeClusterDetailResponse extends AbstractModel{

    /**
    * 集群id
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 集群名字
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * 当前集群扫描任务的进度，100表示扫描完成.
    */
    @SerializedName("ScanTaskProgress")
    @Expose
    private Long ScanTaskProgress;

    /**
    * 集群版本
    */
    @SerializedName("ClusterVersion")
    @Expose
    private String ClusterVersion;

    /**
    * 运行时组件
    */
    @SerializedName("ContainerRuntime")
    @Expose
    private String ContainerRuntime;

    /**
    * 集群节点数
    */
    @SerializedName("ClusterNodeNum")
    @Expose
    private Long ClusterNodeNum;

    /**
    * 集群状态 (Running 运行中 Creating 创建中 Abnormal 异常 )
    */
    @SerializedName("ClusterStatus")
    @Expose
    private String ClusterStatus;

    /**
    * 集群类型：为托管集群MANAGED_CLUSTER、独立集群INDEPENDENT_CLUSTER
    */
    @SerializedName("ClusterType")
    @Expose
    private String ClusterType;

    /**
    * 集群区域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 严重风险检查项的数量
    */
    @SerializedName("SeriousRiskCount")
    @Expose
    private Long SeriousRiskCount;

    /**
    * 高风险检查项的数量
    */
    @SerializedName("HighRiskCount")
    @Expose
    private Long HighRiskCount;

    /**
    * 中风险检查项的数量
    */
    @SerializedName("MiddleRiskCount")
    @Expose
    private Long MiddleRiskCount;

    /**
    * 提示风险检查项的数量
    */
    @SerializedName("HintRiskCount")
    @Expose
    private Long HintRiskCount;

    /**
    * 检查任务的状态
    */
    @SerializedName("CheckStatus")
    @Expose
    private String CheckStatus;

    /**
    * 防御容器状态
    */
    @SerializedName("DefenderStatus")
    @Expose
    private String DefenderStatus;

    /**
    * 扫描任务创建时间
    */
    @SerializedName("TaskCreateTime")
    @Expose
    private String TaskCreateTime;

    /**
    * 网络类型.PublicNetwork为公网类型,VPCNetwork为VPC网络
    */
    @SerializedName("NetworkType")
    @Expose
    private String NetworkType;

    /**
    * API Server地址
    */
    @SerializedName("ApiServerAddress")
    @Expose
    private String ApiServerAddress;

    /**
    * 节点数
    */
    @SerializedName("NodeCount")
    @Expose
    private Long NodeCount;

    /**
    * 命名空间数
    */
    @SerializedName("NamespaceCount")
    @Expose
    private Long NamespaceCount;

    /**
    * 工作负载数
    */
    @SerializedName("WorkloadCount")
    @Expose
    private Long WorkloadCount;

    /**
    * Pod数量
    */
    @SerializedName("PodCount")
    @Expose
    private Long PodCount;

    /**
    * Service数量
    */
    @SerializedName("ServiceCount")
    @Expose
    private Long ServiceCount;

    /**
    * Ingress数量
    */
    @SerializedName("IngressCount")
    @Expose
    private Long IngressCount;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 集群id 
     * @return ClusterId 集群id
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群id
     * @param ClusterId 集群id
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 集群名字 
     * @return ClusterName 集群名字
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set 集群名字
     * @param ClusterName 集群名字
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get 当前集群扫描任务的进度，100表示扫描完成. 
     * @return ScanTaskProgress 当前集群扫描任务的进度，100表示扫描完成.
     */
    public Long getScanTaskProgress() {
        return this.ScanTaskProgress;
    }

    /**
     * Set 当前集群扫描任务的进度，100表示扫描完成.
     * @param ScanTaskProgress 当前集群扫描任务的进度，100表示扫描完成.
     */
    public void setScanTaskProgress(Long ScanTaskProgress) {
        this.ScanTaskProgress = ScanTaskProgress;
    }

    /**
     * Get 集群版本 
     * @return ClusterVersion 集群版本
     */
    public String getClusterVersion() {
        return this.ClusterVersion;
    }

    /**
     * Set 集群版本
     * @param ClusterVersion 集群版本
     */
    public void setClusterVersion(String ClusterVersion) {
        this.ClusterVersion = ClusterVersion;
    }

    /**
     * Get 运行时组件 
     * @return ContainerRuntime 运行时组件
     */
    public String getContainerRuntime() {
        return this.ContainerRuntime;
    }

    /**
     * Set 运行时组件
     * @param ContainerRuntime 运行时组件
     */
    public void setContainerRuntime(String ContainerRuntime) {
        this.ContainerRuntime = ContainerRuntime;
    }

    /**
     * Get 集群节点数 
     * @return ClusterNodeNum 集群节点数
     */
    public Long getClusterNodeNum() {
        return this.ClusterNodeNum;
    }

    /**
     * Set 集群节点数
     * @param ClusterNodeNum 集群节点数
     */
    public void setClusterNodeNum(Long ClusterNodeNum) {
        this.ClusterNodeNum = ClusterNodeNum;
    }

    /**
     * Get 集群状态 (Running 运行中 Creating 创建中 Abnormal 异常 ) 
     * @return ClusterStatus 集群状态 (Running 运行中 Creating 创建中 Abnormal 异常 )
     */
    public String getClusterStatus() {
        return this.ClusterStatus;
    }

    /**
     * Set 集群状态 (Running 运行中 Creating 创建中 Abnormal 异常 )
     * @param ClusterStatus 集群状态 (Running 运行中 Creating 创建中 Abnormal 异常 )
     */
    public void setClusterStatus(String ClusterStatus) {
        this.ClusterStatus = ClusterStatus;
    }

    /**
     * Get 集群类型：为托管集群MANAGED_CLUSTER、独立集群INDEPENDENT_CLUSTER 
     * @return ClusterType 集群类型：为托管集群MANAGED_CLUSTER、独立集群INDEPENDENT_CLUSTER
     */
    public String getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set 集群类型：为托管集群MANAGED_CLUSTER、独立集群INDEPENDENT_CLUSTER
     * @param ClusterType 集群类型：为托管集群MANAGED_CLUSTER、独立集群INDEPENDENT_CLUSTER
     */
    public void setClusterType(String ClusterType) {
        this.ClusterType = ClusterType;
    }

    /**
     * Get 集群区域 
     * @return Region 集群区域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 集群区域
     * @param Region 集群区域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 严重风险检查项的数量 
     * @return SeriousRiskCount 严重风险检查项的数量
     */
    public Long getSeriousRiskCount() {
        return this.SeriousRiskCount;
    }

    /**
     * Set 严重风险检查项的数量
     * @param SeriousRiskCount 严重风险检查项的数量
     */
    public void setSeriousRiskCount(Long SeriousRiskCount) {
        this.SeriousRiskCount = SeriousRiskCount;
    }

    /**
     * Get 高风险检查项的数量 
     * @return HighRiskCount 高风险检查项的数量
     */
    public Long getHighRiskCount() {
        return this.HighRiskCount;
    }

    /**
     * Set 高风险检查项的数量
     * @param HighRiskCount 高风险检查项的数量
     */
    public void setHighRiskCount(Long HighRiskCount) {
        this.HighRiskCount = HighRiskCount;
    }

    /**
     * Get 中风险检查项的数量 
     * @return MiddleRiskCount 中风险检查项的数量
     */
    public Long getMiddleRiskCount() {
        return this.MiddleRiskCount;
    }

    /**
     * Set 中风险检查项的数量
     * @param MiddleRiskCount 中风险检查项的数量
     */
    public void setMiddleRiskCount(Long MiddleRiskCount) {
        this.MiddleRiskCount = MiddleRiskCount;
    }

    /**
     * Get 提示风险检查项的数量 
     * @return HintRiskCount 提示风险检查项的数量
     */
    public Long getHintRiskCount() {
        return this.HintRiskCount;
    }

    /**
     * Set 提示风险检查项的数量
     * @param HintRiskCount 提示风险检查项的数量
     */
    public void setHintRiskCount(Long HintRiskCount) {
        this.HintRiskCount = HintRiskCount;
    }

    /**
     * Get 检查任务的状态 
     * @return CheckStatus 检查任务的状态
     */
    public String getCheckStatus() {
        return this.CheckStatus;
    }

    /**
     * Set 检查任务的状态
     * @param CheckStatus 检查任务的状态
     */
    public void setCheckStatus(String CheckStatus) {
        this.CheckStatus = CheckStatus;
    }

    /**
     * Get 防御容器状态 
     * @return DefenderStatus 防御容器状态
     */
    public String getDefenderStatus() {
        return this.DefenderStatus;
    }

    /**
     * Set 防御容器状态
     * @param DefenderStatus 防御容器状态
     */
    public void setDefenderStatus(String DefenderStatus) {
        this.DefenderStatus = DefenderStatus;
    }

    /**
     * Get 扫描任务创建时间 
     * @return TaskCreateTime 扫描任务创建时间
     */
    public String getTaskCreateTime() {
        return this.TaskCreateTime;
    }

    /**
     * Set 扫描任务创建时间
     * @param TaskCreateTime 扫描任务创建时间
     */
    public void setTaskCreateTime(String TaskCreateTime) {
        this.TaskCreateTime = TaskCreateTime;
    }

    /**
     * Get 网络类型.PublicNetwork为公网类型,VPCNetwork为VPC网络 
     * @return NetworkType 网络类型.PublicNetwork为公网类型,VPCNetwork为VPC网络
     */
    public String getNetworkType() {
        return this.NetworkType;
    }

    /**
     * Set 网络类型.PublicNetwork为公网类型,VPCNetwork为VPC网络
     * @param NetworkType 网络类型.PublicNetwork为公网类型,VPCNetwork为VPC网络
     */
    public void setNetworkType(String NetworkType) {
        this.NetworkType = NetworkType;
    }

    /**
     * Get API Server地址 
     * @return ApiServerAddress API Server地址
     */
    public String getApiServerAddress() {
        return this.ApiServerAddress;
    }

    /**
     * Set API Server地址
     * @param ApiServerAddress API Server地址
     */
    public void setApiServerAddress(String ApiServerAddress) {
        this.ApiServerAddress = ApiServerAddress;
    }

    /**
     * Get 节点数 
     * @return NodeCount 节点数
     */
    public Long getNodeCount() {
        return this.NodeCount;
    }

    /**
     * Set 节点数
     * @param NodeCount 节点数
     */
    public void setNodeCount(Long NodeCount) {
        this.NodeCount = NodeCount;
    }

    /**
     * Get 命名空间数 
     * @return NamespaceCount 命名空间数
     */
    public Long getNamespaceCount() {
        return this.NamespaceCount;
    }

    /**
     * Set 命名空间数
     * @param NamespaceCount 命名空间数
     */
    public void setNamespaceCount(Long NamespaceCount) {
        this.NamespaceCount = NamespaceCount;
    }

    /**
     * Get 工作负载数 
     * @return WorkloadCount 工作负载数
     */
    public Long getWorkloadCount() {
        return this.WorkloadCount;
    }

    /**
     * Set 工作负载数
     * @param WorkloadCount 工作负载数
     */
    public void setWorkloadCount(Long WorkloadCount) {
        this.WorkloadCount = WorkloadCount;
    }

    /**
     * Get Pod数量 
     * @return PodCount Pod数量
     */
    public Long getPodCount() {
        return this.PodCount;
    }

    /**
     * Set Pod数量
     * @param PodCount Pod数量
     */
    public void setPodCount(Long PodCount) {
        this.PodCount = PodCount;
    }

    /**
     * Get Service数量 
     * @return ServiceCount Service数量
     */
    public Long getServiceCount() {
        return this.ServiceCount;
    }

    /**
     * Set Service数量
     * @param ServiceCount Service数量
     */
    public void setServiceCount(Long ServiceCount) {
        this.ServiceCount = ServiceCount;
    }

    /**
     * Get Ingress数量 
     * @return IngressCount Ingress数量
     */
    public Long getIngressCount() {
        return this.IngressCount;
    }

    /**
     * Set Ingress数量
     * @param IngressCount Ingress数量
     */
    public void setIngressCount(Long IngressCount) {
        this.IngressCount = IngressCount;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeClusterDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeClusterDetailResponse(DescribeClusterDetailResponse source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.ScanTaskProgress != null) {
            this.ScanTaskProgress = new Long(source.ScanTaskProgress);
        }
        if (source.ClusterVersion != null) {
            this.ClusterVersion = new String(source.ClusterVersion);
        }
        if (source.ContainerRuntime != null) {
            this.ContainerRuntime = new String(source.ContainerRuntime);
        }
        if (source.ClusterNodeNum != null) {
            this.ClusterNodeNum = new Long(source.ClusterNodeNum);
        }
        if (source.ClusterStatus != null) {
            this.ClusterStatus = new String(source.ClusterStatus);
        }
        if (source.ClusterType != null) {
            this.ClusterType = new String(source.ClusterType);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.SeriousRiskCount != null) {
            this.SeriousRiskCount = new Long(source.SeriousRiskCount);
        }
        if (source.HighRiskCount != null) {
            this.HighRiskCount = new Long(source.HighRiskCount);
        }
        if (source.MiddleRiskCount != null) {
            this.MiddleRiskCount = new Long(source.MiddleRiskCount);
        }
        if (source.HintRiskCount != null) {
            this.HintRiskCount = new Long(source.HintRiskCount);
        }
        if (source.CheckStatus != null) {
            this.CheckStatus = new String(source.CheckStatus);
        }
        if (source.DefenderStatus != null) {
            this.DefenderStatus = new String(source.DefenderStatus);
        }
        if (source.TaskCreateTime != null) {
            this.TaskCreateTime = new String(source.TaskCreateTime);
        }
        if (source.NetworkType != null) {
            this.NetworkType = new String(source.NetworkType);
        }
        if (source.ApiServerAddress != null) {
            this.ApiServerAddress = new String(source.ApiServerAddress);
        }
        if (source.NodeCount != null) {
            this.NodeCount = new Long(source.NodeCount);
        }
        if (source.NamespaceCount != null) {
            this.NamespaceCount = new Long(source.NamespaceCount);
        }
        if (source.WorkloadCount != null) {
            this.WorkloadCount = new Long(source.WorkloadCount);
        }
        if (source.PodCount != null) {
            this.PodCount = new Long(source.PodCount);
        }
        if (source.ServiceCount != null) {
            this.ServiceCount = new Long(source.ServiceCount);
        }
        if (source.IngressCount != null) {
            this.IngressCount = new Long(source.IngressCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "ScanTaskProgress", this.ScanTaskProgress);
        this.setParamSimple(map, prefix + "ClusterVersion", this.ClusterVersion);
        this.setParamSimple(map, prefix + "ContainerRuntime", this.ContainerRuntime);
        this.setParamSimple(map, prefix + "ClusterNodeNum", this.ClusterNodeNum);
        this.setParamSimple(map, prefix + "ClusterStatus", this.ClusterStatus);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "SeriousRiskCount", this.SeriousRiskCount);
        this.setParamSimple(map, prefix + "HighRiskCount", this.HighRiskCount);
        this.setParamSimple(map, prefix + "MiddleRiskCount", this.MiddleRiskCount);
        this.setParamSimple(map, prefix + "HintRiskCount", this.HintRiskCount);
        this.setParamSimple(map, prefix + "CheckStatus", this.CheckStatus);
        this.setParamSimple(map, prefix + "DefenderStatus", this.DefenderStatus);
        this.setParamSimple(map, prefix + "TaskCreateTime", this.TaskCreateTime);
        this.setParamSimple(map, prefix + "NetworkType", this.NetworkType);
        this.setParamSimple(map, prefix + "ApiServerAddress", this.ApiServerAddress);
        this.setParamSimple(map, prefix + "NodeCount", this.NodeCount);
        this.setParamSimple(map, prefix + "NamespaceCount", this.NamespaceCount);
        this.setParamSimple(map, prefix + "WorkloadCount", this.WorkloadCount);
        this.setParamSimple(map, prefix + "PodCount", this.PodCount);
        this.setParamSimple(map, prefix + "ServiceCount", this.ServiceCount);
        this.setParamSimple(map, prefix + "IngressCount", this.IngressCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

