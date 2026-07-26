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

public class AppTriggerWorkflowExecuteConfig extends AbstractModel {

    /**
    * <p>工作流API参数绑定</p>
    */
    @SerializedName("ParamBindingsApi")
    @Expose
    private AppTriggerParamBindingConfig ParamBindingsApi;

    /**
    * <p>工作流参数绑定</p>
    */
    @SerializedName("ParamBindingsWorkflow")
    @Expose
    private AppTriggerParamBindingConfig ParamBindingsWorkflow;

    /**
    * <p>工作流ID</p>
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * <p>工作流名字</p>
    */
    @SerializedName("WorkflowName")
    @Expose
    private String WorkflowName;

    /**
     * Get <p>工作流API参数绑定</p> 
     * @return ParamBindingsApi <p>工作流API参数绑定</p>
     */
    public AppTriggerParamBindingConfig getParamBindingsApi() {
        return this.ParamBindingsApi;
    }

    /**
     * Set <p>工作流API参数绑定</p>
     * @param ParamBindingsApi <p>工作流API参数绑定</p>
     */
    public void setParamBindingsApi(AppTriggerParamBindingConfig ParamBindingsApi) {
        this.ParamBindingsApi = ParamBindingsApi;
    }

    /**
     * Get <p>工作流参数绑定</p> 
     * @return ParamBindingsWorkflow <p>工作流参数绑定</p>
     */
    public AppTriggerParamBindingConfig getParamBindingsWorkflow() {
        return this.ParamBindingsWorkflow;
    }

    /**
     * Set <p>工作流参数绑定</p>
     * @param ParamBindingsWorkflow <p>工作流参数绑定</p>
     */
    public void setParamBindingsWorkflow(AppTriggerParamBindingConfig ParamBindingsWorkflow) {
        this.ParamBindingsWorkflow = ParamBindingsWorkflow;
    }

    /**
     * Get <p>工作流ID</p> 
     * @return WorkflowId <p>工作流ID</p>
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set <p>工作流ID</p>
     * @param WorkflowId <p>工作流ID</p>
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
    }

    /**
     * Get <p>工作流名字</p> 
     * @return WorkflowName <p>工作流名字</p>
     */
    public String getWorkflowName() {
        return this.WorkflowName;
    }

    /**
     * Set <p>工作流名字</p>
     * @param WorkflowName <p>工作流名字</p>
     */
    public void setWorkflowName(String WorkflowName) {
        this.WorkflowName = WorkflowName;
    }

    public AppTriggerWorkflowExecuteConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AppTriggerWorkflowExecuteConfig(AppTriggerWorkflowExecuteConfig source) {
        if (source.ParamBindingsApi != null) {
            this.ParamBindingsApi = new AppTriggerParamBindingConfig(source.ParamBindingsApi);
        }
        if (source.ParamBindingsWorkflow != null) {
            this.ParamBindingsWorkflow = new AppTriggerParamBindingConfig(source.ParamBindingsWorkflow);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.WorkflowName != null) {
            this.WorkflowName = new String(source.WorkflowName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ParamBindingsApi.", this.ParamBindingsApi);
        this.setParamObj(map, prefix + "ParamBindingsWorkflow.", this.ParamBindingsWorkflow);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "WorkflowName", this.WorkflowName);

    }
}

