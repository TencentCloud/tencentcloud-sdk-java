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

public class Template extends AbstractModel {

    /**
    * 患者信息
    */
    @SerializedName("PatientInfo")
    @Expose
    private PatientInfo PatientInfo;

    /**
    * 报告信息
    */
    @SerializedName("ReportInfo")
    @Expose
    private ReportInfo ReportInfo;

    /**
    * 检查报告
    */
    @SerializedName("Check")
    @Expose
    private Check Check;

    /**
    * 病理报告
    */
    @SerializedName("Pathology")
    @Expose
    private PathologyReport Pathology;

    /**
    * 出院报告，入院报告，门诊病历
    */
    @SerializedName("MedDoc")
    @Expose
    private MedDoc MedDoc;

    /**
    * 诊断证明
    */
    @SerializedName("DiagCert")
    @Expose
    private DiagCert DiagCert;

    /**
    * 病案首页
    */
    @SerializedName("FirstPage")
    @Expose
    private FirstPage FirstPage;

    /**
    * 检验报告
    */
    @SerializedName("Indicator")
    @Expose
    private Indicator Indicator;

    /**
    * 报告类型
    */
    @SerializedName("ReportType")
    @Expose
    private String ReportType;

    /**
    * 门诊病历信息
    */
    @SerializedName("MedicalRecordInfo")
    @Expose
    private MedicalRecordInfo MedicalRecordInfo;

    /**
    * 出入院信息
    */
    @SerializedName("Hospitalization")
    @Expose
    private Hospitalization Hospitalization;

    /**
    * 手术记录
    */
    @SerializedName("Surgery")
    @Expose
    private Surgery Surgery;

    /**
    * 心电图报告
    */
    @SerializedName("Electrocardiogram")
    @Expose
    private Electrocardiogram Electrocardiogram;

    /**
    * 内窥镜报告
    */
    @SerializedName("Endoscopy")
    @Expose
    private Endoscopy Endoscopy;

    /**
    * 处方单
    */
    @SerializedName("Prescription")
    @Expose
    private Prescription Prescription;

    /**
    * 疫苗接种凭证
    */
    @SerializedName("VaccineCertificate")
    @Expose
    private VaccineCertificate VaccineCertificate;

    /**
    * OCR文本
    */
    @SerializedName("OcrText")
    @Expose
    private String OcrText;

    /**
    * OCR拼接后文本
    */
    @SerializedName("OcrResult")
    @Expose
    private String OcrResult;

    /**
    * 报告类型
    */
    @SerializedName("ReportTypeDesc")
    @Expose
    private String ReportTypeDesc;

    /**
    * 病理报告v2
    */
    @SerializedName("PathologyV2")
    @Expose
    private PathologyV2 PathologyV2;

    /**
    * 碳14尿素呼气试验
    */
    @SerializedName("C14")
    @Expose
    private Indicator C14;

    /**
    * 体检结论
    */
    @SerializedName("Exame")
    @Expose
    private Exame Exame;

    /**
    * 出院报告v2，入院报告v2，门诊病历v2
    */
    @SerializedName("MedDocV2")
    @Expose
    private DischargeInfoBlock MedDocV2;

    /**
    * 检验报告v3
    */
    @SerializedName("IndicatorV3")
    @Expose
    private IndicatorV3 IndicatorV3;

    /**
    * 核酸报告
    */
    @SerializedName("Covid")
    @Expose
    private CovidItemsInfo Covid;

    /**
    * 孕产报告
    */
    @SerializedName("Maternity")
    @Expose
    private Maternity Maternity;

    /**
    * 眼科报告
    */
    @SerializedName("Eye")
    @Expose
    private EyeItemsInfo Eye;

    /**
    * 出生证明
    */
    @SerializedName("BirthCert")
    @Expose
    private BirthCert BirthCert;

    /**
    * 时间轴
    */
    @SerializedName("Timeline")
    @Expose
    private TimelineInformation Timeline;

    /**
    * 内窥镜报告V2
    */
    @SerializedName("EndoscopyV2")
    @Expose
    private Check EndoscopyV2;

    /**
     * Get 患者信息 
     * @return PatientInfo 患者信息
     */
    public PatientInfo getPatientInfo() {
        return this.PatientInfo;
    }

    /**
     * Set 患者信息
     * @param PatientInfo 患者信息
     */
    public void setPatientInfo(PatientInfo PatientInfo) {
        this.PatientInfo = PatientInfo;
    }

