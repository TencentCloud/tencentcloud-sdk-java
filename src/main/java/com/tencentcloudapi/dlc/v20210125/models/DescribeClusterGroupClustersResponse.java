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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeClusterGroupClustersResponse extends AbstractModel {

    /**
    * <p>活跃 cluster 总数</p>
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * <p>前 N 个样例</p>
    */
    @SerializedName("SampleClusters")
    @Expose
    private RayClusterEntity [] SampleClusters;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>活跃 cluster 总数</p> 
     * @return Count <p>活跃 cluster 总数</p>
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set <p>活跃 cluster 总数</p>
     * @param Count <p>活跃 cluster 总数</p>
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get <p>前 N 个样例</p> 
     * @return SampleClusters <p>前 N 个样例</p>
     */
    public RayClusterEntity [] getSampleClusters() {
        return this.SampleClusters;
    }

    /**
     * Set <p>前 N 个样例</p>
     * @param SampleClusters <p>前 N 个样例</p>
     */
    public void setSampleClusters(RayClusterEntity [] SampleClusters) {
        this.SampleClusters = SampleClusters;
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

    public DescribeClusterGroupClustersResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeClusterGroupClustersResponse(DescribeClusterGroupClustersResponse source) {
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.SampleClusters != null) {
            this.SampleClusters = new RayClusterEntity[source.SampleClusters.length];
            for (int i = 0; i < source.SampleClusters.length; i++) {
                this.SampleClusters[i] = new RayClusterEntity(source.SampleClusters[i]);
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
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamArrayObj(map, prefix + "SampleClusters.", this.SampleClusters);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

