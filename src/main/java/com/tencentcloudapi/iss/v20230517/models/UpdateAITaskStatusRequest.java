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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateAITaskStatusRequest extends AbstractModel{

    /**
    * AI 任务 ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * AI 任务状态。"on"代表开启了 AI 分析任务，"off"代表停止AI分析任务
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get AI 任务 ID 
     * @return TaskId AI 任务 ID
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set AI 任务 ID
     * @param TaskId AI 任务 ID
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get AI 任务状态。"on"代表开启了 AI 分析任务，"off"代表停止AI分析任务 
     * @return Status AI 任务状态。"on"代表开启了 AI 分析任务，"off"代表停止AI分析任务
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set AI 任务状态。"on"代表开启了 AI 分析任务，"off"代表停止AI分析任务
     * @param Status AI 任务状态。"on"代表开启了 AI 分析任务，"off"代表停止AI分析任务
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public UpdateAITaskStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateAITaskStatusRequest(UpdateAITaskStatusRequest source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

