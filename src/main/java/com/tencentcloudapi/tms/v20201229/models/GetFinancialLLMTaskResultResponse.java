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
package com.tencentcloudapi.tms.v20201229.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetFinancialLLMTaskResultResponse extends AbstractModel {

    /**
    * TaskId对应的任务的状态：
- Success: 任务已完成
- Processing: 任务进行中，建议10秒后再查询
- Failed: 任务失败

    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 该字段标识服务检测到的违规点，具体内容参阅数据结构[FinancialLLMViolationDetail](https://cloud.tencent.com/document/api/1124/51861#FinancialLLMViolationDetail)
    */
    @SerializedName("Details")
    @Expose
    private FinancialLLMViolationDetail [] Details;

    /**
    * 本次检测的违规点列表
    */
    @SerializedName("ReviewedLabels")
    @Expose
    private String [] ReviewedLabels;

    /**
    * 审校任务的开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 若审校任务失败（Status="Failed"），该字段返回失败的具体原因。
    */
    @SerializedName("FailureReason")
    @Expose
    private String FailureReason;

    /**
    * 该字段为历史结构字段，不再推荐使用。
    */
    @SerializedName("ModerationResult")
    @Expose
    private String ModerationResult;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get TaskId对应的任务的状态：
- Success: 任务已完成
- Processing: 任务进行中，建议10秒后再查询
- Failed: 任务失败
 
     * @return Status TaskId对应的任务的状态：
- Success: 任务已完成
- Processing: 任务进行中，建议10秒后再查询
- Failed: 任务失败

     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set TaskId对应的任务的状态：
- Success: 任务已完成
- Processing: 任务进行中，建议10秒后再查询
- Failed: 任务失败

     * @param Status TaskId对应的任务的状态：
- Success: 任务已完成
- Processing: 任务进行中，建议10秒后再查询
- Failed: 任务失败

     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 该字段标识服务检测到的违规点，具体内容参阅数据结构[FinancialLLMViolationDetail](https://cloud.tencent.com/document/api/1124/51861#FinancialLLMViolationDetail) 
     * @return Details 该字段标识服务检测到的违规点，具体内容参阅数据结构[FinancialLLMViolationDetail](https://cloud.tencent.com/document/api/1124/51861#FinancialLLMViolationDetail)
     */
    public FinancialLLMViolationDetail [] getDetails() {
        return this.Details;
    }

    /**
     * Set 该字段标识服务检测到的违规点，具体内容参阅数据结构[FinancialLLMViolationDetail](https://cloud.tencent.com/document/api/1124/51861#FinancialLLMViolationDetail)
     * @param Details 该字段标识服务检测到的违规点，具体内容参阅数据结构[FinancialLLMViolationDetail](https://cloud.tencent.com/document/api/1124/51861#FinancialLLMViolationDetail)
     */
    public void setDetails(FinancialLLMViolationDetail [] Details) {
        this.Details = Details;
    }

    /**
     * Get 本次检测的违规点列表 
     * @return ReviewedLabels 本次检测的违规点列表
     */
    public String [] getReviewedLabels() {
        return this.ReviewedLabels;
    }

    /**
     * Set 本次检测的违规点列表
     * @param ReviewedLabels 本次检测的违规点列表
     */
    public void setReviewedLabels(String [] ReviewedLabels) {
        this.ReviewedLabels = ReviewedLabels;
    }

    /**
     * Get 审校任务的开始时间 
     * @return StartTime 审校任务的开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 审校任务的开始时间
     * @param StartTime 审校任务的开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 若审校任务失败（Status="Failed"），该字段返回失败的具体原因。 
     * @return FailureReason 若审校任务失败（Status="Failed"），该字段返回失败的具体原因。
     */
    public String getFailureReason() {
        return this.FailureReason;
    }

    /**
     * Set 若审校任务失败（Status="Failed"），该字段返回失败的具体原因。
     * @param FailureReason 若审校任务失败（Status="Failed"），该字段返回失败的具体原因。
     */
    public void setFailureReason(String FailureReason) {
        this.FailureReason = FailureReason;
    }

    /**
     * Get 该字段为历史结构字段，不再推荐使用。 
     * @return ModerationResult 该字段为历史结构字段，不再推荐使用。
     */
    public String getModerationResult() {
        return this.ModerationResult;
    }

    /**
     * Set 该字段为历史结构字段，不再推荐使用。
     * @param ModerationResult 该字段为历史结构字段，不再推荐使用。
     */
    public void setModerationResult(String ModerationResult) {
        this.ModerationResult = ModerationResult;
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

    public GetFinancialLLMTaskResultResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetFinancialLLMTaskResultResponse(GetFinancialLLMTaskResultResponse source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Details != null) {
            this.Details = new FinancialLLMViolationDetail[source.Details.length];
            for (int i = 0; i < source.Details.length; i++) {
                this.Details[i] = new FinancialLLMViolationDetail(source.Details[i]);
            }
        }
        if (source.ReviewedLabels != null) {
            this.ReviewedLabels = new String[source.ReviewedLabels.length];
            for (int i = 0; i < source.ReviewedLabels.length; i++) {
                this.ReviewedLabels[i] = new String(source.ReviewedLabels[i]);
            }
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.FailureReason != null) {
            this.FailureReason = new String(source.FailureReason);
        }
        if (source.ModerationResult != null) {
            this.ModerationResult = new String(source.ModerationResult);
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
        this.setParamArrayObj(map, prefix + "Details.", this.Details);
        this.setParamArraySimple(map, prefix + "ReviewedLabels.", this.ReviewedLabels);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "FailureReason", this.FailureReason);
        this.setParamSimple(map, prefix + "ModerationResult", this.ModerationResult);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

