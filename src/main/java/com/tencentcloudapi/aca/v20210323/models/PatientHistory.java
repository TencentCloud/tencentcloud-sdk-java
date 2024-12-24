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

public class PatientHistory extends AbstractModel {

    /**
    * 病史
    */
    @SerializedName("DiseaseHistory")
    @Expose
    private String DiseaseHistory;

    /**
    * 治疗史
    */
    @SerializedName("TreatmentHistory")
    @Expose
    private String TreatmentHistory;

    /**
     * Get 病史 
     * @return DiseaseHistory 病史
     */
    public String getDiseaseHistory() {
        return this.DiseaseHistory;
    }

    /**
     * Set 病史
     * @param DiseaseHistory 病史
     */
    public void setDiseaseHistory(String DiseaseHistory) {
        this.DiseaseHistory = DiseaseHistory;
    }

    /**
     * Get 治疗史 
     * @return TreatmentHistory 治疗史
     */
    public String getTreatmentHistory() {
        return this.TreatmentHistory;
    }

    /**
     * Set 治疗史
     * @param TreatmentHistory 治疗史
     */
    public void setTreatmentHistory(String TreatmentHistory) {
        this.TreatmentHistory = TreatmentHistory;
    }

    public PatientHistory() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PatientHistory(PatientHistory source) {
        if (source.DiseaseHistory != null) {
            this.DiseaseHistory = new String(source.DiseaseHistory);
        }
        if (source.TreatmentHistory != null) {
            this.TreatmentHistory = new String(source.TreatmentHistory);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DiseaseHistory", this.DiseaseHistory);
        this.setParamSimple(map, prefix + "TreatmentHistory", this.TreatmentHistory);

    }
}