    /**
     * Get 报告信息 
     * @return ReportInfo 报告信息
     */
    public ReportInfo getReportInfo() {
        return this.ReportInfo;
    }

    /**
     * Set 报告信息
     * @param ReportInfo 报告信息
     */
    public void setReportInfo(ReportInfo ReportInfo) {
        this.ReportInfo = ReportInfo;
    }

    /**
     * Get 检查报告 
     * @return Check 检查报告
     */
    public Check getCheck() {
        return this.Check;
    }

    /**
     * Set 检查报告
     * @param Check 检查报告
     */
    public void setCheck(Check Check) {
        this.Check = Check;
    }

    /**
     * Get 病理报告 
     * @return Pathology 病理报告
     */
    public PathologyReport getPathology() {
        return this.Pathology;
    }

    /**
     * Set 病理报告
     * @param Pathology 病理报告
     */
    public void setPathology(PathologyReport Pathology) {
        this.Pathology = Pathology;
    }

    /**
     * Get 出院报告，入院报告，门诊病历 
     * @return MedDoc 出院报告，入院报告，门诊病历
     */
    public MedDoc getMedDoc() {
        return this.MedDoc;
    }

    /**
     * Set 出院报告，入院报告，门诊病历
     * @param MedDoc 出院报告，入院报告，门诊病历
     */
    public void setMedDoc(MedDoc MedDoc) {
        this.MedDoc = MedDoc;
    }

    /**
     * Get 诊断证明 
     * @return DiagCert 诊断证明
     */
    public DiagCert getDiagCert() {
        return this.DiagCert;
    }

    /**
     * Set 诊断证明
     * @param DiagCert 诊断证明
     */
    public void setDiagCert(DiagCert DiagCert) {
        this.DiagCert = DiagCert;
    }

    /**
     * Get 病案首页 
     * @return FirstPage 病案首页
     */
    public FirstPage getFirstPage() {
        return this.FirstPage;
    }

    /**
     * Set 病案首页
     * @param FirstPage 病案首页
     */
    public void setFirstPage(FirstPage FirstPage) {
        this.FirstPage = FirstPage;
    }

    /**
     * Get 检验报告 
     * @return Indicator 检验报告
     */
    public Indicator getIndicator() {
        return this.Indicator;
    }

    /**
     * Set 检验报告
     * @param Indicator 检验报告
     */
    public void setIndicator(Indicator Indicator) {
        this.Indicator = Indicator;
    }

    /**
     * Get 报告类型 
     * @return ReportType 报告类型
     */
    public String getReportType() {
        return this.ReportType;
    }

    /**
     * Set 报告类型
     * @param ReportType 报告类型
     */
    public void setReportType(String ReportType) {
        this.ReportType = ReportType;
    }

    /**
     * Get 门诊病历信息 
     * @return MedicalRecordInfo 门诊病历信息
     */
    public MedicalRecordInfo getMedicalRecordInfo() {
        return this.MedicalRecordInfo;
    }

    /**
     * Set 门诊病历信息
     * @param MedicalRecordInfo 门诊病历信息
     */
    public void setMedicalRecordInfo(MedicalRecordInfo MedicalRecordInfo) {
        this.MedicalRecordInfo = MedicalRecordInfo;
    }

    /**
     * Get 出入院信息 
     * @return Hospitalization 出入院信息
     */
    public Hospitalization getHospitalization() {
        return this.Hospitalization;
    }

    /**
     * Set 出入院信息
     * @param Hospitalization 出入院信息
     */
    public void setHospitalization(Hospitalization Hospitalization) {
        this.Hospitalization = Hospitalization;
    }

    /**
     * Get 手术记录 
     * @return Surgery 手术记录
     */
    public Surgery getSurgery() {
        return this.Surgery;
    }

    /**
     * Set 手术记录
     * @param Surgery 手术记录
     */
    public void setSurgery(Surgery Surgery) {
        this.Surgery = Surgery;
    }

    /**
     * Get 心电图报告 
     * @return Electrocardiogram 心电图报告
     */
    public Electrocardiogram getElectrocardiogram() {
        return this.Electrocardiogram;
    }

    /**
     * Set 心电图报告
     * @param Electrocardiogram 心电图报告
     */
    public void setElectrocardiogram(Electrocardiogram Electrocardiogram) {
        this.Electrocardiogram = Electrocardiogram;
    }

