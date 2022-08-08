/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyTaskLinksRequest extends AbstractModel{

    /**
    * 项目Id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 父任务ID
    */
    @SerializedName("TaskFrom")
    @Expose
    private String TaskFrom;

    /**
    * 子任务ID
    */
    @SerializedName("TaskTo")
    @Expose
    private String TaskTo;

    /**
    * 子任务工作流
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * 父任务工作流
    */
    @SerializedName("RealFromWorkflowId")
    @Expose
    private String RealFromWorkflowId;

    /**
    * 父子任务之间的依赖关系
    */
    @SerializedName("LinkDependencyType")
    @Expose
    private String LinkDependencyType;

    /**
     * Get 项目Id 
     * @return ProjectId 项目Id
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目Id
     * @param ProjectId 项目Id
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 父任务ID 
     * @return TaskFrom 父任务ID
     */
    public String getTaskFrom() {
        return this.TaskFrom;
    }

    /**
     * Set 父任务ID
     * @param TaskFrom 父任务ID
     */
    public void setTaskFrom(String TaskFrom) {
        this.TaskFrom = TaskFrom;
    }

    /**
     * Get 子任务ID 
     * @return TaskTo 子任务ID
     */
    public String getTaskTo() {
        return this.TaskTo;
    }

    /**
     * Set 子任务ID
     * @param TaskTo 子任务ID
     */
    public void setTaskTo(String TaskTo) {
        this.TaskTo = TaskTo;
    }

    /**
     * Get 子任务工作流 
     * @return WorkflowId 子任务工作流
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set 子任务工作流
     * @param WorkflowId 子任务工作流
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
    }

    /**
     * Get 父任务工作流 
     * @return RealFromWorkflowId 父任务工作流
     */
    public String getRealFromWorkflowId() {
        return this.RealFromWorkflowId;
    }

    /**
     * Set 父任务工作流
     * @param RealFromWorkflowId 父任务工作流
     */
    public void setRealFromWorkflowId(String RealFromWorkflowId) {
        this.RealFromWorkflowId = RealFromWorkflowId;
    }

    /**
     * Get 父子任务之间的依赖关系 
     * @return LinkDependencyType 父子任务之间的依赖关系
     */
    public String getLinkDependencyType() {
        return this.LinkDependencyType;
    }

    /**
     * Set 父子任务之间的依赖关系
     * @param LinkDependencyType 父子任务之间的依赖关系
     */
    public void setLinkDependencyType(String LinkDependencyType) {
        this.LinkDependencyType = LinkDependencyType;
    }

    public ModifyTaskLinksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyTaskLinksRequest(ModifyTaskLinksRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.TaskFrom != null) {
            this.TaskFrom = new String(source.TaskFrom);
        }
        if (source.TaskTo != null) {
            this.TaskTo = new String(source.TaskTo);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.RealFromWorkflowId != null) {
            this.RealFromWorkflowId = new String(source.RealFromWorkflowId);
        }
        if (source.LinkDependencyType != null) {
            this.LinkDependencyType = new String(source.LinkDependencyType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "TaskFrom", this.TaskFrom);
        this.setParamSimple(map, prefix + "TaskTo", this.TaskTo);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "RealFromWorkflowId", this.RealFromWorkflowId);
        this.setParamSimple(map, prefix + "LinkDependencyType", this.LinkDependencyType);

    }
}

