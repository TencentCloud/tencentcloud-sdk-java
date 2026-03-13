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

public class CreateTriggerWorkflowRunRequest extends AbstractModel {

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
    * 自定义运行参数，如果为空或者null则使用工作流最新配置
    */
    @SerializedName("AdvancedParams")
    @Expose
    private SchedulingParameter [] AdvancedParams;

    /**
    * 本次需要运行指定的任务ID集合，如果为null或为空则运行全部
    */
    @SerializedName("TaskIds")
    @Expose
    private String [] TaskIds;

    /**
    * 指定的调度资源组id，为空默认原资源组
    */
    @SerializedName("SchedulingResourceGroupId")
    @Expose
    private String SchedulingResourceGroupId;

    /**
    * 指定的集成资源组id，为空默认原资源组
    */
    @SerializedName("IntegrationResourceGroupId")
    @Expose
    private String IntegrationResourceGroupId;

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
     * Get 自定义运行参数，如果为空或者null则使用工作流最新配置 
     * @return AdvancedParams 自定义运行参数，如果为空或者null则使用工作流最新配置
     */
    public SchedulingParameter [] getAdvancedParams() {
        return this.AdvancedParams;
    }

    /**
     * Set 自定义运行参数，如果为空或者null则使用工作流最新配置
     * @param AdvancedParams 自定义运行参数，如果为空或者null则使用工作流最新配置
     */
    public void setAdvancedParams(SchedulingParameter [] AdvancedParams) {
        this.AdvancedParams = AdvancedParams;
    }

    /**
     * Get 本次需要运行指定的任务ID集合，如果为null或为空则运行全部 
     * @return TaskIds 本次需要运行指定的任务ID集合，如果为null或为空则运行全部
     */
    public String [] getTaskIds() {
        return this.TaskIds;
    }

    /**
     * Set 本次需要运行指定的任务ID集合，如果为null或为空则运行全部
     * @param TaskIds 本次需要运行指定的任务ID集合，如果为null或为空则运行全部
     */
    public void setTaskIds(String [] TaskIds) {
        this.TaskIds = TaskIds;
    }

    /**
     * Get 指定的调度资源组id，为空默认原资源组 
     * @return SchedulingResourceGroupId 指定的调度资源组id，为空默认原资源组
     */
    public String getSchedulingResourceGroupId() {
        return this.SchedulingResourceGroupId;
    }

    /**
     * Set 指定的调度资源组id，为空默认原资源组
     * @param SchedulingResourceGroupId 指定的调度资源组id，为空默认原资源组
     */
    public void setSchedulingResourceGroupId(String SchedulingResourceGroupId) {
        this.SchedulingResourceGroupId = SchedulingResourceGroupId;
    }

    /**
     * Get 指定的集成资源组id，为空默认原资源组 
     * @return IntegrationResourceGroupId 指定的集成资源组id，为空默认原资源组
     */
    public String getIntegrationResourceGroupId() {
        return this.IntegrationResourceGroupId;
    }

    /**
     * Set 指定的集成资源组id，为空默认原资源组
     * @param IntegrationResourceGroupId 指定的集成资源组id，为空默认原资源组
     */
    public void setIntegrationResourceGroupId(String IntegrationResourceGroupId) {
        this.IntegrationResourceGroupId = IntegrationResourceGroupId;
    }

    public CreateTriggerWorkflowRunRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateTriggerWorkflowRunRequest(CreateTriggerWorkflowRunRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
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
        if (source.SchedulingResourceGroupId != null) {
            this.SchedulingResourceGroupId = new String(source.SchedulingResourceGroupId);
        }
        if (source.IntegrationResourceGroupId != null) {
            this.IntegrationResourceGroupId = new String(source.IntegrationResourceGroupId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamArrayObj(map, prefix + "AdvancedParams.", this.AdvancedParams);
        this.setParamArraySimple(map, prefix + "TaskIds.", this.TaskIds);
        this.setParamSimple(map, prefix + "SchedulingResourceGroupId", this.SchedulingResourceGroupId);
        this.setParamSimple(map, prefix + "IntegrationResourceGroupId", this.IntegrationResourceGroupId);

    }
}

