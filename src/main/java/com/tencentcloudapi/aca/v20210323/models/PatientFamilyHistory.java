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

public class PatientFamilyHistory extends AbstractModel {

    /**
    * 家族病史 如家族病史不能分开，可传入此字段
    */
    @SerializedName("FamilyDiseaseHistory")
    @Expose
    private String FamilyDiseaseHistory;

    /**
    * 关系
    */
    @SerializedName("Relation")
    @Expose
    private String Relation;

    /**
    * 当前情况
    */
    @SerializedName("CurrentSituation")
    @Expose
    private String CurrentSituation;

    /**
     * Get 家族病史 如家族病史不能分开，可传入此字段 
     * @return FamilyDiseaseHistory 家族病史 如家族病史不能分开，可传入此字段
     */
    public String getFamilyDiseaseHistory() {
        return this.FamilyDiseaseHistory;
    }

    /**
     * Set 家族病史 如家族病史不能分开，可传入此字段
     * @param FamilyDiseaseHistory 家族病史 如家族病史不能分开，可传入此字段
     */
    public void setFamilyDiseaseHistory(String FamilyDiseaseHistory) {
        this.FamilyDiseaseHistory = FamilyDiseaseHistory;
    }

    /**
     * Get 关系 
     * @return Relation 关系
     */
    public String getRelation() {
        return this.Relation;
    }

    /**
     * Set 关系
     * @param Relation 关系
     */
    public void setRelation(String Relation) {
        this.Relation = Relation;
    }

    /**
     * Get 当前情况 
     * @return CurrentSituation 当前情况
     */
    public String getCurrentSituation() {
        return this.CurrentSituation;
    }

    /**
     * Set 当前情况
     * @param CurrentSituation 当前情况
     */
    public void setCurrentSituation(String CurrentSituation) {
        this.CurrentSituation = CurrentSituation;
    }

    public PatientFamilyHistory() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PatientFamilyHistory(PatientFamilyHistory source) {
        if (source.FamilyDiseaseHistory != null) {
            this.FamilyDiseaseHistory = new String(source.FamilyDiseaseHistory);
        }
        if (source.Relation != null) {
            this.Relation = new String(source.Relation);
        }
        if (source.CurrentSituation != null) {
            this.CurrentSituation = new String(source.CurrentSituation);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FamilyDiseaseHistory", this.FamilyDiseaseHistory);
        this.setParamSimple(map, prefix + "Relation", this.Relation);
        this.setParamSimple(map, prefix + "CurrentSituation", this.CurrentSituation);

    }
}

