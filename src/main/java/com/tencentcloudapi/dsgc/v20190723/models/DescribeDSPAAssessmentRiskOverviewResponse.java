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

public class DescribeDSPAAssessmentRiskOverviewResponse extends AbstractModel {

    /**
    * 风险总数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 高危风险数
    */
    @SerializedName("HighRiskCount")
    @Expose
    private Long HighRiskCount;

    /**
    * 周同比
    */
    @SerializedName("HighRiskWeekRatio")
    @Expose
    private Float HighRiskWeekRatio;

    /**
    * 高危风险数日环比
    */
    @SerializedName("HighRiskDayRatio")
    @Expose
    private Float HighRiskDayRatio;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 风险总数 
     * @return TotalCount 风险总数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 风险总数
     * @param TotalCount 风险总数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 高危风险数 
     * @return HighRiskCount 高危风险数
     */
    public Long getHighRiskCount() {
        return this.HighRiskCount;
    }

    /**
     * Set 高危风险数
     * @param HighRiskCount 高危风险数
     */
    public void setHighRiskCount(Long HighRiskCount) {
        this.HighRiskCount = HighRiskCount;
    }

    /**
     * Get 周同比 
     * @return HighRiskWeekRatio 周同比
     */
    public Float getHighRiskWeekRatio() {
        return this.HighRiskWeekRatio;
    }

    /**
     * Set 周同比
     * @param HighRiskWeekRatio 周同比
     */
    public void setHighRiskWeekRatio(Float HighRiskWeekRatio) {
        this.HighRiskWeekRatio = HighRiskWeekRatio;
    }

    /**
     * Get 高危风险数日环比 
     * @return HighRiskDayRatio 高危风险数日环比
     */
    public Float getHighRiskDayRatio() {
        return this.HighRiskDayRatio;
    }

    /**
     * Set 高危风险数日环比
     * @param HighRiskDayRatio 高危风险数日环比
     */
    public void setHighRiskDayRatio(Float HighRiskDayRatio) {
        this.HighRiskDayRatio = HighRiskDayRatio;
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

    public DescribeDSPAAssessmentRiskOverviewResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDSPAAssessmentRiskOverviewResponse(DescribeDSPAAssessmentRiskOverviewResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.HighRiskCount != null) {
            this.HighRiskCount = new Long(source.HighRiskCount);
        }
        if (source.HighRiskWeekRatio != null) {
            this.HighRiskWeekRatio = new Float(source.HighRiskWeekRatio);
        }
        if (source.HighRiskDayRatio != null) {
            this.HighRiskDayRatio = new Float(source.HighRiskDayRatio);
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
        this.setParamSimple(map, prefix + "HighRiskCount", this.HighRiskCount);
        this.setParamSimple(map, prefix + "HighRiskWeekRatio", this.HighRiskWeekRatio);
        this.setParamSimple(map, prefix + "HighRiskDayRatio", this.HighRiskDayRatio);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

