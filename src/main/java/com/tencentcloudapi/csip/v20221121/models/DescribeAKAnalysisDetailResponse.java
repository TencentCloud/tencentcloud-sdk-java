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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAKAnalysisDetailResponse extends AbstractModel {

    /**
    * 告警AI分析状态 -1 分析失败 0 未分析 1 分析中 2 分析成功，真实告警 3 分析成功，可疑告警
    */
    @SerializedName("AIStatus")
    @Expose
    private Long AIStatus;

    /**
    * AI分析任务ID
    */
    @SerializedName("AITaskID")
    @Expose
    private String AITaskID;

    /**
    * 告警AI分析结果，base64格式，避免数据被拦截
    */
    @SerializedName("AIResult")
    @Expose
    private String AIResult;

    /**
    * 反馈建议
    */
    @SerializedName("Feedback")
    @Expose
    private String Feedback;

    /**
    * 反馈状态  0表示没有反馈，1表示认可，2表示不认可
    */
    @SerializedName("FeedbackResult")
    @Expose
    private Long FeedbackResult;

    /**
    * 失败原因
    */
    @SerializedName("FailedReason")
    @Expose
    private String FailedReason;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 告警AI分析状态 -1 分析失败 0 未分析 1 分析中 2 分析成功，真实告警 3 分析成功，可疑告警 
     * @return AIStatus 告警AI分析状态 -1 分析失败 0 未分析 1 分析中 2 分析成功，真实告警 3 分析成功，可疑告警
     */
    public Long getAIStatus() {
        return this.AIStatus;
    }

    /**
     * Set 告警AI分析状态 -1 分析失败 0 未分析 1 分析中 2 分析成功，真实告警 3 分析成功，可疑告警
     * @param AIStatus 告警AI分析状态 -1 分析失败 0 未分析 1 分析中 2 分析成功，真实告警 3 分析成功，可疑告警
     */
    public void setAIStatus(Long AIStatus) {
        this.AIStatus = AIStatus;
    }

    /**
     * Get AI分析任务ID 
     * @return AITaskID AI分析任务ID
     */
    public String getAITaskID() {
        return this.AITaskID;
    }

    /**
     * Set AI分析任务ID
     * @param AITaskID AI分析任务ID
     */
    public void setAITaskID(String AITaskID) {
        this.AITaskID = AITaskID;
    }

    /**
     * Get 告警AI分析结果，base64格式，避免数据被拦截 
     * @return AIResult 告警AI分析结果，base64格式，避免数据被拦截
     */
    public String getAIResult() {
        return this.AIResult;
    }

    /**
     * Set 告警AI分析结果，base64格式，避免数据被拦截
     * @param AIResult 告警AI分析结果，base64格式，避免数据被拦截
     */
    public void setAIResult(String AIResult) {
        this.AIResult = AIResult;
    }

    /**
     * Get 反馈建议 
     * @return Feedback 反馈建议
     */
    public String getFeedback() {
        return this.Feedback;
    }

    /**
     * Set 反馈建议
     * @param Feedback 反馈建议
     */
    public void setFeedback(String Feedback) {
        this.Feedback = Feedback;
    }

    /**
     * Get 反馈状态  0表示没有反馈，1表示认可，2表示不认可 
     * @return FeedbackResult 反馈状态  0表示没有反馈，1表示认可，2表示不认可
     */
    public Long getFeedbackResult() {
        return this.FeedbackResult;
    }

    /**
     * Set 反馈状态  0表示没有反馈，1表示认可，2表示不认可
     * @param FeedbackResult 反馈状态  0表示没有反馈，1表示认可，2表示不认可
     */
    public void setFeedbackResult(Long FeedbackResult) {
        this.FeedbackResult = FeedbackResult;
    }

    /**
     * Get 失败原因 
     * @return FailedReason 失败原因
     */
    public String getFailedReason() {
        return this.FailedReason;
    }

    /**
     * Set 失败原因
     * @param FailedReason 失败原因
     */
    public void setFailedReason(String FailedReason) {
        this.FailedReason = FailedReason;
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

    public DescribeAKAnalysisDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAKAnalysisDetailResponse(DescribeAKAnalysisDetailResponse source) {
        if (source.AIStatus != null) {
            this.AIStatus = new Long(source.AIStatus);
        }
        if (source.AITaskID != null) {
            this.AITaskID = new String(source.AITaskID);
        }
        if (source.AIResult != null) {
            this.AIResult = new String(source.AIResult);
        }
        if (source.Feedback != null) {
            this.Feedback = new String(source.Feedback);
        }
        if (source.FeedbackResult != null) {
            this.FeedbackResult = new Long(source.FeedbackResult);
        }
        if (source.FailedReason != null) {
            this.FailedReason = new String(source.FailedReason);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AIStatus", this.AIStatus);
        this.setParamSimple(map, prefix + "AITaskID", this.AITaskID);
        this.setParamSimple(map, prefix + "AIResult", this.AIResult);
        this.setParamSimple(map, prefix + "Feedback", this.Feedback);
        this.setParamSimple(map, prefix + "FeedbackResult", this.FeedbackResult);
        this.setParamSimple(map, prefix + "FailedReason", this.FailedReason);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

