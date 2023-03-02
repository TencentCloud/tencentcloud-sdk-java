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

public class DosageBlock extends AbstractModel{

    /**
    * 值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * 单次计量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SingleMeasurement")
    @Expose
    private String SingleMeasurement;

    /**
    * 频次
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Frequency")
    @Expose
    private String Frequency;

    /**
    * 给药途径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DrugDeliveryRoute")
    @Expose
    private String DrugDeliveryRoute;

    /**
     * Get 值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Value 值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 值
注意：此字段可能返回 null，表示取不到有效值。
     * @param Value 值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get 单次计量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SingleMeasurement 单次计量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSingleMeasurement() {
        return this.SingleMeasurement;
    }

    /**
     * Set 单次计量
注意：此字段可能返回 null，表示取不到有效值。
     * @param SingleMeasurement 单次计量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSingleMeasurement(String SingleMeasurement) {
        this.SingleMeasurement = SingleMeasurement;
    }

    /**
     * Get 频次
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Frequency 频次
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFrequency() {
        return this.Frequency;
    }

    /**
     * Set 频次
注意：此字段可能返回 null，表示取不到有效值。
     * @param Frequency 频次
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFrequency(String Frequency) {
        this.Frequency = Frequency;
    }

    /**
     * Get 给药途径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DrugDeliveryRoute 给药途径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDrugDeliveryRoute() {
        return this.DrugDeliveryRoute;
    }

    /**
     * Set 给药途径
注意：此字段可能返回 null，表示取不到有效值。
     * @param DrugDeliveryRoute 给药途径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDrugDeliveryRoute(String DrugDeliveryRoute) {
        this.DrugDeliveryRoute = DrugDeliveryRoute;
    }

    public DosageBlock() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DosageBlock(DosageBlock source) {
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.SingleMeasurement != null) {
            this.SingleMeasurement = new String(source.SingleMeasurement);
        }
        if (source.Frequency != null) {
            this.Frequency = new String(source.Frequency);
        }
        if (source.DrugDeliveryRoute != null) {
            this.DrugDeliveryRoute = new String(source.DrugDeliveryRoute);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "SingleMeasurement", this.SingleMeasurement);
        this.setParamSimple(map, prefix + "Frequency", this.Frequency);
        this.setParamSimple(map, prefix + "DrugDeliveryRoute", this.DrugDeliveryRoute);

    }
}

