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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DependencyTopology extends AbstractModel {

    /**
    * 节点列表
    */
    @SerializedName("Nodes")
    @Expose
    private TopologyNode [] Nodes;

    /**
    * 边列表
    */
    @SerializedName("Edges")
    @Expose
    private TopologyEdge [] Edges;

    /**
     * Get 节点列表 
     * @return Nodes 节点列表
     */
    public TopologyNode [] getNodes() {
        return this.Nodes;
    }

    /**
     * Set 节点列表
     * @param Nodes 节点列表
     */
    public void setNodes(TopologyNode [] Nodes) {
        this.Nodes = Nodes;
    }

    /**
     * Get 边列表 
     * @return Edges 边列表
     */
    public TopologyEdge [] getEdges() {
        return this.Edges;
    }

    /**
     * Set 边列表
     * @param Edges 边列表
     */
    public void setEdges(TopologyEdge [] Edges) {
        this.Edges = Edges;
    }

    public DependencyTopology() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DependencyTopology(DependencyTopology source) {
        if (source.Nodes != null) {
            this.Nodes = new TopologyNode[source.Nodes.length];
            for (int i = 0; i < source.Nodes.length; i++) {
                this.Nodes[i] = new TopologyNode(source.Nodes[i]);
            }
        }
        if (source.Edges != null) {
            this.Edges = new TopologyEdge[source.Edges.length];
            for (int i = 0; i < source.Edges.length; i++) {
                this.Edges[i] = new TopologyEdge(source.Edges[i]);
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

