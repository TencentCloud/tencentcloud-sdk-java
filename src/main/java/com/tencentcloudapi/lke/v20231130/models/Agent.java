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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Agent extends AbstractModel {

    /**
    * AgentID
    */
    @SerializedName("AgentId")
    @Expose
    private String AgentId;

    /**
    * WorkflowID，非空则当前Agent从workflow转换而来
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * Agent名称，同一个应用内，Agent名称不能重复
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 插件图标url
    */
    @SerializedName("IconUrl")
    @Expose
    private String IconUrl;

    /**
    * Agent指令；当该Agent被调用时，将作为“系统提示词”使用，描述Agent应执行的操作和响应方式
    */
    @SerializedName("Instructions")
    @Expose
    private String Instructions;

    /**
    * 当Agent作为转交目标时的描述，用于让其他Agent的LLM理解其功能和转交时机
    */
    @SerializedName("HandoffDescription")
    @Expose
    private String HandoffDescription;

    /**
    * Agent可转交的子AgentId列表
    */
    @SerializedName("Handoffs")
    @Expose
    private String [] Handoffs;

    /**
    * Agent调用LLM时使用的模型配置
    */
    @SerializedName("Model")
    @Expose
    private AgentModelInfo Model;

    /**
    * Agent可使用的工具列表
    */
    @SerializedName("Tools")
    @Expose
    private AgentToolInfo [] Tools;

    /**
    * Agent可使用的插件列表
    */
    @SerializedName("Plugins")
    @Expose
    private AgentPluginInfo [] Plugins;

    /**
    * 当前Agent是否是启动Agent
    */
    @SerializedName("IsStartingAgent")
    @Expose
    private Boolean IsStartingAgent;

    /**
    * Agent类型; 0: 未指定类型; 1: 知识库检索Agent
    */
    @SerializedName("AgentType")
    @Expose
    private Long AgentType;

    /**
    * 0 自由转交，1 计划与执行
    */
    @SerializedName("AgentMode")
    @Expose
    private Long AgentMode;

    /**
     * Get AgentID 
     * @return AgentId AgentID
     */
    public String getAgentId() {
        return this.AgentId;
    }

    /**
     * Set AgentID
     * @param AgentId AgentID
     */
    public void setAgentId(String AgentId) {
        this.AgentId = AgentId;
    }

    /**
     * Get WorkflowID，非空则当前Agent从workflow转换而来 
     * @return WorkflowId WorkflowID，非空则当前Agent从workflow转换而来
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set WorkflowID，非空则当前Agent从workflow转换而来
     * @param WorkflowId WorkflowID，非空则当前Agent从workflow转换而来
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
    }

    /**
     * Get Agent名称，同一个应用内，Agent名称不能重复 
     * @return Name Agent名称，同一个应用内，Agent名称不能重复
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Agent名称，同一个应用内，Agent名称不能重复
     * @param Name Agent名称，同一个应用内，Agent名称不能重复
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 插件图标url 
     * @return IconUrl 插件图标url
     */
    public String getIconUrl() {
        return this.IconUrl;
    }

    /**
     * Set 插件图标url
     * @param IconUrl 插件图标url
     */
    public void setIconUrl(String IconUrl) {
        this.IconUrl = IconUrl;
    }

    /**
     * Get Agent指令；当该Agent被调用时，将作为“系统提示词”使用，描述Agent应执行的操作和响应方式 
     * @return Instructions Agent指令；当该Agent被调用时，将作为“系统提示词”使用，描述Agent应执行的操作和响应方式
     */
    public String getInstructions() {
        return this.Instructions;
    }

    /**
     * Set Agent指令；当该Agent被调用时，将作为“系统提示词”使用，描述Agent应执行的操作和响应方式
     * @param Instructions Agent指令；当该Agent被调用时，将作为“系统提示词”使用，描述Agent应执行的操作和响应方式
     */
    public void setInstructions(String Instructions) {
        this.Instructions = Instructions;
    }

    /**
     * Get 当Agent作为转交目标时的描述，用于让其他Agent的LLM理解其功能和转交时机 
     * @return HandoffDescription 当Agent作为转交目标时的描述，用于让其他Agent的LLM理解其功能和转交时机
     */
    public String getHandoffDescription() {
        return this.HandoffDescription;
    }

    /**
     * Set 当Agent作为转交目标时的描述，用于让其他Agent的LLM理解其功能和转交时机
     * @param HandoffDescription 当Agent作为转交目标时的描述，用于让其他Agent的LLM理解其功能和转交时机
     */
    public void setHandoffDescription(String HandoffDescription) {
        this.HandoffDescription = HandoffDescription;
    }

    /**
     * Get Agent可转交的子AgentId列表 
     * @return Handoffs Agent可转交的子AgentId列表
     */
    public String [] getHandoffs() {
        return this.Handoffs;
    }

    /**
     * Set Agent可转交的子AgentId列表
     * @param Handoffs Agent可转交的子AgentId列表
     */
    public void setHandoffs(String [] Handoffs) {
        this.Handoffs = Handoffs;
    }

    /**
     * Get Agent调用LLM时使用的模型配置 
     * @return Model Agent调用LLM时使用的模型配置
     */
    public AgentModelInfo getModel() {
        return this.Model;
    }

    /**
     * Set Agent调用LLM时使用的模型配置
     * @param Model Agent调用LLM时使用的模型配置
     */
    public void setModel(AgentModelInfo Model) {
        this.Model = Model;
    }

    /**
     * Get Agent可使用的工具列表 
     * @return Tools Agent可使用的工具列表
     */
    public AgentToolInfo [] getTools() {
        return this.Tools;
    }

    /**
     * Set Agent可使用的工具列表
     * @param Tools Agent可使用的工具列表
     */
    public void setTools(AgentToolInfo [] Tools) {
        this.Tools = Tools;
    }

    /**
     * Get Agent可使用的插件列表 
     * @return Plugins Agent可使用的插件列表
     */
    public AgentPluginInfo [] getPlugins() {
        return this.Plugins;
    }

    /**
     * Set Agent可使用的插件列表
     * @param Plugins Agent可使用的插件列表
     */
    public void setPlugins(AgentPluginInfo [] Plugins) {
        this.Plugins = Plugins;
    }

    /**
     * Get 当前Agent是否是启动Agent 
     * @return IsStartingAgent 当前Agent是否是启动Agent
     */
    public Boolean getIsStartingAgent() {
        return this.IsStartingAgent;
    }

    /**
     * Set 当前Agent是否是启动Agent
     * @param IsStartingAgent 当前Agent是否是启动Agent
     */
    public void setIsStartingAgent(Boolean IsStartingAgent) {
        this.IsStartingAgent = IsStartingAgent;
    }

    /**
     * Get Agent类型; 0: 未指定类型; 1: 知识库检索Agent 
     * @return AgentType Agent类型; 0: 未指定类型; 1: 知识库检索Agent
     */
    public Long getAgentType() {
        return this.AgentType;
    }

    /**
     * Set Agent类型; 0: 未指定类型; 1: 知识库检索Agent
     * @param AgentType Agent类型; 0: 未指定类型; 1: 知识库检索Agent
     */
    public void setAgentType(Long AgentType) {
        this.AgentType = AgentType;
    }

    /**
     * Get 0 自由转交，1 计划与执行 
     * @return AgentMode 0 自由转交，1 计划与执行
     */
    public Long getAgentMode() {
        return this.AgentMode;
    }

    /**
     * Set 0 自由转交，1 计划与执行
     * @param AgentMode 0 自由转交，1 计划与执行
     */
    public void setAgentMode(Long AgentMode) {
        this.AgentMode = AgentMode;
    }

    public Agent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Agent(Agent source) {
        if (source.AgentId != null) {
            this.AgentId = new String(source.AgentId);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.IconUrl != null) {
            this.IconUrl = new String(source.IconUrl);
        }
        if (source.Instructions != null) {
            this.Instructions = new String(source.Instructions);
        }
        if (source.HandoffDescription != null) {
            this.HandoffDescription = new String(source.HandoffDescription);
        }
        if (source.Handoffs != null) {
            this.Handoffs = new String[source.Handoffs.length];
            for (int i = 0; i < source.Handoffs.length; i++) {
                this.Handoffs[i] = new String(source.Handoffs[i]);
            }
        }
        if (source.Model != null) {
            this.Model = new AgentModelInfo(source.Model);
        }
        if (source.Tools != null) {
            this.Tools = new AgentToolInfo[source.Tools.length];
            for (int i = 0; i < source.Tools.length; i++) {
                this.Tools[i] = new AgentToolInfo(source.Tools[i]);
            }
        }
        if (source.Plugins != null) {
            this.Plugins = new AgentPluginInfo[source.Plugins.length];
            for (int i = 0; i < source.Plugins.length; i++) {
                this.Plugins[i] = new AgentPluginInfo(source.Plugins[i]);
            }
        }
        if (source.IsStartingAgent != null) {
            this.IsStartingAgent = new Boolean(source.IsStartingAgent);
        }
        if (source.AgentType != null) {
            this.AgentType = new Long(source.AgentType);
        }
        if (source.AgentMode != null) {
            this.AgentMode = new Long(source.AgentMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AgentId", this.AgentId);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "IconUrl", this.IconUrl);
        this.setParamSimple(map, prefix + "Instructions", this.Instructions);
        this.setParamSimple(map, prefix + "HandoffDescription", this.HandoffDescription);
        this.setParamArraySimple(map, prefix + "Handoffs.", this.Handoffs);
        this.setParamObj(map, prefix + "Model.", this.Model);
        this.setParamArrayObj(map, prefix + "Tools.", this.Tools);
        this.setParamArrayObj(map, prefix + "Plugins.", this.Plugins);
        this.setParamSimple(map, prefix + "IsStartingAgent", this.IsStartingAgent);
        this.setParamSimple(map, prefix + "AgentType", this.AgentType);
        this.setParamSimple(map, prefix + "AgentMode", this.AgentMode);

    }
}

