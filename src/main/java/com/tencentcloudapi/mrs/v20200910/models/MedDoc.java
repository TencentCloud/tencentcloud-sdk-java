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

public class MedDoc extends AbstractModel{

    /**
    * “”
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Advice")
    @Expose
    private Advice Advice;

    /**
    * “”
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Diagnosis")
    @Expose
    private DiagCertItem [] Diagnosis;

    /**
    * “”
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DiseaseMedicalHistory")
    @Expose
    private DiseaseMedicalHistory DiseaseMedicalHistory;

    /**
    * “”
    */
    @SerializedName("PersonalMedicalHistory")
    @Expose
    private PersonalMedicalHistory PersonalMedicalHistory;

    /**
    * “”
    */
    @SerializedName("ObstericalMedicalHistory")
    @Expose
    private ObstericalMedicalHistory ObstericalMedicalHistory;

    /**
    * “”
    */
    @SerializedName("FamilyMedicalHistory")
    @Expose
    private FamilyMedicalHistory FamilyMedicalHistory;

    /**
    * “”
    */
    @SerializedName("MenstrualMedicalHistory")
    @Expose
    private MenstrualMedicalHistory MenstrualMedicalHistory;

    /**
    * “”
    */
    @SerializedName("TreatmentRecord")
    @Expose
    private TreatmentRecord TreatmentRecord;

    /**
     * Get “”
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Advice “”
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Advice getAdvice() {
        return this.Advice;
    }

    /**
     * Set “”
注意：此字段可能返回 null，表示取不到有效值。
     * @param Advice “”
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAdvice(Advice Advice) {
        this.Advice = Advice;
    }

    /**
     * Get “”
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Diagnosis “”
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DiagCertItem [] getDiagnosis() {
        return this.Diagnosis;
    }

    /**
     * Set “”
注意：此字段可能返回 null，表示取不到有效值。
     * @param Diagnosis “”
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiagnosis(DiagCertItem [] Diagnosis) {
        this.Diagnosis = Diagnosis;
    }

    /**
     * Get “”
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DiseaseMedicalHistory “”
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DiseaseMedicalHistory getDiseaseMedicalHistory() {
        return this.DiseaseMedicalHistory;
    }

    /**
     * Set “”
注意：此字段可能返回 null，表示取不到有效值。
     * @param DiseaseMedicalHistory “”
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiseaseMedicalHistory(DiseaseMedicalHistory DiseaseMedicalHistory) {
        this.DiseaseMedicalHistory = DiseaseMedicalHistory;
    }

    /**
     * Get “” 
     * @return PersonalMedicalHistory “”
     */
    public PersonalMedicalHistory getPersonalMedicalHistory() {
        return this.PersonalMedicalHistory;
    }

    /**
     * Set “”
     * @param PersonalMedicalHistory “”
     */
    public void setPersonalMedicalHistory(PersonalMedicalHistory PersonalMedicalHistory) {
        this.PersonalMedicalHistory = PersonalMedicalHistory;
    }

    /**
     * Get “” 
     * @return ObstericalMedicalHistory “”
     */
    public ObstericalMedicalHistory getObstericalMedicalHistory() {
        return this.ObstericalMedicalHistory;
    }

    /**
     * Set “”
     * @param ObstericalMedicalHistory “”
     */
    public void setObstericalMedicalHistory(ObstericalMedicalHistory ObstericalMedicalHistory) {
        this.ObstericalMedicalHistory = ObstericalMedicalHistory;
    }

    /**
     * Get “” 
     * @return FamilyMedicalHistory “”
     */
    public FamilyMedicalHistory getFamilyMedicalHistory() {
        return this.FamilyMedicalHistory;
    }

    /**
     * Set “”
     * @param FamilyMedicalHistory “”
     */
    public void setFamilyMedicalHistory(FamilyMedicalHistory FamilyMedicalHistory) {
        this.FamilyMedicalHistory = FamilyMedicalHistory;
    }

    /**
     * Get “” 
     * @return MenstrualMedicalHistory “”
     */
    public MenstrualMedicalHistory getMenstrualMedicalHistory() {
        return this.MenstrualMedicalHistory;
    }

    /**
     * Set “”
     * @param MenstrualMedicalHistory “”
     */
    public void setMenstrualMedicalHistory(MenstrualMedicalHistory MenstrualMedicalHistory) {
        this.MenstrualMedicalHistory = MenstrualMedicalHistory;
    }

    /**
     * Get “” 
     * @return TreatmentRecord “”
     */
    public TreatmentRecord getTreatmentRecord() {
        return this.TreatmentRecord;
    }

    /**
     * Set “”
     * @param TreatmentRecord “”
     */
    public void setTreatmentRecord(TreatmentRecord TreatmentRecord) {
        this.TreatmentRecord = TreatmentRecord;
    }

    public MedDoc() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MedDoc(MedDoc source) {
        if (source.Advice != null) {
            this.Advice = new Advice(source.Advice);
        }
        if (source.Diagnosis != null) {
            this.Diagnosis = new DiagCertItem[source.Diagnosis.length];
            for (int i = 0; i < source.Diagnosis.length; i++) {
                this.Diagnosis[i] = new DiagCertItem(source.Diagnosis[i]);
            }
        }
        if (source.DiseaseMedicalHistory != null) {
            this.DiseaseMedicalHistory = new DiseaseMedicalHistory(source.DiseaseMedicalHistory);
        }
        if (source.PersonalMedicalHistory != null) {
            this.PersonalMedicalHistory = new PersonalMedicalHistory(source.PersonalMedicalHistory);
        }
        if (source.ObstericalMedicalHistory != null) {
            this.ObstericalMedicalHistory = new ObstericalMedicalHistory(source.ObstericalMedicalHistory);
        }
        if (source.FamilyMedicalHistory != null) {
            this.FamilyMedicalHistory = new FamilyMedicalHistory(source.FamilyMedicalHistory);
        }
        if (source.MenstrualMedicalHistory != null) {
            this.MenstrualMedicalHistory = new MenstrualMedicalHistory(source.MenstrualMedicalHistory);
        }
        if (source.TreatmentRecord != null) {
            this.TreatmentRecord = new TreatmentRecord(source.TreatmentRecord);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Advice.", this.Advice);
        this.setParamArrayObj(map, prefix + "Diagnosis.", this.Diagnosis);
        this.setParamObj(map, prefix + "DiseaseMedicalHistory.", this.DiseaseMedicalHistory);
        this.setParamObj(map, prefix + "PersonalMedicalHistory.", this.PersonalMedicalHistory);
        this.setParamObj(map, prefix + "ObstericalMedicalHistory.", this.ObstericalMedicalHistory);
        this.setParamObj(map, prefix + "FamilyMedicalHistory.", this.FamilyMedicalHistory);
        this.setParamObj(map, prefix + "MenstrualMedicalHistory.", this.MenstrualMedicalHistory);
        this.setParamObj(map, prefix + "TreatmentRecord.", this.TreatmentRecord);

    }
}

