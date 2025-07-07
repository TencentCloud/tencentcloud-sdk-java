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

public class Block extends AbstractModel {

    /**
    * 诊断信息
    */
    @SerializedName("Check")
    @Expose
    private Check [] Check;

    /**
    * 病理报告
    */
    @SerializedName("Pathology")
    @Expose
    private PathologyReport [] Pathology;

    /**
    * 医学资料
    */
    @SerializedName("MedDoc")
    @Expose
    private MedDoc [] MedDoc;

    /**
    * 诊断证明
    */
    @SerializedName("DiagCert")
    @Expose
    private DiagCert [] DiagCert;

    /**
    * 病案首页
    */
    @SerializedName("FirstPage")
    @Expose
    private FirstPage [] FirstPage;

    /**
    * 检验报告
    */
    @SerializedName("Indicator")
    @Expose
    private Indicator [] Indicator;

    /**
    * 门诊病历信息
    */
    @SerializedName("MedicalRecordInfo")
    @Expose
    private MedicalRecordInfo [] MedicalRecordInfo;

    /**
    * 出入院信息
    */
    @SerializedName("Hospitalization")
    @Expose
    private Hospitalization [] Hospitalization;

    /**
    * 手术记录
    */
    @SerializedName("Surgery")
    @Expose
    private Surgery [] Surgery;

    /**
    * 处方单
    */
    @SerializedName("Prescription")
    @Expose
    private Prescription [] Prescription;

    /**
    * 免疫接种证明
    */
    @SerializedName("VaccineCertificate")
    @Expose
    private VaccineCertificate [] VaccineCertificate;

    /**
    * 心电图
    */
    @SerializedName("Electrocardiogram")
    @Expose
    private Electrocardiogram [] Electrocardiogram;

    /**
    * 病理报告v2
    */
    @SerializedName("PathologyV2")
    @Expose
    private PathologyV2 [] PathologyV2;

    /**
    * 内窥镜报告
    */
    @SerializedName("Endoscopy")
    @Expose
    private Endoscopy [] Endoscopy;

    /**
    * C14检验报告
    */
    @SerializedName("C14")
    @Expose
    private Indicator [] C14;

    /**
    * 体检结论
    */
    @SerializedName("Exame")
    @Expose
    private Exame [] Exame;

    /**
    * 出入院结构体
    */
    @SerializedName("MedDocV2")
    @Expose
    private DischargeInfoBlock [] MedDocV2;

    /**
    * 检验报告v3
    */
    @SerializedName("IndicatorV3")
    @Expose
    private IndicatorV3 [] IndicatorV3;

    /**
    * 孕产报告
    */
    @SerializedName("Maternity")
    @Expose
    private Maternity [] Maternity;

    /**
    * 时间轴
    */
    @SerializedName("Timeline")
    @Expose
    private TimelineInformation [] Timeline;

    /**
    * 核酸报告结论
    */
    @SerializedName("Covid")
    @Expose
    private CovidItemsInfo [] Covid;

    /**
    * 眼科报告结构体
    */
    @SerializedName("Eye")
    @Expose
    private EyeItemsInfo [] Eye;

    /**
    * 出生证明结构化信息
    */
    @SerializedName("BirthCert")
    @Expose
    private BirthCert [] BirthCert;

    /**
    * 文本类型列表
    */
    @SerializedName("TextTypeListBlocks")
    @Expose
    private TextTypeListBlock [] TextTypeListBlocks;

    /**
    * 体检报告信息
    */
    @SerializedName("PhysicalExamination")
    @Expose
    private PhysicalExaminationV1 PhysicalExamination;

    /**
    * 内窥镜报告V2
    */
    @SerializedName("EndoscopyV2")
    @Expose
    private Check [] EndoscopyV2;

    /**
     * Get 诊断信息 
     * @return Check 诊断信息
     */
    public Check [] getCheck() {
        return this.Check;
    }

    /**
     * Set 诊断信息
     * @param Check 诊断信息
     */
    public void setCheck(Check [] Check) {
        this.Check = Check;
    }

    /**
     * Get 病理报告 
     * @return Pathology 病理报告
     */
    public PathologyReport [] getPathology() {
        return this.Pathology;
    }

    /**
     * Set 病理报告
     * @param Pathology 病理报告
     */
    public void setPathology(PathologyReport [] Pathology) {
        this.Pathology = Pathology;
    }

    /**
     * Get 医学资料 
     * @return MedDoc 医学资料
     */
    public MedDoc [] getMedDoc() {
        return this.MedDoc;
    }

