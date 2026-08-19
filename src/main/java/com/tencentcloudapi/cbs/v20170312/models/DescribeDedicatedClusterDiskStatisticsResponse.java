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
package com.tencentcloudapi.cbs.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDedicatedClusterDiskStatisticsResponse extends AbstractModel {

    /**
    * <p>云服务器独享集群云硬盘统计信息。</p>
    */
    @SerializedName("DedicatedClusterDiskStatisticSet")
    @Expose
    private DedicatedClusterDiskStatistic [] DedicatedClusterDiskStatisticSet;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>云服务器独享集群云硬盘统计信息。</p> 
     * @return DedicatedClusterDiskStatisticSet <p>云服务器独享集群云硬盘统计信息。</p>
     */
    public DedicatedClusterDiskStatistic [] getDedicatedClusterDiskStatisticSet() {
        return this.DedicatedClusterDiskStatisticSet;
    }

    /**
     * Set <p>云服务器独享集群云硬盘统计信息。</p>
     * @param DedicatedClusterDiskStatisticSet <p>云服务器独享集群云硬盘统计信息。</p>
     */
    public void setDedicatedClusterDiskStatisticSet(DedicatedClusterDiskStatistic [] DedicatedClusterDiskStatisticSet) {
        this.DedicatedClusterDiskStatisticSet = DedicatedClusterDiskStatisticSet;
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

    public DescribeDedicatedClusterDiskStatisticsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDedicatedClusterDiskStatisticsResponse(DescribeDedicatedClusterDiskStatisticsResponse source) {
        if (source.DedicatedClusterDiskStatisticSet != null) {
            this.DedicatedClusterDiskStatisticSet = new DedicatedClusterDiskStatistic[source.DedicatedClusterDiskStatisticSet.length];
            for (int i = 0; i < source.DedicatedClusterDiskStatisticSet.length; i++) {
                this.DedicatedClusterDiskStatisticSet[i] = new DedicatedClusterDiskStatistic(source.DedicatedClusterDiskStatisticSet[i]);
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
        this.setParamArrayObj(map, prefix + "DedicatedClusterDiskStatisticSet.", this.DedicatedClusterDiskStatisticSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

