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

public class BackupGroupRollbackTask extends AbstractModel {

    /**
    * 备份组回滚任务
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 源实例ID
    */
    @SerializedName("SourceInstanceId")
    @Expose
    private String SourceInstanceId;

    /**
    * 目标实例ID
    */
    @SerializedName("TargetInstanceId")
    @Expose
    private String TargetInstanceId;

    /**
    * 备份组ID
    */
    @SerializedName("BackupGroupId")
    @Expose
    private String BackupGroupId;

    /**
    * 恢复类型：ORIGINAL-原实例恢复，NEW-新实例恢复
    */
    @SerializedName("RollbackType")
    @Expose
    private String RollbackType;

    /**
    * 任务状态。取值包括"init"、"migrating"、"done"、"failed"。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 进度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Percent")
    @Expose
    private Long Percent;

    /**
    * 开始时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * APP ID
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 备份点名称
    */
    @SerializedName("BackupGroupName")
    @Expose
    private String BackupGroupName;

    /**
    * 恢复失败原因
    */
    @SerializedName("FailReason")
    @Expose
    private String FailReason;

    /**
     * Get 备份组回滚任务 
     * @return TaskId 备份组回滚任务
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 备份组回滚任务
     * @param TaskId 备份组回滚任务
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 源实例ID 
     * @return SourceInstanceId 源实例ID
     */
    public String getSourceInstanceId() {
        return this.SourceInstanceId;
    }

    /**
     * Set 源实例ID
     * @param SourceInstanceId 源实例ID
     */
    public void setSourceInstanceId(String SourceInstanceId) {
        this.SourceInstanceId = SourceInstanceId;
    }

    /**
     * Get 目标实例ID 
     * @return TargetInstanceId 目标实例ID
     */
    public String getTargetInstanceId() {
        return this.TargetInstanceId;
    }

    /**
     * Set 目标实例ID
     * @param TargetInstanceId 目标实例ID
     */
    public void setTargetInstanceId(String TargetInstanceId) {
        this.TargetInstanceId = TargetInstanceId;
    }

    /**
     * Get 备份组ID 
     * @return BackupGroupId 备份组ID
     */
    public String getBackupGroupId() {
        return this.BackupGroupId;
    }

    /**
     * Set 备份组ID
     * @param BackupGroupId 备份组ID
     */
    public void setBackupGroupId(String BackupGroupId) {
        this.BackupGroupId = BackupGroupId;
    }

    /**
     * Get 恢复类型：ORIGINAL-原实例恢复，NEW-新实例恢复 
     * @return RollbackType 恢复类型：ORIGINAL-原实例恢复，NEW-新实例恢复
     */
    public String getRollbackType() {
        return this.RollbackType;
    }

    /**
     * Set 恢复类型：ORIGINAL-原实例恢复，NEW-新实例恢复
     * @param RollbackType 恢复类型：ORIGINAL-原实例恢复，NEW-新实例恢复
     */
    public void setRollbackType(String RollbackType) {
        this.RollbackType = RollbackType;
    }

    /**
     * Get 任务状态。取值包括"init"、"migrating"、"done"、"failed"。 
     * @return Status 任务状态。取值包括"init"、"migrating"、"done"、"failed"。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 任务状态。取值包括"init"、"migrating"、"done"、"failed"。
     * @param Status 任务状态。取值包括"init"、"migrating"、"done"、"failed"。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 进度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Percent 进度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPercent() {
        return this.Percent;
    }

    /**
     * Set 进度
注意：此字段可能返回 null，表示取不到有效值。
     * @param Percent 进度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPercent(Long Percent) {
        this.Percent = Percent;
    }

    /**
     * Get 开始时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartTime 开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartTime 开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndTime 结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTime 结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get APP ID 
     * @return AppId APP ID
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set APP ID
     * @param AppId APP ID
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 备份点名称 
     * @return BackupGroupName 备份点名称
     */
    public String getBackupGroupName() {
        return this.BackupGroupName;
    }

    /**
     * Set 备份点名称
     * @param BackupGroupName 备份点名称
     */
    public void setBackupGroupName(String BackupGroupName) {
        this.BackupGroupName = BackupGroupName;
    }

    /**
     * Get 恢复失败原因 
     * @return FailReason 恢复失败原因
     */
    public String getFailReason() {
        return this.FailReason;
    }

    /**
     * Set 恢复失败原因
     * @param FailReason 恢复失败原因
     */
    public void setFailReason(String FailReason) {
        this.FailReason = FailReason;
    }

    public BackupGroupRollbackTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BackupGroupRollbackTask(BackupGroupRollbackTask source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.SourceInstanceId != null) {
            this.SourceInstanceId = new String(source.SourceInstanceId);
        }
        if (source.TargetInstanceId != null) {
            this.TargetInstanceId = new String(source.TargetInstanceId);
        }
        if (source.BackupGroupId != null) {
            this.BackupGroupId = new String(source.BackupGroupId);
        }
        if (source.RollbackType != null) {
            this.RollbackType = new String(source.RollbackType);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Percent != null) {
            this.Percent = new Long(source.Percent);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.BackupGroupName != null) {
            this.BackupGroupName = new String(source.BackupGroupName);
        }
        if (source.FailReason != null) {
            this.FailReason = new String(source.FailReason);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "SourceInstanceId", this.SourceInstanceId);
        this.setParamSimple(map, prefix + "TargetInstanceId", this.TargetInstanceId);
        this.setParamSimple(map, prefix + "BackupGroupId", this.BackupGroupId);
        this.setParamSimple(map, prefix + "RollbackType", this.RollbackType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Percent", this.Percent);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "BackupGroupName", this.BackupGroupName);
        this.setParamSimple(map, prefix + "FailReason", this.FailReason);

    }
}

