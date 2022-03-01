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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MetricDataSingleValue extends AbstractModel{

    /**
    * 指标
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * 统计方式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MetricFunction")
    @Expose
    private String MetricFunction;

    /**
    * 指标值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MetricDataValue")
    @Expose
    private String MetricDataValue;

    /**
     * Get 指标
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MetricName 指标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set 指标
注意：此字段可能返回 null，表示取不到有效值。
     * @param MetricName 指标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
    }

    /**
     * Get 统计方式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MetricFunction 统计方式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMetricFunction() {
        return this.MetricFunction;
    }

    /**
     * Set 统计方式
注意：此字段可能返回 null，表示取不到有效值。
     * @param MetricFunction 统计方式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMetricFunction(String MetricFunction) {
        this.MetricFunction = MetricFunction;
    }

    /**
     * Get 指标值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MetricDataValue 指标值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMetricDataValue() {
        return this.MetricDataValue;
    }

    /**
     * Set 指标值
注意：此字段可能返回 null，表示取不到有效值。
     * @param MetricDataValue 指标值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMetricDataValue(String MetricDataValue) {
        this.MetricDataValue = MetricDataValue;
    }

    public MetricDataSingleValue() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MetricDataSingleValue(MetricDataSingleValue source) {
        if (source.MetricName != null) {
            this.MetricName = new String(source.MetricName);
        }
        if (source.MetricFunction != null) {
            this.MetricFunction = new String(source.MetricFunction);
        }
        if (source.MetricDataValue != null) {
            this.MetricDataValue = new String(source.MetricDataValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);
        this.setParamSimple(map, prefix + "MetricFunction", this.MetricFunction);
        this.setParamSimple(map, prefix + "MetricDataValue", this.MetricDataValue);

    }
}

