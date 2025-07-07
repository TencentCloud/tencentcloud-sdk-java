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
package com.tencentcloudapi.ft.v20200304.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MorphFaceResponse extends AbstractModel {

    /**
    * 人像渐变任务的Job id
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * 预估处理时间，粒度为秒
    */
    @SerializedName("EstimatedProcessTime")
    @Expose
    private Long EstimatedProcessTime;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 人像渐变任务的Job id 
     * @return JobId 人像渐变任务的Job id
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set 人像渐变任务的Job id
     * @param JobId 人像渐变任务的Job id
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get 预估处理时间，粒度为秒 
     * @return EstimatedProcessTime 预估处理时间，粒度为秒
     */
    public Long getEstimatedProcessTime() {
        return this.EstimatedProcessTime;
    }

    /**
     * Set 预估处理时间，粒度为秒
     * @param EstimatedProcessTime 预估处理时间，粒度为秒
     */
    public void setEstimatedProcessTime(Long EstimatedProcessTime) {
        this.EstimatedProcessTime = EstimatedProcessTime;
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

    public MorphFaceResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MorphFaceResponse(MorphFaceResponse source) {
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.EstimatedProcessTime != null) {
            this.EstimatedProcessTime = new Long(source.EstimatedProcessTime);
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
        this.setParamSimple(map, prefix + "EstimatedProcessTime", this.EstimatedProcessTime);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

