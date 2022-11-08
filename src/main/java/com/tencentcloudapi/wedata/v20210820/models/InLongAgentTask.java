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

public class InLongAgentTask extends AbstractModel{

    /**
    * 集成任务ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 集成任务名称
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * 集成任务状态
    */
    @SerializedName("TaskStatus")
    @Expose
    private String TaskStatus;

    /**
     * Get 集成任务ID 
     * @return TaskId 集成任务ID
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 集成任务ID
     * @param TaskId 集成任务ID
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 集成任务名称 
     * @return TaskName 集成任务名称
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set 集成任务名称
     * @param TaskName 集成任务名称
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get 集成任务状态 
     * @return TaskStatus 集成任务状态
     */
    public String getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * Set 集成任务状态
     * @param TaskStatus 集成任务状态
     */
    public void setTaskStatus(String TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    public InLongAgentTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InLongAgentTask(InLongAgentTask source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.TaskStatus != null) {
            this.TaskStatus = new String(source.TaskStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "TaskStatus", this.TaskStatus);

    }
}

