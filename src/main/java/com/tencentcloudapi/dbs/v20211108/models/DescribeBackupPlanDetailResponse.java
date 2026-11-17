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
package com.tencentcloudapi.dbs.v20211108.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBackupPlanDetailResponse extends AbstractModel {

    /**
    * <p>地域。</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>备份计划 ID。</p>
    */
    @SerializedName("BackupPlanId")
    @Expose
    private String BackupPlanId;

    /**
    * <p>备份计划名称。</p>
    */
    @SerializedName("BackupPlanName")
    @Expose
    private String BackupPlanName;

    /**
    * <p>备份计划状态。取值：</p><ul><li>creating：创建中</li><li>notStarted：未启动</li><li>notConfigured：未配置</li><li>checkNotPass：校验未通过</li><li>checkPass：校验通过</li><li>checking：校验中</li><li>readyRun：待运行</li><li>running：运行中</li><li>fullBacking：全量备份中</li><li>paused：已暂停</li><li>isolating：隔离中</li><li>isolated：已隔离</li><li>offlining：下线中</li><li>offlined：已下线</li><li>completed：已完成</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>源库连接信息列表。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceEndPoint")
    @Expose
    private Endpoint [] SourceEndPoint;

    /**
    * <p>备份对象信息。</p>
    */
    @SerializedName("BackupObject")
    @Expose
    private BackupObject BackupObject;

    /**
    * <p>备份策略。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BackupStrategy")
    @Expose
    private BackupStrategyItem BackupStrategy;

    /**
    * <p>备份进度信息。</p>
    */
    @SerializedName("Progress")
    @Expose
    private BackupProgress Progress;

    /**
    * <p>错误异常信息。</p>
    */
    @SerializedName("ErrorInfo")
    @Expose
    private ErrorInfo ErrorInfo;

    /**
    * <p>创建时间。格式为 YYYY-MM-DD HH:mm:ss，如 2024-01-01 00:00:00。</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>到期时间。格式为 YYYY-MM-DD HH:mm:ss，如 2024-01-01 00:00:00，后付费计划无到期时间时为空字符串。</p>
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * <p>下线时间。格式为 YYYY-MM-DD HH:mm:ss，如 2024-01-01 00:00:00，尚未下线时为空字符串。</p>
    */
    @SerializedName("OfflineTime")
    @Expose
    private String OfflineTime;

    /**
    * <p>自动续费标识。取值：</p><ul><li>0：不自动续费</li><li>1：自动续费</li></ul>
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * <p>主节点连接信息。云数据库实例为实例 ID，云服务器自建为实例 ID:端口，其余为 ip:port。</p>
    */
    @SerializedName("SourceInfo")
    @Expose
    private String [] SourceInfo;

    /**
    * <p>从节点连接信息，格式同 SourceInfo。</p>
    */
    @SerializedName("SetSourceInfo")
    @Expose
    private String [] SetSourceInfo;

    /**
    * <p>标签信息列表。未绑定标签时返回 null。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private TagInfo [] Tags;

    /**
    * <p>上次备份作业时间。格式为 YYYY-MM-DD HH:mm:ss，如 2024-01-01 00:00:00，尚未执行过备份作业时为空字符串。</p>
    */
    @SerializedName("LastBackupJobTime")
    @Expose
    private String LastBackupJobTime;

    /**
    * <p>上次全量备份作业状态。</p>
    */
    @SerializedName("LastFullBackupJobStatus")
    @Expose
    private String LastFullBackupJobStatus;

    /**
    * <p>上次增量备份作业状态。</p>
    */
    @SerializedName("LastIncBackupJobStatus")
    @Expose
    private String LastIncBackupJobStatus;

    /**
    * <p>下次备份作业时间。格式为 YYYY-MM-DD HH:mm:ss，如 2024-01-01 00:00:00，尚未确定时为空字符串。</p>
    */
    @SerializedName("NextBackupJobTime")
    @Expose
    private String NextBackupJobTime;

    /**
    * <p>上次恢复作业时间。格式为 YYYY-MM-DD HH:mm:ss，如 2024-01-01 00:00:00，尚未执行过恢复作业时为空字符串。</p>
    */
    @SerializedName("LastRestoreJobTime")
    @Expose
    private String LastRestoreJobTime;

    /**
    * <p>上次恢复作业状态。</p>
    */
    @SerializedName("LastRestoreJobStatus")
    @Expose
    private String LastRestoreJobStatus;

    /**
    * <p>付费信息。</p>
    */
    @SerializedName("PayInfo")
    @Expose
    private BackupPlanPayInfo PayInfo;

    /**
    * <p>全量备份并行数上限。</p>
    */
    @SerializedName("UpperParallel")
    @Expose
    private Long UpperParallel;

    /**
    * <p>带宽上限，单位：MB/s。</p>
    */
    @SerializedName("UpperBandwidth")
    @Expose
    private Long UpperBandwidth;

    /**
    * <p>当前状态下允许的操作。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AllowedActions")
    @Expose
    private String [] AllowedActions;

    /**
    * <p>可恢复时间范围。</p>
    */
    @SerializedName("RestoreRange")
    @Expose
    private RestoreRange RestoreRange;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>地域。</p> 
     * @return Region <p>地域。</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>地域。</p>
     * @param Region <p>地域。</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>备份计划 ID。</p> 
     * @return BackupPlanId <p>备份计划 ID。</p>
     */
    public String getBackupPlanId() {
        return this.BackupPlanId;
    }

    /**
     * Set <p>备份计划 ID。</p>
     * @param BackupPlanId <p>备份计划 ID。</p>
     */
    public void setBackupPlanId(String BackupPlanId) {
        this.BackupPlanId = BackupPlanId;
    }

    /**
     * Get <p>备份计划名称。</p> 
     * @return BackupPlanName <p>备份计划名称。</p>
     */
    public String getBackupPlanName() {
        return this.BackupPlanName;
    }

    /**
     * Set <p>备份计划名称。</p>
     * @param BackupPlanName <p>备份计划名称。</p>
     */
    public void setBackupPlanName(String BackupPlanName) {
        this.BackupPlanName = BackupPlanName;
    }

    /**
     * Get <p>备份计划状态。取值：</p><ul><li>creating：创建中</li><li>notStarted：未启动</li><li>notConfigured：未配置</li><li>checkNotPass：校验未通过</li><li>checkPass：校验通过</li><li>checking：校验中</li><li>readyRun：待运行</li><li>running：运行中</li><li>fullBacking：全量备份中</li><li>paused：已暂停</li><li>isolating：隔离中</li><li>isolated：已隔离</li><li>offlining：下线中</li><li>offlined：已下线</li><li>completed：已完成</li></ul> 
     * @return Status <p>备份计划状态。取值：</p><ul><li>creating：创建中</li><li>notStarted：未启动</li><li>notConfigured：未配置</li><li>checkNotPass：校验未通过</li><li>checkPass：校验通过</li><li>checking：校验中</li><li>readyRun：待运行</li><li>running：运行中</li><li>fullBacking：全量备份中</li><li>paused：已暂停</li><li>isolating：隔离中</li><li>isolated：已隔离</li><li>offlining：下线中</li><li>offlined：已下线</li><li>completed：已完成</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>备份计划状态。取值：</p><ul><li>creating：创建中</li><li>notStarted：未启动</li><li>notConfigured：未配置</li><li>checkNotPass：校验未通过</li><li>checkPass：校验通过</li><li>checking：校验中</li><li>readyRun：待运行</li><li>running：运行中</li><li>fullBacking：全量备份中</li><li>paused：已暂停</li><li>isolating：隔离中</li><li>isolated：已隔离</li><li>offlining：下线中</li><li>offlined：已下线</li><li>completed：已完成</li></ul>
     * @param Status <p>备份计划状态。取值：</p><ul><li>creating：创建中</li><li>notStarted：未启动</li><li>notConfigured：未配置</li><li>checkNotPass：校验未通过</li><li>checkPass：校验通过</li><li>checking：校验中</li><li>readyRun：待运行</li><li>running：运行中</li><li>fullBacking：全量备份中</li><li>paused：已暂停</li><li>isolating：隔离中</li><li>isolated：已隔离</li><li>offlining：下线中</li><li>offlined：已下线</li><li>completed：已完成</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>源库连接信息列表。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceEndPoint <p>源库连接信息列表。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Endpoint [] getSourceEndPoint() {
        return this.SourceEndPoint;
    }

    /**
     * Set <p>源库连接信息列表。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceEndPoint <p>源库连接信息列表。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourceEndPoint(Endpoint [] SourceEndPoint) {
        this.SourceEndPoint = SourceEndPoint;
    }

    /**
     * Get <p>备份对象信息。</p> 
     * @return BackupObject <p>备份对象信息。</p>
     */
    public BackupObject getBackupObject() {
        return this.BackupObject;
    }

    /**
     * Set <p>备份对象信息。</p>
     * @param BackupObject <p>备份对象信息。</p>
     */
    public void setBackupObject(BackupObject BackupObject) {
        this.BackupObject = BackupObject;
    }

    /**
     * Get <p>备份策略。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BackupStrategy <p>备份策略。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BackupStrategyItem getBackupStrategy() {
        return this.BackupStrategy;
    }

    /**
     * Set <p>备份策略。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BackupStrategy <p>备份策略。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBackupStrategy(BackupStrategyItem BackupStrategy) {
        this.BackupStrategy = BackupStrategy;
    }

    /**
     * Get <p>备份进度信息。</p> 
     * @return Progress <p>备份进度信息。</p>
     */
    public BackupProgress getProgress() {
        return this.Progress;
    }

    /**
     * Set <p>备份进度信息。</p>
     * @param Progress <p>备份进度信息。</p>
     */
    public void setProgress(BackupProgress Progress) {
        this.Progress = Progress;
    }

    /**
     * Get <p>错误异常信息。</p> 
     * @return ErrorInfo <p>错误异常信息。</p>
     */
    public ErrorInfo getErrorInfo() {
        return this.ErrorInfo;
    }

    /**
     * Set <p>错误异常信息。</p>
     * @param ErrorInfo <p>错误异常信息。</p>
     */
    public void setErrorInfo(ErrorInfo ErrorInfo) {
        this.ErrorInfo = ErrorInfo;
    }

    /**
     * Get <p>创建时间。格式为 YYYY-MM-DD HH:mm:ss，如 2024-01-01 00:00:00。</p> 
     * @return CreateTime <p>创建时间。格式为 YYYY-MM-DD HH:mm:ss，如 2024-01-01 00:00:00。</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间。格式为 YYYY-MM-DD HH:mm:ss，如 2024-01-01 00:00:00。</p>
     * @param CreateTime <p>创建时间。格式为 YYYY-MM-DD HH:mm:ss，如 2024-01-01 00:00:00。</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>到期时间。格式为 YYYY-MM-DD HH:mm:ss，如 2024-01-01 00:00:00，后付费计划无到期时间时为空字符串。</p> 
     * @return ExpireTime <p>到期时间。格式为 YYYY-MM-DD HH:mm:ss，如 2024-01-01 00:00:00，后付费计划无到期时间时为空字符串。</p>
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set <p>到期时间。格式为 YYYY-MM-DD HH:mm:ss，如 2024-01-01 00:00:00，后付费计划无到期时间时为空字符串。</p>
     * @param ExpireTime <p>到期时间。格式为 YYYY-MM-DD HH:mm:ss，如 2024-01-01 00:00:00，后付费计划无到期时间时为空字符串。</p>
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get <p>下线时间。格式为 YYYY-MM-DD HH:mm:ss，如 2024-01-01 00:00:00，尚未下线时为空字符串。</p> 
     * @return OfflineTime <p>下线时间。格式为 YYYY-MM-DD HH:mm:ss，如 2024-01-01 00:00:00，尚未下线时为空字符串。</p>
     */
    public String getOfflineTime() {
        return this.OfflineTime;
    }

    /**
     * Set <p>下线时间。格式为 YYYY-MM-DD HH:mm:ss，如 2024-01-01 00:00:00，尚未下线时为空字符串。</p>
     * @param OfflineTime <p>下线时间。格式为 YYYY-MM-DD HH:mm:ss，如 2024-01-01 00:00:00，尚未下线时为空字符串。</p>
     */
    public void setOfflineTime(String OfflineTime) {
        this.OfflineTime = OfflineTime;
    }

    /**
     * Get <p>自动续费标识。取值：</p><ul><li>0：不自动续费</li><li>1：自动续费</li></ul> 
     * @return AutoRenewFlag <p>自动续费标识。取值：</p><ul><li>0：不自动续费</li><li>1：自动续费</li></ul>
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set <p>自动续费标识。取值：</p><ul><li>0：不自动续费</li><li>1：自动续费</li></ul>
     * @param AutoRenewFlag <p>自动续费标识。取值：</p><ul><li>0：不自动续费</li><li>1：自动续费</li></ul>
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get <p>主节点连接信息。云数据库实例为实例 ID，云服务器自建为实例 ID:端口，其余为 ip:port。</p> 
     * @return SourceInfo <p>主节点连接信息。云数据库实例为实例 ID，云服务器自建为实例 ID:端口，其余为 ip:port。</p>
     */
    public String [] getSourceInfo() {
        return this.SourceInfo;
    }

    /**
     * Set <p>主节点连接信息。云数据库实例为实例 ID，云服务器自建为实例 ID:端口，其余为 ip:port。</p>
     * @param SourceInfo <p>主节点连接信息。云数据库实例为实例 ID，云服务器自建为实例 ID:端口，其余为 ip:port。</p>
     */
    public void setSourceInfo(String [] SourceInfo) {
        this.SourceInfo = SourceInfo;
    }

    /**
     * Get <p>从节点连接信息，格式同 SourceInfo。</p> 
     * @return SetSourceInfo <p>从节点连接信息，格式同 SourceInfo。</p>
     */
    public String [] getSetSourceInfo() {
        return this.SetSourceInfo;
    }

    /**
     * Set <p>从节点连接信息，格式同 SourceInfo。</p>
     * @param SetSourceInfo <p>从节点连接信息，格式同 SourceInfo。</p>
     */
    public void setSetSourceInfo(String [] SetSourceInfo) {
        this.SetSourceInfo = SetSourceInfo;
    }

    /**
     * Get <p>标签信息列表。未绑定标签时返回 null。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags <p>标签信息列表。未绑定标签时返回 null。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签信息列表。未绑定标签时返回 null。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags <p>标签信息列表。未绑定标签时返回 null。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(TagInfo [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>上次备份作业时间。格式为 YYYY-MM-DD HH:mm:ss，如 2024-01-01 00:00:00，尚未执行过备份作业时为空字符串。</p> 
     * @return LastBackupJobTime <p>上次备份作业时间。格式为 YYYY-MM-DD HH:mm:ss，如 2024-01-01 00:00:00，尚未执行过备份作业时为空字符串。</p>
     */
    public String getLastBackupJobTime() {
        return this.LastBackupJobTime;
    }

    /**
     * Set <p>上次备份作业时间。格式为 YYYY-MM-DD HH:mm:ss，如 2024-01-01 00:00:00，尚未执行过备份作业时为空字符串。</p>
     * @param LastBackupJobTime <p>上次备份作业时间。格式为 YYYY-MM-DD HH:mm:ss，如 2024-01-01 00:00:00，尚未执行过备份作业时为空字符串。</p>
     */
    public void setLastBackupJobTime(String LastBackupJobTime) {
        this.LastBackupJobTime = LastBackupJobTime;
    }

    /**
     * Get <p>上次全量备份作业状态。</p> 
     * @return LastFullBackupJobStatus <p>上次全量备份作业状态。</p>
     */
    public String getLastFullBackupJobStatus() {
        return this.LastFullBackupJobStatus;
    }

    /**
     * Set <p>上次全量备份作业状态。</p>
     * @param LastFullBackupJobStatus <p>上次全量备份作业状态。</p>
     */
    public void setLastFullBackupJobStatus(String LastFullBackupJobStatus) {
        this.LastFullBackupJobStatus = LastFullBackupJobStatus;
    }

    /**
     * Get <p>上次增量备份作业状态。</p> 
     * @return LastIncBackupJobStatus <p>上次增量备份作业状态。</p>
     */
    public String getLastIncBackupJobStatus() {
        return this.LastIncBackupJobStatus;
    }

    /**
     * Set <p>上次增量备份作业状态。</p>
     * @param LastIncBackupJobStatus <p>上次增量备份作业状态。</p>
     */
    public void setLastIncBackupJobStatus(String LastIncBackupJobStatus) {
        this.LastIncBackupJobStatus = LastIncBackupJobStatus;
    }

    /**
     * Get <p>下次备份作业时间。格式为 YYYY-MM-DD HH:mm:ss，如 2024-01-01 00:00:00，尚未确定时为空字符串。</p> 
     * @return NextBackupJobTime <p>下次备份作业时间。格式为 YYYY-MM-DD HH:mm:ss，如 2024-01-01 00:00:00，尚未确定时为空字符串。</p>
     */
    public String getNextBackupJobTime() {
        return this.NextBackupJobTime;
    }

    /**
     * Set <p>下次备份作业时间。格式为 YYYY-MM-DD HH:mm:ss，如 2024-01-01 00:00:00，尚未确定时为空字符串。</p>
     * @param NextBackupJobTime <p>下次备份作业时间。格式为 YYYY-MM-DD HH:mm:ss，如 2024-01-01 00:00:00，尚未确定时为空字符串。</p>
     */
    public void setNextBackupJobTime(String NextBackupJobTime) {
        this.NextBackupJobTime = NextBackupJobTime;
    }

    /**
     * Get <p>上次恢复作业时间。格式为 YYYY-MM-DD HH:mm:ss，如 2024-01-01 00:00:00，尚未执行过恢复作业时为空字符串。</p> 
     * @return LastRestoreJobTime <p>上次恢复作业时间。格式为 YYYY-MM-DD HH:mm:ss，如 2024-01-01 00:00:00，尚未执行过恢复作业时为空字符串。</p>
     */
    public String getLastRestoreJobTime() {
        return this.LastRestoreJobTime;
    }

    /**
     * Set <p>上次恢复作业时间。格式为 YYYY-MM-DD HH:mm:ss，如 2024-01-01 00:00:00，尚未执行过恢复作业时为空字符串。</p>
     * @param LastRestoreJobTime <p>上次恢复作业时间。格式为 YYYY-MM-DD HH:mm:ss，如 2024-01-01 00:00:00，尚未执行过恢复作业时为空字符串。</p>
     */
    public void setLastRestoreJobTime(String LastRestoreJobTime) {
        this.LastRestoreJobTime = LastRestoreJobTime;
    }

    /**
     * Get <p>上次恢复作业状态。</p> 
     * @return LastRestoreJobStatus <p>上次恢复作业状态。</p>
     */
    public String getLastRestoreJobStatus() {
        return this.LastRestoreJobStatus;
    }

    /**
     * Set <p>上次恢复作业状态。</p>
     * @param LastRestoreJobStatus <p>上次恢复作业状态。</p>
     */
    public void setLastRestoreJobStatus(String LastRestoreJobStatus) {
        this.LastRestoreJobStatus = LastRestoreJobStatus;
    }

    /**
     * Get <p>付费信息。</p> 
     * @return PayInfo <p>付费信息。</p>
     */
    public BackupPlanPayInfo getPayInfo() {
        return this.PayInfo;
    }

    /**
     * Set <p>付费信息。</p>
     * @param PayInfo <p>付费信息。</p>
     */
    public void setPayInfo(BackupPlanPayInfo PayInfo) {
        this.PayInfo = PayInfo;
    }

    /**
     * Get <p>全量备份并行数上限。</p> 
     * @return UpperParallel <p>全量备份并行数上限。</p>
     */
    public Long getUpperParallel() {
        return this.UpperParallel;
    }

    /**
     * Set <p>全量备份并行数上限。</p>
     * @param UpperParallel <p>全量备份并行数上限。</p>
     */
    public void setUpperParallel(Long UpperParallel) {
        this.UpperParallel = UpperParallel;
    }

    /**
     * Get <p>带宽上限，单位：MB/s。</p> 
     * @return UpperBandwidth <p>带宽上限，单位：MB/s。</p>
     */
    public Long getUpperBandwidth() {
        return this.UpperBandwidth;
    }

    /**
     * Set <p>带宽上限，单位：MB/s。</p>
     * @param UpperBandwidth <p>带宽上限，单位：MB/s。</p>
     */
    public void setUpperBandwidth(Long UpperBandwidth) {
        this.UpperBandwidth = UpperBandwidth;
    }

    /**
     * Get <p>当前状态下允许的操作。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AllowedActions <p>当前状态下允许的操作。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getAllowedActions() {
        return this.AllowedActions;
    }

    /**
     * Set <p>当前状态下允许的操作。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AllowedActions <p>当前状态下允许的操作。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAllowedActions(String [] AllowedActions) {
        this.AllowedActions = AllowedActions;
    }

    /**
     * Get <p>可恢复时间范围。</p> 
     * @return RestoreRange <p>可恢复时间范围。</p>
     */
    public RestoreRange getRestoreRange() {
        return this.RestoreRange;
    }

    /**
     * Set <p>可恢复时间范围。</p>
     * @param RestoreRange <p>可恢复时间范围。</p>
     */
    public void setRestoreRange(RestoreRange RestoreRange) {
        this.RestoreRange = RestoreRange;
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

    public DescribeBackupPlanDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBackupPlanDetailResponse(DescribeBackupPlanDetailResponse source) {
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.BackupPlanId != null) {
            this.BackupPlanId = new String(source.BackupPlanId);
        }
        if (source.BackupPlanName != null) {
            this.BackupPlanName = new String(source.BackupPlanName);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.SourceEndPoint != null) {
            this.SourceEndPoint = new Endpoint[source.SourceEndPoint.length];
            for (int i = 0; i < source.SourceEndPoint.length; i++) {
                this.SourceEndPoint[i] = new Endpoint(source.SourceEndPoint[i]);
            }
        }
        if (source.BackupObject != null) {
            this.BackupObject = new BackupObject(source.BackupObject);
        }
        if (source.BackupStrategy != null) {
            this.BackupStrategy = new BackupStrategyItem(source.BackupStrategy);
        }
        if (source.Progress != null) {
            this.Progress = new BackupProgress(source.Progress);
        }
        if (source.ErrorInfo != null) {
            this.ErrorInfo = new ErrorInfo(source.ErrorInfo);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.OfflineTime != null) {
            this.OfflineTime = new String(source.OfflineTime);
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
        if (source.SourceInfo != null) {
            this.SourceInfo = new String[source.SourceInfo.length];
            for (int i = 0; i < source.SourceInfo.length; i++) {
                this.SourceInfo[i] = new String(source.SourceInfo[i]);
            }
        }
        if (source.SetSourceInfo != null) {
            this.SetSourceInfo = new String[source.SetSourceInfo.length];
            for (int i = 0; i < source.SetSourceInfo.length; i++) {
                this.SetSourceInfo[i] = new String(source.SetSourceInfo[i]);
            }
        }
        if (source.Tags != null) {
            this.Tags = new TagInfo[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagInfo(source.Tags[i]);
            }
        }
        if (source.LastBackupJobTime != null) {
            this.LastBackupJobTime = new String(source.LastBackupJobTime);
        }
        if (source.LastFullBackupJobStatus != null) {
            this.LastFullBackupJobStatus = new String(source.LastFullBackupJobStatus);
        }
        if (source.LastIncBackupJobStatus != null) {
            this.LastIncBackupJobStatus = new String(source.LastIncBackupJobStatus);
        }
        if (source.NextBackupJobTime != null) {
            this.NextBackupJobTime = new String(source.NextBackupJobTime);
        }
        if (source.LastRestoreJobTime != null) {
            this.LastRestoreJobTime = new String(source.LastRestoreJobTime);
        }
        if (source.LastRestoreJobStatus != null) {
            this.LastRestoreJobStatus = new String(source.LastRestoreJobStatus);
        }
        if (source.PayInfo != null) {
            this.PayInfo = new BackupPlanPayInfo(source.PayInfo);
        }
        if (source.UpperParallel != null) {
            this.UpperParallel = new Long(source.UpperParallel);
        }
        if (source.UpperBandwidth != null) {
            this.UpperBandwidth = new Long(source.UpperBandwidth);
        }
        if (source.AllowedActions != null) {
            this.AllowedActions = new String[source.AllowedActions.length];
            for (int i = 0; i < source.AllowedActions.length; i++) {
                this.AllowedActions[i] = new String(source.AllowedActions[i]);
            }
        }
        if (source.RestoreRange != null) {
            this.RestoreRange = new RestoreRange(source.RestoreRange);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "BackupPlanId", this.BackupPlanId);
        this.setParamSimple(map, prefix + "BackupPlanName", this.BackupPlanName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "SourceEndPoint.", this.SourceEndPoint);
        this.setParamObj(map, prefix + "BackupObject.", this.BackupObject);
        this.setParamObj(map, prefix + "BackupStrategy.", this.BackupStrategy);
        this.setParamObj(map, prefix + "Progress.", this.Progress);
        this.setParamObj(map, prefix + "ErrorInfo.", this.ErrorInfo);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "OfflineTime", this.OfflineTime);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamArraySimple(map, prefix + "SourceInfo.", this.SourceInfo);
        this.setParamArraySimple(map, prefix + "SetSourceInfo.", this.SetSourceInfo);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "LastBackupJobTime", this.LastBackupJobTime);
        this.setParamSimple(map, prefix + "LastFullBackupJobStatus", this.LastFullBackupJobStatus);
        this.setParamSimple(map, prefix + "LastIncBackupJobStatus", this.LastIncBackupJobStatus);
        this.setParamSimple(map, prefix + "NextBackupJobTime", this.NextBackupJobTime);
        this.setParamSimple(map, prefix + "LastRestoreJobTime", this.LastRestoreJobTime);
        this.setParamSimple(map, prefix + "LastRestoreJobStatus", this.LastRestoreJobStatus);
        this.setParamObj(map, prefix + "PayInfo.", this.PayInfo);
        this.setParamSimple(map, prefix + "UpperParallel", this.UpperParallel);
        this.setParamSimple(map, prefix + "UpperBandwidth", this.UpperBandwidth);
        this.setParamArraySimple(map, prefix + "AllowedActions.", this.AllowedActions);
        this.setParamObj(map, prefix + "RestoreRange.", this.RestoreRange);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

