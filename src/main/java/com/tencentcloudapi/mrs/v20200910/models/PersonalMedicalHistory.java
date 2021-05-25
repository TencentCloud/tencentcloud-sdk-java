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

public class PersonalMedicalHistory extends AbstractModel{

    /**
    * 出生史
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BirthPlace")
    @Expose
    private String BirthPlace;

    /**
    * 居住史
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LivePlace")
    @Expose
    private String LivePlace;

    /**
    * 工作史
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Job")
    @Expose
    private String Job;

    /**
    * 吸烟史
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SmokeHistory")
    @Expose
    private String SmokeHistory;

    /**
    * 饮酒史
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AlcoholicHistory")
    @Expose
    private String AlcoholicHistory;

    /**
     * Get 出生史
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BirthPlace 出生史
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBirthPlace() {
        return this.BirthPlace;
    }

    /**
     * Set 出生史
注意：此字段可能返回 null，表示取不到有效值。
     * @param BirthPlace 出生史
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBirthPlace(String BirthPlace) {
        this.BirthPlace = BirthPlace;
    }

    /**
     * Get 居住史
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LivePlace 居住史
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLivePlace() {
        return this.LivePlace;
    }

    /**
     * Set 居住史
注意：此字段可能返回 null，表示取不到有效值。
     * @param LivePlace 居住史
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLivePlace(String LivePlace) {
        this.LivePlace = LivePlace;
    }

    /**
     * Get 工作史
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Job 工作史
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getJob() {
        return this.Job;
    }

    /**
     * Set 工作史
注意：此字段可能返回 null，表示取不到有效值。
     * @param Job 工作史
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJob(String Job) {
        this.Job = Job;
    }

    /**
     * Get 吸烟史
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SmokeHistory 吸烟史
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSmokeHistory() {
        return this.SmokeHistory;
    }

    /**
     * Set 吸烟史
注意：此字段可能返回 null，表示取不到有效值。
     * @param SmokeHistory 吸烟史
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSmokeHistory(String SmokeHistory) {
        this.SmokeHistory = SmokeHistory;
    }

    /**
     * Get 饮酒史
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AlcoholicHistory 饮酒史
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAlcoholicHistory() {
        return this.AlcoholicHistory;
    }

    /**
     * Set 饮酒史
注意：此字段可能返回 null，表示取不到有效值。
     * @param AlcoholicHistory 饮酒史
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlcoholicHistory(String AlcoholicHistory) {
        this.AlcoholicHistory = AlcoholicHistory;
    }

    public PersonalMedicalHistory() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PersonalMedicalHistory(PersonalMedicalHistory source) {
        if (source.BirthPlace != null) {
            this.BirthPlace = new String(source.BirthPlace);
        }
        if (source.LivePlace != null) {
            this.LivePlace = new String(source.LivePlace);
        }
        if (source.Job != null) {
            this.Job = new String(source.Job);
        }
        if (source.SmokeHistory != null) {
            this.SmokeHistory = new String(source.SmokeHistory);
        }
        if (source.AlcoholicHistory != null) {
            this.AlcoholicHistory = new String(source.AlcoholicHistory);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BirthPlace", this.BirthPlace);
        this.setParamSimple(map, prefix + "LivePlace", this.LivePlace);
        this.setParamSimple(map, prefix + "Job", this.Job);
        this.setParamSimple(map, prefix + "SmokeHistory", this.SmokeHistory);
        this.setParamSimple(map, prefix + "AlcoholicHistory", this.AlcoholicHistory);

    }
}

