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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LatestTestRunInfoTask extends AbstractModel {

    /**
    * 任务Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 记录Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RecordId")
    @Expose
    private String RecordId;

    /**
    * 当前时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CurRunDate")
    @Expose
    private String CurRunDate;

    /**
    * 请求任务编号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RequestTaskId")
    @Expose
    private String RequestTaskId;

    /**
    * 任务状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskStatus")
    @Expose
    private String TaskStatus;

    /**
    * 作业编号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * 创建记录用户
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateUser")
    @Expose
    private String CreateUser;

    /**
    * 项目编号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 作业序列编号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SerialNo")
    @Expose
    private String SerialNo;

    /**
     * Get 任务Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskId 任务Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskId 任务Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 记录Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RecordId 记录Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRecordId() {
        return this.RecordId;
    }

    /**
     * Set 记录Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param RecordId 记录Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRecordId(String RecordId) {
        this.RecordId = RecordId;
    }

    /**
     * Get 当前时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CurRunDate 当前时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCurRunDate() {
        return this.CurRunDate;
    }

    /**
     * Set 当前时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CurRunDate 当前时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCurRunDate(String CurRunDate) {
        this.CurRunDate = CurRunDate;
    }

    /**
     * Get 请求任务编号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RequestTaskId 请求任务编号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRequestTaskId() {
        return this.RequestTaskId;
    }

    /**
     * Set 请求任务编号
注意：此字段可能返回 null，表示取不到有效值。
     * @param RequestTaskId 请求任务编号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRequestTaskId(String RequestTaskId) {
        this.RequestTaskId = RequestTaskId;
    }

    /**
     * Get 任务状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskStatus 任务状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * Set 任务状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskStatus 任务状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskStatus(String TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    /**
     * Get 作业编号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return JobId 作业编号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set 作业编号
注意：此字段可能返回 null，表示取不到有效值。
     * @param JobId 作业编号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get 创建记录用户
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateUser 创建记录用户
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateUser() {
        return this.CreateUser;
    }

    /**
     * Set 创建记录用户
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateUser 创建记录用户
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateUser(String CreateUser) {
        this.CreateUser = CreateUser;
    }

    /**
     * Get 项目编号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectId 项目编号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目编号
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectId 项目编号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 作业序列编号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SerialNo 作业序列编号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSerialNo() {
        return this.SerialNo;
    }

    /**
     * Set 作业序列编号
注意：此字段可能返回 null，表示取不到有效值。
     * @param SerialNo 作业序列编号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSerialNo(String SerialNo) {
        this.SerialNo = SerialNo;
    }

    public LatestTestRunInfoTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LatestTestRunInfoTask(LatestTestRunInfoTask source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.RecordId != null) {
            this.RecordId = new String(source.RecordId);
        }
        if (source.CurRunDate != null) {
            this.CurRunDate = new String(source.CurRunDate);
        }
        if (source.RequestTaskId != null) {
            this.RequestTaskId = new String(source.RequestTaskId);
        }
        if (source.TaskStatus != null) {
            this.TaskStatus = new String(source.TaskStatus);
        }
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.CreateUser != null) {
            this.CreateUser = new String(source.CreateUser);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.SerialNo != null) {
            this.SerialNo = new String(source.SerialNo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "RecordId", this.RecordId);
        this.setParamSimple(map, prefix + "CurRunDate", this.CurRunDate);
        this.setParamSimple(map, prefix + "RequestTaskId", this.RequestTaskId);
        this.setParamSimple(map, prefix + "TaskStatus", this.TaskStatus);
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "CreateUser", this.CreateUser);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "SerialNo", this.SerialNo);

    }
}

