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

public class DryRunDIOfflineTaskRequest extends AbstractModel{

    /**
    * 任务Id
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 项目Id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 资源组Id
    */
    @SerializedName("ResourceGroup")
    @Expose
    private String ResourceGroup;

    /**
    * 默认 27
    */
    @SerializedName("TaskTypeId")
    @Expose
    private Long TaskTypeId;

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
     * Get 资源组Id 
     * @return ResourceGroup 资源组Id
     */
    public String getResourceGroup() {
        return this.ResourceGroup;
    }

    /**
     * Set 资源组Id
     * @param ResourceGroup 资源组Id
     */
    public void setResourceGroup(String ResourceGroup) {
        this.ResourceGroup = ResourceGroup;
    }

    /**
     * Get 默认 27 
     * @return TaskTypeId 默认 27
     */
    public Long getTaskTypeId() {
        return this.TaskTypeId;
    }

    /**
     * Set 默认 27
     * @param TaskTypeId 默认 27
     */
    public void setTaskTypeId(Long TaskTypeId) {
        this.TaskTypeId = TaskTypeId;
    }

    public DryRunDIOfflineTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DryRunDIOfflineTaskRequest(DryRunDIOfflineTaskRequest source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.ResourceGroup != null) {
            this.ResourceGroup = new String(source.ResourceGroup);
        }
        if (source.TaskTypeId != null) {
            this.TaskTypeId = new Long(source.TaskTypeId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ResourceGroup", this.ResourceGroup);
        this.setParamSimple(map, prefix + "TaskTypeId", this.TaskTypeId);

    }
}

