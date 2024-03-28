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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OutboundPublicAcl extends AbstractModel {

    /**
    * 允许节点出站访问的节点类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
    * 允许节点出站访问的白名单
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WhiteHostList")
    @Expose
    private String [] WhiteHostList;

    /**
     * Get 允许节点出站访问的节点类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NodeType 允许节点出站访问的节点类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set 允许节点出站访问的节点类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param NodeType 允许节点出站访问的节点类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get 允许节点出站访问的白名单
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WhiteHostList 允许节点出站访问的白名单
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getWhiteHostList() {
        return this.WhiteHostList;
    }

    /**
     * Set 允许节点出站访问的白名单
注意：此字段可能返回 null，表示取不到有效值。
     * @param WhiteHostList 允许节点出站访问的白名单
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWhiteHostList(String [] WhiteHostList) {
        this.WhiteHostList = WhiteHostList;
    }

    public OutboundPublicAcl() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OutboundPublicAcl(OutboundPublicAcl source) {
        if (source.NodeType != null) {
            this.NodeType = new String(source.NodeType);
        }
        if (source.WhiteHostList != null) {
            this.WhiteHostList = new String[source.WhiteHostList.length];
            for (int i = 0; i < source.WhiteHostList.length; i++) {
                this.WhiteHostList[i] = new String(source.WhiteHostList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamArraySimple(map, prefix + "WhiteHostList.", this.WhiteHostList);

    }
}

