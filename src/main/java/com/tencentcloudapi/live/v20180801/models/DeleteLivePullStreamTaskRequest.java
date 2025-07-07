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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteLivePullStreamTaskRequest extends AbstractModel {

    /**
    * 任务 Id。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 操作人姓名。
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * 指定任务 ID。注意：用于删除使用自定义任务 ID 创建的任务。
    */
    @SerializedName("SpecifyTaskId")
    @Expose
    private String SpecifyTaskId;

    /**
     * Get 任务 Id。 
     * @return TaskId 任务 Id。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务 Id。
     * @param TaskId 任务 Id。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 操作人姓名。 
     * @return Operator 操作人姓名。
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set 操作人姓名。
     * @param Operator 操作人姓名。
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 指定任务 ID。注意：用于删除使用自定义任务 ID 创建的任务。 
     * @return SpecifyTaskId 指定任务 ID。注意：用于删除使用自定义任务 ID 创建的任务。
     */
    public String getSpecifyTaskId() {
        return this.SpecifyTaskId;
    }

    /**
     * Set 指定任务 ID。注意：用于删除使用自定义任务 ID 创建的任务。
     * @param SpecifyTaskId 指定任务 ID。注意：用于删除使用自定义任务 ID 创建的任务。
     */
    public void setSpecifyTaskId(String SpecifyTaskId) {
        this.SpecifyTaskId = SpecifyTaskId;
    }

    public DeleteLivePullStreamTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteLivePullStreamTaskRequest(DeleteLivePullStreamTaskRequest source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
        if (source.SpecifyTaskId != null) {
            this.SpecifyTaskId = new String(source.SpecifyTaskId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "SpecifyTaskId", this.SpecifyTaskId);

    }
}

