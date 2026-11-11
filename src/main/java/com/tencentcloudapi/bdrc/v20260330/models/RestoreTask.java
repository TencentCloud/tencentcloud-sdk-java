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

public class RestoreTask extends AbstractModel {

    /**
    * <p>恢复任务 ID</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>关联备份点 ID</p>
    */
    @SerializedName("BackupId")
    @Expose
    private String BackupId;

    /**
    * <p>源实例 ID</p>
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * <p>目标实例 ID</p>
    */
    @SerializedName("TargetResourceId")
    @Expose
    private String TargetResourceId;

    /**
    * <p>恢复路径列表</p>
    */
    @SerializedName("RestorePaths")
    @Expose
    private String [] RestorePaths;

    /**
    * <p>目标恢复位置</p>
    */
    @SerializedName("TargetLocation")
    @Expose
    private String TargetLocation;

    /**
    * <p>任务状态</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>需恢复文件总数</p>
    */
    @SerializedName("TotalFileCount")
    @Expose
    private Long TotalFileCount;

    /**
    * <p>需恢复数据总量（字节）</p>
    */
    @SerializedName("TotalSize")
    @Expose
    private Long TotalSize;

    /**
    * <p>需恢复数据总量（格式化：1024 进制，保留两位小数，单位 B/KiB/MiB/GiB/TiB/PiB，如 &quot;1.50 GiB&quot;）</p>
    */
    @SerializedName("TotalSizeFormatted")
    @Expose
    private String TotalSizeFormatted;

    /**
    * <p>已恢复文件数</p>
    */
    @SerializedName("RestoreFileCount")
    @Expose
    private Long RestoreFileCount;

    /**
    * <p>已恢复数据量（字节）</p>
    */
    @SerializedName("RestoreSize")
    @Expose
    private Long RestoreSize;

    /**
    * <p>已恢复数据量（格式化，口径同 TotalSizeFormatted，如 &quot;512.00 MiB&quot;）</p>
    */
    @SerializedName("RestoreSizeFormatted")
    @Expose
    private String RestoreSizeFormatted;

    /**
    * <p>恢复进度（0-100）</p>
    */
    @SerializedName("Progress")
    @Expose
    private Float Progress;

    /**
    * <p>关联 Job ID</p>
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * <p>任务开始时间（ISO 格式）</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>任务结束时间</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>任务创建时间</p>
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * <p>恢复任务失败原因</p>
    */
    @SerializedName("FailReason")
    @Expose
    private String FailReason;

    /**
    * <p>冲突处理策略：skip-跳过/overwrite-覆盖/newer-保留最新版本/if_changed-内容变化时覆盖</p>
    */
    @SerializedName("ConflictStrategy")
    @Expose
    private String ConflictStrategy;

    /**
    * <p>是否为原路径恢复</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsOriginalPath")
    @Expose
    private Boolean IsOriginalPath;

    /**
    * <p>源端腾讯云资源ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CloudResourceId")
    @Expose
    private String CloudResourceId;

    /**
    * <p>目标端腾讯云资源ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetCloudResourceId")
    @Expose
    private String TargetCloudResourceId;

    /**
     * Get <p>恢复任务 ID</p> 
     * @return TaskId <p>恢复任务 ID</p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>恢复任务 ID</p>
     * @param TaskId <p>恢复任务 ID</p>
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>关联备份点 ID</p> 
     * @return BackupId <p>关联备份点 ID</p>
     */
    public String getBackupId() {
        return this.BackupId;
    }

    /**
     * Set <p>关联备份点 ID</p>
     * @param BackupId <p>关联备份点 ID</p>
     */
    public void setBackupId(String BackupId) {
        this.BackupId = BackupId;
    }

    /**
     * Get <p>源实例 ID</p> 
     * @return ResourceId <p>源实例 ID</p>
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set <p>源实例 ID</p>
     * @param ResourceId <p>源实例 ID</p>
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get <p>目标实例 ID</p> 
     * @return TargetResourceId <p>目标实例 ID</p>
     */
    public String getTargetResourceId() {
        return this.TargetResourceId;
    }

