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

public class DescribeBackendScanEngineRegionListResponse extends AbstractModel {

    /**
    * <p>地域列表</p>
    */
    @SerializedName("Regions")
    @Expose
    private RegionInfo [] Regions;

    /**
    * <p>默认地域</p>
    */
    @SerializedName("DefaultRegion")
    @Expose
    private String DefaultRegion;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>地域列表</p> 
     * @return Regions <p>地域列表</p>
     */
    public RegionInfo [] getRegions() {
        return this.Regions;
    }

    /**
     * Set <p>地域列表</p>
     * @param Regions <p>地域列表</p>
     */
    public void setRegions(RegionInfo [] Regions) {
        this.Regions = Regions;
    }

    /**
     * Get <p>默认地域</p> 
     * @return DefaultRegion <p>默认地域</p>
     */
    public String getDefaultRegion() {
        return this.DefaultRegion;
    }

    /**
     * Set <p>默认地域</p>
     * @param DefaultRegion <p>默认地域</p>
     */
    public void setDefaultRegion(String DefaultRegion) {
        this.DefaultRegion = DefaultRegion;
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

    public DescribeBackendScanEngineRegionListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBackendScanEngineRegionListResponse(DescribeBackendScanEngineRegionListResponse source) {
        if (source.Regions != null) {
            this.Regions = new RegionInfo[source.Regions.length];
            for (int i = 0; i < source.Regions.length; i++) {
                this.Regions[i] = new RegionInfo(source.Regions[i]);
            }
        }
        if (source.DefaultRegion != null) {
            this.DefaultRegion = new String(source.DefaultRegion);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Regions.", this.Regions);
        this.setParamSimple(map, prefix + "DefaultRegion", this.DefaultRegion);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

