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

public class BasicInfo extends AbstractModel{

    /**
    * 医院名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HospitalName")
    @Expose
    private String HospitalName;

    /**
    * 科室名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DepartmentName")
    @Expose
    private String DepartmentName;

    /**
    * 报告名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReportName")
    @Expose
    private String ReportName;

    /**
    * 报告时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReportTime")
    @Expose
    private String ReportTime;

    /**
    * 门诊号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OutpatientNum")
    @Expose
    private String OutpatientNum;

    /**
    * 住院号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InHospitalNum")
    @Expose
    private String InHospitalNum;

    /**
    * 检查号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InspectionNum")
    @Expose
    private String InspectionNum;

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
    * 病理号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PathologyNum")
    @Expose
    private String PathologyNum;

    /**
    * 床位号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BedNum")
    @Expose
    private String BedNum;

    /**
    * 入院时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InHospitalTime")
    @Expose
    private String InHospitalTime;

    /**
    * 出院时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OutHospitalTime")
    @Expose
    private String OutHospitalTime;

    /**
    * 住院治疗时长
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CureDuration")
    @Expose
    private String CureDuration;

    /**
    * 住院次数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HospitalizationTimes")
    @Expose
    private String HospitalizationTimes;

    /**
    * 送检检查时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InspectionTime")
    @Expose
    private String InspectionTime;

    /**
     * Get 医院名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HospitalName 医院名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHospitalName() {
        return this.HospitalName;
    }

    /**
     * Set 医院名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param HospitalName 医院名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHospitalName(String HospitalName) {
        this.HospitalName = HospitalName;
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
     * Get 检查号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InspectionNum 检查号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInspectionNum() {
        return this.InspectionNum;
    }

    /**
     * Set 检查号
注意：此字段可能返回 null，表示取不到有效值。
     * @param InspectionNum 检查号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInspectionNum(String InspectionNum) {
        this.InspectionNum = InspectionNum;
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
     * Get 床位号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BedNum 床位号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBedNum() {
        return this.BedNum;
    }

    /**
     * Set 床位号
注意：此字段可能返回 null，表示取不到有效值。
     * @param BedNum 床位号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBedNum(String BedNum) {
        this.BedNum = BedNum;
    }

    /**
     * Get 入院时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InHospitalTime 入院时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInHospitalTime() {
        return this.InHospitalTime;
    }

    /**
     * Set 入院时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param InHospitalTime 入院时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInHospitalTime(String InHospitalTime) {
        this.InHospitalTime = InHospitalTime;
    }

    /**
     * Get 出院时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OutHospitalTime 出院时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOutHospitalTime() {
        return this.OutHospitalTime;
    }

    /**
     * Set 出院时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param OutHospitalTime 出院时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOutHospitalTime(String OutHospitalTime) {
        this.OutHospitalTime = OutHospitalTime;
    }

    /**
     * Get 住院治疗时长
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CureDuration 住院治疗时长
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCureDuration() {
        return this.CureDuration;
    }

    /**
     * Set 住院治疗时长
注意：此字段可能返回 null，表示取不到有效值。
     * @param CureDuration 住院治疗时长
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCureDuration(String CureDuration) {
        this.CureDuration = CureDuration;
    }

    /**
     * Get 住院次数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HospitalizationTimes 住院次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHospitalizationTimes() {
        return this.HospitalizationTimes;
    }

    /**
     * Set 住院次数
注意：此字段可能返回 null，表示取不到有效值。
     * @param HospitalizationTimes 住院次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHospitalizationTimes(String HospitalizationTimes) {
        this.HospitalizationTimes = HospitalizationTimes;
    }

    /**
     * Get 送检检查时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InspectionTime 送检检查时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInspectionTime() {
        return this.InspectionTime;
    }

    /**
     * Set 送检检查时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param InspectionTime 送检检查时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInspectionTime(String InspectionTime) {
        this.InspectionTime = InspectionTime;
    }

    public BasicInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BasicInfo(BasicInfo source) {
        if (source.HospitalName != null) {
            this.HospitalName = new String(source.HospitalName);
        }
        if (source.DepartmentName != null) {
            this.DepartmentName = new String(source.DepartmentName);
        }
        if (source.ReportName != null) {
            this.ReportName = new String(source.ReportName);
        }
        if (source.ReportTime != null) {
            this.ReportTime = new String(source.ReportTime);
        }
        if (source.OutpatientNum != null) {
            this.OutpatientNum = new String(source.OutpatientNum);
        }
        if (source.InHospitalNum != null) {
            this.InHospitalNum = new String(source.InHospitalNum);
        }
        if (source.InspectionNum != null) {
            this.InspectionNum = new String(source.InspectionNum);
        }
        if (source.ImageNum != null) {
            this.ImageNum = new String(source.ImageNum);
        }
        if (source.RadiationNum != null) {
            this.RadiationNum = new String(source.RadiationNum);
        }
        if (source.PathologyNum != null) {
            this.PathologyNum = new String(source.PathologyNum);
        }
        if (source.BedNum != null) {
            this.BedNum = new String(source.BedNum);
        }
        if (source.InHospitalTime != null) {
            this.InHospitalTime = new String(source.InHospitalTime);
        }
        if (source.OutHospitalTime != null) {
            this.OutHospitalTime = new String(source.OutHospitalTime);
        }
        if (source.CureDuration != null) {
            this.CureDuration = new String(source.CureDuration);
        }
        if (source.HospitalizationTimes != null) {
            this.HospitalizationTimes = new String(source.HospitalizationTimes);
        }
        if (source.InspectionTime != null) {
            this.InspectionTime = new String(source.InspectionTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HospitalName", this.HospitalName);
        this.setParamSimple(map, prefix + "DepartmentName", this.DepartmentName);
        this.setParamSimple(map, prefix + "ReportName", this.ReportName);
        this.setParamSimple(map, prefix + "ReportTime", this.ReportTime);
        this.setParamSimple(map, prefix + "OutpatientNum", this.OutpatientNum);
        this.setParamSimple(map, prefix + "InHospitalNum", this.InHospitalNum);
        this.setParamSimple(map, prefix + "InspectionNum", this.InspectionNum);
        this.setParamSimple(map, prefix + "ImageNum", this.ImageNum);
        this.setParamSimple(map, prefix + "RadiationNum", this.RadiationNum);
        this.setParamSimple(map, prefix + "PathologyNum", this.PathologyNum);
        this.setParamSimple(map, prefix + "BedNum", this.BedNum);
        this.setParamSimple(map, prefix + "InHospitalTime", this.InHospitalTime);
        this.setParamSimple(map, prefix + "OutHospitalTime", this.OutHospitalTime);
        this.setParamSimple(map, prefix + "CureDuration", this.CureDuration);
        this.setParamSimple(map, prefix + "HospitalizationTimes", this.HospitalizationTimes);
        this.setParamSimple(map, prefix + "InspectionTime", this.InspectionTime);

    }
}

