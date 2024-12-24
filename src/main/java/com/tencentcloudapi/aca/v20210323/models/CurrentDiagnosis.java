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

public class CurrentDiagnosis extends AbstractModel {

    /**
    * 诊断疾病
    */
    @SerializedName("DiagnoseDisease")
    @Expose
    private String DiagnoseDisease;

    /**
    * 疾病指南信息
    */
    @SerializedName("DiseaseGuideInfo")
    @Expose
    private String DiseaseGuideInfo;

    /**
    * 标准名称
    */
    @SerializedName("StandardName")
    @Expose
    private String StandardName;

    /**
     * Get 诊断疾病 
     * @return DiagnoseDisease 诊断疾病
     */
    public String getDiagnoseDisease() {
        return this.DiagnoseDisease;
    }

    /**
     * Set 诊断疾病
     * @param DiagnoseDisease 诊断疾病
     */
    public void setDiagnoseDisease(String DiagnoseDisease) {
        this.DiagnoseDisease = DiagnoseDisease;
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
     * Get 标准名称 
     * @return StandardName 标准名称
     */
    public String getStandardName() {
        return this.StandardName;
    }

    /**
     * Set 标准名称
     * @param StandardName 标准名称
     */
    public void setStandardName(String StandardName) {
        this.StandardName = StandardName;
    }

    public CurrentDiagnosis() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CurrentDiagnosis(CurrentDiagnosis source) {
        if (source.DiagnoseDisease != null) {
            this.DiagnoseDisease = new String(source.DiagnoseDisease);
        }
        if (source.DiseaseGuideInfo != null) {
            this.DiseaseGuideInfo = new String(source.DiseaseGuideInfo);
        }
        if (source.StandardName != null) {
            this.StandardName = new String(source.StandardName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DiagnoseDisease", this.DiagnoseDisease);
        this.setParamSimple(map, prefix + "DiseaseGuideInfo", this.DiseaseGuideInfo);
        this.setParamSimple(map, prefix + "StandardName", this.StandardName);

    }
}

