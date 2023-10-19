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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InternalMedicineHeart extends AbstractModel {

    /**
    * 心脏总体描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Text")
    @Expose
    private KeyValueItem Text;

    /**
    * 心律
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HeartRhythm")
    @Expose
    private KeyValueItem HeartRhythm;

    /**
    * 心率
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HeartRate")
    @Expose
    private ValueUnitItem HeartRate;

    /**
    * 心脏听诊
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HeartAuscultation")
    @Expose
    private KeyValueItem HeartAuscultation;

    /**
     * Get 心脏总体描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Text 心脏总体描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public KeyValueItem getText() {
        return this.Text;
    }

    /**
     * Set 心脏总体描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Text 心脏总体描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setText(KeyValueItem Text) {
        this.Text = Text;
    }

    /**
     * Get 心律
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HeartRhythm 心律
注意：此字段可能返回 null，表示取不到有效值。
     */
    public KeyValueItem getHeartRhythm() {
        return this.HeartRhythm;
    }

    /**
     * Set 心律
注意：此字段可能返回 null，表示取不到有效值。
     * @param HeartRhythm 心律
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHeartRhythm(KeyValueItem HeartRhythm) {
        this.HeartRhythm = HeartRhythm;
    }

    /**
     * Get 心率
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HeartRate 心率
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ValueUnitItem getHeartRate() {
        return this.HeartRate;
    }

    /**
     * Set 心率
注意：此字段可能返回 null，表示取不到有效值。
     * @param HeartRate 心率
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHeartRate(ValueUnitItem HeartRate) {
        this.HeartRate = HeartRate;
    }

    /**
     * Get 心脏听诊
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HeartAuscultation 心脏听诊
注意：此字段可能返回 null，表示取不到有效值。
     */
    public KeyValueItem getHeartAuscultation() {
        return this.HeartAuscultation;
    }

    /**
     * Set 心脏听诊
注意：此字段可能返回 null，表示取不到有效值。
     * @param HeartAuscultation 心脏听诊
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHeartAuscultation(KeyValueItem HeartAuscultation) {
        this.HeartAuscultation = HeartAuscultation;
    }

    public InternalMedicineHeart() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InternalMedicineHeart(InternalMedicineHeart source) {
        if (source.Text != null) {
            this.Text = new KeyValueItem(source.Text);
        }
        if (source.HeartRhythm != null) {
            this.HeartRhythm = new KeyValueItem(source.HeartRhythm);
        }
        if (source.HeartRate != null) {
            this.HeartRate = new ValueUnitItem(source.HeartRate);
        }
        if (source.HeartAuscultation != null) {
            this.HeartAuscultation = new KeyValueItem(source.HeartAuscultation);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Text.", this.Text);
        this.setParamObj(map, prefix + "HeartRhythm.", this.HeartRhythm);
        this.setParamObj(map, prefix + "HeartRate.", this.HeartRate);
        this.setParamObj(map, prefix + "HeartAuscultation.", this.HeartAuscultation);

    }
}

