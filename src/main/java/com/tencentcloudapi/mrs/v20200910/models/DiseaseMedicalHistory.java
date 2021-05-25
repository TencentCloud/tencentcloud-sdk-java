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

public class DiseaseMedicalHistory extends AbstractModel{

    /**
    * 主病史
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MainDiseaseHistory")
    @Expose
    private String MainDiseaseHistory;

    /**
    * 过敏史
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AllergyHistory")
    @Expose
    private String AllergyHistory;

    /**
    * 传染疾病史
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InfectHistory")
    @Expose
    private String InfectHistory;

    /**
    * 手术史
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OperationHistory")
    @Expose
    private String OperationHistory;

    /**
    * 输血史
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TransfusionHistory")
    @Expose
    private String TransfusionHistory;

    /**
     * Get 主病史
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MainDiseaseHistory 主病史
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMainDiseaseHistory() {
        return this.MainDiseaseHistory;
    }

    /**
     * Set 主病史
注意：此字段可能返回 null，表示取不到有效值。
     * @param MainDiseaseHistory 主病史
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMainDiseaseHistory(String MainDiseaseHistory) {
        this.MainDiseaseHistory = MainDiseaseHistory;
    }

    /**
     * Get 过敏史
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AllergyHistory 过敏史
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAllergyHistory() {
        return this.AllergyHistory;
    }

    /**
     * Set 过敏史
注意：此字段可能返回 null，表示取不到有效值。
     * @param AllergyHistory 过敏史
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAllergyHistory(String AllergyHistory) {
        this.AllergyHistory = AllergyHistory;
    }

    /**
     * Get 传染疾病史
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InfectHistory 传染疾病史
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInfectHistory() {
        return this.InfectHistory;
    }

    /**
     * Set 传染疾病史
注意：此字段可能返回 null，表示取不到有效值。
     * @param InfectHistory 传染疾病史
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInfectHistory(String InfectHistory) {
        this.InfectHistory = InfectHistory;
    }

    /**
     * Get 手术史
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OperationHistory 手术史
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOperationHistory() {
        return this.OperationHistory;
    }

    /**
     * Set 手术史
注意：此字段可能返回 null，表示取不到有效值。
     * @param OperationHistory 手术史
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOperationHistory(String OperationHistory) {
        this.OperationHistory = OperationHistory;
    }

    /**
     * Get 输血史
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TransfusionHistory 输血史
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTransfusionHistory() {
        return this.TransfusionHistory;
    }

    /**
     * Set 输血史
注意：此字段可能返回 null，表示取不到有效值。
     * @param TransfusionHistory 输血史
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTransfusionHistory(String TransfusionHistory) {
        this.TransfusionHistory = TransfusionHistory;
    }

    public DiseaseMedicalHistory() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DiseaseMedicalHistory(DiseaseMedicalHistory source) {
        if (source.MainDiseaseHistory != null) {
            this.MainDiseaseHistory = new String(source.MainDiseaseHistory);
        }
        if (source.AllergyHistory != null) {
            this.AllergyHistory = new String(source.AllergyHistory);
        }
        if (source.InfectHistory != null) {
            this.InfectHistory = new String(source.InfectHistory);
        }
        if (source.OperationHistory != null) {
            this.OperationHistory = new String(source.OperationHistory);
        }
        if (source.TransfusionHistory != null) {
            this.TransfusionHistory = new String(source.TransfusionHistory);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MainDiseaseHistory", this.MainDiseaseHistory);
        this.setParamSimple(map, prefix + "AllergyHistory", this.AllergyHistory);
        this.setParamSimple(map, prefix + "InfectHistory", this.InfectHistory);
        this.setParamSimple(map, prefix + "OperationHistory", this.OperationHistory);
        this.setParamSimple(map, prefix + "TransfusionHistory", this.TransfusionHistory);

    }
}

