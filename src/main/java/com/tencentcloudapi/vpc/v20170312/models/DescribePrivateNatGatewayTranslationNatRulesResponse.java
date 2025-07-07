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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePrivateNatGatewayTranslationNatRulesResponse extends AbstractModel {

    /**
    * 对象数目。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 转换规则详情数组。
    */
    @SerializedName("TranslationNatRuleSet")
    @Expose
    private TranslationNatRule [] TranslationNatRuleSet;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 对象数目。 
     * @return TotalCount 对象数目。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 对象数目。
     * @param TotalCount 对象数目。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 转换规则详情数组。 
     * @return TranslationNatRuleSet 转换规则详情数组。
     */
    public TranslationNatRule [] getTranslationNatRuleSet() {
        return this.TranslationNatRuleSet;
    }

    /**
     * Set 转换规则详情数组。
     * @param TranslationNatRuleSet 转换规则详情数组。
     */
    public void setTranslationNatRuleSet(TranslationNatRule [] TranslationNatRuleSet) {
        this.TranslationNatRuleSet = TranslationNatRuleSet;
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

    public DescribePrivateNatGatewayTranslationNatRulesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePrivateNatGatewayTranslationNatRulesResponse(DescribePrivateNatGatewayTranslationNatRulesResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.TranslationNatRuleSet != null) {
            this.TranslationNatRuleSet = new TranslationNatRule[source.TranslationNatRuleSet.length];
            for (int i = 0; i < source.TranslationNatRuleSet.length; i++) {
                this.TranslationNatRuleSet[i] = new TranslationNatRule(source.TranslationNatRuleSet[i]);
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
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "TranslationNatRuleSet.", this.TranslationNatRuleSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

