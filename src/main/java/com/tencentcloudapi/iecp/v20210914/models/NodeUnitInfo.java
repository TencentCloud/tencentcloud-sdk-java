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

public class NodeUnitInfo extends AbstractModel{

    /**
    * NodeUnitId
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * NodeUnit名称
    */
    @SerializedName("NodeUnitName")
    @Expose
    private String NodeUnitName;

    /**
    * 包含节点列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NodeList")
    @Expose
    private NodeUnitNodeInfo [] NodeList;

    /**
     * Get NodeUnitId 
     * @return Id NodeUnitId
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set NodeUnitId
     * @param Id NodeUnitId
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get NodeUnit名称 
     * @return NodeUnitName NodeUnit名称
     */
    public String getNodeUnitName() {
        return this.NodeUnitName;
    }

    /**
     * Set NodeUnit名称
     * @param NodeUnitName NodeUnit名称
     */
    public void setNodeUnitName(String NodeUnitName) {
        this.NodeUnitName = NodeUnitName;
    }

    /**
     * Get 包含节点列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NodeList 包含节点列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public NodeUnitNodeInfo [] getNodeList() {
        return this.NodeList;
    }

    /**
     * Set 包含节点列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param NodeList 包含节点列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNodeList(NodeUnitNodeInfo [] NodeList) {
        this.NodeList = NodeList;
    }

    public NodeUnitInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NodeUnitInfo(NodeUnitInfo source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.NodeUnitName != null) {
            this.NodeUnitName = new String(source.NodeUnitName);
        }
        if (source.NodeList != null) {
            this.NodeList = new NodeUnitNodeInfo[source.NodeList.length];
            for (int i = 0; i < source.NodeList.length; i++) {
                this.NodeList[i] = new NodeUnitNodeInfo(source.NodeList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "NodeUnitName", this.NodeUnitName);
        this.setParamArrayObj(map, prefix + "NodeList.", this.NodeList);

    }
}

