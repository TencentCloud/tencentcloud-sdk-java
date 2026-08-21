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

public class DescribeSecurityRiskTrendResponse extends AbstractModel {

    /**
    * <p>按维度分组的趋势数据</p>
    */
    @SerializedName("TrendData")
    @Expose
    private DimensionTrendData [] TrendData;

    /**
    * <p>最后一天风险摘要（告警 + 适用漏洞项）</p>
    */
    @SerializedName("RiskItems")
    @Expose
    private RiskTrendItem [] RiskItems;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>按维度分组的趋势数据</p> 
     * @return TrendData <p>按维度分组的趋势数据</p>
     */
    public DimensionTrendData [] getTrendData() {
        return this.TrendData;
    }

    /**
     * Set <p>按维度分组的趋势数据</p>
     * @param TrendData <p>按维度分组的趋势数据</p>
     */
    public void setTrendData(DimensionTrendData [] TrendData) {
        this.TrendData = TrendData;
    }

    /**
     * Get <p>最后一天风险摘要（告警 + 适用漏洞项）</p> 
     * @return RiskItems <p>最后一天风险摘要（告警 + 适用漏洞项）</p>
     */
    public RiskTrendItem [] getRiskItems() {
        return this.RiskItems;
    }

    /**
     * Set <p>最后一天风险摘要（告警 + 适用漏洞项）</p>
     * @param RiskItems <p>最后一天风险摘要（告警 + 适用漏洞项）</p>
     */
    public void setRiskItems(RiskTrendItem [] RiskItems) {
        this.RiskItems = RiskItems;
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

    public DescribeSecurityRiskTrendResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSecurityRiskTrendResponse(DescribeSecurityRiskTrendResponse source) {
        if (source.TrendData != null) {
            this.TrendData = new DimensionTrendData[source.TrendData.length];
            for (int i = 0; i < source.TrendData.length; i++) {
                this.TrendData[i] = new DimensionTrendData(source.TrendData[i]);
            }
        }
        if (source.RiskItems != null) {
            this.RiskItems = new RiskTrendItem[source.RiskItems.length];
            for (int i = 0; i < source.RiskItems.length; i++) {
                this.RiskItems[i] = new RiskTrendItem(source.RiskItems[i]);
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
        this.setParamArrayObj(map, prefix + "TrendData.", this.TrendData);
        this.setParamArrayObj(map, prefix + "RiskItems.", this.RiskItems);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

