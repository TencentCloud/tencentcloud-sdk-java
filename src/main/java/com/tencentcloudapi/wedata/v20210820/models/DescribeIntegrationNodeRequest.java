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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeIntegrationNodeRequest extends AbstractModel {

    /**
    * 节点id
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 任务类型，201为实时任务，202为离线任务
    */
    @SerializedName("TaskType")
    @Expose
    private Long TaskType;

    /**
     * Get 节点id 
     * @return Id 节点id
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 节点id
     * @param Id 节点id
     */
    public void setId(String Id) {
        this.Id = Id;
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
     * Get 任务类型，201为实时任务，202为离线任务 
     * @return TaskType 任务类型，201为实时任务，202为离线任务
     */
    public Long getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 任务类型，201为实时任务，202为离线任务
     * @param TaskType 任务类型，201为实时任务，202为离线任务
     */
    public void setTaskType(Long TaskType) {
        this.TaskType = TaskType;
    }

    public DescribeIntegrationNodeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeIntegrationNodeRequest(DescribeIntegrationNodeRequest source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.TaskType != null) {
            this.TaskType = new Long(source.TaskType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);

    }
}

