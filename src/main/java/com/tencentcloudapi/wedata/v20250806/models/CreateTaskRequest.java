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

public class CreateTaskRequest extends AbstractModel {

    /**
    * <p>项目ID</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * <p>任务基本属性</p>
    */
    @SerializedName("TaskBaseAttribute")
    @Expose
    private CreateTaskBaseAttribute TaskBaseAttribute;

    /**
    * <p>任务配置</p>
    */
    @SerializedName("TaskConfiguration")
    @Expose
    private CreateTaskConfiguration TaskConfiguration;

    /**
    * <p>任务调度配置</p>
    */
    @SerializedName("TaskSchedulerConfiguration")
    @Expose
    private CreateTaskSchedulerConfiguration TaskSchedulerConfiguration;

    /**
     * Get <p>项目ID</p> 
     * @return ProjectId <p>项目ID</p>
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>项目ID</p>
     * @param ProjectId <p>项目ID</p>
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>任务基本属性</p> 
     * @return TaskBaseAttribute <p>任务基本属性</p>
     */
    public CreateTaskBaseAttribute getTaskBaseAttribute() {
        return this.TaskBaseAttribute;
    }

    /**
     * Set <p>任务基本属性</p>
     * @param TaskBaseAttribute <p>任务基本属性</p>
     */
    public void setTaskBaseAttribute(CreateTaskBaseAttribute TaskBaseAttribute) {
        this.TaskBaseAttribute = TaskBaseAttribute;
    }

    /**
     * Get <p>任务配置</p> 
     * @return TaskConfiguration <p>任务配置</p>
     */
    public CreateTaskConfiguration getTaskConfiguration() {
        return this.TaskConfiguration;
    }

    /**
     * Set <p>任务配置</p>
     * @param TaskConfiguration <p>任务配置</p>
     */
    public void setTaskConfiguration(CreateTaskConfiguration TaskConfiguration) {
        this.TaskConfiguration = TaskConfiguration;
    }

    /**
     * Get <p>任务调度配置</p> 
     * @return TaskSchedulerConfiguration <p>任务调度配置</p>
     */
    public CreateTaskSchedulerConfiguration getTaskSchedulerConfiguration() {
        return this.TaskSchedulerConfiguration;
    }

    /**
     * Set <p>任务调度配置</p>
     * @param TaskSchedulerConfiguration <p>任务调度配置</p>
     */
    public void setTaskSchedulerConfiguration(CreateTaskSchedulerConfiguration TaskSchedulerConfiguration) {
        this.TaskSchedulerConfiguration = TaskSchedulerConfiguration;
    }

    public CreateTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateTaskRequest(CreateTaskRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.TaskBaseAttribute != null) {
            this.TaskBaseAttribute = new CreateTaskBaseAttribute(source.TaskBaseAttribute);
        }
        if (source.TaskConfiguration != null) {
            this.TaskConfiguration = new CreateTaskConfiguration(source.TaskConfiguration);
        }
        if (source.TaskSchedulerConfiguration != null) {
            this.TaskSchedulerConfiguration = new CreateTaskSchedulerConfiguration(source.TaskSchedulerConfiguration);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamObj(map, prefix + "TaskBaseAttribute.", this.TaskBaseAttribute);
        this.setParamObj(map, prefix + "TaskConfiguration.", this.TaskConfiguration);
        this.setParamObj(map, prefix + "TaskSchedulerConfiguration.", this.TaskSchedulerConfiguration);

    }
}

