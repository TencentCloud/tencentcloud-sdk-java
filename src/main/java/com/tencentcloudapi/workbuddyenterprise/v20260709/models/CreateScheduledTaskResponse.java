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
package com.tencentcloudapi.workbuddyenterprise.v20260709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateScheduledTaskResponse extends AbstractModel {

    /**
    * <p>任务 ID</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>任务唯一标识</p>
    */
    @SerializedName("TaskKey")
    @Expose
    private String TaskKey;

    /**
    * <p>任务状态：ACTIVE（启用）/ PAUSED（暂停）/ DISABLED（停用）</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>下次执行时间</p>
    */
    @SerializedName("NextRunTime")
    @Expose
    private String NextRunTime;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>任务 ID</p> 
     * @return TaskId <p>任务 ID</p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>任务 ID</p>
     * @param TaskId <p>任务 ID</p>
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>任务唯一标识</p> 
     * @return TaskKey <p>任务唯一标识</p>
     */
    public String getTaskKey() {
        return this.TaskKey;
    }

    /**
     * Set <p>任务唯一标识</p>
     * @param TaskKey <p>任务唯一标识</p>
     */
    public void setTaskKey(String TaskKey) {
        this.TaskKey = TaskKey;
    }

    /**
     * Get <p>任务状态：ACTIVE（启用）/ PAUSED（暂停）/ DISABLED（停用）</p> 
     * @return Status <p>任务状态：ACTIVE（启用）/ PAUSED（暂停）/ DISABLED（停用）</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>任务状态：ACTIVE（启用）/ PAUSED（暂停）/ DISABLED（停用）</p>
     * @param Status <p>任务状态：ACTIVE（启用）/ PAUSED（暂停）/ DISABLED（停用）</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>下次执行时间</p> 
     * @return NextRunTime <p>下次执行时间</p>
     */
    public String getNextRunTime() {
        return this.NextRunTime;
    }

    /**
     * Set <p>下次执行时间</p>
     * @param NextRunTime <p>下次执行时间</p>
     */
    public void setNextRunTime(String NextRunTime) {
        this.NextRunTime = NextRunTime;
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

    public CreateScheduledTaskResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateScheduledTaskResponse(CreateScheduledTaskResponse source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TaskKey != null) {
            this.TaskKey = new String(source.TaskKey);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.NextRunTime != null) {
            this.NextRunTime = new String(source.NextRunTime);
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
        this.setParamSimple(map, prefix + "TaskKey", this.TaskKey);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "NextRunTime", this.NextRunTime);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

