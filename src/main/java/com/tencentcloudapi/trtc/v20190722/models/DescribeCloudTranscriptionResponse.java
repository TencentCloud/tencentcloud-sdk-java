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

public class DescribeCloudTranscriptionResponse extends AbstractModel {

    /**
    * 任务开始时间。
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 转录任务状态。Idle：表示当前转录任务空闲中 InProgress：表示当前转录任务正在进行中。 Exited：表示当前转录任务正在退出的过程中。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 转录任务的唯一Id。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 任务开始时间。 
     * @return StartTime 任务开始时间。
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 任务开始时间。
     * @param StartTime 任务开始时间。
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 转录任务状态。Idle：表示当前转录任务空闲中 InProgress：表示当前转录任务正在进行中。 Exited：表示当前转录任务正在退出的过程中。 
     * @return Status 转录任务状态。Idle：表示当前转录任务空闲中 InProgress：表示当前转录任务正在进行中。 Exited：表示当前转录任务正在退出的过程中。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 转录任务状态。Idle：表示当前转录任务空闲中 InProgress：表示当前转录任务正在进行中。 Exited：表示当前转录任务正在退出的过程中。
     * @param Status 转录任务状态。Idle：表示当前转录任务空闲中 InProgress：表示当前转录任务正在进行中。 Exited：表示当前转录任务正在退出的过程中。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 转录任务的唯一Id。 
     * @return TaskId 转录任务的唯一Id。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 转录任务的唯一Id。
     * @param TaskId 转录任务的唯一Id。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
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

    public DescribeCloudTranscriptionResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCloudTranscriptionResponse(DescribeCloudTranscriptionResponse source) {
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

