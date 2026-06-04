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
    * 系统提示词
    */
    @SerializedName("Instructions")
    @Expose
    private String Instructions;

    /**
    * 主模型配置
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
    * 高级设置
    */
    @SerializedName("AdvancedConfig")
    @Expose
    private AgentAdvancedConfig AdvancedConfig;

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
     * Get 系统提示词 
     * @return Instructions 系统提示词
     */
    public String getInstructions() {
        return this.Instructions;
    }

    /**
     * Set 系统提示词
     * @param Instructions 系统提示词
     */
    public void setInstructions(String Instructions) {
        this.Instructions = Instructions;
    }

    /**
     * Get 主模型配置 
     * @return Model 主模型配置
     */
    public AgentModelConfig getModel() {
        return this.Model;
    }

    /**
     * Set 主模型配置
     * @param Model 主模型配置
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
     * Get 高级设置 
     * @return AdvancedConfig 高级设置
     */
    public AgentAdvancedConfig getAdvancedConfig() {
        return this.AdvancedConfig;
    }

    /**
     * Set 高级设置
     * @param AdvancedConfig 高级设置
     */
    public void setAdvancedConfig(AgentAdvancedConfig AdvancedConfig) {
        this.AdvancedConfig = AdvancedConfig;
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

    }
}

