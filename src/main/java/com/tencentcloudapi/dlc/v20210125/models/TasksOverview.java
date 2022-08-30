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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TasksOverview extends AbstractModel{

    /**
    * 正在排队的任务个数
    */
    @SerializedName("TaskQueuedCount")
    @Expose
    private Long TaskQueuedCount;

    /**
    * 初始化的任务个数
    */
    @SerializedName("TaskInitCount")
    @Expose
    private Long TaskInitCount;

    /**
    * 正在执行的任务个数
    */
    @SerializedName("TaskRunningCount")
    @Expose
    private Long TaskRunningCount;

    /**
    * 当前时间范围的总任务个数
    */
    @SerializedName("TotalTaskCount")
    @Expose
    private Long TotalTaskCount;

    /**
     * Get 正在排队的任务个数 
     * @return TaskQueuedCount 正在排队的任务个数
     */
    public Long getTaskQueuedCount() {
        return this.TaskQueuedCount;
    }

    /**
     * Set 正在排队的任务个数
     * @param TaskQueuedCount 正在排队的任务个数
     */
    public void setTaskQueuedCount(Long TaskQueuedCount) {
        this.TaskQueuedCount = TaskQueuedCount;
    }

    /**
     * Get 初始化的任务个数 
     * @return TaskInitCount 初始化的任务个数
     */
    public Long getTaskInitCount() {
        return this.TaskInitCount;
    }

    /**
     * Set 初始化的任务个数
     * @param TaskInitCount 初始化的任务个数
     */
    public void setTaskInitCount(Long TaskInitCount) {
        this.TaskInitCount = TaskInitCount;
    }

    /**
     * Get 正在执行的任务个数 
     * @return TaskRunningCount 正在执行的任务个数
     */
    public Long getTaskRunningCount() {
        return this.TaskRunningCount;
    }

    /**
     * Set 正在执行的任务个数
     * @param TaskRunningCount 正在执行的任务个数
     */
    public void setTaskRunningCount(Long TaskRunningCount) {
        this.TaskRunningCount = TaskRunningCount;
    }

    /**
     * Get 当前时间范围的总任务个数 
     * @return TotalTaskCount 当前时间范围的总任务个数
     */
    public Long getTotalTaskCount() {
        return this.TotalTaskCount;
    }

    /**
     * Set 当前时间范围的总任务个数
     * @param TotalTaskCount 当前时间范围的总任务个数
     */
    public void setTotalTaskCount(Long TotalTaskCount) {
        this.TotalTaskCount = TotalTaskCount;
    }

    public TasksOverview() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TasksOverview(TasksOverview source) {
        if (source.TaskQueuedCount != null) {
            this.TaskQueuedCount = new Long(source.TaskQueuedCount);
        }
        if (source.TaskInitCount != null) {
            this.TaskInitCount = new Long(source.TaskInitCount);
        }
        if (source.TaskRunningCount != null) {
            this.TaskRunningCount = new Long(source.TaskRunningCount);
        }
        if (source.TotalTaskCount != null) {
            this.TotalTaskCount = new Long(source.TotalTaskCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskQueuedCount", this.TaskQueuedCount);
        this.setParamSimple(map, prefix + "TaskInitCount", this.TaskInitCount);
        this.setParamSimple(map, prefix + "TaskRunningCount", this.TaskRunningCount);
        this.setParamSimple(map, prefix + "TotalTaskCount", this.TotalTaskCount);

    }
}

