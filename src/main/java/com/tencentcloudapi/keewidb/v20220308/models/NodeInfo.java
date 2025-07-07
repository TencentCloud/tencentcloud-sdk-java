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
package com.tencentcloudapi.keewidb.v20220308.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NodeInfo extends AbstractModel {

    /**
    * 节点类型，0 为主节点，1 为副本节点
    */
    @SerializedName("NodeType")
    @Expose
    private Long NodeType;

    /**
    * 主节点或者副本节点的ID，创建时不需要传递此参数。
    */
    @SerializedName("NodeId")
    @Expose
    private Long NodeId;

    /**
    * 主节点或者副本节点的可用区ID
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * 主节点或者副本节点的可用区名称
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
     * Get 节点类型，0 为主节点，1 为副本节点 
     * @return NodeType 节点类型，0 为主节点，1 为副本节点
     */
    public Long getNodeType() {
        return this.NodeType;
    }

    /**
     * Set 节点类型，0 为主节点，1 为副本节点
     * @param NodeType 节点类型，0 为主节点，1 为副本节点
     */
    public void setNodeType(Long NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get 主节点或者副本节点的ID，创建时不需要传递此参数。 
     * @return NodeId 主节点或者副本节点的ID，创建时不需要传递此参数。
     */
    public Long getNodeId() {
        return this.NodeId;
    }

    /**
     * Set 主节点或者副本节点的ID，创建时不需要传递此参数。
     * @param NodeId 主节点或者副本节点的ID，创建时不需要传递此参数。
     */
    public void setNodeId(Long NodeId) {
        this.NodeId = NodeId;
    }

    /**
     * Get 主节点或者副本节点的可用区ID 
     * @return ZoneId 主节点或者副本节点的可用区ID
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 主节点或者副本节点的可用区ID
     * @param ZoneId 主节点或者副本节点的可用区ID
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 主节点或者副本节点的可用区名称 
     * @return ZoneName 主节点或者副本节点的可用区名称
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set 主节点或者副本节点的可用区名称
     * @param ZoneName 主节点或者副本节点的可用区名称
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    public NodeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NodeInfo(NodeInfo source) {
        if (source.NodeType != null) {
            this.NodeType = new Long(source.NodeType);
        }
        if (source.NodeId != null) {
            this.NodeId = new Long(source.NodeId);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new Long(source.ZoneId);
        }
        if (source.ZoneName != null) {
            this.ZoneName = new String(source.ZoneName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamSimple(map, prefix + "NodeId", this.NodeId);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "ZoneName", this.ZoneName);

    }
}