    /**
     * Set <p>目标实例 ID</p>
     * @param TargetResourceId <p>目标实例 ID</p>
     */
    public void setTargetResourceId(String TargetResourceId) {
        this.TargetResourceId = TargetResourceId;
    }

    /**
     * Get <p>恢复路径列表</p> 
     * @return RestorePaths <p>恢复路径列表</p>
     */
    public String [] getRestorePaths() {
        return this.RestorePaths;
    }

    /**
     * Set <p>恢复路径列表</p>
     * @param RestorePaths <p>恢复路径列表</p>
     */
    public void setRestorePaths(String [] RestorePaths) {
        this.RestorePaths = RestorePaths;
    }

    /**
     * Get <p>目标恢复位置</p> 
     * @return TargetLocation <p>目标恢复位置</p>
     */
    public String getTargetLocation() {
        return this.TargetLocation;
    }

    /**
     * Set <p>目标恢复位置</p>
     * @param TargetLocation <p>目标恢复位置</p>
     */
    public void setTargetLocation(String TargetLocation) {
        this.TargetLocation = TargetLocation;
    }

    /**
     * Get <p>任务状态</p> 
     * @return Status <p>任务状态</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>任务状态</p>
     * @param Status <p>任务状态</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>需恢复文件总数</p> 
     * @return TotalFileCount <p>需恢复文件总数</p>
     */
    public Long getTotalFileCount() {
        return this.TotalFileCount;
    }

    /**
     * Set <p>需恢复文件总数</p>
     * @param TotalFileCount <p>需恢复文件总数</p>
     */
    public void setTotalFileCount(Long TotalFileCount) {
        this.TotalFileCount = TotalFileCount;
    }

    /**
     * Get <p>需恢复数据总量（字节）</p> 
     * @return TotalSize <p>需恢复数据总量（字节）</p>
     */
    public Long getTotalSize() {
        return this.TotalSize;
    }

    /**
     * Set <p>需恢复数据总量（字节）</p>
     * @param TotalSize <p>需恢复数据总量（字节）</p>
     */
    public void setTotalSize(Long TotalSize) {
        this.TotalSize = TotalSize;
    }

    /**
     * Get <p>需恢复数据总量（格式化：1024 进制，保留两位小数，单位 B/KiB/MiB/GiB/TiB/PiB，如 &quot;1.50 GiB&quot;）</p> 
     * @return TotalSizeFormatted <p>需恢复数据总量（格式化：1024 进制，保留两位小数，单位 B/KiB/MiB/GiB/TiB/PiB，如 &quot;1.50 GiB&quot;）</p>
     */
    public String getTotalSizeFormatted() {
        return this.TotalSizeFormatted;
    }

    /**
     * Set <p>需恢复数据总量（格式化：1024 进制，保留两位小数，单位 B/KiB/MiB/GiB/TiB/PiB，如 &quot;1.50 GiB&quot;）</p>
     * @param TotalSizeFormatted <p>需恢复数据总量（格式化：1024 进制，保留两位小数，单位 B/KiB/MiB/GiB/TiB/PiB，如 &quot;1.50 GiB&quot;）</p>
     */
    public void setTotalSizeFormatted(String TotalSizeFormatted) {
        this.TotalSizeFormatted = TotalSizeFormatted;
    }

    /**
     * Get <p>已恢复文件数</p> 
     * @return RestoreFileCount <p>已恢复文件数</p>
     */
    public Long getRestoreFileCount() {
        return this.RestoreFileCount;
    }

    /**
     * Set <p>已恢复文件数</p>
     * @param RestoreFileCount <p>已恢复文件数</p>
     */
    public void setRestoreFileCount(Long RestoreFileCount) {
        this.RestoreFileCount = RestoreFileCount;
    }

    /**
     * Get <p>已恢复数据量（字节）</p> 
     * @return RestoreSize <p>已恢复数据量（字节）</p>
     */
    public Long getRestoreSize() {
        return this.RestoreSize;
    }

