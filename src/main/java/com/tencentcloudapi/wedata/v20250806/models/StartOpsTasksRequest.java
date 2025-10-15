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

public class StartOpsTasksRequest extends AbstractModel {

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
    * 启动时是否补录上次暂停到当前的中间实例，默认false即不补录
    */
    @SerializedName("EnableDataBackfill")
    @Expose
    private Boolean EnableDataBackfill;

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
     * Get 启动时是否补录上次暂停到当前的中间实例，默认false即不补录 
     * @return EnableDataBackfill 启动时是否补录上次暂停到当前的中间实例，默认false即不补录
     */
    public Boolean getEnableDataBackfill() {
        return this.EnableDataBackfill;
    }

    /**
     * Set 启动时是否补录上次暂停到当前的中间实例，默认false即不补录
     * @param EnableDataBackfill 启动时是否补录上次暂停到当前的中间实例，默认false即不补录
     */
    public void setEnableDataBackfill(Boolean EnableDataBackfill) {
        this.EnableDataBackfill = EnableDataBackfill;
    }

    public StartOpsTasksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StartOpsTasksRequest(StartOpsTasksRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.TaskIds != null) {
            this.TaskIds = new String[source.TaskIds.length];
            for (int i = 0; i < source.TaskIds.length; i++) {
                this.TaskIds[i] = new String(source.TaskIds[i]);
            }
        }
        if (source.EnableDataBackfill != null) {
            this.EnableDataBackfill = new Boolean(source.EnableDataBackfill);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArraySimple(map, prefix + "TaskIds.", this.TaskIds);
        this.setParamSimple(map, prefix + "EnableDataBackfill", this.EnableDataBackfill);

    }
}

