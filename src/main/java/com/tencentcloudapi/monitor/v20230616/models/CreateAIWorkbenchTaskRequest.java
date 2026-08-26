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

public class CreateAIWorkbenchTaskRequest extends AbstractModel {

    /**
    * <p>任务名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>任务描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>关联 Agent ID</p>
    */
    @SerializedName("AgentId")
    @Expose
    private String AgentId;

    /**
    * <p>提示词模板</p>
    */
    @SerializedName("PromptTemplate")
    @Expose
    private String PromptTemplate;

    /**
    * <p>输出格式: markdown / json</p>
    */
    @SerializedName("OutputFormat")
    @Expose
    private String OutputFormat;

    /**
    * <p>触发类型: manual / cron / webhook</p>
    */
    @SerializedName("TriggerType")
    @Expose
    private String TriggerType;

    /**
    * <p>Cron 表达式</p>
    */
    @SerializedName("CronExpr")
    @Expose
    private String CronExpr;

    /**
    * <p>Cron 时区</p>
    */
    @SerializedName("CronTimezone")
    @Expose
    private String CronTimezone;

    /**
    * <p>关联资源地图 ID</p>
    */
    @SerializedName("ResourceMapId")
    @Expose
    private String ResourceMapId;

    /**
    * <p>技能 ID 列表</p>
    */
    @SerializedName("SkillIds")
    @Expose
    private String [] SkillIds;

    /**
    * <p>MCP 端点 ID 列表</p>
    */
    @SerializedName("McpEndpointIds")
    @Expose
    private String [] McpEndpointIds;

    /**
    * <p>超时时间(秒)</p>
    */
    @SerializedName("TimeoutSec")
    @Expose
    private Long TimeoutSec;

    /**
    * <p>重试次数</p>
    */
    @SerializedName("RetryCount")
    @Expose
    private Long RetryCount;

    /**
    * <p>是否启用</p>
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
     * Get <p>任务名称</p> 
     * @return Name <p>任务名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>任务名称</p>
     * @param Name <p>任务名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>任务描述</p> 
     * @return Description <p>任务描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>任务描述</p>
     * @param Description <p>任务描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>关联 Agent ID</p> 
     * @return AgentId <p>关联 Agent ID</p>
     */
    public String getAgentId() {
        return this.AgentId;
    }

    /**
     * Set <p>关联 Agent ID</p>
     * @param AgentId <p>关联 Agent ID</p>
     */
    public void setAgentId(String AgentId) {
        this.AgentId = AgentId;
    }

    /**
     * Get <p>提示词模板</p> 
     * @return PromptTemplate <p>提示词模板</p>
     */
    public String getPromptTemplate() {
        return this.PromptTemplate;
    }

    /**
     * Set <p>提示词模板</p>
     * @param PromptTemplate <p>提示词模板</p>
     */
    public void setPromptTemplate(String PromptTemplate) {
        this.PromptTemplate = PromptTemplate;
    }

    /**
     * Get <p>输出格式: markdown / json</p> 
     * @return OutputFormat <p>输出格式: markdown / json</p>
     */
    public String getOutputFormat() {
        return this.OutputFormat;
    }

    /**
     * Set <p>输出格式: markdown / json</p>
     * @param OutputFormat <p>输出格式: markdown / json</p>
     */
    public void setOutputFormat(String OutputFormat) {
        this.OutputFormat = OutputFormat;
    }

    /**
     * Get <p>触发类型: manual / cron / webhook</p> 
     * @return TriggerType <p>触发类型: manual / cron / webhook</p>
     */
    public String getTriggerType() {
        return this.TriggerType;
    }

    /**
     * Set <p>触发类型: manual / cron / webhook</p>
     * @param TriggerType <p>触发类型: manual / cron / webhook</p>
     */
    public void setTriggerType(String TriggerType) {
        this.TriggerType = TriggerType;
    }

    /**
     * Get <p>Cron 表达式</p> 
     * @return CronExpr <p>Cron 表达式</p>
     */
    public String getCronExpr() {
        return this.CronExpr;
    }

