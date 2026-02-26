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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMarkEssayAgentJobResponse extends AbstractModel {

    /**
    * 图片旋转角度(角度制)，文本的水平方向为 0；顺时针为正，逆时针为负。
    */
    @SerializedName("Angle")
    @Expose
    private Float Angle;

    /**
    * 配置结构化文本信息。
    */
    @SerializedName("SentenceSuggests")
    @Expose
    private MarkEssaySuggestions [] SentenceSuggests;

    /**
    * 任务执行错误码。当任务状态不为 FAIL 时，该值为""。
    */
    @SerializedName("ErrorCode")
    @Expose
    private String ErrorCode;

    /**
    * 任务执行错误信息。当任务状态不为 FAIL 时，该值为""。
    */
    @SerializedName("ErrorMessage")
    @Expose
    private String ErrorMessage;

    /**
    * 任务状态。WAIT：等待中，RUN：执行中，FAIL：任务失败，DONE：任务成功
    */
    @SerializedName("JobStatus")
    @Expose
    private String JobStatus;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 图片旋转角度(角度制)，文本的水平方向为 0；顺时针为正，逆时针为负。 
     * @return Angle 图片旋转角度(角度制)，文本的水平方向为 0；顺时针为正，逆时针为负。
     */
    public Float getAngle() {
        return this.Angle;
    }

    /**
     * Set 图片旋转角度(角度制)，文本的水平方向为 0；顺时针为正，逆时针为负。
     * @param Angle 图片旋转角度(角度制)，文本的水平方向为 0；顺时针为正，逆时针为负。
     */
    public void setAngle(Float Angle) {
        this.Angle = Angle;
    }

    /**
     * Get 配置结构化文本信息。 
     * @return SentenceSuggests 配置结构化文本信息。
     */
    public MarkEssaySuggestions [] getSentenceSuggests() {
        return this.SentenceSuggests;
    }

    /**
     * Set 配置结构化文本信息。
     * @param SentenceSuggests 配置结构化文本信息。
     */
    public void setSentenceSuggests(MarkEssaySuggestions [] SentenceSuggests) {
        this.SentenceSuggests = SentenceSuggests;
    }

    /**
     * Get 任务执行错误码。当任务状态不为 FAIL 时，该值为""。 
     * @return ErrorCode 任务执行错误码。当任务状态不为 FAIL 时，该值为""。
     */
    public String getErrorCode() {
        return this.ErrorCode;
    }

    /**
     * Set 任务执行错误码。当任务状态不为 FAIL 时，该值为""。
     * @param ErrorCode 任务执行错误码。当任务状态不为 FAIL 时，该值为""。
     */
    public void setErrorCode(String ErrorCode) {
        this.ErrorCode = ErrorCode;
    }

    /**
     * Get 任务执行错误信息。当任务状态不为 FAIL 时，该值为""。 
     * @return ErrorMessage 任务执行错误信息。当任务状态不为 FAIL 时，该值为""。
     */
    public String getErrorMessage() {
        return this.ErrorMessage;
    }

    /**
     * Set 任务执行错误信息。当任务状态不为 FAIL 时，该值为""。
     * @param ErrorMessage 任务执行错误信息。当任务状态不为 FAIL 时，该值为""。
     */
    public void setErrorMessage(String ErrorMessage) {
        this.ErrorMessage = ErrorMessage;
    }

    /**
     * Get 任务状态。WAIT：等待中，RUN：执行中，FAIL：任务失败，DONE：任务成功 
     * @return JobStatus 任务状态。WAIT：等待中，RUN：执行中，FAIL：任务失败，DONE：任务成功
     */
    public String getJobStatus() {
        return this.JobStatus;
    }

    /**
     * Set 任务状态。WAIT：等待中，RUN：执行中，FAIL：任务失败，DONE：任务成功
     * @param JobStatus 任务状态。WAIT：等待中，RUN：执行中，FAIL：任务失败，DONE：任务成功
     */
    public void setJobStatus(String JobStatus) {
        this.JobStatus = JobStatus;
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

    public DescribeMarkEssayAgentJobResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMarkEssayAgentJobResponse(DescribeMarkEssayAgentJobResponse source) {
        if (source.Angle != null) {
            this.Angle = new Float(source.Angle);
        }
        if (source.SentenceSuggests != null) {
            this.SentenceSuggests = new MarkEssaySuggestions[source.SentenceSuggests.length];
            for (int i = 0; i < source.SentenceSuggests.length; i++) {
                this.SentenceSuggests[i] = new MarkEssaySuggestions(source.SentenceSuggests[i]);
            }
        }
        if (source.ErrorCode != null) {
            this.ErrorCode = new String(source.ErrorCode);
        }
        if (source.ErrorMessage != null) {
            this.ErrorMessage = new String(source.ErrorMessage);
        }
        if (source.JobStatus != null) {
            this.JobStatus = new String(source.JobStatus);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Angle", this.Angle);
        this.setParamArrayObj(map, prefix + "SentenceSuggests.", this.SentenceSuggests);
        this.setParamSimple(map, prefix + "ErrorCode", this.ErrorCode);
        this.setParamSimple(map, prefix + "ErrorMessage", this.ErrorMessage);
        this.setParamSimple(map, prefix + "JobStatus", this.JobStatus);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