    /**
     * Set 医学资料
     * @param MedDoc 医学资料
     */
    public void setMedDoc(MedDoc [] MedDoc) {
        this.MedDoc = MedDoc;
    }

    /**
     * Get 诊断证明 
     * @return DiagCert 诊断证明
     */
    public DiagCert [] getDiagCert() {
        return this.DiagCert;
    }

    /**
     * Set 诊断证明
     * @param DiagCert 诊断证明
     */
    public void setDiagCert(DiagCert [] DiagCert) {
        this.DiagCert = DiagCert;
    }

    /**
     * Get 病案首页 
     * @return FirstPage 病案首页
     */
    public FirstPage [] getFirstPage() {
        return this.FirstPage;
    }

    /**
     * Set 病案首页
     * @param FirstPage 病案首页
     */
    public void setFirstPage(FirstPage [] FirstPage) {
        this.FirstPage = FirstPage;
    }

    /**
     * Get 检验报告 
     * @return Indicator 检验报告
     */
    public Indicator [] getIndicator() {
        return this.Indicator;
    }

    /**
     * Set 检验报告
     * @param Indicator 检验报告
     */
    public void setIndicator(Indicator [] Indicator) {
        this.Indicator = Indicator;
    }

    /**
     * Get 门诊病历信息 
     * @return MedicalRecordInfo 门诊病历信息
     */
    public MedicalRecordInfo [] getMedicalRecordInfo() {
        return this.MedicalRecordInfo;
    }

    /**
     * Set 门诊病历信息
     * @param MedicalRecordInfo 门诊病历信息
     */
    public void setMedicalRecordInfo(MedicalRecordInfo [] MedicalRecordInfo) {
        this.MedicalRecordInfo = MedicalRecordInfo;
    }

    /**
     * Get 出入院信息 
     * @return Hospitalization 出入院信息
     */
    public Hospitalization [] getHospitalization() {
        return this.Hospitalization;
    }

    /**
     * Set 出入院信息
     * @param Hospitalization 出入院信息
     */
    public void setHospitalization(Hospitalization [] Hospitalization) {
        this.Hospitalization = Hospitalization;
    }

    /**
     * Get 手术记录 
     * @return Surgery 手术记录
     */
    public Surgery [] getSurgery() {
        return this.Surgery;
    }

    /**
     * Set 手术记录
     * @param Surgery 手术记录
     */
    public void setSurgery(Surgery [] Surgery) {
        this.Surgery = Surgery;
    }

    /**
     * Get 处方单 
     * @return Prescription 处方单
     */
    public Prescription [] getPrescription() {
        return this.Prescription;
    }

    /**
     * Set 处方单
     * @param Prescription 处方单
     */
    public void setPrescription(Prescription [] Prescription) {
        this.Prescription = Prescription;
    }

    /**
     * Get 免疫接种证明 
     * @return VaccineCertificate 免疫接种证明
     */
    public VaccineCertificate [] getVaccineCertificate() {
        return this.VaccineCertificate;
    }

    /**
     * Set 免疫接种证明
     * @param VaccineCertificate 免疫接种证明
     */
    public void setVaccineCertificate(VaccineCertificate [] VaccineCertificate) {
        this.VaccineCertificate = VaccineCertificate;
    }

    /**
     * Get 心电图 
     * @return Electrocardiogram 心电图
     */
    public Electrocardiogram [] getElectrocardiogram() {
        return this.Electrocardiogram;
    }

    /**
     * Set 心电图
     * @param Electrocardiogram 心电图
     */
    public void setElectrocardiogram(Electrocardiogram [] Electrocardiogram) {
        this.Electrocardiogram = Electrocardiogram;
    }

    /**
     * Get 病理报告v2 
     * @return PathologyV2 病理报告v2
     */
    public PathologyV2 [] getPathologyV2() {
        return this.PathologyV2;
    }

    /**
     * Set 病理报告v2
     * @param PathologyV2 病理报告v2
     */
    public void setPathologyV2(PathologyV2 [] PathologyV2) {
        this.PathologyV2 = PathologyV2;
    }

    /**
     * Get 内窥镜报告 
     * @return Endoscopy 内窥镜报告
     */
    public Endoscopy [] getEndoscopy() {
        return this.Endoscopy;
    }

    /**
     * Set 内窥镜报告
     * @param Endoscopy 内窥镜报告
     */
    public void setEndoscopy(Endoscopy [] Endoscopy) {
        this.Endoscopy = Endoscopy;
    }

    /**
     * Get C14检验报告 
     * @return C14 C14检验报告
     */
    public Indicator [] getC14() {
        return this.C14;
    }

