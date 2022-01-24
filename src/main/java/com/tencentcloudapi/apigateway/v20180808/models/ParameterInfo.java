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
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ParameterInfo extends AbstractModel{

    /**
    * 名字
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 当前值
    */
    @SerializedName("Value")
    @Expose
    private Long Value;

    /**
    * 默认值
    */
    @SerializedName("Default")
    @Expose
    private Long Default;

    /**
    * 单位
    */
    @SerializedName("Unit")
    @Expose
    private String Unit;

    /**
    * 类型, integer|string
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 最小
    */
    @SerializedName("Minimum")
    @Expose
    private Long Minimum;

    /**
    * 最大
    */
    @SerializedName("Maximum")
    @Expose
    private Long Maximum;

    /**
    * 修改时间
    */
    @SerializedName("ModifedTime")
    @Expose
    private String ModifedTime;

    /**
    * 字符类型的值，当Type为string时才有意义
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ValueString")
    @Expose
    private String ValueString;

    /**
    * 字符类型的默认值，当Type为string时才有意义
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DefaultValueString")
    @Expose
    private String DefaultValueString;

    /**
    * 可调整范围
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Range")
    @Expose
    private String Range;

    /**
     * Get 名字 
     * @return Name 名字
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 名字
     * @param Name 名字
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 当前值 
     * @return Value 当前值
     */
    public Long getValue() {
        return this.Value;
    }

    /**
     * Set 当前值
     * @param Value 当前值
     */
    public void setValue(Long Value) {
        this.Value = Value;
    }

    /**
     * Get 默认值 
     * @return Default 默认值
     */
    public Long getDefault() {
        return this.Default;
    }

    /**
     * Set 默认值
     * @param Default 默认值
     */
    public void setDefault(Long Default) {
        this.Default = Default;
    }

    /**
     * Get 单位 
     * @return Unit 单位
     */
    public String getUnit() {
        return this.Unit;
    }

    /**
     * Set 单位
     * @param Unit 单位
     */
    public void setUnit(String Unit) {
        this.Unit = Unit;
    }

    /**
     * Get 类型, integer|string 
     * @return Type 类型, integer|string
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 类型, integer|string
     * @param Type 类型, integer|string
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 最小 
     * @return Minimum 最小
     */
    public Long getMinimum() {
        return this.Minimum;
    }

    /**
     * Set 最小
     * @param Minimum 最小
     */
    public void setMinimum(Long Minimum) {
        this.Minimum = Minimum;
    }

    /**
     * Get 最大 
     * @return Maximum 最大
     */
    public Long getMaximum() {
        return this.Maximum;
    }

    /**
     * Set 最大
     * @param Maximum 最大
     */
    public void setMaximum(Long Maximum) {
        this.Maximum = Maximum;
    }

    /**
     * Get 修改时间 
     * @return ModifedTime 修改时间
     */
    public String getModifedTime() {
        return this.ModifedTime;
    }

    /**
     * Set 修改时间
     * @param ModifedTime 修改时间
     */
    public void setModifedTime(String ModifedTime) {
        this.ModifedTime = ModifedTime;
    }

    /**
     * Get 字符类型的值，当Type为string时才有意义
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ValueString 字符类型的值，当Type为string时才有意义
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getValueString() {
        return this.ValueString;
    }

    /**
     * Set 字符类型的值，当Type为string时才有意义
注意：此字段可能返回 null，表示取不到有效值。
     * @param ValueString 字符类型的值，当Type为string时才有意义
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValueString(String ValueString) {
        this.ValueString = ValueString;
    }

    /**
     * Get 字符类型的默认值，当Type为string时才有意义
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DefaultValueString 字符类型的默认值，当Type为string时才有意义
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDefaultValueString() {
        return this.DefaultValueString;
    }

    /**
     * Set 字符类型的默认值，当Type为string时才有意义
注意：此字段可能返回 null，表示取不到有效值。
     * @param DefaultValueString 字符类型的默认值，当Type为string时才有意义
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDefaultValueString(String DefaultValueString) {
        this.DefaultValueString = DefaultValueString;
    }

    /**
     * Get 可调整范围
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Range 可调整范围
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRange() {
        return this.Range;
    }

    /**
     * Set 可调整范围
注意：此字段可能返回 null，表示取不到有效值。
     * @param Range 可调整范围
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRange(String Range) {
        this.Range = Range;
    }

    public ParameterInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ParameterInfo(ParameterInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Value != null) {
            this.Value = new Long(source.Value);
        }
        if (source.Default != null) {
            this.Default = new Long(source.Default);
        }
        if (source.Unit != null) {
            this.Unit = new String(source.Unit);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Minimum != null) {
            this.Minimum = new Long(source.Minimum);
        }
        if (source.Maximum != null) {
            this.Maximum = new Long(source.Maximum);
        }
        if (source.ModifedTime != null) {
            this.ModifedTime = new String(source.ModifedTime);
        }
        if (source.ValueString != null) {
            this.ValueString = new String(source.ValueString);
        }
        if (source.DefaultValueString != null) {
            this.DefaultValueString = new String(source.DefaultValueString);
        }
        if (source.Range != null) {
            this.Range = new String(source.Range);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "Default", this.Default);
        this.setParamSimple(map, prefix + "Unit", this.Unit);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Minimum", this.Minimum);
        this.setParamSimple(map, prefix + "Maximum", this.Maximum);
        this.setParamSimple(map, prefix + "ModifedTime", this.ModifedTime);
        this.setParamSimple(map, prefix + "ValueString", this.ValueString);
        this.setParamSimple(map, prefix + "DefaultValueString", this.DefaultValueString);
        this.setParamSimple(map, prefix + "Range", this.Range);

    }
}