    /**
     * Get 内窥镜报告 
     * @return Endoscopy 内窥镜报告
     */
    public Endoscopy getEndoscopy() {
        return this.Endoscopy;
    }

    /**
     * Set 内窥镜报告
     * @param Endoscopy 内窥镜报告
     */
    public void setEndoscopy(Endoscopy Endoscopy) {
        this.Endoscopy = Endoscopy;
    }

    /**
     * Get 处方单 
     * @return Prescription 处方单
     */
    public Prescription getPrescription() {
        return this.Prescription;
    }

    /**
     * Set 处方单
     * @param Prescription 处方单
     */
    public void setPrescription(Prescription Prescription) {
        this.Prescription = Prescription;
    }

    /**
     * Get 疫苗接种凭证 
     * @return VaccineCertificate 疫苗接种凭证
     */
    public VaccineCertificate getVaccineCertificate() {
        return this.VaccineCertificate;
    }

    /**
     * Set 疫苗接种凭证
     * @param VaccineCertificate 疫苗接种凭证
     */
    public void setVaccineCertificate(VaccineCertificate VaccineCertificate) {
        this.VaccineCertificate = VaccineCertificate;
    }

    /**
     * Get OCR文本 
     * @return OcrText OCR文本
     */
    public String getOcrText() {
        return this.OcrText;
    }

    /**
     * Set OCR文本
     * @param OcrText OCR文本
     */
    public void setOcrText(String OcrText) {
        this.OcrText = OcrText;
    }

    /**
     * Get OCR拼接后文本 
     * @return OcrResult OCR拼接后文本
     */
    public String getOcrResult() {
        return this.OcrResult;
    }

    /**
     * Set OCR拼接后文本
     * @param OcrResult OCR拼接后文本
     */
    public void setOcrResult(String OcrResult) {
        this.OcrResult = OcrResult;
    }

    /**
     * Get 报告类型 
     * @return ReportTypeDesc 报告类型
     */
    public String getReportTypeDesc() {
        return this.ReportTypeDesc;
    }

    /**
     * Set 报告类型
     * @param ReportTypeDesc 报告类型
     */
    public void setReportTypeDesc(String ReportTypeDesc) {
        this.ReportTypeDesc = ReportTypeDesc;
    }

    /**
     * Get 病理报告v2 
     * @return PathologyV2 病理报告v2
     */
    public PathologyV2 getPathologyV2() {
        return this.PathologyV2;
    }

    /**
     * Set 病理报告v2
     * @param PathologyV2 病理报告v2
     */
    public void setPathologyV2(PathologyV2 PathologyV2) {
        this.PathologyV2 = PathologyV2;
    }

    /**
     * Get 碳14尿素呼气试验 
     * @return C14 碳14尿素呼气试验
     */
    public Indicator getC14() {
        return this.C14;
    }

    /**
     * Set 碳14尿素呼气试验
     * @param C14 碳14尿素呼气试验
     */
    public void setC14(Indicator C14) {
        this.C14 = C14;
    }

    /**
     * Get 体检结论 
     * @return Exame 体检结论
     */
    public Exame getExame() {
        return this.Exame;
    }

    /**
     * Set 体检结论
     * @param Exame 体检结论
     */
    public void setExame(Exame Exame) {
        this.Exame = Exame;
    }

    /**
     * Get 出院报告v2，入院报告v2，门诊病历v2 
     * @return MedDocV2 出院报告v2，入院报告v2，门诊病历v2
     */
    public DischargeInfoBlock getMedDocV2() {
        return this.MedDocV2;
    }

    /**
     * Set 出院报告v2，入院报告v2，门诊病历v2
     * @param MedDocV2 出院报告v2，入院报告v2，门诊病历v2
     */
    public void setMedDocV2(DischargeInfoBlock MedDocV2) {
        this.MedDocV2 = MedDocV2;
    }

    /**
     * Get 检验报告v3 
     * @return IndicatorV3 检验报告v3
     */
    public IndicatorV3 getIndicatorV3() {
        return this.IndicatorV3;
    }

    /**
     * Set 检验报告v3
     * @param IndicatorV3 检验报告v3
     */
    public void setIndicatorV3(IndicatorV3 IndicatorV3) {
        this.IndicatorV3 = IndicatorV3;
    }

