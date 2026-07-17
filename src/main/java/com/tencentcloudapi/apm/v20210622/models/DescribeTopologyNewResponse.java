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
    * <p>节点集合</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Nodes")
    @Expose
    private TopologyNode [] Nodes;

    /**
    * <p>边集合</p>
    */
    @SerializedName("Edges")
    @Expose
    private TopologyEdgeNew [] Edges;

    /**
    * <p>拓扑图是否有修改</p><p>枚举值：</p><ul><li>0： 拓扑图未修改</li><li>1： 拓扑图已修改</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TopologyModifyFlag")
    @Expose
    private Long TopologyModifyFlag;

    /**
    * <p>节点数量</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Selectors")
    @Expose
    private SelectorView Selectors;

    /**
    * <p>节点状态</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OverviewStats")
    @Expose
    private OverviewStats OverviewStats;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>节点集合</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Nodes <p>节点集合</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TopologyNode [] getNodes() {
        return this.Nodes;
    }

    /**
     * Set <p>节点集合</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Nodes <p>节点集合</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNodes(TopologyNode [] Nodes) {
        this.Nodes = Nodes;
    }

    /**
     * Get <p>边集合</p> 
     * @return Edges <p>边集合</p>
     */
    public TopologyEdgeNew [] getEdges() {
        return this.Edges;
    }

    /**
     * Set <p>边集合</p>
     * @param Edges <p>边集合</p>
     */
    public void setEdges(TopologyEdgeNew [] Edges) {
        this.Edges = Edges;
    }

    /**
     * Get <p>拓扑图是否有修改</p><p>枚举值：</p><ul><li>0： 拓扑图未修改</li><li>1： 拓扑图已修改</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TopologyModifyFlag <p>拓扑图是否有修改</p><p>枚举值：</p><ul><li>0： 拓扑图未修改</li><li>1： 拓扑图已修改</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTopologyModifyFlag() {
        return this.TopologyModifyFlag;
    }

    /**
     * Set <p>拓扑图是否有修改</p><p>枚举值：</p><ul><li>0： 拓扑图未修改</li><li>1： 拓扑图已修改</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TopologyModifyFlag <p>拓扑图是否有修改</p><p>枚举值：</p><ul><li>0： 拓扑图未修改</li><li>1： 拓扑图已修改</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTopologyModifyFlag(Long TopologyModifyFlag) {
        this.TopologyModifyFlag = TopologyModifyFlag;
    }

    /**
     * Get <p>节点数量</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Selectors <p>节点数量</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SelectorView getSelectors() {
        return this.Selectors;
    }

    /**
     * Set <p>节点数量</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Selectors <p>节点数量</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSelectors(SelectorView Selectors) {
        this.Selectors = Selectors;
    }

    /**
     * Get <p>节点状态</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OverviewStats <p>节点状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public OverviewStats getOverviewStats() {
        return this.OverviewStats;
    }

    /**
     * Set <p>节点状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param OverviewStats <p>节点状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOverviewStats(OverviewStats OverviewStats) {
        this.OverviewStats = OverviewStats;
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
        if (source.OverviewStats != null) {
            this.OverviewStats = new OverviewStats(source.OverviewStats);
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
        this.setParamObj(map, prefix + "OverviewStats.", this.OverviewStats);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

