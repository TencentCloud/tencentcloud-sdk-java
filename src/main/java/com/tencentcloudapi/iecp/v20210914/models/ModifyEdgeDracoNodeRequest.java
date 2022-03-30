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

public class ModifyEdgeDracoNodeRequest extends AbstractModel{

    /**
    * 边缘单元ID
    */
    @SerializedName("EdgeUnitId")
    @Expose
    private Long EdgeUnitId;

    /**
    * 边缘节点ID
    */
    @SerializedName("NodeId")
    @Expose
    private Long NodeId;

    /**
    * 节点信息
    */
    @SerializedName("NodeInfo")
    @Expose
    private DracoNodeInfo NodeInfo;

    /**
    * 是否重置draco设备
    */
    @SerializedName("IsReset")
    @Expose
    private Boolean IsReset;

    /**
     * Get 边缘单元ID 
     * @return EdgeUnitId 边缘单元ID
     */
    public Long getEdgeUnitId() {
        return this.EdgeUnitId;
    }

    /**
     * Set 边缘单元ID
     * @param EdgeUnitId 边缘单元ID
     */
    public void setEdgeUnitId(Long EdgeUnitId) {
        this.EdgeUnitId = EdgeUnitId;
    }

    /**
     * Get 边缘节点ID 
     * @return NodeId 边缘节点ID
     */
    public Long getNodeId() {
        return this.NodeId;
    }

    /**
     * Set 边缘节点ID
     * @param NodeId 边缘节点ID
     */
    public void setNodeId(Long NodeId) {
        this.NodeId = NodeId;
    }

    /**
     * Get 节点信息 
     * @return NodeInfo 节点信息
     */
    public DracoNodeInfo getNodeInfo() {
        return this.NodeInfo;
    }

    /**
     * Set 节点信息
     * @param NodeInfo 节点信息
     */
    public void setNodeInfo(DracoNodeInfo NodeInfo) {
        this.NodeInfo = NodeInfo;
    }

    /**
     * Get 是否重置draco设备 
     * @return IsReset 是否重置draco设备
     */
    public Boolean getIsReset() {
        return this.IsReset;
    }

    /**
     * Set 是否重置draco设备
     * @param IsReset 是否重置draco设备
     */
    public void setIsReset(Boolean IsReset) {
        this.IsReset = IsReset;
    }

    public ModifyEdgeDracoNodeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyEdgeDracoNodeRequest(ModifyEdgeDracoNodeRequest source) {
        if (source.EdgeUnitId != null) {
            this.EdgeUnitId = new Long(source.EdgeUnitId);
        }
        if (source.NodeId != null) {
            this.NodeId = new Long(source.NodeId);
        }
        if (source.NodeInfo != null) {
            this.NodeInfo = new DracoNodeInfo(source.NodeInfo);
        }
        if (source.IsReset != null) {
            this.IsReset = new Boolean(source.IsReset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EdgeUnitId", this.EdgeUnitId);
        this.setParamSimple(map, prefix + "NodeId", this.NodeId);
        this.setParamObj(map, prefix + "NodeInfo.", this.NodeInfo);
        this.setParamSimple(map, prefix + "IsReset", this.IsReset);

    }
}

