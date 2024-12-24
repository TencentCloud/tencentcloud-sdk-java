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
package com.tencentcloudapi.aca.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RequestCase extends AbstractModel {

    /**
    * 处方类型 0:门诊处方；1:住院医嘱；2:急诊处方 
    */
    @SerializedName("CaseType")
    @Expose
    private Long CaseType;

    /**
    * 主诉
    */
    @SerializedName("ChiefComplaint")
    @Expose
    private String ChiefComplaint;

    /**
    * 科室
    */
    @SerializedName("Department")
    @Expose
    private String Department;

    /**
    * 病历文书ID
医生每次书写病历文书的ID，文书内容包含主诉，病史，当前诊断等内容<br />门诊场景：门诊病历文书（带有主诉、病史、诊断及药品的）只有一份，这个编号只有一个。<br/>住院场景：假设住院3天，医生每天都会写一份病历文书（带有主诉、病史、诊断及医嘱药品的文书），那么有对应三个病历文书编号，每次调用预测接口都要传入不同的病历文书编号。注意：如两次调用预测接口，传相同的caseid，则在药师端管理平台的上一次审方记录中的诊断会被本次接口传入的诊断更新。
    */
    @SerializedName("CaseId")
    @Expose
    private String CaseId;

    /**
    * 病历更新时间
    */
    @SerializedName("CaseTime")
    @Expose
    private String CaseTime;

    /**
    * 就诊ID
门诊处方传门诊号，住院医嘱传住院号；备注：门诊场景：用户挂一次号，看一个医生，这时候会有一个代表变成就诊的编号，下一次挂号就诊，这个编号会变。<br/>住院场景：用户本次办理入院，会有一个住院编号，仅代表本次住院，如果下次再住院，这个编号会变。
    */
    @SerializedName("VisitId")
    @Expose
    private String VisitId;

    /**
    * 患者信息
    */
    @SerializedName("PatientBaseinfo")
    @Expose
    private PatientBaseInfo PatientBaseinfo;

    /**
    * 医生信息
    */
    @SerializedName("DoctorInfo")
    @Expose
    private DoctorInfo DoctorInfo;

    /**
    * 现病史
    */
    @SerializedName("PresentIllness")
    @Expose
    private String PresentIllness;

    /**
    * 患者其他信息，包含过敏史等
    */
    @SerializedName("PatientOther")
    @Expose
    private String PatientOther;

    /**
    * 患者过往病史
    */
    @SerializedName("PatientHistory")
    @Expose
    private PatientHistory PatientHistory;

    /**
    * 患者家族病史
    */
    @SerializedName("PatientFamilyHistory")
    @Expose
    private PatientFamilyHistory PatientFamilyHistory;

    /**
    * 体格检查
    */
    @SerializedName("PhysicalExam")
    @Expose
    private PhysicalExam PhysicalExam;

    /**
    * 诊断列表，第一个为首要诊断
    */
    @SerializedName("EmrDiagnosises")
    @Expose
    private EmrDiagnosises [] EmrDiagnosises;

    /**
    * 处方列表
    */
    @SerializedName("Prescriptions")
    @Expose
    private DrugUsage [] Prescriptions;

    /**
     * Get 处方类型 0:门诊处方；1:住院医嘱；2:急诊处方  
     * @return CaseType 处方类型 0:门诊处方；1:住院医嘱；2:急诊处方 
     */
    public Long getCaseType() {
        return this.CaseType;
    }

    /**
     * Set 处方类型 0:门诊处方；1:住院医嘱；2:急诊处方 
     * @param CaseType 处方类型 0:门诊处方；1:住院医嘱；2:急诊处方 
     */
    public void setCaseType(Long CaseType) {
        this.CaseType = CaseType;
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
     * Get 科室 
     * @return Department 科室
     */
    public String getDepartment() {
        return this.Department;
    }

    /**
     * Set 科室
     * @param Department 科室
     */
    public void setDepartment(String Department) {
        this.Department = Department;
    }

    /**
     * Get 病历文书ID
医生每次书写病历文书的ID，文书内容包含主诉，病史，当前诊断等内容<br />门诊场景：门诊病历文书（带有主诉、病史、诊断及药品的）只有一份，这个编号只有一个。<br/>住院场景：假设住院3天，医生每天都会写一份病历文书（带有主诉、病史、诊断及医嘱药品的文书），那么有对应三个病历文书编号，每次调用预测接口都要传入不同的病历文书编号。注意：如两次调用预测接口，传相同的caseid，则在药师端管理平台的上一次审方记录中的诊断会被本次接口传入的诊断更新。 
     * @return CaseId 病历文书ID
医生每次书写病历文书的ID，文书内容包含主诉，病史，当前诊断等内容<br />门诊场景：门诊病历文书（带有主诉、病史、诊断及药品的）只有一份，这个编号只有一个。<br/>住院场景：假设住院3天，医生每天都会写一份病历文书（带有主诉、病史、诊断及医嘱药品的文书），那么有对应三个病历文书编号，每次调用预测接口都要传入不同的病历文书编号。注意：如两次调用预测接口，传相同的caseid，则在药师端管理平台的上一次审方记录中的诊断会被本次接口传入的诊断更新。
     */
    public String getCaseId() {
        return this.CaseId;
    }

    /**
     * Set 病历文书ID
医生每次书写病历文书的ID，文书内容包含主诉，病史，当前诊断等内容<br />门诊场景：门诊病历文书（带有主诉、病史、诊断及药品的）只有一份，这个编号只有一个。<br/>住院场景：假设住院3天，医生每天都会写一份病历文书（带有主诉、病史、诊断及医嘱药品的文书），那么有对应三个病历文书编号，每次调用预测接口都要传入不同的病历文书编号。注意：如两次调用预测接口，传相同的caseid，则在药师端管理平台的上一次审方记录中的诊断会被本次接口传入的诊断更新。
     * @param CaseId 病历文书ID
医生每次书写病历文书的ID，文书内容包含主诉，病史，当前诊断等内容<br />门诊场景：门诊病历文书（带有主诉、病史、诊断及药品的）只有一份，这个编号只有一个。<br/>住院场景：假设住院3天，医生每天都会写一份病历文书（带有主诉、病史、诊断及医嘱药品的文书），那么有对应三个病历文书编号，每次调用预测接口都要传入不同的病历文书编号。注意：如两次调用预测接口，传相同的caseid，则在药师端管理平台的上一次审方记录中的诊断会被本次接口传入的诊断更新。
     */
    public void setCaseId(String CaseId) {
        this.CaseId = CaseId;
    }

    /**
     * Get 病历更新时间 
     * @return CaseTime 病历更新时间
     */
    public String getCaseTime() {
        return this.CaseTime;
    }

    /**
     * Set 病历更新时间
     * @param CaseTime 病历更新时间
     */
    public void setCaseTime(String CaseTime) {
        this.CaseTime = CaseTime;
    }

    /**
     * Get 就诊ID
门诊处方传门诊号，住院医嘱传住院号；备注：门诊场景：用户挂一次号，看一个医生，这时候会有一个代表变成就诊的编号，下一次挂号就诊，这个编号会变。<br/>住院场景：用户本次办理入院，会有一个住院编号，仅代表本次住院，如果下次再住院，这个编号会变。 
     * @return VisitId 就诊ID
门诊处方传门诊号，住院医嘱传住院号；备注：门诊场景：用户挂一次号，看一个医生，这时候会有一个代表变成就诊的编号，下一次挂号就诊，这个编号会变。<br/>住院场景：用户本次办理入院，会有一个住院编号，仅代表本次住院，如果下次再住院，这个编号会变。
     */
    public String getVisitId() {
        return this.VisitId;
    }

    /**
     * Set 就诊ID
门诊处方传门诊号，住院医嘱传住院号；备注：门诊场景：用户挂一次号，看一个医生，这时候会有一个代表变成就诊的编号，下一次挂号就诊，这个编号会变。<br/>住院场景：用户本次办理入院，会有一个住院编号，仅代表本次住院，如果下次再住院，这个编号会变。
     * @param VisitId 就诊ID
门诊处方传门诊号，住院医嘱传住院号；备注：门诊场景：用户挂一次号，看一个医生，这时候会有一个代表变成就诊的编号，下一次挂号就诊，这个编号会变。<br/>住院场景：用户本次办理入院，会有一个住院编号，仅代表本次住院，如果下次再住院，这个编号会变。
     */
    public void setVisitId(String VisitId) {
        this.VisitId = VisitId;
    }

    /**
     * Get 患者信息 
     * @return PatientBaseinfo 患者信息
     */
    public PatientBaseInfo getPatientBaseinfo() {
        return this.PatientBaseinfo;
    }

    /**
     * Set 患者信息
     * @param PatientBaseinfo 患者信息
     */
    public void setPatientBaseinfo(PatientBaseInfo PatientBaseinfo) {
        this.PatientBaseinfo = PatientBaseinfo;
    }

    /**
     * Get 医生信息 
     * @return DoctorInfo 医生信息
     */
    public DoctorInfo getDoctorInfo() {
        return this.DoctorInfo;
    }

    /**
     * Set 医生信息
     * @param DoctorInfo 医生信息
     */
    public void setDoctorInfo(DoctorInfo DoctorInfo) {
        this.DoctorInfo = DoctorInfo;
    }

    /**
     * Get 现病史 
     * @return PresentIllness 现病史
     */
    public String getPresentIllness() {
        return this.PresentIllness;
    }

    /**
     * Set 现病史
     * @param PresentIllness 现病史
     */
    public void setPresentIllness(String PresentIllness) {
        this.PresentIllness = PresentIllness;
    }

    /**
     * Get 患者其他信息，包含过敏史等 
     * @return PatientOther 患者其他信息，包含过敏史等
     */
    public String getPatientOther() {
        return this.PatientOther;
    }

    /**
     * Set 患者其他信息，包含过敏史等
     * @param PatientOther 患者其他信息，包含过敏史等
     */
    public void setPatientOther(String PatientOther) {
        this.PatientOther = PatientOther;
    }

    /**
     * Get 患者过往病史 
     * @return PatientHistory 患者过往病史
     */
    public PatientHistory getPatientHistory() {
        return this.PatientHistory;
    }

    /**
     * Set 患者过往病史
     * @param PatientHistory 患者过往病史
     */
    public void setPatientHistory(PatientHistory PatientHistory) {
        this.PatientHistory = PatientHistory;
    }

    /**
     * Get 患者家族病史 
     * @return PatientFamilyHistory 患者家族病史
     */
    public PatientFamilyHistory getPatientFamilyHistory() {
        return this.PatientFamilyHistory;
    }

    /**
     * Set 患者家族病史
     * @param PatientFamilyHistory 患者家族病史
     */
    public void setPatientFamilyHistory(PatientFamilyHistory PatientFamilyHistory) {
        this.PatientFamilyHistory = PatientFamilyHistory;
    }

    /**
     * Get 体格检查 
     * @return PhysicalExam 体格检查
     */
    public PhysicalExam getPhysicalExam() {
        return this.PhysicalExam;
    }

    /**
     * Set 体格检查
     * @param PhysicalExam 体格检查
     */
    public void setPhysicalExam(PhysicalExam PhysicalExam) {
        this.PhysicalExam = PhysicalExam;
    }

    /**
     * Get 诊断列表，第一个为首要诊断 
     * @return EmrDiagnosises 诊断列表，第一个为首要诊断
     */
    public EmrDiagnosises [] getEmrDiagnosises() {
        return this.EmrDiagnosises;
    }

    /**
     * Set 诊断列表，第一个为首要诊断
     * @param EmrDiagnosises 诊断列表，第一个为首要诊断
     */
    public void setEmrDiagnosises(EmrDiagnosises [] EmrDiagnosises) {
        this.EmrDiagnosises = EmrDiagnosises;
    }

    /**
     * Get 处方列表 
     * @return Prescriptions 处方列表
     */
    public DrugUsage [] getPrescriptions() {
        return this.Prescriptions;
    }

    /**
     * Set 处方列表
     * @param Prescriptions 处方列表
     */
    public void setPrescriptions(DrugUsage [] Prescriptions) {
        this.Prescriptions = Prescriptions;
    }

    public RequestCase() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RequestCase(RequestCase source) {
        if (source.CaseType != null) {
            this.CaseType = new Long(source.CaseType);
        }
        if (source.ChiefComplaint != null) {
            this.ChiefComplaint = new String(source.ChiefComplaint);
        }
        if (source.Department != null) {
            this.Department = new String(source.Department);
        }
        if (source.CaseId != null) {
            this.CaseId = new String(source.CaseId);
        }
        if (source.CaseTime != null) {
            this.CaseTime = new String(source.CaseTime);
        }
        if (source.VisitId != null) {
            this.VisitId = new String(source.VisitId);
        }
        if (source.PatientBaseinfo != null) {
            this.PatientBaseinfo = new PatientBaseInfo(source.PatientBaseinfo);
        }
        if (source.DoctorInfo != null) {
            this.DoctorInfo = new DoctorInfo(source.DoctorInfo);
        }
        if (source.PresentIllness != null) {
            this.PresentIllness = new String(source.PresentIllness);
        }
        if (source.PatientOther != null) {
            this.PatientOther = new String(source.PatientOther);
        }
        if (source.PatientHistory != null) {
            this.PatientHistory = new PatientHistory(source.PatientHistory);
        }
        if (source.PatientFamilyHistory != null) {
            this.PatientFamilyHistory = new PatientFamilyHistory(source.PatientFamilyHistory);
        }
        if (source.PhysicalExam != null) {
            this.PhysicalExam = new PhysicalExam(source.PhysicalExam);
        }
        if (source.EmrDiagnosises != null) {
            this.EmrDiagnosises = new EmrDiagnosises[source.EmrDiagnosises.length];
            for (int i = 0; i < source.EmrDiagnosises.length; i++) {
                this.EmrDiagnosises[i] = new EmrDiagnosises(source.EmrDiagnosises[i]);
            }
        }
        if (source.Prescriptions != null) {
            this.Prescriptions = new DrugUsage[source.Prescriptions.length];
            for (int i = 0; i < source.Prescriptions.length; i++) {
                this.Prescriptions[i] = new DrugUsage(source.Prescriptions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CaseType", this.CaseType);
        this.setParamSimple(map, prefix + "ChiefComplaint", this.ChiefComplaint);
        this.setParamSimple(map, prefix + "Department", this.Department);
        this.setParamSimple(map, prefix + "CaseId", this.CaseId);
        this.setParamSimple(map, prefix + "CaseTime", this.CaseTime);
        this.setParamSimple(map, prefix + "VisitId", this.VisitId);
        this.setParamObj(map, prefix + "PatientBaseinfo.", this.PatientBaseinfo);
        this.setParamObj(map, prefix + "DoctorInfo.", this.DoctorInfo);
        this.setParamSimple(map, prefix + "PresentIllness", this.PresentIllness);
        this.setParamSimple(map, prefix + "PatientOther", this.PatientOther);
        this.setParamObj(map, prefix + "PatientHistory.", this.PatientHistory);
        this.setParamObj(map, prefix + "PatientFamilyHistory.", this.PatientFamilyHistory);
        this.setParamObj(map, prefix + "PhysicalExam.", this.PhysicalExam);
        this.setParamArrayObj(map, prefix + "EmrDiagnosises.", this.EmrDiagnosises);
        this.setParamArrayObj(map, prefix + "Prescriptions.", this.Prescriptions);

    }
}

