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

public class BytesSpeed extends AbstractModel{

    /**
    * 节点类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
    * 节点名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
    * 速度值列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Values")
    @Expose
    private SpeedValue [] Values;

    /**
     * Get 节点类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NodeType 节点类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set 节点类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param NodeType 节点类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
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
     * Get 速度值列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Values 速度值列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SpeedValue [] getValues() {
        return this.Values;
    }

    /**
     * Set 速度值列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Values 速度值列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValues(SpeedValue [] Values) {
        this.Values = Values;
    }

    public BytesSpeed() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BytesSpeed(BytesSpeed source) {
        if (source.NodeType != null) {
            this.NodeType = new String(source.NodeType);
        }
        if (source.NodeName != null) {
            this.NodeName = new String(source.NodeName);
        }
        if (source.Values != null) {
            this.Values = new SpeedValue[source.Values.length];
            for (int i = 0; i < source.Values.length; i++) {
                this.Values[i] = new SpeedValue(source.Values[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamSimple(map, prefix + "NodeName", this.NodeName);
        this.setParamArrayObj(map, prefix + "Values.", this.Values);

    }
}

