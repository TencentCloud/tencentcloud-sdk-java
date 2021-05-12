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
package com.tencentcloudapi.nlp.v20190408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TripleContent extends AbstractModel{

    /**
    * 实体流行度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Popular")
    @Expose
    private Long Popular;

    /**
    * 实体名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 实体order
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Order")
    @Expose
    private Long Order;

    /**
    * 实体id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
     * Get 实体流行度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Popular 实体流行度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPopular() {
        return this.Popular;
    }

    /**
     * Set 实体流行度
注意：此字段可能返回 null，表示取不到有效值。
     * @param Popular 实体流行度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPopular(Long Popular) {
        this.Popular = Popular;
    }

    /**
     * Get 实体名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 实体名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 实体名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 实体名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 实体order
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Order 实体order
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOrder() {
        return this.Order;
    }

    /**
     * Set 实体order
注意：此字段可能返回 null，表示取不到有效值。
     * @param Order 实体order
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOrder(Long Order) {
        this.Order = Order;
    }

    /**
     * Get 实体id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id 实体id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 实体id
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id 实体id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    public TripleContent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TripleContent(TripleContent source) {
        if (source.Popular != null) {
            this.Popular = new Long(source.Popular);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Order != null) {
            this.Order = new Long(source.Order);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Popular", this.Popular);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "Id", this.Id);

    }
}

