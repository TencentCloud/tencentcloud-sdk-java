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

public class DiseaseHistoryBlock extends AbstractModel{

    /**
    * 主要病史
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MainDiseaseHistory")
    @Expose
    private MainDiseaseHistoryBlock MainDiseaseHistory;

    /**
    * 过敏史
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AllergyHistory")
    @Expose
    private MainDiseaseHistoryBlock AllergyHistory;

    /**
    * 注射史
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InfectHistory")
    @Expose
    private MainDiseaseHistoryBlock InfectHistory;

    /**
    * 手术史
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SurgeryHistory")
    @Expose
    private SurgeryHistoryBlock SurgeryHistory;

    /**
    * 输血史
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TransfusionHistory")
    @Expose
    private TransfusionHistoryBlock TransfusionHistory;

    /**
     * Get 主要病史
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MainDiseaseHistory 主要病史
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MainDiseaseHistoryBlock getMainDiseaseHistory() {
        return this.MainDiseaseHistory;
    }

    /**
     * Set 主要病史
注意：此字段可能返回 null，表示取不到有效值。
     * @param MainDiseaseHistory 主要病史
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMainDiseaseHistory(MainDiseaseHistoryBlock MainDiseaseHistory) {
        this.MainDiseaseHistory = MainDiseaseHistory;
    }

    /**
     * Get 过敏史
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AllergyHistory 过敏史
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MainDiseaseHistoryBlock getAllergyHistory() {
        return this.AllergyHistory;
    }

    /**
     * Set 过敏史
注意：此字段可能返回 null，表示取不到有效值。
     * @param AllergyHistory 过敏史
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAllergyHistory(MainDiseaseHistoryBlock AllergyHistory) {
        this.AllergyHistory = AllergyHistory;
    }

    /**
     * Get 注射史
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InfectHistory 注射史
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MainDiseaseHistoryBlock getInfectHistory() {
        return this.InfectHistory;
    }

    /**
     * Set 注射史
注意：此字段可能返回 null，表示取不到有效值。
     * @param InfectHistory 注射史
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInfectHistory(MainDiseaseHistoryBlock InfectHistory) {
        this.InfectHistory = InfectHistory;
    }

    /**
     * Get 手术史
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SurgeryHistory 手术史
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SurgeryHistoryBlock getSurgeryHistory() {
        return this.SurgeryHistory;
    }

    /**
     * Set 手术史
注意：此字段可能返回 null，表示取不到有效值。
     * @param SurgeryHistory 手术史
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSurgeryHistory(SurgeryHistoryBlock SurgeryHistory) {
        this.SurgeryHistory = SurgeryHistory;
    }

    /**
     * Get 输血史
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TransfusionHistory 输血史
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TransfusionHistoryBlock getTransfusionHistory() {
        return this.TransfusionHistory;
    }

    /**
     * Set 输血史
注意：此字段可能返回 null，表示取不到有效值。
     * @param TransfusionHistory 输血史
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTransfusionHistory(TransfusionHistoryBlock TransfusionHistory) {
        this.TransfusionHistory = TransfusionHistory;
    }

    public DiseaseHistoryBlock() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DiseaseHistoryBlock(DiseaseHistoryBlock source) {
        if (source.MainDiseaseHistory != null) {
            this.MainDiseaseHistory = new MainDiseaseHistoryBlock(source.MainDiseaseHistory);
        }
        if (source.AllergyHistory != null) {
            this.AllergyHistory = new MainDiseaseHistoryBlock(source.AllergyHistory);
        }
        if (source.InfectHistory != null) {
            this.InfectHistory = new MainDiseaseHistoryBlock(source.InfectHistory);
        }
        if (source.SurgeryHistory != null) {
            this.SurgeryHistory = new SurgeryHistoryBlock(source.SurgeryHistory);
        }
        if (source.TransfusionHistory != null) {
            this.TransfusionHistory = new TransfusionHistoryBlock(source.TransfusionHistory);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "MainDiseaseHistory.", this.MainDiseaseHistory);
        this.setParamObj(map, prefix + "AllergyHistory.", this.AllergyHistory);
        this.setParamObj(map, prefix + "InfectHistory.", this.InfectHistory);
        this.setParamObj(map, prefix + "SurgeryHistory.", this.SurgeryHistory);
        this.setParamObj(map, prefix + "TransfusionHistory.", this.TransfusionHistory);

    }
}

