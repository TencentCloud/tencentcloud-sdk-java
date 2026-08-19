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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AiScheduleTaskInfo extends AbstractModel {

    /**
    * <p>任务 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>所属AI 定时任务 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScheduleId")
    @Expose
    private String ScheduleId;

    /**
    * <p>触发该任务的触发器 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TriggerId")
    @Expose
    private String TriggerId;

    /**
    * <p>Agent 调用的唯一会话 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * <p>执行状态。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>Agent 输出结果或错误详情。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Result")
    @Expose
    private String Result;

    /**
    * <p>计划触发时间，Unix 毫秒时间戳。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScheduledTime")
    @Expose
    private Long ScheduledTime;

    /**
    * <p>实际开始执行时间，Unix 毫秒时间戳。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * <p>执行完成时间，Unix 毫秒时间戳。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * <p>创建时间，Unix 毫秒时间戳。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * <p>更新时间，Unix 毫秒时间戳。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * <p>定时任务名称</p>
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * <p>定时任务提示词</p>
    */
    @SerializedName("Prompts")
    @Expose
    private String Prompts;

    /**
     * Get <p>任务 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskId <p>任务 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>任务 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskId <p>任务 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>所属AI 定时任务 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScheduleId <p>所属AI 定时任务 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getScheduleId() {
        return this.ScheduleId;
    }

    /**
     * Set <p>所属AI 定时任务 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScheduleId <p>所属AI 定时任务 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScheduleId(String ScheduleId) {
        this.ScheduleId = ScheduleId;
    }

    /**
     * Get <p>触发该任务的触发器 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TriggerId <p>触发该任务的触发器 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTriggerId() {
        return this.TriggerId;
    }

    /**
     * Set <p>触发该任务的触发器 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TriggerId <p>触发该任务的触发器 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTriggerId(String TriggerId) {
        this.TriggerId = TriggerId;
    }

    /**
     * Get <p>Agent 调用的唯一会话 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SessionId <p>Agent 调用的唯一会话 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set <p>Agent 调用的唯一会话 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SessionId <p>Agent 调用的唯一会话 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get <p>执行状态。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status <p>执行状态。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>执行状态。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status <p>执行状态。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Agent 输出结果或错误详情。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Result <p>Agent 输出结果或错误详情。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResult() {
        return this.Result;
    }

    /**
     * Set <p>Agent 输出结果或错误详情。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Result <p>Agent 输出结果或错误详情。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResult(String Result) {
        this.Result = Result;
    }

    /**
     * Get <p>计划触发时间，Unix 毫秒时间戳。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScheduledTime <p>计划触发时间，Unix 毫秒时间戳。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getScheduledTime() {
        return this.ScheduledTime;
    }

    /**
     * Set <p>计划触发时间，Unix 毫秒时间戳。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScheduledTime <p>计划触发时间，Unix 毫秒时间戳。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScheduledTime(Long ScheduledTime) {
        this.ScheduledTime = ScheduledTime;
    }

    /**
     * Get <p>实际开始执行时间，Unix 毫秒时间戳。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartTime <p>实际开始执行时间，Unix 毫秒时间戳。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>实际开始执行时间，Unix 毫秒时间戳。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartTime <p>实际开始执行时间，Unix 毫秒时间戳。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>执行完成时间，Unix 毫秒时间戳。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndTime <p>执行完成时间，Unix 毫秒时间戳。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>执行完成时间，Unix 毫秒时间戳。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTime <p>执行完成时间，Unix 毫秒时间戳。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>创建时间，Unix 毫秒时间戳。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime <p>创建时间，Unix 毫秒时间戳。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间，Unix 毫秒时间戳。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime <p>创建时间，Unix 毫秒时间戳。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>更新时间，Unix 毫秒时间戳。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime <p>更新时间，Unix 毫秒时间戳。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>更新时间，Unix 毫秒时间戳。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime <p>更新时间，Unix 毫秒时间戳。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>定时任务名称</p> 
     * @return TaskName <p>定时任务名称</p>
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set <p>定时任务名称</p>
     * @param TaskName <p>定时任务名称</p>
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get <p>定时任务提示词</p> 
     * @return Prompts <p>定时任务提示词</p>
     */
    public String getPrompts() {
        return this.Prompts;
    }

    /**
     * Set <p>定时任务提示词</p>
     * @param Prompts <p>定时任务提示词</p>
     */
    public void setPrompts(String Prompts) {
        this.Prompts = Prompts;
    }

    public AiScheduleTaskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AiScheduleTaskInfo(AiScheduleTaskInfo source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.ScheduleId != null) {
            this.ScheduleId = new String(source.ScheduleId);
        }
        if (source.TriggerId != null) {
            this.TriggerId = new String(source.TriggerId);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Result != null) {
            this.Result = new String(source.Result);
        }
        if (source.ScheduledTime != null) {
            this.ScheduledTime = new Long(source.ScheduledTime);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.Prompts != null) {
            this.Prompts = new String(source.Prompts);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "ScheduleId", this.ScheduleId);
        this.setParamSimple(map, prefix + "TriggerId", this.TriggerId);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamSimple(map, prefix + "ScheduledTime", this.ScheduledTime);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "Prompts", this.Prompts);

    }
}

