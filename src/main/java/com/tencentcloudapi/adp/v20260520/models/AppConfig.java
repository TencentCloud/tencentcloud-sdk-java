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

public class AppConfig extends AbstractModel {

    /**
    * 体验配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Experience")
    @Expose
    private AppExperienceConfig Experience;

    /**
    * 欢迎语配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Greeting")
    @Expose
    private AppGreetingConfig Greeting;

    /**
    * 记忆配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Memory")
    @Expose
    private AppMemoryConfig Memory;

    /**
    * 模式相关配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Mode")
    @Expose
    private AppModeConfig Mode;

    /**
    * 模型配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Model")
    @Expose
    private AppModelConfig Model;

    /**
    * 联网搜索配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WebSearch")
    @Expose
    private AppWebSearchConfig WebSearch;

    /**
    * 工作流配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Workflow")
    @Expose
    private AppWorkflowConfig Workflow;

    /**
     * Get 体验配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Experience 体验配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AppExperienceConfig getExperience() {
        return this.Experience;
    }

    /**
     * Set 体验配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param Experience 体验配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExperience(AppExperienceConfig Experience) {
        this.Experience = Experience;
    }

    /**
     * Get 欢迎语配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Greeting 欢迎语配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AppGreetingConfig getGreeting() {
        return this.Greeting;
    }

    /**
     * Set 欢迎语配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param Greeting 欢迎语配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGreeting(AppGreetingConfig Greeting) {
        this.Greeting = Greeting;
    }

    /**
     * Get 记忆配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Memory 记忆配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AppMemoryConfig getMemory() {
        return this.Memory;
    }

    /**
     * Set 记忆配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param Memory 记忆配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMemory(AppMemoryConfig Memory) {
        this.Memory = Memory;
    }

    /**
     * Get 模式相关配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Mode 模式相关配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AppModeConfig getMode() {
        return this.Mode;
    }

    /**
     * Set 模式相关配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param Mode 模式相关配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMode(AppModeConfig Mode) {
        this.Mode = Mode;
    }

    /**
     * Get 模型配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Model 模型配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AppModelConfig getModel() {
        return this.Model;
    }

    /**
     * Set 模型配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param Model 模型配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModel(AppModelConfig Model) {
        this.Model = Model;
    }

    /**
     * Get 联网搜索配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WebSearch 联网搜索配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AppWebSearchConfig getWebSearch() {
        return this.WebSearch;
    }

    /**
     * Set 联网搜索配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param WebSearch 联网搜索配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWebSearch(AppWebSearchConfig WebSearch) {
        this.WebSearch = WebSearch;
    }

    /**
     * Get 工作流配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Workflow 工作流配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AppWorkflowConfig getWorkflow() {
        return this.Workflow;
    }

    /**
     * Set 工作流配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param Workflow 工作流配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkflow(AppWorkflowConfig Workflow) {
        this.Workflow = Workflow;
    }

    public AppConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AppConfig(AppConfig source) {
        if (source.Experience != null) {
            this.Experience = new AppExperienceConfig(source.Experience);
        }
        if (source.Greeting != null) {
            this.Greeting = new AppGreetingConfig(source.Greeting);
        }
        if (source.Memory != null) {
            this.Memory = new AppMemoryConfig(source.Memory);
        }
        if (source.Mode != null) {
            this.Mode = new AppModeConfig(source.Mode);
        }
        if (source.Model != null) {
            this.Model = new AppModelConfig(source.Model);
        }
        if (source.WebSearch != null) {
            this.WebSearch = new AppWebSearchConfig(source.WebSearch);
        }
        if (source.Workflow != null) {
            this.Workflow = new AppWorkflowConfig(source.Workflow);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Experience.", this.Experience);
        this.setParamObj(map, prefix + "Greeting.", this.Greeting);
        this.setParamObj(map, prefix + "Memory.", this.Memory);
        this.setParamObj(map, prefix + "Mode.", this.Mode);
        this.setParamObj(map, prefix + "Model.", this.Model);
        this.setParamObj(map, prefix + "WebSearch.", this.WebSearch);
        this.setParamObj(map, prefix + "Workflow.", this.Workflow);

    }
}

