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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RestoreStatus extends AbstractModel {

    /**
    * 恢复任务id
    */
    @SerializedName("JobId")
    @Expose
    private Long JobId;

    /**
    * 恢复任务标签
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * 恢复任务时间戳
    */
    @SerializedName("Timestamp")
    @Expose
    private String Timestamp;

    /**
    * 恢复任务所在库
    */
    @SerializedName("DbName")
    @Expose
    private String DbName;

    /**
    * 恢复任务状态
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * 恢复时是否允许导入
    */
    @SerializedName("AllowLoad")
    @Expose
    private Boolean AllowLoad;

    /**
    * 副本数
    */
    @SerializedName("ReplicationNum")
    @Expose
    private String ReplicationNum;

    /**
    * 副本数
    */
    @SerializedName("ReplicaAllocation")
    @Expose
    private String ReplicaAllocation;

    /**
    * 恢复对象
    */
    @SerializedName("RestoreObjects")
    @Expose
    private String RestoreObjects;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 元数据准备时间
    */
    @SerializedName("MetaPreparedTime")
    @Expose
    private String MetaPreparedTime;

    /**
    * 快照结束时间
    */
    @SerializedName("SnapshotFinishedTime")
    @Expose
    private String SnapshotFinishedTime;

    /**
    * 下载结束时间
    */
    @SerializedName("DownloadFinishedTime")
    @Expose
    private String DownloadFinishedTime;

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
    * 作业超时时间
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
    * 是否保持源表中的副本数
    */
    @SerializedName("ReserveReplica")
    @Expose
    private Boolean ReserveReplica;

    /**
    * 是否保持源表中的动态分区
    */
    @SerializedName("ReserveDynamicPartitionEnable")
    @Expose
    private Boolean ReserveDynamicPartitionEnable;

    /**
    * 备份实例id
    */
    @SerializedName("BackupJobId")
    @Expose
    private Long BackupJobId;

    /**
    * 实例对应snapshot的id
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
     * Get 恢复任务id 
     * @return JobId 恢复任务id
     */
    public Long getJobId() {
        return this.JobId;
    }

    /**
     * Set 恢复任务id
     * @param JobId 恢复任务id
     */
    public void setJobId(Long JobId) {
        this.JobId = JobId;
    }

    /**
     * Get 恢复任务标签 
     * @return Label 恢复任务标签
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set 恢复任务标签
     * @param Label 恢复任务标签
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get 恢复任务时间戳 
     * @return Timestamp 恢复任务时间戳
     */
    public String getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set 恢复任务时间戳
     * @param Timestamp 恢复任务时间戳
     */
    public void setTimestamp(String Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get 恢复任务所在库 
     * @return DbName 恢复任务所在库
     */
    public String getDbName() {
        return this.DbName;
    }

    /**
     * Set 恢复任务所在库
     * @param DbName 恢复任务所在库
     */
    public void setDbName(String DbName) {
        this.DbName = DbName;
    }

    /**
     * Get 恢复任务状态 
     * @return State 恢复任务状态
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set 恢复任务状态
     * @param State 恢复任务状态
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get 恢复时是否允许导入 
     * @return AllowLoad 恢复时是否允许导入
     */
    public Boolean getAllowLoad() {
        return this.AllowLoad;
    }

    /**
     * Set 恢复时是否允许导入
     * @param AllowLoad 恢复时是否允许导入
     */
    public void setAllowLoad(Boolean AllowLoad) {
        this.AllowLoad = AllowLoad;
    }

    /**
     * Get 副本数 
     * @return ReplicationNum 副本数
     */
    public String getReplicationNum() {
        return this.ReplicationNum;
    }

    /**
     * Set 副本数
     * @param ReplicationNum 副本数
     */
    public void setReplicationNum(String ReplicationNum) {
        this.ReplicationNum = ReplicationNum;
    }

    /**
     * Get 副本数 
     * @return ReplicaAllocation 副本数
     */
    public String getReplicaAllocation() {
        return this.ReplicaAllocation;
    }

    /**
     * Set 副本数
     * @param ReplicaAllocation 副本数
     */
    public void setReplicaAllocation(String ReplicaAllocation) {
        this.ReplicaAllocation = ReplicaAllocation;
    }

    /**
     * Get 恢复对象 
     * @return RestoreObjects 恢复对象
     */
    public String getRestoreObjects() {
        return this.RestoreObjects;
    }

    /**
     * Set 恢复对象
     * @param RestoreObjects 恢复对象
     */
    public void setRestoreObjects(String RestoreObjects) {
        this.RestoreObjects = RestoreObjects;
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
     * Get 元数据准备时间 
     * @return MetaPreparedTime 元数据准备时间
     */
    public String getMetaPreparedTime() {
        return this.MetaPreparedTime;
    }

    /**
     * Set 元数据准备时间
     * @param MetaPreparedTime 元数据准备时间
     */
    public void setMetaPreparedTime(String MetaPreparedTime) {
        this.MetaPreparedTime = MetaPreparedTime;
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
     * Get 下载结束时间 
     * @return DownloadFinishedTime 下载结束时间
     */
    public String getDownloadFinishedTime() {
        return this.DownloadFinishedTime;
    }

    /**
     * Set 下载结束时间
     * @param DownloadFinishedTime 下载结束时间
     */
    public void setDownloadFinishedTime(String DownloadFinishedTime) {
        this.DownloadFinishedTime = DownloadFinishedTime;
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
     * Get 作业超时时间 
     * @return Timeout 作业超时时间
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set 作业超时时间
     * @param Timeout 作业超时时间
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get 是否保持源表中的副本数 
     * @return ReserveReplica 是否保持源表中的副本数
     */
    public Boolean getReserveReplica() {
        return this.ReserveReplica;
    }

    /**
     * Set 是否保持源表中的副本数
     * @param ReserveReplica 是否保持源表中的副本数
     */
    public void setReserveReplica(Boolean ReserveReplica) {
        this.ReserveReplica = ReserveReplica;
    }

    /**
     * Get 是否保持源表中的动态分区 
     * @return ReserveDynamicPartitionEnable 是否保持源表中的动态分区
     */
    public Boolean getReserveDynamicPartitionEnable() {
        return this.ReserveDynamicPartitionEnable;
    }

    /**
     * Set 是否保持源表中的动态分区
     * @param ReserveDynamicPartitionEnable 是否保持源表中的动态分区
     */
    public void setReserveDynamicPartitionEnable(Boolean ReserveDynamicPartitionEnable) {
        this.ReserveDynamicPartitionEnable = ReserveDynamicPartitionEnable;
    }

    /**
     * Get 备份实例id 
     * @return BackupJobId 备份实例id
     */
    public Long getBackupJobId() {
        return this.BackupJobId;
    }

    /**
     * Set 备份实例id
     * @param BackupJobId 备份实例id
     */
    public void setBackupJobId(Long BackupJobId) {
        this.BackupJobId = BackupJobId;
    }

    /**
     * Get 实例对应snapshot的id 
     * @return TaskId 实例对应snapshot的id
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 实例对应snapshot的id
     * @param TaskId 实例对应snapshot的id
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    public RestoreStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RestoreStatus(RestoreStatus source) {
        if (source.JobId != null) {
            this.JobId = new Long(source.JobId);
        }
        if (source.Label != null) {
            this.Label = new String(source.Label);
        }
        if (source.Timestamp != null) {
            this.Timestamp = new String(source.Timestamp);
        }
        if (source.DbName != null) {
            this.DbName = new String(source.DbName);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.AllowLoad != null) {
            this.AllowLoad = new Boolean(source.AllowLoad);
        }
        if (source.ReplicationNum != null) {
            this.ReplicationNum = new String(source.ReplicationNum);
        }
        if (source.ReplicaAllocation != null) {
            this.ReplicaAllocation = new String(source.ReplicaAllocation);
        }
        if (source.RestoreObjects != null) {
            this.RestoreObjects = new String(source.RestoreObjects);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.MetaPreparedTime != null) {
            this.MetaPreparedTime = new String(source.MetaPreparedTime);
        }
        if (source.SnapshotFinishedTime != null) {
            this.SnapshotFinishedTime = new String(source.SnapshotFinishedTime);
        }
        if (source.DownloadFinishedTime != null) {
            this.DownloadFinishedTime = new String(source.DownloadFinishedTime);
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
        if (source.ReserveReplica != null) {
            this.ReserveReplica = new Boolean(source.ReserveReplica);
        }
        if (source.ReserveDynamicPartitionEnable != null) {
            this.ReserveDynamicPartitionEnable = new Boolean(source.ReserveDynamicPartitionEnable);
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
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamSimple(map, prefix + "DbName", this.DbName);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "AllowLoad", this.AllowLoad);
        this.setParamSimple(map, prefix + "ReplicationNum", this.ReplicationNum);
        this.setParamSimple(map, prefix + "ReplicaAllocation", this.ReplicaAllocation);
        this.setParamSimple(map, prefix + "RestoreObjects", this.RestoreObjects);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "MetaPreparedTime", this.MetaPreparedTime);
        this.setParamSimple(map, prefix + "SnapshotFinishedTime", this.SnapshotFinishedTime);
        this.setParamSimple(map, prefix + "DownloadFinishedTime", this.DownloadFinishedTime);
        this.setParamSimple(map, prefix + "FinishedTime", this.FinishedTime);
        this.setParamSimple(map, prefix + "UnfinishedTasks", this.UnfinishedTasks);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "TaskErrMsg", this.TaskErrMsg);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);
        this.setParamSimple(map, prefix + "ReserveReplica", this.ReserveReplica);
        this.setParamSimple(map, prefix + "ReserveDynamicPartitionEnable", this.ReserveDynamicPartitionEnable);
        this.setParamSimple(map, prefix + "BackupJobId", this.BackupJobId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);

    }
}

