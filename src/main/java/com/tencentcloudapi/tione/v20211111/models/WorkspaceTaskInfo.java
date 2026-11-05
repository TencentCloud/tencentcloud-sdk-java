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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WorkspaceTaskInfo extends AbstractModel {

    /**
    * <p>任务ID</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>任务名称</p>
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * <p>地域</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>任务类型</p>
    */
    @SerializedName("ResourceTaskType")
    @Expose
    private String ResourceTaskType;

    /**
    * <p>任务所属资源组</p>
    */
    @SerializedName("ResourceGroupId")
    @Expose
    private String ResourceGroupId;

    /**
     * Get <p>任务ID</p> 
     * @return TaskId <p>任务ID</p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>任务ID</p>
     * @param TaskId <p>任务ID</p>
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>任务名称</p> 
     * @return TaskName <p>任务名称</p>
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set <p>任务名称</p>
     * @param TaskName <p>任务名称</p>
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get <p>地域</p> 
     * @return Region <p>地域</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>地域</p>
     * @param Region <p>地域</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>任务类型</p> 
     * @return ResourceTaskType <p>任务类型</p>
     */
    public String getResourceTaskType() {
        return this.ResourceTaskType;
    }

    /**
     * Set <p>任务类型</p>
     * @param ResourceTaskType <p>任务类型</p>
     */
    public void setResourceTaskType(String ResourceTaskType) {
        this.ResourceTaskType = ResourceTaskType;
    }

    /**
     * Get <p>任务所属资源组</p> 
     * @return ResourceGroupId <p>任务所属资源组</p>
     */
    public String getResourceGroupId() {
        return this.ResourceGroupId;
    }

    /**
     * Set <p>任务所属资源组</p>
     * @param ResourceGroupId <p>任务所属资源组</p>
     */
    public void setResourceGroupId(String ResourceGroupId) {
        this.ResourceGroupId = ResourceGroupId;
    }

    public WorkspaceTaskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WorkspaceTaskInfo(WorkspaceTaskInfo source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.ResourceTaskType != null) {
            this.ResourceTaskType = new String(source.ResourceTaskType);
        }
        if (source.ResourceGroupId != null) {
            this.ResourceGroupId = new String(source.ResourceGroupId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "ResourceTaskType", this.ResourceTaskType);
        this.setParamSimple(map, prefix + "ResourceGroupId", this.ResourceGroupId);

    }
}

