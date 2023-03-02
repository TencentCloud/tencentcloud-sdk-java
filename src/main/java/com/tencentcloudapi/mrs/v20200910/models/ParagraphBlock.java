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

public class ParagraphBlock extends AbstractModel{

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
    * 既往史
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MainDiseaseHistoryText")
    @Expose
    private String MainDiseaseHistoryText;

    /**
    * 现病史
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DiseasePresentText")
    @Expose
    private String DiseasePresentText;

    /**
    * 个人史
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PersonalHistoryText")
    @Expose
    private String PersonalHistoryText;

    /**
    * 月经史
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MenstruallHistoryText")
    @Expose
    private String MenstruallHistoryText;

    /**
    * 婚育史
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ObstericalHistoryText")
    @Expose
    private String ObstericalHistoryText;

    /**
    * 家族史
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FamilyHistoryText")
    @Expose
    private String FamilyHistoryText;

    /**
    * 过敏史
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AllergyHistoryText")
    @Expose
    private String AllergyHistoryText;

    /**
    * 病史信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DiseaseHistoryText")
    @Expose
    private String DiseaseHistoryText;

    /**
    * 其它诊断
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OtherDiagnosisText")
    @Expose
    private String OtherDiagnosisText;

    /**
    * 体格检查
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BodyExaminationText")
    @Expose
    private String BodyExaminationText;

    /**
    * 专科检查
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SpecialistExaminationText")
    @Expose
    private String SpecialistExaminationText;

    /**
    * 治疗结果
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TreatmentResultText")
    @Expose
    private String TreatmentResultText;

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

    /**
     * Get 既往史
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MainDiseaseHistoryText 既往史
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMainDiseaseHistoryText() {
        return this.MainDiseaseHistoryText;
    }

    /**
     * Set 既往史
注意：此字段可能返回 null，表示取不到有效值。
     * @param MainDiseaseHistoryText 既往史
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMainDiseaseHistoryText(String MainDiseaseHistoryText) {
        this.MainDiseaseHistoryText = MainDiseaseHistoryText;
    }

    /**
     * Get 现病史
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DiseasePresentText 现病史
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDiseasePresentText() {
        return this.DiseasePresentText;
    }

    /**
     * Set 现病史
注意：此字段可能返回 null，表示取不到有效值。
     * @param DiseasePresentText 现病史
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiseasePresentText(String DiseasePresentText) {
        this.DiseasePresentText = DiseasePresentText;
    }

    /**
     * Get 个人史
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PersonalHistoryText 个人史
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPersonalHistoryText() {
        return this.PersonalHistoryText;
    }

    /**
     * Set 个人史
注意：此字段可能返回 null，表示取不到有效值。
     * @param PersonalHistoryText 个人史
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPersonalHistoryText(String PersonalHistoryText) {
        this.PersonalHistoryText = PersonalHistoryText;
    }

    /**
     * Get 月经史
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MenstruallHistoryText 月经史
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMenstruallHistoryText() {
        return this.MenstruallHistoryText;
    }

    /**
     * Set 月经史
注意：此字段可能返回 null，表示取不到有效值。
     * @param MenstruallHistoryText 月经史
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMenstruallHistoryText(String MenstruallHistoryText) {
        this.MenstruallHistoryText = MenstruallHistoryText;
    }

    /**
     * Get 婚育史
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ObstericalHistoryText 婚育史
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getObstericalHistoryText() {
        return this.ObstericalHistoryText;
    }

    /**
     * Set 婚育史
注意：此字段可能返回 null，表示取不到有效值。
     * @param ObstericalHistoryText 婚育史
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setObstericalHistoryText(String ObstericalHistoryText) {
        this.ObstericalHistoryText = ObstericalHistoryText;
    }

    /**
     * Get 家族史
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FamilyHistoryText 家族史
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFamilyHistoryText() {
        return this.FamilyHistoryText;
    }

    /**
     * Set 家族史
注意：此字段可能返回 null，表示取不到有效值。
     * @param FamilyHistoryText 家族史
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFamilyHistoryText(String FamilyHistoryText) {
        this.FamilyHistoryText = FamilyHistoryText;
    }

    /**
     * Get 过敏史
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AllergyHistoryText 过敏史
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAllergyHistoryText() {
        return this.AllergyHistoryText;
    }

    /**
     * Set 过敏史
注意：此字段可能返回 null，表示取不到有效值。
     * @param AllergyHistoryText 过敏史
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAllergyHistoryText(String AllergyHistoryText) {
        this.AllergyHistoryText = AllergyHistoryText;
    }

    /**
     * Get 病史信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DiseaseHistoryText 病史信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDiseaseHistoryText() {
        return this.DiseaseHistoryText;
    }

    /**
     * Set 病史信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param DiseaseHistoryText 病史信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiseaseHistoryText(String DiseaseHistoryText) {
        this.DiseaseHistoryText = DiseaseHistoryText;
    }

    /**
     * Get 其它诊断
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OtherDiagnosisText 其它诊断
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOtherDiagnosisText() {
        return this.OtherDiagnosisText;
    }

    /**
     * Set 其它诊断
注意：此字段可能返回 null，表示取不到有效值。
     * @param OtherDiagnosisText 其它诊断
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOtherDiagnosisText(String OtherDiagnosisText) {
        this.OtherDiagnosisText = OtherDiagnosisText;
    }

    /**
     * Get 体格检查
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BodyExaminationText 体格检查
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBodyExaminationText() {
        return this.BodyExaminationText;
    }

    /**
     * Set 体格检查
注意：此字段可能返回 null，表示取不到有效值。
     * @param BodyExaminationText 体格检查
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBodyExaminationText(String BodyExaminationText) {
        this.BodyExaminationText = BodyExaminationText;
    }

    /**
     * Get 专科检查
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SpecialistExaminationText 专科检查
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSpecialistExaminationText() {
        return this.SpecialistExaminationText;
    }

    /**
     * Set 专科检查
注意：此字段可能返回 null，表示取不到有效值。
     * @param SpecialistExaminationText 专科检查
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSpecialistExaminationText(String SpecialistExaminationText) {
        this.SpecialistExaminationText = SpecialistExaminationText;
    }

    /**
     * Get 治疗结果
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TreatmentResultText 治疗结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTreatmentResultText() {
        return this.TreatmentResultText;
    }

    /**
     * Set 治疗结果
注意：此字段可能返回 null，表示取不到有效值。
     * @param TreatmentResultText 治疗结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTreatmentResultText(String TreatmentResultText) {
        this.TreatmentResultText = TreatmentResultText;
    }

    public ParagraphBlock() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ParagraphBlock(ParagraphBlock source) {
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
        if (source.MainDiseaseHistoryText != null) {
            this.MainDiseaseHistoryText = new String(source.MainDiseaseHistoryText);
        }
        if (source.DiseasePresentText != null) {
            this.DiseasePresentText = new String(source.DiseasePresentText);
        }
        if (source.PersonalHistoryText != null) {
            this.PersonalHistoryText = new String(source.PersonalHistoryText);
        }
        if (source.MenstruallHistoryText != null) {
            this.MenstruallHistoryText = new String(source.MenstruallHistoryText);
        }
        if (source.ObstericalHistoryText != null) {
            this.ObstericalHistoryText = new String(source.ObstericalHistoryText);
        }
        if (source.FamilyHistoryText != null) {
            this.FamilyHistoryText = new String(source.FamilyHistoryText);
        }
        if (source.AllergyHistoryText != null) {
            this.AllergyHistoryText = new String(source.AllergyHistoryText);
        }
        if (source.DiseaseHistoryText != null) {
            this.DiseaseHistoryText = new String(source.DiseaseHistoryText);
        }
        if (source.OtherDiagnosisText != null) {
            this.OtherDiagnosisText = new String(source.OtherDiagnosisText);
        }
        if (source.BodyExaminationText != null) {
            this.BodyExaminationText = new String(source.BodyExaminationText);
        }
        if (source.SpecialistExaminationText != null) {
            this.SpecialistExaminationText = new String(source.SpecialistExaminationText);
        }
        if (source.TreatmentResultText != null) {
            this.TreatmentResultText = new String(source.TreatmentResultText);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
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
        this.setParamSimple(map, prefix + "MainDiseaseHistoryText", this.MainDiseaseHistoryText);
        this.setParamSimple(map, prefix + "DiseasePresentText", this.DiseasePresentText);
        this.setParamSimple(map, prefix + "PersonalHistoryText", this.PersonalHistoryText);
        this.setParamSimple(map, prefix + "MenstruallHistoryText", this.MenstruallHistoryText);
        this.setParamSimple(map, prefix + "ObstericalHistoryText", this.ObstericalHistoryText);
        this.setParamSimple(map, prefix + "FamilyHistoryText", this.FamilyHistoryText);
        this.setParamSimple(map, prefix + "AllergyHistoryText", this.AllergyHistoryText);
        this.setParamSimple(map, prefix + "DiseaseHistoryText", this.DiseaseHistoryText);
        this.setParamSimple(map, prefix + "OtherDiagnosisText", this.OtherDiagnosisText);
        this.setParamSimple(map, prefix + "BodyExaminationText", this.BodyExaminationText);
        this.setParamSimple(map, prefix + "SpecialistExaminationText", this.SpecialistExaminationText);
        this.setParamSimple(map, prefix + "TreatmentResultText", this.TreatmentResultText);

    }
}

