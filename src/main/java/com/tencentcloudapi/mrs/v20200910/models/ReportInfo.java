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

public class ReportInfo extends AbstractModel{

    /**
    * 医院名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Hospital")
    @Expose
    private String Hospital;

    /**
    * 科室名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DepartmentName")
    @Expose
    private String DepartmentName;

    /**
    * 申请时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BillingTime")
    @Expose
    private String BillingTime;

    /**
    * 报告时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReportTime")
    @Expose
    private String ReportTime;

    /**
    * 检查时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InspectTime")
    @Expose
    private String InspectTime;

    /**
    * 检查号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CheckNum")
    @Expose
    private String CheckNum;

    /**
    * 影像号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImageNum")
    @Expose
    private String ImageNum;

    /**
    * 放射号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RadiationNum")
    @Expose
    private String RadiationNum;

    /**
    * 检验号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TestNum")
    @Expose
    private String TestNum;

    /**
    * 门诊号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OutpatientNum")
    @Expose
    private String OutpatientNum;

    /**
    * 病理号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PathologyNum")
    @Expose
    private String PathologyNum;

    /**
    * 住院号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InHospitalNum")
    @Expose
    private String InHospitalNum;

    /**
    * 样本号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SampleNum")
    @Expose
    private String SampleNum;

    /**
    * 标本种类
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SampleType")
    @Expose
    private String SampleType;

    /**
    * 病历号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MedicalRecordNum")
    @Expose
    private String MedicalRecordNum;

    /**
    * 报告名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReportName")
    @Expose
    private String ReportName;

    /**
    * 超声号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UltraNum")
    @Expose
    private String UltraNum;

    /**
    * 临床诊断
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Diagnose")
    @Expose
    private String Diagnose;

    /**
     * Get 医院名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Hospital 医院名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHospital() {
        return this.Hospital;
    }

    /**
     * Set 医院名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Hospital 医院名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHospital(String Hospital) {
        this.Hospital = Hospital;
    }

    /**
     * Get 科室名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DepartmentName 科室名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDepartmentName() {
        return this.DepartmentName;
    }

    /**
     * Set 科室名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param DepartmentName 科室名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDepartmentName(String DepartmentName) {
        this.DepartmentName = DepartmentName;
    }

    /**
     * Get 申请时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BillingTime 申请时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBillingTime() {
        return this.BillingTime;
    }

    /**
     * Set 申请时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param BillingTime 申请时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBillingTime(String BillingTime) {
        this.BillingTime = BillingTime;
    }

    /**
     * Get 报告时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReportTime 报告时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReportTime() {
        return this.ReportTime;
    }

    /**
     * Set 报告时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReportTime 报告时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReportTime(String ReportTime) {
        this.ReportTime = ReportTime;
    }

    /**
     * Get 检查时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InspectTime 检查时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInspectTime() {
        return this.InspectTime;
    }

    /**
     * Set 检查时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param InspectTime 检查时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInspectTime(String InspectTime) {
        this.InspectTime = InspectTime;
    }

    /**
     * Get 检查号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CheckNum 检查号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCheckNum() {
        return this.CheckNum;
    }

    /**
     * Set 检查号
注意：此字段可能返回 null，表示取不到有效值。
     * @param CheckNum 检查号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCheckNum(String CheckNum) {
        this.CheckNum = CheckNum;
    }

    /**
     * Get 影像号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImageNum 影像号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getImageNum() {
        return this.ImageNum;
    }

    /**
     * Set 影像号
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImageNum 影像号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImageNum(String ImageNum) {
        this.ImageNum = ImageNum;
    }

    /**
     * Get 放射号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RadiationNum 放射号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRadiationNum() {
        return this.RadiationNum;
    }

    /**
     * Set 放射号
注意：此字段可能返回 null，表示取不到有效值。
     * @param RadiationNum 放射号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRadiationNum(String RadiationNum) {
        this.RadiationNum = RadiationNum;
    }

    /**
     * Get 检验号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TestNum 检验号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTestNum() {
        return this.TestNum;
    }

    /**
     * Set 检验号
注意：此字段可能返回 null，表示取不到有效值。
     * @param TestNum 检验号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTestNum(String TestNum) {
        this.TestNum = TestNum;
    }

    /**
     * Get 门诊号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OutpatientNum 门诊号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOutpatientNum() {
        return this.OutpatientNum;
    }

    /**
     * Set 门诊号
注意：此字段可能返回 null，表示取不到有效值。
     * @param OutpatientNum 门诊号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOutpatientNum(String OutpatientNum) {
        this.OutpatientNum = OutpatientNum;
    }

    /**
     * Get 病理号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PathologyNum 病理号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPathologyNum() {
        return this.PathologyNum;
    }

    /**
     * Set 病理号
注意：此字段可能返回 null，表示取不到有效值。
     * @param PathologyNum 病理号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPathologyNum(String PathologyNum) {
        this.PathologyNum = PathologyNum;
    }

    /**
     * Get 住院号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InHospitalNum 住院号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInHospitalNum() {
        return this.InHospitalNum;
    }

    /**
     * Set 住院号
注意：此字段可能返回 null，表示取不到有效值。
     * @param InHospitalNum 住院号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInHospitalNum(String InHospitalNum) {
        this.InHospitalNum = InHospitalNum;
    }

    /**
     * Get 样本号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SampleNum 样本号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSampleNum() {
        return this.SampleNum;
    }

    /**
     * Set 样本号
注意：此字段可能返回 null，表示取不到有效值。
     * @param SampleNum 样本号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSampleNum(String SampleNum) {
        this.SampleNum = SampleNum;
    }

    /**
     * Get 标本种类
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SampleType 标本种类
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSampleType() {
        return this.SampleType;
    }

    /**
     * Set 标本种类
注意：此字段可能返回 null，表示取不到有效值。
     * @param SampleType 标本种类
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSampleType(String SampleType) {
        this.SampleType = SampleType;
    }

    /**
     * Get 病历号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MedicalRecordNum 病历号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMedicalRecordNum() {
        return this.MedicalRecordNum;
    }

    /**
     * Set 病历号
注意：此字段可能返回 null，表示取不到有效值。
     * @param MedicalRecordNum 病历号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMedicalRecordNum(String MedicalRecordNum) {
        this.MedicalRecordNum = MedicalRecordNum;
    }

    /**
     * Get 报告名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReportName 报告名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReportName() {
        return this.ReportName;
    }

    /**
     * Set 报告名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReportName 报告名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReportName(String ReportName) {
        this.ReportName = ReportName;
    }

    /**
     * Get 超声号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UltraNum 超声号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUltraNum() {
        return this.UltraNum;
    }

    /**
     * Set 超声号
注意：此字段可能返回 null，表示取不到有效值。
     * @param UltraNum 超声号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUltraNum(String UltraNum) {
        this.UltraNum = UltraNum;
    }

    /**
     * Get 临床诊断
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Diagnose 临床诊断
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDiagnose() {
        return this.Diagnose;
    }

    /**
     * Set 临床诊断
注意：此字段可能返回 null，表示取不到有效值。
     * @param Diagnose 临床诊断
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiagnose(String Diagnose) {
        this.Diagnose = Diagnose;
    }

    public ReportInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReportInfo(ReportInfo source) {
        if (source.Hospital != null) {
            this.Hospital = new String(source.Hospital);
        }
        if (source.DepartmentName != null) {
            this.DepartmentName = new String(source.DepartmentName);
        }
        if (source.BillingTime != null) {
            this.BillingTime = new String(source.BillingTime);
        }
        if (source.ReportTime != null) {
            this.ReportTime = new String(source.ReportTime);
        }
        if (source.InspectTime != null) {
            this.InspectTime = new String(source.InspectTime);
        }
        if (source.CheckNum != null) {
            this.CheckNum = new String(source.CheckNum);
        }
        if (source.ImageNum != null) {
            this.ImageNum = new String(source.ImageNum);
        }
        if (source.RadiationNum != null) {
            this.RadiationNum = new String(source.RadiationNum);
        }
        if (source.TestNum != null) {
            this.TestNum = new String(source.TestNum);
        }
        if (source.OutpatientNum != null) {
            this.OutpatientNum = new String(source.OutpatientNum);
        }
        if (source.PathologyNum != null) {
            this.PathologyNum = new String(source.PathologyNum);
        }
        if (source.InHospitalNum != null) {
            this.InHospitalNum = new String(source.InHospitalNum);
        }
        if (source.SampleNum != null) {
            this.SampleNum = new String(source.SampleNum);
        }
        if (source.SampleType != null) {
            this.SampleType = new String(source.SampleType);
        }
        if (source.MedicalRecordNum != null) {
            this.MedicalRecordNum = new String(source.MedicalRecordNum);
        }
        if (source.ReportName != null) {
            this.ReportName = new String(source.ReportName);
        }
        if (source.UltraNum != null) {
            this.UltraNum = new String(source.UltraNum);
        }
        if (source.Diagnose != null) {
            this.Diagnose = new String(source.Diagnose);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Hospital", this.Hospital);
        this.setParamSimple(map, prefix + "DepartmentName", this.DepartmentName);
        this.setParamSimple(map, prefix + "BillingTime", this.BillingTime);
        this.setParamSimple(map, prefix + "ReportTime", this.ReportTime);
        this.setParamSimple(map, prefix + "InspectTime", this.InspectTime);
        this.setParamSimple(map, prefix + "CheckNum", this.CheckNum);
        this.setParamSimple(map, prefix + "ImageNum", this.ImageNum);
        this.setParamSimple(map, prefix + "RadiationNum", this.RadiationNum);
        this.setParamSimple(map, prefix + "TestNum", this.TestNum);
        this.setParamSimple(map, prefix + "OutpatientNum", this.OutpatientNum);
        this.setParamSimple(map, prefix + "PathologyNum", this.PathologyNum);
        this.setParamSimple(map, prefix + "InHospitalNum", this.InHospitalNum);
        this.setParamSimple(map, prefix + "SampleNum", this.SampleNum);
        this.setParamSimple(map, prefix + "SampleType", this.SampleType);
        this.setParamSimple(map, prefix + "MedicalRecordNum", this.MedicalRecordNum);
        this.setParamSimple(map, prefix + "ReportName", this.ReportName);
        this.setParamSimple(map, prefix + "UltraNum", this.UltraNum);
        this.setParamSimple(map, prefix + "Diagnose", this.Diagnose);

    }
}

