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

public class DescribeDependOpsTasksRequest extends AbstractModel{

    /**
    * 任务Id
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 上游/下游层级1-6级
    */
    @SerializedName("Deep")
    @Expose
    private Long Deep;

    /**
    * 1: 表示查询上游节点；0:表示查询下游节点；2：表示查询上游和下游节点
    */
    @SerializedName("Up")
    @Expose
    private Long Up;

    /**
    * 项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 任务工作流id
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
     * Get 任务Id 
     * @return TaskId 任务Id
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务Id
     * @param TaskId 任务Id
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 上游/下游层级1-6级 
     * @return Deep 上游/下游层级1-6级
     */
    public Long getDeep() {
        return this.Deep;
    }

    /**
     * Set 上游/下游层级1-6级
     * @param Deep 上游/下游层级1-6级
     */
    public void setDeep(Long Deep) {
        this.Deep = Deep;
    }

    /**
     * Get 1: 表示查询上游节点；0:表示查询下游节点；2：表示查询上游和下游节点 
     * @return Up 1: 表示查询上游节点；0:表示查询下游节点；2：表示查询上游和下游节点
     */
    public Long getUp() {
        return this.Up;
    }

    /**
     * Set 1: 表示查询上游节点；0:表示查询下游节点；2：表示查询上游和下游节点
     * @param Up 1: 表示查询上游节点；0:表示查询下游节点；2：表示查询上游和下游节点
     */
    public void setUp(Long Up) {
        this.Up = Up;
    }

    /**
     * Get 项目id 
     * @return ProjectId 项目id
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目id
     * @param ProjectId 项目id
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 任务工作流id 
     * @return WorkflowId 任务工作流id
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set 任务工作流id
     * @param WorkflowId 任务工作流id
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
    }

    public DescribeDependOpsTasksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDependOpsTasksRequest(DescribeDependOpsTasksRequest source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Deep != null) {
            this.Deep = new Long(source.Deep);
        }
        if (source.Up != null) {
            this.Up = new Long(source.Up);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Deep", this.Deep);
        this.setParamSimple(map, prefix + "Up", this.Up);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);

    }
}

