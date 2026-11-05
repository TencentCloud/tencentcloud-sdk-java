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

public class DescribeScheduledTaskLogResponse extends AbstractModel {

    /**
    * <p>执行日志 ID</p>
    */
    @SerializedName("LogId")
    @Expose
    private String LogId;

    /**
    * <p>任务 ID</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>任务唯一标识</p>
    */
    @SerializedName("TaskKey")
    @Expose
    private String TaskKey;

    /**
    * <p>关联会话 ID</p>
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * <p>触发类型：MANUAL（手动）/ CRON（定时）</p>
    */
    @SerializedName("TriggerType")
    @Expose
    private String TriggerType;

    /**
    * <p>执行状态</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>本次执行 Prompt</p>
    */
    @SerializedName("Prompt")
    @Expose
    private String Prompt;

    /**
    * <p>执行输出内容（完整结果；列表接口 DescribeScheduledTaskLogList 仅返回前 50 字符预览）</p>
    */
    @SerializedName("Result")
    @Expose
    private String Result;

    /**
    * <p>开始时间</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>结束时间</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>执行时长（毫秒）</p>
    */
    @SerializedName("DurationMs")
    @Expose
    private Long DurationMs;

    /**
    * <p>投递状态</p>
    */
    @SerializedName("DeliveryStatus")
    @Expose
    private String DeliveryStatus;

    /**
    * <p>投递错误信息</p>
    */
    @SerializedName("DeliveryError")
    @Expose
    private String DeliveryError;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * <p>失败原因</p>
    */
    @SerializedName("ErrorMessage")
    @Expose
    private String ErrorMessage;

    /**
    * <p>会话名称（AgentOS 侧生成的 AI 标题 / 用户改名）；缺失时为空，调用方可兜底展示 SessionId 后缀</p>
    */
    @SerializedName("SessionName")
    @Expose
    private String SessionName;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>执行日志 ID</p> 
     * @return LogId <p>执行日志 ID</p>
     */
    public String getLogId() {
        return this.LogId;
    }

    /**
     * Set <p>执行日志 ID</p>
     * @param LogId <p>执行日志 ID</p>
     */
    public void setLogId(String LogId) {
        this.LogId = LogId;
    }

    /**
     * Get <p>任务 ID</p> 
     * @return TaskId <p>任务 ID</p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>任务 ID</p>
     * @param TaskId <p>任务 ID</p>
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>任务唯一标识</p> 
     * @return TaskKey <p>任务唯一标识</p>
     */
    public String getTaskKey() {
        return this.TaskKey;
    }

    /**
     * Set <p>任务唯一标识</p>
     * @param TaskKey <p>任务唯一标识</p>
     */
    public void setTaskKey(String TaskKey) {
        this.TaskKey = TaskKey;
    }

    /**
     * Get <p>关联会话 ID</p> 
     * @return SessionId <p>关联会话 ID</p>
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set <p>关联会话 ID</p>
     * @param SessionId <p>关联会话 ID</p>
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get <p>触发类型：MANUAL（手动）/ CRON（定时）</p> 
     * @return TriggerType <p>触发类型：MANUAL（手动）/ CRON（定时）</p>
     */
    public String getTriggerType() {
        return this.TriggerType;
    }

    /**
     * Set <p>触发类型：MANUAL（手动）/ CRON（定时）</p>
     * @param TriggerType <p>触发类型：MANUAL（手动）/ CRON（定时）</p>
     */
    public void setTriggerType(String TriggerType) {
        this.TriggerType = TriggerType;
    }

    /**
     * Get <p>执行状态</p> 
     * @return Status <p>执行状态</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>执行状态</p>
     * @param Status <p>执行状态</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>本次执行 Prompt</p> 
     * @return Prompt <p>本次执行 Prompt</p>
     */
    public String getPrompt() {
        return this.Prompt;
    }

    /**
     * Set <p>本次执行 Prompt</p>
     * @param Prompt <p>本次执行 Prompt</p>
     */
    public void setPrompt(String Prompt) {
        this.Prompt = Prompt;
    }

    /**
     * Get <p>执行输出内容（完整结果；列表接口 DescribeScheduledTaskLogList 仅返回前 50 字符预览）</p> 
     * @return Result <p>执行输出内容（完整结果；列表接口 DescribeScheduledTaskLogList 仅返回前 50 字符预览）</p>
     */
    public String getResult() {
        return this.Result;
    }

