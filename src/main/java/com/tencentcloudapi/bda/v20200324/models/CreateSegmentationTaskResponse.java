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
package com.tencentcloudapi.bda.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateSegmentationTaskResponse extends AbstractModel{

    /**
    * 任务标识ID,可以用与追溯任务状态，查看任务结果
    */
    @SerializedName("TaskID")
    @Expose
    private String TaskID;

    /**
    * 预估处理时间，单位为秒
    */
    @SerializedName("EstimatedProcessingTime")
    @Expose
    private Float EstimatedProcessingTime;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 任务标识ID,可以用与追溯任务状态，查看任务结果 
     * @return TaskID 任务标识ID,可以用与追溯任务状态，查看任务结果
     */
    public String getTaskID() {
        return this.TaskID;
    }

    /**
     * Set 任务标识ID,可以用与追溯任务状态，查看任务结果
     * @param TaskID 任务标识ID,可以用与追溯任务状态，查看任务结果
     */
    public void setTaskID(String TaskID) {
        this.TaskID = TaskID;
    }

    /**
     * Get 预估处理时间，单位为秒 
     * @return EstimatedProcessingTime 预估处理时间，单位为秒
     */
    public Float getEstimatedProcessingTime() {
        return this.EstimatedProcessingTime;
    }

    /**
     * Set 预估处理时间，单位为秒
     * @param EstimatedProcessingTime 预估处理时间，单位为秒
     */
    public void setEstimatedProcessingTime(Float EstimatedProcessingTime) {
        this.EstimatedProcessingTime = EstimatedProcessingTime;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public CreateSegmentationTaskResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSegmentationTaskResponse(CreateSegmentationTaskResponse source) {
        if (source.TaskID != null) {
            this.TaskID = new String(source.TaskID);
        }
        if (source.EstimatedProcessingTime != null) {
            this.EstimatedProcessingTime = new Float(source.EstimatedProcessingTime);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskID", this.TaskID);
        this.setParamSimple(map, prefix + "EstimatedProcessingTime", this.EstimatedProcessingTime);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

