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
package com.tencentcloudapi.workbuddyenterprise.v20260709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScheduledTaskLogSummary extends AbstractModel {

    /**
    * <p>执行日志 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LogId")
    @Expose
    private String LogId;

    /**
    * <p>任务唯一标识</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskKey")
    @Expose
    private String TaskKey;

    /**
    * <p>触发类型：MANUAL（手动）/ CRON（定时）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TriggerType")
    @Expose
    private String TriggerType;

    /**
    * <p>执行状态</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>开始时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>结束时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>执行时长（毫秒）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DurationMs")
    @Expose
    private Long DurationMs;

    /**
    * <p>投递状态</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeliveryStatus")
    @Expose
    private String DeliveryStatus;

    /**
    * <p>关联会话 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * <p>失败原因</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorMessage")
    @Expose
    private String ErrorMessage;

    /**
    * <p>会话名称（AgentOS 侧生成的 AI 标题 / 用户改名）；缺失时为空，调用方可兜底展示 SessionId 后缀</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SessionName")
    @Expose
    private String SessionName;

    /**
    * <p>执行结果预览（前 50 字符），仅用于列表页展示；完整结果请调用 DescribeScheduledTaskLog</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Result")
    @Expose
    private String Result;

    /**
     * Get <p>执行日志 ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LogId <p>执行日志 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLogId() {
        return this.LogId;
    }

    /**
     * Set <p>执行日志 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LogId <p>执行日志 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogId(String LogId) {
        this.LogId = LogId;
    }

    /**
     * Get <p>任务唯一标识</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskKey <p>任务唯一标识</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskKey() {
        return this.TaskKey;
    }

    /**
     * Set <p>任务唯一标识</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskKey <p>任务唯一标识</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskKey(String TaskKey) {
        this.TaskKey = TaskKey;
    }

    /**
     * Get <p>触发类型：MANUAL（手动）/ CRON（定时）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TriggerType <p>触发类型：MANUAL（手动）/ CRON（定时）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTriggerType() {
        return this.TriggerType;
    }

    /**
     * Set <p>触发类型：MANUAL（手动）/ CRON（定时）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TriggerType <p>触发类型：MANUAL（手动）/ CRON（定时）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTriggerType(String TriggerType) {
        this.TriggerType = TriggerType;
    }

    /**
     * Get <p>执行状态</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status <p>执行状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>执行状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status <p>执行状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>开始时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartTime <p>开始时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>开始时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartTime <p>开始时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>结束时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndTime <p>结束时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>结束时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTime <p>结束时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>执行时长（毫秒）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DurationMs <p>执行时长（毫秒）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDurationMs() {
        return this.DurationMs;
    }

    /**
     * Set <p>执行时长（毫秒）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DurationMs <p>执行时长（毫秒）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDurationMs(Long DurationMs) {
        this.DurationMs = DurationMs;
    }

    /**
     * Get <p>投递状态</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeliveryStatus <p>投递状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeliveryStatus() {
        return this.DeliveryStatus;
    }

    /**
     * Set <p>投递状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeliveryStatus <p>投递状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeliveryStatus(String DeliveryStatus) {
        this.DeliveryStatus = DeliveryStatus;
    }

    /**
     * Get <p>关联会话 ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SessionId <p>关联会话 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set <p>关联会话 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SessionId <p>关联会话 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get <p>失败原因</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorMessage <p>失败原因</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getErrorMessage() {
        return this.ErrorMessage;
    }

    /**
     * Set <p>失败原因</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorMessage <p>失败原因</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorMessage(String ErrorMessage) {
        this.ErrorMessage = ErrorMessage;
    }

    /**
     * Get <p>会话名称（AgentOS 侧生成的 AI 标题 / 用户改名）；缺失时为空，调用方可兜底展示 SessionId 后缀</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SessionName <p>会话名称（AgentOS 侧生成的 AI 标题 / 用户改名）；缺失时为空，调用方可兜底展示 SessionId 后缀</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSessionName() {
        return this.SessionName;
    }

    /**
     * Set <p>会话名称（AgentOS 侧生成的 AI 标题 / 用户改名）；缺失时为空，调用方可兜底展示 SessionId 后缀</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SessionName <p>会话名称（AgentOS 侧生成的 AI 标题 / 用户改名）；缺失时为空，调用方可兜底展示 SessionId 后缀</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSessionName(String SessionName) {
        this.SessionName = SessionName;
    }

    /**
     * Get <p>执行结果预览（前 50 字符），仅用于列表页展示；完整结果请调用 DescribeScheduledTaskLog</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Result <p>执行结果预览（前 50 字符），仅用于列表页展示；完整结果请调用 DescribeScheduledTaskLog</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResult() {
        return this.Result;
    }

    /**
     * Set <p>执行结果预览（前 50 字符），仅用于列表页展示；完整结果请调用 DescribeScheduledTaskLog</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Result <p>执行结果预览（前 50 字符），仅用于列表页展示；完整结果请调用 DescribeScheduledTaskLog</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResult(String Result) {
        this.Result = Result;
    }

    public ScheduledTaskLogSummary() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScheduledTaskLogSummary(ScheduledTaskLogSummary source) {
        if (source.LogId != null) {
            this.LogId = new String(source.LogId);
        }
        if (source.TaskKey != null) {
            this.TaskKey = new String(source.TaskKey);
        }
        if (source.TriggerType != null) {
            this.TriggerType = new String(source.TriggerType);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.DurationMs != null) {
            this.DurationMs = new Long(source.DurationMs);
        }
        if (source.DeliveryStatus != null) {
            this.DeliveryStatus = new String(source.DeliveryStatus);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.ErrorMessage != null) {
            this.ErrorMessage = new String(source.ErrorMessage);
        }
        if (source.SessionName != null) {
            this.SessionName = new String(source.SessionName);
        }
        if (source.Result != null) {
            this.Result = new String(source.Result);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LogId", this.LogId);
        this.setParamSimple(map, prefix + "TaskKey", this.TaskKey);
        this.setParamSimple(map, prefix + "TriggerType", this.TriggerType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "DurationMs", this.DurationMs);
        this.setParamSimple(map, prefix + "DeliveryStatus", this.DeliveryStatus);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "ErrorMessage", this.ErrorMessage);
        this.setParamSimple(map, prefix + "SessionName", this.SessionName);
        this.setParamSimple(map, prefix + "Result", this.Result);

    }
}

