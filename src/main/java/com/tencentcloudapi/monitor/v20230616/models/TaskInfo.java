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

public class TaskInfo extends AbstractModel {

    /**
    * <p>任务 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>任务名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>任务描述</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>关联 Agent ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AgentId")
    @Expose
    private String AgentId;

    /**
    * <p>提示词模板</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PromptTemplate")
    @Expose
    private String PromptTemplate;

    /**
    * <p>输出格式: markdown / json</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OutputFormat")
    @Expose
    private String OutputFormat;

    /**
    * <p>触发类型: manual / cron / webhook</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TriggerType")
    @Expose
    private String TriggerType;

    /**
    * <p>Cron 表达式</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CronExpr")
    @Expose
    private String CronExpr;

    /**
    * <p>Cron 时区</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CronTimezone")
    @Expose
    private String CronTimezone;

    /**
    * <p>关联技能 ID 列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SkillIds")
    @Expose
    private String [] SkillIds;

    /**
    * <p>关联 MCP 端点 ID 列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("McpEndpointIds")
    @Expose
    private String [] McpEndpointIds;

    /**
    * <p>超时时间(秒)</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TimeoutSec")
    @Expose
    private Long TimeoutSec;

    /**
    * <p>重试次数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RetryCount")
    @Expose
    private Long RetryCount;

    /**
    * <p>通知id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NotifyIds")
    @Expose
    private String [] NotifyIds;

    /**
    * <p>是否启用</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

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
     * Get <p>任务名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name <p>任务名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>任务名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name <p>任务名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>任务描述</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description <p>任务描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>任务描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description <p>任务描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>关联 Agent ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AgentId <p>关联 Agent ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAgentId() {
        return this.AgentId;
    }

    /**
     * Set <p>关联 Agent ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AgentId <p>关联 Agent ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAgentId(String AgentId) {
        this.AgentId = AgentId;
    }

    /**
     * Get <p>提示词模板</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PromptTemplate <p>提示词模板</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPromptTemplate() {
        return this.PromptTemplate;
    }

    /**
     * Set <p>提示词模板</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PromptTemplate <p>提示词模板</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPromptTemplate(String PromptTemplate) {
        this.PromptTemplate = PromptTemplate;
    }

    /**
     * Get <p>输出格式: markdown / json</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OutputFormat <p>输出格式: markdown / json</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOutputFormat() {
        return this.OutputFormat;
    }

    /**
     * Set <p>输出格式: markdown / json</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param OutputFormat <p>输出格式: markdown / json</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOutputFormat(String OutputFormat) {
        this.OutputFormat = OutputFormat;
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
     * Get <p>Cron 表达式</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CronExpr <p>Cron 表达式</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCronExpr() {
        return this.CronExpr;
    }

    /**
     * Set <p>Cron 表达式</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CronExpr <p>Cron 表达式</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCronExpr(String CronExpr) {
        this.CronExpr = CronExpr;
    }

    /**
     * Get <p>Cron 时区</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CronTimezone <p>Cron 时区</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCronTimezone() {
        return this.CronTimezone;
    }

    /**
     * Set <p>Cron 时区</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CronTimezone <p>Cron 时区</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCronTimezone(String CronTimezone) {
        this.CronTimezone = CronTimezone;
    }

    /**
     * Get <p>关联技能 ID 列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SkillIds <p>关联技能 ID 列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getSkillIds() {
        return this.SkillIds;
    }

    /**
     * Set <p>关联技能 ID 列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SkillIds <p>关联技能 ID 列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSkillIds(String [] SkillIds) {
        this.SkillIds = SkillIds;
    }

    /**
     * Get <p>关联 MCP 端点 ID 列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return McpEndpointIds <p>关联 MCP 端点 ID 列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getMcpEndpointIds() {
        return this.McpEndpointIds;
    }

    /**
     * Set <p>关联 MCP 端点 ID 列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param McpEndpointIds <p>关联 MCP 端点 ID 列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMcpEndpointIds(String [] McpEndpointIds) {
        this.McpEndpointIds = McpEndpointIds;
    }

    /**
     * Get <p>超时时间(秒)</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TimeoutSec <p>超时时间(秒)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTimeoutSec() {
        return this.TimeoutSec;
    }

    /**
     * Set <p>超时时间(秒)</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TimeoutSec <p>超时时间(秒)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimeoutSec(Long TimeoutSec) {
        this.TimeoutSec = TimeoutSec;
    }

    /**
     * Get <p>重试次数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RetryCount <p>重试次数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRetryCount() {
        return this.RetryCount;
    }

    /**
     * Set <p>重试次数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RetryCount <p>重试次数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRetryCount(Long RetryCount) {
        this.RetryCount = RetryCount;
    }

    /**
     * Get <p>通知id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NotifyIds <p>通知id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getNotifyIds() {
        return this.NotifyIds;
    }

    /**
     * Set <p>通知id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param NotifyIds <p>通知id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNotifyIds(String [] NotifyIds) {
        this.NotifyIds = NotifyIds;
    }

    /**
     * Get <p>是否启用</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Enabled <p>是否启用</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set <p>是否启用</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Enabled <p>是否启用</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    public TaskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskInfo(TaskInfo source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.AgentId != null) {
            this.AgentId = new String(source.AgentId);
        }
        if (source.PromptTemplate != null) {
            this.PromptTemplate = new String(source.PromptTemplate);
        }
        if (source.OutputFormat != null) {
            this.OutputFormat = new String(source.OutputFormat);
        }
        if (source.TriggerType != null) {
            this.TriggerType = new String(source.TriggerType);
        }
        if (source.CronExpr != null) {
            this.CronExpr = new String(source.CronExpr);
        }
        if (source.CronTimezone != null) {
            this.CronTimezone = new String(source.CronTimezone);
        }
        if (source.SkillIds != null) {
            this.SkillIds = new String[source.SkillIds.length];
            for (int i = 0; i < source.SkillIds.length; i++) {
                this.SkillIds[i] = new String(source.SkillIds[i]);
            }
        }
        if (source.McpEndpointIds != null) {
            this.McpEndpointIds = new String[source.McpEndpointIds.length];
            for (int i = 0; i < source.McpEndpointIds.length; i++) {
                this.McpEndpointIds[i] = new String(source.McpEndpointIds[i]);
            }
        }
        if (source.TimeoutSec != null) {
            this.TimeoutSec = new Long(source.TimeoutSec);
        }
        if (source.RetryCount != null) {
            this.RetryCount = new Long(source.RetryCount);
        }
        if (source.NotifyIds != null) {
            this.NotifyIds = new String[source.NotifyIds.length];
            for (int i = 0; i < source.NotifyIds.length; i++) {
                this.NotifyIds[i] = new String(source.NotifyIds[i]);
            }
        }
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "AgentId", this.AgentId);
        this.setParamSimple(map, prefix + "PromptTemplate", this.PromptTemplate);
        this.setParamSimple(map, prefix + "OutputFormat", this.OutputFormat);
        this.setParamSimple(map, prefix + "TriggerType", this.TriggerType);
        this.setParamSimple(map, prefix + "CronExpr", this.CronExpr);
        this.setParamSimple(map, prefix + "CronTimezone", this.CronTimezone);
        this.setParamArraySimple(map, prefix + "SkillIds.", this.SkillIds);
        this.setParamArraySimple(map, prefix + "McpEndpointIds.", this.McpEndpointIds);
        this.setParamSimple(map, prefix + "TimeoutSec", this.TimeoutSec);
        this.setParamSimple(map, prefix + "RetryCount", this.RetryCount);
        this.setParamArraySimple(map, prefix + "NotifyIds.", this.NotifyIds);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);

    }
}

