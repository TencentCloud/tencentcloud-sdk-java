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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WaveThresholdForm extends AbstractModel {

    /**
    * ACTUAL 实际金额，FORECAST 预测金额
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WarnType")
    @Expose
    private String WarnType;

    /**
    * 波动阈值（大于等于0）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Threshold")
    @Expose
    private String Threshold;

    /**
    * 告警类型：chain 环比，yoy 同比，fix 固定值
（支持类型：日环比 chain day，日同比周维度 chain weekday，日同比月维度 yoy  day，日固定值 fix day，月环比 chain month，月固定值 fix month）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MetaType")
    @Expose
    private String MetaType;

    /**
    * 告警维度：day 日，month 月，weekday 周
（支持类型：日环比 chain day，日同比周维度 chain weekday，日同比月维度 yoy  day，日固定值 fix day，月环比 chain month，月固定值 fix month）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PeriodType")
    @Expose
    private String PeriodType;

    /**
     * Get ACTUAL 实际金额，FORECAST 预测金额
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WarnType ACTUAL 实际金额，FORECAST 预测金额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWarnType() {
        return this.WarnType;
    }

    /**
     * Set ACTUAL 实际金额，FORECAST 预测金额
注意：此字段可能返回 null，表示取不到有效值。
     * @param WarnType ACTUAL 实际金额，FORECAST 预测金额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWarnType(String WarnType) {
        this.WarnType = WarnType;
    }

    /**
     * Get 波动阈值（大于等于0）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Threshold 波动阈值（大于等于0）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getThreshold() {
        return this.Threshold;
    }

    /**
     * Set 波动阈值（大于等于0）
注意：此字段可能返回 null，表示取不到有效值。
     * @param Threshold 波动阈值（大于等于0）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setThreshold(String Threshold) {
        this.Threshold = Threshold;
    }

    /**
     * Get 告警类型：chain 环比，yoy 同比，fix 固定值
（支持类型：日环比 chain day，日同比周维度 chain weekday，日同比月维度 yoy  day，日固定值 fix day，月环比 chain month，月固定值 fix month）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MetaType 告警类型：chain 环比，yoy 同比，fix 固定值
（支持类型：日环比 chain day，日同比周维度 chain weekday，日同比月维度 yoy  day，日固定值 fix day，月环比 chain month，月固定值 fix month）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMetaType() {
        return this.MetaType;
    }

    /**
     * Set 告警类型：chain 环比，yoy 同比，fix 固定值
（支持类型：日环比 chain day，日同比周维度 chain weekday，日同比月维度 yoy  day，日固定值 fix day，月环比 chain month，月固定值 fix month）
注意：此字段可能返回 null，表示取不到有效值。
     * @param MetaType 告警类型：chain 环比，yoy 同比，fix 固定值
（支持类型：日环比 chain day，日同比周维度 chain weekday，日同比月维度 yoy  day，日固定值 fix day，月环比 chain month，月固定值 fix month）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMetaType(String MetaType) {
        this.MetaType = MetaType;
    }

    /**
     * Get 告警维度：day 日，month 月，weekday 周
（支持类型：日环比 chain day，日同比周维度 chain weekday，日同比月维度 yoy  day，日固定值 fix day，月环比 chain month，月固定值 fix month）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PeriodType 告警维度：day 日，month 月，weekday 周
（支持类型：日环比 chain day，日同比周维度 chain weekday，日同比月维度 yoy  day，日固定值 fix day，月环比 chain month，月固定值 fix month）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPeriodType() {
        return this.PeriodType;
    }

    /**
     * Set 告警维度：day 日，month 月，weekday 周
（支持类型：日环比 chain day，日同比周维度 chain weekday，日同比月维度 yoy  day，日固定值 fix day，月环比 chain month，月固定值 fix month）
注意：此字段可能返回 null，表示取不到有效值。
     * @param PeriodType 告警维度：day 日，month 月，weekday 周
（支持类型：日环比 chain day，日同比周维度 chain weekday，日同比月维度 yoy  day，日固定值 fix day，月环比 chain month，月固定值 fix month）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPeriodType(String PeriodType) {
        this.PeriodType = PeriodType;
    }

    public WaveThresholdForm() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WaveThresholdForm(WaveThresholdForm source) {
        if (source.WarnType != null) {
            this.WarnType = new String(source.WarnType);
        }
        if (source.Threshold != null) {
            this.Threshold = new String(source.Threshold);
        }
        if (source.MetaType != null) {
            this.MetaType = new String(source.MetaType);
        }
        if (source.PeriodType != null) {
            this.PeriodType = new String(source.PeriodType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WarnType", this.WarnType);
        this.setParamSimple(map, prefix + "Threshold", this.Threshold);
        this.setParamSimple(map, prefix + "MetaType", this.MetaType);
        this.setParamSimple(map, prefix + "PeriodType", this.PeriodType);

    }
}

