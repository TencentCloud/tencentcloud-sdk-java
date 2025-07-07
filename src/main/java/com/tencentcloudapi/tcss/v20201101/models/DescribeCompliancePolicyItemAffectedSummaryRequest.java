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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCompliancePolicyItemAffectedSummaryRequest extends AbstractModel {

    /**
    * DescribeComplianceTaskPolicyItemSummaryList返回的CustomerPolicyItemId，表示检测项的ID。
    */
    @SerializedName("CustomerPolicyItemId")
    @Expose
    private Long CustomerPolicyItemId;

    /**
     * Get DescribeComplianceTaskPolicyItemSummaryList返回的CustomerPolicyItemId，表示检测项的ID。 
     * @return CustomerPolicyItemId DescribeComplianceTaskPolicyItemSummaryList返回的CustomerPolicyItemId，表示检测项的ID。
     */
    public Long getCustomerPolicyItemId() {
        return this.CustomerPolicyItemId;
    }

    /**
     * Set DescribeComplianceTaskPolicyItemSummaryList返回的CustomerPolicyItemId，表示检测项的ID。
     * @param CustomerPolicyItemId DescribeComplianceTaskPolicyItemSummaryList返回的CustomerPolicyItemId，表示检测项的ID。
     */
    public void setCustomerPolicyItemId(Long CustomerPolicyItemId) {
        this.CustomerPolicyItemId = CustomerPolicyItemId;
    }

    public DescribeCompliancePolicyItemAffectedSummaryRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCompliancePolicyItemAffectedSummaryRequest(DescribeCompliancePolicyItemAffectedSummaryRequest source) {
        if (source.CustomerPolicyItemId != null) {
            this.CustomerPolicyItemId = new Long(source.CustomerPolicyItemId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CustomerPolicyItemId", this.CustomerPolicyItemId);

    }
}

