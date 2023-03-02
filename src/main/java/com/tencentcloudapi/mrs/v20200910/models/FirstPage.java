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

public class FirstPage extends AbstractModel{

    /**
    * 出入院诊断
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DischargeDiagnosis")
    @Expose
    private DischargeDiagnosis [] DischargeDiagnosis;

    /**
    * 病理诊断
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PathologicalDiagnosis")
    @Expose
    private BlockInfo PathologicalDiagnosis;

    /**
    * 临床诊断
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClinicalDiagnosis")
    @Expose
    private BlockInfo ClinicalDiagnosis;

    /**
    * 受伤中毒的外部原因
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DamagePoi")
    @Expose
    private BlockInfoV2 DamagePoi;

    /**
    * 病案首页第二页
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Fp2NdItems")
    @Expose
    private Fp2NdItem [] Fp2NdItems;

    /**
     * Get 出入院诊断
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DischargeDiagnosis 出入院诊断
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DischargeDiagnosis [] getDischargeDiagnosis() {
        return this.DischargeDiagnosis;
    }

    /**
     * Set 出入院诊断
注意：此字段可能返回 null，表示取不到有效值。
     * @param DischargeDiagnosis 出入院诊断
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDischargeDiagnosis(DischargeDiagnosis [] DischargeDiagnosis) {
        this.DischargeDiagnosis = DischargeDiagnosis;
    }

    /**
     * Get 病理诊断
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PathologicalDiagnosis 病理诊断
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BlockInfo getPathologicalDiagnosis() {
        return this.PathologicalDiagnosis;
    }

    /**
     * Set 病理诊断
注意：此字段可能返回 null，表示取不到有效值。
     * @param PathologicalDiagnosis 病理诊断
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPathologicalDiagnosis(BlockInfo PathologicalDiagnosis) {
        this.PathologicalDiagnosis = PathologicalDiagnosis;
    }

    /**
     * Get 临床诊断
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClinicalDiagnosis 临床诊断
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BlockInfo getClinicalDiagnosis() {
        return this.ClinicalDiagnosis;
    }

    /**
     * Set 临床诊断
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClinicalDiagnosis 临床诊断
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClinicalDiagnosis(BlockInfo ClinicalDiagnosis) {
        this.ClinicalDiagnosis = ClinicalDiagnosis;
    }

    /**
     * Get 受伤中毒的外部原因
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DamagePoi 受伤中毒的外部原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BlockInfoV2 getDamagePoi() {
        return this.DamagePoi;
    }

    /**
     * Set 受伤中毒的外部原因
注意：此字段可能返回 null，表示取不到有效值。
     * @param DamagePoi 受伤中毒的外部原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDamagePoi(BlockInfoV2 DamagePoi) {
        this.DamagePoi = DamagePoi;
    }

    /**
     * Get 病案首页第二页
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Fp2NdItems 病案首页第二页
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Fp2NdItem [] getFp2NdItems() {
        return this.Fp2NdItems;
    }

    /**
     * Set 病案首页第二页
注意：此字段可能返回 null，表示取不到有效值。
     * @param Fp2NdItems 病案首页第二页
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFp2NdItems(Fp2NdItem [] Fp2NdItems) {
        this.Fp2NdItems = Fp2NdItems;
    }

    public FirstPage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FirstPage(FirstPage source) {
        if (source.DischargeDiagnosis != null) {
            this.DischargeDiagnosis = new DischargeDiagnosis[source.DischargeDiagnosis.length];
            for (int i = 0; i < source.DischargeDiagnosis.length; i++) {
                this.DischargeDiagnosis[i] = new DischargeDiagnosis(source.DischargeDiagnosis[i]);
            }
        }
        if (source.PathologicalDiagnosis != null) {
            this.PathologicalDiagnosis = new BlockInfo(source.PathologicalDiagnosis);
        }
        if (source.ClinicalDiagnosis != null) {
            this.ClinicalDiagnosis = new BlockInfo(source.ClinicalDiagnosis);
        }
        if (source.DamagePoi != null) {
            this.DamagePoi = new BlockInfoV2(source.DamagePoi);
        }
        if (source.Fp2NdItems != null) {
            this.Fp2NdItems = new Fp2NdItem[source.Fp2NdItems.length];
            for (int i = 0; i < source.Fp2NdItems.length; i++) {
                this.Fp2NdItems[i] = new Fp2NdItem(source.Fp2NdItems[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "DischargeDiagnosis.", this.DischargeDiagnosis);
        this.setParamObj(map, prefix + "PathologicalDiagnosis.", this.PathologicalDiagnosis);
        this.setParamObj(map, prefix + "ClinicalDiagnosis.", this.ClinicalDiagnosis);
        this.setParamObj(map, prefix + "DamagePoi.", this.DamagePoi);
        this.setParamArrayObj(map, prefix + "Fp2NdItems.", this.Fp2NdItems);

    }
}

