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

public class DescribeCrossBorderComplianceResponse extends AbstractModel {

    /**
    * 合规化审批单列表。
    */
    @SerializedName("CrossBorderComplianceSet")
    @Expose
    private CrossBorderCompliance [] CrossBorderComplianceSet;

    /**
    * 合规化审批单总数。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 合规化审批单列表。 
     * @return CrossBorderComplianceSet 合规化审批单列表。
     */
    public CrossBorderCompliance [] getCrossBorderComplianceSet() {
        return this.CrossBorderComplianceSet;
    }

    /**
     * Set 合规化审批单列表。
     * @param CrossBorderComplianceSet 合规化审批单列表。
     */
    public void setCrossBorderComplianceSet(CrossBorderCompliance [] CrossBorderComplianceSet) {
        this.CrossBorderComplianceSet = CrossBorderComplianceSet;
    }

    /**
     * Get 合规化审批单总数。 
     * @return TotalCount 合规化审批单总数。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 合规化审批单总数。
     * @param TotalCount 合规化审批单总数。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
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

    public DescribeCrossBorderComplianceResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCrossBorderComplianceResponse(DescribeCrossBorderComplianceResponse source) {
        if (source.CrossBorderComplianceSet != null) {
            this.CrossBorderComplianceSet = new CrossBorderCompliance[source.CrossBorderComplianceSet.length];
            for (int i = 0; i < source.CrossBorderComplianceSet.length; i++) {
                this.CrossBorderComplianceSet[i] = new CrossBorderCompliance(source.CrossBorderComplianceSet[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "CrossBorderComplianceSet.", this.CrossBorderComplianceSet);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

