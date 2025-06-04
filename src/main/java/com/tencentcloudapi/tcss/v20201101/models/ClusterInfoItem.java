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

public class ClusterInfoItem extends AbstractModel {

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
    * 集群版本
    */
    @SerializedName("ClusterVersion")
    @Expose
    private String ClusterVersion;

    /**
    * 集群操作系统
    */
    @SerializedName("ClusterOs")
    @Expose
    private String ClusterOs;

    /**
    * 集群类型
    */
    @SerializedName("ClusterType")
    @Expose
    private String ClusterType;

    /**
    * 集群节点数
    */
    @SerializedName("ClusterNodeNum")
    @Expose
    private Long ClusterNodeNum;

    /**
    * 集群区域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 防护状态: 
已防护: Defended 
未防护: UnDefended
部分防护: PartDefened
    */
    @SerializedName("DefenderStatus")
    @Expose
    private String DefenderStatus;

    /**
    * 集群状态
    */
    @SerializedName("ClusterStatus")
    @Expose
    private String ClusterStatus;

    /**
    * 集群运行子状态
    */
    @SerializedName("ClusterSubStatus")
    @Expose
    private String ClusterSubStatus;

    /**
    * 集群的检测模式，为Cluster_Normal或者Cluster_Actived.
    */
    @SerializedName("ClusterCheckMode")
    @Expose
    private String ClusterCheckMode;

    /**
    * 是否自动定期检测
    */
    @SerializedName("ClusterAutoCheck")
    @Expose
    private Boolean ClusterAutoCheck;

    /**
    * 防护容器部署失败原因，为UserDaemonSetNotReady时,和UnreadyNodeNum转成"N个节点防御容器为就绪"，其他错误直接展示
    */
    @SerializedName("DefenderErrorReason")
    @Expose
    private String DefenderErrorReason;

    /**
    * 防御容器没有ready状态的节点数量
    */
    @SerializedName("UnreadyNodeNum")
    @Expose
    private Long UnreadyNodeNum;

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
    * 检查失败原因
    */
    @SerializedName("CheckFailReason")
    @Expose
    private String CheckFailReason;

    /**
    * 检查状态,为Task_Running, NoRisk, HasRisk, Uncheck, Task_Error
    */
    @SerializedName("CheckStatus")
    @Expose
    private String CheckStatus;

    /**
    * 任务创建时间,检查时间
    */
    @SerializedName("TaskCreateTime")
    @Expose
    private String TaskCreateTime;

    /**
    * 接入状态:
未接入: AccessedNone
已防护: AccessedDefended
未防护: AccessedInstalled
部分防护: AccessedPartialDefence
接入异常: AccessedException
卸载异常: AccessedUninstallException
接入中: AccessedInstalling
卸载中: AccessedUninstalling
    */
    @SerializedName("AccessedStatus")
    @Expose
    private String AccessedStatus;

    /**
    * 接入失败原因
    */
    @SerializedName("AccessedSubStatus")
    @Expose
    private String AccessedSubStatus;

    /**
    * 节点总数
    */
    @SerializedName("NodeCount")
    @Expose
    private Long NodeCount;

    /**
    * 离线节点数
    */
    @SerializedName("OffLineNodeCount")
    @Expose
    private Long OffLineNodeCount;

    /**
    * 未安装agent节点数
    */
    @SerializedName("UnInstallAgentNodeCount")
    @Expose
    private Long UnInstallAgentNodeCount;

    /**
    * 计费核数(弹性计费核数+普通计费核数)
    */
    @SerializedName("ChargeCoresCnt")
    @Expose
    private Long ChargeCoresCnt;

    /**
    * master 地址列表
    */
    @SerializedName("MasterAddresses")
    @Expose
    private String [] MasterAddresses;

    /**
    * 核数
    */
    @SerializedName("CoresCnt")
    @Expose
    private Long CoresCnt;

    /**
    * 集群审计开关状态：
已关闭Closed/关闭中Closing/关闭失败CloseFailed/已开启Opened/开启中Opening/开启失败OpenFailed
    */
    @SerializedName("ClusterAuditStatus")
    @Expose
    private String ClusterAuditStatus;

    /**
    * 集群审计开关失败信息
    */
    @SerializedName("ClusterAuditFailedInfo")
    @Expose
    private String ClusterAuditFailedInfo;

