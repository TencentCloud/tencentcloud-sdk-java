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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RerunWorkflowRunRequest extends AbstractModel {

    /**
    * <p>工作空间ID，可通过 ListWorkspaces 获取。必填</p>
    */
    @SerializedName("WorkspaceId")
    @Expose
    private String WorkspaceId;

    /**
    * <p>工作流ID，可通过 ListWorkflows 获取。必填</p>
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * <p>工作流运行ID，可通过 ListWorkflowRuns 获取。必填</p>
    */
    @SerializedName("WorkflowRunId")
    @Expose
    private String WorkflowRunId;

    /**
    * <p>运行类型。必填。取值：1 普通运行，2 高级运行</p>
    */
    @SerializedName("RunType")
    @Expose
    private Long RunType;

    /**
    * <p>运行类型为高级运行时填写的自定义运行参数</p>
    */
    @SerializedName("AdvancedParams")
    @Expose
    private TaskSchedulingParameterBrief [] AdvancedParams;

    /**
    * <p>本次需要重跑指定的任务ID集合，可通过 ListWorkflowTasks 获取，不传默认重跑该工作流下所有任务</p>
    */
    @SerializedName("TaskIds")
    @Expose
    private String [] TaskIds;

    /**
     * Get <p>工作空间ID，可通过 ListWorkspaces 获取。必填</p> 
     * @return WorkspaceId <p>工作空间ID，可通过 ListWorkspaces 获取。必填</p>
     */
    public String getWorkspaceId() {
        return this.WorkspaceId;
    }

    /**
     * Set <p>工作空间ID，可通过 ListWorkspaces 获取。必填</p>
     * @param WorkspaceId <p>工作空间ID，可通过 ListWorkspaces 获取。必填</p>
     */
    public void setWorkspaceId(String WorkspaceId) {
        this.WorkspaceId = WorkspaceId;
    }

    /**
     * Get <p>工作流ID，可通过 ListWorkflows 获取。必填</p> 
     * @return WorkflowId <p>工作流ID，可通过 ListWorkflows 获取。必填</p>
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set <p>工作流ID，可通过 ListWorkflows 获取。必填</p>
     * @param WorkflowId <p>工作流ID，可通过 ListWorkflows 获取。必填</p>
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
    }

    /**
     * Get <p>工作流运行ID，可通过 ListWorkflowRuns 获取。必填</p> 
     * @return WorkflowRunId <p>工作流运行ID，可通过 ListWorkflowRuns 获取。必填</p>
     */
    public String getWorkflowRunId() {
        return this.WorkflowRunId;
    }

    /**
     * Set <p>工作流运行ID，可通过 ListWorkflowRuns 获取。必填</p>
     * @param WorkflowRunId <p>工作流运行ID，可通过 ListWorkflowRuns 获取。必填</p>
     */
    public void setWorkflowRunId(String WorkflowRunId) {
        this.WorkflowRunId = WorkflowRunId;
    }

    /**
     * Get <p>运行类型。必填。取值：1 普通运行，2 高级运行</p> 
     * @return RunType <p>运行类型。必填。取值：1 普通运行，2 高级运行</p>
     */
    public Long getRunType() {
        return this.RunType;
    }

    /**
     * Set <p>运行类型。必填。取值：1 普通运行，2 高级运行</p>
     * @param RunType <p>运行类型。必填。取值：1 普通运行，2 高级运行</p>
     */
    public void setRunType(Long RunType) {
        this.RunType = RunType;
    }

    /**
     * Get <p>运行类型为高级运行时填写的自定义运行参数</p> 
     * @return AdvancedParams <p>运行类型为高级运行时填写的自定义运行参数</p>
     */
    public TaskSchedulingParameterBrief [] getAdvancedParams() {
        return this.AdvancedParams;
    }

    /**
     * Set <p>运行类型为高级运行时填写的自定义运行参数</p>
     * @param AdvancedParams <p>运行类型为高级运行时填写的自定义运行参数</p>
     */
    public void setAdvancedParams(TaskSchedulingParameterBrief [] AdvancedParams) {
        this.AdvancedParams = AdvancedParams;
    }

    /**
     * Get <p>本次需要重跑指定的任务ID集合，可通过 ListWorkflowTasks 获取，不传默认重跑该工作流下所有任务</p> 
     * @return TaskIds <p>本次需要重跑指定的任务ID集合，可通过 ListWorkflowTasks 获取，不传默认重跑该工作流下所有任务</p>
     */
    public String [] getTaskIds() {
        return this.TaskIds;
    }

    /**
     * Set <p>本次需要重跑指定的任务ID集合，可通过 ListWorkflowTasks 获取，不传默认重跑该工作流下所有任务</p>
     * @param TaskIds <p>本次需要重跑指定的任务ID集合，可通过 ListWorkflowTasks 获取，不传默认重跑该工作流下所有任务</p>
     */
    public void setTaskIds(String [] TaskIds) {
        this.TaskIds = TaskIds;
    }

    public RerunWorkflowRunRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RerunWorkflowRunRequest(RerunWorkflowRunRequest source) {
        if (source.WorkspaceId != null) {
            this.WorkspaceId = new String(source.WorkspaceId);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.WorkflowRunId != null) {
            this.WorkflowRunId = new String(source.WorkflowRunId);
        }
        if (source.RunType != null) {
            this.RunType = new Long(source.RunType);
        }
        if (source.AdvancedParams != null) {
            this.AdvancedParams = new TaskSchedulingParameterBrief[source.AdvancedParams.length];
            for (int i = 0; i < source.AdvancedParams.length; i++) {
                this.AdvancedParams[i] = new TaskSchedulingParameterBrief(source.AdvancedParams[i]);
            }
        }
        if (source.TaskIds != null) {
            this.TaskIds = new String[source.TaskIds.length];
            for (int i = 0; i < source.TaskIds.length; i++) {
                this.TaskIds[i] = new String(source.TaskIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkspaceId", this.WorkspaceId);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "WorkflowRunId", this.WorkflowRunId);
        this.setParamSimple(map, prefix + "RunType", this.RunType);
        this.setParamArrayObj(map, prefix + "AdvancedParams.", this.AdvancedParams);
        this.setParamArraySimple(map, prefix + "TaskIds.", this.TaskIds);

    }
}

