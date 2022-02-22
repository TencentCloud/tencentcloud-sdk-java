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

public class DeleteEdgeNodeUnitTemplatesRequest extends AbstractModel{

    /**
    * IECP边缘单元ID
    */
    @SerializedName("EdgeUnitId")
    @Expose
    private Long EdgeUnitId;

    /**
    * 删除的NodeUnit模板ID列表
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
     * Get 删除的NodeUnit模板ID列表 
     * @return NodeUnitTemplateIDs 删除的NodeUnit模板ID列表
     */
    public Long [] getNodeUnitTemplateIDs() {
        return this.NodeUnitTemplateIDs;
    }

    /**
     * Set 删除的NodeUnit模板ID列表
     * @param NodeUnitTemplateIDs 删除的NodeUnit模板ID列表
     */
    public void setNodeUnitTemplateIDs(Long [] NodeUnitTemplateIDs) {
        this.NodeUnitTemplateIDs = NodeUnitTemplateIDs;
    }

    public DeleteEdgeNodeUnitTemplatesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteEdgeNodeUnitTemplatesRequest(DeleteEdgeNodeUnitTemplatesRequest source) {
        if (source.EdgeUnitId != null) {
            this.EdgeUnitId = new Long(source.EdgeUnitId);
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
        this.setParamArraySimple(map, prefix + "NodeUnitTemplateIDs.", this.NodeUnitTemplateIDs);

    }
}

