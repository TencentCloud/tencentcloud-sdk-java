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

public class DischargeInfoBlock extends AbstractModel{

    /**
    * 疾病史
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DiseaseHistory")
    @Expose
    private DiseaseHistoryBlock DiseaseHistory;

    /**
    * 个人史
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PersonalHistory")
    @Expose
    private PersonalHistoryBlock PersonalHistory;

    /**
    * 药物史
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DrugHistory")
    @Expose
    private DrugHistoryBlock DrugHistory;

    /**
    * 治疗相关
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TreatmentRecord")
    @Expose
    private TreatmentRecordBlock TreatmentRecord;

    /**
    * 文本段落
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParagraphBlock")
    @Expose
    private ParagraphBlock ParagraphBlock;

    /**
     * Get 疾病史
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DiseaseHistory 疾病史
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DiseaseHistoryBlock getDiseaseHistory() {
        return this.DiseaseHistory;
    }

    /**
     * Set 疾病史
注意：此字段可能返回 null，表示取不到有效值。
     * @param DiseaseHistory 疾病史
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiseaseHistory(DiseaseHistoryBlock DiseaseHistory) {
        this.DiseaseHistory = DiseaseHistory;
    }

    /**
     * Get 个人史
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PersonalHistory 个人史
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PersonalHistoryBlock getPersonalHistory() {
        return this.PersonalHistory;
    }

    /**
     * Set 个人史
注意：此字段可能返回 null，表示取不到有效值。
     * @param PersonalHistory 个人史
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPersonalHistory(PersonalHistoryBlock PersonalHistory) {
        this.PersonalHistory = PersonalHistory;
    }

    /**
     * Get 药物史
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DrugHistory 药物史
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DrugHistoryBlock getDrugHistory() {
        return this.DrugHistory;
    }

    /**
     * Set 药物史
注意：此字段可能返回 null，表示取不到有效值。
     * @param DrugHistory 药物史
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDrugHistory(DrugHistoryBlock DrugHistory) {
        this.DrugHistory = DrugHistory;
    }

    /**
     * Get 治疗相关
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TreatmentRecord 治疗相关
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TreatmentRecordBlock getTreatmentRecord() {
        return this.TreatmentRecord;
    }

    /**
     * Set 治疗相关
注意：此字段可能返回 null，表示取不到有效值。
     * @param TreatmentRecord 治疗相关
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTreatmentRecord(TreatmentRecordBlock TreatmentRecord) {
        this.TreatmentRecord = TreatmentRecord;
    }

    /**
     * Get 文本段落
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParagraphBlock 文本段落
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ParagraphBlock getParagraphBlock() {
        return this.ParagraphBlock;
    }

    /**
     * Set 文本段落
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParagraphBlock 文本段落
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParagraphBlock(ParagraphBlock ParagraphBlock) {
        this.ParagraphBlock = ParagraphBlock;
    }

    public DischargeInfoBlock() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DischargeInfoBlock(DischargeInfoBlock source) {
        if (source.DiseaseHistory != null) {
            this.DiseaseHistory = new DiseaseHistoryBlock(source.DiseaseHistory);
        }
        if (source.PersonalHistory != null) {
            this.PersonalHistory = new PersonalHistoryBlock(source.PersonalHistory);
        }
        if (source.DrugHistory != null) {
            this.DrugHistory = new DrugHistoryBlock(source.DrugHistory);
        }
        if (source.TreatmentRecord != null) {
            this.TreatmentRecord = new TreatmentRecordBlock(source.TreatmentRecord);
        }
        if (source.ParagraphBlock != null) {
            this.ParagraphBlock = new ParagraphBlock(source.ParagraphBlock);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "DiseaseHistory.", this.DiseaseHistory);
        this.setParamObj(map, prefix + "PersonalHistory.", this.PersonalHistory);
        this.setParamObj(map, prefix + "DrugHistory.", this.DrugHistory);
        this.setParamObj(map, prefix + "TreatmentRecord.", this.TreatmentRecord);
        this.setParamObj(map, prefix + "ParagraphBlock.", this.ParagraphBlock);

    }
}

