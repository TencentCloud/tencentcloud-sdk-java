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

public class DeleteTaskAlarmRegularRequest extends AbstractModel{

    /**
    * 主键ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 任务ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 任务类型(201表示实时任务，202表示离线任务)
    */
    @SerializedName("TaskType")
    @Expose
    private Long TaskType;

    /**
     * Get 主键ID 
     * @return Id 主键ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 主键ID
     * @param Id 主键ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

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
     * Get 任务ID 
     * @return TaskId 任务ID
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务ID
     * @param TaskId 任务ID
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 任务类型(201表示实时任务，202表示离线任务) 
     * @return TaskType 任务类型(201表示实时任务，202表示离线任务)
     */
    public Long getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 任务类型(201表示实时任务，202表示离线任务)
     * @param TaskType 任务类型(201表示实时任务，202表示离线任务)
     */
    public void setTaskType(Long TaskType) {
        this.TaskType = TaskType;
    }

    public DeleteTaskAlarmRegularRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteTaskAlarmRegularRequest(DeleteTaskAlarmRegularRequest source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
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
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);

    }
}

