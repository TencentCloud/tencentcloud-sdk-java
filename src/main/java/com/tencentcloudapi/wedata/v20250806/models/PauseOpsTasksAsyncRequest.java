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

public class PauseOpsTasksAsyncRequest extends AbstractModel {

    /**
    * 所属项目Id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 任务Id列表
    */
    @SerializedName("TaskIds")
    @Expose
    private String [] TaskIds;

    /**
    * 是否需要终止已生成实例
    */
    @SerializedName("KillInstance")
    @Expose
    private Boolean KillInstance;

    /**
     * Get 所属项目Id 
     * @return ProjectId 所属项目Id
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 所属项目Id
     * @param ProjectId 所属项目Id
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 任务Id列表 
     * @return TaskIds 任务Id列表
     */
    public String [] getTaskIds() {
        return this.TaskIds;
    }

    /**
     * Set 任务Id列表
     * @param TaskIds 任务Id列表
     */
    public void setTaskIds(String [] TaskIds) {
        this.TaskIds = TaskIds;
    }

    /**
     * Get 是否需要终止已生成实例 
     * @return KillInstance 是否需要终止已生成实例
     */
    public Boolean getKillInstance() {
        return this.KillInstance;
    }

    /**
     * Set 是否需要终止已生成实例
     * @param KillInstance 是否需要终止已生成实例
     */
    public void setKillInstance(Boolean KillInstance) {
        this.KillInstance = KillInstance;
    }

    public PauseOpsTasksAsyncRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PauseOpsTasksAsyncRequest(PauseOpsTasksAsyncRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.TaskIds != null) {
            this.TaskIds = new String[source.TaskIds.length];
            for (int i = 0; i < source.TaskIds.length; i++) {
                this.TaskIds[i] = new String(source.TaskIds[i]);
            }
        }
        if (source.KillInstance != null) {
            this.KillInstance = new Boolean(source.KillInstance);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArraySimple(map, prefix + "TaskIds.", this.TaskIds);
        this.setParamSimple(map, prefix + "KillInstance", this.KillInstance);

    }
}

