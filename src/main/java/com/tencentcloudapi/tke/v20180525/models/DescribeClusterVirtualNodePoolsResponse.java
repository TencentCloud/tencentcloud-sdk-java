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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeClusterVirtualNodePoolsResponse extends AbstractModel {

    /**
    * 节点池总数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 虚拟节点池列表
    */
    @SerializedName("NodePoolSet")
    @Expose
    private VirtualNodePool [] NodePoolSet;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 节点池总数 
     * @return TotalCount 节点池总数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 节点池总数
     * @param TotalCount 节点池总数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 虚拟节点池列表 
     * @return NodePoolSet 虚拟节点池列表
     */
    public VirtualNodePool [] getNodePoolSet() {
        return this.NodePoolSet;
    }

    /**
     * Set 虚拟节点池列表
     * @param NodePoolSet 虚拟节点池列表
     */
    public void setNodePoolSet(VirtualNodePool [] NodePoolSet) {
        this.NodePoolSet = NodePoolSet;
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

    public DescribeClusterVirtualNodePoolsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeClusterVirtualNodePoolsResponse(DescribeClusterVirtualNodePoolsResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.NodePoolSet != null) {
            this.NodePoolSet = new VirtualNodePool[source.NodePoolSet.length];
            for (int i = 0; i < source.NodePoolSet.length; i++) {
                this.NodePoolSet[i] = new VirtualNodePool(source.NodePoolSet[i]);
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
        this.setParamArrayObj(map, prefix + "NodePoolSet.", this.NodePoolSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

