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
package com.tencentcloudapi.aiart.v20221229.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryDrawPortraitJobResponse extends AbstractModel {

    /**
    * 任务状态码。
INIT: 初始化、WAIT：等待中、RUN：运行中、FAIL：处理失败、DONE：处理完成。
    */
    @SerializedName("JobStatusCode")
    @Expose
    private String JobStatusCode;

    /**
    * 任务状态信息。
    */
    @SerializedName("JobStatusMsg")
    @Expose
    private String JobStatusMsg;

    /**
    * 任务错误码。
    */
    @SerializedName("JobErrorCode")
    @Expose
    private String JobErrorCode;

    /**
    * 任务错误信息。
    */
    @SerializedName("JobErrorMsg")
    @Expose
    private String JobErrorMsg;

    /**
    * 结果 URL 数组。
URL 有效期1小时，请及时保存。
    */
    @SerializedName("ResultUrls")
    @Expose
    private String [] ResultUrls;

    /**
    * 结果描述数组。
    */
    @SerializedName("ResultDetails")
    @Expose
    private String [] ResultDetails;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 任务状态码。
INIT: 初始化、WAIT：等待中、RUN：运行中、FAIL：处理失败、DONE：处理完成。 
     * @return JobStatusCode 任务状态码。
INIT: 初始化、WAIT：等待中、RUN：运行中、FAIL：处理失败、DONE：处理完成。
     */
    public String getJobStatusCode() {
        return this.JobStatusCode;
    }

    /**
     * Set 任务状态码。
INIT: 初始化、WAIT：等待中、RUN：运行中、FAIL：处理失败、DONE：处理完成。
     * @param JobStatusCode 任务状态码。
INIT: 初始化、WAIT：等待中、RUN：运行中、FAIL：处理失败、DONE：处理完成。
     */
    public void setJobStatusCode(String JobStatusCode) {
        this.JobStatusCode = JobStatusCode;
    }

    /**
     * Get 任务状态信息。 
     * @return JobStatusMsg 任务状态信息。
     */
    public String getJobStatusMsg() {
        return this.JobStatusMsg;
    }

    /**
     * Set 任务状态信息。
     * @param JobStatusMsg 任务状态信息。
     */
    public void setJobStatusMsg(String JobStatusMsg) {
        this.JobStatusMsg = JobStatusMsg;
    }

    /**
     * Get 任务错误码。 
     * @return JobErrorCode 任务错误码。
     */
    public String getJobErrorCode() {
        return this.JobErrorCode;
    }

    /**
     * Set 任务错误码。
     * @param JobErrorCode 任务错误码。
     */
    public void setJobErrorCode(String JobErrorCode) {
        this.JobErrorCode = JobErrorCode;
    }

    /**
     * Get 任务错误信息。 
     * @return JobErrorMsg 任务错误信息。
     */
    public String getJobErrorMsg() {
        return this.JobErrorMsg;
    }

    /**
     * Set 任务错误信息。
     * @param JobErrorMsg 任务错误信息。
     */
    public void setJobErrorMsg(String JobErrorMsg) {
        this.JobErrorMsg = JobErrorMsg;
    }

    /**
     * Get 结果 URL 数组。
URL 有效期1小时，请及时保存。 
     * @return ResultUrls 结果 URL 数组。
URL 有效期1小时，请及时保存。
     */
    public String [] getResultUrls() {
        return this.ResultUrls;
    }

    /**
     * Set 结果 URL 数组。
URL 有效期1小时，请及时保存。
     * @param ResultUrls 结果 URL 数组。
URL 有效期1小时，请及时保存。
     */
    public void setResultUrls(String [] ResultUrls) {
        this.ResultUrls = ResultUrls;
    }

    /**
     * Get 结果描述数组。 
     * @return ResultDetails 结果描述数组。
     */
    public String [] getResultDetails() {
        return this.ResultDetails;
    }

    /**
     * Set 结果描述数组。
     * @param ResultDetails 结果描述数组。
     */
    public void setResultDetails(String [] ResultDetails) {
        this.ResultDetails = ResultDetails;
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

    public QueryDrawPortraitJobResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryDrawPortraitJobResponse(QueryDrawPortraitJobResponse source) {
        if (source.JobStatusCode != null) {
            this.JobStatusCode = new String(source.JobStatusCode);
        }
        if (source.JobStatusMsg != null) {
            this.JobStatusMsg = new String(source.JobStatusMsg);
        }
        if (source.JobErrorCode != null) {
            this.JobErrorCode = new String(source.JobErrorCode);
        }
        if (source.JobErrorMsg != null) {
            this.JobErrorMsg = new String(source.JobErrorMsg);
        }
        if (source.ResultUrls != null) {
            this.ResultUrls = new String[source.ResultUrls.length];
            for (int i = 0; i < source.ResultUrls.length; i++) {
                this.ResultUrls[i] = new String(source.ResultUrls[i]);
            }
        }
        if (source.ResultDetails != null) {
            this.ResultDetails = new String[source.ResultDetails.length];
            for (int i = 0; i < source.ResultDetails.length; i++) {
                this.ResultDetails[i] = new String(source.ResultDetails[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobStatusCode", this.JobStatusCode);
        this.setParamSimple(map, prefix + "JobStatusMsg", this.JobStatusMsg);
        this.setParamSimple(map, prefix + "JobErrorCode", this.JobErrorCode);
        this.setParamSimple(map, prefix + "JobErrorMsg", this.JobErrorMsg);
        this.setParamArraySimple(map, prefix + "ResultUrls.", this.ResultUrls);
        this.setParamArraySimple(map, prefix + "ResultDetails.", this.ResultDetails);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

