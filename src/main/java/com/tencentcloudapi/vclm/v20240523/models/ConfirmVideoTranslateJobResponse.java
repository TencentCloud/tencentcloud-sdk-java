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
package com.tencentcloudapi.vclm.v20240523.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConfirmVideoTranslateJobResponse extends AbstractModel {

    /**
    * 视频翻译任务 ID
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * 音频转换任务 ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 音频翻译结果确认 session	
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * 视频转译任务状态	
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 视频转译任务信息	
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 视频翻译任务 ID 
     * @return JobId 视频翻译任务 ID
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set 视频翻译任务 ID
     * @param JobId 视频翻译任务 ID
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get 音频转换任务 ID 
     * @return TaskId 音频转换任务 ID
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 音频转换任务 ID
     * @param TaskId 音频转换任务 ID
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 音频翻译结果确认 session	 
     * @return SessionId 音频翻译结果确认 session	
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set 音频翻译结果确认 session	
     * @param SessionId 音频翻译结果确认 session	
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get 视频转译任务状态	 
     * @return Status 视频转译任务状态	
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 视频转译任务状态	
     * @param Status 视频转译任务状态	
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 视频转译任务信息	 
     * @return Message 视频转译任务信息	
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 视频转译任务信息	
     * @param Message 视频转译任务信息	
     */
    public void setMessage(String Message) {
        this.Message = Message;
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

    public ConfirmVideoTranslateJobResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConfirmVideoTranslateJobResponse(ConfirmVideoTranslateJobResponse source) {
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

