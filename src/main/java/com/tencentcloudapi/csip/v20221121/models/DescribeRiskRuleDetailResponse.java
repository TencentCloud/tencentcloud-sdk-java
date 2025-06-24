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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRiskRuleDetailResponse extends AbstractModel {

    /**
    * 风险规则ID
    */
    @SerializedName("RiskRuleId")
    @Expose
    private String RiskRuleId;

    /**
    * 云厂商
    */
    @SerializedName("Provider")
    @Expose
    private String Provider;

    /**
    * 风险名称
    */
    @SerializedName("RiskName")
    @Expose
    private String RiskName;

    /**
    * 风险危害
    */
    @SerializedName("RiskInfluence")
    @Expose
    private String RiskInfluence;

    /**
    * 修复指引
    */
    @SerializedName("RiskFixAdvice")
    @Expose
    private String RiskFixAdvice;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 风险规则ID 
     * @return RiskRuleId 风险规则ID
     */
    public String getRiskRuleId() {
        return this.RiskRuleId;
    }

    /**
     * Set 风险规则ID
     * @param RiskRuleId 风险规则ID
     */
    public void setRiskRuleId(String RiskRuleId) {
        this.RiskRuleId = RiskRuleId;
    }

    /**
     * Get 云厂商 
     * @return Provider 云厂商
     */
    public String getProvider() {
        return this.Provider;
    }

    /**
     * Set 云厂商
     * @param Provider 云厂商
     */
    public void setProvider(String Provider) {
        this.Provider = Provider;
    }

    /**
     * Get 风险名称 
     * @return RiskName 风险名称
     */
    public String getRiskName() {
        return this.RiskName;
    }

    /**
     * Set 风险名称
     * @param RiskName 风险名称
     */
    public void setRiskName(String RiskName) {
        this.RiskName = RiskName;
    }

    /**
     * Get 风险危害 
     * @return RiskInfluence 风险危害
     */
    public String getRiskInfluence() {
        return this.RiskInfluence;
    }

    /**
     * Set 风险危害
     * @param RiskInfluence 风险危害
     */
    public void setRiskInfluence(String RiskInfluence) {
        this.RiskInfluence = RiskInfluence;
    }

    /**
     * Get 修复指引 
     * @return RiskFixAdvice 修复指引
     */
    public String getRiskFixAdvice() {
        return this.RiskFixAdvice;
    }

    /**
     * Set 修复指引
     * @param RiskFixAdvice 修复指引
     */
    public void setRiskFixAdvice(String RiskFixAdvice) {
        this.RiskFixAdvice = RiskFixAdvice;
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

    public DescribeRiskRuleDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRiskRuleDetailResponse(DescribeRiskRuleDetailResponse source) {
        if (source.RiskRuleId != null) {
            this.RiskRuleId = new String(source.RiskRuleId);
        }
        if (source.Provider != null) {
            this.Provider = new String(source.Provider);
        }
        if (source.RiskName != null) {
            this.RiskName = new String(source.RiskName);
        }
        if (source.RiskInfluence != null) {
            this.RiskInfluence = new String(source.RiskInfluence);
        }
        if (source.RiskFixAdvice != null) {
            this.RiskFixAdvice = new String(source.RiskFixAdvice);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RiskRuleId", this.RiskRuleId);
        this.setParamSimple(map, prefix + "Provider", this.Provider);
        this.setParamSimple(map, prefix + "RiskName", this.RiskName);
        this.setParamSimple(map, prefix + "RiskInfluence", this.RiskInfluence);
        this.setParamSimple(map, prefix + "RiskFixAdvice", this.RiskFixAdvice);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

