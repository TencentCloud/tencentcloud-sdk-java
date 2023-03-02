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

public class MolecularValue extends AbstractModel{

    /**
    * 外显子
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Exon")
    @Expose
    private String Exon;

    /**
    * 点位
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Position")
    @Expose
    private String Position;

    /**
    * 类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 阳性或阴性
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Positive")
    @Expose
    private String Positive;

    /**
    * 基因名称原文
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Src")
    @Expose
    private String Src;

    /**
     * Get 外显子
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Exon 外显子
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExon() {
        return this.Exon;
    }

    /**
     * Set 外显子
注意：此字段可能返回 null，表示取不到有效值。
     * @param Exon 外显子
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExon(String Exon) {
        this.Exon = Exon;
    }

    /**
     * Get 点位
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Position 点位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPosition() {
        return this.Position;
    }

    /**
     * Set 点位
注意：此字段可能返回 null，表示取不到有效值。
     * @param Position 点位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPosition(String Position) {
        this.Position = Position;
    }

    /**
     * Get 类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 阳性或阴性
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Positive 阳性或阴性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPositive() {
        return this.Positive;
    }

    /**
     * Set 阳性或阴性
注意：此字段可能返回 null，表示取不到有效值。
     * @param Positive 阳性或阴性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPositive(String Positive) {
        this.Positive = Positive;
    }

    /**
     * Get 基因名称原文
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Src 基因名称原文
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSrc() {
        return this.Src;
    }

    /**
     * Set 基因名称原文
注意：此字段可能返回 null，表示取不到有效值。
     * @param Src 基因名称原文
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSrc(String Src) {
        this.Src = Src;
    }

    public MolecularValue() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MolecularValue(MolecularValue source) {
        if (source.Exon != null) {
            this.Exon = new String(source.Exon);
        }
        if (source.Position != null) {
            this.Position = new String(source.Position);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Positive != null) {
            this.Positive = new String(source.Positive);
        }
        if (source.Src != null) {
            this.Src = new String(source.Src);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Exon", this.Exon);
        this.setParamSimple(map, prefix + "Position", this.Position);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Positive", this.Positive);
        this.setParamSimple(map, prefix + "Src", this.Src);

    }
}

