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
package com.tencentcloudapi.monitor.v20230616.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExecutionInfo extends AbstractModel {

    /**
    * <p>任务名</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>任务 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>执行 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecutionId")
    @Expose
    private String ExecutionId;

    /**
    * <p>Agent ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AgentId")
    @Expose
    private String AgentId;

    /**
    * <p>会话 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * <p>触发类型: manual / cron / webhook</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TriggerType")
    @Expose
    private String TriggerType;

    /**
    * <p>状态: pending/running/completed/failed/timeout/cancelled</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>执行摘要</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Summary")
    @Expose
    private String Summary;

    /**
    * <p>执行耗时(毫秒)</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DurationMs")
    @Expose
    private Long DurationMs;

    /**
     * Get <p>任务名</p> 
     * @return Name <p>任务名</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>任务名</p>
     * @param Name <p>任务名</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>任务 ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskId <p>任务 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>任务 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskId <p>任务 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>执行 ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecutionId <p>执行 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecutionId() {
        return this.ExecutionId;
    }

    /**
     * Set <p>执行 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecutionId <p>执行 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecutionId(String ExecutionId) {
        this.ExecutionId = ExecutionId;
    }

    /**
     * Get <p>Agent ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AgentId <p>Agent ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAgentId() {
        return this.AgentId;
    }

    /**
     * Set <p>Agent ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AgentId <p>Agent ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAgentId(String AgentId) {
        this.AgentId = AgentId;
    }

    /**
     * Get <p>会话 ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SessionId <p>会话 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set <p>会话 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SessionId <p>会话 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get <p>触发类型: manual / cron / webhook</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TriggerType <p>触发类型: manual / cron / webhook</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTriggerType() {
        return this.TriggerType;
    }

    /**
     * Set <p>触发类型: manual / cron / webhook</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TriggerType <p>触发类型: manual / cron / webhook</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTriggerType(String TriggerType) {
        this.TriggerType = TriggerType;
    }

    /**
     * Get <p>状态: pending/running/completed/failed/timeout/cancelled</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status <p>状态: pending/running/completed/failed/timeout/cancelled</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>状态: pending/running/completed/failed/timeout/cancelled</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status <p>状态: pending/running/completed/failed/timeout/cancelled</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>执行摘要</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Summary <p>执行摘要</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSummary() {
        return this.Summary;
    }

    /**
     * Set <p>执行摘要</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Summary <p>执行摘要</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSummary(String Summary) {
        this.Summary = Summary;
    }

    /**
     * Get <p>执行耗时(毫秒)</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DurationMs <p>执行耗时(毫秒)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDurationMs() {
        return this.DurationMs;
    }

    /**
     * Set <p>执行耗时(毫秒)</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DurationMs <p>执行耗时(毫秒)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDurationMs(Long DurationMs) {
        this.DurationMs = DurationMs;
    }

    public ExecutionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExecutionInfo(ExecutionInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.ExecutionId != null) {
            this.ExecutionId = new String(source.ExecutionId);
        }
        if (source.AgentId != null) {
            this.AgentId = new String(source.AgentId);
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
        if (source.Summary != null) {
            this.Summary = new String(source.Summary);
        }
        if (source.DurationMs != null) {
            this.DurationMs = new Long(source.DurationMs);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "ExecutionId", this.ExecutionId);
        this.setParamSimple(map, prefix + "AgentId", this.AgentId);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "TriggerType", this.TriggerType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Summary", this.Summary);
        this.setParamSimple(map, prefix + "DurationMs", this.DurationMs);

    }
}

