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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClusterInfoItem extends AbstractModel {

    /**
    * <p>集群id</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>集群ca证书md5值</p>
    */
    @SerializedName("ClusterCAMD5")
    @Expose
    private String ClusterCAMD5;

    /**
    * <p>集群名字</p>
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * <p>集群版本</p>
    */
    @SerializedName("ClusterVersion")
    @Expose
    private String ClusterVersion;

    /**
    * <p>集群操作系统</p>
    */
    @SerializedName("ClusterOs")
    @Expose
    private String ClusterOs;

    /**
    * <p>集群类型</p>
    */
    @SerializedName("ClusterType")
    @Expose
    private String ClusterType;

    /**
    * <p>集群节点数</p>
    */
    @SerializedName("ClusterNodeNum")
    @Expose
    private Long ClusterNodeNum;

    /**
    * <p>集群区域</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>防护状态:<br>已防护: Defended<br>未防护: UnDefended<br>部分防护: PartDefened</p>
    */
    @SerializedName("DefenderStatus")
    @Expose
    private String DefenderStatus;

    /**
    * <p>集群状态</p>
    */
    @SerializedName("ClusterStatus")
    @Expose
    private String ClusterStatus;

    /**
    * <p>集群运行子状态</p>
    */
    @SerializedName("ClusterSubStatus")
    @Expose
    private String ClusterSubStatus;

    /**
    * <p>集群的检测模式，为Cluster_Normal或者Cluster_Actived.</p>
    */
    @SerializedName("ClusterCheckMode")
    @Expose
    private String ClusterCheckMode;

    /**
    * <p>是否自动定期检测</p>
    */
    @SerializedName("ClusterAutoCheck")
    @Expose
    private Boolean ClusterAutoCheck;

    /**
    * <p>防护容器部署失败原因，为UserDaemonSetNotReady时,和UnreadyNodeNum转成&quot;N个节点防御容器为就绪&quot;，其他错误直接展示</p>
    */
    @SerializedName("DefenderErrorReason")
    @Expose
    private String DefenderErrorReason;

    /**
    * <p>防御容器没有ready状态的节点数量</p>
    */
    @SerializedName("UnreadyNodeNum")
    @Expose
    private Long UnreadyNodeNum;

    /**
    * <p>严重风险检查项的数量</p>
    */
    @SerializedName("SeriousRiskCount")
    @Expose
    private Long SeriousRiskCount;

    /**
    * <p>高风险检查项的数量</p>
    */
    @SerializedName("HighRiskCount")
    @Expose
    private Long HighRiskCount;

    /**
    * <p>中风险检查项的数量</p>
    */
    @SerializedName("MiddleRiskCount")
    @Expose
    private Long MiddleRiskCount;

    /**
    * <p>提示风险检查项的数量</p>
    */
    @SerializedName("HintRiskCount")
    @Expose
    private Long HintRiskCount;

    /**
    * <p>检查失败原因</p>
    */
    @SerializedName("CheckFailReason")
    @Expose
    private String CheckFailReason;

    /**
    * <p>检查状态,为Task_Running, NoRisk, HasRisk, Uncheck, Task_Error</p>
    */
    @SerializedName("CheckStatus")
    @Expose
    private String CheckStatus;

    /**
    * <p>任务创建时间,检查时间</p>
    */
    @SerializedName("TaskCreateTime")
    @Expose
    private String TaskCreateTime;

    /**
    * <p>接入状态:<br>未接入: AccessedNone<br>已防护: AccessedDefended<br>未防护: AccessedInstalled<br>部分防护: AccessedPartialDefence<br>接入异常: AccessedException<br>卸载异常: AccessedUninstallException<br>接入中: AccessedInstalling<br>卸载中: AccessedUninstalling</p>
    */
    @SerializedName("AccessedStatus")
    @Expose
    private String AccessedStatus;

    /**
    * <p>接入失败原因</p>
    */
    @SerializedName("AccessedSubStatus")
    @Expose
    private String AccessedSubStatus;

    /**
    * <p>接入/卸载失败原因</p>
    */
    @SerializedName("AccessedErrorReason")
    @Expose
    private String AccessedErrorReason;

    /**
    * <p>节点总数</p>
    */
    @SerializedName("NodeCount")
    @Expose
    private Long NodeCount;

    /**
    * <p>离线节点数</p>
    */
    @SerializedName("OffLineNodeCount")
    @Expose
    private Long OffLineNodeCount;

    /**
    * <p>未安装agent节点数</p>
    */
    @SerializedName("UnInstallAgentNodeCount")
    @Expose
    private Long UnInstallAgentNodeCount;

    /**
    * <p>计费核数(弹性计费核数+普通计费核数)</p>
    */
    @SerializedName("ChargeCoresCnt")
    @Expose
    private Long ChargeCoresCnt;

    /**
    * <p>master 地址列表</p>
    */
    @SerializedName("MasterAddresses")
    @Expose
    private String [] MasterAddresses;

    /**
    * <p>核数</p>
    */
    @SerializedName("CoresCnt")
    @Expose
    private Long CoresCnt;

    /**
    * <p>集群审计开关状态：<br>已关闭Closed/关闭中Closing/关闭失败CloseFailed/已开启Opened/开启中Opening/开启失败OpenFailed</p>
    */
    @SerializedName("ClusterAuditStatus")
    @Expose
    private String ClusterAuditStatus;

    /**
    * <p>集群审计开关失败信息</p>
    */
    @SerializedName("ClusterAuditFailedInfo")
    @Expose
    private String ClusterAuditFailedInfo;

    /**
    * <p>所有者名称</p>
    */
    @SerializedName("OwnerName")
    @Expose
    private String OwnerName;

    /**
     * Get <p>集群id</p> 
     * @return ClusterId <p>集群id</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>集群id</p>
     * @param ClusterId <p>集群id</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>集群ca证书md5值</p> 
     * @return ClusterCAMD5 <p>集群ca证书md5值</p>
     */
    public String getClusterCAMD5() {
        return this.ClusterCAMD5;
    }

    /**
     * Set <p>集群ca证书md5值</p>
     * @param ClusterCAMD5 <p>集群ca证书md5值</p>
     */
    public void setClusterCAMD5(String ClusterCAMD5) {
        this.ClusterCAMD5 = ClusterCAMD5;
    }

    /**
     * Get <p>集群名字</p> 
     * @return ClusterName <p>集群名字</p>
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set <p>集群名字</p>
     * @param ClusterName <p>集群名字</p>
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get <p>集群版本</p> 
     * @return ClusterVersion <p>集群版本</p>
     */
    public String getClusterVersion() {
        return this.ClusterVersion;
    }

    /**
     * Set <p>集群版本</p>
     * @param ClusterVersion <p>集群版本</p>
     */
    public void setClusterVersion(String ClusterVersion) {
        this.ClusterVersion = ClusterVersion;
    }

    /**
     * Get <p>集群操作系统</p> 
     * @return ClusterOs <p>集群操作系统</p>
     */
    public String getClusterOs() {
        return this.ClusterOs;
    }

    /**
     * Set <p>集群操作系统</p>
     * @param ClusterOs <p>集群操作系统</p>
     */
    public void setClusterOs(String ClusterOs) {
        this.ClusterOs = ClusterOs;
    }

    /**
     * Get <p>集群类型</p> 
     * @return ClusterType <p>集群类型</p>
     */
    public String getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set <p>集群类型</p>
     * @param ClusterType <p>集群类型</p>
     */
    public void setClusterType(String ClusterType) {
        this.ClusterType = ClusterType;
    }

    /**
     * Get <p>集群节点数</p> 
     * @return ClusterNodeNum <p>集群节点数</p>
     */
    public Long getClusterNodeNum() {
        return this.ClusterNodeNum;
    }

    /**
     * Set <p>集群节点数</p>
     * @param ClusterNodeNum <p>集群节点数</p>
     */
    public void setClusterNodeNum(Long ClusterNodeNum) {
        this.ClusterNodeNum = ClusterNodeNum;
    }

    /**
     * Get <p>集群区域</p> 
     * @return Region <p>集群区域</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>集群区域</p>
     * @param Region <p>集群区域</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>防护状态:<br>已防护: Defended<br>未防护: UnDefended<br>部分防护: PartDefened</p> 
     * @return DefenderStatus <p>防护状态:<br>已防护: Defended<br>未防护: UnDefended<br>部分防护: PartDefened</p>
     */
    public String getDefenderStatus() {
        return this.DefenderStatus;
    }

    /**
     * Set <p>防护状态:<br>已防护: Defended<br>未防护: UnDefended<br>部分防护: PartDefened</p>
     * @param DefenderStatus <p>防护状态:<br>已防护: Defended<br>未防护: UnDefended<br>部分防护: PartDefened</p>
     */
    public void setDefenderStatus(String DefenderStatus) {
        this.DefenderStatus = DefenderStatus;
    }

    /**
     * Get <p>集群状态</p> 
     * @return ClusterStatus <p>集群状态</p>
     */
    public String getClusterStatus() {
        return this.ClusterStatus;
    }

    /**
     * Set <p>集群状态</p>
     * @param ClusterStatus <p>集群状态</p>
     */
    public void setClusterStatus(String ClusterStatus) {
        this.ClusterStatus = ClusterStatus;
    }

    /**
     * Get <p>集群运行子状态</p> 
     * @return ClusterSubStatus <p>集群运行子状态</p>
     */
    public String getClusterSubStatus() {
        return this.ClusterSubStatus;
    }

    /**
     * Set <p>集群运行子状态</p>
     * @param ClusterSubStatus <p>集群运行子状态</p>
     */
    public void setClusterSubStatus(String ClusterSubStatus) {
        this.ClusterSubStatus = ClusterSubStatus;
    }

    /**
     * Get <p>集群的检测模式，为Cluster_Normal或者Cluster_Actived.</p> 
     * @return ClusterCheckMode <p>集群的检测模式，为Cluster_Normal或者Cluster_Actived.</p>
     */
    public String getClusterCheckMode() {
        return this.ClusterCheckMode;
    }

    /**
     * Set <p>集群的检测模式，为Cluster_Normal或者Cluster_Actived.</p>
     * @param ClusterCheckMode <p>集群的检测模式，为Cluster_Normal或者Cluster_Actived.</p>
     */
    public void setClusterCheckMode(String ClusterCheckMode) {
        this.ClusterCheckMode = ClusterCheckMode;
    }

    /**
     * Get <p>是否自动定期检测</p> 
     * @return ClusterAutoCheck <p>是否自动定期检测</p>
     */
    public Boolean getClusterAutoCheck() {
        return this.ClusterAutoCheck;
    }

    /**
     * Set <p>是否自动定期检测</p>
     * @param ClusterAutoCheck <p>是否自动定期检测</p>
     */
    public void setClusterAutoCheck(Boolean ClusterAutoCheck) {
        this.ClusterAutoCheck = ClusterAutoCheck;
    }

    /**
     * Get <p>防护容器部署失败原因，为UserDaemonSetNotReady时,和UnreadyNodeNum转成&quot;N个节点防御容器为就绪&quot;，其他错误直接展示</p> 
     * @return DefenderErrorReason <p>防护容器部署失败原因，为UserDaemonSetNotReady时,和UnreadyNodeNum转成&quot;N个节点防御容器为就绪&quot;，其他错误直接展示</p>
     */
    public String getDefenderErrorReason() {
        return this.DefenderErrorReason;
    }

    /**
     * Set <p>防护容器部署失败原因，为UserDaemonSetNotReady时,和UnreadyNodeNum转成&quot;N个节点防御容器为就绪&quot;，其他错误直接展示</p>
     * @param DefenderErrorReason <p>防护容器部署失败原因，为UserDaemonSetNotReady时,和UnreadyNodeNum转成&quot;N个节点防御容器为就绪&quot;，其他错误直接展示</p>
     */
    public void setDefenderErrorReason(String DefenderErrorReason) {
        this.DefenderErrorReason = DefenderErrorReason;
    }

    /**
     * Get <p>防御容器没有ready状态的节点数量</p> 
     * @return UnreadyNodeNum <p>防御容器没有ready状态的节点数量</p>
     */
    public Long getUnreadyNodeNum() {
        return this.UnreadyNodeNum;
    }

    /**
     * Set <p>防御容器没有ready状态的节点数量</p>
     * @param UnreadyNodeNum <p>防御容器没有ready状态的节点数量</p>
     */
    public void setUnreadyNodeNum(Long UnreadyNodeNum) {
        this.UnreadyNodeNum = UnreadyNodeNum;
    }

    /**
     * Get <p>严重风险检查项的数量</p> 
     * @return SeriousRiskCount <p>严重风险检查项的数量</p>
     */
    public Long getSeriousRiskCount() {
        return this.SeriousRiskCount;
    }

    /**
     * Set <p>严重风险检查项的数量</p>
     * @param SeriousRiskCount <p>严重风险检查项的数量</p>
     */
    public void setSeriousRiskCount(Long SeriousRiskCount) {
        this.SeriousRiskCount = SeriousRiskCount;
    }

    /**
     * Get <p>高风险检查项的数量</p> 
     * @return HighRiskCount <p>高风险检查项的数量</p>
     */
    public Long getHighRiskCount() {
        return this.HighRiskCount;
    }

    /**
     * Set <p>高风险检查项的数量</p>
     * @param HighRiskCount <p>高风险检查项的数量</p>
     */
    public void setHighRiskCount(Long HighRiskCount) {
        this.HighRiskCount = HighRiskCount;
    }

    /**
     * Get <p>中风险检查项的数量</p> 
     * @return MiddleRiskCount <p>中风险检查项的数量</p>
     */
    public Long getMiddleRiskCount() {
        return this.MiddleRiskCount;
    }

    /**
     * Set <p>中风险检查项的数量</p>
     * @param MiddleRiskCount <p>中风险检查项的数量</p>
     */
    public void setMiddleRiskCount(Long MiddleRiskCount) {
        this.MiddleRiskCount = MiddleRiskCount;
    }

    /**
     * Get <p>提示风险检查项的数量</p> 
     * @return HintRiskCount <p>提示风险检查项的数量</p>
     */
    public Long getHintRiskCount() {
        return this.HintRiskCount;
    }

    /**
     * Set <p>提示风险检查项的数量</p>
     * @param HintRiskCount <p>提示风险检查项的数量</p>
     */
    public void setHintRiskCount(Long HintRiskCount) {
        this.HintRiskCount = HintRiskCount;
    }

    /**
     * Get <p>检查失败原因</p> 
     * @return CheckFailReason <p>检查失败原因</p>
     */
    public String getCheckFailReason() {
        return this.CheckFailReason;
    }

    /**
     * Set <p>检查失败原因</p>
     * @param CheckFailReason <p>检查失败原因</p>
     */
    public void setCheckFailReason(String CheckFailReason) {
        this.CheckFailReason = CheckFailReason;
    }

    /**
     * Get <p>检查状态,为Task_Running, NoRisk, HasRisk, Uncheck, Task_Error</p> 
     * @return CheckStatus <p>检查状态,为Task_Running, NoRisk, HasRisk, Uncheck, Task_Error</p>
     */
    public String getCheckStatus() {
        return this.CheckStatus;
    }

    /**
     * Set <p>检查状态,为Task_Running, NoRisk, HasRisk, Uncheck, Task_Error</p>
     * @param CheckStatus <p>检查状态,为Task_Running, NoRisk, HasRisk, Uncheck, Task_Error</p>
     */
    public void setCheckStatus(String CheckStatus) {
        this.CheckStatus = CheckStatus;
    }

    /**
     * Get <p>任务创建时间,检查时间</p> 
     * @return TaskCreateTime <p>任务创建时间,检查时间</p>
     */
    public String getTaskCreateTime() {
        return this.TaskCreateTime;
    }

    /**
     * Set <p>任务创建时间,检查时间</p>
     * @param TaskCreateTime <p>任务创建时间,检查时间</p>
     */
    public void setTaskCreateTime(String TaskCreateTime) {
        this.TaskCreateTime = TaskCreateTime;
    }

    /**
     * Get <p>接入状态:<br>未接入: AccessedNone<br>已防护: AccessedDefended<br>未防护: AccessedInstalled<br>部分防护: AccessedPartialDefence<br>接入异常: AccessedException<br>卸载异常: AccessedUninstallException<br>接入中: AccessedInstalling<br>卸载中: AccessedUninstalling</p> 
     * @return AccessedStatus <p>接入状态:<br>未接入: AccessedNone<br>已防护: AccessedDefended<br>未防护: AccessedInstalled<br>部分防护: AccessedPartialDefence<br>接入异常: AccessedException<br>卸载异常: AccessedUninstallException<br>接入中: AccessedInstalling<br>卸载中: AccessedUninstalling</p>
     */
    public String getAccessedStatus() {
        return this.AccessedStatus;
    }

    /**
     * Set <p>接入状态:<br>未接入: AccessedNone<br>已防护: AccessedDefended<br>未防护: AccessedInstalled<br>部分防护: AccessedPartialDefence<br>接入异常: AccessedException<br>卸载异常: AccessedUninstallException<br>接入中: AccessedInstalling<br>卸载中: AccessedUninstalling</p>
     * @param AccessedStatus <p>接入状态:<br>未接入: AccessedNone<br>已防护: AccessedDefended<br>未防护: AccessedInstalled<br>部分防护: AccessedPartialDefence<br>接入异常: AccessedException<br>卸载异常: AccessedUninstallException<br>接入中: AccessedInstalling<br>卸载中: AccessedUninstalling</p>
     */
    public void setAccessedStatus(String AccessedStatus) {
        this.AccessedStatus = AccessedStatus;
    }

    /**
     * Get <p>接入失败原因</p> 
     * @return AccessedSubStatus <p>接入失败原因</p>
     */
    public String getAccessedSubStatus() {
        return this.AccessedSubStatus;
    }

    /**
     * Set <p>接入失败原因</p>
     * @param AccessedSubStatus <p>接入失败原因</p>
     */
    public void setAccessedSubStatus(String AccessedSubStatus) {
        this.AccessedSubStatus = AccessedSubStatus;
    }

    /**
     * Get <p>接入/卸载失败原因</p> 
     * @return AccessedErrorReason <p>接入/卸载失败原因</p>
     */
    public String getAccessedErrorReason() {
        return this.AccessedErrorReason;
    }

    /**
     * Set <p>接入/卸载失败原因</p>
     * @param AccessedErrorReason <p>接入/卸载失败原因</p>
     */
    public void setAccessedErrorReason(String AccessedErrorReason) {
        this.AccessedErrorReason = AccessedErrorReason;
    }

    /**
     * Get <p>节点总数</p> 
     * @return NodeCount <p>节点总数</p>
     */
    public Long getNodeCount() {
        return this.NodeCount;
    }

    /**
     * Set <p>节点总数</p>
     * @param NodeCount <p>节点总数</p>
     */
    public void setNodeCount(Long NodeCount) {
        this.NodeCount = NodeCount;
    }

    /**
     * Get <p>离线节点数</p> 
     * @return OffLineNodeCount <p>离线节点数</p>
     */
    public Long getOffLineNodeCount() {
        return this.OffLineNodeCount;
    }

    /**
     * Set <p>离线节点数</p>
     * @param OffLineNodeCount <p>离线节点数</p>
     */
    public void setOffLineNodeCount(Long OffLineNodeCount) {
        this.OffLineNodeCount = OffLineNodeCount;
    }

    /**
     * Get <p>未安装agent节点数</p> 
     * @return UnInstallAgentNodeCount <p>未安装agent节点数</p>
     */
    public Long getUnInstallAgentNodeCount() {
        return this.UnInstallAgentNodeCount;
    }

    /**
     * Set <p>未安装agent节点数</p>
     * @param UnInstallAgentNodeCount <p>未安装agent节点数</p>
     */
    public void setUnInstallAgentNodeCount(Long UnInstallAgentNodeCount) {
        this.UnInstallAgentNodeCount = UnInstallAgentNodeCount;
    }

    /**
     * Get <p>计费核数(弹性计费核数+普通计费核数)</p> 
     * @return ChargeCoresCnt <p>计费核数(弹性计费核数+普通计费核数)</p>
     */
    public Long getChargeCoresCnt() {
        return this.ChargeCoresCnt;
    }

    /**
     * Set <p>计费核数(弹性计费核数+普通计费核数)</p>
     * @param ChargeCoresCnt <p>计费核数(弹性计费核数+普通计费核数)</p>
     */
    public void setChargeCoresCnt(Long ChargeCoresCnt) {
        this.ChargeCoresCnt = ChargeCoresCnt;
    }

    /**
     * Get <p>master 地址列表</p> 
     * @return MasterAddresses <p>master 地址列表</p>
     */
    public String [] getMasterAddresses() {
        return this.MasterAddresses;
    }

    /**
     * Set <p>master 地址列表</p>
     * @param MasterAddresses <p>master 地址列表</p>
     */
    public void setMasterAddresses(String [] MasterAddresses) {
        this.MasterAddresses = MasterAddresses;
    }

    /**
     * Get <p>核数</p> 
     * @return CoresCnt <p>核数</p>
     */
    public Long getCoresCnt() {
        return this.CoresCnt;
    }

    /**
     * Set <p>核数</p>
     * @param CoresCnt <p>核数</p>
     */
    public void setCoresCnt(Long CoresCnt) {
        this.CoresCnt = CoresCnt;
    }

    /**
     * Get <p>集群审计开关状态：<br>已关闭Closed/关闭中Closing/关闭失败CloseFailed/已开启Opened/开启中Opening/开启失败OpenFailed</p> 
     * @return ClusterAuditStatus <p>集群审计开关状态：<br>已关闭Closed/关闭中Closing/关闭失败CloseFailed/已开启Opened/开启中Opening/开启失败OpenFailed</p>
     */
    public String getClusterAuditStatus() {
        return this.ClusterAuditStatus;
    }

    /**
     * Set <p>集群审计开关状态：<br>已关闭Closed/关闭中Closing/关闭失败CloseFailed/已开启Opened/开启中Opening/开启失败OpenFailed</p>
     * @param ClusterAuditStatus <p>集群审计开关状态：<br>已关闭Closed/关闭中Closing/关闭失败CloseFailed/已开启Opened/开启中Opening/开启失败OpenFailed</p>
     */
    public void setClusterAuditStatus(String ClusterAuditStatus) {
        this.ClusterAuditStatus = ClusterAuditStatus;
    }

    /**
     * Get <p>集群审计开关失败信息</p> 
     * @return ClusterAuditFailedInfo <p>集群审计开关失败信息</p>
     */
    public String getClusterAuditFailedInfo() {
        return this.ClusterAuditFailedInfo;
    }

    /**
     * Set <p>集群审计开关失败信息</p>
     * @param ClusterAuditFailedInfo <p>集群审计开关失败信息</p>
     */
    public void setClusterAuditFailedInfo(String ClusterAuditFailedInfo) {
        this.ClusterAuditFailedInfo = ClusterAuditFailedInfo;
    }

    /**
     * Get <p>所有者名称</p> 
     * @return OwnerName <p>所有者名称</p>
     */
    public String getOwnerName() {
        return this.OwnerName;
    }

    /**
     * Set <p>所有者名称</p>
     * @param OwnerName <p>所有者名称</p>
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
        if (source.ClusterCAMD5 != null) {
            this.ClusterCAMD5 = new String(source.ClusterCAMD5);
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
        if (source.AccessedErrorReason != null) {
            this.AccessedErrorReason = new String(source.AccessedErrorReason);
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
        this.setParamSimple(map, prefix + "ClusterCAMD5", this.ClusterCAMD5);
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
        this.setParamSimple(map, prefix + "AccessedErrorReason", this.AccessedErrorReason);
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

