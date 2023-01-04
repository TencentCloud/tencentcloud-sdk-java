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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NodeDetailPriceResult extends AbstractModel{

    /**
    * 节点类型 master core task common router mysql
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
    * 节点组成部分价格详情
    */
    @SerializedName("PartDetailPrice")
    @Expose
    private PartDetailPriceItem [] PartDetailPrice;

    /**
     * Get 节点类型 master core task common router mysql
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NodeType 节点类型 master core task common router mysql
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set 节点类型 master core task common router mysql
注意：此字段可能返回 null，表示取不到有效值。
     * @param NodeType 节点类型 master core task common router mysql
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get 节点组成部分价格详情 
     * @return PartDetailPrice 节点组成部分价格详情
     */
    public PartDetailPriceItem [] getPartDetailPrice() {
        return this.PartDetailPrice;
    }

    /**
     * Set 节点组成部分价格详情
     * @param PartDetailPrice 节点组成部分价格详情
     */
    public void setPartDetailPrice(PartDetailPriceItem [] PartDetailPrice) {
        this.PartDetailPrice = PartDetailPrice;
    }

    public NodeDetailPriceResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NodeDetailPriceResult(NodeDetailPriceResult source) {
        if (source.NodeType != null) {
            this.NodeType = new String(source.NodeType);
        }
        if (source.PartDetailPrice != null) {
            this.PartDetailPrice = new PartDetailPriceItem[source.PartDetailPrice.length];
            for (int i = 0; i < source.PartDetailPrice.length; i++) {
                this.PartDetailPrice[i] = new PartDetailPriceItem(source.PartDetailPrice[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamArrayObj(map, prefix + "PartDetailPrice.", this.PartDetailPrice);

    }
}

