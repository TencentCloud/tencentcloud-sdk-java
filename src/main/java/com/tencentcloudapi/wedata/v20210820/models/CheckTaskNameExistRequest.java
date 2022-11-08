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

public class CheckTaskNameExistRequest extends AbstractModel{

    /**
    * 项目id/工作空间id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 任务类型（跟调度传参保持一致27）
    */
    @SerializedName("TypeId")
    @Expose
    private Long TypeId;

    /**
    * 任务名
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
     * Get 项目id/工作空间id 
     * @return ProjectId 项目id/工作空间id
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目id/工作空间id
     * @param ProjectId 项目id/工作空间id
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 任务类型（跟调度传参保持一致27） 
     * @return TypeId 任务类型（跟调度传参保持一致27）
     */
    public Long getTypeId() {
        return this.TypeId;
    }

    /**
     * Set 任务类型（跟调度传参保持一致27）
     * @param TypeId 任务类型（跟调度传参保持一致27）
     */
    public void setTypeId(Long TypeId) {
        this.TypeId = TypeId;
    }

    /**
     * Get 任务名 
     * @return TaskName 任务名
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set 任务名
     * @param TaskName 任务名
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    public CheckTaskNameExistRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckTaskNameExistRequest(CheckTaskNameExistRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.TypeId != null) {
            this.TypeId = new Long(source.TypeId);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "TypeId", this.TypeId);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);

    }
}