    /**
     * Get 核酸报告 
     * @return Covid 核酸报告
     */
    public CovidItemsInfo getCovid() {
        return this.Covid;
    }

    /**
     * Set 核酸报告
     * @param Covid 核酸报告
     */
    public void setCovid(CovidItemsInfo Covid) {
        this.Covid = Covid;
    }

    /**
     * Get 孕产报告 
     * @return Maternity 孕产报告
     */
    public Maternity getMaternity() {
        return this.Maternity;
    }

    /**
     * Set 孕产报告
     * @param Maternity 孕产报告
     */
    public void setMaternity(Maternity Maternity) {
        this.Maternity = Maternity;
    }

    /**
     * Get 眼科报告 
     * @return Eye 眼科报告
     */
    public EyeItemsInfo getEye() {
        return this.Eye;
    }

    /**
     * Set 眼科报告
     * @param Eye 眼科报告
     */
    public void setEye(EyeItemsInfo Eye) {
        this.Eye = Eye;
    }

    /**
     * Get 出生证明 
     * @return BirthCert 出生证明
     */
    public BirthCert getBirthCert() {
        return this.BirthCert;
    }

    /**
     * Set 出生证明
     * @param BirthCert 出生证明
     */
    public void setBirthCert(BirthCert BirthCert) {
        this.BirthCert = BirthCert;
    }

    /**
     * Get 时间轴 
     * @return Timeline 时间轴
     */
    public TimelineInformation getTimeline() {
        return this.Timeline;
    }

    /**
     * Set 时间轴
     * @param Timeline 时间轴
     */
    public void setTimeline(TimelineInformation Timeline) {
        this.Timeline = Timeline;
    }

    /**
     * Get 内窥镜报告V2 
     * @return EndoscopyV2 内窥镜报告V2
     */
    public Check getEndoscopyV2() {
        return this.EndoscopyV2;
    }

    /**
     * Set 内窥镜报告V2
     * @param EndoscopyV2 内窥镜报告V2
     */
    public void setEndoscopyV2(Check EndoscopyV2) {
        this.EndoscopyV2 = EndoscopyV2;
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
        if (source.ReportTypeDesc != null) {
            this.ReportTypeDesc = new String(source.ReportTypeDesc);
        }
        if (source.PathologyV2 != null) {
            this.PathologyV2 = new PathologyV2(source.PathologyV2);
        }
        if (source.C14 != null) {
            this.C14 = new Indicator(source.C14);
        }
        if (source.Exame != null) {
            this.Exame = new Exame(source.Exame);
        }
        if (source.MedDocV2 != null) {
            this.MedDocV2 = new DischargeInfoBlock(source.MedDocV2);
        }
        if (source.IndicatorV3 != null) {
            this.IndicatorV3 = new IndicatorV3(source.IndicatorV3);
        }
        if (source.Covid != null) {
            this.Covid = new CovidItemsInfo(source.Covid);
        }
        if (source.Maternity != null) {
            this.Maternity = new Maternity(source.Maternity);
        }
        if (source.Eye != null) {
            this.Eye = new EyeItemsInfo(source.Eye);
        }
        if (source.BirthCert != null) {
            this.BirthCert = new BirthCert(source.BirthCert);
        }
        if (source.Timeline != null) {
            this.Timeline = new TimelineInformation(source.Timeline);
        }
        if (source.EndoscopyV2 != null) {
            this.EndoscopyV2 = new Check(source.EndoscopyV2);
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
        this.setParamSimple(map, prefix + "ReportTypeDesc", this.ReportTypeDesc);
        this.setParamObj(map, prefix + "PathologyV2.", this.PathologyV2);
        this.setParamObj(map, prefix + "C14.", this.C14);
        this.setParamObj(map, prefix + "Exame.", this.Exame);
        this.setParamObj(map, prefix + "MedDocV2.", this.MedDocV2);
        this.setParamObj(map, prefix + "IndicatorV3.", this.IndicatorV3);
        this.setParamObj(map, prefix + "Covid.", this.Covid);
        this.setParamObj(map, prefix + "Maternity.", this.Maternity);
        this.setParamObj(map, prefix + "Eye.", this.Eye);
        this.setParamObj(map, prefix + "BirthCert.", this.BirthCert);
        this.setParamObj(map, prefix + "Timeline.", this.Timeline);
        this.setParamObj(map, prefix + "EndoscopyV2.", this.EndoscopyV2);

    }
}

