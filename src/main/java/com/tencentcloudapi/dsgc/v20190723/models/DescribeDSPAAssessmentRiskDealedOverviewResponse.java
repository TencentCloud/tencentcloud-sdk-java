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
package com.tencentcloudapi.dsgc.v20190723.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDSPAAssessmentRiskDealedOverviewResponse extends AbstractModel {

    /**
    * 遗留待处理风险总数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 昨日完成风险处置数
    */
    @SerializedName("YesterdayDealedCount")
    @Expose
    private Long YesterdayDealedCount;

    /**
    * 遗留待处理风险数周同比
    */
    @SerializedName("UnDealedRiskWeekRatio")
    @Expose
    private Float UnDealedRiskWeekRatio;

    /**
    * 遗留待处理风险数日环比
    */
    @SerializedName("UnDealedRiskDayRatio")
    @Expose
    private Float UnDealedRiskDayRatio;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 遗留待处理风险总数 
     * @return TotalCount 遗留待处理风险总数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 遗留待处理风险总数
     * @param TotalCount 遗留待处理风险总数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 昨日完成风险处置数 
     * @return YesterdayDealedCount 昨日完成风险处置数
     */
    public Long getYesterdayDealedCount() {
        return this.YesterdayDealedCount;
    }

    /**
     * Set 昨日完成风险处置数
     * @param YesterdayDealedCount 昨日完成风险处置数
     */
    public void setYesterdayDealedCount(Long YesterdayDealedCount) {
        this.YesterdayDealedCount = YesterdayDealedCount;
    }

    /**
     * Get 遗留待处理风险数周同比 
     * @return UnDealedRiskWeekRatio 遗留待处理风险数周同比
     */
    public Float getUnDealedRiskWeekRatio() {
        return this.UnDealedRiskWeekRatio;
    }

    /**
     * Set 遗留待处理风险数周同比
     * @param UnDealedRiskWeekRatio 遗留待处理风险数周同比
     */
    public void setUnDealedRiskWeekRatio(Float UnDealedRiskWeekRatio) {
        this.UnDealedRiskWeekRatio = UnDealedRiskWeekRatio;
    }

    /**
     * Get 遗留待处理风险数日环比 
     * @return UnDealedRiskDayRatio 遗留待处理风险数日环比
     */
    public Float getUnDealedRiskDayRatio() {
        return this.UnDealedRiskDayRatio;
    }

    /**
     * Set 遗留待处理风险数日环比
     * @param UnDealedRiskDayRatio 遗留待处理风险数日环比
     */
    public void setUnDealedRiskDayRatio(Float UnDealedRiskDayRatio) {
        this.UnDealedRiskDayRatio = UnDealedRiskDayRatio;
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

    public DescribeDSPAAssessmentRiskDealedOverviewResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDSPAAssessmentRiskDealedOverviewResponse(DescribeDSPAAssessmentRiskDealedOverviewResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.YesterdayDealedCount != null) {
            this.YesterdayDealedCount = new Long(source.YesterdayDealedCount);
        }
        if (source.UnDealedRiskWeekRatio != null) {
            this.UnDealedRiskWeekRatio = new Float(source.UnDealedRiskWeekRatio);
        }
        if (source.UnDealedRiskDayRatio != null) {
            this.UnDealedRiskDayRatio = new Float(source.UnDealedRiskDayRatio);
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
        this.setParamSimple(map, prefix + "YesterdayDealedCount", this.YesterdayDealedCount);
        this.setParamSimple(map, prefix + "UnDealedRiskWeekRatio", this.UnDealedRiskWeekRatio);
        this.setParamSimple(map, prefix + "UnDealedRiskDayRatio", this.UnDealedRiskDayRatio);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

