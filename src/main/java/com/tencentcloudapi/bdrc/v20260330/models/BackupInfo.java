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
    * 备份点ID
    */
    @SerializedName("BackupId")
    @Expose
    private String BackupId;

    /**
    * 备份名称
    */
    @SerializedName("BackupName")
    @Expose
    private String BackupName;

    /**
    * 所属计划ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PlanId")
    @Expose
    private String PlanId;

    /**
    * 策略ID
    */
    @SerializedName("AspInstanceId")
    @Expose
    private String AspInstanceId;

    /**
    * 资源ID
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 备份状态，取值如下：
0 备份完成
1 创建中（备份进行中）
2 部分成功（指定的备份路径中部分目录不存在）
3 恢复中（该备份点正在被恢复任务使用）
92  已取消
98 创建失败
99 已删除
100 删除中

    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 备份路径
    */
    @SerializedName("BackupPaths")
    @Expose
    private String [] BackupPaths;

    /**
    * 包含文件类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IncludeFileTypes")
    @Expose
    private String [] IncludeFileTypes;

    /**
    * 排除路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExcludePatterns")
    @Expose
    private String [] ExcludePatterns;

    /**
    * 是否排除系统目录
    */
    @SerializedName("ExcludeSystemDirectories")
    @Expose
    private Boolean ExcludeSystemDirectories;

    /**
    * 备份库ID
    */
    @SerializedName("VaultId")
    @Expose
    private String VaultId;

    /**
    * 扫描文件数
    */
    @SerializedName("ScannedFileCount")
    @Expose
    private Long ScannedFileCount;

    /**
    * 扫描大小(字节)
    */
    @SerializedName("ScannedSize")
    @Expose
    private Long ScannedSize;

    /**
    * 扫描大小(格式化)
    */
    @SerializedName("ScannedSizeFormatted")
    @Expose
    private String ScannedSizeFormatted;

    /**
    * 已备份文件数量
    */
    @SerializedName("BackupFileCount")
    @Expose
    private Long BackupFileCount;

    /**
    * 已备份大小(字节)
    */
    @SerializedName("BackupSize")
    @Expose
    private Long BackupSize;

    /**
    * 已备份大小(格式化)
    */
    @SerializedName("BackupSizeFormatted")
    @Expose
    private String BackupSizeFormatted;

    /**
    * 备份进度(0-100)
    */
    @SerializedName("Progress")
    @Expose
    private Float Progress;

    /**
    * 任务ID
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * 开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 创建时间
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 是否为永久保留
    */
    @SerializedName("IsPermanent")
    @Expose
    private Boolean IsPermanent;

    /**
    * 到期时间
    */
    @SerializedName("Deadline")
    @Expose
    private String Deadline;

    /**
    * 不存在的路径信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NonExistSourcePaths")
    @Expose
    private String [] NonExistSourcePaths;

    /**
    * 备份失败原因
    */
    @SerializedName("FailReason")
    @Expose
    private String FailReason;

    /**
    * 备份所属AppId
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 备份类型
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
     * Get 备份点ID 
     * @return BackupId 备份点ID
     */
    public String getBackupId() {
        return this.BackupId;
    }

    /**
     * Set 备份点ID
     * @param BackupId 备份点ID
     */
    public void setBackupId(String BackupId) {
        this.BackupId = BackupId;
    }

    /**
     * Get 备份名称 
     * @return BackupName 备份名称
     */
    public String getBackupName() {
        return this.BackupName;
    }

    /**
     * Set 备份名称
     * @param BackupName 备份名称
     */
    public void setBackupName(String BackupName) {
        this.BackupName = BackupName;
    }

    /**
     * Get 所属计划ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PlanId 所属计划ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPlanId() {
        return this.PlanId;
    }

    /**
     * Set 所属计划ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param PlanId 所属计划ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPlanId(String PlanId) {
        this.PlanId = PlanId;
    }

    /**
     * Get 策略ID 
     * @return AspInstanceId 策略ID
     */
    public String getAspInstanceId() {
        return this.AspInstanceId;
    }

    /**
     * Set 策略ID
     * @param AspInstanceId 策略ID
     */
    public void setAspInstanceId(String AspInstanceId) {
        this.AspInstanceId = AspInstanceId;
    }

    /**
     * Get 资源ID 
     * @return ResourceId 资源ID
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源ID
     * @param ResourceId 资源ID
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 备份状态，取值如下：
0 备份完成
1 创建中（备份进行中）
2 部分成功（指定的备份路径中部分目录不存在）
3 恢复中（该备份点正在被恢复任务使用）
92  已取消
98 创建失败
99 已删除
100 删除中
 
     * @return Status 备份状态，取值如下：
0 备份完成
1 创建中（备份进行中）
2 部分成功（指定的备份路径中部分目录不存在）
3 恢复中（该备份点正在被恢复任务使用）
92  已取消
98 创建失败
99 已删除
100 删除中

     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 备份状态，取值如下：
0 备份完成
1 创建中（备份进行中）
2 部分成功（指定的备份路径中部分目录不存在）
3 恢复中（该备份点正在被恢复任务使用）
92  已取消
98 创建失败
99 已删除
100 删除中

     * @param Status 备份状态，取值如下：
0 备份完成
1 创建中（备份进行中）
2 部分成功（指定的备份路径中部分目录不存在）
3 恢复中（该备份点正在被恢复任务使用）
92  已取消
98 创建失败
99 已删除
100 删除中

     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 备份路径 
     * @return BackupPaths 备份路径
     */
    public String [] getBackupPaths() {
        return this.BackupPaths;
    }

    /**
     * Set 备份路径
     * @param BackupPaths 备份路径
     */
    public void setBackupPaths(String [] BackupPaths) {
        this.BackupPaths = BackupPaths;
    }

    /**
     * Get 包含文件类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IncludeFileTypes 包含文件类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getIncludeFileTypes() {
        return this.IncludeFileTypes;
    }

    /**
     * Set 包含文件类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param IncludeFileTypes 包含文件类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIncludeFileTypes(String [] IncludeFileTypes) {
        this.IncludeFileTypes = IncludeFileTypes;
    }

    /**
     * Get 排除路径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExcludePatterns 排除路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getExcludePatterns() {
        return this.ExcludePatterns;
    }

    /**
     * Set 排除路径
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExcludePatterns 排除路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExcludePatterns(String [] ExcludePatterns) {
        this.ExcludePatterns = ExcludePatterns;
    }

    /**
     * Get 是否排除系统目录 
     * @return ExcludeSystemDirectories 是否排除系统目录
     */
    public Boolean getExcludeSystemDirectories() {
        return this.ExcludeSystemDirectories;
    }

    /**
     * Set 是否排除系统目录
     * @param ExcludeSystemDirectories 是否排除系统目录
     */
    public void setExcludeSystemDirectories(Boolean ExcludeSystemDirectories) {
        this.ExcludeSystemDirectories = ExcludeSystemDirectories;
    }

    /**
     * Get 备份库ID 
     * @return VaultId 备份库ID
     */
    public String getVaultId() {
        return this.VaultId;
    }

    /**
     * Set 备份库ID
     * @param VaultId 备份库ID
     */
    public void setVaultId(String VaultId) {
        this.VaultId = VaultId;
    }

    /**
     * Get 扫描文件数 
     * @return ScannedFileCount 扫描文件数
     */
    public Long getScannedFileCount() {
        return this.ScannedFileCount;
    }

    /**
     * Set 扫描文件数
     * @param ScannedFileCount 扫描文件数
     */
    public void setScannedFileCount(Long ScannedFileCount) {
        this.ScannedFileCount = ScannedFileCount;
    }

    /**
     * Get 扫描大小(字节) 
     * @return ScannedSize 扫描大小(字节)
     */
    public Long getScannedSize() {
        return this.ScannedSize;
    }

    /**
     * Set 扫描大小(字节)
     * @param ScannedSize 扫描大小(字节)
     */
    public void setScannedSize(Long ScannedSize) {
        this.ScannedSize = ScannedSize;
    }

    /**
     * Get 扫描大小(格式化) 
     * @return ScannedSizeFormatted 扫描大小(格式化)
     */
    public String getScannedSizeFormatted() {
        return this.ScannedSizeFormatted;
    }

    /**
     * Set 扫描大小(格式化)
     * @param ScannedSizeFormatted 扫描大小(格式化)
     */
    public void setScannedSizeFormatted(String ScannedSizeFormatted) {
        this.ScannedSizeFormatted = ScannedSizeFormatted;
    }

    /**
     * Get 已备份文件数量 
     * @return BackupFileCount 已备份文件数量
     */
    public Long getBackupFileCount() {
        return this.BackupFileCount;
    }

    /**
     * Set 已备份文件数量
     * @param BackupFileCount 已备份文件数量
     */
    public void setBackupFileCount(Long BackupFileCount) {
        this.BackupFileCount = BackupFileCount;
    }

    /**
     * Get 已备份大小(字节) 
     * @return BackupSize 已备份大小(字节)
     */
    public Long getBackupSize() {
        return this.BackupSize;
    }

    /**
     * Set 已备份大小(字节)
     * @param BackupSize 已备份大小(字节)
     */
    public void setBackupSize(Long BackupSize) {
        this.BackupSize = BackupSize;
    }

    /**
     * Get 已备份大小(格式化) 
     * @return BackupSizeFormatted 已备份大小(格式化)
     */
    public String getBackupSizeFormatted() {
        return this.BackupSizeFormatted;
    }

    /**
     * Set 已备份大小(格式化)
     * @param BackupSizeFormatted 已备份大小(格式化)
     */
    public void setBackupSizeFormatted(String BackupSizeFormatted) {
        this.BackupSizeFormatted = BackupSizeFormatted;
    }

    /**
     * Get 备份进度(0-100) 
     * @return Progress 备份进度(0-100)
     */
    public Float getProgress() {
        return this.Progress;
    }

    /**
     * Set 备份进度(0-100)
     * @param Progress 备份进度(0-100)
     */
    public void setProgress(Float Progress) {
        this.Progress = Progress;
    }

    /**
     * Get 任务ID 
     * @return JobId 任务ID
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set 任务ID
     * @param JobId 任务ID
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get 开始时间 
     * @return StartTime 开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间
     * @param StartTime 开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间 
     * @return EndTime 结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间
     * @param EndTime 结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 创建时间 
     * @return CreatedTime 创建时间
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 创建时间
     * @param CreatedTime 创建时间
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 是否为永久保留 
     * @return IsPermanent 是否为永久保留
     */
    public Boolean getIsPermanent() {
        return this.IsPermanent;
    }

    /**
     * Set 是否为永久保留
     * @param IsPermanent 是否为永久保留
     */
    public void setIsPermanent(Boolean IsPermanent) {
        this.IsPermanent = IsPermanent;
    }

    /**
     * Get 到期时间 
     * @return Deadline 到期时间
     */
    public String getDeadline() {
        return this.Deadline;
    }

    /**
     * Set 到期时间
     * @param Deadline 到期时间
     */
    public void setDeadline(String Deadline) {
        this.Deadline = Deadline;
    }

    /**
     * Get 不存在的路径信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NonExistSourcePaths 不存在的路径信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getNonExistSourcePaths() {
        return this.NonExistSourcePaths;
    }

    /**
     * Set 不存在的路径信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param NonExistSourcePaths 不存在的路径信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNonExistSourcePaths(String [] NonExistSourcePaths) {
        this.NonExistSourcePaths = NonExistSourcePaths;
    }

    /**
     * Get 备份失败原因 
     * @return FailReason 备份失败原因
     */
    public String getFailReason() {
        return this.FailReason;
    }

    /**
     * Set 备份失败原因
     * @param FailReason 备份失败原因
     */
    public void setFailReason(String FailReason) {
        this.FailReason = FailReason;
    }

    /**
     * Get 备份所属AppId 
     * @return AppId 备份所属AppId
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set 备份所属AppId
     * @param AppId 备份所属AppId
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 备份类型 
     * @return ResourceType 备份类型
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set 备份类型
     * @param ResourceType 备份类型
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
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

    }
}

