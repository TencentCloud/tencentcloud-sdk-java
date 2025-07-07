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
package com.tencentcloudapi.batch.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TerminateTaskInstanceRequest extends AbstractModel {

    /**
    * 作业ID；详见[作业列表](https://cloud.tencent.com/document/product/599/15909)。
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * 任务名称；详见[作业提交信息](https://cloud.tencent.com/document/product/599/15910)
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * 任务实例索引
    */
    @SerializedName("TaskInstanceIndex")
    @Expose
    private Long TaskInstanceIndex;

    /**
     * Get 作业ID；详见[作业列表](https://cloud.tencent.com/document/product/599/15909)。 
     * @return JobId 作业ID；详见[作业列表](https://cloud.tencent.com/document/product/599/15909)。
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set 作业ID；详见[作业列表](https://cloud.tencent.com/document/product/599/15909)。
     * @param JobId 作业ID；详见[作业列表](https://cloud.tencent.com/document/product/599/15909)。
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get 任务名称；详见[作业提交信息](https://cloud.tencent.com/document/product/599/15910) 
     * @return TaskName 任务名称；详见[作业提交信息](https://cloud.tencent.com/document/product/599/15910)
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set 任务名称；详见[作业提交信息](https://cloud.tencent.com/document/product/599/15910)
     * @param TaskName 任务名称；详见[作业提交信息](https://cloud.tencent.com/document/product/599/15910)
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get 任务实例索引 
     * @return TaskInstanceIndex 任务实例索引
     */
    public Long getTaskInstanceIndex() {
        return this.TaskInstanceIndex;
    }

    /**
     * Set 任务实例索引
     * @param TaskInstanceIndex 任务实例索引
     */
    public void setTaskInstanceIndex(Long TaskInstanceIndex) {
        this.TaskInstanceIndex = TaskInstanceIndex;
    }

    public TerminateTaskInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TerminateTaskInstanceRequest(TerminateTaskInstanceRequest source) {
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.TaskInstanceIndex != null) {
            this.TaskInstanceIndex = new Long(source.TaskInstanceIndex);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "TaskInstanceIndex", this.TaskInstanceIndex);

    }
}

