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
    * 恢复任务 ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 关联备份点 ID
    */
    @SerializedName("BackupId")
    @Expose
    private String BackupId;

    /**
    * 源实例 ID
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 目标实例 ID
    */
    @SerializedName("TargetResourceId")
    @Expose
    private String TargetResourceId;

    /**
    * 恢复路径列表
    */
    @SerializedName("RestorePaths")
    @Expose
    private String [] RestorePaths;

    /**
    * 目标恢复位置
    */
    @SerializedName("TargetLocation")
    @Expose
    private String TargetLocation;

    /**
    * 任务状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 需恢复文件总数
    */
    @SerializedName("TotalFileCount")
    @Expose
    private Long TotalFileCount;

    /**
    * 需恢复数据总量（字节）
    */
    @SerializedName("TotalSize")
    @Expose
    private Long TotalSize;

    /**
    * 需恢复数据总量（格式化，如 "1.5 GB"）
    */
    @SerializedName("TotalSizeFormatted")
    @Expose
    private String TotalSizeFormatted;

    /**
    * 已恢复文件数
    */
    @SerializedName("RestoreFileCount")
    @Expose
    private Long RestoreFileCount;

    /**
    * 已恢复数据量（字节）
    */
    @SerializedName("RestoreSize")
    @Expose
    private Long RestoreSize;

    /**
    * 已恢复数据量（格式化）
    */
    @SerializedName("RestoreSizeFormatted")
    @Expose
    private String RestoreSizeFormatted;

    /**
    * 恢复进度（0-100）
    */
    @SerializedName("Progress")
    @Expose
    private Float Progress;

    /**
    * 关联 Job ID
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * 任务开始时间（ISO 格式）
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 任务结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 任务创建时间
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 恢复任务失败原因
    */
    @SerializedName("FailReason")
    @Expose
    private String FailReason;

    /**
    * 冲突处理策略：skip-跳过/overwrite-覆盖/newer-保留最新版本/if_changed-内容变化时覆盖
    */
    @SerializedName("ConflictStrategy")
    @Expose
    private String ConflictStrategy;

    /**
     * Get 恢复任务 ID 
     * @return TaskId 恢复任务 ID
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 恢复任务 ID
     * @param TaskId 恢复任务 ID
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 关联备份点 ID 
     * @return BackupId 关联备份点 ID
     */
    public String getBackupId() {
        return this.BackupId;
    }

    /**
     * Set 关联备份点 ID
     * @param BackupId 关联备份点 ID
     */
    public void setBackupId(String BackupId) {
        this.BackupId = BackupId;
    }

    /**
     * Get 源实例 ID 
     * @return ResourceId 源实例 ID
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 源实例 ID
     * @param ResourceId 源实例 ID
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 目标实例 ID 
     * @return TargetResourceId 目标实例 ID
     */
    public String getTargetResourceId() {
        return this.TargetResourceId;
    }

    /**
     * Set 目标实例 ID
     * @param TargetResourceId 目标实例 ID
     */
    public void setTargetResourceId(String TargetResourceId) {
        this.TargetResourceId = TargetResourceId;
    }

    /**
     * Get 恢复路径列表 
     * @return RestorePaths 恢复路径列表
     */
    public String [] getRestorePaths() {
        return this.RestorePaths;
    }

    /**
     * Set 恢复路径列表
     * @param RestorePaths 恢复路径列表
     */
    public void setRestorePaths(String [] RestorePaths) {
        this.RestorePaths = RestorePaths;
    }

    /**
     * Get 目标恢复位置 
     * @return TargetLocation 目标恢复位置
     */
    public String getTargetLocation() {
        return this.TargetLocation;
    }

    /**
     * Set 目标恢复位置
     * @param TargetLocation 目标恢复位置
     */
    public void setTargetLocation(String TargetLocation) {
        this.TargetLocation = TargetLocation;
    }

    /**
     * Get 任务状态 
     * @return Status 任务状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 任务状态
     * @param Status 任务状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 需恢复文件总数 
     * @return TotalFileCount 需恢复文件总数
     */
    public Long getTotalFileCount() {
        return this.TotalFileCount;
    }

    /**
     * Set 需恢复文件总数
     * @param TotalFileCount 需恢复文件总数
     */
    public void setTotalFileCount(Long TotalFileCount) {
        this.TotalFileCount = TotalFileCount;
    }

    /**
     * Get 需恢复数据总量（字节） 
     * @return TotalSize 需恢复数据总量（字节）
     */
    public Long getTotalSize() {
        return this.TotalSize;
    }

    /**
     * Set 需恢复数据总量（字节）
     * @param TotalSize 需恢复数据总量（字节）
     */
    public void setTotalSize(Long TotalSize) {
        this.TotalSize = TotalSize;
    }

    /**
     * Get 需恢复数据总量（格式化，如 "1.5 GB"） 
     * @return TotalSizeFormatted 需恢复数据总量（格式化，如 "1.5 GB"）
     */
    public String getTotalSizeFormatted() {
        return this.TotalSizeFormatted;
    }

    /**
     * Set 需恢复数据总量（格式化，如 "1.5 GB"）
     * @param TotalSizeFormatted 需恢复数据总量（格式化，如 "1.5 GB"）
     */
    public void setTotalSizeFormatted(String TotalSizeFormatted) {
        this.TotalSizeFormatted = TotalSizeFormatted;
    }

    /**
     * Get 已恢复文件数 
     * @return RestoreFileCount 已恢复文件数
     */
    public Long getRestoreFileCount() {
        return this.RestoreFileCount;
    }

    /**
     * Set 已恢复文件数
     * @param RestoreFileCount 已恢复文件数
     */
    public void setRestoreFileCount(Long RestoreFileCount) {
        this.RestoreFileCount = RestoreFileCount;
    }

    /**
     * Get 已恢复数据量（字节） 
     * @return RestoreSize 已恢复数据量（字节）
     */
    public Long getRestoreSize() {
        return this.RestoreSize;
    }

    /**
     * Set 已恢复数据量（字节）
     * @param RestoreSize 已恢复数据量（字节）
     */
    public void setRestoreSize(Long RestoreSize) {
        this.RestoreSize = RestoreSize;
    }

    /**
     * Get 已恢复数据量（格式化） 
     * @return RestoreSizeFormatted 已恢复数据量（格式化）
     */
    public String getRestoreSizeFormatted() {
        return this.RestoreSizeFormatted;
    }

    /**
     * Set 已恢复数据量（格式化）
     * @param RestoreSizeFormatted 已恢复数据量（格式化）
     */
    public void setRestoreSizeFormatted(String RestoreSizeFormatted) {
        this.RestoreSizeFormatted = RestoreSizeFormatted;
    }

    /**
     * Get 恢复进度（0-100） 
     * @return Progress 恢复进度（0-100）
     */
    public Float getProgress() {
        return this.Progress;
    }

    /**
     * Set 恢复进度（0-100）
     * @param Progress 恢复进度（0-100）
     */
    public void setProgress(Float Progress) {
        this.Progress = Progress;
    }

    /**
     * Get 关联 Job ID 
     * @return JobId 关联 Job ID
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set 关联 Job ID
     * @param JobId 关联 Job ID
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get 任务开始时间（ISO 格式） 
     * @return StartTime 任务开始时间（ISO 格式）
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 任务开始时间（ISO 格式）
     * @param StartTime 任务开始时间（ISO 格式）
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 任务结束时间 
     * @return EndTime 任务结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 任务结束时间
     * @param EndTime 任务结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 任务创建时间 
     * @return CreatedTime 任务创建时间
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 任务创建时间
     * @param CreatedTime 任务创建时间
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 恢复任务失败原因 
     * @return FailReason 恢复任务失败原因
     */
    public String getFailReason() {
        return this.FailReason;
    }

    /**
     * Set 恢复任务失败原因
     * @param FailReason 恢复任务失败原因
     */
    public void setFailReason(String FailReason) {
        this.FailReason = FailReason;
    }

    /**
     * Get 冲突处理策略：skip-跳过/overwrite-覆盖/newer-保留最新版本/if_changed-内容变化时覆盖 
     * @return ConflictStrategy 冲突处理策略：skip-跳过/overwrite-覆盖/newer-保留最新版本/if_changed-内容变化时覆盖
     */
    public String getConflictStrategy() {
        return this.ConflictStrategy;
    }

    /**
     * Set 冲突处理策略：skip-跳过/overwrite-覆盖/newer-保留最新版本/if_changed-内容变化时覆盖
     * @param ConflictStrategy 冲突处理策略：skip-跳过/overwrite-覆盖/newer-保留最新版本/if_changed-内容变化时覆盖
     */
    public void setConflictStrategy(String ConflictStrategy) {
        this.ConflictStrategy = ConflictStrategy;
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

    }
}