    /**
     * Set <p>已恢复数据量（字节）</p>
     * @param RestoreSize <p>已恢复数据量（字节）</p>
     */
    public void setRestoreSize(Long RestoreSize) {
        this.RestoreSize = RestoreSize;
    }

    /**
     * Get <p>已恢复数据量（格式化，口径同 TotalSizeFormatted，如 &quot;512.00 MiB&quot;）</p> 
     * @return RestoreSizeFormatted <p>已恢复数据量（格式化，口径同 TotalSizeFormatted，如 &quot;512.00 MiB&quot;）</p>
     */
    public String getRestoreSizeFormatted() {
        return this.RestoreSizeFormatted;
    }

    /**
     * Set <p>已恢复数据量（格式化，口径同 TotalSizeFormatted，如 &quot;512.00 MiB&quot;）</p>
     * @param RestoreSizeFormatted <p>已恢复数据量（格式化，口径同 TotalSizeFormatted，如 &quot;512.00 MiB&quot;）</p>
     */
    public void setRestoreSizeFormatted(String RestoreSizeFormatted) {
        this.RestoreSizeFormatted = RestoreSizeFormatted;
    }

    /**
     * Get <p>恢复进度（0-100）</p> 
     * @return Progress <p>恢复进度（0-100）</p>
     */
    public Float getProgress() {
        return this.Progress;
    }

    /**
     * Set <p>恢复进度（0-100）</p>
     * @param Progress <p>恢复进度（0-100）</p>
     */
    public void setProgress(Float Progress) {
        this.Progress = Progress;
    }

    /**
     * Get <p>关联 Job ID</p> 
     * @return JobId <p>关联 Job ID</p>
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set <p>关联 Job ID</p>
     * @param JobId <p>关联 Job ID</p>
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get <p>任务开始时间（ISO 格式）</p> 
     * @return StartTime <p>任务开始时间（ISO 格式）</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>任务开始时间（ISO 格式）</p>
     * @param StartTime <p>任务开始时间（ISO 格式）</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>任务结束时间</p> 
     * @return EndTime <p>任务结束时间</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>任务结束时间</p>
     * @param EndTime <p>任务结束时间</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>任务创建时间</p> 
     * @return CreatedTime <p>任务创建时间</p>
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set <p>任务创建时间</p>
     * @param CreatedTime <p>任务创建时间</p>
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get <p>恢复任务失败原因</p> 
     * @return FailReason <p>恢复任务失败原因</p>
     */
    public String getFailReason() {
        return this.FailReason;
    }

    /**
     * Set <p>恢复任务失败原因</p>
     * @param FailReason <p>恢复任务失败原因</p>
     */
    public void setFailReason(String FailReason) {
        this.FailReason = FailReason;
    }

    /**
     * Get <p>冲突处理策略：skip-跳过/overwrite-覆盖/newer-保留最新版本/if_changed-内容变化时覆盖</p> 
     * @return ConflictStrategy <p>冲突处理策略：skip-跳过/overwrite-覆盖/newer-保留最新版本/if_changed-内容变化时覆盖</p>
     */
    public String getConflictStrategy() {
        return this.ConflictStrategy;
    }

    /**
     * Set <p>冲突处理策略：skip-跳过/overwrite-覆盖/newer-保留最新版本/if_changed-内容变化时覆盖</p>
     * @param ConflictStrategy <p>冲突处理策略：skip-跳过/overwrite-覆盖/newer-保留最新版本/if_changed-内容变化时覆盖</p>
     */
    public void setConflictStrategy(String ConflictStrategy) {
        this.ConflictStrategy = ConflictStrategy;
    }

