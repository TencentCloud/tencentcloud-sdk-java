/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TreatmentRecord extends AbstractModel {

    /**
    * 入院
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DmissionCondition")
    @Expose
    private String DmissionCondition;

    /**
    * 主诉
    */
    @SerializedName("ChiefComplaint")
    @Expose
    private String ChiefComplaint;

    /**
    * 现病史
    */
    @SerializedName("DiseasePresent")
    @Expose
    private String DiseasePresent;

    /**
    * 主要症状体征
    */
    @SerializedName("SymptomsAndSigns")
    @Expose
    private String SymptomsAndSigns;

    /**
    * 辅助检查
    */
    @SerializedName("AuxiliaryExamination")
    @Expose
    private String AuxiliaryExamination;

    /**
    * 体格检查
    */
    @SerializedName("BodyExamination")
    @Expose
    private String BodyExamination;

    /**
    * 专科检查
    */
    @SerializedName("SpecialistExamination")
    @Expose
    private String SpecialistExamination;

    /**
    * 精神检查
    */
    @SerializedName("MentalExamination")
    @Expose
    private String MentalExamination;

    /**
    * 检查记录
    */
    @SerializedName("CheckRecord")
    @Expose
    private String CheckRecord;

    /**
    * 化验结果
    */
    @SerializedName("InspectResult")
    @Expose
    private String InspectResult;

    /**
    * 切口愈合情况
    */
    @SerializedName("IncisionHealing")
    @Expose
    private String IncisionHealing;

    /**
    * 处理意见
    */
    @SerializedName("TreatmentSuggestion")
    @Expose
    private String TreatmentSuggestion;

    /**
    * 门诊随访要求
    */
    @SerializedName("FollowUpRequirements")
    @Expose
    private String FollowUpRequirements;

    /**
    * 诊疗经过
    */
    @SerializedName("CheckAndTreatmentProcess")
    @Expose
    private String CheckAndTreatmentProcess;

    /**
    * 手术经过
    */
    @SerializedName("SurgeryCondition")
    @Expose
    private String SurgeryCondition;

    /**
    * 入院情况
    */
    @SerializedName("ConditionChanges")
    @Expose
    private String ConditionChanges;

    /**
    * 出院情况
    */
    @SerializedName("DischargeCondition")
    @Expose
    private String DischargeCondition;

    /**
    * pTNM信息
    */
    @SerializedName("PTNM")
    @Expose
    private String PTNM;

    /**
    * pTNMM信息
    */
    @SerializedName("PTNMM")
    @Expose
    private String PTNMM;

    /**
    * pTNMN信息
    */
    @SerializedName("PTNMN")
    @Expose
    private String PTNMN;

    /**
    * pTNMT信息
    */
    @SerializedName("PTNMT")
    @Expose
    private String PTNMT;

    /**
    * ECOG信息
    */
    @SerializedName("ECOG")
    @Expose
    private String ECOG;

    /**
    * NRS信息
    */
    @SerializedName("NRS")
    @Expose
    private String NRS;

    /**
    * KPS信息
    */
    @SerializedName("KPS")
    @Expose
    private String KPS;

    /**
    * 死亡日期
    */
    @SerializedName("DeathDate")
    @Expose
    private String DeathDate;

    /**
    * 复发日期
    */
    @SerializedName("RelapseDate")
    @Expose
    private String RelapseDate;

    /**
    * 观测天数
    */
    @SerializedName("ObservationDays")
    @Expose
    private String ObservationDays;

    /**
    * 入院
    */
    @SerializedName("AdmissionCondition")
    @Expose
    private String AdmissionCondition;

    /**
     * Get 入院
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DmissionCondition 入院
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public String getDmissionCondition() {
        return this.DmissionCondition;
    }

    /**
     * Set 入院
注意：此字段可能返回 null，表示取不到有效值。
     * @param DmissionCondition 入院
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public void setDmissionCondition(String DmissionCondition) {
        this.DmissionCondition = DmissionCondition;
    }

    /**
     * Get 主诉 
     * @return ChiefComplaint 主诉
     */
    public String getChiefComplaint() {
        return this.ChiefComplaint;
    }

    /**
     * Set 主诉
     * @param ChiefComplaint 主诉
     */
    public void setChiefComplaint(String ChiefComplaint) {
        this.ChiefComplaint = ChiefComplaint;
    }

    /**
     * Get 现病史 
     * @return DiseasePresent 现病史
     */
    public String getDiseasePresent() {
        return this.DiseasePresent;
    }

    /**
     * Set 现病史
     * @param DiseasePresent 现病史
     */
    public void setDiseasePresent(String DiseasePresent) {
        this.DiseasePresent = DiseasePresent;
    }

    /**
     * Get 主要症状体征 
     * @return SymptomsAndSigns 主要症状体征
     */
    public String getSymptomsAndSigns() {
        return this.SymptomsAndSigns;
    }

    /**
     * Set 主要症状体征
     * @param SymptomsAndSigns 主要症状体征
     */
    public void setSymptomsAndSigns(String SymptomsAndSigns) {
        this.SymptomsAndSigns = SymptomsAndSigns;
    }

    /**
     * Get 辅助检查 
     * @return AuxiliaryExamination 辅助检查
     */
    public String getAuxiliaryExamination() {
        return this.AuxiliaryExamination;
    }

    /**
     * Set 辅助检查
     * @param AuxiliaryExamination 辅助检查
     */
    public void setAuxiliaryExamination(String AuxiliaryExamination) {
        this.AuxiliaryExamination = AuxiliaryExamination;
    }

    /**
     * Get 体格检查 
     * @return BodyExamination 体格检查
     */
    public String getBodyExamination() {
        return this.BodyExamination;
    }

    /**
     * Set 体格检查
     * @param BodyExamination 体格检查
     */
    public void setBodyExamination(String BodyExamination) {
        this.BodyExamination = BodyExamination;
    }

    /**
     * Get 专科检查 
     * @return SpecialistExamination 专科检查
     */
    public String getSpecialistExamination() {
        return this.SpecialistExamination;
    }

    /**
     * Set 专科检查
     * @param SpecialistExamination 专科检查
     */
    public void setSpecialistExamination(String SpecialistExamination) {
        this.SpecialistExamination = SpecialistExamination;
    }

    /**
     * Get 精神检查 
     * @return MentalExamination 精神检查
     */
    public String getMentalExamination() {
        return this.MentalExamination;
    }

    /**
     * Set 精神检查
     * @param MentalExamination 精神检查
     */
    public void setMentalExamination(String MentalExamination) {
        this.MentalExamination = MentalExamination;
    }

    /**
     * Get 检查记录 
     * @return CheckRecord 检查记录
     */
    public String getCheckRecord() {
        return this.CheckRecord;
    }

    /**
     * Set 检查记录
     * @param CheckRecord 检查记录
     */
    public void setCheckRecord(String CheckRecord) {
        this.CheckRecord = CheckRecord;
    }

    /**
     * Get 化验结果 
     * @return InspectResult 化验结果
     */
    public String getInspectResult() {
        return this.InspectResult;
    }

    /**
     * Set 化验结果
     * @param InspectResult 化验结果
     */
    public void setInspectResult(String InspectResult) {
        this.InspectResult = InspectResult;
    }

    /**
     * Get 切口愈合情况 
     * @return IncisionHealing 切口愈合情况
     */
    public String getIncisionHealing() {
        return this.IncisionHealing;
    }

    /**
     * Set 切口愈合情况
     * @param IncisionHealing 切口愈合情况
     */
    public void setIncisionHealing(String IncisionHealing) {
        this.IncisionHealing = IncisionHealing;
    }

    /**
     * Get 处理意见 
     * @return TreatmentSuggestion 处理意见
     */
    public String getTreatmentSuggestion() {
        return this.TreatmentSuggestion;
    }

    /**
     * Set 处理意见
     * @param TreatmentSuggestion 处理意见
     */
    public void setTreatmentSuggestion(String TreatmentSuggestion) {
        this.TreatmentSuggestion = TreatmentSuggestion;
    }

    /**
     * Get 门诊随访要求 
     * @return FollowUpRequirements 门诊随访要求
     */
    public String getFollowUpRequirements() {
        return this.FollowUpRequirements;
    }

    /**
     * Set 门诊随访要求
     * @param FollowUpRequirements 门诊随访要求
     */
    public void setFollowUpRequirements(String FollowUpRequirements) {
        this.FollowUpRequirements = FollowUpRequirements;
    }

    /**
     * Get 诊疗经过 
     * @return CheckAndTreatmentProcess 诊疗经过
     */
    public String getCheckAndTreatmentProcess() {
        return this.CheckAndTreatmentProcess;
    }

    /**
     * Set 诊疗经过
     * @param CheckAndTreatmentProcess 诊疗经过
     */
    public void setCheckAndTreatmentProcess(String CheckAndTreatmentProcess) {
        this.CheckAndTreatmentProcess = CheckAndTreatmentProcess;
    }

    /**
     * Get 手术经过 
     * @return SurgeryCondition 手术经过
     */
    public String getSurgeryCondition() {
        return this.SurgeryCondition;
    }

    /**
     * Set 手术经过
     * @param SurgeryCondition 手术经过
     */
    public void setSurgeryCondition(String SurgeryCondition) {
        this.SurgeryCondition = SurgeryCondition;
    }

    /**
     * Get 入院情况 
     * @return ConditionChanges 入院情况
     */
    public String getConditionChanges() {
        return this.ConditionChanges;
    }

    /**
     * Set 入院情况
     * @param ConditionChanges 入院情况
     */
    public void setConditionChanges(String ConditionChanges) {
        this.ConditionChanges = ConditionChanges;
    }

    /**
     * Get 出院情况 
     * @return DischargeCondition 出院情况
     */
    public String getDischargeCondition() {
        return this.DischargeCondition;
    }

    /**
     * Set 出院情况
     * @param DischargeCondition 出院情况
     */
    public void setDischargeCondition(String DischargeCondition) {
        this.DischargeCondition = DischargeCondition;
    }

    /**
     * Get pTNM信息 
     * @return PTNM pTNM信息
     */
    public String getPTNM() {
        return this.PTNM;
    }

    /**
     * Set pTNM信息
     * @param PTNM pTNM信息
     */
    public void setPTNM(String PTNM) {
        this.PTNM = PTNM;
    }

    /**
     * Get pTNMM信息 
     * @return PTNMM pTNMM信息
     */
    public String getPTNMM() {
        return this.PTNMM;
    }

    /**
     * Set pTNMM信息
     * @param PTNMM pTNMM信息
     */
    public void setPTNMM(String PTNMM) {
        this.PTNMM = PTNMM;
    }

    /**
     * Get pTNMN信息 
     * @return PTNMN pTNMN信息
     */
    public String getPTNMN() {
        return this.PTNMN;
    }

    /**
     * Set pTNMN信息
     * @param PTNMN pTNMN信息
     */
    public void setPTNMN(String PTNMN) {
        this.PTNMN = PTNMN;
    }

    /**
     * Get pTNMT信息 
     * @return PTNMT pTNMT信息
     */
    public String getPTNMT() {
        return this.PTNMT;
    }

    /**
     * Set pTNMT信息
     * @param PTNMT pTNMT信息
     */
    public void setPTNMT(String PTNMT) {
        this.PTNMT = PTNMT;
    }

    /**
     * Get ECOG信息 
     * @return ECOG ECOG信息
     */
    public String getECOG() {
        return this.ECOG;
    }

    /**
     * Set ECOG信息
     * @param ECOG ECOG信息
     */
    public void setECOG(String ECOG) {
        this.ECOG = ECOG;
    }

    /**
     * Get NRS信息 
     * @return NRS NRS信息
     */
    public String getNRS() {
        return this.NRS;
    }

    /**
     * Set NRS信息
     * @param NRS NRS信息
     */
    public void setNRS(String NRS) {
        this.NRS = NRS;
    }

    /**
     * Get KPS信息 
     * @return KPS KPS信息
     */
    public String getKPS() {
        return this.KPS;
    }

    /**
     * Set KPS信息
     * @param KPS KPS信息
     */
    public void setKPS(String KPS) {
        this.KPS = KPS;
    }

    /**
     * Get 死亡日期 
     * @return DeathDate 死亡日期
     */
    public String getDeathDate() {
        return this.DeathDate;
    }

    /**
     * Set 死亡日期
     * @param DeathDate 死亡日期
     */
    public void setDeathDate(String DeathDate) {
        this.DeathDate = DeathDate;
    }

    /**
     * Get 复发日期 
     * @return RelapseDate 复发日期
     */
    public String getRelapseDate() {
        return this.RelapseDate;
    }

    /**
     * Set 复发日期
     * @param RelapseDate 复发日期
     */
    public void setRelapseDate(String RelapseDate) {
        this.RelapseDate = RelapseDate;
    }

    /**
     * Get 观测天数 
     * @return ObservationDays 观测天数
     */
    public String getObservationDays() {
        return this.ObservationDays;
    }

    /**
     * Set 观测天数
     * @param ObservationDays 观测天数
     */
    public void setObservationDays(String ObservationDays) {
        this.ObservationDays = ObservationDays;
    }

    /**
     * Get 入院 
     * @return AdmissionCondition 入院
     */
    public String getAdmissionCondition() {
        return this.AdmissionCondition;
    }

    /**
     * Set 入院
     * @param AdmissionCondition 入院
     */
    public void setAdmissionCondition(String AdmissionCondition) {
        this.AdmissionCondition = AdmissionCondition;
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
        if (source.AdmissionCondition != null) {
            this.AdmissionCondition = new String(source.AdmissionCondition);
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
        this.setParamSimple(map, prefix + "AdmissionCondition", this.AdmissionCondition);

    }
}

