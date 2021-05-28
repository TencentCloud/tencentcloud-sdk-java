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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScoreDetail extends AbstractModel{

    /**
    * 扣分项分类，取值包括：可用性、可维护性、性能及可靠性。
    */
    @SerializedName("IssueType")
    @Expose
    private String IssueType;

    /**
    * 扣分总分。
    */
    @SerializedName("ScoreLost")
    @Expose
    private Long ScoreLost;

    /**
    * 扣分总分上限。
    */
    @SerializedName("ScoreLostMax")
    @Expose
    private Long ScoreLostMax;

    /**
    * 扣分项列表。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Items")
    @Expose
    private ScoreItem [] Items;

    /**
     * Get 扣分项分类，取值包括：可用性、可维护性、性能及可靠性。 
     * @return IssueType 扣分项分类，取值包括：可用性、可维护性、性能及可靠性。
     */
    public String getIssueType() {
        return this.IssueType;
    }

    /**
     * Set 扣分项分类，取值包括：可用性、可维护性、性能及可靠性。
     * @param IssueType 扣分项分类，取值包括：可用性、可维护性、性能及可靠性。
     */
    public void setIssueType(String IssueType) {
        this.IssueType = IssueType;
    }

    /**
     * Get 扣分总分。 
     * @return ScoreLost 扣分总分。
     */
    public Long getScoreLost() {
        return this.ScoreLost;
    }

    /**
     * Set 扣分总分。
     * @param ScoreLost 扣分总分。
     */
    public void setScoreLost(Long ScoreLost) {
        this.ScoreLost = ScoreLost;
    }

    /**
     * Get 扣分总分上限。 
     * @return ScoreLostMax 扣分总分上限。
     */
    public Long getScoreLostMax() {
        return this.ScoreLostMax;
    }

    /**
     * Set 扣分总分上限。
     * @param ScoreLostMax 扣分总分上限。
     */
    public void setScoreLostMax(Long ScoreLostMax) {
        this.ScoreLostMax = ScoreLostMax;
    }

    /**
     * Get 扣分项列表。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Items 扣分项列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ScoreItem [] getItems() {
        return this.Items;
    }

    /**
     * Set 扣分项列表。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Items 扣分项列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setItems(ScoreItem [] Items) {
        this.Items = Items;
    }

    public ScoreDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScoreDetail(ScoreDetail source) {
        if (source.IssueType != null) {
            this.IssueType = new String(source.IssueType);
        }
        if (source.ScoreLost != null) {
            this.ScoreLost = new Long(source.ScoreLost);
        }
        if (source.ScoreLostMax != null) {
            this.ScoreLostMax = new Long(source.ScoreLostMax);
        }
        if (source.Items != null) {
            this.Items = new ScoreItem[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new ScoreItem(source.Items[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IssueType", this.IssueType);
        this.setParamSimple(map, prefix + "ScoreLost", this.ScoreLost);
        this.setParamSimple(map, prefix + "ScoreLostMax", this.ScoreLostMax);
        this.setParamArrayObj(map, prefix + "Items.", this.Items);

    }
}

