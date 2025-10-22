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
    * 审校任务状态：

- Success: 成功
- Processing: 处理中，请等待
- Failed: 失败
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 大模型审校结果
    */
    @SerializedName("ModerationResult")
    @Expose
    private String ModerationResult;

    /**
    * 审校任务失败原因，仅当任务失败时有值
    */
    @SerializedName("FailureReason")
    @Expose
    private String FailureReason;

    /**
    * 审校任务开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 本次检测的违规点列表
    */
    @SerializedName("ReviewedLabels")
    @Expose
    private String [] ReviewedLabels;

    /**
    * 违规明细
    */
    @SerializedName("Details")
    @Expose
    private FinancialLLMViolationDetail [] Details;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 审校任务状态：

- Success: 成功
- Processing: 处理中，请等待
- Failed: 失败 
     * @return Status 审校任务状态：

- Success: 成功
- Processing: 处理中，请等待
- Failed: 失败
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 审校任务状态：

- Success: 成功
- Processing: 处理中，请等待
- Failed: 失败
     * @param Status 审校任务状态：

- Success: 成功
- Processing: 处理中，请等待
- Failed: 失败
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 大模型审校结果 
     * @return ModerationResult 大模型审校结果
     */
    public String getModerationResult() {
        return this.ModerationResult;
    }

    /**
     * Set 大模型审校结果
     * @param ModerationResult 大模型审校结果
     */
    public void setModerationResult(String ModerationResult) {
        this.ModerationResult = ModerationResult;
    }

    /**
     * Get 审校任务失败原因，仅当任务失败时有值 
     * @return FailureReason 审校任务失败原因，仅当任务失败时有值
     */
    public String getFailureReason() {
        return this.FailureReason;
    }

    /**
     * Set 审校任务失败原因，仅当任务失败时有值
     * @param FailureReason 审校任务失败原因，仅当任务失败时有值
     */
    public void setFailureReason(String FailureReason) {
        this.FailureReason = FailureReason;
    }

    /**
     * Get 审校任务开始时间 
     * @return StartTime 审校任务开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 审校任务开始时间
     * @param StartTime 审校任务开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
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
     * Get 违规明细 
     * @return Details 违规明细
     */
    public FinancialLLMViolationDetail [] getDetails() {
        return this.Details;
    }

    /**
     * Set 违规明细
     * @param Details 违规明细
     */
    public void setDetails(FinancialLLMViolationDetail [] Details) {
        this.Details = Details;
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
        if (source.ModerationResult != null) {
            this.ModerationResult = new String(source.ModerationResult);
        }
        if (source.FailureReason != null) {
            this.FailureReason = new String(source.FailureReason);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.ReviewedLabels != null) {
            this.ReviewedLabels = new String[source.ReviewedLabels.length];
            for (int i = 0; i < source.ReviewedLabels.length; i++) {
                this.ReviewedLabels[i] = new String(source.ReviewedLabels[i]);
            }
        }
        if (source.Details != null) {
            this.Details = new FinancialLLMViolationDetail[source.Details.length];
            for (int i = 0; i < source.Details.length; i++) {
                this.Details[i] = new FinancialLLMViolationDetail(source.Details[i]);
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
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ModerationResult", this.ModerationResult);
        this.setParamSimple(map, prefix + "FailureReason", this.FailureReason);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamArraySimple(map, prefix + "ReviewedLabels.", this.ReviewedLabels);
        this.setParamArrayObj(map, prefix + "Details.", this.Details);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

