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

public class TreatmentGuide extends AbstractModel {

    /**
    * 医生诊断
    */
    @SerializedName("DoctorDiagnosis")
    @Expose
    private String DoctorDiagnosis;

    /**
    * 疾病名称
    */
    @SerializedName("DiseaseName")
    @Expose
    private String DiseaseName;

    /**
    * 治疗详情链接
    */
    @SerializedName("TreatDetailUrl")
    @Expose
    private String TreatDetailUrl;

    /**
    * 治疗方案
    */
    @SerializedName("TreatPlan")
    @Expose
    private String TreatPlan;

    /**
    * 治疗原则
    */
    @SerializedName("TreatPrinciple")
    @Expose
    private String TreatPrinciple;

    /**
     * Get 医生诊断 
     * @return DoctorDiagnosis 医生诊断
     */
    public String getDoctorDiagnosis() {
        return this.DoctorDiagnosis;
    }

    /**
     * Set 医生诊断
     * @param DoctorDiagnosis 医生诊断
     */
    public void setDoctorDiagnosis(String DoctorDiagnosis) {
        this.DoctorDiagnosis = DoctorDiagnosis;
    }

    /**
     * Get 疾病名称 
     * @return DiseaseName 疾病名称
     */
    public String getDiseaseName() {
        return this.DiseaseName;
    }

    /**
     * Set 疾病名称
     * @param DiseaseName 疾病名称
     */
    public void setDiseaseName(String DiseaseName) {
        this.DiseaseName = DiseaseName;
    }

    /**
     * Get 治疗详情链接 
     * @return TreatDetailUrl 治疗详情链接
     */
    public String getTreatDetailUrl() {
        return this.TreatDetailUrl;
    }

    /**
     * Set 治疗详情链接
     * @param TreatDetailUrl 治疗详情链接
     */
    public void setTreatDetailUrl(String TreatDetailUrl) {
        this.TreatDetailUrl = TreatDetailUrl;
    }

    /**
     * Get 治疗方案 
     * @return TreatPlan 治疗方案
     */
    public String getTreatPlan() {
        return this.TreatPlan;
    }

    /**
     * Set 治疗方案
     * @param TreatPlan 治疗方案
     */
    public void setTreatPlan(String TreatPlan) {
        this.TreatPlan = TreatPlan;
    }

    /**
     * Get 治疗原则 
     * @return TreatPrinciple 治疗原则
     */
    public String getTreatPrinciple() {
        return this.TreatPrinciple;
    }

    /**
     * Set 治疗原则
     * @param TreatPrinciple 治疗原则
     */
    public void setTreatPrinciple(String TreatPrinciple) {
        this.TreatPrinciple = TreatPrinciple;
    }

    public TreatmentGuide() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TreatmentGuide(TreatmentGuide source) {
        if (source.DoctorDiagnosis != null) {
            this.DoctorDiagnosis = new String(source.DoctorDiagnosis);
        }
        if (source.DiseaseName != null) {
            this.DiseaseName = new String(source.DiseaseName);
        }
        if (source.TreatDetailUrl != null) {
            this.TreatDetailUrl = new String(source.TreatDetailUrl);
        }
        if (source.TreatPlan != null) {
            this.TreatPlan = new String(source.TreatPlan);
        }
        if (source.TreatPrinciple != null) {
            this.TreatPrinciple = new String(source.TreatPrinciple);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DoctorDiagnosis", this.DoctorDiagnosis);
        this.setParamSimple(map, prefix + "DiseaseName", this.DiseaseName);
        this.setParamSimple(map, prefix + "TreatDetailUrl", this.TreatDetailUrl);
        this.setParamSimple(map, prefix + "TreatPlan", this.TreatPlan);
        this.setParamSimple(map, prefix + "TreatPrinciple", this.TreatPrinciple);

    }
}

