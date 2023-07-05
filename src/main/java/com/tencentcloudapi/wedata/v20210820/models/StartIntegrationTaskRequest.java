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

public class StartIntegrationTaskRequest extends AbstractModel{

    /**
    * 任务id
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 事件类型(START, STOP, SUSPEND, RESUME, COMMIT, TIMESTAMP)
    */
    @SerializedName("Event")
    @Expose
    private String Event;

    /**
    * 额外参数
    */
    @SerializedName("ExtConfig")
    @Expose
    private RecordField [] ExtConfig;

    /**
     * Get 任务id 
     * @return TaskId 任务id
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务id
     * @param TaskId 任务id
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 项目id 
     * @return ProjectId 项目id
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目id
     * @param ProjectId 项目id
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 事件类型(START, STOP, SUSPEND, RESUME, COMMIT, TIMESTAMP) 
     * @return Event 事件类型(START, STOP, SUSPEND, RESUME, COMMIT, TIMESTAMP)
     */
    public String getEvent() {
        return this.Event;
    }

    /**
     * Set 事件类型(START, STOP, SUSPEND, RESUME, COMMIT, TIMESTAMP)
     * @param Event 事件类型(START, STOP, SUSPEND, RESUME, COMMIT, TIMESTAMP)
     */
    public void setEvent(String Event) {
        this.Event = Event;
    }

    /**
     * Get 额外参数 
     * @return ExtConfig 额外参数
     */
    public RecordField [] getExtConfig() {
        return this.ExtConfig;
    }

    /**
     * Set 额外参数
     * @param ExtConfig 额外参数
     */
    public void setExtConfig(RecordField [] ExtConfig) {
        this.ExtConfig = ExtConfig;
    }

    public StartIntegrationTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StartIntegrationTaskRequest(StartIntegrationTaskRequest source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.Event != null) {
            this.Event = new String(source.Event);
        }
        if (source.ExtConfig != null) {
            this.ExtConfig = new RecordField[source.ExtConfig.length];
            for (int i = 0; i < source.ExtConfig.length; i++) {
                this.ExtConfig[i] = new RecordField(source.ExtConfig[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Event", this.Event);
        this.setParamArrayObj(map, prefix + "ExtConfig.", this.ExtConfig);

    }
}

