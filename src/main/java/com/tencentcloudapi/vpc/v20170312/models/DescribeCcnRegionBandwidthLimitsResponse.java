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

public class DescribeCcnRegionBandwidthLimitsResponse extends AbstractModel {

    /**
    * 云联网（CCN）各地域出带宽上限
    */
    @SerializedName("CcnRegionBandwidthLimitSet")
    @Expose
    private CcnRegionBandwidthLimit [] CcnRegionBandwidthLimitSet;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 云联网（CCN）各地域出带宽上限 
     * @return CcnRegionBandwidthLimitSet 云联网（CCN）各地域出带宽上限
     */
    public CcnRegionBandwidthLimit [] getCcnRegionBandwidthLimitSet() {
        return this.CcnRegionBandwidthLimitSet;
    }

    /**
     * Set 云联网（CCN）各地域出带宽上限
     * @param CcnRegionBandwidthLimitSet 云联网（CCN）各地域出带宽上限
     */
    public void setCcnRegionBandwidthLimitSet(CcnRegionBandwidthLimit [] CcnRegionBandwidthLimitSet) {
        this.CcnRegionBandwidthLimitSet = CcnRegionBandwidthLimitSet;
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

    public DescribeCcnRegionBandwidthLimitsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCcnRegionBandwidthLimitsResponse(DescribeCcnRegionBandwidthLimitsResponse source) {
        if (source.CcnRegionBandwidthLimitSet != null) {
            this.CcnRegionBandwidthLimitSet = new CcnRegionBandwidthLimit[source.CcnRegionBandwidthLimitSet.length];
            for (int i = 0; i < source.CcnRegionBandwidthLimitSet.length; i++) {
                this.CcnRegionBandwidthLimitSet[i] = new CcnRegionBandwidthLimit(source.CcnRegionBandwidthLimitSet[i]);
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
        this.setParamArrayObj(map, prefix + "CcnRegionBandwidthLimitSet.", this.CcnRegionBandwidthLimitSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

