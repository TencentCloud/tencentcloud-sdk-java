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

public class DescribeDSPAAssessmentProcessingRiskOverviewResponse extends AbstractModel {

    /**
    * 待处理的风险数
    */
    @SerializedName("ProcessingRiskCount")
    @Expose
    private Long ProcessingRiskCount;

    /**
    * 受影响的资产数
    */
    @SerializedName("AffectedAssetCount")
    @Expose
    private Long AffectedAssetCount;

    /**
    * 周同比
    */
    @SerializedName("WeekRatio")
    @Expose
    private Float WeekRatio;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 待处理的风险数 
     * @return ProcessingRiskCount 待处理的风险数
     */
    public Long getProcessingRiskCount() {
        return this.ProcessingRiskCount;
    }

    /**
     * Set 待处理的风险数
     * @param ProcessingRiskCount 待处理的风险数
     */
    public void setProcessingRiskCount(Long ProcessingRiskCount) {
        this.ProcessingRiskCount = ProcessingRiskCount;
    }

    /**
     * Get 受影响的资产数 
     * @return AffectedAssetCount 受影响的资产数
     */
    public Long getAffectedAssetCount() {
        return this.AffectedAssetCount;
    }

    /**
     * Set 受影响的资产数
     * @param AffectedAssetCount 受影响的资产数
     */
    public void setAffectedAssetCount(Long AffectedAssetCount) {
        this.AffectedAssetCount = AffectedAssetCount;
    }

    /**
     * Get 周同比 
     * @return WeekRatio 周同比
     */
    public Float getWeekRatio() {
        return this.WeekRatio;
    }

    /**
     * Set 周同比
     * @param WeekRatio 周同比
     */
    public void setWeekRatio(Float WeekRatio) {
        this.WeekRatio = WeekRatio;
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

    public DescribeDSPAAssessmentProcessingRiskOverviewResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDSPAAssessmentProcessingRiskOverviewResponse(DescribeDSPAAssessmentProcessingRiskOverviewResponse source) {
        if (source.ProcessingRiskCount != null) {
            this.ProcessingRiskCount = new Long(source.ProcessingRiskCount);
        }
        if (source.AffectedAssetCount != null) {
            this.AffectedAssetCount = new Long(source.AffectedAssetCount);
        }
        if (source.WeekRatio != null) {
            this.WeekRatio = new Float(source.WeekRatio);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProcessingRiskCount", this.ProcessingRiskCount);
        this.setParamSimple(map, prefix + "AffectedAssetCount", this.AffectedAssetCount);
        this.setParamSimple(map, prefix + "WeekRatio", this.WeekRatio);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

