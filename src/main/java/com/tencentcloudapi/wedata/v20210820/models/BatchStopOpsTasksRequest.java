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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BatchStopOpsTasksRequest extends AbstractModel {

    /**
    * 批量停止任务的TaskId
    */
    @SerializedName("TaskIdList")
    @Expose
    private String [] TaskIdList;

    /**
    * 项目Id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 是否终止已生成的实例
    */
    @SerializedName("KillInstance")
    @Expose
    private Boolean KillInstance;

    /**
     * Get 批量停止任务的TaskId 
     * @return TaskIdList 批量停止任务的TaskId
     */
    public String [] getTaskIdList() {
        return this.TaskIdList;
    }

    /**
     * Set 批量停止任务的TaskId
     * @param TaskIdList 批量停止任务的TaskId
     */
    public void setTaskIdList(String [] TaskIdList) {
        this.TaskIdList = TaskIdList;
    }

    /**
     * Get 项目Id 
     * @return ProjectId 项目Id
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目Id
     * @param ProjectId 项目Id
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 是否终止已生成的实例 
     * @return KillInstance 是否终止已生成的实例
     */
    public Boolean getKillInstance() {
        return this.KillInstance;
    }

    /**
     * Set 是否终止已生成的实例
     * @param KillInstance 是否终止已生成的实例
     */
    public void setKillInstance(Boolean KillInstance) {
        this.KillInstance = KillInstance;
    }

    public BatchStopOpsTasksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchStopOpsTasksRequest(BatchStopOpsTasksRequest source) {
        if (source.TaskIdList != null) {
            this.TaskIdList = new String[source.TaskIdList.length];
            for (int i = 0; i < source.TaskIdList.length; i++) {
                this.TaskIdList[i] = new String(source.TaskIdList[i]);
            }
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.KillInstance != null) {
            this.KillInstance = new Boolean(source.KillInstance);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "TaskIdList.", this.TaskIdList);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "KillInstance", this.KillInstance);

    }
}

