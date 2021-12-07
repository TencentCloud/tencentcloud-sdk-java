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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCompliancePolicyItemAffectedSummaryResponse extends AbstractModel{

    /**
    * 返回各检测项影响的资产的汇总信息。
    */
    @SerializedName("PolicyItemSummary")
    @Expose
    private CompliancePolicyItemSummary PolicyItemSummary;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 返回各检测项影响的资产的汇总信息。 
     * @return PolicyItemSummary 返回各检测项影响的资产的汇总信息。
     */
    public CompliancePolicyItemSummary getPolicyItemSummary() {
        return this.PolicyItemSummary;
    }

    /**
     * Set 返回各检测项影响的资产的汇总信息。
     * @param PolicyItemSummary 返回各检测项影响的资产的汇总信息。
     */
    public void setPolicyItemSummary(CompliancePolicyItemSummary PolicyItemSummary) {
        this.PolicyItemSummary = PolicyItemSummary;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeCompliancePolicyItemAffectedSummaryResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCompliancePolicyItemAffectedSummaryResponse(DescribeCompliancePolicyItemAffectedSummaryResponse source) {
        if (source.PolicyItemSummary != null) {
            this.PolicyItemSummary = new CompliancePolicyItemSummary(source.PolicyItemSummary);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "PolicyItemSummary.", this.PolicyItemSummary);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

