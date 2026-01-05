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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RerunTriggerWorkflowRunAsyncRequest extends AbstractModel {

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 工作流ID
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * 工作流运行ID
    */
    @SerializedName("WorkflowExecutionId")
    @Expose
    private String WorkflowExecutionId;

    /**
    * 运行方式：普通运行默认所有参数：1，高级运行可选任务范围和运行参数：2
    */
    @SerializedName("ExecuteType")
    @Expose
    private String ExecuteType;

    /**
    * 运行类型为高级运行时填写的自定义运行参数
    */
    @SerializedName("AdvancedParams")
    @Expose
    private SchedulingParameter [] AdvancedParams;

    /**
    * 高级运行模式下本次需要运行指定的任务ID集合
    */
    @SerializedName("TaskIds")
    @Expose
    private String [] TaskIds;

    /**
    * 指定调度资源组,为空时默认使用配置的原调度资源组
    */
    @SerializedName("SchedulingResourceGroup")
    @Expose
    private String SchedulingResourceGroup;

    /**
    * 指定集成资源组,为空时默认使用配置的原集成资源组
    */
    @SerializedName("IntegrationResourceGroup")
    @Expose
    private String IntegrationResourceGroup;

    /**
     * Get 项目ID 
     * @return ProjectId 项目ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID
     * @param ProjectId 项目ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 工作流ID 
     * @return WorkflowId 工作流ID
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set 工作流ID
     * @param WorkflowId 工作流ID
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
    }

    /**
     * Get 工作流运行ID 
     * @return WorkflowExecutionId 工作流运行ID
     */
    public String getWorkflowExecutionId() {
        return this.WorkflowExecutionId;
    }

    /**
     * Set 工作流运行ID
     * @param WorkflowExecutionId 工作流运行ID
     */
    public void setWorkflowExecutionId(String WorkflowExecutionId) {
        this.WorkflowExecutionId = WorkflowExecutionId;
    }

    /**
     * Get 运行方式：普通运行默认所有参数：1，高级运行可选任务范围和运行参数：2 
     * @return ExecuteType 运行方式：普通运行默认所有参数：1，高级运行可选任务范围和运行参数：2
     */
    public String getExecuteType() {
        return this.ExecuteType;
    }

    /**
     * Set 运行方式：普通运行默认所有参数：1，高级运行可选任务范围和运行参数：2
     * @param ExecuteType 运行方式：普通运行默认所有参数：1，高级运行可选任务范围和运行参数：2
     */
    public void setExecuteType(String ExecuteType) {
        this.ExecuteType = ExecuteType;
    }

    /**
     * Get 运行类型为高级运行时填写的自定义运行参数 
     * @return AdvancedParams 运行类型为高级运行时填写的自定义运行参数
     */
    public SchedulingParameter [] getAdvancedParams() {
        return this.AdvancedParams;
    }

    /**
     * Set 运行类型为高级运行时填写的自定义运行参数
     * @param AdvancedParams 运行类型为高级运行时填写的自定义运行参数
     */
    public void setAdvancedParams(SchedulingParameter [] AdvancedParams) {
        this.AdvancedParams = AdvancedParams;
    }

    /**
     * Get 高级运行模式下本次需要运行指定的任务ID集合 
     * @return TaskIds 高级运行模式下本次需要运行指定的任务ID集合
     */
    public String [] getTaskIds() {
        return this.TaskIds;
    }

    /**
     * Set 高级运行模式下本次需要运行指定的任务ID集合
     * @param TaskIds 高级运行模式下本次需要运行指定的任务ID集合
     */
    public void setTaskIds(String [] TaskIds) {
        this.TaskIds = TaskIds;
    }

    /**
     * Get 指定调度资源组,为空时默认使用配置的原调度资源组 
     * @return SchedulingResourceGroup 指定调度资源组,为空时默认使用配置的原调度资源组
     */
    public String getSchedulingResourceGroup() {
        return this.SchedulingResourceGroup;
    }

    /**
     * Set 指定调度资源组,为空时默认使用配置的原调度资源组
     * @param SchedulingResourceGroup 指定调度资源组,为空时默认使用配置的原调度资源组
     */
    public void setSchedulingResourceGroup(String SchedulingResourceGroup) {
        this.SchedulingResourceGroup = SchedulingResourceGroup;
    }

    /**
     * Get 指定集成资源组,为空时默认使用配置的原集成资源组 
     * @return IntegrationResourceGroup 指定集成资源组,为空时默认使用配置的原集成资源组
     */
    public String getIntegrationResourceGroup() {
        return this.IntegrationResourceGroup;
    }

    /**
     * Set 指定集成资源组,为空时默认使用配置的原集成资源组
     * @param IntegrationResourceGroup 指定集成资源组,为空时默认使用配置的原集成资源组
     */
    public void setIntegrationResourceGroup(String IntegrationResourceGroup) {
        this.IntegrationResourceGroup = IntegrationResourceGroup;
    }

    public RerunTriggerWorkflowRunAsyncRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RerunTriggerWorkflowRunAsyncRequest(RerunTriggerWorkflowRunAsyncRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.WorkflowExecutionId != null) {
            this.WorkflowExecutionId = new String(source.WorkflowExecutionId);
        }
        if (source.ExecuteType != null) {
            this.ExecuteType = new String(source.ExecuteType);
        }
        if (source.AdvancedParams != null) {
            this.AdvancedParams = new SchedulingParameter[source.AdvancedParams.length];
            for (int i = 0; i < source.AdvancedParams.length; i++) {
                this.AdvancedParams[i] = new SchedulingParameter(source.AdvancedParams[i]);
            }
        }
        if (source.TaskIds != null) {
            this.TaskIds = new String[source.TaskIds.length];
            for (int i = 0; i < source.TaskIds.length; i++) {
                this.TaskIds[i] = new String(source.TaskIds[i]);
            }
        }
        if (source.SchedulingResourceGroup != null) {
            this.SchedulingResourceGroup = new String(source.SchedulingResourceGroup);
        }
        if (source.IntegrationResourceGroup != null) {
            this.IntegrationResourceGroup = new String(source.IntegrationResourceGroup);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "WorkflowExecutionId", this.WorkflowExecutionId);
        this.setParamSimple(map, prefix + "ExecuteType", this.ExecuteType);
        this.setParamArrayObj(map, prefix + "AdvancedParams.", this.AdvancedParams);
        this.setParamArraySimple(map, prefix + "TaskIds.", this.TaskIds);
        this.setParamSimple(map, prefix + "SchedulingResourceGroup", this.SchedulingResourceGroup);
        this.setParamSimple(map, prefix + "IntegrationResourceGroup", this.IntegrationResourceGroup);

    }
}

