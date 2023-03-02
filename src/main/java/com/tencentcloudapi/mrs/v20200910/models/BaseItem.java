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

public class BaseItem extends AbstractModel{

    /**
    * 类型名称
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
    * 别名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * 四点坐标
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Coords")
    @Expose
    private Coord [] Coords;

    /**
     * Get 类型名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 类型名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 类型名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 类型名称
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
     * Get 别名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Alias 别名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set 别名
注意：此字段可能返回 null，表示取不到有效值。
     * @param Alias 别名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
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

    public BaseItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BaseItem(BaseItem source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Src != null) {
            this.Src = new String(source.Src);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.Alias != null) {
            this.Alias = new String(source.Alias);
        }
        if (source.Coords != null) {
            this.Coords = new Coord[source.Coords.length];
            for (int i = 0; i < source.Coords.length; i++) {
                this.Coords[i] = new Coord(source.Coords[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Src", this.Src);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "Alias", this.Alias);
        this.setParamArrayObj(map, prefix + "Coords.", this.Coords);

    }
}

