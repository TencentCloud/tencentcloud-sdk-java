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

public class Treatment extends AbstractModel{

    /**
    * 主诉
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChiefComplaint")
    @Expose
    private String ChiefComplaint;

    /**
    * 入院诊断
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AdmissionDiagnosis")
    @Expose
    private String AdmissionDiagnosis;

    /**
     * Get 主诉
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChiefComplaint 主诉
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getChiefComplaint() {
        return this.ChiefComplaint;
    }

    /**
     * Set 主诉
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChiefComplaint 主诉
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChiefComplaint(String ChiefComplaint) {
        this.ChiefComplaint = ChiefComplaint;
    }

    /**
     * Get 入院诊断
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AdmissionDiagnosis 入院诊断
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAdmissionDiagnosis() {
        return this.AdmissionDiagnosis;
    }

    /**
     * Set 入院诊断
注意：此字段可能返回 null，表示取不到有效值。
     * @param AdmissionDiagnosis 入院诊断
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAdmissionDiagnosis(String AdmissionDiagnosis) {
        this.AdmissionDiagnosis = AdmissionDiagnosis;
    }

    public Treatment() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Treatment(Treatment source) {
        if (source.ChiefComplaint != null) {
            this.ChiefComplaint = new String(source.ChiefComplaint);
        }
        if (source.AdmissionDiagnosis != null) {
            this.AdmissionDiagnosis = new String(source.AdmissionDiagnosis);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChiefComplaint", this.ChiefComplaint);
        this.setParamSimple(map, prefix + "AdmissionDiagnosis", this.AdmissionDiagnosis);

    }
}

