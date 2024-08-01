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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BackupStatus extends AbstractModel {

    /**
    * 备份任务id
    */
    @SerializedName("JobId")
    @Expose
    private Long JobId;

    /**
    * 快照名称
    */
    @SerializedName("SnapshotName")
    @Expose
    private String SnapshotName;

    /**
    * 库名
    */
    @SerializedName("DbName")
    @Expose
    private String DbName;

    /**
    * 状态
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * 备份对象
    */
    @SerializedName("BackupObjects")
    @Expose
    private String BackupObjects;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 快照结束时间
    */
    @SerializedName("SnapshotFinishedTime")
    @Expose
    private String SnapshotFinishedTime;

    /**
    * 上传结束时间
    */
    @SerializedName("UploadFinishedTime")
    @Expose
    private String UploadFinishedTime;

    /**
    * 结束时间
    */
    @SerializedName("FinishedTime")
    @Expose
    private String FinishedTime;

    /**
    * 未完成任务
    */
    @SerializedName("UnfinishedTasks")
    @Expose
    private String UnfinishedTasks;

    /**
    * 进度
    */
    @SerializedName("Progress")
    @Expose
    private String Progress;

    /**
    * 错误信息
    */
    @SerializedName("TaskErrMsg")
    @Expose
    private String TaskErrMsg;

    /**
    * 状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 超时信息
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
    * 备份实例id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BackupJobId")
    @Expose
    private Long BackupJobId;

    /**
    * 实例对应snapshoit的id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
     * Get 备份任务id 
     * @return JobId 备份任务id
     */
    public Long getJobId() {
        return this.JobId;
    }

    /**
     * Set 备份任务id
     * @param JobId 备份任务id
     */
    public void setJobId(Long JobId) {
        this.JobId = JobId;
    }

    /**
     * Get 快照名称 
     * @return SnapshotName 快照名称
     */
    public String getSnapshotName() {
        return this.SnapshotName;
    }

    /**
     * Set 快照名称
     * @param SnapshotName 快照名称
     */
    public void setSnapshotName(String SnapshotName) {
        this.SnapshotName = SnapshotName;
    }

    /**
     * Get 库名 
     * @return DbName 库名
     */
    public String getDbName() {
        return this.DbName;
    }

    /**
     * Set 库名
     * @param DbName 库名
     */
    public void setDbName(String DbName) {
        this.DbName = DbName;
    }

    /**
     * Get 状态 
     * @return State 状态
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set 状态
     * @param State 状态
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get 备份对象 
     * @return BackupObjects 备份对象
     */
    public String getBackupObjects() {
        return this.BackupObjects;
    }

    /**
     * Set 备份对象
     * @param BackupObjects 备份对象
     */
    public void setBackupObjects(String BackupObjects) {
        this.BackupObjects = BackupObjects;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 快照结束时间 
     * @return SnapshotFinishedTime 快照结束时间
     */
    public String getSnapshotFinishedTime() {
        return this.SnapshotFinishedTime;
    }

    /**
     * Set 快照结束时间
     * @param SnapshotFinishedTime 快照结束时间
     */
    public void setSnapshotFinishedTime(String SnapshotFinishedTime) {
        this.SnapshotFinishedTime = SnapshotFinishedTime;
    }

    /**
     * Get 上传结束时间 
     * @return UploadFinishedTime 上传结束时间
     */
    public String getUploadFinishedTime() {
        return this.UploadFinishedTime;
    }

    /**
     * Set 上传结束时间
     * @param UploadFinishedTime 上传结束时间
     */
    public void setUploadFinishedTime(String UploadFinishedTime) {
        this.UploadFinishedTime = UploadFinishedTime;
    }

    /**
     * Get 结束时间 
     * @return FinishedTime 结束时间
     */
    public String getFinishedTime() {
        return this.FinishedTime;
    }

    /**
     * Set 结束时间
     * @param FinishedTime 结束时间
     */
    public void setFinishedTime(String FinishedTime) {
        this.FinishedTime = FinishedTime;
    }

    /**
     * Get 未完成任务 
     * @return UnfinishedTasks 未完成任务
     */
    public String getUnfinishedTasks() {
        return this.UnfinishedTasks;
    }

    /**
     * Set 未完成任务
     * @param UnfinishedTasks 未完成任务
     */
    public void setUnfinishedTasks(String UnfinishedTasks) {
        this.UnfinishedTasks = UnfinishedTasks;
    }

    /**
     * Get 进度 
     * @return Progress 进度
     */
    public String getProgress() {
        return this.Progress;
    }

    /**
     * Set 进度
     * @param Progress 进度
     */
    public void setProgress(String Progress) {
        this.Progress = Progress;
    }

    /**
     * Get 错误信息 
     * @return TaskErrMsg 错误信息
     */
    public String getTaskErrMsg() {
        return this.TaskErrMsg;
    }

    /**
     * Set 错误信息
     * @param TaskErrMsg 错误信息
     */
    public void setTaskErrMsg(String TaskErrMsg) {
        this.TaskErrMsg = TaskErrMsg;
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
     * Get 超时信息 
     * @return Timeout 超时信息
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set 超时信息
     * @param Timeout 超时信息
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get 备份实例id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BackupJobId 备份实例id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBackupJobId() {
        return this.BackupJobId;
    }

    /**
     * Set 备份实例id
注意：此字段可能返回 null，表示取不到有效值。
     * @param BackupJobId 备份实例id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBackupJobId(Long BackupJobId) {
        this.BackupJobId = BackupJobId;
    }

    /**
     * Get 实例对应snapshoit的id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskId 实例对应snapshoit的id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 实例对应snapshoit的id
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskId 实例对应snapshoit的id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    public BackupStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BackupStatus(BackupStatus source) {
        if (source.JobId != null) {
            this.JobId = new Long(source.JobId);
        }
        if (source.SnapshotName != null) {
            this.SnapshotName = new String(source.SnapshotName);
        }
        if (source.DbName != null) {
            this.DbName = new String(source.DbName);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.BackupObjects != null) {
            this.BackupObjects = new String(source.BackupObjects);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.SnapshotFinishedTime != null) {
            this.SnapshotFinishedTime = new String(source.SnapshotFinishedTime);
        }
        if (source.UploadFinishedTime != null) {
            this.UploadFinishedTime = new String(source.UploadFinishedTime);
        }
        if (source.FinishedTime != null) {
            this.FinishedTime = new String(source.FinishedTime);
        }
        if (source.UnfinishedTasks != null) {
            this.UnfinishedTasks = new String(source.UnfinishedTasks);
        }
        if (source.Progress != null) {
            this.Progress = new String(source.Progress);
        }
        if (source.TaskErrMsg != null) {
            this.TaskErrMsg = new String(source.TaskErrMsg);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Timeout != null) {
            this.Timeout = new Long(source.Timeout);
        }
        if (source.BackupJobId != null) {
            this.BackupJobId = new Long(source.BackupJobId);
        }
        if (source.TaskId != null) {
            this.TaskId = new Long(source.TaskId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "SnapshotName", this.SnapshotName);
        this.setParamSimple(map, prefix + "DbName", this.DbName);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "BackupObjects", this.BackupObjects);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "SnapshotFinishedTime", this.SnapshotFinishedTime);
        this.setParamSimple(map, prefix + "UploadFinishedTime", this.UploadFinishedTime);
        this.setParamSimple(map, prefix + "FinishedTime", this.FinishedTime);
        this.setParamSimple(map, prefix + "UnfinishedTasks", this.UnfinishedTasks);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "TaskErrMsg", this.TaskErrMsg);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);
        this.setParamSimple(map, prefix + "BackupJobId", this.BackupJobId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);

    }
}

