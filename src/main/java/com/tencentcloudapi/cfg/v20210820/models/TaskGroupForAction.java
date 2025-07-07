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
package com.tencentcloudapi.cfg.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskGroupForAction extends AbstractModel {

    /**
    * 动作ID
    */
    @SerializedName("TaskActionId")
    @Expose
    private Long TaskActionId;

    /**
    * {"ActionTimeout":1800}
    */
    @SerializedName("TaskActionGeneralConfiguration")
    @Expose
    private String TaskActionGeneralConfiguration;

    /**
    * {"ip": "0.0.0.0"}
    */
    @SerializedName("TaskActionCustomConfiguration")
    @Expose
    private String TaskActionCustomConfiguration;

    /**
     * Get 动作ID 
     * @return TaskActionId 动作ID
     */
    public Long getTaskActionId() {
        return this.TaskActionId;
    }

    /**
     * Set 动作ID
     * @param TaskActionId 动作ID
     */
    public void setTaskActionId(Long TaskActionId) {
        this.TaskActionId = TaskActionId;
    }

    /**
     * Get {"ActionTimeout":1800} 
     * @return TaskActionGeneralConfiguration {"ActionTimeout":1800}
     */
    public String getTaskActionGeneralConfiguration() {
        return this.TaskActionGeneralConfiguration;
    }

    /**
     * Set {"ActionTimeout":1800}
     * @param TaskActionGeneralConfiguration {"ActionTimeout":1800}
     */
    public void setTaskActionGeneralConfiguration(String TaskActionGeneralConfiguration) {
        this.TaskActionGeneralConfiguration = TaskActionGeneralConfiguration;
    }

    /**
     * Get {"ip": "0.0.0.0"} 
     * @return TaskActionCustomConfiguration {"ip": "0.0.0.0"}
     */
    public String getTaskActionCustomConfiguration() {
        return this.TaskActionCustomConfiguration;
    }

    /**
     * Set {"ip": "0.0.0.0"}
     * @param TaskActionCustomConfiguration {"ip": "0.0.0.0"}
     */
    public void setTaskActionCustomConfiguration(String TaskActionCustomConfiguration) {
        this.TaskActionCustomConfiguration = TaskActionCustomConfiguration;
    }

    public TaskGroupForAction() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskGroupForAction(TaskGroupForAction source) {
        if (source.TaskActionId != null) {
            this.TaskActionId = new Long(source.TaskActionId);
        }
        if (source.TaskActionGeneralConfiguration != null) {
            this.TaskActionGeneralConfiguration = new String(source.TaskActionGeneralConfiguration);
        }
        if (source.TaskActionCustomConfiguration != null) {
            this.TaskActionCustomConfiguration = new String(source.TaskActionCustomConfiguration);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskActionId", this.TaskActionId);
        this.setParamSimple(map, prefix + "TaskActionGeneralConfiguration", this.TaskActionGeneralConfiguration);
        this.setParamSimple(map, prefix + "TaskActionCustomConfiguration", this.TaskActionCustomConfiguration);

    }
}

