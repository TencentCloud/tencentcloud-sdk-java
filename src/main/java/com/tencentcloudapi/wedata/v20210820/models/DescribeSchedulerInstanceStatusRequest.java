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

public class DescribeSchedulerInstanceStatusRequest extends AbstractModel{

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 任务类型ID
    */
    @SerializedName("TaskTypeId")
    @Expose
    private String TaskTypeId;

    /**
    * 执行资源组ID
    */
    @SerializedName("ExecutionGroupId")
    @Expose
    private String ExecutionGroupId;

    /**
    * 执行资源组名字
    */
    @SerializedName("ExecutionGroupName")
    @Expose
    private String ExecutionGroupName;

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
     * Get 任务类型ID 
     * @return TaskTypeId 任务类型ID
     */
    public String getTaskTypeId() {
        return this.TaskTypeId;
    }

    /**
     * Set 任务类型ID
     * @param TaskTypeId 任务类型ID
     */
    public void setTaskTypeId(String TaskTypeId) {
        this.TaskTypeId = TaskTypeId;
    }

    /**
     * Get 执行资源组ID 
     * @return ExecutionGroupId 执行资源组ID
     */
    public String getExecutionGroupId() {
        return this.ExecutionGroupId;
    }

    /**
     * Set 执行资源组ID
     * @param ExecutionGroupId 执行资源组ID
     */
    public void setExecutionGroupId(String ExecutionGroupId) {
        this.ExecutionGroupId = ExecutionGroupId;
    }

    /**
     * Get 执行资源组名字 
     * @return ExecutionGroupName 执行资源组名字
     */
    public String getExecutionGroupName() {
        return this.ExecutionGroupName;
    }

    /**
     * Set 执行资源组名字
     * @param ExecutionGroupName 执行资源组名字
     */
    public void setExecutionGroupName(String ExecutionGroupName) {
        this.ExecutionGroupName = ExecutionGroupName;
    }

    public DescribeSchedulerInstanceStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSchedulerInstanceStatusRequest(DescribeSchedulerInstanceStatusRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.TaskTypeId != null) {
            this.TaskTypeId = new String(source.TaskTypeId);
        }
        if (source.ExecutionGroupId != null) {
            this.ExecutionGroupId = new String(source.ExecutionGroupId);
        }
        if (source.ExecutionGroupName != null) {
            this.ExecutionGroupName = new String(source.ExecutionGroupName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "TaskTypeId", this.TaskTypeId);
        this.setParamSimple(map, prefix + "ExecutionGroupId", this.ExecutionGroupId);
        this.setParamSimple(map, prefix + "ExecutionGroupName", this.ExecutionGroupName);

    }
}

