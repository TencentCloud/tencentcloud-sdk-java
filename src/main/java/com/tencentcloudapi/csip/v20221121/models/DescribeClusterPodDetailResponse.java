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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeClusterPodDetailResponse extends AbstractModel {

    /**
    * <p>Pod 唯一 ID</p>
    */
    @SerializedName("UniqueID")
    @Expose
    private String UniqueID;

    /**
    * <p>主账号 AppID</p>
    */
    @SerializedName("AppID")
    @Expose
    private Long AppID;

    /**
    * <p>Pod 名称</p>
    */
    @SerializedName("PodName")
    @Expose
    private String PodName;

    /**
    * <p>Pod IP 地址</p>
    */
    @SerializedName("PodIP")
    @Expose
    private String PodIP;

    /**
    * <p>Pod 运行状态</p>
    */
    @SerializedName("RunStatus")
    @Expose
    private String RunStatus;

    /**
    * <p>Pod Labels 列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Labels")
    @Expose
    private AssetTag [] Labels;

    /**
    * <p>Pod 启动时间</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>启动时间（秒）</p>
    */
    @SerializedName("StartupTime")
    @Expose
    private Long StartupTime;

    /**
    * <p>Pod 重启次数</p>
    */
    @SerializedName("RestartCount")
    @Expose
    private Long RestartCount;

    /**
    * <p>所属集群名称</p>
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * <p>所属集群 ID</p>
    */
    @SerializedName("ClusterID")
    @Expose
    private String ClusterID;

    /**
    * <p>所属集群类型</p>
    */
    @SerializedName("ClusterType")
    @Expose
    private String ClusterType;

    /**
    * <p>所属集群运行状态</p>
    */
    @SerializedName("ClusterRunStatus")
    @Expose
    private String ClusterRunStatus;

    /**
    * <p>所属命名空间</p>
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * <p>所在节点名称</p>
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
    * <p>所在节点 ID</p>
    */
    @SerializedName("NodeId")
    @Expose
    private String NodeId;

    /**
    * <p>所属 Workload 名称</p>
    */
    @SerializedName("WorkloadName")
    @Expose
    private String WorkloadName;

    /**
    * <p>所属 Workload 类型</p>
    */
    @SerializedName("WorkloadType")
    @Expose
    private String WorkloadType;

    /**
    * <p>严重风险事件数</p>
    */
    @SerializedName("RiskEventCriticalCount")
    @Expose
    private Long RiskEventCriticalCount;

    /**
    * <p>高危风险事件数</p>
    */
    @SerializedName("RiskEventHighCount")
    @Expose
    private Long RiskEventHighCount;

    /**
    * <p>中危风险事件数</p>
    */
    @SerializedName("RiskEventMiddleCount")
    @Expose
    private Long RiskEventMiddleCount;

    /**
    * <p>低危风险事件数</p>
    */
    @SerializedName("RiskEventLowCount")
    @Expose
    private Long RiskEventLowCount;

    /**
    * <p>严重告警事件数</p>
    */
    @SerializedName("AlarmEventCriticalCount")
    @Expose
    private Long AlarmEventCriticalCount;

    /**
    * <p>高危告警事件数</p>
    */
    @SerializedName("AlarmEventHighCount")
    @Expose
    private Long AlarmEventHighCount;

    /**
    * <p>中危告警事件数</p>
    */
    @SerializedName("AlarmEventMiddleCount")
    @Expose
    private Long AlarmEventMiddleCount;

    /**
    * <p>低危告警事件数</p>
    */
    @SerializedName("AlarmEventLowCount")
    @Expose
    private Long AlarmEventLowCount;

    /**
    * <p>所属地域</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>节点内网 IP</p>
    */
    @SerializedName("NodeInternalIP")
    @Expose
    private String NodeInternalIP;

    /**
    * <p>节点外网 IP</p>
    */
    @SerializedName("NodeExternalIP")
    @Expose
    private String NodeExternalIP;

    /**
    * <p>关联容器数量</p>
    */
    @SerializedName("ContainerCount")
    @Expose
    private Long ContainerCount;

    /**
    * <p>关联服务数量</p>
    */
    @SerializedName("ServiceCount")
    @Expose
    private Long ServiceCount;

    /**
    * <p>地域中文名</p>
    */
    @SerializedName("RegionName")
    @Expose
    private String RegionName;

    /**
    * <p>地域英文名</p>
    */
    @SerializedName("RegionNameEn")
    @Expose
    private String RegionNameEn;

    /**
    * <p>告警数量</p>
    */
    @SerializedName("AlarmCount")
    @Expose
    private Long AlarmCount;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>Pod 唯一 ID</p> 
     * @return UniqueID <p>Pod 唯一 ID</p>
     */
    public String getUniqueID() {
        return this.UniqueID;
    }

    /**
     * Set <p>Pod 唯一 ID</p>
     * @param UniqueID <p>Pod 唯一 ID</p>
     */
    public void setUniqueID(String UniqueID) {
        this.UniqueID = UniqueID;
    }

    /**
     * Get <p>主账号 AppID</p> 
     * @return AppID <p>主账号 AppID</p>
     */
    public Long getAppID() {
        return this.AppID;
    }

    /**
     * Set <p>主账号 AppID</p>
     * @param AppID <p>主账号 AppID</p>
     */
    public void setAppID(Long AppID) {
        this.AppID = AppID;
    }

    /**
     * Get <p>Pod 名称</p> 
     * @return PodName <p>Pod 名称</p>
     */
    public String getPodName() {
        return this.PodName;
    }

    /**
     * Set <p>Pod 名称</p>
     * @param PodName <p>Pod 名称</p>
     */
    public void setPodName(String PodName) {
        this.PodName = PodName;
    }

    /**
     * Get <p>Pod IP 地址</p> 
     * @return PodIP <p>Pod IP 地址</p>
     */
    public String getPodIP() {
        return this.PodIP;
    }

    /**
     * Set <p>Pod IP 地址</p>
     * @param PodIP <p>Pod IP 地址</p>
     */
    public void setPodIP(String PodIP) {
        this.PodIP = PodIP;
    }

    /**
     * Get <p>Pod 运行状态</p> 
     * @return RunStatus <p>Pod 运行状态</p>
     */
    public String getRunStatus() {
        return this.RunStatus;
    }

    /**
     * Set <p>Pod 运行状态</p>
     * @param RunStatus <p>Pod 运行状态</p>
     */
    public void setRunStatus(String RunStatus) {
        this.RunStatus = RunStatus;
    }

    /**
     * Get <p>Pod Labels 列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Labels <p>Pod Labels 列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AssetTag [] getLabels() {
        return this.Labels;
    }

    /**
     * Set <p>Pod Labels 列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Labels <p>Pod Labels 列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLabels(AssetTag [] Labels) {
        this.Labels = Labels;
    }

    /**
     * Get <p>Pod 启动时间</p> 
     * @return StartTime <p>Pod 启动时间</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>Pod 启动时间</p>
     * @param StartTime <p>Pod 启动时间</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>启动时间（秒）</p> 
     * @return StartupTime <p>启动时间（秒）</p>
     */
    public Long getStartupTime() {
        return this.StartupTime;
    }

    /**
     * Set <p>启动时间（秒）</p>
     * @param StartupTime <p>启动时间（秒）</p>
     */
    public void setStartupTime(Long StartupTime) {
        this.StartupTime = StartupTime;
    }

    /**
     * Get <p>Pod 重启次数</p> 
     * @return RestartCount <p>Pod 重启次数</p>
     */
    public Long getRestartCount() {
        return this.RestartCount;
    }

    /**
     * Set <p>Pod 重启次数</p>
     * @param RestartCount <p>Pod 重启次数</p>
     */
    public void setRestartCount(Long RestartCount) {
        this.RestartCount = RestartCount;
    }

    /**
     * Get <p>所属集群名称</p> 
     * @return ClusterName <p>所属集群名称</p>
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set <p>所属集群名称</p>
     * @param ClusterName <p>所属集群名称</p>
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get <p>所属集群 ID</p> 
     * @return ClusterID <p>所属集群 ID</p>
     */
    public String getClusterID() {
        return this.ClusterID;
    }

    /**
     * Set <p>所属集群 ID</p>
     * @param ClusterID <p>所属集群 ID</p>
     */
    public void setClusterID(String ClusterID) {
        this.ClusterID = ClusterID;
    }

    /**
     * Get <p>所属集群类型</p> 
     * @return ClusterType <p>所属集群类型</p>
     */
    public String getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set <p>所属集群类型</p>
     * @param ClusterType <p>所属集群类型</p>
     */
    public void setClusterType(String ClusterType) {
        this.ClusterType = ClusterType;
    }

    /**
     * Get <p>所属集群运行状态</p> 
     * @return ClusterRunStatus <p>所属集群运行状态</p>
     */
    public String getClusterRunStatus() {
        return this.ClusterRunStatus;
    }

    /**
     * Set <p>所属集群运行状态</p>
     * @param ClusterRunStatus <p>所属集群运行状态</p>
     */
    public void setClusterRunStatus(String ClusterRunStatus) {
        this.ClusterRunStatus = ClusterRunStatus;
    }

    /**
     * Get <p>所属命名空间</p> 
     * @return Namespace <p>所属命名空间</p>
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set <p>所属命名空间</p>
     * @param Namespace <p>所属命名空间</p>
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get <p>所在节点名称</p> 
     * @return NodeName <p>所在节点名称</p>
     */
    public String getNodeName() {
        return this.NodeName;
    }

    /**
     * Set <p>所在节点名称</p>
     * @param NodeName <p>所在节点名称</p>
     */
    public void setNodeName(String NodeName) {
        this.NodeName = NodeName;
    }

    /**
     * Get <p>所在节点 ID</p> 
     * @return NodeId <p>所在节点 ID</p>
     */
    public String getNodeId() {
        return this.NodeId;
    }

    /**
     * Set <p>所在节点 ID</p>
     * @param NodeId <p>所在节点 ID</p>
     */
    public void setNodeId(String NodeId) {
        this.NodeId = NodeId;
    }

    /**
     * Get <p>所属 Workload 名称</p> 
     * @return WorkloadName <p>所属 Workload 名称</p>
     */
    public String getWorkloadName() {
        return this.WorkloadName;
    }

    /**
     * Set <p>所属 Workload 名称</p>
     * @param WorkloadName <p>所属 Workload 名称</p>
     */
    public void setWorkloadName(String WorkloadName) {
        this.WorkloadName = WorkloadName;
    }

    /**
     * Get <p>所属 Workload 类型</p> 
     * @return WorkloadType <p>所属 Workload 类型</p>
     */
    public String getWorkloadType() {
        return this.WorkloadType;
    }

    /**
     * Set <p>所属 Workload 类型</p>
     * @param WorkloadType <p>所属 Workload 类型</p>
     */
    public void setWorkloadType(String WorkloadType) {
        this.WorkloadType = WorkloadType;
    }

    /**
     * Get <p>严重风险事件数</p> 
     * @return RiskEventCriticalCount <p>严重风险事件数</p>
     */
    public Long getRiskEventCriticalCount() {
        return this.RiskEventCriticalCount;
    }

    /**
     * Set <p>严重风险事件数</p>
     * @param RiskEventCriticalCount <p>严重风险事件数</p>
     */
    public void setRiskEventCriticalCount(Long RiskEventCriticalCount) {
        this.RiskEventCriticalCount = RiskEventCriticalCount;
    }

    /**
     * Get <p>高危风险事件数</p> 
     * @return RiskEventHighCount <p>高危风险事件数</p>
     */
    public Long getRiskEventHighCount() {
        return this.RiskEventHighCount;
    }

    /**
     * Set <p>高危风险事件数</p>
     * @param RiskEventHighCount <p>高危风险事件数</p>
     */
    public void setRiskEventHighCount(Long RiskEventHighCount) {
        this.RiskEventHighCount = RiskEventHighCount;
    }

    /**
     * Get <p>中危风险事件数</p> 
     * @return RiskEventMiddleCount <p>中危风险事件数</p>
     */
    public Long getRiskEventMiddleCount() {
        return this.RiskEventMiddleCount;
    }

    /**
     * Set <p>中危风险事件数</p>
     * @param RiskEventMiddleCount <p>中危风险事件数</p>
     */
    public void setRiskEventMiddleCount(Long RiskEventMiddleCount) {
        this.RiskEventMiddleCount = RiskEventMiddleCount;
    }

    /**
     * Get <p>低危风险事件数</p> 
     * @return RiskEventLowCount <p>低危风险事件数</p>
     */
    public Long getRiskEventLowCount() {
        return this.RiskEventLowCount;
    }

    /**
     * Set <p>低危风险事件数</p>
     * @param RiskEventLowCount <p>低危风险事件数</p>
     */
    public void setRiskEventLowCount(Long RiskEventLowCount) {
        this.RiskEventLowCount = RiskEventLowCount;
    }

    /**
     * Get <p>严重告警事件数</p> 
     * @return AlarmEventCriticalCount <p>严重告警事件数</p>
     */
    public Long getAlarmEventCriticalCount() {
        return this.AlarmEventCriticalCount;
    }

    /**
     * Set <p>严重告警事件数</p>
     * @param AlarmEventCriticalCount <p>严重告警事件数</p>
     */
    public void setAlarmEventCriticalCount(Long AlarmEventCriticalCount) {
        this.AlarmEventCriticalCount = AlarmEventCriticalCount;
    }

    /**
     * Get <p>高危告警事件数</p> 
     * @return AlarmEventHighCount <p>高危告警事件数</p>
     */
    public Long getAlarmEventHighCount() {
        return this.AlarmEventHighCount;
    }

    /**
     * Set <p>高危告警事件数</p>
     * @param AlarmEventHighCount <p>高危告警事件数</p>
     */
    public void setAlarmEventHighCount(Long AlarmEventHighCount) {
        this.AlarmEventHighCount = AlarmEventHighCount;
    }

    /**
     * Get <p>中危告警事件数</p> 
     * @return AlarmEventMiddleCount <p>中危告警事件数</p>
     */
    public Long getAlarmEventMiddleCount() {
        return this.AlarmEventMiddleCount;
    }

    /**
     * Set <p>中危告警事件数</p>
     * @param AlarmEventMiddleCount <p>中危告警事件数</p>
     */
    public void setAlarmEventMiddleCount(Long AlarmEventMiddleCount) {
        this.AlarmEventMiddleCount = AlarmEventMiddleCount;
    }

    /**
     * Get <p>低危告警事件数</p> 
     * @return AlarmEventLowCount <p>低危告警事件数</p>
     */
    public Long getAlarmEventLowCount() {
        return this.AlarmEventLowCount;
    }

    /**
     * Set <p>低危告警事件数</p>
     * @param AlarmEventLowCount <p>低危告警事件数</p>
     */
    public void setAlarmEventLowCount(Long AlarmEventLowCount) {
        this.AlarmEventLowCount = AlarmEventLowCount;
    }

    /**
     * Get <p>所属地域</p> 
     * @return Region <p>所属地域</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>所属地域</p>
     * @param Region <p>所属地域</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>节点内网 IP</p> 
     * @return NodeInternalIP <p>节点内网 IP</p>
     */
    public String getNodeInternalIP() {
        return this.NodeInternalIP;
    }

    /**
     * Set <p>节点内网 IP</p>
     * @param NodeInternalIP <p>节点内网 IP</p>
     */
    public void setNodeInternalIP(String NodeInternalIP) {
        this.NodeInternalIP = NodeInternalIP;
    }

    /**
     * Get <p>节点外网 IP</p> 
     * @return NodeExternalIP <p>节点外网 IP</p>
     */
    public String getNodeExternalIP() {
        return this.NodeExternalIP;
    }

    /**
     * Set <p>节点外网 IP</p>
     * @param NodeExternalIP <p>节点外网 IP</p>
     */
    public void setNodeExternalIP(String NodeExternalIP) {
        this.NodeExternalIP = NodeExternalIP;
    }

    /**
     * Get <p>关联容器数量</p> 
     * @return ContainerCount <p>关联容器数量</p>
     */
    public Long getContainerCount() {
        return this.ContainerCount;
    }

    /**
     * Set <p>关联容器数量</p>
     * @param ContainerCount <p>关联容器数量</p>
     */
    public void setContainerCount(Long ContainerCount) {
        this.ContainerCount = ContainerCount;
    }

    /**
     * Get <p>关联服务数量</p> 
     * @return ServiceCount <p>关联服务数量</p>
     */
    public Long getServiceCount() {
        return this.ServiceCount;
    }

    /**
     * Set <p>关联服务数量</p>
     * @param ServiceCount <p>关联服务数量</p>
     */
    public void setServiceCount(Long ServiceCount) {
        this.ServiceCount = ServiceCount;
    }

    /**
     * Get <p>地域中文名</p> 
     * @return RegionName <p>地域中文名</p>
     */
    public String getRegionName() {
        return this.RegionName;
    }

    /**
     * Set <p>地域中文名</p>
     * @param RegionName <p>地域中文名</p>
     */
    public void setRegionName(String RegionName) {
        this.RegionName = RegionName;
    }

    /**
     * Get <p>地域英文名</p> 
     * @return RegionNameEn <p>地域英文名</p>
     */
    public String getRegionNameEn() {
        return this.RegionNameEn;
    }

    /**
     * Set <p>地域英文名</p>
     * @param RegionNameEn <p>地域英文名</p>
     */
    public void setRegionNameEn(String RegionNameEn) {
        this.RegionNameEn = RegionNameEn;
    }

    /**
     * Get <p>告警数量</p> 
     * @return AlarmCount <p>告警数量</p>
     */
    public Long getAlarmCount() {
        return this.AlarmCount;
    }

    /**
     * Set <p>告警数量</p>
     * @param AlarmCount <p>告警数量</p>
     */
    public void setAlarmCount(Long AlarmCount) {
        this.AlarmCount = AlarmCount;
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

    public DescribeClusterPodDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeClusterPodDetailResponse(DescribeClusterPodDetailResponse source) {
        if (source.UniqueID != null) {
            this.UniqueID = new String(source.UniqueID);
        }
        if (source.AppID != null) {
            this.AppID = new Long(source.AppID);
        }
        if (source.PodName != null) {
            this.PodName = new String(source.PodName);
        }
        if (source.PodIP != null) {
            this.PodIP = new String(source.PodIP);
        }
        if (source.RunStatus != null) {
            this.RunStatus = new String(source.RunStatus);
        }
        if (source.Labels != null) {
            this.Labels = new AssetTag[source.Labels.length];
            for (int i = 0; i < source.Labels.length; i++) {
                this.Labels[i] = new AssetTag(source.Labels[i]);
            }
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.StartupTime != null) {
            this.StartupTime = new Long(source.StartupTime);
        }
        if (source.RestartCount != null) {
            this.RestartCount = new Long(source.RestartCount);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.ClusterID != null) {
            this.ClusterID = new String(source.ClusterID);
        }
        if (source.ClusterType != null) {
            this.ClusterType = new String(source.ClusterType);
        }
        if (source.ClusterRunStatus != null) {
            this.ClusterRunStatus = new String(source.ClusterRunStatus);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.NodeName != null) {
            this.NodeName = new String(source.NodeName);
        }
        if (source.NodeId != null) {
            this.NodeId = new String(source.NodeId);
        }
        if (source.WorkloadName != null) {
            this.WorkloadName = new String(source.WorkloadName);
        }
        if (source.WorkloadType != null) {
            this.WorkloadType = new String(source.WorkloadType);
        }
        if (source.RiskEventCriticalCount != null) {
            this.RiskEventCriticalCount = new Long(source.RiskEventCriticalCount);
        }
        if (source.RiskEventHighCount != null) {
            this.RiskEventHighCount = new Long(source.RiskEventHighCount);
        }
        if (source.RiskEventMiddleCount != null) {
            this.RiskEventMiddleCount = new Long(source.RiskEventMiddleCount);
        }
        if (source.RiskEventLowCount != null) {
            this.RiskEventLowCount = new Long(source.RiskEventLowCount);
        }
        if (source.AlarmEventCriticalCount != null) {
            this.AlarmEventCriticalCount = new Long(source.AlarmEventCriticalCount);
        }
        if (source.AlarmEventHighCount != null) {
            this.AlarmEventHighCount = new Long(source.AlarmEventHighCount);
        }
        if (source.AlarmEventMiddleCount != null) {
            this.AlarmEventMiddleCount = new Long(source.AlarmEventMiddleCount);
        }
        if (source.AlarmEventLowCount != null) {
            this.AlarmEventLowCount = new Long(source.AlarmEventLowCount);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.NodeInternalIP != null) {
            this.NodeInternalIP = new String(source.NodeInternalIP);
        }
        if (source.NodeExternalIP != null) {
            this.NodeExternalIP = new String(source.NodeExternalIP);
        }
        if (source.ContainerCount != null) {
            this.ContainerCount = new Long(source.ContainerCount);
        }
        if (source.ServiceCount != null) {
            this.ServiceCount = new Long(source.ServiceCount);
        }
        if (source.RegionName != null) {
            this.RegionName = new String(source.RegionName);
        }
        if (source.RegionNameEn != null) {
            this.RegionNameEn = new String(source.RegionNameEn);
        }
        if (source.AlarmCount != null) {
            this.AlarmCount = new Long(source.AlarmCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UniqueID", this.UniqueID);
        this.setParamSimple(map, prefix + "AppID", this.AppID);
        this.setParamSimple(map, prefix + "PodName", this.PodName);
        this.setParamSimple(map, prefix + "PodIP", this.PodIP);
        this.setParamSimple(map, prefix + "RunStatus", this.RunStatus);
        this.setParamArrayObj(map, prefix + "Labels.", this.Labels);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "StartupTime", this.StartupTime);
        this.setParamSimple(map, prefix + "RestartCount", this.RestartCount);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "ClusterID", this.ClusterID);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);
        this.setParamSimple(map, prefix + "ClusterRunStatus", this.ClusterRunStatus);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "NodeName", this.NodeName);
        this.setParamSimple(map, prefix + "NodeId", this.NodeId);
        this.setParamSimple(map, prefix + "WorkloadName", this.WorkloadName);
        this.setParamSimple(map, prefix + "WorkloadType", this.WorkloadType);
        this.setParamSimple(map, prefix + "RiskEventCriticalCount", this.RiskEventCriticalCount);
        this.setParamSimple(map, prefix + "RiskEventHighCount", this.RiskEventHighCount);
        this.setParamSimple(map, prefix + "RiskEventMiddleCount", this.RiskEventMiddleCount);
        this.setParamSimple(map, prefix + "RiskEventLowCount", this.RiskEventLowCount);
        this.setParamSimple(map, prefix + "AlarmEventCriticalCount", this.AlarmEventCriticalCount);
        this.setParamSimple(map, prefix + "AlarmEventHighCount", this.AlarmEventHighCount);
        this.setParamSimple(map, prefix + "AlarmEventMiddleCount", this.AlarmEventMiddleCount);
        this.setParamSimple(map, prefix + "AlarmEventLowCount", this.AlarmEventLowCount);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "NodeInternalIP", this.NodeInternalIP);
        this.setParamSimple(map, prefix + "NodeExternalIP", this.NodeExternalIP);
        this.setParamSimple(map, prefix + "ContainerCount", this.ContainerCount);
        this.setParamSimple(map, prefix + "ServiceCount", this.ServiceCount);
        this.setParamSimple(map, prefix + "RegionName", this.RegionName);
        this.setParamSimple(map, prefix + "RegionNameEn", this.RegionNameEn);
        this.setParamSimple(map, prefix + "AlarmCount", this.AlarmCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

