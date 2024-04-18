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

public class BatchSuspendIntegrationTasksRequest extends AbstractModel {

    /**
    * 任务id
    */
    @SerializedName("TaskIds")
    @Expose
    private String [] TaskIds;

    /**
    * 任务类型，201为实时任务，202为离线任务
    */
    @SerializedName("TaskType")
    @Expose
    private Long TaskType;

    /**
    * 项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 事件类型(START, STOP, SUSPEND, SUSPEND_WITHOUT_SP,RESUME, COMMIT, TIMESTAMP)	
    */
    @SerializedName("Event")
    @Expose
    private String Event;

    /**
    * 本次批量操作涉及任务，用于审计
    */
    @SerializedName("TaskNames")
    @Expose
    private String [] TaskNames;

    /**
     * Get 任务id 
     * @return TaskIds 任务id
     */
    public String [] getTaskIds() {
        return this.TaskIds;
    }

    /**
     * Set 任务id
     * @param TaskIds 任务id
     */
    public void setTaskIds(String [] TaskIds) {
        this.TaskIds = TaskIds;
    }

    /**
     * Get 任务类型，201为实时任务，202为离线任务 
     * @return TaskType 任务类型，201为实时任务，202为离线任务
     */
    public Long getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 任务类型，201为实时任务，202为离线任务
     * @param TaskType 任务类型，201为实时任务，202为离线任务
     */
    public void setTaskType(Long TaskType) {
        this.TaskType = TaskType;
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
     * Get 事件类型(START, STOP, SUSPEND, SUSPEND_WITHOUT_SP,RESUME, COMMIT, TIMESTAMP)	 
     * @return Event 事件类型(START, STOP, SUSPEND, SUSPEND_WITHOUT_SP,RESUME, COMMIT, TIMESTAMP)	
     */
    public String getEvent() {
        return this.Event;
    }

    /**
     * Set 事件类型(START, STOP, SUSPEND, SUSPEND_WITHOUT_SP,RESUME, COMMIT, TIMESTAMP)	
     * @param Event 事件类型(START, STOP, SUSPEND, SUSPEND_WITHOUT_SP,RESUME, COMMIT, TIMESTAMP)	
     */
    public void setEvent(String Event) {
        this.Event = Event;
    }

    /**
     * Get 本次批量操作涉及任务，用于审计 
     * @return TaskNames 本次批量操作涉及任务，用于审计
     */
    public String [] getTaskNames() {
        return this.TaskNames;
    }

    /**
     * Set 本次批量操作涉及任务，用于审计
     * @param TaskNames 本次批量操作涉及任务，用于审计
     */
    public void setTaskNames(String [] TaskNames) {
        this.TaskNames = TaskNames;
    }

    public BatchSuspendIntegrationTasksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchSuspendIntegrationTasksRequest(BatchSuspendIntegrationTasksRequest source) {
        if (source.TaskIds != null) {
            this.TaskIds = new String[source.TaskIds.length];
            for (int i = 0; i < source.TaskIds.length; i++) {
                this.TaskIds[i] = new String(source.TaskIds[i]);
            }
        }
        if (source.TaskType != null) {
            this.TaskType = new Long(source.TaskType);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.Event != null) {
            this.Event = new String(source.Event);
        }
        if (source.TaskNames != null) {
            this.TaskNames = new String[source.TaskNames.length];
            for (int i = 0; i < source.TaskNames.length; i++) {
                this.TaskNames[i] = new String(source.TaskNames[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "TaskIds.", this.TaskIds);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Event", this.Event);
        this.setParamArraySimple(map, prefix + "TaskNames.", this.TaskNames);

    }
}

