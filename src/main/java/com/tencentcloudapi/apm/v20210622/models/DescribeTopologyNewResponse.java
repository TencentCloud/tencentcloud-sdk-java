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
package com.tencentcloudapi.apm.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTopologyNewResponse extends AbstractModel {

    /**
    * 节点集合
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Nodes")
    @Expose
    private TopologyNode [] Nodes;

    /**
    * 边集合
    */
    @SerializedName("Edges")
    @Expose
    private TopologyEdgeNew [] Edges;

    /**
    * 拓扑图是否有修改
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TopologyModifyFlag")
    @Expose
    private Long TopologyModifyFlag;

    /**
    * 节点数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Selectors")
    @Expose
    private SelectorView Selectors;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 节点集合
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Nodes 节点集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TopologyNode [] getNodes() {
        return this.Nodes;
    }

    /**
     * Set 节点集合
注意：此字段可能返回 null，表示取不到有效值。
     * @param Nodes 节点集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNodes(TopologyNode [] Nodes) {
        this.Nodes = Nodes;
    }

    /**
     * Get 边集合 
     * @return Edges 边集合
     */
    public TopologyEdgeNew [] getEdges() {
        return this.Edges;
    }

    /**
     * Set 边集合
     * @param Edges 边集合
     */
    public void setEdges(TopologyEdgeNew [] Edges) {
        this.Edges = Edges;
    }

    /**
     * Get 拓扑图是否有修改
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TopologyModifyFlag 拓扑图是否有修改
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTopologyModifyFlag() {
        return this.TopologyModifyFlag;
    }

    /**
     * Set 拓扑图是否有修改
注意：此字段可能返回 null，表示取不到有效值。
     * @param TopologyModifyFlag 拓扑图是否有修改
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTopologyModifyFlag(Long TopologyModifyFlag) {
        this.TopologyModifyFlag = TopologyModifyFlag;
    }

    /**
     * Get 节点数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Selectors 节点数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SelectorView getSelectors() {
        return this.Selectors;
    }

    /**
     * Set 节点数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param Selectors 节点数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSelectors(SelectorView Selectors) {
        this.Selectors = Selectors;
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

    public DescribeTopologyNewResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTopologyNewResponse(DescribeTopologyNewResponse source) {
        if (source.Nodes != null) {
            this.Nodes = new TopologyNode[source.Nodes.length];
            for (int i = 0; i < source.Nodes.length; i++) {
                this.Nodes[i] = new TopologyNode(source.Nodes[i]);
            }
        }
        if (source.Edges != null) {
            this.Edges = new TopologyEdgeNew[source.Edges.length];
            for (int i = 0; i < source.Edges.length; i++) {
                this.Edges[i] = new TopologyEdgeNew(source.Edges[i]);
            }
        }
        if (source.TopologyModifyFlag != null) {
            this.TopologyModifyFlag = new Long(source.TopologyModifyFlag);
        }
        if (source.Selectors != null) {
            this.Selectors = new SelectorView(source.Selectors);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Nodes.", this.Nodes);
        this.setParamArrayObj(map, prefix + "Edges.", this.Edges);
        this.setParamSimple(map, prefix + "TopologyModifyFlag", this.TopologyModifyFlag);
        this.setParamObj(map, prefix + "Selectors.", this.Selectors);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

