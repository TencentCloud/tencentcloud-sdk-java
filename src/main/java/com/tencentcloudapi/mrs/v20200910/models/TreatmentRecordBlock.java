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

public class TreatmentRecordBlock extends AbstractModel{

    /**
    * 免疫组化
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Immunohistochemistry")
    @Expose
    private ImmunohistochemistryBlock Immunohistochemistry;

    /**
    * 主诉
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChiefComplaint")
    @Expose
    private ChiefComplaintBlock ChiefComplaint;

    /**
    * 入院情况
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AdmissionCondition")
    @Expose
    private AdmissionConditionBlock AdmissionCondition;

    /**
    * 查体
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BodyExamination")
    @Expose
    private BodyExaminationBlock BodyExamination;

    /**
    * 入院诊断
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AdmissionDiagnosis")
    @Expose
    private AdmissionDiagnosisBlock AdmissionDiagnosis;

    /**
    * 入院中医诊断
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AdmissionTraditionalDiagnosis")
    @Expose
    private AdmissionDiagnosisBlock AdmissionTraditionalDiagnosis;

    /**
    * 入院西医诊断
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AdmissionModernDiagnosis")
    @Expose
    private AdmissionDiagnosisBlock AdmissionModernDiagnosis;

    /**
    * 病理诊断
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PathologicalDiagnosis")
    @Expose
    private PathologicalDiagnosisBlock PathologicalDiagnosis;

    /**
    * 现病史
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DiseasePresent")
    @Expose
    private DiseasePresentBlock DiseasePresent;

    /**
    * 体征
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SymptomsAndSigns")
    @Expose
    private DiseasePresentBlock SymptomsAndSigns;

    /**
    * 辅助检查
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AuxiliaryExamination")
    @Expose
    private DiseasePresentBlock AuxiliaryExamination;

    /**
    * 特殊检查
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SpecialistExamination")
    @Expose
    private DiseasePresentBlock SpecialistExamination;

    /**
    * 精神检查
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MentalExamination")
    @Expose
    private DiseasePresentBlock MentalExamination;

    /**
    * 检查记录
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CheckRecord")
    @Expose
    private DiseasePresentBlock CheckRecord;

    /**
    * 检查结果
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InspectResult")
    @Expose
    private DiseasePresentBlock InspectResult;

    /**
    * 治疗经过
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CheckAndTreatmentProcess")
    @Expose
    private DiseasePresentBlock CheckAndTreatmentProcess;

    /**
    * 手术经过
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SurgeryCondition")
    @Expose
    private SurgeryConditionBlock SurgeryCondition;

    /**
    * 切口愈合
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IncisionHealing")
    @Expose
    private DiseasePresentBlock IncisionHealing;

    /**
    * 出院诊断
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DischargeDiagnosis")
    @Expose
    private DischargeDiagnosisBlock DischargeDiagnosis;

    /**
    * 出院中医诊断
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DischargeTraditionalDiagnosis")
    @Expose
    private DiseasePresentBlock DischargeTraditionalDiagnosis;

    /**
    * 出院西医诊断
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DischargeModernDiagnosis")
    @Expose
    private DischargeDiagnosisBlock DischargeModernDiagnosis;

    /**
    * 出院情况
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DischargeCondition")
    @Expose
    private DischargeConditionBlock DischargeCondition;

    /**
    * 出院医嘱
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DischargeInstructions")
    @Expose
    private DiseasePresentBlock DischargeInstructions;

    /**
    * 治疗建议
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TreatmentSuggestion")
    @Expose
    private DiseasePresentBlock TreatmentSuggestion;

    /**
    * 随访
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FollowUpRequirements")
    @Expose
    private DiseasePresentBlock FollowUpRequirements;

    /**
    * 治疗情况变化
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConditionChanges")
    @Expose
    private DiseasePresentBlock ConditionChanges;

    /**
    * 收缩压
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PulmonaryArterySystolicPressure")
    @Expose
    private DiseasePresentBlock PulmonaryArterySystolicPressure;

    /**
    * bclc分期
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BCLC")
    @Expose
    private DiseasePresentBlock BCLC;

    /**
    * PTNM分期
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PTNM")
    @Expose
    private PTNMBlock PTNM;

    /**
    * ECOG评分
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ECOG")
    @Expose
    private DiseasePresentBlock ECOG;

    /**
    * NRS评分
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NRS")
    @Expose
    private DiseasePresentBlock NRS;

    /**
    * kps评分
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KPS")
    @Expose
    private DiseasePresentBlock KPS;

    /**
    * 癌症分期
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Cancerstaging")
    @Expose
    private ClinicalStaging Cancerstaging;

    /**
    * 死亡时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeathDate")
    @Expose
    private DeathDateBlock DeathDate;

    /**
    * 复发日期
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RelapseDate")
    @Expose
    private RelapseDateBlock RelapseDate;

    /**
    * 观察日期
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ObservationDays")
    @Expose
    private DeathDateBlock ObservationDays;

    /**
    * 切口愈合情况
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IncisionHealingText")
    @Expose
    private String IncisionHealingText;

    /**
    * 辅助检查
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AuxiliaryExaminationText")
    @Expose
    private String AuxiliaryExaminationText;

    /**
    * 特殊检查
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SpecialExamText")
    @Expose
    private String SpecialExamText;

    /**
    * 门诊诊断
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OutpatientDiagnosisText")
    @Expose
    private String OutpatientDiagnosisText;

    /**
    * 入院情况
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AdmissionConditionText")
    @Expose
    private String AdmissionConditionText;

    /**
    * 诊疗经过
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CheckAndTreatmentProcessText")
    @Expose
    private String CheckAndTreatmentProcessText;

    /**
    * 体征
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SymptomsAndSignsText")
    @Expose
    private String SymptomsAndSignsText;

    /**
    * 出院医嘱
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DischargeInstructionsText")
    @Expose
    private String DischargeInstructionsText;

    /**
    * 入院诊断
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AdmissionDiagnosisText")
    @Expose
    private String AdmissionDiagnosisText;

    /**
    * 手术情况
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SurgeryConditionText")
    @Expose
    private String SurgeryConditionText;

    /**
    * 病理诊断
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PathologicalDiagnosisText")
    @Expose
    private String PathologicalDiagnosisText;

    /**
    * 出院情况
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DischargeConditionText")
    @Expose
    private String DischargeConditionText;

    /**
    * 检查记录
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CheckRecordText")
    @Expose
    private String CheckRecordText;

    /**
    * 主诉
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChiefComplaintText")
    @Expose
    private String ChiefComplaintText;

    /**
    * 出院诊断
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DischargeDiagnosisText")
    @Expose
    private String DischargeDiagnosisText;

    /**
     * Get 免疫组化
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Immunohistochemistry 免疫组化
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ImmunohistochemistryBlock getImmunohistochemistry() {
        return this.Immunohistochemistry;
    }

    /**
     * Set 免疫组化
注意：此字段可能返回 null，表示取不到有效值。
     * @param Immunohistochemistry 免疫组化
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImmunohistochemistry(ImmunohistochemistryBlock Immunohistochemistry) {
        this.Immunohistochemistry = Immunohistochemistry;
    }

    /**
     * Get 主诉
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChiefComplaint 主诉
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ChiefComplaintBlock getChiefComplaint() {
        return this.ChiefComplaint;
    }

    /**
     * Set 主诉
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChiefComplaint 主诉
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChiefComplaint(ChiefComplaintBlock ChiefComplaint) {
        this.ChiefComplaint = ChiefComplaint;
    }

    /**
     * Get 入院情况
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AdmissionCondition 入院情况
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AdmissionConditionBlock getAdmissionCondition() {
        return this.AdmissionCondition;
    }

    /**
     * Set 入院情况
注意：此字段可能返回 null，表示取不到有效值。
     * @param AdmissionCondition 入院情况
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAdmissionCondition(AdmissionConditionBlock AdmissionCondition) {
        this.AdmissionCondition = AdmissionCondition;
    }

    /**
     * Get 查体
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BodyExamination 查体
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BodyExaminationBlock getBodyExamination() {
        return this.BodyExamination;
    }

    /**
     * Set 查体
注意：此字段可能返回 null，表示取不到有效值。
     * @param BodyExamination 查体
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBodyExamination(BodyExaminationBlock BodyExamination) {
        this.BodyExamination = BodyExamination;
    }

    /**
     * Get 入院诊断
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AdmissionDiagnosis 入院诊断
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AdmissionDiagnosisBlock getAdmissionDiagnosis() {
        return this.AdmissionDiagnosis;
    }

    /**
     * Set 入院诊断
注意：此字段可能返回 null，表示取不到有效值。
     * @param AdmissionDiagnosis 入院诊断
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAdmissionDiagnosis(AdmissionDiagnosisBlock AdmissionDiagnosis) {
        this.AdmissionDiagnosis = AdmissionDiagnosis;
    }

    /**
     * Get 入院中医诊断
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AdmissionTraditionalDiagnosis 入院中医诊断
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AdmissionDiagnosisBlock getAdmissionTraditionalDiagnosis() {
        return this.AdmissionTraditionalDiagnosis;
    }

    /**
     * Set 入院中医诊断
注意：此字段可能返回 null，表示取不到有效值。
     * @param AdmissionTraditionalDiagnosis 入院中医诊断
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAdmissionTraditionalDiagnosis(AdmissionDiagnosisBlock AdmissionTraditionalDiagnosis) {
        this.AdmissionTraditionalDiagnosis = AdmissionTraditionalDiagnosis;
    }

    /**
     * Get 入院西医诊断
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AdmissionModernDiagnosis 入院西医诊断
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AdmissionDiagnosisBlock getAdmissionModernDiagnosis() {
        return this.AdmissionModernDiagnosis;
    }

    /**
     * Set 入院西医诊断
注意：此字段可能返回 null，表示取不到有效值。
     * @param AdmissionModernDiagnosis 入院西医诊断
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAdmissionModernDiagnosis(AdmissionDiagnosisBlock AdmissionModernDiagnosis) {
        this.AdmissionModernDiagnosis = AdmissionModernDiagnosis;
    }

    /**
     * Get 病理诊断
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PathologicalDiagnosis 病理诊断
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PathologicalDiagnosisBlock getPathologicalDiagnosis() {
        return this.PathologicalDiagnosis;
    }

    /**
     * Set 病理诊断
注意：此字段可能返回 null，表示取不到有效值。
     * @param PathologicalDiagnosis 病理诊断
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPathologicalDiagnosis(PathologicalDiagnosisBlock PathologicalDiagnosis) {
        this.PathologicalDiagnosis = PathologicalDiagnosis;
    }

    /**
     * Get 现病史
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DiseasePresent 现病史
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DiseasePresentBlock getDiseasePresent() {
        return this.DiseasePresent;
    }

    /**
     * Set 现病史
注意：此字段可能返回 null，表示取不到有效值。
     * @param DiseasePresent 现病史
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiseasePresent(DiseasePresentBlock DiseasePresent) {
        this.DiseasePresent = DiseasePresent;
    }

    /**
     * Get 体征
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SymptomsAndSigns 体征
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DiseasePresentBlock getSymptomsAndSigns() {
        return this.SymptomsAndSigns;
    }

    /**
     * Set 体征
注意：此字段可能返回 null，表示取不到有效值。
     * @param SymptomsAndSigns 体征
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSymptomsAndSigns(DiseasePresentBlock SymptomsAndSigns) {
        this.SymptomsAndSigns = SymptomsAndSigns;
    }

    /**
     * Get 辅助检查
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AuxiliaryExamination 辅助检查
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DiseasePresentBlock getAuxiliaryExamination() {
        return this.AuxiliaryExamination;
    }

    /**
     * Set 辅助检查
注意：此字段可能返回 null，表示取不到有效值。
     * @param AuxiliaryExamination 辅助检查
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAuxiliaryExamination(DiseasePresentBlock AuxiliaryExamination) {
        this.AuxiliaryExamination = AuxiliaryExamination;
    }

    /**
     * Get 特殊检查
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SpecialistExamination 特殊检查
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DiseasePresentBlock getSpecialistExamination() {
        return this.SpecialistExamination;
    }

    /**
     * Set 特殊检查
注意：此字段可能返回 null，表示取不到有效值。
     * @param SpecialistExamination 特殊检查
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSpecialistExamination(DiseasePresentBlock SpecialistExamination) {
        this.SpecialistExamination = SpecialistExamination;
    }

    /**
     * Get 精神检查
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MentalExamination 精神检查
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DiseasePresentBlock getMentalExamination() {
        return this.MentalExamination;
    }

    /**
     * Set 精神检查
注意：此字段可能返回 null，表示取不到有效值。
     * @param MentalExamination 精神检查
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMentalExamination(DiseasePresentBlock MentalExamination) {
        this.MentalExamination = MentalExamination;
    }

    /**
     * Get 检查记录
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CheckRecord 检查记录
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DiseasePresentBlock getCheckRecord() {
        return this.CheckRecord;
    }

    /**
     * Set 检查记录
注意：此字段可能返回 null，表示取不到有效值。
     * @param CheckRecord 检查记录
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCheckRecord(DiseasePresentBlock CheckRecord) {
        this.CheckRecord = CheckRecord;
    }

    /**
     * Get 检查结果
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InspectResult 检查结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DiseasePresentBlock getInspectResult() {
        return this.InspectResult;
    }

    /**
     * Set 检查结果
注意：此字段可能返回 null，表示取不到有效值。
     * @param InspectResult 检查结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInspectResult(DiseasePresentBlock InspectResult) {
        this.InspectResult = InspectResult;
    }

    /**
     * Get 治疗经过
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CheckAndTreatmentProcess 治疗经过
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DiseasePresentBlock getCheckAndTreatmentProcess() {
        return this.CheckAndTreatmentProcess;
    }

    /**
     * Set 治疗经过
注意：此字段可能返回 null，表示取不到有效值。
     * @param CheckAndTreatmentProcess 治疗经过
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCheckAndTreatmentProcess(DiseasePresentBlock CheckAndTreatmentProcess) {
        this.CheckAndTreatmentProcess = CheckAndTreatmentProcess;
    }

    /**
     * Get 手术经过
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SurgeryCondition 手术经过
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SurgeryConditionBlock getSurgeryCondition() {
        return this.SurgeryCondition;
    }

    /**
     * Set 手术经过
注意：此字段可能返回 null，表示取不到有效值。
     * @param SurgeryCondition 手术经过
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSurgeryCondition(SurgeryConditionBlock SurgeryCondition) {
        this.SurgeryCondition = SurgeryCondition;
    }

    /**
     * Get 切口愈合
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IncisionHealing 切口愈合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DiseasePresentBlock getIncisionHealing() {
        return this.IncisionHealing;
    }

    /**
     * Set 切口愈合
注意：此字段可能返回 null，表示取不到有效值。
     * @param IncisionHealing 切口愈合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIncisionHealing(DiseasePresentBlock IncisionHealing) {
        this.IncisionHealing = IncisionHealing;
    }

    /**
     * Get 出院诊断
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DischargeDiagnosis 出院诊断
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DischargeDiagnosisBlock getDischargeDiagnosis() {
        return this.DischargeDiagnosis;
    }

    /**
     * Set 出院诊断
注意：此字段可能返回 null，表示取不到有效值。
     * @param DischargeDiagnosis 出院诊断
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDischargeDiagnosis(DischargeDiagnosisBlock DischargeDiagnosis) {
        this.DischargeDiagnosis = DischargeDiagnosis;
    }

    /**
     * Get 出院中医诊断
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DischargeTraditionalDiagnosis 出院中医诊断
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DiseasePresentBlock getDischargeTraditionalDiagnosis() {
        return this.DischargeTraditionalDiagnosis;
    }

    /**
     * Set 出院中医诊断
注意：此字段可能返回 null，表示取不到有效值。
     * @param DischargeTraditionalDiagnosis 出院中医诊断
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDischargeTraditionalDiagnosis(DiseasePresentBlock DischargeTraditionalDiagnosis) {
        this.DischargeTraditionalDiagnosis = DischargeTraditionalDiagnosis;
    }

    /**
     * Get 出院西医诊断
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DischargeModernDiagnosis 出院西医诊断
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DischargeDiagnosisBlock getDischargeModernDiagnosis() {
        return this.DischargeModernDiagnosis;
    }

    /**
     * Set 出院西医诊断
注意：此字段可能返回 null，表示取不到有效值。
     * @param DischargeModernDiagnosis 出院西医诊断
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDischargeModernDiagnosis(DischargeDiagnosisBlock DischargeModernDiagnosis) {
        this.DischargeModernDiagnosis = DischargeModernDiagnosis;
    }

    /**
     * Get 出院情况
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DischargeCondition 出院情况
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DischargeConditionBlock getDischargeCondition() {
        return this.DischargeCondition;
    }

    /**
     * Set 出院情况
注意：此字段可能返回 null，表示取不到有效值。
     * @param DischargeCondition 出院情况
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDischargeCondition(DischargeConditionBlock DischargeCondition) {
        this.DischargeCondition = DischargeCondition;
    }

    /**
     * Get 出院医嘱
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DischargeInstructions 出院医嘱
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DiseasePresentBlock getDischargeInstructions() {
        return this.DischargeInstructions;
    }

    /**
     * Set 出院医嘱
注意：此字段可能返回 null，表示取不到有效值。
     * @param DischargeInstructions 出院医嘱
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDischargeInstructions(DiseasePresentBlock DischargeInstructions) {
        this.DischargeInstructions = DischargeInstructions;
    }

    /**
     * Get 治疗建议
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TreatmentSuggestion 治疗建议
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DiseasePresentBlock getTreatmentSuggestion() {
        return this.TreatmentSuggestion;
    }

    /**
     * Set 治疗建议
注意：此字段可能返回 null，表示取不到有效值。
     * @param TreatmentSuggestion 治疗建议
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTreatmentSuggestion(DiseasePresentBlock TreatmentSuggestion) {
        this.TreatmentSuggestion = TreatmentSuggestion;
    }

    /**
     * Get 随访
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FollowUpRequirements 随访
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DiseasePresentBlock getFollowUpRequirements() {
        return this.FollowUpRequirements;
    }

    /**
     * Set 随访
注意：此字段可能返回 null，表示取不到有效值。
     * @param FollowUpRequirements 随访
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFollowUpRequirements(DiseasePresentBlock FollowUpRequirements) {
        this.FollowUpRequirements = FollowUpRequirements;
    }

    /**
     * Get 治疗情况变化
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConditionChanges 治疗情况变化
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DiseasePresentBlock getConditionChanges() {
        return this.ConditionChanges;
    }

    /**
     * Set 治疗情况变化
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConditionChanges 治疗情况变化
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConditionChanges(DiseasePresentBlock ConditionChanges) {
        this.ConditionChanges = ConditionChanges;
    }

    /**
     * Get 收缩压
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PulmonaryArterySystolicPressure 收缩压
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DiseasePresentBlock getPulmonaryArterySystolicPressure() {
        return this.PulmonaryArterySystolicPressure;
    }

    /**
     * Set 收缩压
注意：此字段可能返回 null，表示取不到有效值。
     * @param PulmonaryArterySystolicPressure 收缩压
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPulmonaryArterySystolicPressure(DiseasePresentBlock PulmonaryArterySystolicPressure) {
        this.PulmonaryArterySystolicPressure = PulmonaryArterySystolicPressure;
    }

    /**
     * Get bclc分期
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BCLC bclc分期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DiseasePresentBlock getBCLC() {
        return this.BCLC;
    }

    /**
     * Set bclc分期
注意：此字段可能返回 null，表示取不到有效值。
     * @param BCLC bclc分期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBCLC(DiseasePresentBlock BCLC) {
        this.BCLC = BCLC;
    }

    /**
     * Get PTNM分期
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PTNM PTNM分期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PTNMBlock getPTNM() {
        return this.PTNM;
    }

    /**
     * Set PTNM分期
注意：此字段可能返回 null，表示取不到有效值。
     * @param PTNM PTNM分期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPTNM(PTNMBlock PTNM) {
        this.PTNM = PTNM;
    }

    /**
     * Get ECOG评分
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ECOG ECOG评分
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DiseasePresentBlock getECOG() {
        return this.ECOG;
    }

    /**
     * Set ECOG评分
注意：此字段可能返回 null，表示取不到有效值。
     * @param ECOG ECOG评分
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setECOG(DiseasePresentBlock ECOG) {
        this.ECOG = ECOG;
    }

    /**
     * Get NRS评分
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NRS NRS评分
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DiseasePresentBlock getNRS() {
        return this.NRS;
    }

    /**
     * Set NRS评分
注意：此字段可能返回 null，表示取不到有效值。
     * @param NRS NRS评分
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNRS(DiseasePresentBlock NRS) {
        this.NRS = NRS;
    }

    /**
     * Get kps评分
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KPS kps评分
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DiseasePresentBlock getKPS() {
        return this.KPS;
    }

    /**
     * Set kps评分
注意：此字段可能返回 null，表示取不到有效值。
     * @param KPS kps评分
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKPS(DiseasePresentBlock KPS) {
        this.KPS = KPS;
    }

    /**
     * Get 癌症分期
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Cancerstaging 癌症分期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ClinicalStaging getCancerstaging() {
        return this.Cancerstaging;
    }

    /**
     * Set 癌症分期
注意：此字段可能返回 null，表示取不到有效值。
     * @param Cancerstaging 癌症分期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCancerstaging(ClinicalStaging Cancerstaging) {
        this.Cancerstaging = Cancerstaging;
    }

    /**
     * Get 死亡时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeathDate 死亡时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DeathDateBlock getDeathDate() {
        return this.DeathDate;
    }

    /**
     * Set 死亡时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeathDate 死亡时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeathDate(DeathDateBlock DeathDate) {
        this.DeathDate = DeathDate;
    }

    /**
     * Get 复发日期
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RelapseDate 复发日期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RelapseDateBlock getRelapseDate() {
        return this.RelapseDate;
    }

    /**
     * Set 复发日期
注意：此字段可能返回 null，表示取不到有效值。
     * @param RelapseDate 复发日期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRelapseDate(RelapseDateBlock RelapseDate) {
        this.RelapseDate = RelapseDate;
    }

    /**
     * Get 观察日期
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ObservationDays 观察日期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DeathDateBlock getObservationDays() {
        return this.ObservationDays;
    }

    /**
     * Set 观察日期
注意：此字段可能返回 null，表示取不到有效值。
     * @param ObservationDays 观察日期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setObservationDays(DeathDateBlock ObservationDays) {
        this.ObservationDays = ObservationDays;
    }

    /**
     * Get 切口愈合情况
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IncisionHealingText 切口愈合情况
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIncisionHealingText() {
        return this.IncisionHealingText;
    }

    /**
     * Set 切口愈合情况
注意：此字段可能返回 null，表示取不到有效值。
     * @param IncisionHealingText 切口愈合情况
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIncisionHealingText(String IncisionHealingText) {
        this.IncisionHealingText = IncisionHealingText;
    }

    /**
     * Get 辅助检查
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AuxiliaryExaminationText 辅助检查
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAuxiliaryExaminationText() {
        return this.AuxiliaryExaminationText;
    }

    /**
     * Set 辅助检查
注意：此字段可能返回 null，表示取不到有效值。
     * @param AuxiliaryExaminationText 辅助检查
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAuxiliaryExaminationText(String AuxiliaryExaminationText) {
        this.AuxiliaryExaminationText = AuxiliaryExaminationText;
    }

    /**
     * Get 特殊检查
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SpecialExamText 特殊检查
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSpecialExamText() {
        return this.SpecialExamText;
    }

    /**
     * Set 特殊检查
注意：此字段可能返回 null，表示取不到有效值。
     * @param SpecialExamText 特殊检查
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSpecialExamText(String SpecialExamText) {
        this.SpecialExamText = SpecialExamText;
    }

    /**
     * Get 门诊诊断
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OutpatientDiagnosisText 门诊诊断
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOutpatientDiagnosisText() {
        return this.OutpatientDiagnosisText;
    }

    /**
     * Set 门诊诊断
注意：此字段可能返回 null，表示取不到有效值。
     * @param OutpatientDiagnosisText 门诊诊断
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOutpatientDiagnosisText(String OutpatientDiagnosisText) {
        this.OutpatientDiagnosisText = OutpatientDiagnosisText;
    }

    /**
     * Get 入院情况
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AdmissionConditionText 入院情况
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAdmissionConditionText() {
        return this.AdmissionConditionText;
    }

    /**
     * Set 入院情况
注意：此字段可能返回 null，表示取不到有效值。
     * @param AdmissionConditionText 入院情况
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAdmissionConditionText(String AdmissionConditionText) {
        this.AdmissionConditionText = AdmissionConditionText;
    }

    /**
     * Get 诊疗经过
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CheckAndTreatmentProcessText 诊疗经过
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCheckAndTreatmentProcessText() {
        return this.CheckAndTreatmentProcessText;
    }

    /**
     * Set 诊疗经过
注意：此字段可能返回 null，表示取不到有效值。
     * @param CheckAndTreatmentProcessText 诊疗经过
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCheckAndTreatmentProcessText(String CheckAndTreatmentProcessText) {
        this.CheckAndTreatmentProcessText = CheckAndTreatmentProcessText;
    }

    /**
     * Get 体征
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SymptomsAndSignsText 体征
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSymptomsAndSignsText() {
        return this.SymptomsAndSignsText;
    }

    /**
     * Set 体征
注意：此字段可能返回 null，表示取不到有效值。
     * @param SymptomsAndSignsText 体征
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSymptomsAndSignsText(String SymptomsAndSignsText) {
        this.SymptomsAndSignsText = SymptomsAndSignsText;
    }

    /**
     * Get 出院医嘱
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DischargeInstructionsText 出院医嘱
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDischargeInstructionsText() {
        return this.DischargeInstructionsText;
    }

    /**
     * Set 出院医嘱
注意：此字段可能返回 null，表示取不到有效值。
     * @param DischargeInstructionsText 出院医嘱
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDischargeInstructionsText(String DischargeInstructionsText) {
        this.DischargeInstructionsText = DischargeInstructionsText;
    }

    /**
     * Get 入院诊断
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AdmissionDiagnosisText 入院诊断
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAdmissionDiagnosisText() {
        return this.AdmissionDiagnosisText;
    }

    /**
     * Set 入院诊断
注意：此字段可能返回 null，表示取不到有效值。
     * @param AdmissionDiagnosisText 入院诊断
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAdmissionDiagnosisText(String AdmissionDiagnosisText) {
        this.AdmissionDiagnosisText = AdmissionDiagnosisText;
    }

    /**
     * Get 手术情况
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SurgeryConditionText 手术情况
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSurgeryConditionText() {
        return this.SurgeryConditionText;
    }

    /**
     * Set 手术情况
注意：此字段可能返回 null，表示取不到有效值。
     * @param SurgeryConditionText 手术情况
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSurgeryConditionText(String SurgeryConditionText) {
        this.SurgeryConditionText = SurgeryConditionText;
    }

    /**
     * Get 病理诊断
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PathologicalDiagnosisText 病理诊断
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPathologicalDiagnosisText() {
        return this.PathologicalDiagnosisText;
    }

    /**
     * Set 病理诊断
注意：此字段可能返回 null，表示取不到有效值。
     * @param PathologicalDiagnosisText 病理诊断
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPathologicalDiagnosisText(String PathologicalDiagnosisText) {
        this.PathologicalDiagnosisText = PathologicalDiagnosisText;
    }

    /**
     * Get 出院情况
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DischargeConditionText 出院情况
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDischargeConditionText() {
        return this.DischargeConditionText;
    }

    /**
     * Set 出院情况
注意：此字段可能返回 null，表示取不到有效值。
     * @param DischargeConditionText 出院情况
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDischargeConditionText(String DischargeConditionText) {
        this.DischargeConditionText = DischargeConditionText;
    }

    /**
     * Get 检查记录
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CheckRecordText 检查记录
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCheckRecordText() {
        return this.CheckRecordText;
    }

    /**
     * Set 检查记录
注意：此字段可能返回 null，表示取不到有效值。
     * @param CheckRecordText 检查记录
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCheckRecordText(String CheckRecordText) {
        this.CheckRecordText = CheckRecordText;
    }

    /**
     * Get 主诉
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChiefComplaintText 主诉
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getChiefComplaintText() {
        return this.ChiefComplaintText;
    }

    /**
     * Set 主诉
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChiefComplaintText 主诉
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChiefComplaintText(String ChiefComplaintText) {
        this.ChiefComplaintText = ChiefComplaintText;
    }

    /**
     * Get 出院诊断
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DischargeDiagnosisText 出院诊断
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDischargeDiagnosisText() {
        return this.DischargeDiagnosisText;
    }

    /**
     * Set 出院诊断
注意：此字段可能返回 null，表示取不到有效值。
     * @param DischargeDiagnosisText 出院诊断
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDischargeDiagnosisText(String DischargeDiagnosisText) {
        this.DischargeDiagnosisText = DischargeDiagnosisText;
    }

    public TreatmentRecordBlock() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TreatmentRecordBlock(TreatmentRecordBlock source) {
        if (source.Immunohistochemistry != null) {
            this.Immunohistochemistry = new ImmunohistochemistryBlock(source.Immunohistochemistry);
        }
        if (source.ChiefComplaint != null) {
            this.ChiefComplaint = new ChiefComplaintBlock(source.ChiefComplaint);
        }
        if (source.AdmissionCondition != null) {
            this.AdmissionCondition = new AdmissionConditionBlock(source.AdmissionCondition);
        }
        if (source.BodyExamination != null) {
            this.BodyExamination = new BodyExaminationBlock(source.BodyExamination);
        }
        if (source.AdmissionDiagnosis != null) {
            this.AdmissionDiagnosis = new AdmissionDiagnosisBlock(source.AdmissionDiagnosis);
        }
        if (source.AdmissionTraditionalDiagnosis != null) {
            this.AdmissionTraditionalDiagnosis = new AdmissionDiagnosisBlock(source.AdmissionTraditionalDiagnosis);
        }
        if (source.AdmissionModernDiagnosis != null) {
            this.AdmissionModernDiagnosis = new AdmissionDiagnosisBlock(source.AdmissionModernDiagnosis);
        }
        if (source.PathologicalDiagnosis != null) {
            this.PathologicalDiagnosis = new PathologicalDiagnosisBlock(source.PathologicalDiagnosis);
        }
        if (source.DiseasePresent != null) {
            this.DiseasePresent = new DiseasePresentBlock(source.DiseasePresent);
        }
        if (source.SymptomsAndSigns != null) {
            this.SymptomsAndSigns = new DiseasePresentBlock(source.SymptomsAndSigns);
        }
        if (source.AuxiliaryExamination != null) {
            this.AuxiliaryExamination = new DiseasePresentBlock(source.AuxiliaryExamination);
        }
        if (source.SpecialistExamination != null) {
            this.SpecialistExamination = new DiseasePresentBlock(source.SpecialistExamination);
        }
        if (source.MentalExamination != null) {
            this.MentalExamination = new DiseasePresentBlock(source.MentalExamination);
        }
        if (source.CheckRecord != null) {
            this.CheckRecord = new DiseasePresentBlock(source.CheckRecord);
        }
        if (source.InspectResult != null) {
            this.InspectResult = new DiseasePresentBlock(source.InspectResult);
        }
        if (source.CheckAndTreatmentProcess != null) {
            this.CheckAndTreatmentProcess = new DiseasePresentBlock(source.CheckAndTreatmentProcess);
        }
        if (source.SurgeryCondition != null) {
            this.SurgeryCondition = new SurgeryConditionBlock(source.SurgeryCondition);
        }
        if (source.IncisionHealing != null) {
            this.IncisionHealing = new DiseasePresentBlock(source.IncisionHealing);
        }
        if (source.DischargeDiagnosis != null) {
            this.DischargeDiagnosis = new DischargeDiagnosisBlock(source.DischargeDiagnosis);
        }
        if (source.DischargeTraditionalDiagnosis != null) {
            this.DischargeTraditionalDiagnosis = new DiseasePresentBlock(source.DischargeTraditionalDiagnosis);
        }
        if (source.DischargeModernDiagnosis != null) {
            this.DischargeModernDiagnosis = new DischargeDiagnosisBlock(source.DischargeModernDiagnosis);
        }
        if (source.DischargeCondition != null) {
            this.DischargeCondition = new DischargeConditionBlock(source.DischargeCondition);
        }
        if (source.DischargeInstructions != null) {
            this.DischargeInstructions = new DiseasePresentBlock(source.DischargeInstructions);
        }
        if (source.TreatmentSuggestion != null) {
            this.TreatmentSuggestion = new DiseasePresentBlock(source.TreatmentSuggestion);
        }
        if (source.FollowUpRequirements != null) {
            this.FollowUpRequirements = new DiseasePresentBlock(source.FollowUpRequirements);
        }
        if (source.ConditionChanges != null) {
            this.ConditionChanges = new DiseasePresentBlock(source.ConditionChanges);
        }
        if (source.PulmonaryArterySystolicPressure != null) {
            this.PulmonaryArterySystolicPressure = new DiseasePresentBlock(source.PulmonaryArterySystolicPressure);
        }
        if (source.BCLC != null) {
            this.BCLC = new DiseasePresentBlock(source.BCLC);
        }
        if (source.PTNM != null) {
            this.PTNM = new PTNMBlock(source.PTNM);
        }
        if (source.ECOG != null) {
            this.ECOG = new DiseasePresentBlock(source.ECOG);
        }
        if (source.NRS != null) {
            this.NRS = new DiseasePresentBlock(source.NRS);
        }
        if (source.KPS != null) {
            this.KPS = new DiseasePresentBlock(source.KPS);
        }
        if (source.Cancerstaging != null) {
            this.Cancerstaging = new ClinicalStaging(source.Cancerstaging);
        }
        if (source.DeathDate != null) {
            this.DeathDate = new DeathDateBlock(source.DeathDate);
        }
        if (source.RelapseDate != null) {
            this.RelapseDate = new RelapseDateBlock(source.RelapseDate);
        }
        if (source.ObservationDays != null) {
            this.ObservationDays = new DeathDateBlock(source.ObservationDays);
        }
        if (source.IncisionHealingText != null) {
            this.IncisionHealingText = new String(source.IncisionHealingText);
        }
        if (source.AuxiliaryExaminationText != null) {
            this.AuxiliaryExaminationText = new String(source.AuxiliaryExaminationText);
        }
        if (source.SpecialExamText != null) {
            this.SpecialExamText = new String(source.SpecialExamText);
        }
        if (source.OutpatientDiagnosisText != null) {
            this.OutpatientDiagnosisText = new String(source.OutpatientDiagnosisText);
        }
        if (source.AdmissionConditionText != null) {
            this.AdmissionConditionText = new String(source.AdmissionConditionText);
        }
        if (source.CheckAndTreatmentProcessText != null) {
            this.CheckAndTreatmentProcessText = new String(source.CheckAndTreatmentProcessText);
        }
        if (source.SymptomsAndSignsText != null) {
            this.SymptomsAndSignsText = new String(source.SymptomsAndSignsText);
        }
        if (source.DischargeInstructionsText != null) {
            this.DischargeInstructionsText = new String(source.DischargeInstructionsText);
        }
        if (source.AdmissionDiagnosisText != null) {
            this.AdmissionDiagnosisText = new String(source.AdmissionDiagnosisText);
        }
        if (source.SurgeryConditionText != null) {
            this.SurgeryConditionText = new String(source.SurgeryConditionText);
        }
        if (source.PathologicalDiagnosisText != null) {
            this.PathologicalDiagnosisText = new String(source.PathologicalDiagnosisText);
        }
        if (source.DischargeConditionText != null) {
            this.DischargeConditionText = new String(source.DischargeConditionText);
        }
        if (source.CheckRecordText != null) {
            this.CheckRecordText = new String(source.CheckRecordText);
        }
        if (source.ChiefComplaintText != null) {
            this.ChiefComplaintText = new String(source.ChiefComplaintText);
        }
        if (source.DischargeDiagnosisText != null) {
            this.DischargeDiagnosisText = new String(source.DischargeDiagnosisText);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Immunohistochemistry.", this.Immunohistochemistry);
        this.setParamObj(map, prefix + "ChiefComplaint.", this.ChiefComplaint);
        this.setParamObj(map, prefix + "AdmissionCondition.", this.AdmissionCondition);
        this.setParamObj(map, prefix + "BodyExamination.", this.BodyExamination);
        this.setParamObj(map, prefix + "AdmissionDiagnosis.", this.AdmissionDiagnosis);
        this.setParamObj(map, prefix + "AdmissionTraditionalDiagnosis.", this.AdmissionTraditionalDiagnosis);
        this.setParamObj(map, prefix + "AdmissionModernDiagnosis.", this.AdmissionModernDiagnosis);
        this.setParamObj(map, prefix + "PathologicalDiagnosis.", this.PathologicalDiagnosis);
        this.setParamObj(map, prefix + "DiseasePresent.", this.DiseasePresent);
        this.setParamObj(map, prefix + "SymptomsAndSigns.", this.SymptomsAndSigns);
        this.setParamObj(map, prefix + "AuxiliaryExamination.", this.AuxiliaryExamination);
        this.setParamObj(map, prefix + "SpecialistExamination.", this.SpecialistExamination);
        this.setParamObj(map, prefix + "MentalExamination.", this.MentalExamination);
        this.setParamObj(map, prefix + "CheckRecord.", this.CheckRecord);
        this.setParamObj(map, prefix + "InspectResult.", this.InspectResult);
        this.setParamObj(map, prefix + "CheckAndTreatmentProcess.", this.CheckAndTreatmentProcess);
        this.setParamObj(map, prefix + "SurgeryCondition.", this.SurgeryCondition);
        this.setParamObj(map, prefix + "IncisionHealing.", this.IncisionHealing);
        this.setParamObj(map, prefix + "DischargeDiagnosis.", this.DischargeDiagnosis);
        this.setParamObj(map, prefix + "DischargeTraditionalDiagnosis.", this.DischargeTraditionalDiagnosis);
        this.setParamObj(map, prefix + "DischargeModernDiagnosis.", this.DischargeModernDiagnosis);
        this.setParamObj(map, prefix + "DischargeCondition.", this.DischargeCondition);
        this.setParamObj(map, prefix + "DischargeInstructions.", this.DischargeInstructions);
        this.setParamObj(map, prefix + "TreatmentSuggestion.", this.TreatmentSuggestion);
        this.setParamObj(map, prefix + "FollowUpRequirements.", this.FollowUpRequirements);
        this.setParamObj(map, prefix + "ConditionChanges.", this.ConditionChanges);
        this.setParamObj(map, prefix + "PulmonaryArterySystolicPressure.", this.PulmonaryArterySystolicPressure);
        this.setParamObj(map, prefix + "BCLC.", this.BCLC);
        this.setParamObj(map, prefix + "PTNM.", this.PTNM);
        this.setParamObj(map, prefix + "ECOG.", this.ECOG);
        this.setParamObj(map, prefix + "NRS.", this.NRS);
        this.setParamObj(map, prefix + "KPS.", this.KPS);
        this.setParamObj(map, prefix + "Cancerstaging.", this.Cancerstaging);
        this.setParamObj(map, prefix + "DeathDate.", this.DeathDate);
        this.setParamObj(map, prefix + "RelapseDate.", this.RelapseDate);
        this.setParamObj(map, prefix + "ObservationDays.", this.ObservationDays);
        this.setParamSimple(map, prefix + "IncisionHealingText", this.IncisionHealingText);
        this.setParamSimple(map, prefix + "AuxiliaryExaminationText", this.AuxiliaryExaminationText);
        this.setParamSimple(map, prefix + "SpecialExamText", this.SpecialExamText);
        this.setParamSimple(map, prefix + "OutpatientDiagnosisText", this.OutpatientDiagnosisText);
        this.setParamSimple(map, prefix + "AdmissionConditionText", this.AdmissionConditionText);
        this.setParamSimple(map, prefix + "CheckAndTreatmentProcessText", this.CheckAndTreatmentProcessText);
        this.setParamSimple(map, prefix + "SymptomsAndSignsText", this.SymptomsAndSignsText);
        this.setParamSimple(map, prefix + "DischargeInstructionsText", this.DischargeInstructionsText);
        this.setParamSimple(map, prefix + "AdmissionDiagnosisText", this.AdmissionDiagnosisText);
        this.setParamSimple(map, prefix + "SurgeryConditionText", this.SurgeryConditionText);
        this.setParamSimple(map, prefix + "PathologicalDiagnosisText", this.PathologicalDiagnosisText);
        this.setParamSimple(map, prefix + "DischargeConditionText", this.DischargeConditionText);
        this.setParamSimple(map, prefix + "CheckRecordText", this.CheckRecordText);
        this.setParamSimple(map, prefix + "ChiefComplaintText", this.ChiefComplaintText);
        this.setParamSimple(map, prefix + "DischargeDiagnosisText", this.DischargeDiagnosisText);

    }
}

