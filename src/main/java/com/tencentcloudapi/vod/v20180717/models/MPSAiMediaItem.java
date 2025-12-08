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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MPSAiMediaItem extends AbstractModel {

    /**
    * MPS智能处理任务类型
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * MPS 智能媒资任务输出
    */
    @SerializedName("AiMediaTasks")
    @Expose
    private MPSAiMediaTask [] AiMediaTasks;

    /**
     * Get MPS智能处理任务类型 
     * @return TaskType MPS智能处理任务类型
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set MPS智能处理任务类型
     * @param TaskType MPS智能处理任务类型
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get MPS 智能媒资任务输出 
     * @return AiMediaTasks MPS 智能媒资任务输出
     */
    public MPSAiMediaTask [] getAiMediaTasks() {
        return this.AiMediaTasks;
    }

    /**
     * Set MPS 智能媒资任务输出
     * @param AiMediaTasks MPS 智能媒资任务输出
     */
    public void setAiMediaTasks(MPSAiMediaTask [] AiMediaTasks) {
        this.AiMediaTasks = AiMediaTasks;
    }

    public MPSAiMediaItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MPSAiMediaItem(MPSAiMediaItem source) {
        if (source.TaskType != null) {
            this.TaskType = new String(source.TaskType);
        }
        if (source.AiMediaTasks != null) {
            this.AiMediaTasks = new MPSAiMediaTask[source.AiMediaTasks.length];
            for (int i = 0; i < source.AiMediaTasks.length; i++) {
                this.AiMediaTasks[i] = new MPSAiMediaTask(source.AiMediaTasks[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamArrayObj(map, prefix + "AiMediaTasks.", this.AiMediaTasks);

    }
}

