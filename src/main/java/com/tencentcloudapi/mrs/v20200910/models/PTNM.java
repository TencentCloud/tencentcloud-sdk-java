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

public class PTNM extends AbstractModel{

    /**
    * 项目名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 索引
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Index")
    @Expose
    private Long [] Index;

    /**
    * 原文
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Src")
    @Expose
    private String Src;

    /**
    * 归一化值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * pT
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PT")
    @Expose
    private String PT;

    /**
    * pN
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PN")
    @Expose
    private String PN;

    /**
    * pM
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PM")
    @Expose
    private String PM;

    /**
    * 原文对应坐标
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Coords")
    @Expose
    private Coord [] Coords;

    /**
     * Get 项目名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 项目名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 项目名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 项目名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 索引
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Index 索引
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getIndex() {
        return this.Index;
    }

    /**
     * Set 索引
注意：此字段可能返回 null，表示取不到有效值。
     * @param Index 索引
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIndex(Long [] Index) {
        this.Index = Index;
    }

    /**
     * Get 原文
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Src 原文
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSrc() {
        return this.Src;
    }

    /**
     * Set 原文
注意：此字段可能返回 null，表示取不到有效值。
     * @param Src 原文
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSrc(String Src) {
        this.Src = Src;
    }

    /**
     * Get 归一化值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Value 归一化值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 归一化值
注意：此字段可能返回 null，表示取不到有效值。
     * @param Value 归一化值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get pT
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PT pT
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPT() {
        return this.PT;
    }

    /**
     * Set pT
注意：此字段可能返回 null，表示取不到有效值。
     * @param PT pT
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPT(String PT) {
        this.PT = PT;
    }

    /**
     * Get pN
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PN pN
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPN() {
        return this.PN;
    }

    /**
     * Set pN
注意：此字段可能返回 null，表示取不到有效值。
     * @param PN pN
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPN(String PN) {
        this.PN = PN;
    }

    /**
     * Get pM
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PM pM
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPM() {
        return this.PM;
    }

    /**
     * Set pM
注意：此字段可能返回 null，表示取不到有效值。
     * @param PM pM
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPM(String PM) {
        this.PM = PM;
    }

    /**
     * Get 原文对应坐标
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Coords 原文对应坐标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Coord [] getCoords() {
        return this.Coords;
    }

    /**
     * Set 原文对应坐标
注意：此字段可能返回 null，表示取不到有效值。
     * @param Coords 原文对应坐标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCoords(Coord [] Coords) {
        this.Coords = Coords;
    }

    public PTNM() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PTNM(PTNM source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Index != null) {
            this.Index = new Long[source.Index.length];
            for (int i = 0; i < source.Index.length; i++) {
                this.Index[i] = new Long(source.Index[i]);
            }
        }
        if (source.Src != null) {
            this.Src = new String(source.Src);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.PT != null) {
            this.PT = new String(source.PT);
        }
        if (source.PN != null) {
            this.PN = new String(source.PN);
        }
        if (source.PM != null) {
            this.PM = new String(source.PM);
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
        this.setParamArraySimple(map, prefix + "Index.", this.Index);
        this.setParamSimple(map, prefix + "Src", this.Src);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "PT", this.PT);
        this.setParamSimple(map, prefix + "PN", this.PN);
        this.setParamSimple(map, prefix + "PM", this.PM);
        this.setParamArrayObj(map, prefix + "Coords.", this.Coords);

    }
}

