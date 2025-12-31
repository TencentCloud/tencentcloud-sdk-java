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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCcnInstanceRegionStatusResponse extends AbstractModel {

    /**
    * 地域总数量
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 地域防火墙引流网络状态列表
    */
    @SerializedName("RegionFwStatus")
    @Expose
    private RegionFwStatus [] RegionFwStatus;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 地域总数量 
     * @return Total 地域总数量
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 地域总数量
     * @param Total 地域总数量
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 地域防火墙引流网络状态列表 
     * @return RegionFwStatus 地域防火墙引流网络状态列表
     */
    public RegionFwStatus [] getRegionFwStatus() {
        return this.RegionFwStatus;
    }

    /**
     * Set 地域防火墙引流网络状态列表
     * @param RegionFwStatus 地域防火墙引流网络状态列表
     */
    public void setRegionFwStatus(RegionFwStatus [] RegionFwStatus) {
        this.RegionFwStatus = RegionFwStatus;
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

    public DescribeCcnInstanceRegionStatusResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCcnInstanceRegionStatusResponse(DescribeCcnInstanceRegionStatusResponse source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.RegionFwStatus != null) {
            this.RegionFwStatus = new RegionFwStatus[source.RegionFwStatus.length];
            for (int i = 0; i < source.RegionFwStatus.length; i++) {
                this.RegionFwStatus[i] = new RegionFwStatus(source.RegionFwStatus[i]);
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
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamArrayObj(map, prefix + "RegionFwStatus.", this.RegionFwStatus);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

