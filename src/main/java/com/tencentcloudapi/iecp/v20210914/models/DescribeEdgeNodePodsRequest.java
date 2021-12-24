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

public class DescribeEdgeNodePodsRequest extends AbstractModel{

    /**
    * IECP边缘单元ID
    */
    @SerializedName("EdgeUnitId")
    @Expose
    private Long EdgeUnitId;

    /**
    * 节点ID
    */
    @SerializedName("NodeId")
    @Expose
    private Long NodeId;

    /**
    * 命名空间
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * Pod名称过滤串
    */
    @SerializedName("PodNamePattern")
    @Expose
    private String PodNamePattern;

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
     * Get 节点ID 
     * @return NodeId 节点ID
     */
    public Long getNodeId() {
        return this.NodeId;
    }

    /**
     * Set 节点ID
     * @param NodeId 节点ID
     */
    public void setNodeId(Long NodeId) {
        this.NodeId = NodeId;
    }

    /**
     * Get 命名空间 
     * @return Namespace 命名空间
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 命名空间
     * @param Namespace 命名空间
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get Pod名称过滤串 
     * @return PodNamePattern Pod名称过滤串
     */
    public String getPodNamePattern() {
        return this.PodNamePattern;
    }

    /**
     * Set Pod名称过滤串
     * @param PodNamePattern Pod名称过滤串
     */
    public void setPodNamePattern(String PodNamePattern) {
        this.PodNamePattern = PodNamePattern;
    }

    public DescribeEdgeNodePodsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeEdgeNodePodsRequest(DescribeEdgeNodePodsRequest source) {
        if (source.EdgeUnitId != null) {
            this.EdgeUnitId = new Long(source.EdgeUnitId);
        }
        if (source.NodeId != null) {
            this.NodeId = new Long(source.NodeId);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.PodNamePattern != null) {
            this.PodNamePattern = new String(source.PodNamePattern);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EdgeUnitId", this.EdgeUnitId);
        this.setParamSimple(map, prefix + "NodeId", this.NodeId);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "PodNamePattern", this.PodNamePattern);

    }
}

