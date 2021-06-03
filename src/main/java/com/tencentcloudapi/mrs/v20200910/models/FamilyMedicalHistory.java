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

public class FamilyMedicalHistory extends AbstractModel{

    /**
    * 家族成员史
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RelativeHistory")
    @Expose
    private String RelativeHistory;

    /**
    * 家族肿瘤史
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RelativeCancerHistory")
    @Expose
    private String RelativeCancerHistory;

    /**
    * 家族遗传史
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GeneticHistory")
    @Expose
    private String GeneticHistory;

    /**
     * Get 家族成员史
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RelativeHistory 家族成员史
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRelativeHistory() {
        return this.RelativeHistory;
    }

    /**
     * Set 家族成员史
注意：此字段可能返回 null，表示取不到有效值。
     * @param RelativeHistory 家族成员史
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRelativeHistory(String RelativeHistory) {
        this.RelativeHistory = RelativeHistory;
    }

    /**
     * Get 家族肿瘤史
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RelativeCancerHistory 家族肿瘤史
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRelativeCancerHistory() {
        return this.RelativeCancerHistory;
    }

    /**
     * Set 家族肿瘤史
注意：此字段可能返回 null，表示取不到有效值。
     * @param RelativeCancerHistory 家族肿瘤史
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRelativeCancerHistory(String RelativeCancerHistory) {
        this.RelativeCancerHistory = RelativeCancerHistory;
    }

    /**
     * Get 家族遗传史
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GeneticHistory 家族遗传史
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGeneticHistory() {
        return this.GeneticHistory;
    }

    /**
     * Set 家族遗传史
注意：此字段可能返回 null，表示取不到有效值。
     * @param GeneticHistory 家族遗传史
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGeneticHistory(String GeneticHistory) {
        this.GeneticHistory = GeneticHistory;
    }

    public FamilyMedicalHistory() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FamilyMedicalHistory(FamilyMedicalHistory source) {
        if (source.RelativeHistory != null) {
            this.RelativeHistory = new String(source.RelativeHistory);
        }
        if (source.RelativeCancerHistory != null) {
            this.RelativeCancerHistory = new String(source.RelativeCancerHistory);
        }
        if (source.GeneticHistory != null) {
            this.GeneticHistory = new String(source.GeneticHistory);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RelativeHistory", this.RelativeHistory);
        this.setParamSimple(map, prefix + "RelativeCancerHistory", this.RelativeCancerHistory);
        this.setParamSimple(map, prefix + "GeneticHistory", this.GeneticHistory);

    }
}

