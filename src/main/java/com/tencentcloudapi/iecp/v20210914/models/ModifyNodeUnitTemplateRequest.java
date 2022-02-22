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

public class ModifyNodeUnitTemplateRequest extends AbstractModel{

    /**
    * IECP边缘单元ID
    */
    @SerializedName("EdgeUnitId")
    @Expose
    private Long EdgeUnitId;

    /**
    * NodeUnit模板ID
    */
    @SerializedName("NodeUnitTemplateID")
    @Expose
    private Long NodeUnitTemplateID;

    /**
    * 包含的节点列表
    */
    @SerializedName("Nodes")
    @Expose
    private String [] Nodes;

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
     * Get NodeUnit模板ID 
     * @return NodeUnitTemplateID NodeUnit模板ID
     */
    public Long getNodeUnitTemplateID() {
        return this.NodeUnitTemplateID;
    }

    /**
     * Set NodeUnit模板ID
     * @param NodeUnitTemplateID NodeUnit模板ID
     */
    public void setNodeUnitTemplateID(Long NodeUnitTemplateID) {
        this.NodeUnitTemplateID = NodeUnitTemplateID;
    }

    /**
     * Get 包含的节点列表 
     * @return Nodes 包含的节点列表
     */
    public String [] getNodes() {
        return this.Nodes;
    }

    /**
     * Set 包含的节点列表
     * @param Nodes 包含的节点列表
     */
    public void setNodes(String [] Nodes) {
        this.Nodes = Nodes;
    }

    public ModifyNodeUnitTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyNodeUnitTemplateRequest(ModifyNodeUnitTemplateRequest source) {
        if (source.EdgeUnitId != null) {
            this.EdgeUnitId = new Long(source.EdgeUnitId);
        }
        if (source.NodeUnitTemplateID != null) {
            this.NodeUnitTemplateID = new Long(source.NodeUnitTemplateID);
        }
        if (source.Nodes != null) {
            this.Nodes = new String[source.Nodes.length];
            for (int i = 0; i < source.Nodes.length; i++) {
                this.Nodes[i] = new String(source.Nodes[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EdgeUnitId", this.EdgeUnitId);
        this.setParamSimple(map, prefix + "NodeUnitTemplateID", this.NodeUnitTemplateID);
        this.setParamArraySimple(map, prefix + "Nodes.", this.Nodes);

    }
}

