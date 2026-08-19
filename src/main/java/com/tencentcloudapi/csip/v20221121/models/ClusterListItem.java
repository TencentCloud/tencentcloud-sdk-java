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

public class ClusterListItem extends AbstractModel {

    /**
    * <p>appid</p>
    */
    @SerializedName("AppID")
    @Expose
    private Long AppID;

    /**
    * <p>资产id</p>
    */
    @SerializedName("AssetId")
    @Expose
    private String AssetId;

    /**
    * <p>集群id</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>集群名称</p>
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * <p>集群类型<br>MANAGED_CLUSTER: 托管集群</p>
    */
    @SerializedName("ClusterType")
    @Expose
    private String ClusterType;

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
    * <p>节点总数</p>
    */
    @SerializedName("NodeCount")
    @Expose
    private Long NodeCount;

    /**
    * <p>离线节点总数</p>
    */
    @SerializedName("OfflineNodeCount")
    @Expose
    private Long OfflineNodeCount;

    /**
    * <p>未安装节点总数</p>
    */
    @SerializedName("UninstallNodeCount")
    @Expose
    private Long UninstallNodeCount;

    /**
    * <p>总核数</p>
    */
    @SerializedName("TotalCoresCount")
    @Expose
    private Long TotalCoresCount;

    /**
    * <p>已防护核数</p>
    */
    @SerializedName("DefendCoresCount")
    @Expose
    private Long DefendCoresCount;

    /**
    * <p>审计日志开关<br>(0:关闭 1:开启 2:开启失败 3:关闭失败)</p>
    */
    @SerializedName("AuditLogSwitchStatus")
    @Expose
    private Long AuditLogSwitchStatus;

    /**
    * <p>防护状态<br>已防护: Defended</p>
    */
    @SerializedName("DefendStatus")
    @Expose
    private String DefendStatus;

    /**
    * <p>集群状态</p>
    */
    @SerializedName("RunStatus")
    @Expose
    private String RunStatus;

    /**
    * <p>地域</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>k8s版本</p>
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * <p>最近资产同步时间</p>
    */
    @SerializedName("LastAssetSyncTime")
    @Expose
    private String LastAssetSyncTime;

    /**
    * <p>最近风险检查时间</p>
    */
    @SerializedName("LastRiskCheckTime")
    @Expose
    private String LastRiskCheckTime;

    /**
    * <p>风险状态</p>
    */
    @SerializedName("RiskStatus")
    @Expose
    private String RiskStatus;

    /**
    * <p>标签列表</p>
    */
    @SerializedName("Tags")
    @Expose
    private AssetTag [] Tags;

    /**
    * <p>负责人名称</p>
    */
    @SerializedName("OwnerName")
    @Expose
    private String OwnerName;

    /**
    * <p>失败原因</p>
    */
    @SerializedName("FailMessage")
    @Expose
    private String FailMessage;

    /**
    * <p>运行子状态</p>
    */
    @SerializedName("RunSubStatus")
    @Expose
    private String RunSubStatus;

    /**
    * <p>集群接入状态</p><p>枚举值：</p><ul><li>AccessedNone： 未接入</li><li>AccessedInstalling： 接入中</li><li>AccessedInstalled： 已接入-未防护</li><li>AccessedUninstalling： 卸载中</li><li>AccessedUninstallException： 卸载异常</li><li>AccessedDefended： 已接入-已防护</li><li>AccessedPartialDefence： 已接入-部分防护</li><li>AccessedException： 接入异常</li></ul>
    */
    @SerializedName("AccessedStatus")
    @Expose
    private String AccessedStatus;

    /**
    * <p>接入子状态</p>
    */
    @SerializedName("AccessedSubStatus")
    @Expose
    private String AccessedSubStatus;

    /**
    * <p>集群ca证书md5值，集群唯一标识</p>
    */
    @SerializedName("ClusterCaMD5")
    @Expose
    private String ClusterCaMD5;

    /**
    * <p>资产同步状态</p><p>枚举值：</p><ul><li>AssetCheckNone： 初始状态</li><li>AssetCheckSync： 同步中</li><li>AssetCheckFinished： 同步完成</li><li>AssetCheckFailed： 同步失败</li></ul>
    */
    @SerializedName("AssetSyncStatus")
    @Expose
    private String AssetSyncStatus;

