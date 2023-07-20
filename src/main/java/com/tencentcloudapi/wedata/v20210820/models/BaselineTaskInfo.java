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

public class BaselineTaskInfo extends AbstractModel{

    /**
    * 项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 任务名称
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * 任务id
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 任务调度周期
    */
    @SerializedName("TaskCycle")
    @Expose
    private String TaskCycle;

    /**
    * 工作流名称
    */
    @SerializedName("WorkflowName")
    @Expose
    private String WorkflowName;

    /**
    * 工作流id
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * 任务责任人名称
    */
    @SerializedName("TaskInChargeName")
    @Expose
    private String TaskInChargeName;

    /**
    * 任务责任人id
    */
    @SerializedName("TaskInChargeUin")
    @Expose
    private String TaskInChargeUin;

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
     * Get 任务名称 
     * @return TaskName 任务名称
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set 任务名称
     * @param TaskName 任务名称
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get 任务id 
     * @return TaskId 任务id
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务id
     * @param TaskId 任务id
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 任务调度周期 
     * @return TaskCycle 任务调度周期
     */
    public String getTaskCycle() {
        return this.TaskCycle;
    }

    /**
     * Set 任务调度周期
     * @param TaskCycle 任务调度周期
     */
    public void setTaskCycle(String TaskCycle) {
        this.TaskCycle = TaskCycle;
    }

    /**
     * Get 工作流名称 
     * @return WorkflowName 工作流名称
     */
    public String getWorkflowName() {
        return this.WorkflowName;
    }

    /**
     * Set 工作流名称
     * @param WorkflowName 工作流名称
     */
    public void setWorkflowName(String WorkflowName) {
        this.WorkflowName = WorkflowName;
    }

    /**
     * Get 工作流id 
     * @return WorkflowId 工作流id
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set 工作流id
     * @param WorkflowId 工作流id
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
    }

    /**
     * Get 任务责任人名称 
     * @return TaskInChargeName 任务责任人名称
     */
    public String getTaskInChargeName() {
        return this.TaskInChargeName;
    }

    /**
     * Set 任务责任人名称
     * @param TaskInChargeName 任务责任人名称
     */
    public void setTaskInChargeName(String TaskInChargeName) {
        this.TaskInChargeName = TaskInChargeName;
    }

    /**
     * Get 任务责任人id 
     * @return TaskInChargeUin 任务责任人id
     */
    public String getTaskInChargeUin() {
        return this.TaskInChargeUin;
    }

    /**
     * Set 任务责任人id
     * @param TaskInChargeUin 任务责任人id
     */
    public void setTaskInChargeUin(String TaskInChargeUin) {
        this.TaskInChargeUin = TaskInChargeUin;
    }

    public BaselineTaskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BaselineTaskInfo(BaselineTaskInfo source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TaskCycle != null) {
            this.TaskCycle = new String(source.TaskCycle);
        }
        if (source.WorkflowName != null) {
            this.WorkflowName = new String(source.WorkflowName);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.TaskInChargeName != null) {
            this.TaskInChargeName = new String(source.TaskInChargeName);
        }
        if (source.TaskInChargeUin != null) {
            this.TaskInChargeUin = new String(source.TaskInChargeUin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskCycle", this.TaskCycle);
        this.setParamSimple(map, prefix + "WorkflowName", this.WorkflowName);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "TaskInChargeName", this.TaskInChargeName);
        this.setParamSimple(map, prefix + "TaskInChargeUin", this.TaskInChargeUin);

    }
}

