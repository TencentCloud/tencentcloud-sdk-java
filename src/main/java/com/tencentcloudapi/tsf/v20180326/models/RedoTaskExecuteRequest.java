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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RedoTaskExecuteRequest extends AbstractModel {

    /**
    * 任务批次ID。在任务管理页面第一列点击任务ID进入任务详情，进入执行记录列表页，第一列内容即为任务批次ID。
    */
    @SerializedName("BatchId")
    @Expose
    private String BatchId;

    /**
    * 任务执行ID。在任务管理页面第一列点击任务ID进入任务详情，进入执行记录页，点击批次ID进入执行详情列表页，第一列即为任务执行ID。
    */
    @SerializedName("ExecuteId")
    @Expose
    private String ExecuteId;

    /**
    * 任务ID。在任务管理列表页面可以查看任务ID。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
     * Get 任务批次ID。在任务管理页面第一列点击任务ID进入任务详情，进入执行记录列表页，第一列内容即为任务批次ID。 
     * @return BatchId 任务批次ID。在任务管理页面第一列点击任务ID进入任务详情，进入执行记录列表页，第一列内容即为任务批次ID。
     */
    public String getBatchId() {
        return this.BatchId;
    }

    /**
     * Set 任务批次ID。在任务管理页面第一列点击任务ID进入任务详情，进入执行记录列表页，第一列内容即为任务批次ID。
     * @param BatchId 任务批次ID。在任务管理页面第一列点击任务ID进入任务详情，进入执行记录列表页，第一列内容即为任务批次ID。
     */
    public void setBatchId(String BatchId) {
        this.BatchId = BatchId;
    }

    /**
     * Get 任务执行ID。在任务管理页面第一列点击任务ID进入任务详情，进入执行记录页，点击批次ID进入执行详情列表页，第一列即为任务执行ID。 
     * @return ExecuteId 任务执行ID。在任务管理页面第一列点击任务ID进入任务详情，进入执行记录页，点击批次ID进入执行详情列表页，第一列即为任务执行ID。
     */
    public String getExecuteId() {
        return this.ExecuteId;
    }

    /**
     * Set 任务执行ID。在任务管理页面第一列点击任务ID进入任务详情，进入执行记录页，点击批次ID进入执行详情列表页，第一列即为任务执行ID。
     * @param ExecuteId 任务执行ID。在任务管理页面第一列点击任务ID进入任务详情，进入执行记录页，点击批次ID进入执行详情列表页，第一列即为任务执行ID。
     */
    public void setExecuteId(String ExecuteId) {
        this.ExecuteId = ExecuteId;
    }

    /**
     * Get 任务ID。在任务管理列表页面可以查看任务ID。 
     * @return TaskId 任务ID。在任务管理列表页面可以查看任务ID。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务ID。在任务管理列表页面可以查看任务ID。
     * @param TaskId 任务ID。在任务管理列表页面可以查看任务ID。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    public RedoTaskExecuteRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RedoTaskExecuteRequest(RedoTaskExecuteRequest source) {
        if (source.BatchId != null) {
            this.BatchId = new String(source.BatchId);
        }
        if (source.ExecuteId != null) {
            this.ExecuteId = new String(source.ExecuteId);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BatchId", this.BatchId);
        this.setParamSimple(map, prefix + "ExecuteId", this.ExecuteId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);

    }
}