    /**
    * <p>集群配置风险数量</p>
    */
    @SerializedName("RiskConfigCount")
    @Expose
    private Long RiskConfigCount;

    /**
    * <p>集群接入失败原因</p>
    */
    @SerializedName("AccessFailedMessage")
    @Expose
    private String AccessFailedMessage;

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
    * <p>未绑定旗舰版的节点数量</p>
    */
    @SerializedName("UnboundUltimateNodeCount")
    @Expose
    private Long UnboundUltimateNodeCount;

    /**
     * Get <p>appid</p> 
     * @return AppID <p>appid</p>
     */
    public Long getAppID() {
        return this.AppID;
    }

    /**
     * Set <p>appid</p>
     * @param AppID <p>appid</p>
     */
    public void setAppID(Long AppID) {
        this.AppID = AppID;
    }

    /**
     * Get <p>资产id</p> 
     * @return AssetId <p>资产id</p>
     * @deprecated
     */
    @Deprecated
    public String getAssetId() {
        return this.AssetId;
    }

    /**
     * Set <p>资产id</p>
     * @param AssetId <p>资产id</p>
     * @deprecated
     */
    @Deprecated
    public void setAssetId(String AssetId) {
        this.AssetId = AssetId;
    }

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
     * Get <p>集群名称</p> 
     * @return ClusterName <p>集群名称</p>
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set <p>集群名称</p>
     * @param ClusterName <p>集群名称</p>
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get <p>集群类型<br>MANAGED_CLUSTER: 托管集群</p> 
     * @return ClusterType <p>集群类型<br>MANAGED_CLUSTER: 托管集群</p>
     */
    public String getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set <p>集群类型<br>MANAGED_CLUSTER: 托管集群</p>
     * @param ClusterType <p>集群类型<br>MANAGED_CLUSTER: 托管集群</p>
     */
    public void setClusterType(String ClusterType) {
        this.ClusterType = ClusterType;
    }

    /**
     * Get <p>严重告警事件数</p> 
     * @return AlarmEventCriticalCount <p>严重告警事件数</p>
     * @deprecated
     */
    @Deprecated
    public Long getAlarmEventCriticalCount() {
        return this.AlarmEventCriticalCount;
    }

    /**
     * Set <p>严重告警事件数</p>
     * @param AlarmEventCriticalCount <p>严重告警事件数</p>
     * @deprecated
     */
    @Deprecated
    public void setAlarmEventCriticalCount(Long AlarmEventCriticalCount) {
        this.AlarmEventCriticalCount = AlarmEventCriticalCount;
    }

    /**
     * Get <p>高危告警事件数</p> 
     * @return AlarmEventHighCount <p>高危告警事件数</p>
     * @deprecated
     */
    @Deprecated
    public Long getAlarmEventHighCount() {
        return this.AlarmEventHighCount;
    }

    /**
     * Set <p>高危告警事件数</p>
     * @param AlarmEventHighCount <p>高危告警事件数</p>
     * @deprecated
     */
    @Deprecated
    public void setAlarmEventHighCount(Long AlarmEventHighCount) {
        this.AlarmEventHighCount = AlarmEventHighCount;
    }

    /**
     * Get <p>中危告警事件数</p> 
     * @return AlarmEventMiddleCount <p>中危告警事件数</p>
     * @deprecated
     */
    @Deprecated
    public Long getAlarmEventMiddleCount() {
        return this.AlarmEventMiddleCount;
    }

    /**
     * Set <p>中危告警事件数</p>
     * @param AlarmEventMiddleCount <p>中危告警事件数</p>
     * @deprecated
     */
    @Deprecated
    public void setAlarmEventMiddleCount(Long AlarmEventMiddleCount) {
        this.AlarmEventMiddleCount = AlarmEventMiddleCount;
    }

    /**
     * Get <p>低危告警事件数</p> 
     * @return AlarmEventLowCount <p>低危告警事件数</p>
     * @deprecated
     */
    @Deprecated
    public Long getAlarmEventLowCount() {
        return this.AlarmEventLowCount;
    }

    /**
     * Set <p>低危告警事件数</p>
     * @param AlarmEventLowCount <p>低危告警事件数</p>
     * @deprecated
     */
    @Deprecated
    public void setAlarmEventLowCount(Long AlarmEventLowCount) {
        this.AlarmEventLowCount = AlarmEventLowCount;
    }

