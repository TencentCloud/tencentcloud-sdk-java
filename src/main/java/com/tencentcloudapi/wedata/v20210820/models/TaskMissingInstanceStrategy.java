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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskMissingInstanceStrategy extends AbstractModel {

    /**
    * <p>任务ID</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>缺失实例处理策略</p>
    */
    @SerializedName("MissingInstanceStrategy")
    @Expose
    private String MissingInstanceStrategy;

    /**
     * Get <p>任务ID</p> 
     * @return TaskId <p>任务ID</p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>任务ID</p>
     * @param TaskId <p>任务ID</p>
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>缺失实例处理策略</p> 
     * @return MissingInstanceStrategy <p>缺失实例处理策略</p>
     */
    public String getMissingInstanceStrategy() {
        return this.MissingInstanceStrategy;
    }

    /**
     * Set <p>缺失实例处理策略</p>
     * @param MissingInstanceStrategy <p>缺失实例处理策略</p>
     */
    public void setMissingInstanceStrategy(String MissingInstanceStrategy) {
        this.MissingInstanceStrategy = MissingInstanceStrategy;
    }

    public TaskMissingInstanceStrategy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskMissingInstanceStrategy(TaskMissingInstanceStrategy source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.MissingInstanceStrategy != null) {
            this.MissingInstanceStrategy = new String(source.MissingInstanceStrategy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "MissingInstanceStrategy", this.MissingInstanceStrategy);

    }
}

