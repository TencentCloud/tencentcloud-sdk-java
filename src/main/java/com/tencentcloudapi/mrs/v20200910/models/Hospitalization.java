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

public class Hospitalization extends AbstractModel {

    /**
    * 入院时间
    */
    @SerializedName("AdmissionTime")
    @Expose
    private String AdmissionTime;

    /**
    * 出院时间
    */
    @SerializedName("DischargeTime")
    @Expose
    private String DischargeTime;

    /**
    * 住院天数
    */
    @SerializedName("AdmissionDays")
    @Expose
    private String AdmissionDays;

    /**
    * 入院诊断
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AdmissionDignosis")
    @Expose
    private String AdmissionDignosis;

    /**
    * 入院情况
    */
    @SerializedName("AdmissionCondition")
    @Expose
    private String AdmissionCondition;

    /**
    * 诊疗经过
    */
    @SerializedName("DiagnosisTreatment")
    @Expose
    private String DiagnosisTreatment;

    /**
    * 出院诊断
    */
    @SerializedName("DischargeDiagnosis")
    @Expose
    private String DischargeDiagnosis;

    /**
    * 出院医嘱
    */
    @SerializedName("DischargeInstruction")
    @Expose
    private String DischargeInstruction;

    /**
    * 入院诊断
    */
    @SerializedName("AdmissionDiagnosis")
    @Expose
    private String AdmissionDiagnosis;

    /**
    * 数据在原PDF文件中的第几页
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
     * Get 入院时间 
     * @return AdmissionTime 入院时间
     */
    public String getAdmissionTime() {
        return this.AdmissionTime;
    }

    /**
     * Set 入院时间
     * @param AdmissionTime 入院时间
     */
    public void setAdmissionTime(String AdmissionTime) {
        this.AdmissionTime = AdmissionTime;
    }

    /**
     * Get 出院时间 
     * @return DischargeTime 出院时间
     */
    public String getDischargeTime() {
        return this.DischargeTime;
    }

    /**
     * Set 出院时间
     * @param DischargeTime 出院时间
     */
    public void setDischargeTime(String DischargeTime) {
        this.DischargeTime = DischargeTime;
    }

    /**
     * Get 住院天数 
     * @return AdmissionDays 住院天数
     */
    public String getAdmissionDays() {
        return this.AdmissionDays;
    }

    /**
     * Set 住院天数
     * @param AdmissionDays 住院天数
     */
    public void setAdmissionDays(String AdmissionDays) {
        this.AdmissionDays = AdmissionDays;
    }

    /**
     * Get 入院诊断
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AdmissionDignosis 入院诊断
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public String getAdmissionDignosis() {
        return this.AdmissionDignosis;
    }

    /**
     * Set 入院诊断
注意：此字段可能返回 null，表示取不到有效值。
     * @param AdmissionDignosis 入院诊断
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public void setAdmissionDignosis(String AdmissionDignosis) {
        this.AdmissionDignosis = AdmissionDignosis;
    }

    /**
     * Get 入院情况 
     * @return AdmissionCondition 入院情况
     */
    public String getAdmissionCondition() {
        return this.AdmissionCondition;
    }

    /**
     * Set 入院情况
     * @param AdmissionCondition 入院情况
     */
    public void setAdmissionCondition(String AdmissionCondition) {
        this.AdmissionCondition = AdmissionCondition;
    }

    /**
     * Get 诊疗经过 
     * @return DiagnosisTreatment 诊疗经过
     */
    public String getDiagnosisTreatment() {
        return this.DiagnosisTreatment;
    }

    /**
     * Set 诊疗经过
     * @param DiagnosisTreatment 诊疗经过
     */
    public void setDiagnosisTreatment(String DiagnosisTreatment) {
        this.DiagnosisTreatment = DiagnosisTreatment;
    }

    /**
     * Get 出院诊断 
     * @return DischargeDiagnosis 出院诊断
     */
    public String getDischargeDiagnosis() {
        return this.DischargeDiagnosis;
    }

    /**
     * Set 出院诊断
     * @param DischargeDiagnosis 出院诊断
     */
    public void setDischargeDiagnosis(String DischargeDiagnosis) {
        this.DischargeDiagnosis = DischargeDiagnosis;
    }

    /**
     * Get 出院医嘱 
     * @return DischargeInstruction 出院医嘱
     */
    public String getDischargeInstruction() {
        return this.DischargeInstruction;
    }

    /**
     * Set 出院医嘱
     * @param DischargeInstruction 出院医嘱
     */
    public void setDischargeInstruction(String DischargeInstruction) {
        this.DischargeInstruction = DischargeInstruction;
    }

    /**
     * Get 入院诊断 
     * @return AdmissionDiagnosis 入院诊断
     */
    public String getAdmissionDiagnosis() {
        return this.AdmissionDiagnosis;
    }

    /**
     * Set 入院诊断
     * @param AdmissionDiagnosis 入院诊断
     */
    public void setAdmissionDiagnosis(String AdmissionDiagnosis) {
        this.AdmissionDiagnosis = AdmissionDiagnosis;
    }

    /**
     * Get 数据在原PDF文件中的第几页 
     * @return Page 数据在原PDF文件中的第几页
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set 数据在原PDF文件中的第几页
     * @param Page 数据在原PDF文件中的第几页
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    public Hospitalization() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Hospitalization(Hospitalization source) {
        if (source.AdmissionTime != null) {
            this.AdmissionTime = new String(source.AdmissionTime);
        }
        if (source.DischargeTime != null) {
            this.DischargeTime = new String(source.DischargeTime);
        }
        if (source.AdmissionDays != null) {
            this.AdmissionDays = new String(source.AdmissionDays);
        }
        if (source.AdmissionDignosis != null) {
            this.AdmissionDignosis = new String(source.AdmissionDignosis);
        }
        if (source.AdmissionCondition != null) {
            this.AdmissionCondition = new String(source.AdmissionCondition);
        }
        if (source.DiagnosisTreatment != null) {
            this.DiagnosisTreatment = new String(source.DiagnosisTreatment);
        }
        if (source.DischargeDiagnosis != null) {
            this.DischargeDiagnosis = new String(source.DischargeDiagnosis);
        }
        if (source.DischargeInstruction != null) {
            this.DischargeInstruction = new String(source.DischargeInstruction);
        }
        if (source.AdmissionDiagnosis != null) {
            this.AdmissionDiagnosis = new String(source.AdmissionDiagnosis);
        }
        if (source.Page != null) {
            this.Page = new Long(source.Page);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AdmissionTime", this.AdmissionTime);
        this.setParamSimple(map, prefix + "DischargeTime", this.DischargeTime);
        this.setParamSimple(map, prefix + "AdmissionDays", this.AdmissionDays);
        this.setParamSimple(map, prefix + "AdmissionDignosis", this.AdmissionDignosis);
        this.setParamSimple(map, prefix + "AdmissionCondition", this.AdmissionCondition);
        this.setParamSimple(map, prefix + "DiagnosisTreatment", this.DiagnosisTreatment);
        this.setParamSimple(map, prefix + "DischargeDiagnosis", this.DischargeDiagnosis);
        this.setParamSimple(map, prefix + "DischargeInstruction", this.DischargeInstruction);
        this.setParamSimple(map, prefix + "AdmissionDiagnosis", this.AdmissionDiagnosis);
        this.setParamSimple(map, prefix + "Page", this.Page);

    }
}

