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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RunNodeInfo extends AbstractModel {

    /**
    * 节点类型，0:未指定，1:开始节点，2:API节点，3:询问节点，4:答案节点
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NodeType")
    @Expose
    private Long NodeType;

    /**
    * 节点ID
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
    * 请求的API
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InvokeApi")
    @Expose
    private InvokeAPI InvokeApi;

    /**
    * 当前节点的所有槽位的值，key：SlotID。没有值的时候也要返回空。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SlotValues")
    @Expose
    private ValueInfo [] SlotValues;

    /**
     * Get 节点类型，0:未指定，1:开始节点，2:API节点，3:询问节点，4:答案节点
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NodeType 节点类型，0:未指定，1:开始节点，2:API节点，3:询问节点，4:答案节点
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getNodeType() {
        return this.NodeType;
    }

    /**
     * Set 节点类型，0:未指定，1:开始节点，2:API节点，3:询问节点，4:答案节点
注意：此字段可能返回 null，表示取不到有效值。
     * @param NodeType 节点类型，0:未指定，1:开始节点，2:API节点，3:询问节点，4:答案节点
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNodeType(Long NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get 节点ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NodeId 节点ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNodeId() {
        return this.NodeId;
    }

    /**
     * Set 节点ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param NodeId 节点ID
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

    /**
     * Get 请求的API
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InvokeApi 请求的API
注意：此字段可能返回 null，表示取不到有效值。
     */
    public InvokeAPI getInvokeApi() {
        return this.InvokeApi;
    }

    /**
     * Set 请求的API
注意：此字段可能返回 null，表示取不到有效值。
     * @param InvokeApi 请求的API
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInvokeApi(InvokeAPI InvokeApi) {
        this.InvokeApi = InvokeApi;
    }

    /**
     * Get 当前节点的所有槽位的值，key：SlotID。没有值的时候也要返回空。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SlotValues 当前节点的所有槽位的值，key：SlotID。没有值的时候也要返回空。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ValueInfo [] getSlotValues() {
        return this.SlotValues;
    }

    /**
     * Set 当前节点的所有槽位的值，key：SlotID。没有值的时候也要返回空。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SlotValues 当前节点的所有槽位的值，key：SlotID。没有值的时候也要返回空。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSlotValues(ValueInfo [] SlotValues) {
        this.SlotValues = SlotValues;
    }

    public RunNodeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RunNodeInfo(RunNodeInfo source) {
        if (source.NodeType != null) {
            this.NodeType = new Long(source.NodeType);
        }
        if (source.NodeId != null) {
            this.NodeId = new String(source.NodeId);
        }
        if (source.NodeName != null) {
            this.NodeName = new String(source.NodeName);
        }
        if (source.InvokeApi != null) {
            this.InvokeApi = new InvokeAPI(source.InvokeApi);
        }
        if (source.SlotValues != null) {
            this.SlotValues = new ValueInfo[source.SlotValues.length];
            for (int i = 0; i < source.SlotValues.length; i++) {
                this.SlotValues[i] = new ValueInfo(source.SlotValues[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamSimple(map, prefix + "NodeId", this.NodeId);
        this.setParamSimple(map, prefix + "NodeName", this.NodeName);
        this.setParamObj(map, prefix + "InvokeApi.", this.InvokeApi);
        this.setParamArrayObj(map, prefix + "SlotValues.", this.SlotValues);

    }
}

