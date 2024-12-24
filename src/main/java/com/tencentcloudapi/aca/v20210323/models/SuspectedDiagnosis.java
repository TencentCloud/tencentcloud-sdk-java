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

public class SuspectedDiagnosis extends AbstractModel {

    /**
    * 疾病名称
    */
    @SerializedName("DiseaseName")
    @Expose
    private String DiseaseName;

    /**
    * ICD代码
    */
    @SerializedName("IcdCode")
    @Expose
    private String IcdCode;

    /**
    * 症状
    */
    @SerializedName("Symptom")
    @Expose
    private String Symptom;

    /**
    * 体征
    */
    @SerializedName("Physi")
    @Expose
    private String Physi;

    /**
    * 检查
    */
    @SerializedName("Inspection")
    @Expose
    private String Inspection;

    /**
    * 疾病指南信息
    */
    @SerializedName("DiseaseGuideInfo")
    @Expose
    private String DiseaseGuideInfo;

    /**
    * 置信度
    */
    @SerializedName("Probability")
    @Expose
    private Float Probability;

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
     * Get ICD代码 
     * @return IcdCode ICD代码
     */
    public String getIcdCode() {
        return this.IcdCode;
    }

    /**
     * Set ICD代码
     * @param IcdCode ICD代码
     */
    public void setIcdCode(String IcdCode) {
        this.IcdCode = IcdCode;
    }

    /**
     * Get 症状 
     * @return Symptom 症状
     */
    public String getSymptom() {
        return this.Symptom;
    }

    /**
     * Set 症状
     * @param Symptom 症状
     */
    public void setSymptom(String Symptom) {
        this.Symptom = Symptom;
    }

    /**
     * Get 体征 
     * @return Physi 体征
     */
    public String getPhysi() {
        return this.Physi;
    }

    /**
     * Set 体征
     * @param Physi 体征
     */
    public void setPhysi(String Physi) {
        this.Physi = Physi;
    }

    /**
     * Get 检查 
     * @return Inspection 检查
     */
    public String getInspection() {
        return this.Inspection;
    }

    /**
     * Set 检查
     * @param Inspection 检查
     */
    public void setInspection(String Inspection) {
        this.Inspection = Inspection;
    }

    /**
     * Get 疾病指南信息 
     * @return DiseaseGuideInfo 疾病指南信息
     */
    public String getDiseaseGuideInfo() {
        return this.DiseaseGuideInfo;
    }

    /**
     * Set 疾病指南信息
     * @param DiseaseGuideInfo 疾病指南信息
     */
    public void setDiseaseGuideInfo(String DiseaseGuideInfo) {
        this.DiseaseGuideInfo = DiseaseGuideInfo;
    }

    /**
     * Get 置信度 
     * @return Probability 置信度
     */
    public Float getProbability() {
        return this.Probability;
    }

    /**
     * Set 置信度
     * @param Probability 置信度
     */
    public void setProbability(Float Probability) {
        this.Probability = Probability;
    }

    public SuspectedDiagnosis() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SuspectedDiagnosis(SuspectedDiagnosis source) {
        if (source.DiseaseName != null) {
            this.DiseaseName = new String(source.DiseaseName);
        }
        if (source.IcdCode != null) {
            this.IcdCode = new String(source.IcdCode);
        }
        if (source.Symptom != null) {
            this.Symptom = new String(source.Symptom);
        }
        if (source.Physi != null) {
            this.Physi = new String(source.Physi);
        }
        if (source.Inspection != null) {
            this.Inspection = new String(source.Inspection);
        }
        if (source.DiseaseGuideInfo != null) {
            this.DiseaseGuideInfo = new String(source.DiseaseGuideInfo);
        }
        if (source.Probability != null) {
            this.Probability = new Float(source.Probability);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DiseaseName", this.DiseaseName);
        this.setParamSimple(map, prefix + "IcdCode", this.IcdCode);
        this.setParamSimple(map, prefix + "Symptom", this.Symptom);
        this.setParamSimple(map, prefix + "Physi", this.Physi);
        this.setParamSimple(map, prefix + "Inspection", this.Inspection);
        this.setParamSimple(map, prefix + "DiseaseGuideInfo", this.DiseaseGuideInfo);
        this.setParamSimple(map, prefix + "Probability", this.Probability);

    }
}

