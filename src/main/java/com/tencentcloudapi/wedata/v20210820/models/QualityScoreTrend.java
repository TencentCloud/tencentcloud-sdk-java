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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QualityScoreTrend extends AbstractModel{

    /**
    * 周期平均分
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AverageScore")
    @Expose
    private Float AverageScore;

    /**
    * 日评分列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DailyScoreList")
    @Expose
    private DailyScoreInfo [] DailyScoreList;

    /**
     * Get 周期平均分
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AverageScore 周期平均分
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getAverageScore() {
        return this.AverageScore;
    }

    /**
     * Set 周期平均分
注意：此字段可能返回 null，表示取不到有效值。
     * @param AverageScore 周期平均分
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAverageScore(Float AverageScore) {
        this.AverageScore = AverageScore;
    }

    /**
     * Get 日评分列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DailyScoreList 日评分列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DailyScoreInfo [] getDailyScoreList() {
        return this.DailyScoreList;
    }

    /**
     * Set 日评分列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param DailyScoreList 日评分列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDailyScoreList(DailyScoreInfo [] DailyScoreList) {
        this.DailyScoreList = DailyScoreList;
    }

    public QualityScoreTrend() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QualityScoreTrend(QualityScoreTrend source) {
        if (source.AverageScore != null) {
            this.AverageScore = new Float(source.AverageScore);
        }
        if (source.DailyScoreList != null) {
            this.DailyScoreList = new DailyScoreInfo[source.DailyScoreList.length];
            for (int i = 0; i < source.DailyScoreList.length; i++) {
                this.DailyScoreList[i] = new DailyScoreInfo(source.DailyScoreList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AverageScore", this.AverageScore);
        this.setParamArrayObj(map, prefix + "DailyScoreList.", this.DailyScoreList);

    }
}

