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

public class PersonalHistory extends AbstractModel{

    /**
    * 出生地
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BirthPlace")
    @Expose
    private String BirthPlace;

    /**
    * 工作史
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Job")
    @Expose
    private String Job;

    /**
    * 旅居史
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LivePlace")
    @Expose
    private String LivePlace;

    /**
    * 个人史
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Personal")
    @Expose
    private String Personal;

    /**
    * 吸烟史
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Smoke")
    @Expose
    private String Smoke;

    /**
    * 饮酒史
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Alcoholic")
    @Expose
    private String Alcoholic;

    /**
     * Get 出生地
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BirthPlace 出生地
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBirthPlace() {
        return this.BirthPlace;
    }

    /**
     * Set 出生地
注意：此字段可能返回 null，表示取不到有效值。
     * @param BirthPlace 出生地
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBirthPlace(String BirthPlace) {
        this.BirthPlace = BirthPlace;
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
     * Get 旅居史
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LivePlace 旅居史
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLivePlace() {
        return this.LivePlace;
    }

    /**
     * Set 旅居史
注意：此字段可能返回 null，表示取不到有效值。
     * @param LivePlace 旅居史
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLivePlace(String LivePlace) {
        this.LivePlace = LivePlace;
    }

    /**
     * Get 个人史
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Personal 个人史
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPersonal() {
        return this.Personal;
    }

    /**
     * Set 个人史
注意：此字段可能返回 null，表示取不到有效值。
     * @param Personal 个人史
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPersonal(String Personal) {
        this.Personal = Personal;
    }

    /**
     * Get 吸烟史
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Smoke 吸烟史
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSmoke() {
        return this.Smoke;
    }

    /**
     * Set 吸烟史
注意：此字段可能返回 null，表示取不到有效值。
     * @param Smoke 吸烟史
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSmoke(String Smoke) {
        this.Smoke = Smoke;
    }

    /**
     * Get 饮酒史
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Alcoholic 饮酒史
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAlcoholic() {
        return this.Alcoholic;
    }

    /**
     * Set 饮酒史
注意：此字段可能返回 null，表示取不到有效值。
     * @param Alcoholic 饮酒史
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlcoholic(String Alcoholic) {
        this.Alcoholic = Alcoholic;
    }

    public PersonalHistory() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PersonalHistory(PersonalHistory source) {
        if (source.BirthPlace != null) {
            this.BirthPlace = new String(source.BirthPlace);
        }
        if (source.Job != null) {
            this.Job = new String(source.Job);
        }
        if (source.LivePlace != null) {
            this.LivePlace = new String(source.LivePlace);
        }
        if (source.Personal != null) {
            this.Personal = new String(source.Personal);
        }
        if (source.Smoke != null) {
            this.Smoke = new String(source.Smoke);
        }
        if (source.Alcoholic != null) {
            this.Alcoholic = new String(source.Alcoholic);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BirthPlace", this.BirthPlace);
        this.setParamSimple(map, prefix + "Job", this.Job);
        this.setParamSimple(map, prefix + "LivePlace", this.LivePlace);
        this.setParamSimple(map, prefix + "Personal", this.Personal);
        this.setParamSimple(map, prefix + "Smoke", this.Smoke);
        this.setParamSimple(map, prefix + "Alcoholic", this.Alcoholic);

    }
}

