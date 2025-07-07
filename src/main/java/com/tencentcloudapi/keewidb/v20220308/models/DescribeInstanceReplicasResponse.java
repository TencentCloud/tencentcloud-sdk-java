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
package com.tencentcloudapi.keewidb.v20220308.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstanceReplicasResponse extends AbstractModel {

    /**
    * 实例所有节点数量，包括主节点、副本节点。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 实例节点信息。
    */
    @SerializedName("ReplicaGroups")
    @Expose
    private ReplicaGroup [] ReplicaGroups;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 实例所有节点数量，包括主节点、副本节点。 
     * @return TotalCount 实例所有节点数量，包括主节点、副本节点。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 实例所有节点数量，包括主节点、副本节点。
     * @param TotalCount 实例所有节点数量，包括主节点、副本节点。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 实例节点信息。 
     * @return ReplicaGroups 实例节点信息。
     */
    public ReplicaGroup [] getReplicaGroups() {
        return this.ReplicaGroups;
    }

    /**
     * Set 实例节点信息。
     * @param ReplicaGroups 实例节点信息。
     */
    public void setReplicaGroups(ReplicaGroup [] ReplicaGroups) {
        this.ReplicaGroups = ReplicaGroups;
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

    public DescribeInstanceReplicasResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstanceReplicasResponse(DescribeInstanceReplicasResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.ReplicaGroups != null) {
            this.ReplicaGroups = new ReplicaGroup[source.ReplicaGroups.length];
            for (int i = 0; i < source.ReplicaGroups.length; i++) {
                this.ReplicaGroups[i] = new ReplicaGroup(source.ReplicaGroups[i]);
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
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "ReplicaGroups.", this.ReplicaGroups);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

