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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTDEMSSEDistributionResponse extends AbstractModel {

    /**
    * <p>分布档。没有样本时为空数组。最后一档 Overflow 为 true 且省略 End。</p>
    */
    @SerializedName("Bins")
    @Expose
    private TDEMSSEDistributionBin [] Bins;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>分布档。没有样本时为空数组。最后一档 Overflow 为 true 且省略 End。</p> 
     * @return Bins <p>分布档。没有样本时为空数组。最后一档 Overflow 为 true 且省略 End。</p>
     */
    public TDEMSSEDistributionBin [] getBins() {
        return this.Bins;
    }

    /**
     * Set <p>分布档。没有样本时为空数组。最后一档 Overflow 为 true 且省略 End。</p>
     * @param Bins <p>分布档。没有样本时为空数组。最后一档 Overflow 为 true 且省略 End。</p>
     */
    public void setBins(TDEMSSEDistributionBin [] Bins) {
        this.Bins = Bins;
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

    public DescribeTDEMSSEDistributionResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTDEMSSEDistributionResponse(DescribeTDEMSSEDistributionResponse source) {
        if (source.Bins != null) {
            this.Bins = new TDEMSSEDistributionBin[source.Bins.length];
            for (int i = 0; i < source.Bins.length; i++) {
                this.Bins[i] = new TDEMSSEDistributionBin(source.Bins[i]);
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
        this.setParamArrayObj(map, prefix + "Bins.", this.Bins);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

