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

public class WorkflowRun extends AbstractModel {

    /**
    * 工作流运行实例基本信息
    */
    @SerializedName("WorkflowRunSummary")
    @Expose
    private WorkflowRunSummary WorkflowRunSummary;

    /**
    * 工作流运行实例输出信息
    */
    @SerializedName("WorkflowRunOutput")
    @Expose
    private WorkflowRunOutput WorkflowRunOutput;

    /**
    * 工作流运行实例元数据
    */
    @SerializedName("WorkflowRunMetadata")
    @Expose
    private WorkflowRunMetadata WorkflowRunMetadata;

    /**
     * Get 工作流运行实例基本信息 
     * @return WorkflowRunSummary 工作流运行实例基本信息
     */
    public WorkflowRunSummary getWorkflowRunSummary() {
        return this.WorkflowRunSummary;
    }

    /**
     * Set 工作流运行实例基本信息
     * @param WorkflowRunSummary 工作流运行实例基本信息
     */
    public void setWorkflowRunSummary(WorkflowRunSummary WorkflowRunSummary) {
        this.WorkflowRunSummary = WorkflowRunSummary;
    }

    /**
     * Get 工作流运行实例输出信息 
     * @return WorkflowRunOutput 工作流运行实例输出信息
     */
    public WorkflowRunOutput getWorkflowRunOutput() {
        return this.WorkflowRunOutput;
    }

    /**
     * Set 工作流运行实例输出信息
     * @param WorkflowRunOutput 工作流运行实例输出信息
     */
    public void setWorkflowRunOutput(WorkflowRunOutput WorkflowRunOutput) {
        this.WorkflowRunOutput = WorkflowRunOutput;
    }

    /**
     * Get 工作流运行实例元数据 
     * @return WorkflowRunMetadata 工作流运行实例元数据
     */
    public WorkflowRunMetadata getWorkflowRunMetadata() {
        return this.WorkflowRunMetadata;
    }

    /**
     * Set 工作流运行实例元数据
     * @param WorkflowRunMetadata 工作流运行实例元数据
     */
    public void setWorkflowRunMetadata(WorkflowRunMetadata WorkflowRunMetadata) {
        this.WorkflowRunMetadata = WorkflowRunMetadata;
    }

    public WorkflowRun() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WorkflowRun(WorkflowRun source) {
        if (source.WorkflowRunSummary != null) {
            this.WorkflowRunSummary = new WorkflowRunSummary(source.WorkflowRunSummary);
        }
        if (source.WorkflowRunOutput != null) {
            this.WorkflowRunOutput = new WorkflowRunOutput(source.WorkflowRunOutput);
        }
        if (source.WorkflowRunMetadata != null) {
            this.WorkflowRunMetadata = new WorkflowRunMetadata(source.WorkflowRunMetadata);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "WorkflowRunSummary.", this.WorkflowRunSummary);
        this.setParamObj(map, prefix + "WorkflowRunOutput.", this.WorkflowRunOutput);
        this.setParamObj(map, prefix + "WorkflowRunMetadata.", this.WorkflowRunMetadata);

    }
}