    /**
     * Set <p>执行输出内容（完整结果；列表接口 DescribeScheduledTaskLogList 仅返回前 50 字符预览）</p>
     * @param Result <p>执行输出内容（完整结果；列表接口 DescribeScheduledTaskLogList 仅返回前 50 字符预览）</p>
     */
    public void setResult(String Result) {
        this.Result = Result;
    }

    /**
     * Get <p>开始时间</p> 
     * @return StartTime <p>开始时间</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>开始时间</p>
     * @param StartTime <p>开始时间</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>结束时间</p> 
     * @return EndTime <p>结束时间</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>结束时间</p>
     * @param EndTime <p>结束时间</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>执行时长（毫秒）</p> 
     * @return DurationMs <p>执行时长（毫秒）</p>
     */
    public Long getDurationMs() {
        return this.DurationMs;
    }

    /**
     * Set <p>执行时长（毫秒）</p>
     * @param DurationMs <p>执行时长（毫秒）</p>
     */
    public void setDurationMs(Long DurationMs) {
        this.DurationMs = DurationMs;
    }

    /**
     * Get <p>投递状态</p> 
     * @return DeliveryStatus <p>投递状态</p>
     */
    public String getDeliveryStatus() {
        return this.DeliveryStatus;
    }

    /**
     * Set <p>投递状态</p>
     * @param DeliveryStatus <p>投递状态</p>
     */
    public void setDeliveryStatus(String DeliveryStatus) {
        this.DeliveryStatus = DeliveryStatus;
    }

    /**
     * Get <p>投递错误信息</p> 
     * @return DeliveryError <p>投递错误信息</p>
     */
    public String getDeliveryError() {
        return this.DeliveryError;
    }

    /**
     * Set <p>投递错误信息</p>
     * @param DeliveryError <p>投递错误信息</p>
     */
    public void setDeliveryError(String DeliveryError) {
        this.DeliveryError = DeliveryError;
    }

    /**
     * Get <p>创建时间</p> 
     * @return CreatedTime <p>创建时间</p>
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set <p>创建时间</p>
     * @param CreatedTime <p>创建时间</p>
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get <p>失败原因</p> 
     * @return ErrorMessage <p>失败原因</p>
     */
    public String getErrorMessage() {
        return this.ErrorMessage;
    }

    /**
     * Set <p>失败原因</p>
     * @param ErrorMessage <p>失败原因</p>
     */
    public void setErrorMessage(String ErrorMessage) {
        this.ErrorMessage = ErrorMessage;
    }

    /**
     * Get <p>会话名称（AgentOS 侧生成的 AI 标题 / 用户改名）；缺失时为空，调用方可兜底展示 SessionId 后缀</p> 
     * @return SessionName <p>会话名称（AgentOS 侧生成的 AI 标题 / 用户改名）；缺失时为空，调用方可兜底展示 SessionId 后缀</p>
     */
    public String getSessionName() {
        return this.SessionName;
    }

    /**
     * Set <p>会话名称（AgentOS 侧生成的 AI 标题 / 用户改名）；缺失时为空，调用方可兜底展示 SessionId 后缀</p>
     * @param SessionName <p>会话名称（AgentOS 侧生成的 AI 标题 / 用户改名）；缺失时为空，调用方可兜底展示 SessionId 后缀</p>
     */
    public void setSessionName(String SessionName) {
        this.SessionName = SessionName;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeScheduledTaskLogResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeScheduledTaskLogResponse(DescribeScheduledTaskLogResponse source) {
        if (source.LogId != null) {
            this.LogId = new String(source.LogId);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TaskKey != null) {
            this.TaskKey = new String(source.TaskKey);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.TriggerType != null) {
            this.TriggerType = new String(source.TriggerType);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Prompt != null) {
            this.Prompt = new String(source.Prompt);
        }
        if (source.Result != null) {
            this.Result = new String(source.Result);
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
        if (source.DeliveryError != null) {
            this.DeliveryError = new String(source.DeliveryError);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.ErrorMessage != null) {
            this.ErrorMessage = new String(source.ErrorMessage);
        }
        if (source.SessionName != null) {
            this.SessionName = new String(source.SessionName);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LogId", this.LogId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskKey", this.TaskKey);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "TriggerType", this.TriggerType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Prompt", this.Prompt);
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "DurationMs", this.DurationMs);
        this.setParamSimple(map, prefix + "DeliveryStatus", this.DeliveryStatus);
        this.setParamSimple(map, prefix + "DeliveryError", this.DeliveryError);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "ErrorMessage", this.ErrorMessage);
        this.setParamSimple(map, prefix + "SessionName", this.SessionName);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

