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
package com.tencentcloudapi.goosefs.v20220519.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateLoadTaskPriorityRequest extends AbstractModel {

    /**
    * 集群 ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 预热任务 ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 任务优先级，数值越高代表优先级越高，边界值 1-9999，默认值为 1
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
     * Get 集群 ID 
     * @return ClusterId 集群 ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群 ID
     * @param ClusterId 集群 ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 预热任务 ID 
     * @return TaskId 预热任务 ID
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 预热任务 ID
     * @param TaskId 预热任务 ID
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 任务优先级，数值越高代表优先级越高，边界值 1-9999，默认值为 1 
     * @return Priority 任务优先级，数值越高代表优先级越高，边界值 1-9999，默认值为 1
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set 任务优先级，数值越高代表优先级越高，边界值 1-9999，默认值为 1
     * @param Priority 任务优先级，数值越高代表优先级越高，边界值 1-9999，默认值为 1
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    public UpdateLoadTaskPriorityRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateLoadTaskPriorityRequest(UpdateLoadTaskPriorityRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Priority", this.Priority);

    }
}