    /**
    * 所有者名称
    */
    @SerializedName("OwnerName")
    @Expose
    private String OwnerName;

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
     * Get 集群操作系统 
     * @return ClusterOs 集群操作系统
     */
    public String getClusterOs() {
        return this.ClusterOs;
    }

    /**
     * Set 集群操作系统
     * @param ClusterOs 集群操作系统
     */
    public void setClusterOs(String ClusterOs) {
        this.ClusterOs = ClusterOs;
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
     * Get 防护状态: 
已防护: Defended 
未防护: UnDefended
部分防护: PartDefened 
     * @return DefenderStatus 防护状态: 
已防护: Defended 
未防护: UnDefended
部分防护: PartDefened
     */
    public String getDefenderStatus() {
        return this.DefenderStatus;
    }

    /**
     * Set 防护状态: 
已防护: Defended 
未防护: UnDefended
部分防护: PartDefened
     * @param DefenderStatus 防护状态: 
已防护: Defended 
未防护: UnDefended
部分防护: PartDefened
     */
    public void setDefenderStatus(String DefenderStatus) {
        this.DefenderStatus = DefenderStatus;
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
     * Get 集群运行子状态 
     * @return ClusterSubStatus 集群运行子状态
     */
    public String getClusterSubStatus() {
        return this.ClusterSubStatus;
    }

    /**
     * Set 集群运行子状态
     * @param ClusterSubStatus 集群运行子状态
     */
    public void setClusterSubStatus(String ClusterSubStatus) {
        this.ClusterSubStatus = ClusterSubStatus;
    }

    /**
     * Get 集群的检测模式，为Cluster_Normal或者Cluster_Actived. 
     * @return ClusterCheckMode 集群的检测模式，为Cluster_Normal或者Cluster_Actived.
     */
    public String getClusterCheckMode() {
        return this.ClusterCheckMode;
    }

    /**
     * Set 集群的检测模式，为Cluster_Normal或者Cluster_Actived.
     * @param ClusterCheckMode 集群的检测模式，为Cluster_Normal或者Cluster_Actived.
     */
    public void setClusterCheckMode(String ClusterCheckMode) {
        this.ClusterCheckMode = ClusterCheckMode;
    }

    /**
     * Get 是否自动定期检测 
     * @return ClusterAutoCheck 是否自动定期检测
     */
    public Boolean getClusterAutoCheck() {
        return this.ClusterAutoCheck;
    }

    /**
     * Set 是否自动定期检测
     * @param ClusterAutoCheck 是否自动定期检测
     */
    public void setClusterAutoCheck(Boolean ClusterAutoCheck) {
        this.ClusterAutoCheck = ClusterAutoCheck;
    }

    /**
     * Get 防护容器部署失败原因，为UserDaemonSetNotReady时,和UnreadyNodeNum转成"N个节点防御容器为就绪"，其他错误直接展示 
     * @return DefenderErrorReason 防护容器部署失败原因，为UserDaemonSetNotReady时,和UnreadyNodeNum转成"N个节点防御容器为就绪"，其他错误直接展示
     */
    public String getDefenderErrorReason() {
        return this.DefenderErrorReason;
    }

    /**
     * Set 防护容器部署失败原因，为UserDaemonSetNotReady时,和UnreadyNodeNum转成"N个节点防御容器为就绪"，其他错误直接展示
     * @param DefenderErrorReason 防护容器部署失败原因，为UserDaemonSetNotReady时,和UnreadyNodeNum转成"N个节点防御容器为就绪"，其他错误直接展示
     */
    public void setDefenderErrorReason(String DefenderErrorReason) {
        this.DefenderErrorReason = DefenderErrorReason;
    }

    /**
     * Get 防御容器没有ready状态的节点数量 
     * @return UnreadyNodeNum 防御容器没有ready状态的节点数量
     */
    public Long getUnreadyNodeNum() {
        return this.UnreadyNodeNum;
    }

    /**
     * Set 防御容器没有ready状态的节点数量
     * @param UnreadyNodeNum 防御容器没有ready状态的节点数量
     */
    public void setUnreadyNodeNum(Long UnreadyNodeNum) {
        this.UnreadyNodeNum = UnreadyNodeNum;
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
     * Get 检查失败原因 
     * @return CheckFailReason 检查失败原因
     */
    public String getCheckFailReason() {
        return this.CheckFailReason;
    }

    /**
     * Set 检查失败原因
     * @param CheckFailReason 检查失败原因
     */
    public void setCheckFailReason(String CheckFailReason) {
        this.CheckFailReason = CheckFailReason;
    }

    /**
     * Get 检查状态,为Task_Running, NoRisk, HasRisk, Uncheck, Task_Error 
     * @return CheckStatus 检查状态,为Task_Running, NoRisk, HasRisk, Uncheck, Task_Error
     */
    public String getCheckStatus() {
        return this.CheckStatus;
    }

    /**
     * Set 检查状态,为Task_Running, NoRisk, HasRisk, Uncheck, Task_Error
     * @param CheckStatus 检查状态,为Task_Running, NoRisk, HasRisk, Uncheck, Task_Error
     */
    public void setCheckStatus(String CheckStatus) {
        this.CheckStatus = CheckStatus;
    }

    /**
     * Get 任务创建时间,检查时间 
     * @return TaskCreateTime 任务创建时间,检查时间
     */
    public String getTaskCreateTime() {
        return this.TaskCreateTime;
    }

    /**
     * Set 任务创建时间,检查时间
     * @param TaskCreateTime 任务创建时间,检查时间
     */
    public void setTaskCreateTime(String TaskCreateTime) {
        this.TaskCreateTime = TaskCreateTime;
    }

    /**
     * Get 接入状态:
未接入: AccessedNone
已防护: AccessedDefended
未防护: AccessedInstalled
部分防护: AccessedPartialDefence
接入异常: AccessedException
卸载异常: AccessedUninstallException
接入中: AccessedInstalling
卸载中: AccessedUninstalling 
     * @return AccessedStatus 接入状态:
未接入: AccessedNone
已防护: AccessedDefended
未防护: AccessedInstalled
部分防护: AccessedPartialDefence
接入异常: AccessedException
卸载异常: AccessedUninstallException
接入中: AccessedInstalling
卸载中: AccessedUninstalling
     */
    public String getAccessedStatus() {
        return this.AccessedStatus;
    }

    /**
     * Set 接入状态:
未接入: AccessedNone
已防护: AccessedDefended
未防护: AccessedInstalled
部分防护: AccessedPartialDefence
接入异常: AccessedException
卸载异常: AccessedUninstallException
接入中: AccessedInstalling
卸载中: AccessedUninstalling
     * @param AccessedStatus 接入状态:
未接入: AccessedNone
已防护: AccessedDefended
未防护: AccessedInstalled
部分防护: AccessedPartialDefence
接入异常: AccessedException
卸载异常: AccessedUninstallException
接入中: AccessedInstalling
卸载中: AccessedUninstalling
     */
    public void setAccessedStatus(String AccessedStatus) {
        this.AccessedStatus = AccessedStatus;
    }

    /**
     * Get 接入失败原因 
     * @return AccessedSubStatus 接入失败原因
     */
    public String getAccessedSubStatus() {
        return this.AccessedSubStatus;
    }

    /**
     * Set 接入失败原因
     * @param AccessedSubStatus 接入失败原因
     */
    public void setAccessedSubStatus(String AccessedSubStatus) {
        this.AccessedSubStatus = AccessedSubStatus;
    }

    /**
     * Get 节点总数 
     * @return NodeCount 节点总数
     */
    public Long getNodeCount() {
        return this.NodeCount;
    }

    /**
     * Set 节点总数
     * @param NodeCount 节点总数
     */
    public void setNodeCount(Long NodeCount) {
        this.NodeCount = NodeCount;
    }

    /**
     * Get 离线节点数 
     * @return OffLineNodeCount 离线节点数
     */
    public Long getOffLineNodeCount() {
        return this.OffLineNodeCount;
    }

    /**
     * Set 离线节点数
     * @param OffLineNodeCount 离线节点数
     */
    public void setOffLineNodeCount(Long OffLineNodeCount) {
        this.OffLineNodeCount = OffLineNodeCount;
    }

    /**
     * Get 未安装agent节点数 
     * @return UnInstallAgentNodeCount 未安装agent节点数
     */
    public Long getUnInstallAgentNodeCount() {
        return this.UnInstallAgentNodeCount;
    }

    /**
     * Set 未安装agent节点数
     * @param UnInstallAgentNodeCount 未安装agent节点数
     */
    public void setUnInstallAgentNodeCount(Long UnInstallAgentNodeCount) {
        this.UnInstallAgentNodeCount = UnInstallAgentNodeCount;
    }

    /**
     * Get 计费核数(弹性计费核数+普通计费核数) 
     * @return ChargeCoresCnt 计费核数(弹性计费核数+普通计费核数)
     */
    public Long getChargeCoresCnt() {
        return this.ChargeCoresCnt;
    }

    /**
     * Set 计费核数(弹性计费核数+普通计费核数)
     * @param ChargeCoresCnt 计费核数(弹性计费核数+普通计费核数)
     */
    public void setChargeCoresCnt(Long ChargeCoresCnt) {
        this.ChargeCoresCnt = ChargeCoresCnt;
    }

    /**
     * Get master 地址列表 
     * @return MasterAddresses master 地址列表
     */
    public String [] getMasterAddresses() {
        return this.MasterAddresses;
    }

    /**
     * Set master 地址列表
     * @param MasterAddresses master 地址列表
     */
    public void setMasterAddresses(String [] MasterAddresses) {
        this.MasterAddresses = MasterAddresses;
    }

    /**
     * Get 核数 
     * @return CoresCnt 核数
     */
    public Long getCoresCnt() {
        return this.CoresCnt;
    }

    /**
     * Set 核数
     * @param CoresCnt 核数
     */
    public void setCoresCnt(Long CoresCnt) {
        this.CoresCnt = CoresCnt;
    }

    /**
     * Get 集群审计开关状态：
已关闭Closed/关闭中Closing/关闭失败CloseFailed/已开启Opened/开启中Opening/开启失败OpenFailed 
     * @return ClusterAuditStatus 集群审计开关状态：
已关闭Closed/关闭中Closing/关闭失败CloseFailed/已开启Opened/开启中Opening/开启失败OpenFailed
     */
    public String getClusterAuditStatus() {
        return this.ClusterAuditStatus;
    }

    /**
     * Set 集群审计开关状态：
已关闭Closed/关闭中Closing/关闭失败CloseFailed/已开启Opened/开启中Opening/开启失败OpenFailed
     * @param ClusterAuditStatus 集群审计开关状态：
已关闭Closed/关闭中Closing/关闭失败CloseFailed/已开启Opened/开启中Opening/开启失败OpenFailed
     */
    public void setClusterAuditStatus(String ClusterAuditStatus) {
        this.ClusterAuditStatus = ClusterAuditStatus;
    }

    /**
     * Get 集群审计开关失败信息 
     * @return ClusterAuditFailedInfo 集群审计开关失败信息
     */
    public String getClusterAuditFailedInfo() {
        return this.ClusterAuditFailedInfo;
    }

    /**
     * Set 集群审计开关失败信息
     * @param ClusterAuditFailedInfo 集群审计开关失败信息
     */
    public void setClusterAuditFailedInfo(String ClusterAuditFailedInfo) {
        this.ClusterAuditFailedInfo = ClusterAuditFailedInfo;
    }

    /**
     * Get 所有者名称 
     * @return OwnerName 所有者名称
     */
    public String getOwnerName() {
        return this.OwnerName;
    }

    /**
     * Set 所有者名称
     * @param OwnerName 所有者名称
     */
    public void setOwnerName(String OwnerName) {
        this.OwnerName = OwnerName;
    }

    public ClusterInfoItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClusterInfoItem(ClusterInfoItem source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.ClusterVersion != null) {
            this.ClusterVersion = new String(source.ClusterVersion);
        }
        if (source.ClusterOs != null) {
            this.ClusterOs = new String(source.ClusterOs);
        }
        if (source.ClusterType != null) {
            this.ClusterType = new String(source.ClusterType);
        }
        if (source.ClusterNodeNum != null) {
            this.ClusterNodeNum = new Long(source.ClusterNodeNum);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.DefenderStatus != null) {
            this.DefenderStatus = new String(source.DefenderStatus);
        }
        if (source.ClusterStatus != null) {
            this.ClusterStatus = new String(source.ClusterStatus);
        }
        if (source.ClusterSubStatus != null) {
            this.ClusterSubStatus = new String(source.ClusterSubStatus);
        }
        if (source.ClusterCheckMode != null) {
            this.ClusterCheckMode = new String(source.ClusterCheckMode);
        }
        if (source.ClusterAutoCheck != null) {
            this.ClusterAutoCheck = new Boolean(source.ClusterAutoCheck);
        }
        if (source.DefenderErrorReason != null) {
            this.DefenderErrorReason = new String(source.DefenderErrorReason);
        }
        if (source.UnreadyNodeNum != null) {
            this.UnreadyNodeNum = new Long(source.UnreadyNodeNum);
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
        if (source.CheckFailReason != null) {
            this.CheckFailReason = new String(source.CheckFailReason);
        }
        if (source.CheckStatus != null) {
            this.CheckStatus = new String(source.CheckStatus);
        }
        if (source.TaskCreateTime != null) {
            this.TaskCreateTime = new String(source.TaskCreateTime);
        }
        if (source.AccessedStatus != null) {
            this.AccessedStatus = new String(source.AccessedStatus);
        }
        if (source.AccessedSubStatus != null) {
            this.AccessedSubStatus = new String(source.AccessedSubStatus);
        }
        if (source.NodeCount != null) {
            this.NodeCount = new Long(source.NodeCount);
        }
        if (source.OffLineNodeCount != null) {
            this.OffLineNodeCount = new Long(source.OffLineNodeCount);
        }
        if (source.UnInstallAgentNodeCount != null) {
            this.UnInstallAgentNodeCount = new Long(source.UnInstallAgentNodeCount);
        }
        if (source.ChargeCoresCnt != null) {
            this.ChargeCoresCnt = new Long(source.ChargeCoresCnt);
        }
        if (source.MasterAddresses != null) {
            this.MasterAddresses = new String[source.MasterAddresses.length];
            for (int i = 0; i < source.MasterAddresses.length; i++) {
                this.MasterAddresses[i] = new String(source.MasterAddresses[i]);
            }
        }
        if (source.CoresCnt != null) {
            this.CoresCnt = new Long(source.CoresCnt);
        }
        if (source.ClusterAuditStatus != null) {
            this.ClusterAuditStatus = new String(source.ClusterAuditStatus);
        }
        if (source.ClusterAuditFailedInfo != null) {
            this.ClusterAuditFailedInfo = new String(source.ClusterAuditFailedInfo);
        }
        if (source.OwnerName != null) {
            this.OwnerName = new String(source.OwnerName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "ClusterVersion", this.ClusterVersion);
        this.setParamSimple(map, prefix + "ClusterOs", this.ClusterOs);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);
        this.setParamSimple(map, prefix + "ClusterNodeNum", this.ClusterNodeNum);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "DefenderStatus", this.DefenderStatus);
        this.setParamSimple(map, prefix + "ClusterStatus", this.ClusterStatus);
        this.setParamSimple(map, prefix + "ClusterSubStatus", this.ClusterSubStatus);
        this.setParamSimple(map, prefix + "ClusterCheckMode", this.ClusterCheckMode);
        this.setParamSimple(map, prefix + "ClusterAutoCheck", this.ClusterAutoCheck);
        this.setParamSimple(map, prefix + "DefenderErrorReason", this.DefenderErrorReason);
        this.setParamSimple(map, prefix + "UnreadyNodeNum", this.UnreadyNodeNum);
        this.setParamSimple(map, prefix + "SeriousRiskCount", this.SeriousRiskCount);
        this.setParamSimple(map, prefix + "HighRiskCount", this.HighRiskCount);
        this.setParamSimple(map, prefix + "MiddleRiskCount", this.MiddleRiskCount);
        this.setParamSimple(map, prefix + "HintRiskCount", this.HintRiskCount);
        this.setParamSimple(map, prefix + "CheckFailReason", this.CheckFailReason);
        this.setParamSimple(map, prefix + "CheckStatus", this.CheckStatus);
        this.setParamSimple(map, prefix + "TaskCreateTime", this.TaskCreateTime);
        this.setParamSimple(map, prefix + "AccessedStatus", this.AccessedStatus);
        this.setParamSimple(map, prefix + "AccessedSubStatus", this.AccessedSubStatus);
        this.setParamSimple(map, prefix + "NodeCount", this.NodeCount);
        this.setParamSimple(map, prefix + "OffLineNodeCount", this.OffLineNodeCount);
        this.setParamSimple(map, prefix + "UnInstallAgentNodeCount", this.UnInstallAgentNodeCount);
        this.setParamSimple(map, prefix + "ChargeCoresCnt", this.ChargeCoresCnt);
        this.setParamArraySimple(map, prefix + "MasterAddresses.", this.MasterAddresses);
        this.setParamSimple(map, prefix + "CoresCnt", this.CoresCnt);
        this.setParamSimple(map, prefix + "ClusterAuditStatus", this.ClusterAuditStatus);
        this.setParamSimple(map, prefix + "ClusterAuditFailedInfo", this.ClusterAuditFailedInfo);
        this.setParamSimple(map, prefix + "OwnerName", this.OwnerName);

    }
}

