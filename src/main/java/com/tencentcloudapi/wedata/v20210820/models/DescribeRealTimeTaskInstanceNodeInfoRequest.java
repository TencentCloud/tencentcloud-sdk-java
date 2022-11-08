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

public class DescribeRealTimeTaskInstanceNodeInfoRequest extends AbstractModel{

    /**
    * 实时任务id
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 工程id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
     * Get 实时任务id 
     * @return TaskId 实时任务id
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 实时任务id
     * @param TaskId 实时任务id
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 工程id 
     * @return ProjectId 工程id
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 工程id
     * @param ProjectId 工程id
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    public DescribeRealTimeTaskInstanceNodeInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRealTimeTaskInstanceNodeInfoRequest(DescribeRealTimeTaskInstanceNodeInfoRequest source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);

    }
}

