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

public class Indicator extends AbstractModel{

    /**
    * 检验指标项
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Indicators")
    @Expose
    private IndicatorItem [] Indicators;

    /**
     * Get 检验指标项
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Indicators 检验指标项
注意：此字段可能返回 null，表示取不到有效值。
     */
    public IndicatorItem [] getIndicators() {
        return this.Indicators;
    }

    /**
     * Set 检验指标项
注意：此字段可能返回 null，表示取不到有效值。
     * @param Indicators 检验指标项
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIndicators(IndicatorItem [] Indicators) {
        this.Indicators = Indicators;
    }

    public Indicator() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Indicator(Indicator source) {
        if (source.Indicators != null) {
            this.Indicators = new IndicatorItem[source.Indicators.length];
            for (int i = 0; i < source.Indicators.length; i++) {
                this.Indicators[i] = new IndicatorItem(source.Indicators[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Indicators.", this.Indicators);

    }
}

