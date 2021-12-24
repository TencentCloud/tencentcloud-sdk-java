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
package com.tencentcloudapi.iecp.v20210914.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateUpdateNodeUnitRequest extends AbstractModel{

    /**
    * IECP边缘单元ID
    */
    @SerializedName("EdgeUnitId")
    @Expose
    private Long EdgeUnitId;

    /**
    * NodeUnit所属的NodeGroup名称
    */
    @SerializedName("NodeGroupName")
    @Expose
    private String NodeGroupName;

    /**
    * 命名空间，默认为default
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * NodeUnit名称，通过模版创建可不填
    */
    @SerializedName("NodeUnitName")
    @Expose
    private String NodeUnitName;

    /**
    * NodeUnit包含的节点列表，通过模版创建可不填
    */
    @SerializedName("Nodes")
    @Expose
    private String [] Nodes;

    /**
    * NodeUnit模版ID列表
    */
    @SerializedName("NodeUnitTemplateIDs")
    @Expose
    private Long [] NodeUnitTemplateIDs;

    /**
     * Get IECP边缘单元ID 
     * @return EdgeUnitId IECP边缘单元ID
     */
    public Long getEdgeUnitId() {
        return this.EdgeUnitId;
    }

    /**
     * Set IECP边缘单元ID
     * @param EdgeUnitId IECP边缘单元ID
     */
    public void setEdgeUnitId(Long EdgeUnitId) {
        this.EdgeUnitId = EdgeUnitId;
    }

    /**
     * Get NodeUnit所属的NodeGroup名称 
     * @return NodeGroupName NodeUnit所属的NodeGroup名称
     */
    public String getNodeGroupName() {
        return this.NodeGroupName;
    }

    /**
     * Set NodeUnit所属的NodeGroup名称
     * @param NodeGroupName NodeUnit所属的NodeGroup名称
     */
    public void setNodeGroupName(String NodeGroupName) {
        this.NodeGroupName = NodeGroupName;
    }

    /**
     * Get 命名空间，默认为default 
     * @return Namespace 命名空间，默认为default
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 命名空间，默认为default
     * @param Namespace 命名空间，默认为default
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get NodeUnit名称，通过模版创建可不填 
     * @return NodeUnitName NodeUnit名称，通过模版创建可不填
     */
    public String getNodeUnitName() {
        return this.NodeUnitName;
    }

    /**
     * Set NodeUnit名称，通过模版创建可不填
     * @param NodeUnitName NodeUnit名称，通过模版创建可不填
     */
    public void setNodeUnitName(String NodeUnitName) {
        this.NodeUnitName = NodeUnitName;
    }

    /**
     * Get NodeUnit包含的节点列表，通过模版创建可不填 
     * @return Nodes NodeUnit包含的节点列表，通过模版创建可不填
     */
    public String [] getNodes() {
        return this.Nodes;
    }

    /**
     * Set NodeUnit包含的节点列表，通过模版创建可不填
     * @param Nodes NodeUnit包含的节点列表，通过模版创建可不填
     */
    public void setNodes(String [] Nodes) {
        this.Nodes = Nodes;
    }

    /**
     * Get NodeUnit模版ID列表 
     * @return NodeUnitTemplateIDs NodeUnit模版ID列表
     */
    public Long [] getNodeUnitTemplateIDs() {
        return this.NodeUnitTemplateIDs;
    }

    /**
     * Set NodeUnit模版ID列表
     * @param NodeUnitTemplateIDs NodeUnit模版ID列表
     */
    public void setNodeUnitTemplateIDs(Long [] NodeUnitTemplateIDs) {
        this.NodeUnitTemplateIDs = NodeUnitTemplateIDs;
    }

    public CreateUpdateNodeUnitRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateUpdateNodeUnitRequest(CreateUpdateNodeUnitRequest source) {
        if (source.EdgeUnitId != null) {
            this.EdgeUnitId = new Long(source.EdgeUnitId);
        }
        if (source.NodeGroupName != null) {
            this.NodeGroupName = new String(source.NodeGroupName);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.NodeUnitName != null) {
            this.NodeUnitName = new String(source.NodeUnitName);
        }
        if (source.Nodes != null) {
            this.Nodes = new String[source.Nodes.length];
            for (int i = 0; i < source.Nodes.length; i++) {
                this.Nodes[i] = new String(source.Nodes[i]);
            }
        }
        if (source.NodeUnitTemplateIDs != null) {
            this.NodeUnitTemplateIDs = new Long[source.NodeUnitTemplateIDs.length];
            for (int i = 0; i < source.NodeUnitTemplateIDs.length; i++) {
                this.NodeUnitTemplateIDs[i] = new Long(source.NodeUnitTemplateIDs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EdgeUnitId", this.EdgeUnitId);
        this.setParamSimple(map, prefix + "NodeGroupName", this.NodeGroupName);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "NodeUnitName", this.NodeUnitName);
        this.setParamArraySimple(map, prefix + "Nodes.", this.Nodes);
        this.setParamArraySimple(map, prefix + "NodeUnitTemplateIDs.", this.NodeUnitTemplateIDs);

    }
}