    /**
     * Get <p>严重风险事件数</p> 
     * @return RiskEventCriticalCount <p>严重风险事件数</p>
     * @deprecated
     */
    @Deprecated
    public Long getRiskEventCriticalCount() {
        return this.RiskEventCriticalCount;
    }

    /**
     * Set <p>严重风险事件数</p>
     * @param RiskEventCriticalCount <p>严重风险事件数</p>
     * @deprecated
     */
    @Deprecated
    public void setRiskEventCriticalCount(Long RiskEventCriticalCount) {
        this.RiskEventCriticalCount = RiskEventCriticalCount;
    }

    /**
     * Get <p>高危风险事件数</p> 
     * @return RiskEventHighCount <p>高危风险事件数</p>
     * @deprecated
     */
    @Deprecated
    public Long getRiskEventHighCount() {
        return this.RiskEventHighCount;
    }

    /**
     * Set <p>高危风险事件数</p>
     * @param RiskEventHighCount <p>高危风险事件数</p>
     * @deprecated
     */
    @Deprecated
    public void setRiskEventHighCount(Long RiskEventHighCount) {
        this.RiskEventHighCount = RiskEventHighCount;
    }

    /**
     * Get <p>中危风险事件数</p> 
     * @return RiskEventMiddleCount <p>中危风险事件数</p>
     * @deprecated
     */
    @Deprecated
    public Long getRiskEventMiddleCount() {
        return this.RiskEventMiddleCount;
    }

    /**
     * Set <p>中危风险事件数</p>
     * @param RiskEventMiddleCount <p>中危风险事件数</p>
     * @deprecated
     */
    @Deprecated
    public void setRiskEventMiddleCount(Long RiskEventMiddleCount) {
        this.RiskEventMiddleCount = RiskEventMiddleCount;
    }

    /**
     * Get <p>低危风险事件数</p> 
     * @return RiskEventLowCount <p>低危风险事件数</p>
     * @deprecated
     */
    @Deprecated
    public Long getRiskEventLowCount() {
        return this.RiskEventLowCount;
    }

