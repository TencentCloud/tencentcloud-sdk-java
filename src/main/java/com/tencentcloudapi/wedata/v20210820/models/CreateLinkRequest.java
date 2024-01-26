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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateLinkRequest extends AbstractModel {

    /**
    * 当前项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 边的源节点
    */
    @SerializedName("TaskFrom")
    @Expose
    private String TaskFrom;

    /**
    * 边的目标节点
    */
    @SerializedName("TaskTo")
    @Expose
    private String TaskTo;

    /**
    * 当前工作流id
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
     * Get 当前项目id 
     * @return ProjectId 当前项目id
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 当前项目id
     * @param ProjectId 当前项目id
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 边的源节点 
     * @return TaskFrom 边的源节点
     */
    public String getTaskFrom() {
        return this.TaskFrom;
    }

    /**
     * Set 边的源节点
     * @param TaskFrom 边的源节点
     */
    public void setTaskFrom(String TaskFrom) {
        this.TaskFrom = TaskFrom;
    }

    /**
     * Get 边的目标节点 
     * @return TaskTo 边的目标节点
     */
    public String getTaskTo() {
        return this.TaskTo;
    }

    /**
     * Set 边的目标节点
     * @param TaskTo 边的目标节点
     */
    public void setTaskTo(String TaskTo) {
        this.TaskTo = TaskTo;
    }

    /**
     * Get 当前工作流id 
     * @return WorkflowId 当前工作流id
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set 当前工作流id
     * @param WorkflowId 当前工作流id
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
    }

    public CreateLinkRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateLinkRequest(CreateLinkRequest source) {
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "TaskFrom", this.TaskFrom);
        this.setParamSimple(map, prefix + "TaskTo", this.TaskTo);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);

    }
}

