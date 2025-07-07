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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ComplexAdaptiveDynamicStreamingTask extends AbstractModel {

    /**
    * 任务 ID。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 任务状态，取值：
<li>PROCESSING：处理中；</li>
<li>FINISH：已完成。</li>

    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 自适应码流任务的执行状态与结果，每个元素对应一个自适应码流模板。
    */
    @SerializedName("ComplexAdaptiveDynamicStreamingTaskResultSet")
    @Expose
    private ComplexAdaptiveDynamicStreamingTaskResult [] ComplexAdaptiveDynamicStreamingTaskResultSet;

    /**
     * Get 任务 ID。 
     * @return TaskId 任务 ID。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务 ID。
     * @param TaskId 任务 ID。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 任务状态，取值：
<li>PROCESSING：处理中；</li>
<li>FINISH：已完成。</li>
 
     * @return Status 任务状态，取值：
<li>PROCESSING：处理中；</li>
<li>FINISH：已完成。</li>

     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 任务状态，取值：
<li>PROCESSING：处理中；</li>
<li>FINISH：已完成。</li>

     * @param Status 任务状态，取值：
<li>PROCESSING：处理中；</li>
<li>FINISH：已完成。</li>

     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 自适应码流任务的执行状态与结果，每个元素对应一个自适应码流模板。 
     * @return ComplexAdaptiveDynamicStreamingTaskResultSet 自适应码流任务的执行状态与结果，每个元素对应一个自适应码流模板。
     */
    public ComplexAdaptiveDynamicStreamingTaskResult [] getComplexAdaptiveDynamicStreamingTaskResultSet() {
        return this.ComplexAdaptiveDynamicStreamingTaskResultSet;
    }

    /**
     * Set 自适应码流任务的执行状态与结果，每个元素对应一个自适应码流模板。
     * @param ComplexAdaptiveDynamicStreamingTaskResultSet 自适应码流任务的执行状态与结果，每个元素对应一个自适应码流模板。
     */
    public void setComplexAdaptiveDynamicStreamingTaskResultSet(ComplexAdaptiveDynamicStreamingTaskResult [] ComplexAdaptiveDynamicStreamingTaskResultSet) {
        this.ComplexAdaptiveDynamicStreamingTaskResultSet = ComplexAdaptiveDynamicStreamingTaskResultSet;
    }

    public ComplexAdaptiveDynamicStreamingTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComplexAdaptiveDynamicStreamingTask(ComplexAdaptiveDynamicStreamingTask source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ComplexAdaptiveDynamicStreamingTaskResultSet != null) {
            this.ComplexAdaptiveDynamicStreamingTaskResultSet = new ComplexAdaptiveDynamicStreamingTaskResult[source.ComplexAdaptiveDynamicStreamingTaskResultSet.length];
            for (int i = 0; i < source.ComplexAdaptiveDynamicStreamingTaskResultSet.length; i++) {
                this.ComplexAdaptiveDynamicStreamingTaskResultSet[i] = new ComplexAdaptiveDynamicStreamingTaskResult(source.ComplexAdaptiveDynamicStreamingTaskResultSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "ComplexAdaptiveDynamicStreamingTaskResultSet.", this.ComplexAdaptiveDynamicStreamingTaskResultSet);

    }
}

