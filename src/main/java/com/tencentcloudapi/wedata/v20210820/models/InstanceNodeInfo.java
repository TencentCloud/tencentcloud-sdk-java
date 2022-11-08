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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceNodeInfo extends AbstractModel{

    /**
    * 读取节点SOURCE 写入节点SINK
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
    * 节点id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NodeId")
    @Expose
    private String NodeId;

    /**
    * 节点名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
     * Get 读取节点SOURCE 写入节点SINK
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NodeType 读取节点SOURCE 写入节点SINK
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set 读取节点SOURCE 写入节点SINK
注意：此字段可能返回 null，表示取不到有效值。
     * @param NodeType 读取节点SOURCE 写入节点SINK
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get 节点id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NodeId 节点id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNodeId() {
        return this.NodeId;
    }

    /**
     * Set 节点id
注意：此字段可能返回 null，表示取不到有效值。
     * @param NodeId 节点id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNodeId(String NodeId) {
        this.NodeId = NodeId;
    }

    /**
     * Get 节点名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NodeName 节点名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNodeName() {
        return this.NodeName;
    }

    /**
     * Set 节点名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param NodeName 节点名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNodeName(String NodeName) {
        this.NodeName = NodeName;
    }

    public InstanceNodeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceNodeInfo(InstanceNodeInfo source) {
        if (source.NodeType != null) {
            this.NodeType = new String(source.NodeType);
        }
        if (source.NodeId != null) {
            this.NodeId = new String(source.NodeId);
        }
        if (source.NodeName != null) {
            this.NodeName = new String(source.NodeName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamSimple(map, prefix + "NodeId", this.NodeId);
        this.setParamSimple(map, prefix + "NodeName", this.NodeName);

    }
}

