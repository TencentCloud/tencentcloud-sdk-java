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

public class MessageEventToolCall extends AbstractModel {

    /**
    * <p>调用ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ToolCallId")
    @Expose
    private String ToolCallId;

    /**
    * <p>工具名</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ToolName")
    @Expose
    private String ToolName;

    /**
    * <p>状态 PENDING/IN_PROGRESS/SUCCEEDED/FAILED</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>工具调用Input（已递归脱敏，JSON 字符串）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Input")
    @Expose
    private String Input;

    /**
    * <p>工具调用Output（已递归脱敏，JSON 字符串）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Output")
    @Expose
    private String Output;

    /**
    * <p>结束时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndedAt")
    @Expose
    private String EndedAt;

    /**
    * <p>耗时毫秒</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DurationMs")
    @Expose
    private Long DurationMs;

    /**
    * <p>调用开始时间（RFC3339 格式）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartedAt")
    @Expose
    private String StartedAt;

    /**
    * 本次调用对应的业务专家 ID。
    */
    @SerializedName("ExpertId")
    @Expose
    private String ExpertId;

    /**
    * 本次调用对应的专家名称。
    */
    @SerializedName("ExpertName")
    @Expose
    private String ExpertName;

    /**
    * 执行时解析到的专家资源版本。
    */
    @SerializedName("ExpertVersion")
    @Expose
    private String ExpertVersion;

    /**
    * CBC 子代理执行实例 ID，可用于查询该次专家调用的消息事件。
    */
    @SerializedName("SubAgentId")
    @Expose
    private String SubAgentId;

    /**
    * CBC 子代理定义名称。
    */
    @SerializedName("SubAgentName")
    @Expose
    private String SubAgentName;

    /**
    * 父会话中触发本次子代理执行的工具调用 ID。
    */
    @SerializedName("ParentToolCallId")
    @Expose
    private String ParentToolCallId;

    /**
     * Get <p>调用ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ToolCallId <p>调用ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getToolCallId() {
        return this.ToolCallId;
    }

    /**
     * Set <p>调用ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ToolCallId <p>调用ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setToolCallId(String ToolCallId) {
        this.ToolCallId = ToolCallId;
    }

    /**
     * Get <p>工具名</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ToolName <p>工具名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getToolName() {
        return this.ToolName;
    }

    /**
     * Set <p>工具名</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ToolName <p>工具名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setToolName(String ToolName) {
        this.ToolName = ToolName;
    }

    /**
     * Get <p>状态 PENDING/IN_PROGRESS/SUCCEEDED/FAILED</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status <p>状态 PENDING/IN_PROGRESS/SUCCEEDED/FAILED</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>状态 PENDING/IN_PROGRESS/SUCCEEDED/FAILED</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status <p>状态 PENDING/IN_PROGRESS/SUCCEEDED/FAILED</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>工具调用Input（已递归脱敏，JSON 字符串）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Input <p>工具调用Input（已递归脱敏，JSON 字符串）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInput() {
        return this.Input;
    }

    /**
     * Set <p>工具调用Input（已递归脱敏，JSON 字符串）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Input <p>工具调用Input（已递归脱敏，JSON 字符串）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInput(String Input) {
        this.Input = Input;
    }

    /**
     * Get <p>工具调用Output（已递归脱敏，JSON 字符串）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Output <p>工具调用Output（已递归脱敏，JSON 字符串）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOutput() {
        return this.Output;
    }

    /**
     * Set <p>工具调用Output（已递归脱敏，JSON 字符串）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Output <p>工具调用Output（已递归脱敏，JSON 字符串）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOutput(String Output) {
        this.Output = Output;
    }

    /**
     * Get <p>结束时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndedAt <p>结束时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndedAt() {
        return this.EndedAt;
    }

    /**
     * Set <p>结束时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndedAt <p>结束时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndedAt(String EndedAt) {
        this.EndedAt = EndedAt;
    }

    /**
     * Get <p>耗时毫秒</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DurationMs <p>耗时毫秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDurationMs() {
        return this.DurationMs;
    }

    /**
     * Set <p>耗时毫秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DurationMs <p>耗时毫秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDurationMs(Long DurationMs) {
        this.DurationMs = DurationMs;
    }

    /**
     * Get <p>调用开始时间（RFC3339 格式）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartedAt <p>调用开始时间（RFC3339 格式）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStartedAt() {
        return this.StartedAt;
    }

    /**
     * Set <p>调用开始时间（RFC3339 格式）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartedAt <p>调用开始时间（RFC3339 格式）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartedAt(String StartedAt) {
        this.StartedAt = StartedAt;
    }

    /**
     * Get 本次调用对应的业务专家 ID。 
     * @return ExpertId 本次调用对应的业务专家 ID。
     */
    public String getExpertId() {
        return this.ExpertId;
    }

