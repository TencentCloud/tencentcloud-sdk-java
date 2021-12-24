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

public class DeleteEdgeNodesRequest extends AbstractModel{

    /**
    * IECP边缘单元ID
    */
    @SerializedName("EdgeUnitId")
    @Expose
    private Long EdgeUnitId;

    /**
    * IECP边缘节点ID列表
    */
    @SerializedName("NodeIds")
    @Expose
    private Long [] NodeIds;

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
     * Get IECP边缘节点ID列表 
     * @return NodeIds IECP边缘节点ID列表
     */
    public Long [] getNodeIds() {
        return this.NodeIds;
    }

    /**
     * Set IECP边缘节点ID列表
     * @param NodeIds IECP边缘节点ID列表
     */
    public void setNodeIds(Long [] NodeIds) {
        this.NodeIds = NodeIds;
    }

    public DeleteEdgeNodesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteEdgeNodesRequest(DeleteEdgeNodesRequest source) {
        if (source.EdgeUnitId != null) {
            this.EdgeUnitId = new Long(source.EdgeUnitId);
        }
        if (source.NodeIds != null) {
            this.NodeIds = new Long[source.NodeIds.length];
            for (int i = 0; i < source.NodeIds.length; i++) {
                this.NodeIds[i] = new Long(source.NodeIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EdgeUnitId", this.EdgeUnitId);
        this.setParamArraySimple(map, prefix + "NodeIds.", this.NodeIds);

    }
}

