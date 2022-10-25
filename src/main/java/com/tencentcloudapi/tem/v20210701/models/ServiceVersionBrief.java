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
package com.tencentcloudapi.tem.v20210701.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ServiceVersionBrief extends AbstractModel{

    /**
    * 版本名称
    */
    @SerializedName("VersionName")
    @Expose
    private String VersionName;

    /**
    * 状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 是否启动弹性 -- 已废弃
    */
    @SerializedName("EnableEs")
    @Expose
    private Long EnableEs;

    /**
    * 当前实例
    */
    @SerializedName("CurrentInstances")
    @Expose
    private Long CurrentInstances;

    /**
    * version的id
    */
    @SerializedName("VersionId")
    @Expose
    private String VersionId;

    /**
    * 日志输出配置 -- 已废弃
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LogOutputConf")
    @Expose
    private LogOutputConf LogOutputConf;

    /**
    * 期望实例
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpectedInstances")
    @Expose
    private Long ExpectedInstances;

    /**
    * 部署方式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeployMode")
    @Expose
    private String DeployMode;

    /**
    * 建构任务ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BuildTaskId")
    @Expose
    private String BuildTaskId;

    /**
    * 环境ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnvironmentId")
    @Expose
    private String EnvironmentId;

    /**
    * 环境name
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnvironmentName")
    @Expose
    private String EnvironmentName;

    /**
    * 服务ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * 服务name
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApplicationName")
    @Expose
    private String ApplicationName;

    /**
    * 是否正在发布中
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UnderDeploying")
    @Expose
    private Boolean UnderDeploying;

    /**
    * 分批次部署状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BatchDeployStatus")
    @Expose
    private String BatchDeployStatus;

    /**
    * 可用区
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Zones")
    @Expose
    private String [] Zones;

    /**
    * 节点信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NodeInfos")
    @Expose
    private NodeInfo [] NodeInfos;

    /**
    * 实例信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PodList")
    @Expose
    private DescribeRunPodPage PodList;

    /**
    * 工作负载信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkloadInfo")
    @Expose
    private WorkloadInfo WorkloadInfo;

    /**
    * 创建日期
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateDate")
    @Expose
    private String CreateDate;

    /**
     * Get 版本名称 
     * @return VersionName 版本名称
     */
    public String getVersionName() {
        return this.VersionName;
    }

    /**
     * Set 版本名称
     * @param VersionName 版本名称
     */
    public void setVersionName(String VersionName) {
        this.VersionName = VersionName;
    }

    /**
     * Get 状态 
     * @return Status 状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态
     * @param Status 状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 是否启动弹性 -- 已废弃 
     * @return EnableEs 是否启动弹性 -- 已废弃
     */
    public Long getEnableEs() {
        return this.EnableEs;
    }

    /**
     * Set 是否启动弹性 -- 已废弃
     * @param EnableEs 是否启动弹性 -- 已废弃
     */
    public void setEnableEs(Long EnableEs) {
        this.EnableEs = EnableEs;
    }

    /**
     * Get 当前实例 
     * @return CurrentInstances 当前实例
     */
    public Long getCurrentInstances() {
        return this.CurrentInstances;
    }

    /**
     * Set 当前实例
     * @param CurrentInstances 当前实例
     */
    public void setCurrentInstances(Long CurrentInstances) {
        this.CurrentInstances = CurrentInstances;
    }

    /**
     * Get version的id 
     * @return VersionId version的id
     */
    public String getVersionId() {
        return this.VersionId;
    }

    /**
     * Set version的id
     * @param VersionId version的id
     */
    public void setVersionId(String VersionId) {
        this.VersionId = VersionId;
    }

    /**
     * Get 日志输出配置 -- 已废弃
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LogOutputConf 日志输出配置 -- 已废弃
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LogOutputConf getLogOutputConf() {
        return this.LogOutputConf;
    }

    /**
     * Set 日志输出配置 -- 已废弃
注意：此字段可能返回 null，表示取不到有效值。
     * @param LogOutputConf 日志输出配置 -- 已废弃
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogOutputConf(LogOutputConf LogOutputConf) {
        this.LogOutputConf = LogOutputConf;
    }

    /**
     * Get 期望实例
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpectedInstances 期望实例
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getExpectedInstances() {
        return this.ExpectedInstances;
    }

    /**
     * Set 期望实例
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpectedInstances 期望实例
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpectedInstances(Long ExpectedInstances) {
        this.ExpectedInstances = ExpectedInstances;
    }

    /**
     * Get 部署方式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeployMode 部署方式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeployMode() {
        return this.DeployMode;
    }

    /**
     * Set 部署方式
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeployMode 部署方式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeployMode(String DeployMode) {
        this.DeployMode = DeployMode;
    }

    /**
     * Get 建构任务ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BuildTaskId 建构任务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBuildTaskId() {
        return this.BuildTaskId;
    }

    /**
     * Set 建构任务ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param BuildTaskId 建构任务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBuildTaskId(String BuildTaskId) {
        this.BuildTaskId = BuildTaskId;
    }

    /**
     * Get 环境ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnvironmentId 环境ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEnvironmentId() {
        return this.EnvironmentId;
    }

    /**
     * Set 环境ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnvironmentId 环境ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnvironmentId(String EnvironmentId) {
        this.EnvironmentId = EnvironmentId;
    }

    /**
     * Get 环境name
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnvironmentName 环境name
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEnvironmentName() {
        return this.EnvironmentName;
    }

    /**
     * Set 环境name
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnvironmentName 环境name
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnvironmentName(String EnvironmentName) {
        this.EnvironmentName = EnvironmentName;
    }

    /**
     * Get 服务ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApplicationId 服务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set 服务ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApplicationId 服务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get 服务name
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApplicationName 服务name
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApplicationName() {
        return this.ApplicationName;
    }

    /**
     * Set 服务name
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApplicationName 服务name
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApplicationName(String ApplicationName) {
        this.ApplicationName = ApplicationName;
    }

    /**
     * Get 是否正在发布中
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UnderDeploying 是否正在发布中
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getUnderDeploying() {
        return this.UnderDeploying;
    }

    /**
     * Set 是否正在发布中
注意：此字段可能返回 null，表示取不到有效值。
     * @param UnderDeploying 是否正在发布中
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUnderDeploying(Boolean UnderDeploying) {
        this.UnderDeploying = UnderDeploying;
    }

    /**
     * Get 分批次部署状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BatchDeployStatus 分批次部署状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBatchDeployStatus() {
        return this.BatchDeployStatus;
    }

    /**
     * Set 分批次部署状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param BatchDeployStatus 分批次部署状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBatchDeployStatus(String BatchDeployStatus) {
        this.BatchDeployStatus = BatchDeployStatus;
    }

    /**
     * Get 可用区
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Zones 可用区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getZones() {
        return this.Zones;
    }

    /**
     * Set 可用区
注意：此字段可能返回 null，表示取不到有效值。
     * @param Zones 可用区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setZones(String [] Zones) {
        this.Zones = Zones;
    }

    /**
     * Get 节点信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NodeInfos 节点信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public NodeInfo [] getNodeInfos() {
        return this.NodeInfos;
    }

    /**
     * Set 节点信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param NodeInfos 节点信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNodeInfos(NodeInfo [] NodeInfos) {
        this.NodeInfos = NodeInfos;
    }

    /**
     * Get 实例信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PodList 实例信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DescribeRunPodPage getPodList() {
        return this.PodList;
    }

    /**
     * Set 实例信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param PodList 实例信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPodList(DescribeRunPodPage PodList) {
        this.PodList = PodList;
    }

    /**
     * Get 工作负载信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkloadInfo 工作负载信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public WorkloadInfo getWorkloadInfo() {
        return this.WorkloadInfo;
    }

    /**
     * Set 工作负载信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkloadInfo 工作负载信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkloadInfo(WorkloadInfo WorkloadInfo) {
        this.WorkloadInfo = WorkloadInfo;
    }

    /**
     * Get 创建日期
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateDate 创建日期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateDate() {
        return this.CreateDate;
    }

    /**
     * Set 创建日期
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateDate 创建日期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateDate(String CreateDate) {
        this.CreateDate = CreateDate;
    }

    public ServiceVersionBrief() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ServiceVersionBrief(ServiceVersionBrief source) {
        if (source.VersionName != null) {
            this.VersionName = new String(source.VersionName);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.EnableEs != null) {
            this.EnableEs = new Long(source.EnableEs);
        }
        if (source.CurrentInstances != null) {
            this.CurrentInstances = new Long(source.CurrentInstances);
        }
        if (source.VersionId != null) {
            this.VersionId = new String(source.VersionId);
        }
        if (source.LogOutputConf != null) {
            this.LogOutputConf = new LogOutputConf(source.LogOutputConf);
        }
        if (source.ExpectedInstances != null) {
            this.ExpectedInstances = new Long(source.ExpectedInstances);
        }
        if (source.DeployMode != null) {
            this.DeployMode = new String(source.DeployMode);
        }
        if (source.BuildTaskId != null) {
            this.BuildTaskId = new String(source.BuildTaskId);
        }
        if (source.EnvironmentId != null) {
            this.EnvironmentId = new String(source.EnvironmentId);
        }
        if (source.EnvironmentName != null) {
            this.EnvironmentName = new String(source.EnvironmentName);
        }
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
        if (source.ApplicationName != null) {
            this.ApplicationName = new String(source.ApplicationName);
        }
        if (source.UnderDeploying != null) {
            this.UnderDeploying = new Boolean(source.UnderDeploying);
        }
        if (source.BatchDeployStatus != null) {
            this.BatchDeployStatus = new String(source.BatchDeployStatus);
        }
        if (source.Zones != null) {
            this.Zones = new String[source.Zones.length];
            for (int i = 0; i < source.Zones.length; i++) {
                this.Zones[i] = new String(source.Zones[i]);
            }
        }
        if (source.NodeInfos != null) {
            this.NodeInfos = new NodeInfo[source.NodeInfos.length];
            for (int i = 0; i < source.NodeInfos.length; i++) {
                this.NodeInfos[i] = new NodeInfo(source.NodeInfos[i]);
            }
        }
        if (source.PodList != null) {
            this.PodList = new DescribeRunPodPage(source.PodList);
        }
        if (source.WorkloadInfo != null) {
            this.WorkloadInfo = new WorkloadInfo(source.WorkloadInfo);
        }
        if (source.CreateDate != null) {
            this.CreateDate = new String(source.CreateDate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VersionName", this.VersionName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "EnableEs", this.EnableEs);
        this.setParamSimple(map, prefix + "CurrentInstances", this.CurrentInstances);
        this.setParamSimple(map, prefix + "VersionId", this.VersionId);
        this.setParamObj(map, prefix + "LogOutputConf.", this.LogOutputConf);
        this.setParamSimple(map, prefix + "ExpectedInstances", this.ExpectedInstances);
        this.setParamSimple(map, prefix + "DeployMode", this.DeployMode);
        this.setParamSimple(map, prefix + "BuildTaskId", this.BuildTaskId);
        this.setParamSimple(map, prefix + "EnvironmentId", this.EnvironmentId);
        this.setParamSimple(map, prefix + "EnvironmentName", this.EnvironmentName);
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "ApplicationName", this.ApplicationName);
        this.setParamSimple(map, prefix + "UnderDeploying", this.UnderDeploying);
        this.setParamSimple(map, prefix + "BatchDeployStatus", this.BatchDeployStatus);
        this.setParamArraySimple(map, prefix + "Zones.", this.Zones);
        this.setParamArrayObj(map, prefix + "NodeInfos.", this.NodeInfos);
        this.setParamObj(map, prefix + "PodList.", this.PodList);
        this.setParamObj(map, prefix + "WorkloadInfo.", this.WorkloadInfo);
        this.setParamSimple(map, prefix + "CreateDate", this.CreateDate);

    }
}

