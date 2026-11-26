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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AsyncTextToSpeechResponse extends AbstractModel {

    /**
    * <p>任务ID</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>当前正在处理的任务数</p>
    */
    @SerializedName("CurrentTaskCount")
    @Expose
    private Long CurrentTaskCount;

    /**
    * <p>最大允许提交的任务数，默认1000，有提额需求请提交工单</p>
    */
    @SerializedName("MaxTaskCount")
    @Expose
    private Long MaxTaskCount;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

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
     * Get <p>当前正在处理的任务数</p> 
     * @return CurrentTaskCount <p>当前正在处理的任务数</p>
     */
    public Long getCurrentTaskCount() {
        return this.CurrentTaskCount;
    }

    /**
     * Set <p>当前正在处理的任务数</p>
     * @param CurrentTaskCount <p>当前正在处理的任务数</p>
     */
    public void setCurrentTaskCount(Long CurrentTaskCount) {
        this.CurrentTaskCount = CurrentTaskCount;
    }

    /**
     * Get <p>最大允许提交的任务数，默认1000，有提额需求请提交工单</p> 
     * @return MaxTaskCount <p>最大允许提交的任务数，默认1000，有提额需求请提交工单</p>
     */
    public Long getMaxTaskCount() {
        return this.MaxTaskCount;
    }

    /**
     * Set <p>最大允许提交的任务数，默认1000，有提额需求请提交工单</p>
     * @param MaxTaskCount <p>最大允许提交的任务数，默认1000，有提额需求请提交工单</p>
     */
    public void setMaxTaskCount(Long MaxTaskCount) {
        this.MaxTaskCount = MaxTaskCount;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public AsyncTextToSpeechResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AsyncTextToSpeechResponse(AsyncTextToSpeechResponse source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.CurrentTaskCount != null) {
            this.CurrentTaskCount = new Long(source.CurrentTaskCount);
        }
        if (source.MaxTaskCount != null) {
            this.MaxTaskCount = new Long(source.MaxTaskCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "CurrentTaskCount", this.CurrentTaskCount);
        this.setParamSimple(map, prefix + "MaxTaskCount", this.MaxTaskCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

