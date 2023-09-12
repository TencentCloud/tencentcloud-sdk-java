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

public class InternalMedicineAbdomenPancreas extends AbstractModel{

    /**
    * 胰腺总体描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Src")
    @Expose
    private KeyValueItem Src;

    /**
    * 胰腺大小
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Size")
    @Expose
    private KeyValueItem Size;

    /**
    * 胰腺触诊
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Palpation")
    @Expose
    private KeyValueItem Palpation;

    /**
    * 胰腺叩诊
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Percussion")
    @Expose
    private KeyValueItem Percussion;

    /**
    * 肝脏压痛
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tenderness")
    @Expose
    private KeyValueItem Tenderness;

    /**
    * 胰腺质地
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Consistency")
    @Expose
    private KeyValueItem Consistency;

    /**
     * Get 胰腺总体描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Src 胰腺总体描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public KeyValueItem getSrc() {
        return this.Src;
    }

    /**
     * Set 胰腺总体描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Src 胰腺总体描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSrc(KeyValueItem Src) {
        this.Src = Src;
    }

    /**
     * Get 胰腺大小
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Size 胰腺大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public KeyValueItem getSize() {
        return this.Size;
    }

    /**
     * Set 胰腺大小
注意：此字段可能返回 null，表示取不到有效值。
     * @param Size 胰腺大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSize(KeyValueItem Size) {
        this.Size = Size;
    }

    /**
     * Get 胰腺触诊
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Palpation 胰腺触诊
注意：此字段可能返回 null，表示取不到有效值。
     */
    public KeyValueItem getPalpation() {
        return this.Palpation;
    }

    /**
     * Set 胰腺触诊
注意：此字段可能返回 null，表示取不到有效值。
     * @param Palpation 胰腺触诊
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPalpation(KeyValueItem Palpation) {
        this.Palpation = Palpation;
    }

    /**
     * Get 胰腺叩诊
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Percussion 胰腺叩诊
注意：此字段可能返回 null，表示取不到有效值。
     */
    public KeyValueItem getPercussion() {
        return this.Percussion;
    }

    /**
     * Set 胰腺叩诊
注意：此字段可能返回 null，表示取不到有效值。
     * @param Percussion 胰腺叩诊
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPercussion(KeyValueItem Percussion) {
        this.Percussion = Percussion;
    }

    /**
     * Get 肝脏压痛
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tenderness 肝脏压痛
注意：此字段可能返回 null，表示取不到有效值。
     */
    public KeyValueItem getTenderness() {
        return this.Tenderness;
    }

    /**
     * Set 肝脏压痛
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tenderness 肝脏压痛
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTenderness(KeyValueItem Tenderness) {
        this.Tenderness = Tenderness;
    }

    /**
     * Get 胰腺质地
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Consistency 胰腺质地
注意：此字段可能返回 null，表示取不到有效值。
     */
    public KeyValueItem getConsistency() {
        return this.Consistency;
    }

    /**
     * Set 胰腺质地
注意：此字段可能返回 null，表示取不到有效值。
     * @param Consistency 胰腺质地
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConsistency(KeyValueItem Consistency) {
        this.Consistency = Consistency;
    }

    public InternalMedicineAbdomenPancreas() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InternalMedicineAbdomenPancreas(InternalMedicineAbdomenPancreas source) {
        if (source.Src != null) {
            this.Src = new KeyValueItem(source.Src);
        }
        if (source.Size != null) {
            this.Size = new KeyValueItem(source.Size);
        }
        if (source.Palpation != null) {
            this.Palpation = new KeyValueItem(source.Palpation);
        }
        if (source.Percussion != null) {
            this.Percussion = new KeyValueItem(source.Percussion);
        }
        if (source.Tenderness != null) {
            this.Tenderness = new KeyValueItem(source.Tenderness);
        }
        if (source.Consistency != null) {
            this.Consistency = new KeyValueItem(source.Consistency);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Src.", this.Src);
        this.setParamObj(map, prefix + "Size.", this.Size);
        this.setParamObj(map, prefix + "Palpation.", this.Palpation);
        this.setParamObj(map, prefix + "Percussion.", this.Percussion);
        this.setParamObj(map, prefix + "Tenderness.", this.Tenderness);
        this.setParamObj(map, prefix + "Consistency.", this.Consistency);

    }
}

