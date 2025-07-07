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
package com.tencentcloudapi.dsgc.v20190723.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDSPAAssessmentRiskDistributionOverviewResponse extends AbstractModel {

    /**
    * 风险类型分布
    */
    @SerializedName("RiskTypeDistribution")
    @Expose
    private Note [] RiskTypeDistribution;

    /**
    * 风险详情分布
    */
    @SerializedName("RiskDetailDistribution")
    @Expose
    private Note [] RiskDetailDistribution;

    /**
    * 风险资产详情
    */
    @SerializedName("RiskAssetsDistribution")
    @Expose
    private Note [] RiskAssetsDistribution;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 风险类型分布 
     * @return RiskTypeDistribution 风险类型分布
     */
    public Note [] getRiskTypeDistribution() {
        return this.RiskTypeDistribution;
    }

    /**
     * Set 风险类型分布
     * @param RiskTypeDistribution 风险类型分布
     */
    public void setRiskTypeDistribution(Note [] RiskTypeDistribution) {
        this.RiskTypeDistribution = RiskTypeDistribution;
    }

    /**
     * Get 风险详情分布 
     * @return RiskDetailDistribution 风险详情分布
     */
    public Note [] getRiskDetailDistribution() {
        return this.RiskDetailDistribution;
    }

    /**
     * Set 风险详情分布
     * @param RiskDetailDistribution 风险详情分布
     */
    public void setRiskDetailDistribution(Note [] RiskDetailDistribution) {
        this.RiskDetailDistribution = RiskDetailDistribution;
    }

    /**
     * Get 风险资产详情 
     * @return RiskAssetsDistribution 风险资产详情
     */
    public Note [] getRiskAssetsDistribution() {
        return this.RiskAssetsDistribution;
    }

    /**
     * Set 风险资产详情
     * @param RiskAssetsDistribution 风险资产详情
     */
    public void setRiskAssetsDistribution(Note [] RiskAssetsDistribution) {
        this.RiskAssetsDistribution = RiskAssetsDistribution;
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

    public DescribeDSPAAssessmentRiskDistributionOverviewResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDSPAAssessmentRiskDistributionOverviewResponse(DescribeDSPAAssessmentRiskDistributionOverviewResponse source) {
        if (source.RiskTypeDistribution != null) {
            this.RiskTypeDistribution = new Note[source.RiskTypeDistribution.length];
            for (int i = 0; i < source.RiskTypeDistribution.length; i++) {
                this.RiskTypeDistribution[i] = new Note(source.RiskTypeDistribution[i]);
            }
        }
        if (source.RiskDetailDistribution != null) {
            this.RiskDetailDistribution = new Note[source.RiskDetailDistribution.length];
            for (int i = 0; i < source.RiskDetailDistribution.length; i++) {
                this.RiskDetailDistribution[i] = new Note(source.RiskDetailDistribution[i]);
            }
        }
        if (source.RiskAssetsDistribution != null) {
            this.RiskAssetsDistribution = new Note[source.RiskAssetsDistribution.length];
            for (int i = 0; i < source.RiskAssetsDistribution.length; i++) {
                this.RiskAssetsDistribution[i] = new Note(source.RiskAssetsDistribution[i]);
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
        this.setParamArrayObj(map, prefix + "RiskTypeDistribution.", this.RiskTypeDistribution);
        this.setParamArrayObj(map, prefix + "RiskDetailDistribution.", this.RiskDetailDistribution);
        this.setParamArrayObj(map, prefix + "RiskAssetsDistribution.", this.RiskAssetsDistribution);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

