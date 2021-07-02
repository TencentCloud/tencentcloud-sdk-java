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

public class MenstrualHistory extends AbstractModel{

    /**
    * 是否来月经
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsOrNot")
    @Expose
    private String IsOrNot;

    /**
    * 月经初潮年龄
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MenarcheAge")
    @Expose
    private String MenarcheAge;

    /**
    * 末次月经时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastTime")
    @Expose
    private String LastTime;

    /**
    * 经量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Flow")
    @Expose
    private String Flow;

    /**
    * 月经周期
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Cycles")
    @Expose
    private String Cycles;

    /**
    * 行经天数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Duration")
    @Expose
    private String Duration;

    /**
     * Get 是否来月经
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsOrNot 是否来月经
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIsOrNot() {
        return this.IsOrNot;
    }

    /**
     * Set 是否来月经
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsOrNot 是否来月经
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsOrNot(String IsOrNot) {
        this.IsOrNot = IsOrNot;
    }

    /**
     * Get 月经初潮年龄
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MenarcheAge 月经初潮年龄
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMenarcheAge() {
        return this.MenarcheAge;
    }

    /**
     * Set 月经初潮年龄
注意：此字段可能返回 null，表示取不到有效值。
     * @param MenarcheAge 月经初潮年龄
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMenarcheAge(String MenarcheAge) {
        this.MenarcheAge = MenarcheAge;
    }

    /**
     * Get 末次月经时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastTime 末次月经时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastTime() {
        return this.LastTime;
    }

    /**
     * Set 末次月经时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastTime 末次月经时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastTime(String LastTime) {
        this.LastTime = LastTime;
    }

    /**
     * Get 经量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Flow 经量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFlow() {
        return this.Flow;
    }

    /**
     * Set 经量
注意：此字段可能返回 null，表示取不到有效值。
     * @param Flow 经量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFlow(String Flow) {
        this.Flow = Flow;
    }

    /**
     * Get 月经周期
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Cycles 月经周期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCycles() {
        return this.Cycles;
    }

    /**
     * Set 月经周期
注意：此字段可能返回 null，表示取不到有效值。
     * @param Cycles 月经周期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCycles(String Cycles) {
        this.Cycles = Cycles;
    }

    /**
     * Get 行经天数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Duration 行经天数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDuration() {
        return this.Duration;
    }

    /**
     * Set 行经天数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Duration 行经天数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDuration(String Duration) {
        this.Duration = Duration;
    }

    public MenstrualHistory() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MenstrualHistory(MenstrualHistory source) {
        if (source.IsOrNot != null) {
            this.IsOrNot = new String(source.IsOrNot);
        }
        if (source.MenarcheAge != null) {
            this.MenarcheAge = new String(source.MenarcheAge);
        }
        if (source.LastTime != null) {
            this.LastTime = new String(source.LastTime);
        }
        if (source.Flow != null) {
            this.Flow = new String(source.Flow);
        }
        if (source.Cycles != null) {
            this.Cycles = new String(source.Cycles);
        }
        if (source.Duration != null) {
            this.Duration = new String(source.Duration);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsOrNot", this.IsOrNot);
        this.setParamSimple(map, prefix + "MenarcheAge", this.MenarcheAge);
        this.setParamSimple(map, prefix + "LastTime", this.LastTime);
        this.setParamSimple(map, prefix + "Flow", this.Flow);
        this.setParamSimple(map, prefix + "Cycles", this.Cycles);
        this.setParamSimple(map, prefix + "Duration", this.Duration);

    }
}

