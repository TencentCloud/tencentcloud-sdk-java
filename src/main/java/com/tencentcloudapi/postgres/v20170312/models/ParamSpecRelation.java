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

public class ParamSpecRelation extends AbstractModel{

    /**
    * 参数名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 参数信息所属规格
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Memory")
    @Expose
    private String Memory;

    /**
    * 参数在该规格下的默认值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * 参数值单位。参数没有单位时，该字段返回空
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Unit")
    @Expose
    private String Unit;

    /**
    * 数值类型（integer、real）参数，取值上界
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Max")
    @Expose
    private Float Max;

    /**
    * 数值类型（integer、real）参数，取值下界
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Min")
    @Expose
    private Float Min;

    /**
    * 枚举类型参数，取值范围
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnumValue")
    @Expose
    private String [] EnumValue;

    /**
     * Get 参数名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 参数名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 参数名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 参数名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 参数信息所属规格
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Memory 参数信息所属规格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMemory() {
        return this.Memory;
    }

    /**
     * Set 参数信息所属规格
注意：此字段可能返回 null，表示取不到有效值。
     * @param Memory 参数信息所属规格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMemory(String Memory) {
        this.Memory = Memory;
    }

    /**
     * Get 参数在该规格下的默认值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Value 参数在该规格下的默认值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 参数在该规格下的默认值
注意：此字段可能返回 null，表示取不到有效值。
     * @param Value 参数在该规格下的默认值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get 参数值单位。参数没有单位时，该字段返回空
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Unit 参数值单位。参数没有单位时，该字段返回空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUnit() {
        return this.Unit;
    }

    /**
     * Set 参数值单位。参数没有单位时，该字段返回空
注意：此字段可能返回 null，表示取不到有效值。
     * @param Unit 参数值单位。参数没有单位时，该字段返回空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUnit(String Unit) {
        this.Unit = Unit;
    }

    /**
     * Get 数值类型（integer、real）参数，取值上界
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Max 数值类型（integer、real）参数，取值上界
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getMax() {
        return this.Max;
    }

    /**
     * Set 数值类型（integer、real）参数，取值上界
注意：此字段可能返回 null，表示取不到有效值。
     * @param Max 数值类型（integer、real）参数，取值上界
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMax(Float Max) {
        this.Max = Max;
    }

    /**
     * Get 数值类型（integer、real）参数，取值下界
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Min 数值类型（integer、real）参数，取值下界
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getMin() {
        return this.Min;
    }

    /**
     * Set 数值类型（integer、real）参数，取值下界
注意：此字段可能返回 null，表示取不到有效值。
     * @param Min 数值类型（integer、real）参数，取值下界
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMin(Float Min) {
        this.Min = Min;
    }

    /**
     * Get 枚举类型参数，取值范围
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnumValue 枚举类型参数，取值范围
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getEnumValue() {
        return this.EnumValue;
    }

    /**
     * Set 枚举类型参数，取值范围
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnumValue 枚举类型参数，取值范围
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnumValue(String [] EnumValue) {
        this.EnumValue = EnumValue;
    }

    public ParamSpecRelation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ParamSpecRelation(ParamSpecRelation source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Memory != null) {
            this.Memory = new String(source.Memory);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.Unit != null) {
            this.Unit = new String(source.Unit);
        }
        if (source.Max != null) {
            this.Max = new Float(source.Max);
        }
        if (source.Min != null) {
            this.Min = new Float(source.Min);
        }
        if (source.EnumValue != null) {
            this.EnumValue = new String[source.EnumValue.length];
            for (int i = 0; i < source.EnumValue.length; i++) {
                this.EnumValue[i] = new String(source.EnumValue[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "Unit", this.Unit);
        this.setParamSimple(map, prefix + "Max", this.Max);
        this.setParamSimple(map, prefix + "Min", this.Min);
        this.setParamArraySimple(map, prefix + "EnumValue.", this.EnumValue);

    }
}

