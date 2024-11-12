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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AttackSource extends AbstractModel {

    /**
    * 攻击溯源节点描述
    */
    @SerializedName("Nodes")
    @Expose
    private AttackSourceNode [] Nodes;

    /**
    * 攻击溯源节点路径
    */
    @SerializedName("Edges")
    @Expose
    private AttackSourceEdge [] Edges;

    /**
    * 请求节点相关事件详情的参数
    */
    @SerializedName("EventInfoParam")
    @Expose
    private String EventInfoParam;

    /**
     * Get 攻击溯源节点描述 
     * @return Nodes 攻击溯源节点描述
     */
    public AttackSourceNode [] getNodes() {
        return this.Nodes;
    }

    /**
     * Set 攻击溯源节点描述
     * @param Nodes 攻击溯源节点描述
     */
    public void setNodes(AttackSourceNode [] Nodes) {
        this.Nodes = Nodes;
    }

    /**
     * Get 攻击溯源节点路径 
     * @return Edges 攻击溯源节点路径
     */
    public AttackSourceEdge [] getEdges() {
        return this.Edges;
    }

    /**
     * Set 攻击溯源节点路径
     * @param Edges 攻击溯源节点路径
     */
    public void setEdges(AttackSourceEdge [] Edges) {
        this.Edges = Edges;
    }

    /**
     * Get 请求节点相关事件详情的参数 
     * @return EventInfoParam 请求节点相关事件详情的参数
     */
    public String getEventInfoParam() {
        return this.EventInfoParam;
    }

    /**
     * Set 请求节点相关事件详情的参数
     * @param EventInfoParam 请求节点相关事件详情的参数
     */
    public void setEventInfoParam(String EventInfoParam) {
        this.EventInfoParam = EventInfoParam;
    }

    public AttackSource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AttackSource(AttackSource source) {
        if (source.Nodes != null) {
            this.Nodes = new AttackSourceNode[source.Nodes.length];
            for (int i = 0; i < source.Nodes.length; i++) {
                this.Nodes[i] = new AttackSourceNode(source.Nodes[i]);
            }
        }
        if (source.Edges != null) {
            this.Edges = new AttackSourceEdge[source.Edges.length];
            for (int i = 0; i < source.Edges.length; i++) {
                this.Edges[i] = new AttackSourceEdge(source.Edges[i]);
            }
        }
        if (source.EventInfoParam != null) {
            this.EventInfoParam = new String(source.EventInfoParam);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Nodes.", this.Nodes);
        this.setParamArrayObj(map, prefix + "Edges.", this.Edges);
        this.setParamSimple(map, prefix + "EventInfoParam", this.EventInfoParam);

    }
}

