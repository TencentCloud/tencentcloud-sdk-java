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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskInfo extends AbstractModel{

    /**
    * 合成任务Id，可以通过 ChannelGetTaskResultApi 接口获取任务信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 任务状态：READY - 任务已完成；NOTREADY - 任务未完成；
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskStatus")
    @Expose
    private String TaskStatus;

    /**
     * Get 合成任务Id，可以通过 ChannelGetTaskResultApi 接口获取任务信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskId 合成任务Id，可以通过 ChannelGetTaskResultApi 接口获取任务信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 合成任务Id，可以通过 ChannelGetTaskResultApi 接口获取任务信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskId 合成任务Id，可以通过 ChannelGetTaskResultApi 接口获取任务信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 任务状态：READY - 任务已完成；NOTREADY - 任务未完成；
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskStatus 任务状态：READY - 任务已完成；NOTREADY - 任务未完成；
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * Set 任务状态：READY - 任务已完成；NOTREADY - 任务未完成；
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskStatus 任务状态：READY - 任务已完成；NOTREADY - 任务未完成；
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskStatus(String TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    public TaskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskInfo(TaskInfo source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
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
        this.setParamSimple(map, prefix + "TaskStatus", this.TaskStatus);

    }
}

