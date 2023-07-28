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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TrafficFlow extends AbstractModel{

    /**
    * 实际流量，单位为 字节
    */
    @SerializedName("Value")
    @Expose
    private Long Value;

    /**
    * 格式化后的流量，单位见参数 FormatUnit
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FormatValue")
    @Expose
    private Float FormatValue;

    /**
    * 格式化后流量的单位
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FormatUnit")
    @Expose
    private String FormatUnit;

    /**
     * Get 实际流量，单位为 字节 
     * @return Value 实际流量，单位为 字节
     */
    public Long getValue() {
        return this.Value;
    }

    /**
     * Set 实际流量，单位为 字节
     * @param Value 实际流量，单位为 字节
     */
    public void setValue(Long Value) {
        this.Value = Value;
    }

    /**
     * Get 格式化后的流量，单位见参数 FormatUnit
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FormatValue 格式化后的流量，单位见参数 FormatUnit
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getFormatValue() {
        return this.FormatValue;
    }

    /**
     * Set 格式化后的流量，单位见参数 FormatUnit
注意：此字段可能返回 null，表示取不到有效值。
     * @param FormatValue 格式化后的流量，单位见参数 FormatUnit
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFormatValue(Float FormatValue) {
        this.FormatValue = FormatValue;
    }

    /**
     * Get 格式化后流量的单位
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FormatUnit 格式化后流量的单位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFormatUnit() {
        return this.FormatUnit;
    }

    /**
     * Set 格式化后流量的单位
注意：此字段可能返回 null，表示取不到有效值。
     * @param FormatUnit 格式化后流量的单位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFormatUnit(String FormatUnit) {
        this.FormatUnit = FormatUnit;
    }

    public TrafficFlow() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TrafficFlow(TrafficFlow source) {
        if (source.Value != null) {
            this.Value = new Long(source.Value);
        }
        if (source.FormatValue != null) {
            this.FormatValue = new Float(source.FormatValue);
        }
        if (source.FormatUnit != null) {
            this.FormatUnit = new String(source.FormatUnit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "FormatValue", this.FormatValue);
        this.setParamSimple(map, prefix + "FormatUnit", this.FormatUnit);

    }
}

