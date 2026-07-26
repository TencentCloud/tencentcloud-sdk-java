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

public class ExecuteConfig extends AbstractModel {

    /**
    * <p>Prompt配置</p>
    */
    @SerializedName("PromptConfig")
    @Expose
    private AppTriggerPromptExecuteConfig PromptConfig;

    /**
    * <p>工作流配置</p>
    */
    @SerializedName("WorkflowConfig")
    @Expose
    private AppTriggerWorkflowExecuteConfig WorkflowConfig;

    /**
     * Get <p>Prompt配置</p> 
     * @return PromptConfig <p>Prompt配置</p>
     */
    public AppTriggerPromptExecuteConfig getPromptConfig() {
        return this.PromptConfig;
    }

    /**
     * Set <p>Prompt配置</p>
     * @param PromptConfig <p>Prompt配置</p>
     */
    public void setPromptConfig(AppTriggerPromptExecuteConfig PromptConfig) {
        this.PromptConfig = PromptConfig;
    }

    /**
     * Get <p>工作流配置</p> 
     * @return WorkflowConfig <p>工作流配置</p>
     */
    public AppTriggerWorkflowExecuteConfig getWorkflowConfig() {
        return this.WorkflowConfig;
    }

    /**
     * Set <p>工作流配置</p>
     * @param WorkflowConfig <p>工作流配置</p>
     */
    public void setWorkflowConfig(AppTriggerWorkflowExecuteConfig WorkflowConfig) {
        this.WorkflowConfig = WorkflowConfig;
    }

    public ExecuteConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExecuteConfig(ExecuteConfig source) {
        if (source.PromptConfig != null) {
            this.PromptConfig = new AppTriggerPromptExecuteConfig(source.PromptConfig);
        }
        if (source.WorkflowConfig != null) {
            this.WorkflowConfig = new AppTriggerWorkflowExecuteConfig(source.WorkflowConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "PromptConfig.", this.PromptConfig);
        this.setParamObj(map, prefix + "WorkflowConfig.", this.WorkflowConfig);

    }
}

