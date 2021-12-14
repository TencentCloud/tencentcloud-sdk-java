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

public class Template extends AbstractModel{

    /**
    * 患者信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PatientInfo")
    @Expose
    private PatientInfo PatientInfo;

    /**
    * 报告信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReportInfo")
    @Expose
    private ReportInfo ReportInfo;

    /**
    * 检查报告
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Check")
    @Expose
    private Check Check;

    /**
    * 病理报告
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Pathology")
    @Expose
    private PathologyReport Pathology;

    /**
    * 出院报告，入院报告，门诊病历
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MedDoc")
    @Expose
    private MedDoc MedDoc;

    /**
    * 诊断证明
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DiagCert")
    @Expose
    private DiagCert DiagCert;

    /**
    * 病案首页
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FirstPage")
    @Expose
    private FirstPage FirstPage;

    /**
    * 检验报告
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Indicator")
    @Expose
    private Indicator Indicator;

    /**
    * 报告类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReportType")
    @Expose
    private String ReportType;

    /**
    * 门诊病历信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MedicalRecordInfo")
    @Expose
    private MedicalRecordInfo MedicalRecordInfo;

    /**
    * 出入院信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Hospitalization")
    @Expose
    private Hospitalization Hospitalization;

    /**
    * 手术记录
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Surgery")
    @Expose
    private Surgery Surgery;

    /**
    * 心电图报告
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Electrocardiogram")
    @Expose
    private Electrocardiogram Electrocardiogram;

    /**
    * 内窥镜报告
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Endoscopy")
    @Expose
    private Endoscopy Endoscopy;

    /**
    * 处方单
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Prescription")
    @Expose
    private Prescription Prescription;

    /**
    * 免疫接种证明
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VaccineCertificate")
    @Expose
    private VaccineCertificate VaccineCertificate;

    /**
    * OCR文本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OcrText")
    @Expose
    private String OcrText;

    /**
    * OCR拼接后文本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OcrResult")
    @Expose
    private String OcrResult;

    /**
     * Get 患者信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PatientInfo 患者信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PatientInfo getPatientInfo() {
        return this.PatientInfo;
    }

    /**
     * Set 患者信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param PatientInfo 患者信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPatientInfo(PatientInfo PatientInfo) {
        this.PatientInfo = PatientInfo;
    }

    /**
     * Get 报告信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReportInfo 报告信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ReportInfo getReportInfo() {
        return this.ReportInfo;
    }

    /**
     * Set 报告信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReportInfo 报告信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReportInfo(ReportInfo ReportInfo) {
        this.ReportInfo = ReportInfo;
    }

    /**
     * Get 检查报告
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Check 检查报告
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Check getCheck() {
        return this.Check;
    }

    /**
     * Set 检查报告
注意：此字段可能返回 null，表示取不到有效值。
     * @param Check 检查报告
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCheck(Check Check) {
        this.Check = Check;
    }

    /**
     * Get 病理报告
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Pathology 病理报告
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PathologyReport getPathology() {
        return this.Pathology;
    }

    /**
     * Set 病理报告
注意：此字段可能返回 null，表示取不到有效值。
     * @param Pathology 病理报告
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPathology(PathologyReport Pathology) {
        this.Pathology = Pathology;
    }

    /**
     * Get 出院报告，入院报告，门诊病历
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MedDoc 出院报告，入院报告，门诊病历
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MedDoc getMedDoc() {
        return this.MedDoc;
    }

    /**
     * Set 出院报告，入院报告，门诊病历
注意：此字段可能返回 null，表示取不到有效值。
     * @param MedDoc 出院报告，入院报告，门诊病历
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMedDoc(MedDoc MedDoc) {
        this.MedDoc = MedDoc;
    }

    /**
     * Get 诊断证明
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DiagCert 诊断证明
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DiagCert getDiagCert() {
        return this.DiagCert;
    }

    /**
     * Set 诊断证明
注意：此字段可能返回 null，表示取不到有效值。
     * @param DiagCert 诊断证明
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiagCert(DiagCert DiagCert) {
        this.DiagCert = DiagCert;
    }

    /**
     * Get 病案首页
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FirstPage 病案首页
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FirstPage getFirstPage() {
        return this.FirstPage;
    }

    /**
     * Set 病案首页
注意：此字段可能返回 null，表示取不到有效值。
     * @param FirstPage 病案首页
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFirstPage(FirstPage FirstPage) {
        this.FirstPage = FirstPage;
    }

    /**
     * Get 检验报告
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Indicator 检验报告
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Indicator getIndicator() {
        return this.Indicator;
    }

    /**
     * Set 检验报告
注意：此字段可能返回 null，表示取不到有效值。
     * @param Indicator 检验报告
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIndicator(Indicator Indicator) {
        this.Indicator = Indicator;
    }

    /**
     * Get 报告类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReportType 报告类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReportType() {
        return this.ReportType;
    }

    /**
     * Set 报告类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReportType 报告类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReportType(String ReportType) {
        this.ReportType = ReportType;
    }

    /**
     * Get 门诊病历信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MedicalRecordInfo 门诊病历信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MedicalRecordInfo getMedicalRecordInfo() {
        return this.MedicalRecordInfo;
    }

    /**
     * Set 门诊病历信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param MedicalRecordInfo 门诊病历信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMedicalRecordInfo(MedicalRecordInfo MedicalRecordInfo) {
        this.MedicalRecordInfo = MedicalRecordInfo;
    }

    /**
     * Get 出入院信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Hospitalization 出入院信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Hospitalization getHospitalization() {
        return this.Hospitalization;
    }

    /**
     * Set 出入院信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Hospitalization 出入院信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHospitalization(Hospitalization Hospitalization) {
        this.Hospitalization = Hospitalization;
    }

    /**
     * Get 手术记录
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Surgery 手术记录
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Surgery getSurgery() {
        return this.Surgery;
    }

    /**
     * Set 手术记录
注意：此字段可能返回 null，表示取不到有效值。
     * @param Surgery 手术记录
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSurgery(Surgery Surgery) {
        this.Surgery = Surgery;
    }

    /**
     * Get 心电图报告
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Electrocardiogram 心电图报告
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Electrocardiogram getElectrocardiogram() {
        return this.Electrocardiogram;
    }

    /**
     * Set 心电图报告
注意：此字段可能返回 null，表示取不到有效值。
     * @param Electrocardiogram 心电图报告
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setElectrocardiogram(Electrocardiogram Electrocardiogram) {
        this.Electrocardiogram = Electrocardiogram;
    }

    /**
     * Get 内窥镜报告
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Endoscopy 内窥镜报告
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Endoscopy getEndoscopy() {
        return this.Endoscopy;
    }

    /**
     * Set 内窥镜报告
注意：此字段可能返回 null，表示取不到有效值。
     * @param Endoscopy 内窥镜报告
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndoscopy(Endoscopy Endoscopy) {
        this.Endoscopy = Endoscopy;
    }

    /**
     * Get 处方单
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Prescription 处方单
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Prescription getPrescription() {
        return this.Prescription;
    }

    /**
     * Set 处方单
注意：此字段可能返回 null，表示取不到有效值。
     * @param Prescription 处方单
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPrescription(Prescription Prescription) {
        this.Prescription = Prescription;
    }

    /**
     * Get 免疫接种证明
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VaccineCertificate 免疫接种证明
注意：此字段可能返回 null，表示取不到有效值。
     */
    public VaccineCertificate getVaccineCertificate() {
        return this.VaccineCertificate;
    }

