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

public class RiskIdentificationFeedbackInfo extends AbstractModel {

    /**
    * 审查结果ID
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
    * 反馈原因
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
     * Get 审查结果ID 
     * @return RiskId 审查结果ID
     */
    public String getRiskId() {
        return this.RiskId;
    }

    /**
     * Set 审查结果ID
     * @param RiskId 审查结果ID
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
     * Get 反馈原因 
     * @return Reason 反馈原因
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set 反馈原因
     * @param Reason 反馈原因
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    public RiskIdentificationFeedbackInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RiskIdentificationFeedbackInfo(RiskIdentificationFeedbackInfo source) {
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
        this.setParamSimple(map, prefix + "RiskId", this.RiskId);
        this.setParamSimple(map, prefix + "FeedbackResult", this.FeedbackResult);
        this.setParamSimple(map, prefix + "Reason", this.Reason);

    }
}

