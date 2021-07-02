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

public class CaseHistory extends AbstractModel{

    /**
    * 诊治信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Treatment")
    @Expose
    private Treatment Treatment;

    /**
    * 健康史信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HealthHistory")
    @Expose
    private HealthHistory HealthHistory;

    /**
    * 病例时间轴
    */
    @SerializedName("CaseHistoryList")
    @Expose
    private Case [] CaseHistoryList;

    /**
     * Get 诊治信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Treatment 诊治信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Treatment getTreatment() {
        return this.Treatment;
    }

    /**
     * Set 诊治信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Treatment 诊治信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTreatment(Treatment Treatment) {
        this.Treatment = Treatment;
    }

    /**
     * Get 健康史信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HealthHistory 健康史信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public HealthHistory getHealthHistory() {
        return this.HealthHistory;
    }

    /**
     * Set 健康史信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param HealthHistory 健康史信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHealthHistory(HealthHistory HealthHistory) {
        this.HealthHistory = HealthHistory;
    }

    /**
     * Get 病例时间轴 
     * @return CaseHistoryList 病例时间轴
     */
    public Case [] getCaseHistoryList() {
        return this.CaseHistoryList;
    }

    /**
     * Set 病例时间轴
     * @param CaseHistoryList 病例时间轴
     */
    public void setCaseHistoryList(Case [] CaseHistoryList) {
        this.CaseHistoryList = CaseHistoryList;
    }

    public CaseHistory() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CaseHistory(CaseHistory source) {
        if (source.Treatment != null) {
            this.Treatment = new Treatment(source.Treatment);
        }
        if (source.HealthHistory != null) {
            this.HealthHistory = new HealthHistory(source.HealthHistory);
        }
        if (source.CaseHistoryList != null) {
            this.CaseHistoryList = new Case[source.CaseHistoryList.length];
            for (int i = 0; i < source.CaseHistoryList.length; i++) {
                this.CaseHistoryList[i] = new Case(source.CaseHistoryList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Treatment.", this.Treatment);
        this.setParamObj(map, prefix + "HealthHistory.", this.HealthHistory);
        this.setParamArrayObj(map, prefix + "CaseHistoryList.", this.CaseHistoryList);

    }
}