    /**
     * Set <p>Cron 表达式</p>
     * @param CronExpr <p>Cron 表达式</p>
     */
    public void setCronExpr(String CronExpr) {
        this.CronExpr = CronExpr;
    }

    /**
     * Get <p>Cron 时区</p> 
     * @return CronTimezone <p>Cron 时区</p>
     */
    public String getCronTimezone() {
        return this.CronTimezone;
    }

    /**
     * Set <p>Cron 时区</p>
     * @param CronTimezone <p>Cron 时区</p>
     */
    public void setCronTimezone(String CronTimezone) {
        this.CronTimezone = CronTimezone;
    }

    /**
     * Get <p>关联资源地图 ID</p> 
     * @return ResourceMapId <p>关联资源地图 ID</p>
     */
    public String getResourceMapId() {
        return this.ResourceMapId;
    }

    /**
     * Set <p>关联资源地图 ID</p>
     * @param ResourceMapId <p>关联资源地图 ID</p>
     */
    public void setResourceMapId(String ResourceMapId) {
        this.ResourceMapId = ResourceMapId;
    }

    /**
     * Get <p>技能 ID 列表</p> 
     * @return SkillIds <p>技能 ID 列表</p>
     */
    public String [] getSkillIds() {
        return this.SkillIds;
    }

    /**
     * Set <p>技能 ID 列表</p>
     * @param SkillIds <p>技能 ID 列表</p>
     */
    public void setSkillIds(String [] SkillIds) {
        this.SkillIds = SkillIds;
    }

    /**
     * Get <p>MCP 端点 ID 列表</p> 
     * @return McpEndpointIds <p>MCP 端点 ID 列表</p>
     */
    public String [] getMcpEndpointIds() {
        return this.McpEndpointIds;
    }

    /**
     * Set <p>MCP 端点 ID 列表</p>
     * @param McpEndpointIds <p>MCP 端点 ID 列表</p>
     */
    public void setMcpEndpointIds(String [] McpEndpointIds) {
        this.McpEndpointIds = McpEndpointIds;
    }

    /**
     * Get <p>超时时间(秒)</p> 
     * @return TimeoutSec <p>超时时间(秒)</p>
     */
    public Long getTimeoutSec() {
        return this.TimeoutSec;
    }

    /**
     * Set <p>超时时间(秒)</p>
     * @param TimeoutSec <p>超时时间(秒)</p>
     */
    public void setTimeoutSec(Long TimeoutSec) {
        this.TimeoutSec = TimeoutSec;
    }

    /**
     * Get <p>重试次数</p> 
     * @return RetryCount <p>重试次数</p>
     */
    public Long getRetryCount() {
        return this.RetryCount;
    }

    /**
     * Set <p>重试次数</p>
     * @param RetryCount <p>重试次数</p>
     */
    public void setRetryCount(Long RetryCount) {
        this.RetryCount = RetryCount;
    }

    /**
     * Get <p>是否启用</p> 
     * @return Enabled <p>是否启用</p>
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set <p>是否启用</p>
     * @param Enabled <p>是否启用</p>
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    public CreateAIWorkbenchTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAIWorkbenchTaskRequest(CreateAIWorkbenchTaskRequest source) {
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
        if (source.ResourceMapId != null) {
            this.ResourceMapId = new String(source.ResourceMapId);
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
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "AgentId", this.AgentId);
        this.setParamSimple(map, prefix + "PromptTemplate", this.PromptTemplate);
        this.setParamSimple(map, prefix + "OutputFormat", this.OutputFormat);
        this.setParamSimple(map, prefix + "TriggerType", this.TriggerType);
        this.setParamSimple(map, prefix + "CronExpr", this.CronExpr);
        this.setParamSimple(map, prefix + "CronTimezone", this.CronTimezone);
        this.setParamSimple(map, prefix + "ResourceMapId", this.ResourceMapId);
        this.setParamArraySimple(map, prefix + "SkillIds.", this.SkillIds);
        this.setParamArraySimple(map, prefix + "McpEndpointIds.", this.McpEndpointIds);
        this.setParamSimple(map, prefix + "TimeoutSec", this.TimeoutSec);
        this.setParamSimple(map, prefix + "RetryCount", this.RetryCount);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);

    }
}

