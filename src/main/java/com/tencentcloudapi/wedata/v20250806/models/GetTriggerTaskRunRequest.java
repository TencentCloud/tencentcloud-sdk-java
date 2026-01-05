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

public class GetTriggerTaskRunRequest extends AbstractModel {

    /**
    * 工作空间 ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 任务运行 ID
    */
    @SerializedName("TaskExecutionId")
    @Expose
    private String TaskExecutionId;

    /**
     * Get 工作空间 ID 
     * @return ProjectId 工作空间 ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 工作空间 ID
     * @param ProjectId 工作空间 ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 任务运行 ID 
     * @return TaskExecutionId 任务运行 ID
     */
    public String getTaskExecutionId() {
        return this.TaskExecutionId;
    }

    /**
     * Set 任务运行 ID
     * @param TaskExecutionId 任务运行 ID
     */
    public void setTaskExecutionId(String TaskExecutionId) {
        this.TaskExecutionId = TaskExecutionId;
    }

    public GetTriggerTaskRunRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetTriggerTaskRunRequest(GetTriggerTaskRunRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.TaskExecutionId != null) {
            this.TaskExecutionId = new String(source.TaskExecutionId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "TaskExecutionId", this.TaskExecutionId);

    }
}