    /**
     * Set C14检验报告
     * @param C14 C14检验报告
     */
    public void setC14(Indicator [] C14) {
        this.C14 = C14;
    }

    /**
     * Get 体检结论 
     * @return Exame 体检结论
     */
    public Exame [] getExame() {
        return this.Exame;
    }

    /**
     * Set 体检结论
     * @param Exame 体检结论
     */
    public void setExame(Exame [] Exame) {
        this.Exame = Exame;
    }

    /**
     * Get 出入院结构体 
     * @return MedDocV2 出入院结构体
     */
    public DischargeInfoBlock [] getMedDocV2() {
        return this.MedDocV2;
    }

    /**
     * Set 出入院结构体
     * @param MedDocV2 出入院结构体
     */
    public void setMedDocV2(DischargeInfoBlock [] MedDocV2) {
        this.MedDocV2 = MedDocV2;
    }

    /**
     * Get 检验报告v3 
     * @return IndicatorV3 检验报告v3
     */
    public IndicatorV3 [] getIndicatorV3() {
        return this.IndicatorV3;
    }

    /**
     * Set 检验报告v3
     * @param IndicatorV3 检验报告v3
     */
    public void setIndicatorV3(IndicatorV3 [] IndicatorV3) {
        this.IndicatorV3 = IndicatorV3;
    }

    /**
     * Get 孕产报告 
     * @return Maternity 孕产报告
     */
    public Maternity [] getMaternity() {
        return this.Maternity;
    }

    /**
     * Set 孕产报告
     * @param Maternity 孕产报告
     */
    public void setMaternity(Maternity [] Maternity) {
        this.Maternity = Maternity;
    }

    /**
     * Get 时间轴 
     * @return Timeline 时间轴
     */
    public TimelineInformation [] getTimeline() {
        return this.Timeline;
    }

    /**
     * Set 时间轴
     * @param Timeline 时间轴
     */
    public void setTimeline(TimelineInformation [] Timeline) {
        this.Timeline = Timeline;
    }

    /**
     * Get 核酸报告结论 
     * @return Covid 核酸报告结论
     */
    public CovidItemsInfo [] getCovid() {
        return this.Covid;
    }

    /**
     * Set 核酸报告结论
     * @param Covid 核酸报告结论
     */
    public void setCovid(CovidItemsInfo [] Covid) {
        this.Covid = Covid;
    }

    /**
     * Get 眼科报告结构体 
     * @return Eye 眼科报告结构体
     */
    public EyeItemsInfo [] getEye() {
        return this.Eye;
    }

    /**
     * Set 眼科报告结构体
     * @param Eye 眼科报告结构体
     */
    public void setEye(EyeItemsInfo [] Eye) {
        this.Eye = Eye;
    }

    /**
     * Get 出生证明结构化信息 
     * @return BirthCert 出生证明结构化信息
     */
    public BirthCert [] getBirthCert() {
        return this.BirthCert;
    }

    /**
     * Set 出生证明结构化信息
     * @param BirthCert 出生证明结构化信息
     */
    public void setBirthCert(BirthCert [] BirthCert) {
        this.BirthCert = BirthCert;
    }

    /**
     * Get 文本类型列表 
     * @return TextTypeListBlocks 文本类型列表
     */
    public TextTypeListBlock [] getTextTypeListBlocks() {
        return this.TextTypeListBlocks;
    }

    /**
     * Set 文本类型列表
     * @param TextTypeListBlocks 文本类型列表
     */
    public void setTextTypeListBlocks(TextTypeListBlock [] TextTypeListBlocks) {
        this.TextTypeListBlocks = TextTypeListBlocks;
    }

    /**
     * Get 体检报告信息 
     * @return PhysicalExamination 体检报告信息
     */
    public PhysicalExaminationV1 getPhysicalExamination() {
        return this.PhysicalExamination;
    }

    /**
     * Set 体检报告信息
     * @param PhysicalExamination 体检报告信息
     */
    public void setPhysicalExamination(PhysicalExaminationV1 PhysicalExamination) {
        this.PhysicalExamination = PhysicalExamination;
    }

    /**
     * Get 内窥镜报告V2 
     * @return EndoscopyV2 内窥镜报告V2
     */
    public Check [] getEndoscopyV2() {
        return this.EndoscopyV2;
    }

    /**
     * Set 内窥镜报告V2
     * @param EndoscopyV2 内窥镜报告V2
     */
    public void setEndoscopyV2(Check [] EndoscopyV2) {
        this.EndoscopyV2 = EndoscopyV2;
    }

