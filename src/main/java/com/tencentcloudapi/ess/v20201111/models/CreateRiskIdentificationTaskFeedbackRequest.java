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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateRiskIdentificationTaskFeedbackRequest extends AbstractModel {

    /**
    * 执行合同审查任务的员工信息。
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * 合同审查风险结果ID，取值如下：

- 反馈风险项结果。该参数通过调用接口[获取合同审查任务详情](https://qian.tencent.com/developers/companyApis/%E5%90%88%E5%90%8C%E6%99%BA%E8%83%BD%E7%9B%B8%E5%85%B3%E6%8E%A5%E5%8F%A3/DescribeContractReviewTask)获取（取Risks.RiskId值）。

- 反馈通过项结果。该参数通过调用接口[获取合同审查任务详情](https://qian.tencent.com/developers/companyApis/%E5%90%88%E5%90%8C%E6%99%BA%E8%83%BD%E7%9B%B8%E5%85%B3%E6%8E%A5%E5%8F%A3/DescribeContractReviewTask)获取（取ApprovedLists.RiskId值）
    */
    @SerializedName("RiskId")
    @Expose
    private String RiskId;

    /**
    * 反馈结果

- 1: 其他错误
- 2: 审查错误
- 3: 审查正确
    */
    @SerializedName("FeedbackResult")
    @Expose
    private Long FeedbackResult;

    /**
    * 审查反馈原因
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
     * Get 执行合同审查任务的员工信息。 
     * @return Operator 执行合同审查任务的员工信息。
     */
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set 执行合同审查任务的员工信息。
     * @param Operator 执行合同审查任务的员工信息。
     */
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 合同审查风险结果ID，取值如下：

- 反馈风险项结果。该参数通过调用接口[获取合同审查任务详情](https://qian.tencent.com/developers/companyApis/%E5%90%88%E5%90%8C%E6%99%BA%E8%83%BD%E7%9B%B8%E5%85%B3%E6%8E%A5%E5%8F%A3/DescribeContractReviewTask)获取（取Risks.RiskId值）。

- 反馈通过项结果。该参数通过调用接口[获取合同审查任务详情](https://qian.tencent.com/developers/companyApis/%E5%90%88%E5%90%8C%E6%99%BA%E8%83%BD%E7%9B%B8%E5%85%B3%E6%8E%A5%E5%8F%A3/DescribeContractReviewTask)获取（取ApprovedLists.RiskId值） 
     * @return RiskId 合同审查风险结果ID，取值如下：

- 反馈风险项结果。该参数通过调用接口[获取合同审查任务详情](https://qian.tencent.com/developers/companyApis/%E5%90%88%E5%90%8C%E6%99%BA%E8%83%BD%E7%9B%B8%E5%85%B3%E6%8E%A5%E5%8F%A3/DescribeContractReviewTask)获取（取Risks.RiskId值）。

- 反馈通过项结果。该参数通过调用接口[获取合同审查任务详情](https://qian.tencent.com/developers/companyApis/%E5%90%88%E5%90%8C%E6%99%BA%E8%83%BD%E7%9B%B8%E5%85%B3%E6%8E%A5%E5%8F%A3/DescribeContractReviewTask)获取（取ApprovedLists.RiskId值）
     */
    public String getRiskId() {
        return this.RiskId;
    }

    /**
     * Set 合同审查风险结果ID，取值如下：

- 反馈风险项结果。该参数通过调用接口[获取合同审查任务详情](https://qian.tencent.com/developers/companyApis/%E5%90%88%E5%90%8C%E6%99%BA%E8%83%BD%E7%9B%B8%E5%85%B3%E6%8E%A5%E5%8F%A3/DescribeContractReviewTask)获取（取Risks.RiskId值）。

- 反馈通过项结果。该参数通过调用接口[获取合同审查任务详情](https://qian.tencent.com/developers/companyApis/%E5%90%88%E5%90%8C%E6%99%BA%E8%83%BD%E7%9B%B8%E5%85%B3%E6%8E%A5%E5%8F%A3/DescribeContractReviewTask)获取（取ApprovedLists.RiskId值）
     * @param RiskId 合同审查风险结果ID，取值如下：

- 反馈风险项结果。该参数通过调用接口[获取合同审查任务详情](https://qian.tencent.com/developers/companyApis/%E5%90%88%E5%90%8C%E6%99%BA%E8%83%BD%E7%9B%B8%E5%85%B3%E6%8E%A5%E5%8F%A3/DescribeContractReviewTask)获取（取Risks.RiskId值）。

- 反馈通过项结果。该参数通过调用接口[获取合同审查任务详情](https://qian.tencent.com/developers/companyApis/%E5%90%88%E5%90%8C%E6%99%BA%E8%83%BD%E7%9B%B8%E5%85%B3%E6%8E%A5%E5%8F%A3/DescribeContractReviewTask)获取（取ApprovedLists.RiskId值）
     */
    public void setRiskId(String RiskId) {
        this.RiskId = RiskId;
    }

    /**
     * Get 反馈结果

- 1: 其他错误
- 2: 审查错误
- 3: 审查正确 
     * @return FeedbackResult 反馈结果

- 1: 其他错误
- 2: 审查错误
- 3: 审查正确
     */
    public Long getFeedbackResult() {
        return this.FeedbackResult;
    }

    /**
     * Set 反馈结果

- 1: 其他错误
- 2: 审查错误
- 3: 审查正确
     * @param FeedbackResult 反馈结果

- 1: 其他错误
- 2: 审查错误
- 3: 审查正确
     */
    public void setFeedbackResult(Long FeedbackResult) {
        this.FeedbackResult = FeedbackResult;
    }

    /**
     * Get 审查反馈原因 
     * @return Reason 审查反馈原因
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set 审查反馈原因
     * @param Reason 审查反馈原因
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    public CreateRiskIdentificationTaskFeedbackRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateRiskIdentificationTaskFeedbackRequest(CreateRiskIdentificationTaskFeedbackRequest source) {
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
        if (source.RiskId != null) {
            this.RiskId = new String(source.RiskId);
        }
        if (source.FeedbackResult != null) {
            this.FeedbackResult = new Long(source.FeedbackResult);
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Operator.", this.Operator);
        this.setParamSimple(map, prefix + "RiskId", this.RiskId);
        this.setParamSimple(map, prefix + "FeedbackResult", this.FeedbackResult);
        this.setParamSimple(map, prefix + "Reason", this.Reason);

    }
}