    /**
     * Set 免疫接种证明
注意：此字段可能返回 null，表示取不到有效值。
     * @param VaccineCertificate 免疫接种证明
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVaccineCertificate(VaccineCertificate VaccineCertificate) {
        this.VaccineCertificate = VaccineCertificate;
    }

    /**
     * Get OCR文本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OcrText OCR文本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOcrText() {
        return this.OcrText;
    }

    /**
     * Set OCR文本
注意：此字段可能返回 null，表示取不到有效值。
     * @param OcrText OCR文本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOcrText(String OcrText) {
        this.OcrText = OcrText;
    }

    /**
     * Get OCR拼接后文本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OcrResult OCR拼接后文本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOcrResult() {
        return this.OcrResult;
    }

    /**
     * Set OCR拼接后文本
注意：此字段可能返回 null，表示取不到有效值。
     * @param OcrResult OCR拼接后文本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOcrResult(String OcrResult) {
        this.OcrResult = OcrResult;
    }

    public Template() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Template(Template source) {
        if (source.PatientInfo != null) {
            this.PatientInfo = new PatientInfo(source.PatientInfo);
        }
        if (source.ReportInfo != null) {
            this.ReportInfo = new ReportInfo(source.ReportInfo);
        }
        if (source.Check != null) {
            this.Check = new Check(source.Check);
        }
        if (source.Pathology != null) {
            this.Pathology = new PathologyReport(source.Pathology);
        }
        if (source.MedDoc != null) {
            this.MedDoc = new MedDoc(source.MedDoc);
        }
        if (source.DiagCert != null) {
            this.DiagCert = new DiagCert(source.DiagCert);
        }
        if (source.FirstPage != null) {
            this.FirstPage = new FirstPage(source.FirstPage);
        }
        if (source.Indicator != null) {
            this.Indicator = new Indicator(source.Indicator);
        }
        if (source.ReportType != null) {
            this.ReportType = new String(source.ReportType);
        }
        if (source.MedicalRecordInfo != null) {
            this.MedicalRecordInfo = new MedicalRecordInfo(source.MedicalRecordInfo);
        }
        if (source.Hospitalization != null) {
            this.Hospitalization = new Hospitalization(source.Hospitalization);
        }
        if (source.Surgery != null) {
            this.Surgery = new Surgery(source.Surgery);
        }
        if (source.Electrocardiogram != null) {
            this.Electrocardiogram = new Electrocardiogram(source.Electrocardiogram);
        }
        if (source.Endoscopy != null) {
            this.Endoscopy = new Endoscopy(source.Endoscopy);
        }
        if (source.Prescription != null) {
            this.Prescription = new Prescription(source.Prescription);
        }
        if (source.VaccineCertificate != null) {
            this.VaccineCertificate = new VaccineCertificate(source.VaccineCertificate);
        }
        if (source.OcrText != null) {
            this.OcrText = new String(source.OcrText);
        }
        if (source.OcrResult != null) {
            this.OcrResult = new String(source.OcrResult);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "PatientInfo.", this.PatientInfo);
        this.setParamObj(map, prefix + "ReportInfo.", this.ReportInfo);
        this.setParamObj(map, prefix + "Check.", this.Check);
        this.setParamObj(map, prefix + "Pathology.", this.Pathology);
        this.setParamObj(map, prefix + "MedDoc.", this.MedDoc);
        this.setParamObj(map, prefix + "DiagCert.", this.DiagCert);
        this.setParamObj(map, prefix + "FirstPage.", this.FirstPage);
        this.setParamObj(map, prefix + "Indicator.", this.Indicator);
        this.setParamSimple(map, prefix + "ReportType", this.ReportType);
        this.setParamObj(map, prefix + "MedicalRecordInfo.", this.MedicalRecordInfo);
        this.setParamObj(map, prefix + "Hospitalization.", this.Hospitalization);
        this.setParamObj(map, prefix + "Surgery.", this.Surgery);
        this.setParamObj(map, prefix + "Electrocardiogram.", this.Electrocardiogram);
        this.setParamObj(map, prefix + "Endoscopy.", this.Endoscopy);
        this.setParamObj(map, prefix + "Prescription.", this.Prescription);
        this.setParamObj(map, prefix + "VaccineCertificate.", this.VaccineCertificate);
        this.setParamSimple(map, prefix + "OcrText", this.OcrText);
        this.setParamSimple(map, prefix + "OcrResult", this.OcrResult);

    }
}

