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

public class DailyScoreInfo extends AbstractModel{

    /**
    * 统计日期 时间戳
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StatisticsDate")
    @Expose
    private Long StatisticsDate;

    /**
    * 评分
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Score")
    @Expose
    private Float Score;

    /**
     * Get 统计日期 时间戳
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StatisticsDate 统计日期 时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatisticsDate() {
        return this.StatisticsDate;
    }

    /**
     * Set 统计日期 时间戳
注意：此字段可能返回 null，表示取不到有效值。
     * @param StatisticsDate 统计日期 时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatisticsDate(Long StatisticsDate) {
        this.StatisticsDate = StatisticsDate;
    }

    /**
     * Get 评分
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Score 评分
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getScore() {
        return this.Score;
    }

    /**
     * Set 评分
注意：此字段可能返回 null，表示取不到有效值。
     * @param Score 评分
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScore(Float Score) {
        this.Score = Score;
    }

    public DailyScoreInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DailyScoreInfo(DailyScoreInfo source) {
        if (source.StatisticsDate != null) {
            this.StatisticsDate = new Long(source.StatisticsDate);
        }
        if (source.Score != null) {
            this.Score = new Float(source.Score);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StatisticsDate", this.StatisticsDate);
        this.setParamSimple(map, prefix + "Score", this.Score);

    }
}

