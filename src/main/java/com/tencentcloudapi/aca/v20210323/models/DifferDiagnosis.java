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

public class DifferDiagnosis extends AbstractModel {

    /**
    * 鉴别名称
    */
    @SerializedName("DifferName")
    @Expose
    private String DifferName;

    /**
    * 鉴别提示
    */
    @SerializedName("DifferTips")
    @Expose
    private String DifferTips;

    /**
    * 疾病指南信息
    */
    @SerializedName("DiseaseGuideInfo")
    @Expose
    private String DiseaseGuideInfo;

    /**
     * Get 鉴别名称 
     * @return DifferName 鉴别名称
     */
    public String getDifferName() {
        return this.DifferName;
    }

    /**
     * Set 鉴别名称
     * @param DifferName 鉴别名称
     */
    public void setDifferName(String DifferName) {
        this.DifferName = DifferName;
    }

    /**
     * Get 鉴别提示 
     * @return DifferTips 鉴别提示
     */
    public String getDifferTips() {
        return this.DifferTips;
    }

    /**
     * Set 鉴别提示
     * @param DifferTips 鉴别提示
     */
    public void setDifferTips(String DifferTips) {
        this.DifferTips = DifferTips;
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

    public DifferDiagnosis() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DifferDiagnosis(DifferDiagnosis source) {
        if (source.DifferName != null) {
            this.DifferName = new String(source.DifferName);
        }
        if (source.DifferTips != null) {
            this.DifferTips = new String(source.DifferTips);
        }
        if (source.DiseaseGuideInfo != null) {
            this.DiseaseGuideInfo = new String(source.DiseaseGuideInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DifferName", this.DifferName);
        this.setParamSimple(map, prefix + "DifferTips", this.DifferTips);
        this.setParamSimple(map, prefix + "DiseaseGuideInfo", this.DiseaseGuideInfo);

    }
}

