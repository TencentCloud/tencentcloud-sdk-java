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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloneViralResponse extends AbstractModel {

    /**
    * <p>任务状态，失败时返回FAIL</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>失败时返回错误信息</p>
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * <p>任务创建成功后，返回的任务ID。 调用查询接口，轮询获取任务进度及生成结果。</p>
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
     * Get <p>任务状态，失败时返回FAIL</p> 
     * @return Status <p>任务状态，失败时返回FAIL</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>任务状态，失败时返回FAIL</p>
     * @param Status <p>任务状态，失败时返回FAIL</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>失败时返回错误信息</p> 
     * @return Message <p>失败时返回错误信息</p>
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set <p>失败时返回错误信息</p>
     * @param Message <p>失败时返回错误信息</p>
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get <p>任务创建成功后，返回的任务ID。 调用查询接口，轮询获取任务进度及生成结果。</p> 
     * @return TaskId <p>任务创建成功后，返回的任务ID。 调用查询接口，轮询获取任务进度及生成结果。</p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>任务创建成功后，返回的任务ID。 调用查询接口，轮询获取任务进度及生成结果。</p>
     * @param TaskId <p>任务创建成功后，返回的任务ID。 调用查询接口，轮询获取任务进度及生成结果。</p>
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

    public CloneViralResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloneViralResponse(CloneViralResponse source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
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
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

