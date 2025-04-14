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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBandwidthPackageBandwidthRangeResponse extends AbstractModel {

    /**
    * 带宽包带宽上下限详细信息。ResourceId：带宽包id、BandwidthLowerLimit：带宽下限、BandwidthUpperLimit：带宽上限。
    */
    @SerializedName("BandwidthRangeSet")
    @Expose
    private BandwidthRange [] BandwidthRangeSet;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 带宽包带宽上下限详细信息。ResourceId：带宽包id、BandwidthLowerLimit：带宽下限、BandwidthUpperLimit：带宽上限。 
     * @return BandwidthRangeSet 带宽包带宽上下限详细信息。ResourceId：带宽包id、BandwidthLowerLimit：带宽下限、BandwidthUpperLimit：带宽上限。
     */
    public BandwidthRange [] getBandwidthRangeSet() {
        return this.BandwidthRangeSet;
    }

    /**
     * Set 带宽包带宽上下限详细信息。ResourceId：带宽包id、BandwidthLowerLimit：带宽下限、BandwidthUpperLimit：带宽上限。
     * @param BandwidthRangeSet 带宽包带宽上下限详细信息。ResourceId：带宽包id、BandwidthLowerLimit：带宽下限、BandwidthUpperLimit：带宽上限。
     */
    public void setBandwidthRangeSet(BandwidthRange [] BandwidthRangeSet) {
        this.BandwidthRangeSet = BandwidthRangeSet;
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

    public DescribeBandwidthPackageBandwidthRangeResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBandwidthPackageBandwidthRangeResponse(DescribeBandwidthPackageBandwidthRangeResponse source) {
        if (source.BandwidthRangeSet != null) {
            this.BandwidthRangeSet = new BandwidthRange[source.BandwidthRangeSet.length];
            for (int i = 0; i < source.BandwidthRangeSet.length; i++) {
                this.BandwidthRangeSet[i] = new BandwidthRange(source.BandwidthRangeSet[i]);
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
        this.setParamArrayObj(map, prefix + "BandwidthRangeSet.", this.BandwidthRangeSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

