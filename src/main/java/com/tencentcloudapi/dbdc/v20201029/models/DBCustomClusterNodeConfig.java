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
package com.tencentcloudapi.dbdc.v20201029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DBCustomClusterNodeConfig extends AbstractModel {

    /**
    * <p>节点ID</p>
    */
    @SerializedName("NodeId")
    @Expose
    private String NodeId;

    /**
    * <p>节点的标签信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Labels")
    @Expose
    private Label [] Labels;

    /**
    * <p>节点的污点信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Taints")
    @Expose
    private Taint [] Taints;

    /**
     * Get <p>节点ID</p> 
     * @return NodeId <p>节点ID</p>
     */
    public String getNodeId() {
        return this.NodeId;
    }

    /**
     * Set <p>节点ID</p>
     * @param NodeId <p>节点ID</p>
     */
    public void setNodeId(String NodeId) {
        this.NodeId = NodeId;
    }

    /**
     * Get <p>节点的标签信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Labels <p>节点的标签信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Label [] getLabels() {
        return this.Labels;
    }

    /**
     * Set <p>节点的标签信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Labels <p>节点的标签信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLabels(Label [] Labels) {
        this.Labels = Labels;
    }

    /**
     * Get <p>节点的污点信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Taints <p>节点的污点信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Taint [] getTaints() {
        return this.Taints;
    }

    /**
     * Set <p>节点的污点信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Taints <p>节点的污点信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaints(Taint [] Taints) {
        this.Taints = Taints;
    }

    public DBCustomClusterNodeConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DBCustomClusterNodeConfig(DBCustomClusterNodeConfig source) {
        if (source.NodeId != null) {
            this.NodeId = new String(source.NodeId);
        }
        if (source.Labels != null) {
            this.Labels = new Label[source.Labels.length];
            for (int i = 0; i < source.Labels.length; i++) {
                this.Labels[i] = new Label(source.Labels[i]);
            }
        }
        if (source.Taints != null) {
            this.Taints = new Taint[source.Taints.length];
            for (int i = 0; i < source.Taints.length; i++) {
                this.Taints[i] = new Taint(source.Taints[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NodeId", this.NodeId);
        this.setParamArrayObj(map, prefix + "Labels.", this.Labels);
        this.setParamArrayObj(map, prefix + "Taints.", this.Taints);

    }
}

