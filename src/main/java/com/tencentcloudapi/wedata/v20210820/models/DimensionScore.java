/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DimensionScore extends AbstractModel {

    /**
    * 维度评分列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DimensionScoreList")
    @Expose
    private DimensionScoreInfo [] DimensionScoreList;

    /**
     * Get 维度评分列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DimensionScoreList 维度评分列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DimensionScoreInfo [] getDimensionScoreList() {
        return this.DimensionScoreList;
    }

    /**
     * Set 维度评分列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param DimensionScoreList 维度评分列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDimensionScoreList(DimensionScoreInfo [] DimensionScoreList) {
        this.DimensionScoreList = DimensionScoreList;
    }

    public DimensionScore() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DimensionScore(DimensionScore source) {
        if (source.DimensionScoreList != null) {
            this.DimensionScoreList = new DimensionScoreInfo[source.DimensionScoreList.length];
            for (int i = 0; i < source.DimensionScoreList.length; i++) {
                this.DimensionScoreList[i] = new DimensionScoreInfo(source.DimensionScoreList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "DimensionScoreList.", this.DimensionScoreList);

    }
}

