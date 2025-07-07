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
package com.tencentcloudapi.iecp.v20210914.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeEdgeNodesResponse extends AbstractModel {

    /**
    * 边缘节点数量
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 节点列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NodeSet")
    @Expose
    private EdgeNodeInfo [] NodeSet;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 边缘节点数量 
     * @return TotalCount 边缘节点数量
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 边缘节点数量
     * @param TotalCount 边缘节点数量
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 节点列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NodeSet 节点列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EdgeNodeInfo [] getNodeSet() {
        return this.NodeSet;
    }

    /**
     * Set 节点列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param NodeSet 节点列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNodeSet(EdgeNodeInfo [] NodeSet) {
        this.NodeSet = NodeSet;
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

    public DescribeEdgeNodesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeEdgeNodesResponse(DescribeEdgeNodesResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.NodeSet != null) {
            this.NodeSet = new EdgeNodeInfo[source.NodeSet.length];
            for (int i = 0; i < source.NodeSet.length; i++) {
                this.NodeSet[i] = new EdgeNodeInfo(source.NodeSet[i]);
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
        this.setParamArrayObj(map, prefix + "NodeSet.", this.NodeSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

