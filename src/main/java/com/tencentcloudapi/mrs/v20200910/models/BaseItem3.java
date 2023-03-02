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
package com.tencentcloudapi.mrs.v20200910.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BaseItem3 extends AbstractModel{

    /**
    * 类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 原始文本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Src")
    @Expose
    private String Src;

    /**
    * 归一化后值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * 四点坐标
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Coords")
    @Expose
    private Coord [] Coords;

    /**
    * 第几次
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Order")
    @Expose
    private Long Order;

    /**
     * Get 类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 原始文本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Src 原始文本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSrc() {
        return this.Src;
    }

    /**
     * Set 原始文本
注意：此字段可能返回 null，表示取不到有效值。
     * @param Src 原始文本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSrc(String Src) {
        this.Src = Src;
    }

    /**
     * Get 归一化后值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Value 归一化后值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 归一化后值
注意：此字段可能返回 null，表示取不到有效值。
     * @param Value 归一化后值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get 四点坐标
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Coords 四点坐标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Coord [] getCoords() {
        return this.Coords;
    }

    /**
     * Set 四点坐标
注意：此字段可能返回 null，表示取不到有效值。
     * @param Coords 四点坐标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCoords(Coord [] Coords) {
        this.Coords = Coords;
    }

    /**
     * Get 第几次
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Order 第几次
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOrder() {
        return this.Order;
    }

    /**
     * Set 第几次
注意：此字段可能返回 null，表示取不到有效值。
     * @param Order 第几次
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOrder(Long Order) {
        this.Order = Order;
    }

    public BaseItem3() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BaseItem3(BaseItem3 source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Src != null) {
            this.Src = new String(source.Src);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.Coords != null) {
            this.Coords = new Coord[source.Coords.length];
            for (int i = 0; i < source.Coords.length; i++) {
                this.Coords[i] = new Coord(source.Coords[i]);
            }
        }
        if (source.Order != null) {
            this.Order = new Long(source.Order);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Src", this.Src);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamArrayObj(map, prefix + "Coords.", this.Coords);
        this.setParamSimple(map, prefix + "Order", this.Order);

    }
}

