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

public class HealthStatus extends AbstractModel{

    /**
    * 健康分数，满分100。
    */
    @SerializedName("HealthScore")
    @Expose
    private Long HealthScore;

    /**
    * 健康等级，取值包括："HEALTH" - 健康；"SUB_HEALTH" - 亚健康；"RISK"- 危险；"HIGH_RISK" - 高危。
    */
    @SerializedName("HealthLevel")
    @Expose
    private String HealthLevel;

    /**
    * 总扣分分数。
    */
    @SerializedName("ScoreLost")
    @Expose
    private Long ScoreLost;

    /**
    * 扣分详情。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScoreDetails")
    @Expose
    private ScoreDetail [] ScoreDetails;

    /**
     * Get 健康分数，满分100。 
     * @return HealthScore 健康分数，满分100。
     */
    public Long getHealthScore() {
        return this.HealthScore;
    }

    /**
     * Set 健康分数，满分100。
     * @param HealthScore 健康分数，满分100。
     */
    public void setHealthScore(Long HealthScore) {
        this.HealthScore = HealthScore;
    }

    /**
     * Get 健康等级，取值包括："HEALTH" - 健康；"SUB_HEALTH" - 亚健康；"RISK"- 危险；"HIGH_RISK" - 高危。 
     * @return HealthLevel 健康等级，取值包括："HEALTH" - 健康；"SUB_HEALTH" - 亚健康；"RISK"- 危险；"HIGH_RISK" - 高危。
     */
    public String getHealthLevel() {
        return this.HealthLevel;
    }

    /**
     * Set 健康等级，取值包括："HEALTH" - 健康；"SUB_HEALTH" - 亚健康；"RISK"- 危险；"HIGH_RISK" - 高危。
     * @param HealthLevel 健康等级，取值包括："HEALTH" - 健康；"SUB_HEALTH" - 亚健康；"RISK"- 危险；"HIGH_RISK" - 高危。
     */
    public void setHealthLevel(String HealthLevel) {
        this.HealthLevel = HealthLevel;
    }

    /**
     * Get 总扣分分数。 
     * @return ScoreLost 总扣分分数。
     */
    public Long getScoreLost() {
        return this.ScoreLost;
    }

    /**
     * Set 总扣分分数。
     * @param ScoreLost 总扣分分数。
     */
    public void setScoreLost(Long ScoreLost) {
        this.ScoreLost = ScoreLost;
    }

    /**
     * Get 扣分详情。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScoreDetails 扣分详情。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ScoreDetail [] getScoreDetails() {
        return this.ScoreDetails;
    }

    /**
     * Set 扣分详情。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScoreDetails 扣分详情。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScoreDetails(ScoreDetail [] ScoreDetails) {
        this.ScoreDetails = ScoreDetails;
    }

    public HealthStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HealthStatus(HealthStatus source) {
        if (source.HealthScore != null) {
            this.HealthScore = new Long(source.HealthScore);
        }
        if (source.HealthLevel != null) {
            this.HealthLevel = new String(source.HealthLevel);
        }
        if (source.ScoreLost != null) {
            this.ScoreLost = new Long(source.ScoreLost);
        }
        if (source.ScoreDetails != null) {
            this.ScoreDetails = new ScoreDetail[source.ScoreDetails.length];
            for (int i = 0; i < source.ScoreDetails.length; i++) {
                this.ScoreDetails[i] = new ScoreDetail(source.ScoreDetails[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HealthScore", this.HealthScore);
        this.setParamSimple(map, prefix + "HealthLevel", this.HealthLevel);
        this.setParamSimple(map, prefix + "ScoreLost", this.ScoreLost);
        this.setParamArrayObj(map, prefix + "ScoreDetails.", this.ScoreDetails);

    }
}

