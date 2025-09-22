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

public class Task extends AbstractModel {

    /**
    * 任务基本属性
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskBaseAttribute")
    @Expose
    private TaskBaseAttribute TaskBaseAttribute;

    /**
    * 任务配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskConfiguration")
    @Expose
    private TaskConfiguration TaskConfiguration;

    /**
    * 任务调度配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskSchedulerConfiguration")
    @Expose
    private TaskSchedulerConfiguration TaskSchedulerConfiguration;

    /**
     * Get 任务基本属性
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskBaseAttribute 任务基本属性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TaskBaseAttribute getTaskBaseAttribute() {
        return this.TaskBaseAttribute;
    }

    /**
     * Set 任务基本属性
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskBaseAttribute 任务基本属性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskBaseAttribute(TaskBaseAttribute TaskBaseAttribute) {
        this.TaskBaseAttribute = TaskBaseAttribute;
    }

    /**
     * Get 任务配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskConfiguration 任务配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TaskConfiguration getTaskConfiguration() {
        return this.TaskConfiguration;
    }

    /**
     * Set 任务配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskConfiguration 任务配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskConfiguration(TaskConfiguration TaskConfiguration) {
        this.TaskConfiguration = TaskConfiguration;
    }

    /**
     * Get 任务调度配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskSchedulerConfiguration 任务调度配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TaskSchedulerConfiguration getTaskSchedulerConfiguration() {
        return this.TaskSchedulerConfiguration;
    }

    /**
     * Set 任务调度配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskSchedulerConfiguration 任务调度配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskSchedulerConfiguration(TaskSchedulerConfiguration TaskSchedulerConfiguration) {
        this.TaskSchedulerConfiguration = TaskSchedulerConfiguration;
    }

    public Task() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Task(Task source) {
        if (source.TaskBaseAttribute != null) {
            this.TaskBaseAttribute = new TaskBaseAttribute(source.TaskBaseAttribute);
        }
        if (source.TaskConfiguration != null) {
            this.TaskConfiguration = new TaskConfiguration(source.TaskConfiguration);
        }
        if (source.TaskSchedulerConfiguration != null) {
            this.TaskSchedulerConfiguration = new TaskSchedulerConfiguration(source.TaskSchedulerConfiguration);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "TaskBaseAttribute.", this.TaskBaseAttribute);
        this.setParamObj(map, prefix + "TaskConfiguration.", this.TaskConfiguration);
        this.setParamObj(map, prefix + "TaskSchedulerConfiguration.", this.TaskSchedulerConfiguration);

    }
}

