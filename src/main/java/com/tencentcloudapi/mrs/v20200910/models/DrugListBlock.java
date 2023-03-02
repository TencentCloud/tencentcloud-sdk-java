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

public class DrugListBlock extends AbstractModel{

    /**
    * 通用名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CommonName")
    @Expose
    private String CommonName;

    /**
    * 商品名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TradeName")
    @Expose
    private String TradeName;

    /**
    * 用法用量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Dosage")
    @Expose
    private DosageBlock Dosage;

    /**
    * 值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
     * Get 通用名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CommonName 通用名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCommonName() {
        return this.CommonName;
    }

    /**
     * Set 通用名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param CommonName 通用名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCommonName(String CommonName) {
        this.CommonName = CommonName;
    }

    /**
     * Get 商品名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TradeName 商品名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTradeName() {
        return this.TradeName;
    }

    /**
     * Set 商品名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param TradeName 商品名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTradeName(String TradeName) {
        this.TradeName = TradeName;
    }

    /**
     * Get 用法用量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Dosage 用法用量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DosageBlock getDosage() {
        return this.Dosage;
    }

    /**
     * Set 用法用量
注意：此字段可能返回 null，表示取不到有效值。
     * @param Dosage 用法用量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDosage(DosageBlock Dosage) {
        this.Dosage = Dosage;
    }

    /**
     * Get 值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Value 值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 值
注意：此字段可能返回 null，表示取不到有效值。
     * @param Value 值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    public DrugListBlock() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DrugListBlock(DrugListBlock source) {
        if (source.CommonName != null) {
            this.CommonName = new String(source.CommonName);
        }
        if (source.TradeName != null) {
            this.TradeName = new String(source.TradeName);
        }
        if (source.Dosage != null) {
            this.Dosage = new DosageBlock(source.Dosage);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CommonName", this.CommonName);
        this.setParamSimple(map, prefix + "TradeName", this.TradeName);
        this.setParamObj(map, prefix + "Dosage.", this.Dosage);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}

