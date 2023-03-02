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

public class FamilyHistoryBlock extends AbstractModel{

    /**
    * 家庭成员
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RelativeHistory")
    @Expose
    private RelativeHistoryBlock RelativeHistory;

    /**
    * 家族肿瘤史
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RelativeCancerHistory")
    @Expose
    private RelativeCancerHistoryBlock RelativeCancerHistory;

    /**
    * 家族遗传史
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GeneticHistory")
    @Expose
    private GeneticHistoryBlock GeneticHistory;

    /**
     * Get 家庭成员
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RelativeHistory 家庭成员
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RelativeHistoryBlock getRelativeHistory() {
        return this.RelativeHistory;
    }

    /**
     * Set 家庭成员
注意：此字段可能返回 null，表示取不到有效值。
     * @param RelativeHistory 家庭成员
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRelativeHistory(RelativeHistoryBlock RelativeHistory) {
        this.RelativeHistory = RelativeHistory;
    }

    /**
     * Get 家族肿瘤史
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RelativeCancerHistory 家族肿瘤史
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RelativeCancerHistoryBlock getRelativeCancerHistory() {
        return this.RelativeCancerHistory;
    }

    /**
     * Set 家族肿瘤史
注意：此字段可能返回 null，表示取不到有效值。
     * @param RelativeCancerHistory 家族肿瘤史
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRelativeCancerHistory(RelativeCancerHistoryBlock RelativeCancerHistory) {
        this.RelativeCancerHistory = RelativeCancerHistory;
    }

    /**
     * Get 家族遗传史
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GeneticHistory 家族遗传史
注意：此字段可能返回 null，表示取不到有效值。
     */
    public GeneticHistoryBlock getGeneticHistory() {
        return this.GeneticHistory;
    }

    /**
     * Set 家族遗传史
注意：此字段可能返回 null，表示取不到有效值。
     * @param GeneticHistory 家族遗传史
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGeneticHistory(GeneticHistoryBlock GeneticHistory) {
        this.GeneticHistory = GeneticHistory;
    }

    public FamilyHistoryBlock() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FamilyHistoryBlock(FamilyHistoryBlock source) {
        if (source.RelativeHistory != null) {
            this.RelativeHistory = new RelativeHistoryBlock(source.RelativeHistory);
        }
        if (source.RelativeCancerHistory != null) {
            this.RelativeCancerHistory = new RelativeCancerHistoryBlock(source.RelativeCancerHistory);
        }
        if (source.GeneticHistory != null) {
            this.GeneticHistory = new GeneticHistoryBlock(source.GeneticHistory);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "RelativeHistory.", this.RelativeHistory);
        this.setParamObj(map, prefix + "RelativeCancerHistory.", this.RelativeCancerHistory);
        this.setParamObj(map, prefix + "GeneticHistory.", this.GeneticHistory);

    }
}

