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

public class MedicalRecordInfo extends AbstractModel{

    /**
    * 就诊日期
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DiagnosisTime")
    @Expose
    private String DiagnosisTime;

    /**
    * 就诊科室
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DiagnosisDepartmentName")
    @Expose
    private String DiagnosisDepartmentName;

    /**
    * 就诊医生
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DiagnosisDoctorName")
    @Expose
    private String DiagnosisDoctorName;

    /**
    * 临床诊断
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClinicalDiagnosis")
    @Expose
    private String ClinicalDiagnosis;

    /**
    * 主述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MainNarration")
    @Expose
    private String MainNarration;

    /**
    * 体格检查
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PhysicalExamination")
    @Expose
    private String PhysicalExamination;

    /**
    * 检查结论
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InspectionFindings")
    @Expose
    private String InspectionFindings;

    /**
    * 治疗意见
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TreatmentOpinion")
    @Expose
    private String TreatmentOpinion;

    /**
     * Get 就诊日期
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DiagnosisTime 就诊日期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDiagnosisTime() {
        return this.DiagnosisTime;
    }

    /**
     * Set 就诊日期
注意：此字段可能返回 null，表示取不到有效值。
     * @param DiagnosisTime 就诊日期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiagnosisTime(String DiagnosisTime) {
        this.DiagnosisTime = DiagnosisTime;
    }

    /**
     * Get 就诊科室
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DiagnosisDepartmentName 就诊科室
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDiagnosisDepartmentName() {
        return this.DiagnosisDepartmentName;
    }

    /**
     * Set 就诊科室
注意：此字段可能返回 null，表示取不到有效值。
     * @param DiagnosisDepartmentName 就诊科室
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiagnosisDepartmentName(String DiagnosisDepartmentName) {
        this.DiagnosisDepartmentName = DiagnosisDepartmentName;
    }

    /**
     * Get 就诊医生
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DiagnosisDoctorName 就诊医生
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDiagnosisDoctorName() {
        return this.DiagnosisDoctorName;
    }

    /**
     * Set 就诊医生
注意：此字段可能返回 null，表示取不到有效值。
     * @param DiagnosisDoctorName 就诊医生
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiagnosisDoctorName(String DiagnosisDoctorName) {
        this.DiagnosisDoctorName = DiagnosisDoctorName;
    }

    /**
     * Get 临床诊断
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClinicalDiagnosis 临床诊断
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClinicalDiagnosis() {
        return this.ClinicalDiagnosis;
    }

    /**
     * Set 临床诊断
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClinicalDiagnosis 临床诊断
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClinicalDiagnosis(String ClinicalDiagnosis) {
        this.ClinicalDiagnosis = ClinicalDiagnosis;
    }

    /**
     * Get 主述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MainNarration 主述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMainNarration() {
        return this.MainNarration;
    }

    /**
     * Set 主述
注意：此字段可能返回 null，表示取不到有效值。
     * @param MainNarration 主述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMainNarration(String MainNarration) {
        this.MainNarration = MainNarration;
    }

    /**
     * Get 体格检查
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PhysicalExamination 体格检查
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPhysicalExamination() {
        return this.PhysicalExamination;
    }

    /**
     * Set 体格检查
注意：此字段可能返回 null，表示取不到有效值。
     * @param PhysicalExamination 体格检查
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPhysicalExamination(String PhysicalExamination) {
        this.PhysicalExamination = PhysicalExamination;
    }

    /**
     * Get 检查结论
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InspectionFindings 检查结论
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInspectionFindings() {
        return this.InspectionFindings;
    }

    /**
     * Set 检查结论
注意：此字段可能返回 null，表示取不到有效值。
     * @param InspectionFindings 检查结论
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInspectionFindings(String InspectionFindings) {
        this.InspectionFindings = InspectionFindings;
    }

    /**
     * Get 治疗意见
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TreatmentOpinion 治疗意见
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTreatmentOpinion() {
        return this.TreatmentOpinion;
    }

    /**
     * Set 治疗意见
注意：此字段可能返回 null，表示取不到有效值。
     * @param TreatmentOpinion 治疗意见
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTreatmentOpinion(String TreatmentOpinion) {
        this.TreatmentOpinion = TreatmentOpinion;
    }

    public MedicalRecordInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MedicalRecordInfo(MedicalRecordInfo source) {
        if (source.DiagnosisTime != null) {
            this.DiagnosisTime = new String(source.DiagnosisTime);
        }
        if (source.DiagnosisDepartmentName != null) {
            this.DiagnosisDepartmentName = new String(source.DiagnosisDepartmentName);
        }
        if (source.DiagnosisDoctorName != null) {
            this.DiagnosisDoctorName = new String(source.DiagnosisDoctorName);
        }
        if (source.ClinicalDiagnosis != null) {
            this.ClinicalDiagnosis = new String(source.ClinicalDiagnosis);
        }
        if (source.MainNarration != null) {
            this.MainNarration = new String(source.MainNarration);
        }
        if (source.PhysicalExamination != null) {
            this.PhysicalExamination = new String(source.PhysicalExamination);
        }
        if (source.InspectionFindings != null) {
            this.InspectionFindings = new String(source.InspectionFindings);
        }
        if (source.TreatmentOpinion != null) {
            this.TreatmentOpinion = new String(source.TreatmentOpinion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DiagnosisTime", this.DiagnosisTime);
        this.setParamSimple(map, prefix + "DiagnosisDepartmentName", this.DiagnosisDepartmentName);
        this.setParamSimple(map, prefix + "DiagnosisDoctorName", this.DiagnosisDoctorName);
        this.setParamSimple(map, prefix + "ClinicalDiagnosis", this.ClinicalDiagnosis);
        this.setParamSimple(map, prefix + "MainNarration", this.MainNarration);
        this.setParamSimple(map, prefix + "PhysicalExamination", this.PhysicalExamination);
        this.setParamSimple(map, prefix + "InspectionFindings", this.InspectionFindings);
        this.setParamSimple(map, prefix + "TreatmentOpinion", this.TreatmentOpinion);

    }
}

