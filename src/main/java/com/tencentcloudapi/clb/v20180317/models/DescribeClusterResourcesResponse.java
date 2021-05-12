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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeClusterResourcesResponse extends AbstractModel{

    /**
    * 集群中资源列表。
    */
    @SerializedName("ClusterResourceSet")
    @Expose
    private ClusterResource [] ClusterResourceSet;

    /**
    * 集群中资源总数。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 集群中资源列表。 
     * @return ClusterResourceSet 集群中资源列表。
     */
    public ClusterResource [] getClusterResourceSet() {
        return this.ClusterResourceSet;
    }

    /**
     * Set 集群中资源列表。
     * @param ClusterResourceSet 集群中资源列表。
     */
    public void setClusterResourceSet(ClusterResource [] ClusterResourceSet) {
        this.ClusterResourceSet = ClusterResourceSet;
    }

    /**
     * Get 集群中资源总数。 
     * @return TotalCount 集群中资源总数。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 集群中资源总数。
     * @param TotalCount 集群中资源总数。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeClusterResourcesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeClusterResourcesResponse(DescribeClusterResourcesResponse source) {
        if (source.ClusterResourceSet != null) {
            this.ClusterResourceSet = new ClusterResource[source.ClusterResourceSet.length];
            for (int i = 0; i < source.ClusterResourceSet.length; i++) {
                this.ClusterResourceSet[i] = new ClusterResource(source.ClusterResourceSet[i]);
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
        this.setParamArrayObj(map, prefix + "ClusterResourceSet.", this.ClusterResourceSet);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

