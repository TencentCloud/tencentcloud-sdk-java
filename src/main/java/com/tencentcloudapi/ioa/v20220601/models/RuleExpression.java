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
package com.tencentcloudapi.ioa.v20220601.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RuleExpression extends AbstractModel {

    /**
    * 规则元数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Items")
    @Expose
    private RuleItem [] Items;

    /**
    * 关系
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Relation")
    @Expose
    private String Relation;

    /**
     * Get 规则元数据
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Items 规则元数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RuleItem [] getItems() {
        return this.Items;
    }

    /**
     * Set 规则元数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param Items 规则元数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setItems(RuleItem [] Items) {
        this.Items = Items;
    }

    /**
     * Get 关系
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Relation 关系
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRelation() {
        return this.Relation;
    }

    /**
     * Set 关系
注意：此字段可能返回 null，表示取不到有效值。
     * @param Relation 关系
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRelation(String Relation) {
        this.Relation = Relation;
    }

    public RuleExpression() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleExpression(RuleExpression source) {
        if (source.Items != null) {
            this.Items = new RuleItem[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new RuleItem(source.Items[i]);
            }
        }
        if (source.Relation != null) {
            this.Relation = new String(source.Relation);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Items.", this.Items);
        this.setParamSimple(map, prefix + "Relation", this.Relation);

    }
}

