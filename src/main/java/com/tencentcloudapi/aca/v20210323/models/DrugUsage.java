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
package com.tencentcloudapi.aca.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DrugUsage extends AbstractModel {

    /**
    * 药品ID
    */
    @SerializedName("DrugId")
    @Expose
    private String DrugId;

    /**
    * 药品名称
    */
    @SerializedName("DrugName")
    @Expose
    private String DrugName;

    /**
    * 日服药频次
    */
    @SerializedName("TimePerDay")
    @Expose
    private String TimePerDay;

    /**
    * 给药途径
    */
    @SerializedName("Usage")
    @Expose
    private String Usage;

    /**
    * 处方ID，药品不同分组是传不同的处方ID
    */
    @SerializedName("PrescriptionId")
    @Expose
    private String PrescriptionId;

    /**
    * 每次剂量
    */
    @SerializedName("DosagePerTime")
    @Expose
    private String DosagePerTime;

    /**
    * 每次剂量单位
    */
    @SerializedName("DosagePerTimeUnit")
    @Expose
    private String DosagePerTimeUnit;

    /**
    * 单次服药时间
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * 给药周期
    */
    @SerializedName("Cycle")
    @Expose
    private String Cycle;

    /**
    * 单日剂量
    */
    @SerializedName("DosagePerDay")
    @Expose
    private String DosagePerDay;

    /**
    * 疗程
    */
    @SerializedName("Course")
    @Expose
    private String Course;

    /**
    * 给药速度
    */
    @SerializedName("Speed")
    @Expose
    private String Speed;

    /**
    * 处方生效时间戳，住院医嘱必须传(caseType =1)
    */
    @SerializedName("BeginTime")
    @Expose
    private Long BeginTime;

    /**
    * 处方失效时间戳，住院医嘱必须传(caseType =1)
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 开具数量
    */
    @SerializedName("Package")
    @Expose
    private String Package;

    /**
    * 开具数量单位
    */
    @SerializedName("PackageUnit")
    @Expose
    private String PackageUnit;

    /**
    * 相同标志液体间进行配伍禁忌审核，不同标志间液体不进行配伍禁忌审核
    */
    @SerializedName("GroupInj")
    @Expose
    private String GroupInj;

    /**
    * 处方金额
    */
    @SerializedName("PrescriptionCharge")
    @Expose
    private String PrescriptionCharge;

    /**
    * 用药天数
    */
    @SerializedName("MedicationDays")
    @Expose
    private String MedicationDays;

    /**
     * Get 药品ID 
     * @return DrugId 药品ID
     */
    public String getDrugId() {
        return this.DrugId;
    }

    /**
     * Set 药品ID
     * @param DrugId 药品ID
     */
    public void setDrugId(String DrugId) {
        this.DrugId = DrugId;
    }

    /**
     * Get 药品名称 
     * @return DrugName 药品名称
     */
    public String getDrugName() {
        return this.DrugName;
    }

    /**
     * Set 药品名称
     * @param DrugName 药品名称
     */
    public void setDrugName(String DrugName) {
        this.DrugName = DrugName;
    }

    /**
     * Get 日服药频次 
     * @return TimePerDay 日服药频次
     */
    public String getTimePerDay() {
        return this.TimePerDay;
    }

    /**
     * Set 日服药频次
     * @param TimePerDay 日服药频次
     */
    public void setTimePerDay(String TimePerDay) {
        this.TimePerDay = TimePerDay;
    }

    /**
     * Get 给药途径 
     * @return Usage 给药途径
     */
    public String getUsage() {
        return this.Usage;
    }

    /**
     * Set 给药途径
     * @param Usage 给药途径
     */
    public void setUsage(String Usage) {
        this.Usage = Usage;
    }

    /**
     * Get 处方ID，药品不同分组是传不同的处方ID 
     * @return PrescriptionId 处方ID，药品不同分组是传不同的处方ID
     */
    public String getPrescriptionId() {
        return this.PrescriptionId;
    }

    /**
     * Set 处方ID，药品不同分组是传不同的处方ID
     * @param PrescriptionId 处方ID，药品不同分组是传不同的处方ID
     */
    public void setPrescriptionId(String PrescriptionId) {
        this.PrescriptionId = PrescriptionId;
    }

    /**
     * Get 每次剂量 
     * @return DosagePerTime 每次剂量
     */
    public String getDosagePerTime() {
        return this.DosagePerTime;
    }

    /**
     * Set 每次剂量
     * @param DosagePerTime 每次剂量
     */
    public void setDosagePerTime(String DosagePerTime) {
        this.DosagePerTime = DosagePerTime;
    }

    /**
     * Get 每次剂量单位 
     * @return DosagePerTimeUnit 每次剂量单位
     */
    public String getDosagePerTimeUnit() {
        return this.DosagePerTimeUnit;
    }

    /**
     * Set 每次剂量单位
     * @param DosagePerTimeUnit 每次剂量单位
     */
    public void setDosagePerTimeUnit(String DosagePerTimeUnit) {
        this.DosagePerTimeUnit = DosagePerTimeUnit;
    }

    /**
     * Get 单次服药时间 
     * @return Time 单次服药时间
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set 单次服药时间
     * @param Time 单次服药时间
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Get 给药周期 
     * @return Cycle 给药周期
     */
    public String getCycle() {
        return this.Cycle;
    }

    /**
     * Set 给药周期
     * @param Cycle 给药周期
     */
    public void setCycle(String Cycle) {
        this.Cycle = Cycle;
    }

    /**
     * Get 单日剂量 
     * @return DosagePerDay 单日剂量
     */
    public String getDosagePerDay() {
        return this.DosagePerDay;
    }

    /**
     * Set 单日剂量
     * @param DosagePerDay 单日剂量
     */
    public void setDosagePerDay(String DosagePerDay) {
        this.DosagePerDay = DosagePerDay;
    }

    /**
     * Get 疗程 
     * @return Course 疗程
     */
    public String getCourse() {
        return this.Course;
    }

    /**
     * Set 疗程
     * @param Course 疗程
     */
    public void setCourse(String Course) {
        this.Course = Course;
    }

    /**
     * Get 给药速度 
     * @return Speed 给药速度
     */
    public String getSpeed() {
        return this.Speed;
    }

    /**
     * Set 给药速度
     * @param Speed 给药速度
     */
    public void setSpeed(String Speed) {
        this.Speed = Speed;
    }

    /**
     * Get 处方生效时间戳，住院医嘱必须传(caseType =1) 
     * @return BeginTime 处方生效时间戳，住院医嘱必须传(caseType =1)
     */
    public Long getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set 处方生效时间戳，住院医嘱必须传(caseType =1)
     * @param BeginTime 处方生效时间戳，住院医嘱必须传(caseType =1)
     */
    public void setBeginTime(Long BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get 处方失效时间戳，住院医嘱必须传(caseType =1) 
     * @return EndTime 处方失效时间戳，住院医嘱必须传(caseType =1)
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 处方失效时间戳，住院医嘱必须传(caseType =1)
     * @param EndTime 处方失效时间戳，住院医嘱必须传(caseType =1)
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 开具数量 
     * @return Package 开具数量
     */
    public String getPackage() {
        return this.Package;
    }

    /**
     * Set 开具数量
     * @param Package 开具数量
     */
    public void setPackage(String Package) {
        this.Package = Package;
    }

    /**
     * Get 开具数量单位 
     * @return PackageUnit 开具数量单位
     */
    public String getPackageUnit() {
        return this.PackageUnit;
    }

    /**
     * Set 开具数量单位
     * @param PackageUnit 开具数量单位
     */
    public void setPackageUnit(String PackageUnit) {
        this.PackageUnit = PackageUnit;
    }

    /**
     * Get 相同标志液体间进行配伍禁忌审核，不同标志间液体不进行配伍禁忌审核 
     * @return GroupInj 相同标志液体间进行配伍禁忌审核，不同标志间液体不进行配伍禁忌审核
     */
    public String getGroupInj() {
        return this.GroupInj;
    }

    /**
     * Set 相同标志液体间进行配伍禁忌审核，不同标志间液体不进行配伍禁忌审核
     * @param GroupInj 相同标志液体间进行配伍禁忌审核，不同标志间液体不进行配伍禁忌审核
     */
    public void setGroupInj(String GroupInj) {
        this.GroupInj = GroupInj;
    }

    /**
     * Get 处方金额 
     * @return PrescriptionCharge 处方金额
     */
    public String getPrescriptionCharge() {
        return this.PrescriptionCharge;
    }

    /**
     * Set 处方金额
     * @param PrescriptionCharge 处方金额
     */
    public void setPrescriptionCharge(String PrescriptionCharge) {
        this.PrescriptionCharge = PrescriptionCharge;
    }

    /**
     * Get 用药天数 
     * @return MedicationDays 用药天数
     */
    public String getMedicationDays() {
        return this.MedicationDays;
    }

    /**
     * Set 用药天数
     * @param MedicationDays 用药天数
     */
    public void setMedicationDays(String MedicationDays) {
        this.MedicationDays = MedicationDays;
    }

    public DrugUsage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DrugUsage(DrugUsage source) {
        if (source.DrugId != null) {
            this.DrugId = new String(source.DrugId);
        }
        if (source.DrugName != null) {
            this.DrugName = new String(source.DrugName);
        }
        if (source.TimePerDay != null) {
            this.TimePerDay = new String(source.TimePerDay);
        }
        if (source.Usage != null) {
            this.Usage = new String(source.Usage);
        }
        if (source.PrescriptionId != null) {
            this.PrescriptionId = new String(source.PrescriptionId);
        }
        if (source.DosagePerTime != null) {
            this.DosagePerTime = new String(source.DosagePerTime);
        }
        if (source.DosagePerTimeUnit != null) {
            this.DosagePerTimeUnit = new String(source.DosagePerTimeUnit);
        }
        if (source.Time != null) {
            this.Time = new String(source.Time);
        }
        if (source.Cycle != null) {
            this.Cycle = new String(source.Cycle);
        }
        if (source.DosagePerDay != null) {
            this.DosagePerDay = new String(source.DosagePerDay);
        }
        if (source.Course != null) {
            this.Course = new String(source.Course);
        }
        if (source.Speed != null) {
            this.Speed = new String(source.Speed);
        }
        if (source.BeginTime != null) {
            this.BeginTime = new Long(source.BeginTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.Package != null) {
            this.Package = new String(source.Package);
        }
        if (source.PackageUnit != null) {
            this.PackageUnit = new String(source.PackageUnit);
        }
        if (source.GroupInj != null) {
            this.GroupInj = new String(source.GroupInj);
        }
        if (source.PrescriptionCharge != null) {
            this.PrescriptionCharge = new String(source.PrescriptionCharge);
        }
        if (source.MedicationDays != null) {
            this.MedicationDays = new String(source.MedicationDays);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DrugId", this.DrugId);
        this.setParamSimple(map, prefix + "DrugName", this.DrugName);
        this.setParamSimple(map, prefix + "TimePerDay", this.TimePerDay);
        this.setParamSimple(map, prefix + "Usage", this.Usage);
        this.setParamSimple(map, prefix + "PrescriptionId", this.PrescriptionId);
        this.setParamSimple(map, prefix + "DosagePerTime", this.DosagePerTime);
        this.setParamSimple(map, prefix + "DosagePerTimeUnit", this.DosagePerTimeUnit);
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "Cycle", this.Cycle);
        this.setParamSimple(map, prefix + "DosagePerDay", this.DosagePerDay);
        this.setParamSimple(map, prefix + "Course", this.Course);
        this.setParamSimple(map, prefix + "Speed", this.Speed);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Package", this.Package);
        this.setParamSimple(map, prefix + "PackageUnit", this.PackageUnit);
        this.setParamSimple(map, prefix + "GroupInj", this.GroupInj);
        this.setParamSimple(map, prefix + "PrescriptionCharge", this.PrescriptionCharge);
        this.setParamSimple(map, prefix + "MedicationDays", this.MedicationDays);

    }
}

