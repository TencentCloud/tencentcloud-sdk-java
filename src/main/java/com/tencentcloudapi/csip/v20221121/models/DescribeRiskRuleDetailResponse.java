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

public class DescribeRiskRuleDetailResponse extends AbstractModel {

    /**
    * <p>风险规则ID</p>
    */
    @SerializedName("RiskRuleId")
    @Expose
    private String RiskRuleId;

    /**
    * <p>云厂商</p>
    */
    @SerializedName("Provider")
    @Expose
    private String Provider;

    /**
    * <p>风险名称</p>
    */
    @SerializedName("RiskName")
    @Expose
    private String RiskName;

    /**
    * <p>风险危害</p>
    */
    @SerializedName("RiskInfluence")
    @Expose
    private String RiskInfluence;

    /**
    * <p>修复指引</p>
    */
    @SerializedName("RiskFixAdvice")
    @Expose
    private String RiskFixAdvice;

    /**
    * <p>资产类型</p>
    */
    @SerializedName("AssetType")
    @Expose
    private String AssetType;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>风险规则ID</p> 
     * @return RiskRuleId <p>风险规则ID</p>
     */
    public String getRiskRuleId() {
        return this.RiskRuleId;
    }

    /**
     * Set <p>风险规则ID</p>
     * @param RiskRuleId <p>风险规则ID</p>
     */
    public void setRiskRuleId(String RiskRuleId) {
        this.RiskRuleId = RiskRuleId;
    }

    /**
     * Get <p>云厂商</p> 
     * @return Provider <p>云厂商</p>
     */
    public String getProvider() {
        return this.Provider;
    }

    /**
     * Set <p>云厂商</p>
     * @param Provider <p>云厂商</p>
     */
    public void setProvider(String Provider) {
        this.Provider = Provider;
    }

    /**
     * Get <p>风险名称</p> 
     * @return RiskName <p>风险名称</p>
     */
    public String getRiskName() {
        return this.RiskName;
    }

    /**
     * Set <p>风险名称</p>
     * @param RiskName <p>风险名称</p>
     */
    public void setRiskName(String RiskName) {
        this.RiskName = RiskName;
    }

    /**
     * Get <p>风险危害</p> 
     * @return RiskInfluence <p>风险危害</p>
     */
    public String getRiskInfluence() {
        return this.RiskInfluence;
    }

    /**
     * Set <p>风险危害</p>
     * @param RiskInfluence <p>风险危害</p>
     */
    public void setRiskInfluence(String RiskInfluence) {
        this.RiskInfluence = RiskInfluence;
    }

    /**
     * Get <p>修复指引</p> 
     * @return RiskFixAdvice <p>修复指引</p>
     */
    public String getRiskFixAdvice() {
        return this.RiskFixAdvice;
    }

    /**
     * Set <p>修复指引</p>
     * @param RiskFixAdvice <p>修复指引</p>
     */
    public void setRiskFixAdvice(String RiskFixAdvice) {
        this.RiskFixAdvice = RiskFixAdvice;
    }

    /**
     * Get <p>资产类型</p> 
     * @return AssetType <p>资产类型</p>
     */
    public String getAssetType() {
        return this.AssetType;
    }

    /**
     * Set <p>资产类型</p>
     * @param AssetType <p>资产类型</p>
     */
    public void setAssetType(String AssetType) {
        this.AssetType = AssetType;
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
        if (source.AssetType != null) {
            this.AssetType = new String(source.AssetType);
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
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

