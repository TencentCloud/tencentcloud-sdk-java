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
package com.tencentcloudapi.ags.v20250920.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeGPUResourceSpecsResponse extends AbstractModel {

    /**
    * <p>可售规格与额度列表；无可售规格时为 []。</p>
    */
    @SerializedName("GPUResourceSpecSet")
    @Expose
    private GPUResourceSpec [] GPUResourceSpecSet;

    /**
    * <p>筛选后、分页前的总数。</p>
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
     * Get <p>可售规格与额度列表；无可售规格时为 []。</p> 
     * @return GPUResourceSpecSet <p>可售规格与额度列表；无可售规格时为 []。</p>
     */
    public GPUResourceSpec [] getGPUResourceSpecSet() {
        return this.GPUResourceSpecSet;
    }

    /**
     * Set <p>可售规格与额度列表；无可售规格时为 []。</p>
     * @param GPUResourceSpecSet <p>可售规格与额度列表；无可售规格时为 []。</p>
     */
    public void setGPUResourceSpecSet(GPUResourceSpec [] GPUResourceSpecSet) {
        this.GPUResourceSpecSet = GPUResourceSpecSet;
    }

    /**
     * Get <p>筛选后、分页前的总数。</p> 
     * @return TotalCount <p>筛选后、分页前的总数。</p>
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set <p>筛选后、分页前的总数。</p>
     * @param TotalCount <p>筛选后、分页前的总数。</p>
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

    public DescribeGPUResourceSpecsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeGPUResourceSpecsResponse(DescribeGPUResourceSpecsResponse source) {
        if (source.GPUResourceSpecSet != null) {
            this.GPUResourceSpecSet = new GPUResourceSpec[source.GPUResourceSpecSet.length];
            for (int i = 0; i < source.GPUResourceSpecSet.length; i++) {
                this.GPUResourceSpecSet[i] = new GPUResourceSpec(source.GPUResourceSpecSet[i]);
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
        this.setParamArrayObj(map, prefix + "GPUResourceSpecSet.", this.GPUResourceSpecSet);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

