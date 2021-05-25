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

public class TreatmentRecord extends AbstractModel{

    /**
    * ""
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DmissionCondition")
    @Expose
    private String DmissionCondition;

    /**
    * ""
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChiefComplaint")
    @Expose
    private String ChiefComplaint;

    /**
    * ""
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DiseasePresent")
    @Expose
    private String DiseasePresent;

    /**
    * ""
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SymptomsAndSigns")
    @Expose
    private String SymptomsAndSigns;

    /**
    * “”
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AuxiliaryExamination")
    @Expose
    private String AuxiliaryExamination;

    /**
    * “”
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BodyExamination")
    @Expose
    private String BodyExamination;

    /**
    * “”
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SpecialistExamination")
    @Expose
    private String SpecialistExamination;

    /**
    * “”
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MentalExamination")
    @Expose
    private String MentalExamination;

    /**
    * “”
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CheckRecord")
    @Expose
    private String CheckRecord;

    /**
    * “”
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InspectResult")
    @Expose
    private String InspectResult;

    /**
    * “”
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IncisionHealing")
    @Expose
    private String IncisionHealing;

    /**
    * “”
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TreatmentSuggestion")
    @Expose
    private String TreatmentSuggestion;

    /**
    * “”
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FollowUpRequirements")
    @Expose
    private String FollowUpRequirements;

    /**
    * “”
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CheckAndTreatmentProcess")
    @Expose
    private String CheckAndTreatmentProcess;

    /**
    * “”
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SurgeryCondition")
    @Expose
    private String SurgeryCondition;

    /**
    * “”
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConditionChanges")
    @Expose
    private String ConditionChanges;

    /**
    * “”
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DischargeCondition")
    @Expose
    private String DischargeCondition;

    /**
    * “”
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PTNM")
    @Expose
    private String PTNM;

    /**
    * “”
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PTNMM")
    @Expose
    private String PTNMM;

    /**
    * “”
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PTNMN")
    @Expose
    private String PTNMN;

    /**
    * “”
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PTNMT")
    @Expose
    private String PTNMT;

    /**
    * “”
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ECOG")
    @Expose
    private String ECOG;

    /**
    * “”
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NRS")
    @Expose
    private String NRS;

    /**
    * “”
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KPS")
    @Expose
    private String KPS;

    /**
    * “”
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeathDate")
    @Expose
    private String DeathDate;

    /**
    * “”
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RelapseDate")
    @Expose
    private String RelapseDate;

    /**
    * “”
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ObservationDays")
    @Expose
    private String ObservationDays;

    /**
     * Get ""
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DmissionCondition ""
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDmissionCondition() {
        return this.DmissionCondition;
    }

    /**
     * Set ""
注意：此字段可能返回 null，表示取不到有效值。
     * @param DmissionCondition ""
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDmissionCondition(String DmissionCondition) {
        this.DmissionCondition = DmissionCondition;
    }

    /**
     * Get ""
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChiefComplaint ""
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getChiefComplaint() {
        return this.ChiefComplaint;
    }

    /**
     * Set ""
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChiefComplaint ""
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChiefComplaint(String ChiefComplaint) {
        this.ChiefComplaint = ChiefComplaint;
    }

    /**
     * Get ""
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DiseasePresent ""
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDiseasePresent() {
        return this.DiseasePresent;
    }

    /**
     * Set ""
注意：此字段可能返回 null，表示取不到有效值。
     * @param DiseasePresent ""
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiseasePresent(String DiseasePresent) {
        this.DiseasePresent = DiseasePresent;
    }

    /**
     * Get ""
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SymptomsAndSigns ""
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSymptomsAndSigns() {
        return this.SymptomsAndSigns;
    }

    /**
     * Set ""
注意：此字段可能返回 null，表示取不到有效值。
     * @param SymptomsAndSigns ""
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSymptomsAndSigns(String SymptomsAndSigns) {
        this.SymptomsAndSigns = SymptomsAndSigns;
    }

    /**
     * Get “”
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AuxiliaryExamination “”
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAuxiliaryExamination() {
        return this.AuxiliaryExamination;
    }

    /**
     * Set “”
注意：此字段可能返回 null，表示取不到有效值。
     * @param AuxiliaryExamination “”
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAuxiliaryExamination(String AuxiliaryExamination) {
        this.AuxiliaryExamination = AuxiliaryExamination;
    }

    /**
     * Get “”
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BodyExamination “”
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBodyExamination() {
        return this.BodyExamination;
    }

    /**
     * Set “”
注意：此字段可能返回 null，表示取不到有效值。
     * @param BodyExamination “”
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBodyExamination(String BodyExamination) {
        this.BodyExamination = BodyExamination;
    }

    /**
     * Get “”
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SpecialistExamination “”
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSpecialistExamination() {
        return this.SpecialistExamination;
    }

    /**
     * Set “”
注意：此字段可能返回 null，表示取不到有效值。
     * @param SpecialistExamination “”
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSpecialistExamination(String SpecialistExamination) {
        this.SpecialistExamination = SpecialistExamination;
    }

    /**
     * Get “”
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MentalExamination “”
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMentalExamination() {
        return this.MentalExamination;
    }

    /**
     * Set “”
注意：此字段可能返回 null，表示取不到有效值。
     * @param MentalExamination “”
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMentalExamination(String MentalExamination) {
        this.MentalExamination = MentalExamination;
    }

    /**
     * Get “”
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CheckRecord “”
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCheckRecord() {
        return this.CheckRecord;
    }

    /**
     * Set “”
注意：此字段可能返回 null，表示取不到有效值。
     * @param CheckRecord “”
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCheckRecord(String CheckRecord) {
        this.CheckRecord = CheckRecord;
    }

    /**
     * Get “”
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InspectResult “”
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInspectResult() {
        return this.InspectResult;
    }

    /**
     * Set “”
注意：此字段可能返回 null，表示取不到有效值。
     * @param InspectResult “”
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInspectResult(String InspectResult) {
        this.InspectResult = InspectResult;
    }

    /**
     * Get “”
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IncisionHealing “”
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIncisionHealing() {
        return this.IncisionHealing;
    }

    /**
     * Set “”
注意：此字段可能返回 null，表示取不到有效值。
     * @param IncisionHealing “”
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIncisionHealing(String IncisionHealing) {
        this.IncisionHealing = IncisionHealing;
    }

    /**
     * Get “”
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TreatmentSuggestion “”
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTreatmentSuggestion() {
        return this.TreatmentSuggestion;
    }

    /**
     * Set “”
注意：此字段可能返回 null，表示取不到有效值。
     * @param TreatmentSuggestion “”
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTreatmentSuggestion(String TreatmentSuggestion) {
        this.TreatmentSuggestion = TreatmentSuggestion;
    }

    /**
     * Get “”
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FollowUpRequirements “”
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFollowUpRequirements() {
        return this.FollowUpRequirements;
    }

    /**
     * Set “”
注意：此字段可能返回 null，表示取不到有效值。
     * @param FollowUpRequirements “”
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFollowUpRequirements(String FollowUpRequirements) {
        this.FollowUpRequirements = FollowUpRequirements;
    }

    /**
     * Get “”
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CheckAndTreatmentProcess “”
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCheckAndTreatmentProcess() {
        return this.CheckAndTreatmentProcess;
    }

    /**
     * Set “”
注意：此字段可能返回 null，表示取不到有效值。
     * @param CheckAndTreatmentProcess “”
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCheckAndTreatmentProcess(String CheckAndTreatmentProcess) {
        this.CheckAndTreatmentProcess = CheckAndTreatmentProcess;
    }

    /**
     * Get “”
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SurgeryCondition “”
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSurgeryCondition() {
        return this.SurgeryCondition;
    }

    /**
     * Set “”
注意：此字段可能返回 null，表示取不到有效值。
     * @param SurgeryCondition “”
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSurgeryCondition(String SurgeryCondition) {
        this.SurgeryCondition = SurgeryCondition;
    }

    /**
     * Get “”
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConditionChanges “”
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConditionChanges() {
        return this.ConditionChanges;
    }

    /**
     * Set “”
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConditionChanges “”
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConditionChanges(String ConditionChanges) {
        this.ConditionChanges = ConditionChanges;
    }

    /**
     * Get “”
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DischargeCondition “”
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDischargeCondition() {
        return this.DischargeCondition;
    }

    /**
     * Set “”
注意：此字段可能返回 null，表示取不到有效值。
     * @param DischargeCondition “”
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDischargeCondition(String DischargeCondition) {
        this.DischargeCondition = DischargeCondition;
    }

    /**
     * Get “”
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PTNM “”
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPTNM() {
        return this.PTNM;
    }

    /**
     * Set “”
注意：此字段可能返回 null，表示取不到有效值。
     * @param PTNM “”
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPTNM(String PTNM) {
        this.PTNM = PTNM;
    }

    /**
     * Get “”
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PTNMM “”
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPTNMM() {
        return this.PTNMM;
    }

    /**
     * Set “”
注意：此字段可能返回 null，表示取不到有效值。
     * @param PTNMM “”
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPTNMM(String PTNMM) {
        this.PTNMM = PTNMM;
    }

    /**
     * Get “”
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PTNMN “”
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPTNMN() {
        return this.PTNMN;
    }

    /**
     * Set “”
注意：此字段可能返回 null，表示取不到有效值。
     * @param PTNMN “”
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPTNMN(String PTNMN) {
        this.PTNMN = PTNMN;
    }

    /**
     * Get “”
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PTNMT “”
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPTNMT() {
        return this.PTNMT;
    }

    /**
     * Set “”
注意：此字段可能返回 null，表示取不到有效值。
     * @param PTNMT “”
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPTNMT(String PTNMT) {
        this.PTNMT = PTNMT;
    }

    /**
     * Get “”
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ECOG “”
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getECOG() {
        return this.ECOG;
    }

    /**
     * Set “”
注意：此字段可能返回 null，表示取不到有效值。
     * @param ECOG “”
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setECOG(String ECOG) {
        this.ECOG = ECOG;
    }

    /**
     * Get “”
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NRS “”
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNRS() {
        return this.NRS;
    }

    /**
     * Set “”
注意：此字段可能返回 null，表示取不到有效值。
     * @param NRS “”
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNRS(String NRS) {
        this.NRS = NRS;
    }

    /**
     * Get “”
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KPS “”
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKPS() {
        return this.KPS;
    }

    /**
     * Set “”
注意：此字段可能返回 null，表示取不到有效值。
     * @param KPS “”
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKPS(String KPS) {
        this.KPS = KPS;
    }

    /**
     * Get “”
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeathDate “”
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeathDate() {
        return this.DeathDate;
    }

    /**
     * Set “”
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeathDate “”
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeathDate(String DeathDate) {
        this.DeathDate = DeathDate;
    }

    /**
     * Get “”
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RelapseDate “”
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRelapseDate() {
        return this.RelapseDate;
    }

    /**
     * Set “”
注意：此字段可能返回 null，表示取不到有效值。
     * @param RelapseDate “”
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRelapseDate(String RelapseDate) {
        this.RelapseDate = RelapseDate;
    }

    /**
     * Get “”
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ObservationDays “”
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getObservationDays() {
        return this.ObservationDays;
    }

    /**
     * Set “”
注意：此字段可能返回 null，表示取不到有效值。
     * @param ObservationDays “”
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setObservationDays(String ObservationDays) {
        this.ObservationDays = ObservationDays;
    }

    public TreatmentRecord() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TreatmentRecord(TreatmentRecord source) {
        if (source.DmissionCondition != null) {
            this.DmissionCondition = new String(source.DmissionCondition);
        }
        if (source.ChiefComplaint != null) {
            this.ChiefComplaint = new String(source.ChiefComplaint);
        }
        if (source.DiseasePresent != null) {
            this.DiseasePresent = new String(source.DiseasePresent);
        }
        if (source.SymptomsAndSigns != null) {
            this.SymptomsAndSigns = new String(source.SymptomsAndSigns);
        }
        if (source.AuxiliaryExamination != null) {
            this.AuxiliaryExamination = new String(source.AuxiliaryExamination);
        }
        if (source.BodyExamination != null) {
            this.BodyExamination = new String(source.BodyExamination);
        }
        if (source.SpecialistExamination != null) {
            this.SpecialistExamination = new String(source.SpecialistExamination);
        }
        if (source.MentalExamination != null) {
            this.MentalExamination = new String(source.MentalExamination);
        }
        if (source.CheckRecord != null) {
            this.CheckRecord = new String(source.CheckRecord);
        }
        if (source.InspectResult != null) {
            this.InspectResult = new String(source.InspectResult);
        }
        if (source.IncisionHealing != null) {
            this.IncisionHealing = new String(source.IncisionHealing);
        }
        if (source.TreatmentSuggestion != null) {
            this.TreatmentSuggestion = new String(source.TreatmentSuggestion);
        }
        if (source.FollowUpRequirements != null) {
            this.FollowUpRequirements = new String(source.FollowUpRequirements);
        }
        if (source.CheckAndTreatmentProcess != null) {
            this.CheckAndTreatmentProcess = new String(source.CheckAndTreatmentProcess);
        }
        if (source.SurgeryCondition != null) {
            this.SurgeryCondition = new String(source.SurgeryCondition);
        }
        if (source.ConditionChanges != null) {
            this.ConditionChanges = new String(source.ConditionChanges);
        }
        if (source.DischargeCondition != null) {
            this.DischargeCondition = new String(source.DischargeCondition);
        }
        if (source.PTNM != null) {
            this.PTNM = new String(source.PTNM);
        }
        if (source.PTNMM != null) {
            this.PTNMM = new String(source.PTNMM);
        }
        if (source.PTNMN != null) {
            this.PTNMN = new String(source.PTNMN);
        }
        if (source.PTNMT != null) {
            this.PTNMT = new String(source.PTNMT);
        }
        if (source.ECOG != null) {
            this.ECOG = new String(source.ECOG);
        }
        if (source.NRS != null) {
            this.NRS = new String(source.NRS);
        }
        if (source.KPS != null) {
            this.KPS = new String(source.KPS);
        }
        if (source.DeathDate != null) {
            this.DeathDate = new String(source.DeathDate);
        }
        if (source.RelapseDate != null) {
            this.RelapseDate = new String(source.RelapseDate);
        }
        if (source.ObservationDays != null) {
            this.ObservationDays = new String(source.ObservationDays);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DmissionCondition", this.DmissionCondition);
        this.setParamSimple(map, prefix + "ChiefComplaint", this.ChiefComplaint);
        this.setParamSimple(map, prefix + "DiseasePresent", this.DiseasePresent);
        this.setParamSimple(map, prefix + "SymptomsAndSigns", this.SymptomsAndSigns);
        this.setParamSimple(map, prefix + "AuxiliaryExamination", this.AuxiliaryExamination);
        this.setParamSimple(map, prefix + "BodyExamination", this.BodyExamination);
        this.setParamSimple(map, prefix + "SpecialistExamination", this.SpecialistExamination);
        this.setParamSimple(map, prefix + "MentalExamination", this.MentalExamination);
        this.setParamSimple(map, prefix + "CheckRecord", this.CheckRecord);
        this.setParamSimple(map, prefix + "InspectResult", this.InspectResult);
        this.setParamSimple(map, prefix + "IncisionHealing", this.IncisionHealing);
        this.setParamSimple(map, prefix + "TreatmentSuggestion", this.TreatmentSuggestion);
        this.setParamSimple(map, prefix + "FollowUpRequirements", this.FollowUpRequirements);
        this.setParamSimple(map, prefix + "CheckAndTreatmentProcess", this.CheckAndTreatmentProcess);
        this.setParamSimple(map, prefix + "SurgeryCondition", this.SurgeryCondition);
        this.setParamSimple(map, prefix + "ConditionChanges", this.ConditionChanges);
        this.setParamSimple(map, prefix + "DischargeCondition", this.DischargeCondition);
        this.setParamSimple(map, prefix + "PTNM", this.PTNM);
        this.setParamSimple(map, prefix + "PTNMM", this.PTNMM);
        this.setParamSimple(map, prefix + "PTNMN", this.PTNMN);
        this.setParamSimple(map, prefix + "PTNMT", this.PTNMT);
        this.setParamSimple(map, prefix + "ECOG", this.ECOG);
        this.setParamSimple(map, prefix + "NRS", this.NRS);
        this.setParamSimple(map, prefix + "KPS", this.KPS);
        this.setParamSimple(map, prefix + "DeathDate", this.DeathDate);
        this.setParamSimple(map, prefix + "RelapseDate", this.RelapseDate);
        this.setParamSimple(map, prefix + "ObservationDays", this.ObservationDays);

    }
}