    /**
     * Get <p>是否为原路径恢复</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsOriginalPath <p>是否为原路径恢复</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsOriginalPath() {
        return this.IsOriginalPath;
    }

    /**
     * Set <p>是否为原路径恢复</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsOriginalPath <p>是否为原路径恢复</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsOriginalPath(Boolean IsOriginalPath) {
        this.IsOriginalPath = IsOriginalPath;
    }

    /**
     * Get <p>源端腾讯云资源ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CloudResourceId <p>源端腾讯云资源ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCloudResourceId() {
        return this.CloudResourceId;
    }

    /**
     * Set <p>源端腾讯云资源ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CloudResourceId <p>源端腾讯云资源ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCloudResourceId(String CloudResourceId) {
        this.CloudResourceId = CloudResourceId;
    }

    /**
     * Get <p>目标端腾讯云资源ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetCloudResourceId <p>目标端腾讯云资源ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTargetCloudResourceId() {
        return this.TargetCloudResourceId;
    }

    /**
     * Set <p>目标端腾讯云资源ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetCloudResourceId <p>目标端腾讯云资源ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetCloudResourceId(String TargetCloudResourceId) {
        this.TargetCloudResourceId = TargetCloudResourceId;
    }

    public RestoreTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RestoreTask(RestoreTask source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.BackupId != null) {
            this.BackupId = new String(source.BackupId);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.TargetResourceId != null) {
            this.TargetResourceId = new String(source.TargetResourceId);
        }
        if (source.RestorePaths != null) {
            this.RestorePaths = new String[source.RestorePaths.length];
            for (int i = 0; i < source.RestorePaths.length; i++) {
                this.RestorePaths[i] = new String(source.RestorePaths[i]);
            }
        }
        if (source.TargetLocation != null) {
            this.TargetLocation = new String(source.TargetLocation);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.TotalFileCount != null) {
            this.TotalFileCount = new Long(source.TotalFileCount);
        }
        if (source.TotalSize != null) {
            this.TotalSize = new Long(source.TotalSize);
        }
        if (source.TotalSizeFormatted != null) {
            this.TotalSizeFormatted = new String(source.TotalSizeFormatted);
        }
        if (source.RestoreFileCount != null) {
            this.RestoreFileCount = new Long(source.RestoreFileCount);
        }
        if (source.RestoreSize != null) {
            this.RestoreSize = new Long(source.RestoreSize);
        }
        if (source.RestoreSizeFormatted != null) {
            this.RestoreSizeFormatted = new String(source.RestoreSizeFormatted);
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
        if (source.FailReason != null) {
            this.FailReason = new String(source.FailReason);
        }
        if (source.ConflictStrategy != null) {
            this.ConflictStrategy = new String(source.ConflictStrategy);
        }
        if (source.IsOriginalPath != null) {
            this.IsOriginalPath = new Boolean(source.IsOriginalPath);
        }
        if (source.CloudResourceId != null) {
            this.CloudResourceId = new String(source.CloudResourceId);
        }
        if (source.TargetCloudResourceId != null) {
            this.TargetCloudResourceId = new String(source.TargetCloudResourceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "BackupId", this.BackupId);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "TargetResourceId", this.TargetResourceId);
        this.setParamArraySimple(map, prefix + "RestorePaths.", this.RestorePaths);
        this.setParamSimple(map, prefix + "TargetLocation", this.TargetLocation);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "TotalFileCount", this.TotalFileCount);
        this.setParamSimple(map, prefix + "TotalSize", this.TotalSize);
        this.setParamSimple(map, prefix + "TotalSizeFormatted", this.TotalSizeFormatted);
        this.setParamSimple(map, prefix + "RestoreFileCount", this.RestoreFileCount);
        this.setParamSimple(map, prefix + "RestoreSize", this.RestoreSize);
        this.setParamSimple(map, prefix + "RestoreSizeFormatted", this.RestoreSizeFormatted);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "FailReason", this.FailReason);
        this.setParamSimple(map, prefix + "ConflictStrategy", this.ConflictStrategy);
        this.setParamSimple(map, prefix + "IsOriginalPath", this.IsOriginalPath);
        this.setParamSimple(map, prefix + "CloudResourceId", this.CloudResourceId);
        this.setParamSimple(map, prefix + "TargetCloudResourceId", this.TargetCloudResourceId);

    }
}

