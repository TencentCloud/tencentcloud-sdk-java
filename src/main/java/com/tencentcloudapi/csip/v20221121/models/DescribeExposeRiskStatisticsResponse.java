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

public class DescribeExposeRiskStatisticsResponse extends AbstractModel {

    /**
    * 云边界风险待治理风险
    */
    @SerializedName("ExposureRiskStatistics")
    @Expose
    private DescribeExposureStatisticsItem [] ExposureRiskStatistics;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 云边界风险待治理风险 
     * @return ExposureRiskStatistics 云边界风险待治理风险
     */
    public DescribeExposureStatisticsItem [] getExposureRiskStatistics() {
        return this.ExposureRiskStatistics;
    }

    /**
     * Set 云边界风险待治理风险
     * @param ExposureRiskStatistics 云边界风险待治理风险
     */
    public void setExposureRiskStatistics(DescribeExposureStatisticsItem [] ExposureRiskStatistics) {
        this.ExposureRiskStatistics = ExposureRiskStatistics;
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

    public DescribeExposeRiskStatisticsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeExposeRiskStatisticsResponse(DescribeExposeRiskStatisticsResponse source) {
        if (source.ExposureRiskStatistics != null) {
            this.ExposureRiskStatistics = new DescribeExposureStatisticsItem[source.ExposureRiskStatistics.length];
            for (int i = 0; i < source.ExposureRiskStatistics.length; i++) {
                this.ExposureRiskStatistics[i] = new DescribeExposureStatisticsItem(source.ExposureRiskStatistics[i]);
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
        this.setParamArrayObj(map, prefix + "ExposureRiskStatistics.", this.ExposureRiskStatistics);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

