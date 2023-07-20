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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DrInstanceOpsDto extends AbstractModel{

    /**
    * 任务来源
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskSource")
    @Expose
    private String TaskSource;

    /**
    * 编排空间jobId
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * 任务提交记录Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RecordId")
    @Expose
    private Long RecordId;

    /**
    * 子任务记录id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SonRecordId")
    @Expose
    private Long SonRecordId;

    /**
    * 任务实例Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 编排空间为任务id, 开发空间为脚本id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 脚本cos地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RemotePath")
    @Expose
    private String RemotePath;

    /**
    * 试运行内容
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScriptContent")
    @Expose
    private String ScriptContent;

    /**
    * 任务提交时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 任务启动时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 运行时长(秒)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Duration")
    @Expose
    private String Duration;

    /**
    * 试运行状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 编排空间为任务名称，开发空间为脚本名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * 试运行提交人
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubmitUserName")
    @Expose
    private String SubmitUserName;

    /**
    * 试运行提交人userId
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubmitUserId")
    @Expose
    private String SubmitUserId;

    /**
    * 任务类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * 是否含有结果集
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HasResultSet")
    @Expose
    private Boolean HasResultSet;

    /**
     * Get 任务来源
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskSource 任务来源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskSource() {
        return this.TaskSource;
    }

    /**
     * Set 任务来源
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskSource 任务来源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskSource(String TaskSource) {
        this.TaskSource = TaskSource;
    }

    /**
     * Get 编排空间jobId
注意：此字段可能返回 null，表示取不到有效值。 
     * @return JobId 编排空间jobId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set 编排空间jobId
注意：此字段可能返回 null，表示取不到有效值。
     * @param JobId 编排空间jobId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get 任务提交记录Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RecordId 任务提交记录Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRecordId() {
        return this.RecordId;
    }

    /**
     * Set 任务提交记录Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param RecordId 任务提交记录Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRecordId(Long RecordId) {
        this.RecordId = RecordId;
    }

    /**
     * Get 子任务记录id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SonRecordId 子任务记录id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSonRecordId() {
        return this.SonRecordId;
    }

    /**
     * Set 子任务记录id
注意：此字段可能返回 null，表示取不到有效值。
     * @param SonRecordId 子任务记录id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSonRecordId(Long SonRecordId) {
        this.SonRecordId = SonRecordId;
    }

    /**
     * Get 任务实例Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceId 任务实例Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 任务实例Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceId 任务实例Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 编排空间为任务id, 开发空间为脚本id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskId 编排空间为任务id, 开发空间为脚本id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 编排空间为任务id, 开发空间为脚本id
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskId 编排空间为任务id, 开发空间为脚本id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 脚本cos地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RemotePath 脚本cos地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRemotePath() {
        return this.RemotePath;
    }

    /**
     * Set 脚本cos地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param RemotePath 脚本cos地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemotePath(String RemotePath) {
        this.RemotePath = RemotePath;
    }

    /**
     * Get 试运行内容
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScriptContent 试运行内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getScriptContent() {
        return this.ScriptContent;
    }

    /**
     * Set 试运行内容
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScriptContent 试运行内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScriptContent(String ScriptContent) {
        this.ScriptContent = ScriptContent;
    }

    /**
     * Get 任务提交时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 任务提交时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 任务提交时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 任务提交时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 任务启动时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartTime 任务启动时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 任务启动时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartTime 任务启动时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 运行时长(秒)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Duration 运行时长(秒)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDuration() {
        return this.Duration;
    }

    /**
     * Set 运行时长(秒)
注意：此字段可能返回 null，表示取不到有效值。
     * @param Duration 运行时长(秒)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDuration(String Duration) {
        this.Duration = Duration;
    }

    /**
     * Get 试运行状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 试运行状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 试运行状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 试运行状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 编排空间为任务名称，开发空间为脚本名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskName 编排空间为任务名称，开发空间为脚本名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set 编排空间为任务名称，开发空间为脚本名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskName 编排空间为任务名称，开发空间为脚本名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get 试运行提交人
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubmitUserName 试运行提交人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubmitUserName() {
        return this.SubmitUserName;
    }

    /**
     * Set 试运行提交人
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubmitUserName 试运行提交人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubmitUserName(String SubmitUserName) {
        this.SubmitUserName = SubmitUserName;
    }

    /**
     * Get 试运行提交人userId
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubmitUserId 试运行提交人userId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubmitUserId() {
        return this.SubmitUserId;
    }

    /**
     * Set 试运行提交人userId
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubmitUserId 试运行提交人userId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubmitUserId(String SubmitUserId) {
        this.SubmitUserId = SubmitUserId;
    }

    /**
     * Get 任务类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskType 任务类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 任务类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskType 任务类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get 是否含有结果集
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HasResultSet 是否含有结果集
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getHasResultSet() {
        return this.HasResultSet;
    }

    /**
     * Set 是否含有结果集
注意：此字段可能返回 null，表示取不到有效值。
     * @param HasResultSet 是否含有结果集
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHasResultSet(Boolean HasResultSet) {
        this.HasResultSet = HasResultSet;
    }

    public DrInstanceOpsDto() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DrInstanceOpsDto(DrInstanceOpsDto source) {
        if (source.TaskSource != null) {
            this.TaskSource = new String(source.TaskSource);
        }
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.RecordId != null) {
            this.RecordId = new Long(source.RecordId);
        }
        if (source.SonRecordId != null) {
            this.SonRecordId = new Long(source.SonRecordId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.RemotePath != null) {
            this.RemotePath = new String(source.RemotePath);
        }
        if (source.ScriptContent != null) {
            this.ScriptContent = new String(source.ScriptContent);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.Duration != null) {
            this.Duration = new String(source.Duration);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.SubmitUserName != null) {
            this.SubmitUserName = new String(source.SubmitUserName);
        }
        if (source.SubmitUserId != null) {
            this.SubmitUserId = new String(source.SubmitUserId);
        }
        if (source.TaskType != null) {
            this.TaskType = new String(source.TaskType);
        }
        if (source.HasResultSet != null) {
            this.HasResultSet = new Boolean(source.HasResultSet);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskSource", this.TaskSource);
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "RecordId", this.RecordId);
        this.setParamSimple(map, prefix + "SonRecordId", this.SonRecordId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "RemotePath", this.RemotePath);
        this.setParamSimple(map, prefix + "ScriptContent", this.ScriptContent);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "SubmitUserName", this.SubmitUserName);
        this.setParamSimple(map, prefix + "SubmitUserId", this.SubmitUserId);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "HasResultSet", this.HasResultSet);

    }
}

