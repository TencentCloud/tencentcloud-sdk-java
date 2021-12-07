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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StopVirusScanTaskRequest extends AbstractModel{

    /**
    * 任务ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 需要停止的容器id 为空默认停止整个任务
    */
    @SerializedName("ContainerIds")
    @Expose
    private String [] ContainerIds;

    /**
     * Get 任务ID 
     * @return TaskId 任务ID
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务ID
     * @param TaskId 任务ID
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 需要停止的容器id 为空默认停止整个任务 
     * @return ContainerIds 需要停止的容器id 为空默认停止整个任务
     */
    public String [] getContainerIds() {
        return this.ContainerIds;
    }

    /**
     * Set 需要停止的容器id 为空默认停止整个任务
     * @param ContainerIds 需要停止的容器id 为空默认停止整个任务
     */
    public void setContainerIds(String [] ContainerIds) {
        this.ContainerIds = ContainerIds;
    }

    public StopVirusScanTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StopVirusScanTaskRequest(StopVirusScanTaskRequest source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.ContainerIds != null) {
            this.ContainerIds = new String[source.ContainerIds.length];
            for (int i = 0; i < source.ContainerIds.length; i++) {
                this.ContainerIds[i] = new String(source.ContainerIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamArraySimple(map, prefix + "ContainerIds.", this.ContainerIds);

    }
}

