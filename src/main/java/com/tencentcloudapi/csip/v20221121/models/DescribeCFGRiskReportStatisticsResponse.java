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

public class DescribeCFGRiskReportStatisticsResponse extends AbstractModel {

    /**
    * <p>规则数量</p>
    */
    @SerializedName("TotalRuleCount")
    @Expose
    private Long TotalRuleCount;

    /**
    * <p>资产数量</p>
    */
    @SerializedName("TotalAssetCount")
    @Expose
    private Long TotalAssetCount;

    /**
    * <p>风险数量</p>
    */
    @SerializedName("TotalRiskCount")
    @Expose
    private Long TotalRiskCount;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>规则数量</p> 
     * @return TotalRuleCount <p>规则数量</p>
     */
    public Long getTotalRuleCount() {
        return this.TotalRuleCount;
    }

    /**
     * Set <p>规则数量</p>
     * @param TotalRuleCount <p>规则数量</p>
     */
    public void setTotalRuleCount(Long TotalRuleCount) {
        this.TotalRuleCount = TotalRuleCount;
    }

    /**
     * Get <p>资产数量</p> 
     * @return TotalAssetCount <p>资产数量</p>
     */
    public Long getTotalAssetCount() {
        return this.TotalAssetCount;
    }

    /**
     * Set <p>资产数量</p>
     * @param TotalAssetCount <p>资产数量</p>
     */
    public void setTotalAssetCount(Long TotalAssetCount) {
        this.TotalAssetCount = TotalAssetCount;
    }

    /**
     * Get <p>风险数量</p> 
     * @return TotalRiskCount <p>风险数量</p>
     */
    public Long getTotalRiskCount() {
        return this.TotalRiskCount;
    }

    /**
     * Set <p>风险数量</p>
     * @param TotalRiskCount <p>风险数量</p>
     */
    public void setTotalRiskCount(Long TotalRiskCount) {
        this.TotalRiskCount = TotalRiskCount;
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

    public DescribeCFGRiskReportStatisticsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCFGRiskReportStatisticsResponse(DescribeCFGRiskReportStatisticsResponse source) {
        if (source.TotalRuleCount != null) {
            this.TotalRuleCount = new Long(source.TotalRuleCount);
        }
        if (source.TotalAssetCount != null) {
            this.TotalAssetCount = new Long(source.TotalAssetCount);
        }
        if (source.TotalRiskCount != null) {
            this.TotalRiskCount = new Long(source.TotalRiskCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalRuleCount", this.TotalRuleCount);
        this.setParamSimple(map, prefix + "TotalAssetCount", this.TotalAssetCount);
        this.setParamSimple(map, prefix + "TotalRiskCount", this.TotalRiskCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