    public Block() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Block(Block source) {
        if (source.Check != null) {
            this.Check = new Check[source.Check.length];
            for (int i = 0; i < source.Check.length; i++) {
                this.Check[i] = new Check(source.Check[i]);
            }
        }
        if (source.Pathology != null) {
            this.Pathology = new PathologyReport[source.Pathology.length];
            for (int i = 0; i < source.Pathology.length; i++) {
                this.Pathology[i] = new PathologyReport(source.Pathology[i]);
            }
        }
        if (source.MedDoc != null) {
            this.MedDoc = new MedDoc[source.MedDoc.length];
            for (int i = 0; i < source.MedDoc.length; i++) {
                this.MedDoc[i] = new MedDoc(source.MedDoc[i]);
            }
        }
        if (source.DiagCert != null) {
            this.DiagCert = new DiagCert[source.DiagCert.length];
            for (int i = 0; i < source.DiagCert.length; i++) {
                this.DiagCert[i] = new DiagCert(source.DiagCert[i]);
            }
        }
        if (source.FirstPage != null) {
            this.FirstPage = new FirstPage[source.FirstPage.length];
            for (int i = 0; i < source.FirstPage.length; i++) {
                this.FirstPage[i] = new FirstPage(source.FirstPage[i]);
            }
        }
        if (source.Indicator != null) {
            this.Indicator = new Indicator[source.Indicator.length];
            for (int i = 0; i < source.Indicator.length; i++) {
                this.Indicator[i] = new Indicator(source.Indicator[i]);
            }
        }
        if (source.MedicalRecordInfo != null) {
            this.MedicalRecordInfo = new MedicalRecordInfo[source.MedicalRecordInfo.length];
            for (int i = 0; i < source.MedicalRecordInfo.length; i++) {
                this.MedicalRecordInfo[i] = new MedicalRecordInfo(source.MedicalRecordInfo[i]);
            }
        }
        if (source.Hospitalization != null) {
            this.Hospitalization = new Hospitalization[source.Hospitalization.length];
            for (int i = 0; i < source.Hospitalization.length; i++) {
                this.Hospitalization[i] = new Hospitalization(source.Hospitalization[i]);
            }
        }
        if (source.Surgery != null) {
            this.Surgery = new Surgery[source.Surgery.length];
            for (int i = 0; i < source.Surgery.length; i++) {
                this.Surgery[i] = new Surgery(source.Surgery[i]);
            }
        }
        if (source.Prescription != null) {
            this.Prescription = new Prescription[source.Prescription.length];
            for (int i = 0; i < source.Prescription.length; i++) {
                this.Prescription[i] = new Prescription(source.Prescription[i]);
            }
        }
        if (source.VaccineCertificate != null) {
            this.VaccineCertificate = new VaccineCertificate[source.VaccineCertificate.length];
            for (int i = 0; i < source.VaccineCertificate.length; i++) {
                this.VaccineCertificate[i] = new VaccineCertificate(source.VaccineCertificate[i]);
            }
        }
        if (source.Electrocardiogram != null) {
            this.Electrocardiogram = new Electrocardiogram[source.Electrocardiogram.length];
            for (int i = 0; i < source.Electrocardiogram.length; i++) {
                this.Electrocardiogram[i] = new Electrocardiogram(source.Electrocardiogram[i]);
            }
        }
        if (source.PathologyV2 != null) {
            this.PathologyV2 = new PathologyV2[source.PathologyV2.length];
            for (int i = 0; i < source.PathologyV2.length; i++) {
                this.PathologyV2[i] = new PathologyV2(source.PathologyV2[i]);
            }
        }
        if (source.Endoscopy != null) {
            this.Endoscopy = new Endoscopy[source.Endoscopy.length];
            for (int i = 0; i < source.Endoscopy.length; i++) {
                this.Endoscopy[i] = new Endoscopy(source.Endoscopy[i]);
            }
        }
        if (source.C14 != null) {
            this.C14 = new Indicator[source.C14.length];
            for (int i = 0; i < source.C14.length; i++) {
                this.C14[i] = new Indicator(source.C14[i]);
            }
        }
        if (source.Exame != null) {
            this.Exame = new Exame[source.Exame.length];
            for (int i = 0; i < source.Exame.length; i++) {
                this.Exame[i] = new Exame(source.Exame[i]);
            }
        }
        if (source.MedDocV2 != null) {
            this.MedDocV2 = new DischargeInfoBlock[source.MedDocV2.length];
            for (int i = 0; i < source.MedDocV2.length; i++) {
                this.MedDocV2[i] = new DischargeInfoBlock(source.MedDocV2[i]);
            }
        }
        if (source.IndicatorV3 != null) {
            this.IndicatorV3 = new IndicatorV3[source.IndicatorV3.length];
            for (int i = 0; i < source.IndicatorV3.length; i++) {
                this.IndicatorV3[i] = new IndicatorV3(source.IndicatorV3[i]);
            }
        }
        if (source.Maternity != null) {
            this.Maternity = new Maternity[source.Maternity.length];
            for (int i = 0; i < source.Maternity.length; i++) {
                this.Maternity[i] = new Maternity(source.Maternity[i]);
            }
        }
        if (source.Timeline != null) {
            this.Timeline = new TimelineInformation[source.Timeline.length];
            for (int i = 0; i < source.Timeline.length; i++) {
                this.Timeline[i] = new TimelineInformation(source.Timeline[i]);
            }
        }
        if (source.Covid != null) {
            this.Covid = new CovidItemsInfo[source.Covid.length];
            for (int i = 0; i < source.Covid.length; i++) {
                this.Covid[i] = new CovidItemsInfo(source.Covid[i]);
            }
        }
        if (source.Eye != null) {
            this.Eye = new EyeItemsInfo[source.Eye.length];
            for (int i = 0; i < source.Eye.length; i++) {
                this.Eye[i] = new EyeItemsInfo(source.Eye[i]);
            }
        }
        if (source.BirthCert != null) {
            this.BirthCert = new BirthCert[source.BirthCert.length];
            for (int i = 0; i < source.BirthCert.length; i++) {
                this.BirthCert[i] = new BirthCert(source.BirthCert[i]);
            }
        }
        if (source.TextTypeListBlocks != null) {
            this.TextTypeListBlocks = new TextTypeListBlock[source.TextTypeListBlocks.length];
            for (int i = 0; i < source.TextTypeListBlocks.length; i++) {
                this.TextTypeListBlocks[i] = new TextTypeListBlock(source.TextTypeListBlocks[i]);
            }
        }
        if (source.PhysicalExamination != null) {
            this.PhysicalExamination = new PhysicalExaminationV1(source.PhysicalExamination);
        }
        if (source.EndoscopyV2 != null) {
            this.EndoscopyV2 = new Check[source.EndoscopyV2.length];
            for (int i = 0; i < source.EndoscopyV2.length; i++) {
                this.EndoscopyV2[i] = new Check(source.EndoscopyV2[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Check.", this.Check);
        this.setParamArrayObj(map, prefix + "Pathology.", this.Pathology);
        this.setParamArrayObj(map, prefix + "MedDoc.", this.MedDoc);
        this.setParamArrayObj(map, prefix + "DiagCert.", this.DiagCert);
        this.setParamArrayObj(map, prefix + "FirstPage.", this.FirstPage);
        this.setParamArrayObj(map, prefix + "Indicator.", this.Indicator);
        this.setParamArrayObj(map, prefix + "MedicalRecordInfo.", this.MedicalRecordInfo);
        this.setParamArrayObj(map, prefix + "Hospitalization.", this.Hospitalization);
        this.setParamArrayObj(map, prefix + "Surgery.", this.Surgery);
        this.setParamArrayObj(map, prefix + "Prescription.", this.Prescription);
        this.setParamArrayObj(map, prefix + "VaccineCertificate.", this.VaccineCertificate);
        this.setParamArrayObj(map, prefix + "Electrocardiogram.", this.Electrocardiogram);
        this.setParamArrayObj(map, prefix + "PathologyV2.", this.PathologyV2);
        this.setParamArrayObj(map, prefix + "Endoscopy.", this.Endoscopy);
        this.setParamArrayObj(map, prefix + "C14.", this.C14);
        this.setParamArrayObj(map, prefix + "Exame.", this.Exame);
        this.setParamArrayObj(map, prefix + "MedDocV2.", this.MedDocV2);
        this.setParamArrayObj(map, prefix + "IndicatorV3.", this.IndicatorV3);
        this.setParamArrayObj(map, prefix + "Maternity.", this.Maternity);
        this.setParamArrayObj(map, prefix + "Timeline.", this.Timeline);
        this.setParamArrayObj(map, prefix + "Covid.", this.Covid);
        this.setParamArrayObj(map, prefix + "Eye.", this.Eye);
        this.setParamArrayObj(map, prefix + "BirthCert.", this.BirthCert);
        this.setParamArrayObj(map, prefix + "TextTypeListBlocks.", this.TextTypeListBlocks);
        this.setParamObj(map, prefix + "PhysicalExamination.", this.PhysicalExamination);
        this.setParamArrayObj(map, prefix + "EndoscopyV2.", this.EndoscopyV2);

    }
}

