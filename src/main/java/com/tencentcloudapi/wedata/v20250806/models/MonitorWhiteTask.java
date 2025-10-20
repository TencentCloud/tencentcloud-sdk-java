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

public class MonitorWhiteTask extends AbstractModel {

    /**
    * 配置白名单的对应的工作流/项目的id
    */
    @SerializedName("MonitorObjectId")
    @Expose
    private String MonitorObjectId;

    /**
    * 白名单任务列表
    */
    @SerializedName("TaskIds")
    @Expose
    private String [] TaskIds;

    /**
     * Get 配置白名单的对应的工作流/项目的id 
     * @return MonitorObjectId 配置白名单的对应的工作流/项目的id
     */
    public String getMonitorObjectId() {
        return this.MonitorObjectId;
    }

    /**
     * Set 配置白名单的对应的工作流/项目的id
     * @param MonitorObjectId 配置白名单的对应的工作流/项目的id
     */
    public void setMonitorObjectId(String MonitorObjectId) {
        this.MonitorObjectId = MonitorObjectId;
    }

    /**
     * Get 白名单任务列表 
     * @return TaskIds 白名单任务列表
     */
    public String [] getTaskIds() {
        return this.TaskIds;
    }

    /**
     * Set 白名单任务列表
     * @param TaskIds 白名单任务列表
     */
    public void setTaskIds(String [] TaskIds) {
        this.TaskIds = TaskIds;
    }

    public MonitorWhiteTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MonitorWhiteTask(MonitorWhiteTask source) {
        if (source.MonitorObjectId != null) {
            this.MonitorObjectId = new String(source.MonitorObjectId);
        }
        if (source.TaskIds != null) {
            this.TaskIds = new String[source.TaskIds.length];
            for (int i = 0; i < source.TaskIds.length; i++) {
                this.TaskIds[i] = new String(source.TaskIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MonitorObjectId", this.MonitorObjectId);
        this.setParamArraySimple(map, prefix + "TaskIds.", this.TaskIds);

    }
}

