/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RuleEngineCustomActionParameterSchema extends AbstractModel {

    /**
    * <p>参数字段名称。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>参数字段类型，取值有：<li>Boolean：布尔；</li><li>Integer：整型；</li><li>Float：浮点型；</li><li>String：字符串；</li><li>ArrayOfInteger：整型数组；</li><li>ArrayOfFloat：浮点型数组；</li><li>ArrayOfString：字符串数组。</li></p>
    */
    @SerializedName("ValueType")
    @Expose
    private String ValueType;

    /**
    * <p>参数字段描述。</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>参数字段默认值。</p>
    */
    @SerializedName("Default")
    @Expose
    private String Default;

    /**
    * <p>参数字段单位。</p>
    */
    @SerializedName("Unit")
    @Expose
    private String Unit;

    /**
    * <p>参数字段是否必填。</p><p>默认值：false</p><p>若填充，则适用于所有参数字段类型校验；若不填充则不校验。</p>
    */
    @SerializedName("Required")
    @Expose
    private Boolean Required;

    /**
    * <p>参数字段最小值。</p><p>若填充，适用于整数、浮点数、整数数组、浮点数数组类型参数的数值校验；若不填充则不校验。</p>
    */
    @SerializedName("MinValue")
    @Expose
    private Float MinValue;

    /**
    * <p>参数字段最大值。</p><p>若填充，适用于整数、浮点数、整数数组、浮点数数组类型参数的数值校验；若不填充则不校验。</p>
    */
    @SerializedName("MaxValue")
    @Expose
    private Float MaxValue;

    /**
    * <p>参数字段最小长度。</p><p>若填充，适用于字符串、字符串数组类型参数的数值校验；若不填充则不校验。</p>
    */
    @SerializedName("MinLength")
    @Expose
    private Long MinLength;

    /**
    * <p>参数字段最大长度。</p><p>若填充，适用于字符串、字符串数组类型参数的数值校验；若不填充则不校验。</p>
    */
    @SerializedName("MaxLength")
    @Expose
    private Long MaxLength;

    /**
    * <p>参数字段最小项数。</p><p>若填充，适用于各类数组类型参数的数值校验；若不填充则不校验。</p>
    */
    @SerializedName("MinItems")
    @Expose
    private Long MinItems;

    /**
    * <p>参数字段最大项数。</p><p>若填充，适用于各类数组类型参数的数值校验；若不填充则不校验。</p>
    */
    @SerializedName("MaxItems")
    @Expose
    private Long MaxItems;

    /**
    * <p>参数字段项是否唯一。</p><p>默认值：false</p><p>若填充，适用于各类数组类型参数的数值校验；若不填充则不校验。</p>
    */
    @SerializedName("UniqueItems")
    @Expose
    private Boolean UniqueItems;

    /**
    * <p>参数字段允许的格式。</p><p>若填充，需要校验字符串或者字符串数组内容合适；若不填充则不校验。</p>
    */
    @SerializedName("AllowedPattern")
    @Expose
    private String AllowedPattern;

    /**
    * <p>参数字段允许的取值，若为空则不校验。</p><p>若本参数填充，则说明对应参数为枚举类型，仅允许填充本参数数组中的值；若不填充则不校验。</p>
    */
    @SerializedName("AllowedValues")
    @Expose
    private String [] AllowedValues;

    /**
    * <p>参数字段最小步长。若填充，适用于浮点型和浮点型数组类型参数的数值校验；若不填充则不校验。</p>
    */
    @SerializedName("MultipleOf")
    @Expose
    private String MultipleOf;

    /**
     * Get <p>参数字段名称。</p> 
     * @return Name <p>参数字段名称。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>参数字段名称。</p>
     * @param Name <p>参数字段名称。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>参数字段类型，取值有：<li>Boolean：布尔；</li><li>Integer：整型；</li><li>Float：浮点型；</li><li>String：字符串；</li><li>ArrayOfInteger：整型数组；</li><li>ArrayOfFloat：浮点型数组；</li><li>ArrayOfString：字符串数组。</li></p> 
     * @return ValueType <p>参数字段类型，取值有：<li>Boolean：布尔；</li><li>Integer：整型；</li><li>Float：浮点型；</li><li>String：字符串；</li><li>ArrayOfInteger：整型数组；</li><li>ArrayOfFloat：浮点型数组；</li><li>ArrayOfString：字符串数组。</li></p>
     */
    public String getValueType() {
        return this.ValueType;
    }

    /**
     * Set <p>参数字段类型，取值有：<li>Boolean：布尔；</li><li>Integer：整型；</li><li>Float：浮点型；</li><li>String：字符串；</li><li>ArrayOfInteger：整型数组；</li><li>ArrayOfFloat：浮点型数组；</li><li>ArrayOfString：字符串数组。</li></p>
     * @param ValueType <p>参数字段类型，取值有：<li>Boolean：布尔；</li><li>Integer：整型；</li><li>Float：浮点型；</li><li>String：字符串；</li><li>ArrayOfInteger：整型数组；</li><li>ArrayOfFloat：浮点型数组；</li><li>ArrayOfString：字符串数组。</li></p>
     */
    public void setValueType(String ValueType) {
        this.ValueType = ValueType;
    }

    /**
     * Get <p>参数字段描述。</p> 
     * @return Description <p>参数字段描述。</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>参数字段描述。</p>
     * @param Description <p>参数字段描述。</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>参数字段默认值。</p> 
     * @return Default <p>参数字段默认值。</p>
     */
    public String getDefault() {
        return this.Default;
    }

    /**
     * Set <p>参数字段默认值。</p>
     * @param Default <p>参数字段默认值。</p>
     */
    public void setDefault(String Default) {
        this.Default = Default;
    }

    /**
     * Get <p>参数字段单位。</p> 
     * @return Unit <p>参数字段单位。</p>
     */
    public String getUnit() {
        return this.Unit;
    }

    /**
     * Set <p>参数字段单位。</p>
     * @param Unit <p>参数字段单位。</p>
     */
    public void setUnit(String Unit) {
        this.Unit = Unit;
    }

    /**
     * Get <p>参数字段是否必填。</p><p>默认值：false</p><p>若填充，则适用于所有参数字段类型校验；若不填充则不校验。</p> 
     * @return Required <p>参数字段是否必填。</p><p>默认值：false</p><p>若填充，则适用于所有参数字段类型校验；若不填充则不校验。</p>
     */
    public Boolean getRequired() {
        return this.Required;
    }

    /**
     * Set <p>参数字段是否必填。</p><p>默认值：false</p><p>若填充，则适用于所有参数字段类型校验；若不填充则不校验。</p>
     * @param Required <p>参数字段是否必填。</p><p>默认值：false</p><p>若填充，则适用于所有参数字段类型校验；若不填充则不校验。</p>
     */
    public void setRequired(Boolean Required) {
        this.Required = Required;
    }

    /**
     * Get <p>参数字段最小值。</p><p>若填充，适用于整数、浮点数、整数数组、浮点数数组类型参数的数值校验；若不填充则不校验。</p> 
     * @return MinValue <p>参数字段最小值。</p><p>若填充，适用于整数、浮点数、整数数组、浮点数数组类型参数的数值校验；若不填充则不校验。</p>
     */
    public Float getMinValue() {
        return this.MinValue;
    }

    /**
     * Set <p>参数字段最小值。</p><p>若填充，适用于整数、浮点数、整数数组、浮点数数组类型参数的数值校验；若不填充则不校验。</p>
     * @param MinValue <p>参数字段最小值。</p><p>若填充，适用于整数、浮点数、整数数组、浮点数数组类型参数的数值校验；若不填充则不校验。</p>
     */
    public void setMinValue(Float MinValue) {
        this.MinValue = MinValue;
    }

    /**
     * Get <p>参数字段最大值。</p><p>若填充，适用于整数、浮点数、整数数组、浮点数数组类型参数的数值校验；若不填充则不校验。</p> 
     * @return MaxValue <p>参数字段最大值。</p><p>若填充，适用于整数、浮点数、整数数组、浮点数数组类型参数的数值校验；若不填充则不校验。</p>
     */
    public Float getMaxValue() {
        return this.MaxValue;
    }

    /**
     * Set <p>参数字段最大值。</p><p>若填充，适用于整数、浮点数、整数数组、浮点数数组类型参数的数值校验；若不填充则不校验。</p>
     * @param MaxValue <p>参数字段最大值。</p><p>若填充，适用于整数、浮点数、整数数组、浮点数数组类型参数的数值校验；若不填充则不校验。</p>
     */
    public void setMaxValue(Float MaxValue) {
        this.MaxValue = MaxValue;
    }

    /**
     * Get <p>参数字段最小长度。</p><p>若填充，适用于字符串、字符串数组类型参数的数值校验；若不填充则不校验。</p> 
     * @return MinLength <p>参数字段最小长度。</p><p>若填充，适用于字符串、字符串数组类型参数的数值校验；若不填充则不校验。</p>
     */
    public Long getMinLength() {
        return this.MinLength;
    }

    /**
     * Set <p>参数字段最小长度。</p><p>若填充，适用于字符串、字符串数组类型参数的数值校验；若不填充则不校验。</p>
     * @param MinLength <p>参数字段最小长度。</p><p>若填充，适用于字符串、字符串数组类型参数的数值校验；若不填充则不校验。</p>
     */
    public void setMinLength(Long MinLength) {
        this.MinLength = MinLength;
    }

    /**
     * Get <p>参数字段最大长度。</p><p>若填充，适用于字符串、字符串数组类型参数的数值校验；若不填充则不校验。</p> 
     * @return MaxLength <p>参数字段最大长度。</p><p>若填充，适用于字符串、字符串数组类型参数的数值校验；若不填充则不校验。</p>
     */
    public Long getMaxLength() {
        return this.MaxLength;
    }

    /**
     * Set <p>参数字段最大长度。</p><p>若填充，适用于字符串、字符串数组类型参数的数值校验；若不填充则不校验。</p>
     * @param MaxLength <p>参数字段最大长度。</p><p>若填充，适用于字符串、字符串数组类型参数的数值校验；若不填充则不校验。</p>
     */
    public void setMaxLength(Long MaxLength) {
        this.MaxLength = MaxLength;
    }

    /**
     * Get <p>参数字段最小项数。</p><p>若填充，适用于各类数组类型参数的数值校验；若不填充则不校验。</p> 
     * @return MinItems <p>参数字段最小项数。</p><p>若填充，适用于各类数组类型参数的数值校验；若不填充则不校验。</p>
     */
    public Long getMinItems() {
        return this.MinItems;
    }

    /**
     * Set <p>参数字段最小项数。</p><p>若填充，适用于各类数组类型参数的数值校验；若不填充则不校验。</p>
     * @param MinItems <p>参数字段最小项数。</p><p>若填充，适用于各类数组类型参数的数值校验；若不填充则不校验。</p>
     */
    public void setMinItems(Long MinItems) {
        this.MinItems = MinItems;
    }

    /**
     * Get <p>参数字段最大项数。</p><p>若填充，适用于各类数组类型参数的数值校验；若不填充则不校验。</p> 
     * @return MaxItems <p>参数字段最大项数。</p><p>若填充，适用于各类数组类型参数的数值校验；若不填充则不校验。</p>
     */
    public Long getMaxItems() {
        return this.MaxItems;
    }

    /**
     * Set <p>参数字段最大项数。</p><p>若填充，适用于各类数组类型参数的数值校验；若不填充则不校验。</p>
     * @param MaxItems <p>参数字段最大项数。</p><p>若填充，适用于各类数组类型参数的数值校验；若不填充则不校验。</p>
     */
    public void setMaxItems(Long MaxItems) {
        this.MaxItems = MaxItems;
    }

    /**
     * Get <p>参数字段项是否唯一。</p><p>默认值：false</p><p>若填充，适用于各类数组类型参数的数值校验；若不填充则不校验。</p> 
     * @return UniqueItems <p>参数字段项是否唯一。</p><p>默认值：false</p><p>若填充，适用于各类数组类型参数的数值校验；若不填充则不校验。</p>
     */
    public Boolean getUniqueItems() {
        return this.UniqueItems;
    }

    /**
     * Set <p>参数字段项是否唯一。</p><p>默认值：false</p><p>若填充，适用于各类数组类型参数的数值校验；若不填充则不校验。</p>
     * @param UniqueItems <p>参数字段项是否唯一。</p><p>默认值：false</p><p>若填充，适用于各类数组类型参数的数值校验；若不填充则不校验。</p>
     */
    public void setUniqueItems(Boolean UniqueItems) {
        this.UniqueItems = UniqueItems;
    }

    /**
     * Get <p>参数字段允许的格式。</p><p>若填充，需要校验字符串或者字符串数组内容合适；若不填充则不校验。</p> 
     * @return AllowedPattern <p>参数字段允许的格式。</p><p>若填充，需要校验字符串或者字符串数组内容合适；若不填充则不校验。</p>
     */
    public String getAllowedPattern() {
        return this.AllowedPattern;
    }

    /**
     * Set <p>参数字段允许的格式。</p><p>若填充，需要校验字符串或者字符串数组内容合适；若不填充则不校验。</p>
     * @param AllowedPattern <p>参数字段允许的格式。</p><p>若填充，需要校验字符串或者字符串数组内容合适；若不填充则不校验。</p>
     */
    public void setAllowedPattern(String AllowedPattern) {
        this.AllowedPattern = AllowedPattern;
    }

    /**
     * Get <p>参数字段允许的取值，若为空则不校验。</p><p>若本参数填充，则说明对应参数为枚举类型，仅允许填充本参数数组中的值；若不填充则不校验。</p> 
     * @return AllowedValues <p>参数字段允许的取值，若为空则不校验。</p><p>若本参数填充，则说明对应参数为枚举类型，仅允许填充本参数数组中的值；若不填充则不校验。</p>
     */
    public String [] getAllowedValues() {
        return this.AllowedValues;
    }

    /**
     * Set <p>参数字段允许的取值，若为空则不校验。</p><p>若本参数填充，则说明对应参数为枚举类型，仅允许填充本参数数组中的值；若不填充则不校验。</p>
     * @param AllowedValues <p>参数字段允许的取值，若为空则不校验。</p><p>若本参数填充，则说明对应参数为枚举类型，仅允许填充本参数数组中的值；若不填充则不校验。</p>
     */
    public void setAllowedValues(String [] AllowedValues) {
        this.AllowedValues = AllowedValues;
    }

    /**
     * Get <p>参数字段最小步长。若填充，适用于浮点型和浮点型数组类型参数的数值校验；若不填充则不校验。</p> 
     * @return MultipleOf <p>参数字段最小步长。若填充，适用于浮点型和浮点型数组类型参数的数值校验；若不填充则不校验。</p>
     */
    public String getMultipleOf() {
        return this.MultipleOf;
    }

    /**
     * Set <p>参数字段最小步长。若填充，适用于浮点型和浮点型数组类型参数的数值校验；若不填充则不校验。</p>
     * @param MultipleOf <p>参数字段最小步长。若填充，适用于浮点型和浮点型数组类型参数的数值校验；若不填充则不校验。</p>
     */
    public void setMultipleOf(String MultipleOf) {
        this.MultipleOf = MultipleOf;
    }

    public RuleEngineCustomActionParameterSchema() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleEngineCustomActionParameterSchema(RuleEngineCustomActionParameterSchema source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ValueType != null) {
            this.ValueType = new String(source.ValueType);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Default != null) {
            this.Default = new String(source.Default);
        }
        if (source.Unit != null) {
            this.Unit = new String(source.Unit);
        }
        if (source.Required != null) {
            this.Required = new Boolean(source.Required);
        }
        if (source.MinValue != null) {
            this.MinValue = new Float(source.MinValue);
        }
        if (source.MaxValue != null) {
            this.MaxValue = new Float(source.MaxValue);
        }
        if (source.MinLength != null) {
            this.MinLength = new Long(source.MinLength);
        }
        if (source.MaxLength != null) {
            this.MaxLength = new Long(source.MaxLength);
        }
        if (source.MinItems != null) {
            this.MinItems = new Long(source.MinItems);
        }
        if (source.MaxItems != null) {
            this.MaxItems = new Long(source.MaxItems);
        }
        if (source.UniqueItems != null) {
            this.UniqueItems = new Boolean(source.UniqueItems);
        }
        if (source.AllowedPattern != null) {
            this.AllowedPattern = new String(source.AllowedPattern);
        }
        if (source.AllowedValues != null) {
            this.AllowedValues = new String[source.AllowedValues.length];
            for (int i = 0; i < source.AllowedValues.length; i++) {
                this.AllowedValues[i] = new String(source.AllowedValues[i]);
            }
        }
        if (source.MultipleOf != null) {
            this.MultipleOf = new String(source.MultipleOf);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ValueType", this.ValueType);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Default", this.Default);
        this.setParamSimple(map, prefix + "Unit", this.Unit);
        this.setParamSimple(map, prefix + "Required", this.Required);
        this.setParamSimple(map, prefix + "MinValue", this.MinValue);
        this.setParamSimple(map, prefix + "MaxValue", this.MaxValue);
        this.setParamSimple(map, prefix + "MinLength", this.MinLength);
        this.setParamSimple(map, prefix + "MaxLength", this.MaxLength);
        this.setParamSimple(map, prefix + "MinItems", this.MinItems);
        this.setParamSimple(map, prefix + "MaxItems", this.MaxItems);
        this.setParamSimple(map, prefix + "UniqueItems", this.UniqueItems);
        this.setParamSimple(map, prefix + "AllowedPattern", this.AllowedPattern);
        this.setParamArraySimple(map, prefix + "AllowedValues.", this.AllowedValues);
        this.setParamSimple(map, prefix + "MultipleOf", this.MultipleOf);

    }
}

