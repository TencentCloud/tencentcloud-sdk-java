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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StatisticInfo extends AbstractModel {

    /**
    * 统计分析的维度。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Dimension")
    @Expose
    private String Dimension;

    /**
    * 统计分析的维度下的统计数据详情。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Data")
    @Expose
    private StatisticDataInfo [] Data;

    /**
     * Get 统计分析的维度。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Dimension 统计分析的维度。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDimension() {
        return this.Dimension;
    }

    /**
     * Set 统计分析的维度。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Dimension 统计分析的维度。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDimension(String Dimension) {
        this.Dimension = Dimension;
    }

    /**
     * Get 统计分析的维度下的统计数据详情。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Data 统计分析的维度下的统计数据详情。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public StatisticDataInfo [] getData() {
        return this.Data;
    }

    /**
     * Set 统计分析的维度下的统计数据详情。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Data 统计分析的维度下的统计数据详情。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setData(StatisticDataInfo [] Data) {
        this.Data = Data;
    }

    public StatisticInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StatisticInfo(StatisticInfo source) {
        if (source.Dimension != null) {
            this.Dimension = new String(source.Dimension);
        }
        if (source.Data != null) {
            this.Data = new StatisticDataInfo[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new StatisticDataInfo(source.Data[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Dimension", this.Dimension);
        this.setParamArrayObj(map, prefix + "Data.", this.Data);

    }
}

