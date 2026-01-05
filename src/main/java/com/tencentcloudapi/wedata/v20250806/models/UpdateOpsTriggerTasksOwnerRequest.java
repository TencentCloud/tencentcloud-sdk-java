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

public class UpdateOpsTriggerTasksOwnerRequest extends AbstractModel {

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 负责人UIN
    */
    @SerializedName("OwnerIds")
    @Expose
    private String [] OwnerIds;

    /**
    * 将要修改的任务ID集合
    */
    @SerializedName("TaskIds")
    @Expose
    private String [] TaskIds;

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
     * Get 负责人UIN 
     * @return OwnerIds 负责人UIN
     */
    public String [] getOwnerIds() {
        return this.OwnerIds;
    }

    /**
     * Set 负责人UIN
     * @param OwnerIds 负责人UIN
     */
    public void setOwnerIds(String [] OwnerIds) {
        this.OwnerIds = OwnerIds;
    }

    /**
     * Get 将要修改的任务ID集合 
     * @return TaskIds 将要修改的任务ID集合
     */
    public String [] getTaskIds() {
        return this.TaskIds;
    }

    /**
     * Set 将要修改的任务ID集合
     * @param TaskIds 将要修改的任务ID集合
     */
    public void setTaskIds(String [] TaskIds) {
        this.TaskIds = TaskIds;
    }

    public UpdateOpsTriggerTasksOwnerRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateOpsTriggerTasksOwnerRequest(UpdateOpsTriggerTasksOwnerRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.OwnerIds != null) {
            this.OwnerIds = new String[source.OwnerIds.length];
            for (int i = 0; i < source.OwnerIds.length; i++) {
                this.OwnerIds[i] = new String(source.OwnerIds[i]);
            }
        }
        if (source.TaskIds != null) {
            this.TaskIds = new String[source.TaskIds.length];
            for (int i = 0; i < source.TaskIds.length; i++) {
                this.TaskIds[i] = new String(source.TaskIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArraySimple(map, prefix + "OwnerIds.", this.OwnerIds);
        this.setParamArraySimple(map, prefix + "TaskIds.", this.TaskIds);

    }
}