    /**
     * Set <p>低危风险事件数</p>
     * @param RiskEventLowCount <p>低危风险事件数</p>
     * @deprecated
     */
    @Deprecated
    public void setRiskEventLowCount(Long RiskEventLowCount) {
        this.RiskEventLowCount = RiskEventLowCount;
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
     * Get <p>离线节点总数</p> 
     * @return OfflineNodeCount <p>离线节点总数</p>
     */
    public Long getOfflineNodeCount() {
        return this.OfflineNodeCount;
    }

    /**
     * Set <p>离线节点总数</p>
     * @param OfflineNodeCount <p>离线节点总数</p>
     */
    public void setOfflineNodeCount(Long OfflineNodeCount) {
        this.OfflineNodeCount = OfflineNodeCount;
    }

    /**
     * Get <p>未安装节点总数</p> 
     * @return UninstallNodeCount <p>未安装节点总数</p>
     */
    public Long getUninstallNodeCount() {
        return this.UninstallNodeCount;
    }

    /**
     * Set <p>未安装节点总数</p>
     * @param UninstallNodeCount <p>未安装节点总数</p>
     */
    public void setUninstallNodeCount(Long UninstallNodeCount) {
        this.UninstallNodeCount = UninstallNodeCount;
    }

    /**
     * Get <p>总核数</p> 
     * @return TotalCoresCount <p>总核数</p>
     */
    public Long getTotalCoresCount() {
        return this.TotalCoresCount;
    }

    /**
     * Set <p>总核数</p>
     * @param TotalCoresCount <p>总核数</p>
     */
    public void setTotalCoresCount(Long TotalCoresCount) {
        this.TotalCoresCount = TotalCoresCount;
    }

    /**
     * Get <p>已防护核数</p> 
     * @return DefendCoresCount <p>已防护核数</p>
     * @deprecated
     */
    @Deprecated
    public Long getDefendCoresCount() {
        return this.DefendCoresCount;
    }

    /**
     * Set <p>已防护核数</p>
     * @param DefendCoresCount <p>已防护核数</p>
     * @deprecated
     */
    @Deprecated
    public void setDefendCoresCount(Long DefendCoresCount) {
        this.DefendCoresCount = DefendCoresCount;
    }

    /**
     * Get <p>审计日志开关<br>(0:关闭 1:开启 2:开启失败 3:关闭失败)</p> 
     * @return AuditLogSwitchStatus <p>审计日志开关<br>(0:关闭 1:开启 2:开启失败 3:关闭失败)</p>
     */
    public Long getAuditLogSwitchStatus() {
        return this.AuditLogSwitchStatus;
    }

    /**
     * Set <p>审计日志开关<br>(0:关闭 1:开启 2:开启失败 3:关闭失败)</p>
     * @param AuditLogSwitchStatus <p>审计日志开关<br>(0:关闭 1:开启 2:开启失败 3:关闭失败)</p>
     */
    public void setAuditLogSwitchStatus(Long AuditLogSwitchStatus) {
        this.AuditLogSwitchStatus = AuditLogSwitchStatus;
    }

    /**
     * Get <p>防护状态<br>已防护: Defended</p> 
     * @return DefendStatus <p>防护状态<br>已防护: Defended</p>
     */
    public String getDefendStatus() {
        return this.DefendStatus;
    }

    /**
     * Set <p>防护状态<br>已防护: Defended</p>
     * @param DefendStatus <p>防护状态<br>已防护: Defended</p>
     */
    public void setDefendStatus(String DefendStatus) {
        this.DefendStatus = DefendStatus;
    }

    /**
     * Get <p>集群状态</p> 
     * @return RunStatus <p>集群状态</p>
     */
    public String getRunStatus() {
        return this.RunStatus;
    }

    /**
     * Set <p>集群状态</p>
     * @param RunStatus <p>集群状态</p>
     */
    public void setRunStatus(String RunStatus) {
        this.RunStatus = RunStatus;
    }

    /**
     * Get <p>地域</p> 
     * @return Region <p>地域</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>地域</p>
     * @param Region <p>地域</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>k8s版本</p> 
     * @return Version <p>k8s版本</p>
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set <p>k8s版本</p>
     * @param Version <p>k8s版本</p>
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get <p>最近资产同步时间</p> 
     * @return LastAssetSyncTime <p>最近资产同步时间</p>
     */
    public String getLastAssetSyncTime() {
        return this.LastAssetSyncTime;
    }

    /**
     * Set <p>最近资产同步时间</p>
     * @param LastAssetSyncTime <p>最近资产同步时间</p>
     */
    public void setLastAssetSyncTime(String LastAssetSyncTime) {
        this.LastAssetSyncTime = LastAssetSyncTime;
    }

    /**
     * Get <p>最近风险检查时间</p> 
     * @return LastRiskCheckTime <p>最近风险检查时间</p>
     */
    public String getLastRiskCheckTime() {
        return this.LastRiskCheckTime;
    }

    /**
     * Set <p>最近风险检查时间</p>
     * @param LastRiskCheckTime <p>最近风险检查时间</p>
     */
    public void setLastRiskCheckTime(String LastRiskCheckTime) {
        this.LastRiskCheckTime = LastRiskCheckTime;
    }

    /**
     * Get <p>风险状态</p> 
     * @return RiskStatus <p>风险状态</p>
     */
    public String getRiskStatus() {
        return this.RiskStatus;
    }

    /**
     * Set <p>风险状态</p>
     * @param RiskStatus <p>风险状态</p>
     */
    public void setRiskStatus(String RiskStatus) {
        this.RiskStatus = RiskStatus;
    }

    /**
     * Get <p>标签列表</p> 
     * @return Tags <p>标签列表</p>
     */
    public AssetTag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签列表</p>
     * @param Tags <p>标签列表</p>
     */
    public void setTags(AssetTag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>负责人名称</p> 
     * @return OwnerName <p>负责人名称</p>
     */
    public String getOwnerName() {
        return this.OwnerName;
    }

    /**
     * Set <p>负责人名称</p>
     * @param OwnerName <p>负责人名称</p>
     */
    public void setOwnerName(String OwnerName) {
        this.OwnerName = OwnerName;
    }

    /**
     * Get <p>失败原因</p> 
     * @return FailMessage <p>失败原因</p>
     */
    public String getFailMessage() {
        return this.FailMessage;
    }

    /**
     * Set <p>失败原因</p>
     * @param FailMessage <p>失败原因</p>
     */
    public void setFailMessage(String FailMessage) {
        this.FailMessage = FailMessage;
    }

    /**
     * Get <p>运行子状态</p> 
     * @return RunSubStatus <p>运行子状态</p>
     */
    public String getRunSubStatus() {
        return this.RunSubStatus;
    }

    /**
     * Set <p>运行子状态</p>
     * @param RunSubStatus <p>运行子状态</p>
     */
    public void setRunSubStatus(String RunSubStatus) {
        this.RunSubStatus = RunSubStatus;
    }

    /**
     * Get <p>集群接入状态</p><p>枚举值：</p><ul><li>AccessedNone： 未接入</li><li>AccessedInstalling： 接入中</li><li>AccessedInstalled： 已接入-未防护</li><li>AccessedUninstalling： 卸载中</li><li>AccessedUninstallException： 卸载异常</li><li>AccessedDefended： 已接入-已防护</li><li>AccessedPartialDefence： 已接入-部分防护</li><li>AccessedException： 接入异常</li></ul> 
     * @return AccessedStatus <p>集群接入状态</p><p>枚举值：</p><ul><li>AccessedNone： 未接入</li><li>AccessedInstalling： 接入中</li><li>AccessedInstalled： 已接入-未防护</li><li>AccessedUninstalling： 卸载中</li><li>AccessedUninstallException： 卸载异常</li><li>AccessedDefended： 已接入-已防护</li><li>AccessedPartialDefence： 已接入-部分防护</li><li>AccessedException： 接入异常</li></ul>
     */
    public String getAccessedStatus() {
        return this.AccessedStatus;
    }

    /**
     * Set <p>集群接入状态</p><p>枚举值：</p><ul><li>AccessedNone： 未接入</li><li>AccessedInstalling： 接入中</li><li>AccessedInstalled： 已接入-未防护</li><li>AccessedUninstalling： 卸载中</li><li>AccessedUninstallException： 卸载异常</li><li>AccessedDefended： 已接入-已防护</li><li>AccessedPartialDefence： 已接入-部分防护</li><li>AccessedException： 接入异常</li></ul>
     * @param AccessedStatus <p>集群接入状态</p><p>枚举值：</p><ul><li>AccessedNone： 未接入</li><li>AccessedInstalling： 接入中</li><li>AccessedInstalled： 已接入-未防护</li><li>AccessedUninstalling： 卸载中</li><li>AccessedUninstallException： 卸载异常</li><li>AccessedDefended： 已接入-已防护</li><li>AccessedPartialDefence： 已接入-部分防护</li><li>AccessedException： 接入异常</li></ul>
     */
    public void setAccessedStatus(String AccessedStatus) {
        this.AccessedStatus = AccessedStatus;
    }

    /**
     * Get <p>接入子状态</p> 
     * @return AccessedSubStatus <p>接入子状态</p>
     */
    public String getAccessedSubStatus() {
        return this.AccessedSubStatus;
    }

    /**
     * Set <p>接入子状态</p>
     * @param AccessedSubStatus <p>接入子状态</p>
     */
    public void setAccessedSubStatus(String AccessedSubStatus) {
        this.AccessedSubStatus = AccessedSubStatus;
    }

    /**
     * Get <p>集群ca证书md5值，集群唯一标识</p> 
     * @return ClusterCaMD5 <p>集群ca证书md5值，集群唯一标识</p>
     */
    public String getClusterCaMD5() {
        return this.ClusterCaMD5;
    }

    /**
     * Set <p>集群ca证书md5值，集群唯一标识</p>
     * @param ClusterCaMD5 <p>集群ca证书md5值，集群唯一标识</p>
     */
    public void setClusterCaMD5(String ClusterCaMD5) {
        this.ClusterCaMD5 = ClusterCaMD5;
    }

    /**
     * Get <p>资产同步状态</p><p>枚举值：</p><ul><li>AssetCheckNone： 初始状态</li><li>AssetCheckSync： 同步中</li><li>AssetCheckFinished： 同步完成</li><li>AssetCheckFailed： 同步失败</li></ul> 
     * @return AssetSyncStatus <p>资产同步状态</p><p>枚举值：</p><ul><li>AssetCheckNone： 初始状态</li><li>AssetCheckSync： 同步中</li><li>AssetCheckFinished： 同步完成</li><li>AssetCheckFailed： 同步失败</li></ul>
     */
    public String getAssetSyncStatus() {
        return this.AssetSyncStatus;
    }

    /**
     * Set <p>资产同步状态</p><p>枚举值：</p><ul><li>AssetCheckNone： 初始状态</li><li>AssetCheckSync： 同步中</li><li>AssetCheckFinished： 同步完成</li><li>AssetCheckFailed： 同步失败</li></ul>
     * @param AssetSyncStatus <p>资产同步状态</p><p>枚举值：</p><ul><li>AssetCheckNone： 初始状态</li><li>AssetCheckSync： 同步中</li><li>AssetCheckFinished： 同步完成</li><li>AssetCheckFailed： 同步失败</li></ul>
     */
    public void setAssetSyncStatus(String AssetSyncStatus) {
        this.AssetSyncStatus = AssetSyncStatus;
    }

    /**
     * Get <p>集群配置风险数量</p> 
     * @return RiskConfigCount <p>集群配置风险数量</p>
     * @deprecated
     */
    @Deprecated
    public Long getRiskConfigCount() {
        return this.RiskConfigCount;
    }

    /**
     * Set <p>集群配置风险数量</p>
     * @param RiskConfigCount <p>集群配置风险数量</p>
     * @deprecated
     */
    @Deprecated
    public void setRiskConfigCount(Long RiskConfigCount) {
        this.RiskConfigCount = RiskConfigCount;
    }

    /**
     * Get <p>集群接入失败原因</p> 
     * @return AccessFailedMessage <p>集群接入失败原因</p>
     * @deprecated
     */
    @Deprecated
    public String getAccessFailedMessage() {
        return this.AccessFailedMessage;
    }

    /**
     * Set <p>集群接入失败原因</p>
     * @param AccessFailedMessage <p>集群接入失败原因</p>
     * @deprecated
     */
    @Deprecated
    public void setAccessFailedMessage(String AccessFailedMessage) {
        this.AccessFailedMessage = AccessFailedMessage;
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
     * Get <p>未绑定旗舰版的节点数量</p> 
     * @return UnboundUltimateNodeCount <p>未绑定旗舰版的节点数量</p>
     */
    public Long getUnboundUltimateNodeCount() {
        return this.UnboundUltimateNodeCount;
    }

    /**
     * Set <p>未绑定旗舰版的节点数量</p>
     * @param UnboundUltimateNodeCount <p>未绑定旗舰版的节点数量</p>
     */
    public void setUnboundUltimateNodeCount(Long UnboundUltimateNodeCount) {
        this.UnboundUltimateNodeCount = UnboundUltimateNodeCount;
    }

    public ClusterListItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClusterListItem(ClusterListItem source) {
        if (source.AppID != null) {
            this.AppID = new Long(source.AppID);
        }
        if (source.AssetId != null) {
            this.AssetId = new String(source.AssetId);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.ClusterType != null) {
            this.ClusterType = new String(source.ClusterType);
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
        if (source.NodeCount != null) {
            this.NodeCount = new Long(source.NodeCount);
        }
        if (source.OfflineNodeCount != null) {
            this.OfflineNodeCount = new Long(source.OfflineNodeCount);
        }
        if (source.UninstallNodeCount != null) {
            this.UninstallNodeCount = new Long(source.UninstallNodeCount);
        }
        if (source.TotalCoresCount != null) {
            this.TotalCoresCount = new Long(source.TotalCoresCount);
        }
        if (source.DefendCoresCount != null) {
            this.DefendCoresCount = new Long(source.DefendCoresCount);
        }
        if (source.AuditLogSwitchStatus != null) {
            this.AuditLogSwitchStatus = new Long(source.AuditLogSwitchStatus);
        }
        if (source.DefendStatus != null) {
            this.DefendStatus = new String(source.DefendStatus);
        }
        if (source.RunStatus != null) {
            this.RunStatus = new String(source.RunStatus);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.LastAssetSyncTime != null) {
            this.LastAssetSyncTime = new String(source.LastAssetSyncTime);
        }
        if (source.LastRiskCheckTime != null) {
            this.LastRiskCheckTime = new String(source.LastRiskCheckTime);
        }
        if (source.RiskStatus != null) {
            this.RiskStatus = new String(source.RiskStatus);
        }
        if (source.Tags != null) {
            this.Tags = new AssetTag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new AssetTag(source.Tags[i]);
            }
        }
        if (source.OwnerName != null) {
            this.OwnerName = new String(source.OwnerName);
        }
        if (source.FailMessage != null) {
            this.FailMessage = new String(source.FailMessage);
        }
        if (source.RunSubStatus != null) {
            this.RunSubStatus = new String(source.RunSubStatus);
        }
        if (source.AccessedStatus != null) {
            this.AccessedStatus = new String(source.AccessedStatus);
        }
        if (source.AccessedSubStatus != null) {
            this.AccessedSubStatus = new String(source.AccessedSubStatus);
        }
        if (source.ClusterCaMD5 != null) {
            this.ClusterCaMD5 = new String(source.ClusterCaMD5);
        }
        if (source.AssetSyncStatus != null) {
            this.AssetSyncStatus = new String(source.AssetSyncStatus);
        }
        if (source.RiskConfigCount != null) {
            this.RiskConfigCount = new Long(source.RiskConfigCount);
        }
        if (source.AccessFailedMessage != null) {
            this.AccessFailedMessage = new String(source.AccessFailedMessage);
        }
        if (source.RegionName != null) {
            this.RegionName = new String(source.RegionName);
        }
        if (source.RegionNameEn != null) {
            this.RegionNameEn = new String(source.RegionNameEn);
        }
        if (source.UnboundUltimateNodeCount != null) {
            this.UnboundUltimateNodeCount = new Long(source.UnboundUltimateNodeCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppID", this.AppID);
        this.setParamSimple(map, prefix + "AssetId", this.AssetId);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);
        this.setParamSimple(map, prefix + "AlarmEventCriticalCount", this.AlarmEventCriticalCount);
        this.setParamSimple(map, prefix + "AlarmEventHighCount", this.AlarmEventHighCount);
        this.setParamSimple(map, prefix + "AlarmEventMiddleCount", this.AlarmEventMiddleCount);
        this.setParamSimple(map, prefix + "AlarmEventLowCount", this.AlarmEventLowCount);
        this.setParamSimple(map, prefix + "RiskEventCriticalCount", this.RiskEventCriticalCount);
        this.setParamSimple(map, prefix + "RiskEventHighCount", this.RiskEventHighCount);
        this.setParamSimple(map, prefix + "RiskEventMiddleCount", this.RiskEventMiddleCount);
        this.setParamSimple(map, prefix + "RiskEventLowCount", this.RiskEventLowCount);
        this.setParamSimple(map, prefix + "NodeCount", this.NodeCount);
        this.setParamSimple(map, prefix + "OfflineNodeCount", this.OfflineNodeCount);
        this.setParamSimple(map, prefix + "UninstallNodeCount", this.UninstallNodeCount);
        this.setParamSimple(map, prefix + "TotalCoresCount", this.TotalCoresCount);
        this.setParamSimple(map, prefix + "DefendCoresCount", this.DefendCoresCount);
        this.setParamSimple(map, prefix + "AuditLogSwitchStatus", this.AuditLogSwitchStatus);
        this.setParamSimple(map, prefix + "DefendStatus", this.DefendStatus);
        this.setParamSimple(map, prefix + "RunStatus", this.RunStatus);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "LastAssetSyncTime", this.LastAssetSyncTime);
        this.setParamSimple(map, prefix + "LastRiskCheckTime", this.LastRiskCheckTime);
        this.setParamSimple(map, prefix + "RiskStatus", this.RiskStatus);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "OwnerName", this.OwnerName);
        this.setParamSimple(map, prefix + "FailMessage", this.FailMessage);
        this.setParamSimple(map, prefix + "RunSubStatus", this.RunSubStatus);
        this.setParamSimple(map, prefix + "AccessedStatus", this.AccessedStatus);
        this.setParamSimple(map, prefix + "AccessedSubStatus", this.AccessedSubStatus);
        this.setParamSimple(map, prefix + "ClusterCaMD5", this.ClusterCaMD5);
        this.setParamSimple(map, prefix + "AssetSyncStatus", this.AssetSyncStatus);
        this.setParamSimple(map, prefix + "RiskConfigCount", this.RiskConfigCount);
        this.setParamSimple(map, prefix + "AccessFailedMessage", this.AccessFailedMessage);
        this.setParamSimple(map, prefix + "RegionName", this.RegionName);
        this.setParamSimple(map, prefix + "RegionNameEn", this.RegionNameEn);
        this.setParamSimple(map, prefix + "UnboundUltimateNodeCount", this.UnboundUltimateNodeCount);

    }
}

