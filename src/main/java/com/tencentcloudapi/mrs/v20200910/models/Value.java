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

public class Value extends AbstractModel{

    /**
    * 等级
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Grade")
    @Expose
    private String Grade;

    /**
    * 百分比
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Percent")
    @Expose
    private Float [] Percent;

    /**
    * 阳性
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Positive")
    @Expose
    private String Positive;

    /**
     * Get 等级
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Grade 等级
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGrade() {
        return this.Grade;
    }

    /**
     * Set 等级
注意：此字段可能返回 null，表示取不到有效值。
     * @param Grade 等级
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGrade(String Grade) {
        this.Grade = Grade;
    }

    /**
     * Get 百分比
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Percent 百分比
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float [] getPercent() {
        return this.Percent;
    }

    /**
     * Set 百分比
注意：此字段可能返回 null，表示取不到有效值。
     * @param Percent 百分比
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPercent(Float [] Percent) {
        this.Percent = Percent;
    }

    /**
     * Get 阳性
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Positive 阳性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPositive() {
        return this.Positive;
    }

    /**
     * Set 阳性
注意：此字段可能返回 null，表示取不到有效值。
     * @param Positive 阳性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPositive(String Positive) {
        this.Positive = Positive;
    }

    public Value() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Value(Value source) {
        if (source.Grade != null) {
            this.Grade = new String(source.Grade);
        }
        if (source.Percent != null) {
            this.Percent = new Float[source.Percent.length];
            for (int i = 0; i < source.Percent.length; i++) {
                this.Percent[i] = new Float(source.Percent[i]);
            }
        }
        if (source.Positive != null) {
            this.Positive = new String(source.Positive);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Grade", this.Grade);
        this.setParamArraySimple(map, prefix + "Percent.", this.Percent);
        this.setParamSimple(map, prefix + "Positive", this.Positive);

    }
}

