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

public class SmartPredictRespData extends AbstractModel {

    /**
    * 诊断辅助内容
    */
    @SerializedName("DiagnosisInfo")
    @Expose
    private DiagnosisInfo DiagnosisInfo;

    /**
    * 用药风险信息
    */
    @SerializedName("RationalDrugInfo")
    @Expose
    private RationalDrugInfo RationalDrugInfo;

    /**
     * Get 诊断辅助内容 
     * @return DiagnosisInfo 诊断辅助内容
     */
    public DiagnosisInfo getDiagnosisInfo() {
        return this.DiagnosisInfo;
    }

    /**
     * Set 诊断辅助内容
     * @param DiagnosisInfo 诊断辅助内容
     */
    public void setDiagnosisInfo(DiagnosisInfo DiagnosisInfo) {
        this.DiagnosisInfo = DiagnosisInfo;
    }

    /**
     * Get 用药风险信息 
     * @return RationalDrugInfo 用药风险信息
     */
    public RationalDrugInfo getRationalDrugInfo() {
        return this.RationalDrugInfo;
    }

    /**
     * Set 用药风险信息
     * @param RationalDrugInfo 用药风险信息
     */
    public void setRationalDrugInfo(RationalDrugInfo RationalDrugInfo) {
        this.RationalDrugInfo = RationalDrugInfo;
    }

    public SmartPredictRespData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SmartPredictRespData(SmartPredictRespData source) {
        if (source.DiagnosisInfo != null) {
            this.DiagnosisInfo = new DiagnosisInfo(source.DiagnosisInfo);
        }
        if (source.RationalDrugInfo != null) {
            this.RationalDrugInfo = new RationalDrugInfo(source.RationalDrugInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "DiagnosisInfo.", this.DiagnosisInfo);
        this.setParamObj(map, prefix + "RationalDrugInfo.", this.RationalDrugInfo);

    }
}

