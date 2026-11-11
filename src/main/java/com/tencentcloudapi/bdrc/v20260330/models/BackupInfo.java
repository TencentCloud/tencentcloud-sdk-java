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
package com.tencentcloudapi.bdrc.v20260330.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BackupInfo extends AbstractModel {

    /**
    * <p>备份点ID</p>
    */
    @SerializedName("BackupId")
    @Expose
    private String BackupId;

    /**
    * <p>备份名称</p>
    */
    @SerializedName("BackupName")
    @Expose
    private String BackupName;

    /**
    * <p>所属计划ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PlanId")
    @Expose
    private String PlanId;

    /**
    * <p>策略ID</p>
    */
    @SerializedName("AspInstanceId")
    @Expose
    private String AspInstanceId;

    /**
    * <p>资源ID</p>
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * <p>备份状态，取值如下：<br>0 备份完成<br>1 创建中（备份进行中）<br>2 部分成功（指定的备份路径中部分目录不存在）<br>3 恢复中（该备份点正在被恢复任务使用）<br>92  已取消<br>98 创建失败<br>99 已删除<br>100 删除中</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>备份路径</p>
    */
    @SerializedName("BackupPaths")
    @Expose
    private String [] BackupPaths;

    /**
    * <p>包含文件类型</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IncludeFileTypes")
    @Expose
    private String [] IncludeFileTypes;

    /**
    * <p>排除路径</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExcludePatterns")
    @Expose
    private String [] ExcludePatterns;

    /**
    * <p>是否排除系统目录</p>
    */
    @SerializedName("ExcludeSystemDirectories")
    @Expose
    private Boolean ExcludeSystemDirectories;

    /**
    * <p>备份库ID</p>
    */
    @SerializedName("VaultId")
    @Expose
    private String VaultId;

    /**
    * <p>扫描文件数</p>
    */
    @SerializedName("ScannedFileCount")
    @Expose
    private Long ScannedFileCount;

    /**
    * <p>扫描大小(字节)</p>
    */
    @SerializedName("ScannedSize")
    @Expose
    private Long ScannedSize;

    /**
    * <p>扫描大小(格式化)</p>
    */
    @SerializedName("ScannedSizeFormatted")
    @Expose
    private String ScannedSizeFormatted;

    /**
    * <p>已备份文件数量</p>
    */
    @SerializedName("BackupFileCount")
    @Expose
    private Long BackupFileCount;

    /**
    * <p>已备份大小(字节)</p>
    */
    @SerializedName("BackupSize")
    @Expose
    private Long BackupSize;

    /**
    * <p>已备份大小(格式化)</p>
    */
    @SerializedName("BackupSizeFormatted")
    @Expose
    private String BackupSizeFormatted;

    /**
    * <p>备份进度(0-100)</p>
    */
    @SerializedName("Progress")
    @Expose
    private Float Progress;

    /**
    * <p>任务ID</p>
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * <p>开始时间</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>结束时间</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * <p>是否为永久保留</p>
    */
    @SerializedName("IsPermanent")
    @Expose
    private Boolean IsPermanent;

    /**
    * <p>到期时间</p>
    */
    @SerializedName("Deadline")
    @Expose
    private String Deadline;

    /**
    * <p>不存在的路径信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NonExistSourcePaths")
    @Expose
    private String [] NonExistSourcePaths;

    /**
    * <p>备份失败原因</p>
    */
    @SerializedName("FailReason")
    @Expose
    private String FailReason;

    /**
    * <p>备份所属AppId</p>
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>备份类型</p>
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * <p>cos备份场景使用，标识是否清单生成中</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsInventoryPending")
    @Expose
    private Boolean IsInventoryPending;

    /**
    * <p>是否备份对象ACL（仅COS备份支持）</p><p>枚举值：</p><ul><li>true： 是</li><li>false： 否</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnableObjectAcl")
    @Expose
    private Boolean EnableObjectAcl;

    /**
    * <p>是否备份对象标签（仅COS备份支持）</p><p>枚举值：</p><ul><li>true： 是</li><li>false： 否</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnableObjectTags")
    @Expose
    private Boolean EnableObjectTags;

    /**
    * <p>云上资源ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CloudResourceId")
    @Expose
    private String CloudResourceId;

    /**
    * <p>产品存储类型。CFS 资源返回文件系统存储类型；非 CFS 资源无存储类型，返回资源类型标识。</p><p>枚举值：</p><ul><li>SD： 文件系统通用标准型存储</li><li>HP： 文件系统通用性能性存储</li><li>TB： 文件系统Turbo标准型存储</li><li>TP： 文件系统Turbo性能型存储</li><li>THP： 文件系统Turbo吞吐型存储</li><li>CVM_AGENT： CVM 资源（非 CFS 资源时返回）</li><li>COS_AGENT： COS 资源（非 CFS 资源时返回）</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProductType")
    @Expose
    private String ProductType;

    /**
    * <p>备份完成量</p><p>单位：MB</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BackupCompletedSize")
    @Expose
    private Long BackupCompletedSize;

    /**
    * <p>备份完成量</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BackupCompletedSizeFormatted")
    @Expose
    private String BackupCompletedSizeFormatted;

    /**
     * Get <p>备份点ID</p> 
     * @return BackupId <p>备份点ID</p>
     */
    public String getBackupId() {
        return this.BackupId;
    }

    /**
     * Set <p>备份点ID</p>
     * @param BackupId <p>备份点ID</p>
     */
    public void setBackupId(String BackupId) {
        this.BackupId = BackupId;
    }

    /**
     * Get <p>备份名称</p> 
     * @return BackupName <p>备份名称</p>
     */
    public String getBackupName() {
        return this.BackupName;
    }

    /**
     * Set <p>备份名称</p>
     * @param BackupName <p>备份名称</p>
     */
    public void setBackupName(String BackupName) {
        this.BackupName = BackupName;
    }

    /**
     * Get <p>所属计划ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PlanId <p>所属计划ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPlanId() {
        return this.PlanId;
    }

    /**
     * Set <p>所属计划ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PlanId <p>所属计划ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPlanId(String PlanId) {
        this.PlanId = PlanId;
    }

    /**
     * Get <p>策略ID</p> 
     * @return AspInstanceId <p>策略ID</p>
     */
    public String getAspInstanceId() {
        return this.AspInstanceId;
    }

    /**
     * Set <p>策略ID</p>
     * @param AspInstanceId <p>策略ID</p>
     */
    public void setAspInstanceId(String AspInstanceId) {
        this.AspInstanceId = AspInstanceId;
    }

    /**
     * Get <p>资源ID</p> 
     * @return ResourceId <p>资源ID</p>
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set <p>资源ID</p>
     * @param ResourceId <p>资源ID</p>
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get <p>备份状态，取值如下：<br>0 备份完成<br>1 创建中（备份进行中）<br>2 部分成功（指定的备份路径中部分目录不存在）<br>3 恢复中（该备份点正在被恢复任务使用）<br>92  已取消<br>98 创建失败<br>99 已删除<br>100 删除中</p> 
     * @return Status <p>备份状态，取值如下：<br>0 备份完成<br>1 创建中（备份进行中）<br>2 部分成功（指定的备份路径中部分目录不存在）<br>3 恢复中（该备份点正在被恢复任务使用）<br>92  已取消<br>98 创建失败<br>99 已删除<br>100 删除中</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>备份状态，取值如下：<br>0 备份完成<br>1 创建中（备份进行中）<br>2 部分成功（指定的备份路径中部分目录不存在）<br>3 恢复中（该备份点正在被恢复任务使用）<br>92  已取消<br>98 创建失败<br>99 已删除<br>100 删除中</p>
     * @param Status <p>备份状态，取值如下：<br>0 备份完成<br>1 创建中（备份进行中）<br>2 部分成功（指定的备份路径中部分目录不存在）<br>3 恢复中（该备份点正在被恢复任务使用）<br>92  已取消<br>98 创建失败<br>99 已删除<br>100 删除中</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>备份路径</p> 
     * @return BackupPaths <p>备份路径</p>
     */
    public String [] getBackupPaths() {
        return this.BackupPaths;
    }

    /**
     * Set <p>备份路径</p>
     * @param BackupPaths <p>备份路径</p>
     */
    public void setBackupPaths(String [] BackupPaths) {
        this.BackupPaths = BackupPaths;
    }

    /**
     * Get <p>包含文件类型</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IncludeFileTypes <p>包含文件类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getIncludeFileTypes() {
        return this.IncludeFileTypes;
    }

    /**
     * Set <p>包含文件类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IncludeFileTypes <p>包含文件类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIncludeFileTypes(String [] IncludeFileTypes) {
        this.IncludeFileTypes = IncludeFileTypes;
    }

    /**
     * Get <p>排除路径</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExcludePatterns <p>排除路径</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getExcludePatterns() {
        return this.ExcludePatterns;
    }

    /**
     * Set <p>排除路径</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExcludePatterns <p>排除路径</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExcludePatterns(String [] ExcludePatterns) {
        this.ExcludePatterns = ExcludePatterns;
    }

    /**
     * Get <p>是否排除系统目录</p> 
     * @return ExcludeSystemDirectories <p>是否排除系统目录</p>
     */
    public Boolean getExcludeSystemDirectories() {
        return this.ExcludeSystemDirectories;
    }

    /**
     * Set <p>是否排除系统目录</p>
     * @param ExcludeSystemDirectories <p>是否排除系统目录</p>
     */
    public void setExcludeSystemDirectories(Boolean ExcludeSystemDirectories) {
        this.ExcludeSystemDirectories = ExcludeSystemDirectories;
    }

    /**
     * Get <p>备份库ID</p> 
     * @return VaultId <p>备份库ID</p>
     */
    public String getVaultId() {
        return this.VaultId;
    }

    /**
     * Set <p>备份库ID</p>
     * @param VaultId <p>备份库ID</p>
     */
    public void setVaultId(String VaultId) {
        this.VaultId = VaultId;
    }

    /**
     * Get <p>扫描文件数</p> 
     * @return ScannedFileCount <p>扫描文件数</p>
     */
    public Long getScannedFileCount() {
        return this.ScannedFileCount;
    }

    /**
     * Set <p>扫描文件数</p>
     * @param ScannedFileCount <p>扫描文件数</p>
     */
    public void setScannedFileCount(Long ScannedFileCount) {
        this.ScannedFileCount = ScannedFileCount;
    }

    /**
     * Get <p>扫描大小(字节)</p> 
     * @return ScannedSize <p>扫描大小(字节)</p>
     */
    public Long getScannedSize() {
        return this.ScannedSize;
    }

    /**
     * Set <p>扫描大小(字节)</p>
     * @param ScannedSize <p>扫描大小(字节)</p>
     */
    public void setScannedSize(Long ScannedSize) {
        this.ScannedSize = ScannedSize;
    }

    /**
     * Get <p>扫描大小(格式化)</p> 
     * @return ScannedSizeFormatted <p>扫描大小(格式化)</p>
     */
    public String getScannedSizeFormatted() {
        return this.ScannedSizeFormatted;
    }

    /**
     * Set <p>扫描大小(格式化)</p>
     * @param ScannedSizeFormatted <p>扫描大小(格式化)</p>
     */
    public void setScannedSizeFormatted(String ScannedSizeFormatted) {
        this.ScannedSizeFormatted = ScannedSizeFormatted;
    }

    /**
     * Get <p>已备份文件数量</p> 
     * @return BackupFileCount <p>已备份文件数量</p>
     */
    public Long getBackupFileCount() {
        return this.BackupFileCount;
    }

    /**
     * Set <p>已备份文件数量</p>
     * @param BackupFileCount <p>已备份文件数量</p>
     */
    public void setBackupFileCount(Long BackupFileCount) {
        this.BackupFileCount = BackupFileCount;
    }

    /**
     * Get <p>已备份大小(字节)</p> 
     * @return BackupSize <p>已备份大小(字节)</p>
     */
    public Long getBackupSize() {
        return this.BackupSize;
    }

    /**
     * Set <p>已备份大小(字节)</p>
     * @param BackupSize <p>已备份大小(字节)</p>
     */
    public void setBackupSize(Long BackupSize) {
        this.BackupSize = BackupSize;
    }

    /**
     * Get <p>已备份大小(格式化)</p> 
     * @return BackupSizeFormatted <p>已备份大小(格式化)</p>
     */
    public String getBackupSizeFormatted() {
        return this.BackupSizeFormatted;
    }

    /**
     * Set <p>已备份大小(格式化)</p>
     * @param BackupSizeFormatted <p>已备份大小(格式化)</p>
     */
    public void setBackupSizeFormatted(String BackupSizeFormatted) {
        this.BackupSizeFormatted = BackupSizeFormatted;
    }

    /**
     * Get <p>备份进度(0-100)</p> 
     * @return Progress <p>备份进度(0-100)</p>
     */
    public Float getProgress() {
        return this.Progress;
    }

    /**
     * Set <p>备份进度(0-100)</p>
     * @param Progress <p>备份进度(0-100)</p>
     */
    public void setProgress(Float Progress) {
        this.Progress = Progress;
    }

    /**
     * Get <p>任务ID</p> 
     * @return JobId <p>任务ID</p>
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set <p>任务ID</p>
     * @param JobId <p>任务ID</p>
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get <p>开始时间</p> 
     * @return StartTime <p>开始时间</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>开始时间</p>
     * @param StartTime <p>开始时间</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>结束时间</p> 
     * @return EndTime <p>结束时间</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>结束时间</p>
     * @param EndTime <p>结束时间</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>创建时间</p> 
     * @return CreatedTime <p>创建时间</p>
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set <p>创建时间</p>
     * @param CreatedTime <p>创建时间</p>
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get <p>是否为永久保留</p> 
     * @return IsPermanent <p>是否为永久保留</p>
     */
    public Boolean getIsPermanent() {
        return this.IsPermanent;
    }

    /**
     * Set <p>是否为永久保留</p>
     * @param IsPermanent <p>是否为永久保留</p>
     */
    public void setIsPermanent(Boolean IsPermanent) {
        this.IsPermanent = IsPermanent;
    }

    /**
     * Get <p>到期时间</p> 
     * @return Deadline <p>到期时间</p>
     */
    public String getDeadline() {
        return this.Deadline;
    }

    /**
     * Set <p>到期时间</p>
     * @param Deadline <p>到期时间</p>
     */
    public void setDeadline(String Deadline) {
        this.Deadline = Deadline;
    }

    /**
     * Get <p>不存在的路径信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NonExistSourcePaths <p>不存在的路径信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getNonExistSourcePaths() {
        return this.NonExistSourcePaths;
    }

    /**
     * Set <p>不存在的路径信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param NonExistSourcePaths <p>不存在的路径信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNonExistSourcePaths(String [] NonExistSourcePaths) {
        this.NonExistSourcePaths = NonExistSourcePaths;
    }

    /**
     * Get <p>备份失败原因</p> 
     * @return FailReason <p>备份失败原因</p>
     */
    public String getFailReason() {
        return this.FailReason;
    }

    /**
     * Set <p>备份失败原因</p>
     * @param FailReason <p>备份失败原因</p>
     */
    public void setFailReason(String FailReason) {
        this.FailReason = FailReason;
    }

    /**
     * Get <p>备份所属AppId</p> 
     * @return AppId <p>备份所属AppId</p>
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>备份所属AppId</p>
     * @param AppId <p>备份所属AppId</p>
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>备份类型</p> 
     * @return ResourceType <p>备份类型</p>
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set <p>备份类型</p>
     * @param ResourceType <p>备份类型</p>
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get <p>cos备份场景使用，标识是否清单生成中</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsInventoryPending <p>cos备份场景使用，标识是否清单生成中</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsInventoryPending() {
        return this.IsInventoryPending;
    }

    /**
     * Set <p>cos备份场景使用，标识是否清单生成中</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsInventoryPending <p>cos备份场景使用，标识是否清单生成中</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsInventoryPending(Boolean IsInventoryPending) {
        this.IsInventoryPending = IsInventoryPending;
    }

    /**
     * Get <p>是否备份对象ACL（仅COS备份支持）</p><p>枚举值：</p><ul><li>true： 是</li><li>false： 否</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnableObjectAcl <p>是否备份对象ACL（仅COS备份支持）</p><p>枚举值：</p><ul><li>true： 是</li><li>false： 否</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getEnableObjectAcl() {
        return this.EnableObjectAcl;
    }

    /**
     * Set <p>是否备份对象ACL（仅COS备份支持）</p><p>枚举值：</p><ul><li>true： 是</li><li>false： 否</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnableObjectAcl <p>是否备份对象ACL（仅COS备份支持）</p><p>枚举值：</p><ul><li>true： 是</li><li>false： 否</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnableObjectAcl(Boolean EnableObjectAcl) {
        this.EnableObjectAcl = EnableObjectAcl;
    }

    /**
     * Get <p>是否备份对象标签（仅COS备份支持）</p><p>枚举值：</p><ul><li>true： 是</li><li>false： 否</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnableObjectTags <p>是否备份对象标签（仅COS备份支持）</p><p>枚举值：</p><ul><li>true： 是</li><li>false： 否</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getEnableObjectTags() {
        return this.EnableObjectTags;
    }

    /**
     * Set <p>是否备份对象标签（仅COS备份支持）</p><p>枚举值：</p><ul><li>true： 是</li><li>false： 否</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnableObjectTags <p>是否备份对象标签（仅COS备份支持）</p><p>枚举值：</p><ul><li>true： 是</li><li>false： 否</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnableObjectTags(Boolean EnableObjectTags) {
        this.EnableObjectTags = EnableObjectTags;
    }

    /**
     * Get <p>云上资源ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CloudResourceId <p>云上资源ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCloudResourceId() {
        return this.CloudResourceId;
    }

    /**
     * Set <p>云上资源ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CloudResourceId <p>云上资源ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCloudResourceId(String CloudResourceId) {
        this.CloudResourceId = CloudResourceId;
    }

    /**
     * Get <p>产品存储类型。CFS 资源返回文件系统存储类型；非 CFS 资源无存储类型，返回资源类型标识。</p><p>枚举值：</p><ul><li>SD： 文件系统通用标准型存储</li><li>HP： 文件系统通用性能性存储</li><li>TB： 文件系统Turbo标准型存储</li><li>TP： 文件系统Turbo性能型存储</li><li>THP： 文件系统Turbo吞吐型存储</li><li>CVM_AGENT： CVM 资源（非 CFS 资源时返回）</li><li>COS_AGENT： COS 资源（非 CFS 资源时返回）</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProductType <p>产品存储类型。CFS 资源返回文件系统存储类型；非 CFS 资源无存储类型，返回资源类型标识。</p><p>枚举值：</p><ul><li>SD： 文件系统通用标准型存储</li><li>HP： 文件系统通用性能性存储</li><li>TB： 文件系统Turbo标准型存储</li><li>TP： 文件系统Turbo性能型存储</li><li>THP： 文件系统Turbo吞吐型存储</li><li>CVM_AGENT： CVM 资源（非 CFS 资源时返回）</li><li>COS_AGENT： COS 资源（非 CFS 资源时返回）</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProductType() {
        return this.ProductType;
    }

    /**
     * Set <p>产品存储类型。CFS 资源返回文件系统存储类型；非 CFS 资源无存储类型，返回资源类型标识。</p><p>枚举值：</p><ul><li>SD： 文件系统通用标准型存储</li><li>HP： 文件系统通用性能性存储</li><li>TB： 文件系统Turbo标准型存储</li><li>TP： 文件系统Turbo性能型存储</li><li>THP： 文件系统Turbo吞吐型存储</li><li>CVM_AGENT： CVM 资源（非 CFS 资源时返回）</li><li>COS_AGENT： COS 资源（非 CFS 资源时返回）</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProductType <p>产品存储类型。CFS 资源返回文件系统存储类型；非 CFS 资源无存储类型，返回资源类型标识。</p><p>枚举值：</p><ul><li>SD： 文件系统通用标准型存储</li><li>HP： 文件系统通用性能性存储</li><li>TB： 文件系统Turbo标准型存储</li><li>TP： 文件系统Turbo性能型存储</li><li>THP： 文件系统Turbo吞吐型存储</li><li>CVM_AGENT： CVM 资源（非 CFS 资源时返回）</li><li>COS_AGENT： COS 资源（非 CFS 资源时返回）</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProductType(String ProductType) {
        this.ProductType = ProductType;
    }

    /**
     * Get <p>备份完成量</p><p>单位：MB</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BackupCompletedSize <p>备份完成量</p><p>单位：MB</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBackupCompletedSize() {
        return this.BackupCompletedSize;
    }

    /**
     * Set <p>备份完成量</p><p>单位：MB</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BackupCompletedSize <p>备份完成量</p><p>单位：MB</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBackupCompletedSize(Long BackupCompletedSize) {
        this.BackupCompletedSize = BackupCompletedSize;
    }

    /**
     * Get <p>备份完成量</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BackupCompletedSizeFormatted <p>备份完成量</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBackupCompletedSizeFormatted() {
        return this.BackupCompletedSizeFormatted;
    }

    /**
     * Set <p>备份完成量</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BackupCompletedSizeFormatted <p>备份完成量</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBackupCompletedSizeFormatted(String BackupCompletedSizeFormatted) {
        this.BackupCompletedSizeFormatted = BackupCompletedSizeFormatted;
    }

    public BackupInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BackupInfo(BackupInfo source) {
        if (source.BackupId != null) {
            this.BackupId = new String(source.BackupId);
        }
        if (source.BackupName != null) {
            this.BackupName = new String(source.BackupName);
        }
        if (source.PlanId != null) {
            this.PlanId = new String(source.PlanId);
        }
        if (source.AspInstanceId != null) {
            this.AspInstanceId = new String(source.AspInstanceId);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.BackupPaths != null) {
            this.BackupPaths = new String[source.BackupPaths.length];
            for (int i = 0; i < source.BackupPaths.length; i++) {
                this.BackupPaths[i] = new String(source.BackupPaths[i]);
            }
        }
        if (source.IncludeFileTypes != null) {
            this.IncludeFileTypes = new String[source.IncludeFileTypes.length];
            for (int i = 0; i < source.IncludeFileTypes.length; i++) {
                this.IncludeFileTypes[i] = new String(source.IncludeFileTypes[i]);
            }
        }
        if (source.ExcludePatterns != null) {
            this.ExcludePatterns = new String[source.ExcludePatterns.length];
            for (int i = 0; i < source.ExcludePatterns.length; i++) {
                this.ExcludePatterns[i] = new String(source.ExcludePatterns[i]);
            }
        }
        if (source.ExcludeSystemDirectories != null) {
            this.ExcludeSystemDirectories = new Boolean(source.ExcludeSystemDirectories);
        }
        if (source.VaultId != null) {
            this.VaultId = new String(source.VaultId);
        }
        if (source.ScannedFileCount != null) {
            this.ScannedFileCount = new Long(source.ScannedFileCount);
        }
        if (source.ScannedSize != null) {
            this.ScannedSize = new Long(source.ScannedSize);
        }
        if (source.ScannedSizeFormatted != null) {
            this.ScannedSizeFormatted = new String(source.ScannedSizeFormatted);
        }
        if (source.BackupFileCount != null) {
            this.BackupFileCount = new Long(source.BackupFileCount);
        }
        if (source.BackupSize != null) {
            this.BackupSize = new Long(source.BackupSize);
        }
        if (source.BackupSizeFormatted != null) {
            this.BackupSizeFormatted = new String(source.BackupSizeFormatted);
        }
        if (source.Progress != null) {
            this.Progress = new Float(source.Progress);
        }
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.IsPermanent != null) {
            this.IsPermanent = new Boolean(source.IsPermanent);
        }
        if (source.Deadline != null) {
            this.Deadline = new String(source.Deadline);
        }
        if (source.NonExistSourcePaths != null) {
            this.NonExistSourcePaths = new String[source.NonExistSourcePaths.length];
            for (int i = 0; i < source.NonExistSourcePaths.length; i++) {
                this.NonExistSourcePaths[i] = new String(source.NonExistSourcePaths[i]);
            }
        }
        if (source.FailReason != null) {
            this.FailReason = new String(source.FailReason);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.IsInventoryPending != null) {
            this.IsInventoryPending = new Boolean(source.IsInventoryPending);
        }
        if (source.EnableObjectAcl != null) {
            this.EnableObjectAcl = new Boolean(source.EnableObjectAcl);
        }
        if (source.EnableObjectTags != null) {
            this.EnableObjectTags = new Boolean(source.EnableObjectTags);
        }
        if (source.CloudResourceId != null) {
            this.CloudResourceId = new String(source.CloudResourceId);
        }
        if (source.ProductType != null) {
            this.ProductType = new String(source.ProductType);
        }
        if (source.BackupCompletedSize != null) {
            this.BackupCompletedSize = new Long(source.BackupCompletedSize);
        }
        if (source.BackupCompletedSizeFormatted != null) {
            this.BackupCompletedSizeFormatted = new String(source.BackupCompletedSizeFormatted);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BackupId", this.BackupId);
        this.setParamSimple(map, prefix + "BackupName", this.BackupName);
        this.setParamSimple(map, prefix + "PlanId", this.PlanId);
        this.setParamSimple(map, prefix + "AspInstanceId", this.AspInstanceId);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "BackupPaths.", this.BackupPaths);
        this.setParamArraySimple(map, prefix + "IncludeFileTypes.", this.IncludeFileTypes);
        this.setParamArraySimple(map, prefix + "ExcludePatterns.", this.ExcludePatterns);
        this.setParamSimple(map, prefix + "ExcludeSystemDirectories", this.ExcludeSystemDirectories);
        this.setParamSimple(map, prefix + "VaultId", this.VaultId);
        this.setParamSimple(map, prefix + "ScannedFileCount", this.ScannedFileCount);
        this.setParamSimple(map, prefix + "ScannedSize", this.ScannedSize);
        this.setParamSimple(map, prefix + "ScannedSizeFormatted", this.ScannedSizeFormatted);
        this.setParamSimple(map, prefix + "BackupFileCount", this.BackupFileCount);
        this.setParamSimple(map, prefix + "BackupSize", this.BackupSize);
        this.setParamSimple(map, prefix + "BackupSizeFormatted", this.BackupSizeFormatted);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "IsPermanent", this.IsPermanent);
        this.setParamSimple(map, prefix + "Deadline", this.Deadline);
        this.setParamArraySimple(map, prefix + "NonExistSourcePaths.", this.NonExistSourcePaths);
        this.setParamSimple(map, prefix + "FailReason", this.FailReason);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "IsInventoryPending", this.IsInventoryPending);
        this.setParamSimple(map, prefix + "EnableObjectAcl", this.EnableObjectAcl);
        this.setParamSimple(map, prefix + "EnableObjectTags", this.EnableObjectTags);
        this.setParamSimple(map, prefix + "CloudResourceId", this.CloudResourceId);
        this.setParamSimple(map, prefix + "ProductType", this.ProductType);
        this.setParamSimple(map, prefix + "BackupCompletedSize", this.BackupCompletedSize);
        this.setParamSimple(map, prefix + "BackupCompletedSizeFormatted", this.BackupCompletedSizeFormatted);

    }
}

