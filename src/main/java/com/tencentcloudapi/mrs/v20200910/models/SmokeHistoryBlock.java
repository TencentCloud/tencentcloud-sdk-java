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

public class SmokeHistoryBlock extends AbstractModel{

    /**
    * 名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 原文
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Src")
    @Expose
    private String Src;

    /**
    * 时间单位
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
    * 时间归一化
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TimeNorm")
    @Expose
    private String TimeNorm;

    /**
    * 吸烟量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Amount")
    @Expose
    private String Amount;

    /**
    * 戒烟状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QuitState")
    @Expose
    private Boolean QuitState;

    /**
    * 是否吸烟
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("State")
    @Expose
    private Boolean State;

    /**
    * 对外输出值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
     * Get 名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 原文
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Src 原文
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSrc() {
        return this.Src;
    }

    /**
     * Set 原文
注意：此字段可能返回 null，表示取不到有效值。
     * @param Src 原文
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSrc(String Src) {
        this.Src = Src;
    }

    /**
     * Get 时间单位
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TimeUnit 时间单位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * Set 时间单位
注意：此字段可能返回 null，表示取不到有效值。
     * @param TimeUnit 时间单位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    /**
     * Get 时间归一化
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TimeNorm 时间归一化
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTimeNorm() {
        return this.TimeNorm;
    }

    /**
     * Set 时间归一化
注意：此字段可能返回 null，表示取不到有效值。
     * @param TimeNorm 时间归一化
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimeNorm(String TimeNorm) {
        this.TimeNorm = TimeNorm;
    }

    /**
     * Get 吸烟量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Amount 吸烟量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAmount() {
        return this.Amount;
    }

    /**
     * Set 吸烟量
注意：此字段可能返回 null，表示取不到有效值。
     * @param Amount 吸烟量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAmount(String Amount) {
        this.Amount = Amount;
    }

    /**
     * Get 戒烟状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QuitState 戒烟状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getQuitState() {
        return this.QuitState;
    }

    /**
     * Set 戒烟状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param QuitState 戒烟状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQuitState(Boolean QuitState) {
        this.QuitState = QuitState;
    }

    /**
     * Get 是否吸烟
注意：此字段可能返回 null，表示取不到有效值。 
     * @return State 是否吸烟
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getState() {
        return this.State;
    }

    /**
     * Set 是否吸烟
注意：此字段可能返回 null，表示取不到有效值。
     * @param State 是否吸烟
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setState(Boolean State) {
        this.State = State;
    }

    /**
     * Get 对外输出值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Value 对外输出值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 对外输出值
注意：此字段可能返回 null，表示取不到有效值。
     * @param Value 对外输出值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    public SmokeHistoryBlock() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SmokeHistoryBlock(SmokeHistoryBlock source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Src != null) {
            this.Src = new String(source.Src);
        }
        if (source.TimeUnit != null) {
            this.TimeUnit = new String(source.TimeUnit);
        }
        if (source.TimeNorm != null) {
            this.TimeNorm = new String(source.TimeNorm);
        }
        if (source.Amount != null) {
            this.Amount = new String(source.Amount);
        }
        if (source.QuitState != null) {
            this.QuitState = new Boolean(source.QuitState);
        }
        if (source.State != null) {
            this.State = new Boolean(source.State);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Src", this.Src);
        this.setParamSimple(map, prefix + "TimeUnit", this.TimeUnit);
        this.setParamSimple(map, prefix + "TimeNorm", this.TimeNorm);
        this.setParamSimple(map, prefix + "Amount", this.Amount);
        this.setParamSimple(map, prefix + "QuitState", this.QuitState);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}

