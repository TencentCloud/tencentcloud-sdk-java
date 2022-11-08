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

public class CreateTaskAlarmRegularRequest extends AbstractModel{

    /**
    * 告警配置信息
    */
    @SerializedName("TaskAlarmInfo")
    @Expose
    private TaskAlarmInfo TaskAlarmInfo;

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
     * Get 告警配置信息 
     * @return TaskAlarmInfo 告警配置信息
     */
    public TaskAlarmInfo getTaskAlarmInfo() {
        return this.TaskAlarmInfo;
    }

    /**
     * Set 告警配置信息
     * @param TaskAlarmInfo 告警配置信息
     */
    public void setTaskAlarmInfo(TaskAlarmInfo TaskAlarmInfo) {
        this.TaskAlarmInfo = TaskAlarmInfo;
    }

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

    public CreateTaskAlarmRegularRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateTaskAlarmRegularRequest(CreateTaskAlarmRegularRequest source) {
        if (source.TaskAlarmInfo != null) {
            this.TaskAlarmInfo = new TaskAlarmInfo(source.TaskAlarmInfo);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "TaskAlarmInfo.", this.TaskAlarmInfo);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);

    }
}

