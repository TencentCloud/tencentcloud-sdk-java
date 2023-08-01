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
package com.tencentcloudapi.oceanus.v20190422.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class JobGraph extends AbstractModel{

    /**
    * 运行图的点集合
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Nodes")
    @Expose
    private JobGraphNode [] Nodes;

    /**
    * 运行图的边集合
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Edges")
    @Expose
    private JobGraphEdge [] Edges;

    /**
     * Get 运行图的点集合
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Nodes 运行图的点集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public JobGraphNode [] getNodes() {
        return this.Nodes;
    }

    /**
     * Set 运行图的点集合
注意：此字段可能返回 null，表示取不到有效值。
     * @param Nodes 运行图的点集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNodes(JobGraphNode [] Nodes) {
        this.Nodes = Nodes;
    }

    /**
     * Get 运行图的边集合
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Edges 运行图的边集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public JobGraphEdge [] getEdges() {
        return this.Edges;
    }

    /**
     * Set 运行图的边集合
注意：此字段可能返回 null，表示取不到有效值。
     * @param Edges 运行图的边集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEdges(JobGraphEdge [] Edges) {
        this.Edges = Edges;
    }

    public JobGraph() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public JobGraph(JobGraph source) {
        if (source.Nodes != null) {
            this.Nodes = new JobGraphNode[source.Nodes.length];
            for (int i = 0; i < source.Nodes.length; i++) {
                this.Nodes[i] = new JobGraphNode(source.Nodes[i]);
            }
        }
        if (source.Edges != null) {
            this.Edges = new JobGraphEdge[source.Edges.length];
            for (int i = 0; i < source.Edges.length; i++) {
                this.Edges[i] = new JobGraphEdge(source.Edges[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Nodes.", this.Nodes);
        this.setParamArrayObj(map, prefix + "Edges.", this.Edges);

    }
}

