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

public class TableIndicators extends AbstractModel{

    /**
    * 项目列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Indicators")
    @Expose
    private IndicatorItemV2 [] Indicators;

    /**
    * 采样标本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Sample")
    @Expose
    private BaseItem Sample;

    /**
     * Get 项目列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Indicators 项目列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public IndicatorItemV2 [] getIndicators() {
        return this.Indicators;
    }

    /**
     * Set 项目列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Indicators 项目列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIndicators(IndicatorItemV2 [] Indicators) {
        this.Indicators = Indicators;
    }

    /**
     * Get 采样标本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Sample 采样标本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BaseItem getSample() {
        return this.Sample;
    }

    /**
     * Set 采样标本
注意：此字段可能返回 null，表示取不到有效值。
     * @param Sample 采样标本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSample(BaseItem Sample) {
        this.Sample = Sample;
    }

    public TableIndicators() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TableIndicators(TableIndicators source) {
        if (source.Indicators != null) {
            this.Indicators = new IndicatorItemV2[source.Indicators.length];
            for (int i = 0; i < source.Indicators.length; i++) {
                this.Indicators[i] = new IndicatorItemV2(source.Indicators[i]);
            }
        }
        if (source.Sample != null) {
            this.Sample = new BaseItem(source.Sample);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Indicators.", this.Indicators);
        this.setParamObj(map, prefix + "Sample.", this.Sample);

    }
}

