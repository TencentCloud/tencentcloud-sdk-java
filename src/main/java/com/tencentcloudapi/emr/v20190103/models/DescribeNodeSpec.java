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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeNodeSpec extends AbstractModel {

    /**
    * 节点类型
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
    * 节点类型名称
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
    * Types数组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Types")
    @Expose
    private NodeSpecType [] Types;

    /**
    * 云托管节点机型规格列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CmnTypes")
    @Expose
    private NodeSpecType [] CmnTypes;

    /**
     * Get 节点类型 
     * @return NodeType 节点类型
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set 节点类型
     * @param NodeType 节点类型
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get 节点类型名称 
     * @return NodeName 节点类型名称
     */
    public String getNodeName() {
        return this.NodeName;
    }

    /**
     * Set 节点类型名称
     * @param NodeName 节点类型名称
     */
    public void setNodeName(String NodeName) {
        this.NodeName = NodeName;
    }

    /**
     * Get Types数组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Types Types数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public NodeSpecType [] getTypes() {
        return this.Types;
    }

    /**
     * Set Types数组
注意：此字段可能返回 null，表示取不到有效值。
     * @param Types Types数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTypes(NodeSpecType [] Types) {
        this.Types = Types;
    }

    /**
     * Get 云托管节点机型规格列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CmnTypes 云托管节点机型规格列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public NodeSpecType [] getCmnTypes() {
        return this.CmnTypes;
    }

    /**
     * Set 云托管节点机型规格列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param CmnTypes 云托管节点机型规格列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCmnTypes(NodeSpecType [] CmnTypes) {
        this.CmnTypes = CmnTypes;
    }

    public DescribeNodeSpec() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeNodeSpec(DescribeNodeSpec source) {
        if (source.NodeType != null) {
            this.NodeType = new String(source.NodeType);
        }
        if (source.NodeName != null) {
            this.NodeName = new String(source.NodeName);
        }
        if (source.Types != null) {
            this.Types = new NodeSpecType[source.Types.length];
            for (int i = 0; i < source.Types.length; i++) {
                this.Types[i] = new NodeSpecType(source.Types[i]);
            }
        }
        if (source.CmnTypes != null) {
            this.CmnTypes = new NodeSpecType[source.CmnTypes.length];
            for (int i = 0; i < source.CmnTypes.length; i++) {
                this.CmnTypes[i] = new NodeSpecType(source.CmnTypes[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamSimple(map, prefix + "NodeName", this.NodeName);
        this.setParamArrayObj(map, prefix + "Types.", this.Types);
        this.setParamArrayObj(map, prefix + "CmnTypes.", this.CmnTypes);

    }
}

