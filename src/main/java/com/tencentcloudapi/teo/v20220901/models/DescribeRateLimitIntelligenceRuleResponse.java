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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRateLimitIntelligenceRuleResponse extends AbstractModel{

    /**
    * 速率限制智能规则。
    */
    @SerializedName("RateLimitIntelligenceRuleDetails")
    @Expose
    private RateLimitIntelligenceRuleDetail [] RateLimitIntelligenceRuleDetails;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 速率限制智能规则。 
     * @return RateLimitIntelligenceRuleDetails 速率限制智能规则。
     */
    public RateLimitIntelligenceRuleDetail [] getRateLimitIntelligenceRuleDetails() {
        return this.RateLimitIntelligenceRuleDetails;
    }

    /**
     * Set 速率限制智能规则。
     * @param RateLimitIntelligenceRuleDetails 速率限制智能规则。
     */
    public void setRateLimitIntelligenceRuleDetails(RateLimitIntelligenceRuleDetail [] RateLimitIntelligenceRuleDetails) {
        this.RateLimitIntelligenceRuleDetails = RateLimitIntelligenceRuleDetails;
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

    public DescribeRateLimitIntelligenceRuleResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRateLimitIntelligenceRuleResponse(DescribeRateLimitIntelligenceRuleResponse source) {
        if (source.RateLimitIntelligenceRuleDetails != null) {
            this.RateLimitIntelligenceRuleDetails = new RateLimitIntelligenceRuleDetail[source.RateLimitIntelligenceRuleDetails.length];
            for (int i = 0; i < source.RateLimitIntelligenceRuleDetails.length; i++) {
                this.RateLimitIntelligenceRuleDetails[i] = new RateLimitIntelligenceRuleDetail(source.RateLimitIntelligenceRuleDetails[i]);
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
        this.setParamArrayObj(map, prefix + "RateLimitIntelligenceRuleDetails.", this.RateLimitIntelligenceRuleDetails);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