    /**
     * Set 本次调用对应的业务专家 ID。
     * @param ExpertId 本次调用对应的业务专家 ID。
     */
    public void setExpertId(String ExpertId) {
        this.ExpertId = ExpertId;
    }

    /**
     * Get 本次调用对应的专家名称。 
     * @return ExpertName 本次调用对应的专家名称。
     */
    public String getExpertName() {
        return this.ExpertName;
    }

    /**
     * Set 本次调用对应的专家名称。
     * @param ExpertName 本次调用对应的专家名称。
     */
    public void setExpertName(String ExpertName) {
        this.ExpertName = ExpertName;
    }

    /**
     * Get 执行时解析到的专家资源版本。 
     * @return ExpertVersion 执行时解析到的专家资源版本。
     */
    public String getExpertVersion() {
        return this.ExpertVersion;
    }

    /**
     * Set 执行时解析到的专家资源版本。
     * @param ExpertVersion 执行时解析到的专家资源版本。
     */
    public void setExpertVersion(String ExpertVersion) {
        this.ExpertVersion = ExpertVersion;
    }

    /**
     * Get CBC 子代理执行实例 ID，可用于查询该次专家调用的消息事件。 
     * @return SubAgentId CBC 子代理执行实例 ID，可用于查询该次专家调用的消息事件。
     */
    public String getSubAgentId() {
        return this.SubAgentId;
    }

    /**
     * Set CBC 子代理执行实例 ID，可用于查询该次专家调用的消息事件。
     * @param SubAgentId CBC 子代理执行实例 ID，可用于查询该次专家调用的消息事件。
     */
    public void setSubAgentId(String SubAgentId) {
        this.SubAgentId = SubAgentId;
    }

    /**
     * Get CBC 子代理定义名称。 
     * @return SubAgentName CBC 子代理定义名称。
     */
    public String getSubAgentName() {
        return this.SubAgentName;
    }

    /**
     * Set CBC 子代理定义名称。
     * @param SubAgentName CBC 子代理定义名称。
     */
    public void setSubAgentName(String SubAgentName) {
        this.SubAgentName = SubAgentName;
    }

    /**
     * Get 父会话中触发本次子代理执行的工具调用 ID。 
     * @return ParentToolCallId 父会话中触发本次子代理执行的工具调用 ID。
     */
    public String getParentToolCallId() {
        return this.ParentToolCallId;
    }

    /**
     * Set 父会话中触发本次子代理执行的工具调用 ID。
     * @param ParentToolCallId 父会话中触发本次子代理执行的工具调用 ID。
     */
    public void setParentToolCallId(String ParentToolCallId) {
        this.ParentToolCallId = ParentToolCallId;
    }

    public MessageEventToolCall() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MessageEventToolCall(MessageEventToolCall source) {
        if (source.ToolCallId != null) {
            this.ToolCallId = new String(source.ToolCallId);
        }
        if (source.ToolName != null) {
            this.ToolName = new String(source.ToolName);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Input != null) {
            this.Input = new String(source.Input);
        }
        if (source.Output != null) {
            this.Output = new String(source.Output);
        }
        if (source.EndedAt != null) {
            this.EndedAt = new String(source.EndedAt);
        }
        if (source.DurationMs != null) {
            this.DurationMs = new Long(source.DurationMs);
        }
        if (source.StartedAt != null) {
            this.StartedAt = new String(source.StartedAt);
        }
        if (source.ExpertId != null) {
            this.ExpertId = new String(source.ExpertId);
        }
        if (source.ExpertName != null) {
            this.ExpertName = new String(source.ExpertName);
        }
        if (source.ExpertVersion != null) {
            this.ExpertVersion = new String(source.ExpertVersion);
        }
        if (source.SubAgentId != null) {
            this.SubAgentId = new String(source.SubAgentId);
        }
        if (source.SubAgentName != null) {
            this.SubAgentName = new String(source.SubAgentName);
        }
        if (source.ParentToolCallId != null) {
            this.ParentToolCallId = new String(source.ParentToolCallId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ToolCallId", this.ToolCallId);
        this.setParamSimple(map, prefix + "ToolName", this.ToolName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Input", this.Input);
        this.setParamSimple(map, prefix + "Output", this.Output);
        this.setParamSimple(map, prefix + "EndedAt", this.EndedAt);
        this.setParamSimple(map, prefix + "DurationMs", this.DurationMs);
        this.setParamSimple(map, prefix + "StartedAt", this.StartedAt);
        this.setParamSimple(map, prefix + "ExpertId", this.ExpertId);
        this.setParamSimple(map, prefix + "ExpertName", this.ExpertName);
        this.setParamSimple(map, prefix + "ExpertVersion", this.ExpertVersion);
        this.setParamSimple(map, prefix + "SubAgentId", this.SubAgentId);
        this.setParamSimple(map, prefix + "SubAgentName", this.SubAgentName);
        this.setParamSimple(map, prefix + "ParentToolCallId", this.ParentToolCallId);

    }
}

