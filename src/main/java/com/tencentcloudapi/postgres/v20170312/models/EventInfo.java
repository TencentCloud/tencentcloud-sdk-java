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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EventInfo extends AbstractModel{

    /**
    * 参数名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParamName")
    @Expose
    private String ParamName;

    /**
    * 原参数值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OldValue")
    @Expose
    private String OldValue;

    /**
    * 本次修改期望参数值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NewValue")
    @Expose
    private String NewValue;

    /**
    * 后台参数修改开始时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * 后台参数生效开始时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EffectiveTime")
    @Expose
    private String EffectiveTime;

    /**
    * 修改状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * 操作者（一般为用户sub UIN）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * 时间日志。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EventLog")
    @Expose
    private String EventLog;

    /**
     * Get 参数名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParamName 参数名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getParamName() {
        return this.ParamName;
    }

    /**
     * Set 参数名
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParamName 参数名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParamName(String ParamName) {
        this.ParamName = ParamName;
    }

    /**
     * Get 原参数值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OldValue 原参数值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOldValue() {
        return this.OldValue;
    }

    /**
     * Set 原参数值
注意：此字段可能返回 null，表示取不到有效值。
     * @param OldValue 原参数值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOldValue(String OldValue) {
        this.OldValue = OldValue;
    }

    /**
     * Get 本次修改期望参数值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NewValue 本次修改期望参数值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNewValue() {
        return this.NewValue;
    }

    /**
     * Set 本次修改期望参数值
注意：此字段可能返回 null，表示取不到有效值。
     * @param NewValue 本次修改期望参数值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNewValue(String NewValue) {
        this.NewValue = NewValue;
    }

    /**
     * Get 后台参数修改开始时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModifyTime 后台参数修改开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 后台参数修改开始时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModifyTime 后台参数修改开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get 后台参数生效开始时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EffectiveTime 后台参数生效开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEffectiveTime() {
        return this.EffectiveTime;
    }

    /**
     * Set 后台参数生效开始时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param EffectiveTime 后台参数生效开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEffectiveTime(String EffectiveTime) {
        this.EffectiveTime = EffectiveTime;
    }

    /**
     * Get 修改状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return State 修改状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set 修改状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param State 修改状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get 操作者（一般为用户sub UIN）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Operator 操作者（一般为用户sub UIN）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set 操作者（一般为用户sub UIN）
注意：此字段可能返回 null，表示取不到有效值。
     * @param Operator 操作者（一般为用户sub UIN）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 时间日志。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EventLog 时间日志。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEventLog() {
        return this.EventLog;
    }

    /**
     * Set 时间日志。
注意：此字段可能返回 null，表示取不到有效值。
     * @param EventLog 时间日志。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEventLog(String EventLog) {
        this.EventLog = EventLog;
    }

    public EventInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EventInfo(EventInfo source) {
        if (source.ParamName != null) {
            this.ParamName = new String(source.ParamName);
        }
        if (source.OldValue != null) {
            this.OldValue = new String(source.OldValue);
        }
        if (source.NewValue != null) {
            this.NewValue = new String(source.NewValue);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.EffectiveTime != null) {
            this.EffectiveTime = new String(source.EffectiveTime);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
        if (source.EventLog != null) {
            this.EventLog = new String(source.EventLog);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ParamName", this.ParamName);
        this.setParamSimple(map, prefix + "OldValue", this.OldValue);
        this.setParamSimple(map, prefix + "NewValue", this.NewValue);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "EffectiveTime", this.EffectiveTime);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "EventLog", this.EventLog);

    }
}

