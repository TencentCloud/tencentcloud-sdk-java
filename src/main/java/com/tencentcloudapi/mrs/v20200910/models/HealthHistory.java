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

public class HealthHistory extends AbstractModel{

    /**
    * 疾病史
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DiseaseHistory")
    @Expose
    private DiseaseHistory DiseaseHistory;

    /**
    * 家族史
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FamilyHistory")
    @Expose
    private FamilyHistory FamilyHistory;

    /**
    * 婚育史
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MarryHistory")
    @Expose
    private MarryHistory MarryHistory;

    /**
    * 个人史
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PersonalHistory")
    @Expose
    private PersonalHistory PersonalHistory;

    /**
    * 月经史
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MenstrualHistory")
    @Expose
    private MenstrualHistory MenstrualHistory;

    /**
     * Get 疾病史
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DiseaseHistory 疾病史
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DiseaseHistory getDiseaseHistory() {
        return this.DiseaseHistory;
    }

    /**
     * Set 疾病史
注意：此字段可能返回 null，表示取不到有效值。
     * @param DiseaseHistory 疾病史
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiseaseHistory(DiseaseHistory DiseaseHistory) {
        this.DiseaseHistory = DiseaseHistory;
    }

    /**
     * Get 家族史
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FamilyHistory 家族史
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FamilyHistory getFamilyHistory() {
        return this.FamilyHistory;
    }

    /**
     * Set 家族史
注意：此字段可能返回 null，表示取不到有效值。
     * @param FamilyHistory 家族史
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFamilyHistory(FamilyHistory FamilyHistory) {
        this.FamilyHistory = FamilyHistory;
    }

    /**
     * Get 婚育史
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MarryHistory 婚育史
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MarryHistory getMarryHistory() {
        return this.MarryHistory;
    }

    /**
     * Set 婚育史
注意：此字段可能返回 null，表示取不到有效值。
     * @param MarryHistory 婚育史
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMarryHistory(MarryHistory MarryHistory) {
        this.MarryHistory = MarryHistory;
    }

    /**
     * Get 个人史
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PersonalHistory 个人史
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PersonalHistory getPersonalHistory() {
        return this.PersonalHistory;
    }

    /**
     * Set 个人史
注意：此字段可能返回 null，表示取不到有效值。
     * @param PersonalHistory 个人史
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPersonalHistory(PersonalHistory PersonalHistory) {
        this.PersonalHistory = PersonalHistory;
    }

    /**
     * Get 月经史
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MenstrualHistory 月经史
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MenstrualHistory getMenstrualHistory() {
        return this.MenstrualHistory;
    }

    /**
     * Set 月经史
注意：此字段可能返回 null，表示取不到有效值。
     * @param MenstrualHistory 月经史
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMenstrualHistory(MenstrualHistory MenstrualHistory) {
        this.MenstrualHistory = MenstrualHistory;
    }

    public HealthHistory() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HealthHistory(HealthHistory source) {
        if (source.DiseaseHistory != null) {
            this.DiseaseHistory = new DiseaseHistory(source.DiseaseHistory);
        }
        if (source.FamilyHistory != null) {
            this.FamilyHistory = new FamilyHistory(source.FamilyHistory);
        }
        if (source.MarryHistory != null) {
            this.MarryHistory = new MarryHistory(source.MarryHistory);
        }
        if (source.PersonalHistory != null) {
            this.PersonalHistory = new PersonalHistory(source.PersonalHistory);
        }
        if (source.MenstrualHistory != null) {
            this.MenstrualHistory = new MenstrualHistory(source.MenstrualHistory);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "DiseaseHistory.", this.DiseaseHistory);
        this.setParamObj(map, prefix + "FamilyHistory.", this.FamilyHistory);
        this.setParamObj(map, prefix + "MarryHistory.", this.MarryHistory);
        this.setParamObj(map, prefix + "PersonalHistory.", this.PersonalHistory);
        this.setParamObj(map, prefix + "MenstrualHistory.", this.MenstrualHistory);

    }
}

