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
package com.tencentcloudapi.vcg.v20240404.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVideoStylizationJobResponse extends AbstractModel {

    /**
    * 任务ID。
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * 任务状态码：
JobInit:  "初始化中"
JobModerationFailed: "审核失败",
JobRunning: "处理中",
JobFailed: "处理完成",
JobSuccess: "处理失败"。
    */
    @SerializedName("StatusCode")
    @Expose
    private String StatusCode;

    /**
    * 任务状态描述。
    */
    @SerializedName("StatusMsg")
    @Expose
    private String StatusMsg;

    /**
    * 处理结果视频Url。URL有效期为24小时。
    */
    @SerializedName("ResultVideoUrl")
    @Expose
    private String ResultVideoUrl;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 任务ID。 
     * @return JobId 任务ID。
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set 任务ID。
     * @param JobId 任务ID。
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get 任务状态码：
JobInit:  "初始化中"
JobModerationFailed: "审核失败",
JobRunning: "处理中",
JobFailed: "处理完成",
JobSuccess: "处理失败"。 
     * @return StatusCode 任务状态码：
JobInit:  "初始化中"
JobModerationFailed: "审核失败",
JobRunning: "处理中",
JobFailed: "处理完成",
JobSuccess: "处理失败"。
     */
    public String getStatusCode() {
        return this.StatusCode;
    }

    /**
     * Set 任务状态码：
JobInit:  "初始化中"
JobModerationFailed: "审核失败",
JobRunning: "处理中",
JobFailed: "处理完成",
JobSuccess: "处理失败"。
     * @param StatusCode 任务状态码：
JobInit:  "初始化中"
JobModerationFailed: "审核失败",
JobRunning: "处理中",
JobFailed: "处理完成",
JobSuccess: "处理失败"。
     */
    public void setStatusCode(String StatusCode) {
        this.StatusCode = StatusCode;
    }

    /**
     * Get 任务状态描述。 
     * @return StatusMsg 任务状态描述。
     */
    public String getStatusMsg() {
        return this.StatusMsg;
    }

    /**
     * Set 任务状态描述。
     * @param StatusMsg 任务状态描述。
     */
    public void setStatusMsg(String StatusMsg) {
        this.StatusMsg = StatusMsg;
    }

    /**
     * Get 处理结果视频Url。URL有效期为24小时。 
     * @return ResultVideoUrl 处理结果视频Url。URL有效期为24小时。
     */
    public String getResultVideoUrl() {
        return this.ResultVideoUrl;
    }

    /**
     * Set 处理结果视频Url。URL有效期为24小时。
     * @param ResultVideoUrl 处理结果视频Url。URL有效期为24小时。
     */
    public void setResultVideoUrl(String ResultVideoUrl) {
        this.ResultVideoUrl = ResultVideoUrl;
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

    public DescribeVideoStylizationJobResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVideoStylizationJobResponse(DescribeVideoStylizationJobResponse source) {
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.StatusCode != null) {
            this.StatusCode = new String(source.StatusCode);
        }
        if (source.StatusMsg != null) {
            this.StatusMsg = new String(source.StatusMsg);
        }
        if (source.ResultVideoUrl != null) {
            this.ResultVideoUrl = new String(source.ResultVideoUrl);
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
        this.setParamSimple(map, prefix + "StatusCode", this.StatusCode);
        this.setParamSimple(map, prefix + "StatusMsg", this.StatusMsg);
        this.setParamSimple(map, prefix + "ResultVideoUrl", this.ResultVideoUrl);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

