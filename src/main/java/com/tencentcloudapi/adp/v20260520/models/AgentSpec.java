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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AgentSpec extends AbstractModel {

    /**
    * <p>Agent基本配置</p>
    */
    @SerializedName("Profile")
    @Expose
    private AgentProfile Profile;

    /**
    * <p>系统提示词</p>
    */
    @SerializedName("Instructions")
    @Expose
    private String Instructions;

    /**
    * <p>主模型配置</p>
    */
    @SerializedName("Model")
    @Expose
    private AgentModelConfig Model;

    /**
    * <p>工具信息</p>
    */
    @SerializedName("ToolList")
    @Expose
    private AgentToolConfig [] ToolList;

    /**
    * <p>插件信息</p>
    */
    @SerializedName("PluginList")
    @Expose
    private AgentPluginConfig [] PluginList;

    /**
    * <p>技能信息</p>
    */
    @SerializedName("SkillList")
    @Expose
    private AgentSkillConfig [] SkillList;

    /**
    * <p>高级设置</p>
    */
    @SerializedName("AdvancedConfig")
    @Expose
    private AgentAdvancedConfig AdvancedConfig;

    /**
    * <p>调用方执行的 Function Tool 列表</p><p>入参限制：仅在 C 端用户态 Agent 场景可用，B 端配置态 Agent  忽略该字段与</p>
    */
    @SerializedName("ExternalToolList")
    @Expose
    private AgentExternalToolConfig [] ExternalToolList;

    /**
     * Get <p>Agent基本配置</p> 
     * @return Profile <p>Agent基本配置</p>
     */
    public AgentProfile getProfile() {
        return this.Profile;
    }

    /**
     * Set <p>Agent基本配置</p>
     * @param Profile <p>Agent基本配置</p>
     */
    public void setProfile(AgentProfile Profile) {
        this.Profile = Profile;
    }

    /**
     * Get <p>系统提示词</p> 
     * @return Instructions <p>系统提示词</p>
     */
    public String getInstructions() {
        return this.Instructions;
    }

    /**
     * Set <p>系统提示词</p>
     * @param Instructions <p>系统提示词</p>
     */
    public void setInstructions(String Instructions) {
        this.Instructions = Instructions;
    }

    /**
     * Get <p>主模型配置</p> 
     * @return Model <p>主模型配置</p>
     */
    public AgentModelConfig getModel() {
        return this.Model;
    }

    /**
     * Set <p>主模型配置</p>
     * @param Model <p>主模型配置</p>
     */
    public void setModel(AgentModelConfig Model) {
        this.Model = Model;
    }

    /**
     * Get <p>工具信息</p> 
     * @return ToolList <p>工具信息</p>
     */
    public AgentToolConfig [] getToolList() {
        return this.ToolList;
    }

    /**
     * Set <p>工具信息</p>
     * @param ToolList <p>工具信息</p>
     */
    public void setToolList(AgentToolConfig [] ToolList) {
        this.ToolList = ToolList;
    }

    /**
     * Get <p>插件信息</p> 
     * @return PluginList <p>插件信息</p>
     */
    public AgentPluginConfig [] getPluginList() {
        return this.PluginList;
    }

    /**
     * Set <p>插件信息</p>
     * @param PluginList <p>插件信息</p>
     */
    public void setPluginList(AgentPluginConfig [] PluginList) {
        this.PluginList = PluginList;
    }

    /**
     * Get <p>技能信息</p> 
     * @return SkillList <p>技能信息</p>
     */
    public AgentSkillConfig [] getSkillList() {
        return this.SkillList;
    }

    /**
     * Set <p>技能信息</p>
     * @param SkillList <p>技能信息</p>
     */
    public void setSkillList(AgentSkillConfig [] SkillList) {
        this.SkillList = SkillList;
    }

    /**
     * Get <p>高级设置</p> 
     * @return AdvancedConfig <p>高级设置</p>
     */
    public AgentAdvancedConfig getAdvancedConfig() {
        return this.AdvancedConfig;
    }

    /**
     * Set <p>高级设置</p>
     * @param AdvancedConfig <p>高级设置</p>
     */
    public void setAdvancedConfig(AgentAdvancedConfig AdvancedConfig) {
        this.AdvancedConfig = AdvancedConfig;
    }

    /**
     * Get <p>调用方执行的 Function Tool 列表</p><p>入参限制：仅在 C 端用户态 Agent 场景可用，B 端配置态 Agent  忽略该字段与</p> 
     * @return ExternalToolList <p>调用方执行的 Function Tool 列表</p><p>入参限制：仅在 C 端用户态 Agent 场景可用，B 端配置态 Agent  忽略该字段与</p>
     */
    public AgentExternalToolConfig [] getExternalToolList() {
        return this.ExternalToolList;
    }

    /**
     * Set <p>调用方执行的 Function Tool 列表</p><p>入参限制：仅在 C 端用户态 Agent 场景可用，B 端配置态 Agent  忽略该字段与</p>
     * @param ExternalToolList <p>调用方执行的 Function Tool 列表</p><p>入参限制：仅在 C 端用户态 Agent 场景可用，B 端配置态 Agent  忽略该字段与</p>
     */
    public void setExternalToolList(AgentExternalToolConfig [] ExternalToolList) {
        this.ExternalToolList = ExternalToolList;
    }

    public AgentSpec() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AgentSpec(AgentSpec source) {
        if (source.Profile != null) {
            this.Profile = new AgentProfile(source.Profile);
        }
        if (source.Instructions != null) {
            this.Instructions = new String(source.Instructions);
        }
        if (source.Model != null) {
            this.Model = new AgentModelConfig(source.Model);
        }
        if (source.ToolList != null) {
            this.ToolList = new AgentToolConfig[source.ToolList.length];
            for (int i = 0; i < source.ToolList.length; i++) {
                this.ToolList[i] = new AgentToolConfig(source.ToolList[i]);
            }
        }
        if (source.PluginList != null) {
            this.PluginList = new AgentPluginConfig[source.PluginList.length];
            for (int i = 0; i < source.PluginList.length; i++) {
                this.PluginList[i] = new AgentPluginConfig(source.PluginList[i]);
            }
        }
        if (source.SkillList != null) {
            this.SkillList = new AgentSkillConfig[source.SkillList.length];
            for (int i = 0; i < source.SkillList.length; i++) {
                this.SkillList[i] = new AgentSkillConfig(source.SkillList[i]);
            }
        }
        if (source.AdvancedConfig != null) {
            this.AdvancedConfig = new AgentAdvancedConfig(source.AdvancedConfig);
        }
        if (source.ExternalToolList != null) {
            this.ExternalToolList = new AgentExternalToolConfig[source.ExternalToolList.length];
            for (int i = 0; i < source.ExternalToolList.length; i++) {
                this.ExternalToolList[i] = new AgentExternalToolConfig(source.ExternalToolList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Profile.", this.Profile);
        this.setParamSimple(map, prefix + "Instructions", this.Instructions);
        this.setParamObj(map, prefix + "Model.", this.Model);
        this.setParamArrayObj(map, prefix + "ToolList.", this.ToolList);
        this.setParamArrayObj(map, prefix + "PluginList.", this.PluginList);
        this.setParamArrayObj(map, prefix + "SkillList.", this.SkillList);
        this.setParamObj(map, prefix + "AdvancedConfig.", this.AdvancedConfig);
        this.setParamArrayObj(map, prefix + "ExternalToolList.", this.ExternalToolList);

    }
}

