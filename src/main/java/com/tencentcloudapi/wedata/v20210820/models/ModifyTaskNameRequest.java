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

public class ModifyTaskNameRequest extends AbstractModel{

    /**
    * 名称
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * id
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 项目/工作空间id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 备注
    */
    @SerializedName("Notes")
    @Expose
    private String Notes;

    /**
     * Get 名称 
     * @return TaskName 名称
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set 名称
     * @param TaskName 名称
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get id 
     * @return TaskId id
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set id
     * @param TaskId id
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 项目/工作空间id 
     * @return ProjectId 项目/工作空间id
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目/工作空间id
     * @param ProjectId 项目/工作空间id
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 备注 
     * @return Notes 备注
     */
    public String getNotes() {
        return this.Notes;
    }

    /**
     * Set 备注
     * @param Notes 备注
     */
    public void setNotes(String Notes) {
        this.Notes = Notes;
    }

    public ModifyTaskNameRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyTaskNameRequest(ModifyTaskNameRequest source) {
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.Notes != null) {
            this.Notes = new String(source.Notes);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Notes", this.Notes);

    }
}

