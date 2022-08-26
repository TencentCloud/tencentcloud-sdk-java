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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RuleChoicePropertiesItem extends AbstractModel{

    /**
    * 参数名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 参数值类型。
<li> CHOICE：参数值只能在 ChoicesValue 中选择； </li>
<li> TOGGLE：参数值为开关类型，可在 ChoicesValue 中选择；</li>
<li> CUSTOM_NUM：参数值用户自定义，整型类型；</li>
<li> CUSTOM_STRING：参数值用户自定义，字符串类型。</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 参数值的可选值。
注意：若参数值为用户自定义则该数组为空数组。
    */
    @SerializedName("ChoicesValue")
    @Expose
    private String [] ChoicesValue;

    /**
    * 数值参数的最小值，非数值参数或 Min 和 Max 值都为 0 则此项无意义。
    */
    @SerializedName("Min")
    @Expose
    private Long Min;

    /**
    * 数值参数的最大值，非数值参数或 Min 和 Max 值都为 0 则此项无意义。
    */
    @SerializedName("Max")
    @Expose
    private Long Max;

    /**
    * 参数值是否支持多选或者填写多个。
    */
    @SerializedName("IsMultiple")
    @Expose
    private Boolean IsMultiple;

    /**
    * 是否允许为空。
    */
    @SerializedName("IsAllowEmpty")
    @Expose
    private Boolean IsAllowEmpty;

    /**
    * 特殊参数。
<li> 为 NULL：RuleAction 选择 NormalAction；</li>
<li> 成员参数 Id 为 Action：RuleAction 选择 RewirteAction；</li>
<li> 成员参数 Id 为 StatusCode：RuleAction 选择 CodeAction。</li>
    */
    @SerializedName("ExtraParameter")
    @Expose
    private RuleExtraParameter ExtraParameter;

    /**
     * Get 参数名称。 
     * @return Name 参数名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 参数名称。
     * @param Name 参数名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 参数值类型。
<li> CHOICE：参数值只能在 ChoicesValue 中选择； </li>
<li> TOGGLE：参数值为开关类型，可在 ChoicesValue 中选择；</li>
<li> CUSTOM_NUM：参数值用户自定义，整型类型；</li>
<li> CUSTOM_STRING：参数值用户自定义，字符串类型。</li> 
     * @return Type 参数值类型。
<li> CHOICE：参数值只能在 ChoicesValue 中选择； </li>
<li> TOGGLE：参数值为开关类型，可在 ChoicesValue 中选择；</li>
<li> CUSTOM_NUM：参数值用户自定义，整型类型；</li>
<li> CUSTOM_STRING：参数值用户自定义，字符串类型。</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 参数值类型。
<li> CHOICE：参数值只能在 ChoicesValue 中选择； </li>
<li> TOGGLE：参数值为开关类型，可在 ChoicesValue 中选择；</li>
<li> CUSTOM_NUM：参数值用户自定义，整型类型；</li>
<li> CUSTOM_STRING：参数值用户自定义，字符串类型。</li>
     * @param Type 参数值类型。
<li> CHOICE：参数值只能在 ChoicesValue 中选择； </li>
<li> TOGGLE：参数值为开关类型，可在 ChoicesValue 中选择；</li>
<li> CUSTOM_NUM：参数值用户自定义，整型类型；</li>
<li> CUSTOM_STRING：参数值用户自定义，字符串类型。</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 参数值的可选值。
注意：若参数值为用户自定义则该数组为空数组。 
     * @return ChoicesValue 参数值的可选值。
注意：若参数值为用户自定义则该数组为空数组。
     */
    public String [] getChoicesValue() {
        return this.ChoicesValue;
    }

    /**
     * Set 参数值的可选值。
注意：若参数值为用户自定义则该数组为空数组。
     * @param ChoicesValue 参数值的可选值。
注意：若参数值为用户自定义则该数组为空数组。
     */
    public void setChoicesValue(String [] ChoicesValue) {
        this.ChoicesValue = ChoicesValue;
    }

    /**
     * Get 数值参数的最小值，非数值参数或 Min 和 Max 值都为 0 则此项无意义。 
     * @return Min 数值参数的最小值，非数值参数或 Min 和 Max 值都为 0 则此项无意义。
     */
    public Long getMin() {
        return this.Min;
    }

    /**
     * Set 数值参数的最小值，非数值参数或 Min 和 Max 值都为 0 则此项无意义。
     * @param Min 数值参数的最小值，非数值参数或 Min 和 Max 值都为 0 则此项无意义。
     */
    public void setMin(Long Min) {
        this.Min = Min;
    }

    /**
     * Get 数值参数的最大值，非数值参数或 Min 和 Max 值都为 0 则此项无意义。 
     * @return Max 数值参数的最大值，非数值参数或 Min 和 Max 值都为 0 则此项无意义。
     */
    public Long getMax() {
        return this.Max;
    }

    /**
     * Set 数值参数的最大值，非数值参数或 Min 和 Max 值都为 0 则此项无意义。
     * @param Max 数值参数的最大值，非数值参数或 Min 和 Max 值都为 0 则此项无意义。
     */
    public void setMax(Long Max) {
        this.Max = Max;
    }

    /**
     * Get 参数值是否支持多选或者填写多个。 
     * @return IsMultiple 参数值是否支持多选或者填写多个。
     */
    public Boolean getIsMultiple() {
        return this.IsMultiple;
    }

    /**
     * Set 参数值是否支持多选或者填写多个。
     * @param IsMultiple 参数值是否支持多选或者填写多个。
     */
    public void setIsMultiple(Boolean IsMultiple) {
        this.IsMultiple = IsMultiple;
    }

    /**
     * Get 是否允许为空。 
     * @return IsAllowEmpty 是否允许为空。
     */
    public Boolean getIsAllowEmpty() {
        return this.IsAllowEmpty;
    }

    /**
     * Set 是否允许为空。
     * @param IsAllowEmpty 是否允许为空。
     */
    public void setIsAllowEmpty(Boolean IsAllowEmpty) {
        this.IsAllowEmpty = IsAllowEmpty;
    }

    /**
     * Get 特殊参数。
<li> 为 NULL：RuleAction 选择 NormalAction；</li>
<li> 成员参数 Id 为 Action：RuleAction 选择 RewirteAction；</li>
<li> 成员参数 Id 为 StatusCode：RuleAction 选择 CodeAction。</li> 
     * @return ExtraParameter 特殊参数。
<li> 为 NULL：RuleAction 选择 NormalAction；</li>
<li> 成员参数 Id 为 Action：RuleAction 选择 RewirteAction；</li>
<li> 成员参数 Id 为 StatusCode：RuleAction 选择 CodeAction。</li>
     */
    public RuleExtraParameter getExtraParameter() {
        return this.ExtraParameter;
    }

    /**
     * Set 特殊参数。
<li> 为 NULL：RuleAction 选择 NormalAction；</li>
<li> 成员参数 Id 为 Action：RuleAction 选择 RewirteAction；</li>
<li> 成员参数 Id 为 StatusCode：RuleAction 选择 CodeAction。</li>
     * @param ExtraParameter 特殊参数。
<li> 为 NULL：RuleAction 选择 NormalAction；</li>
<li> 成员参数 Id 为 Action：RuleAction 选择 RewirteAction；</li>
<li> 成员参数 Id 为 StatusCode：RuleAction 选择 CodeAction。</li>
     */
    public void setExtraParameter(RuleExtraParameter ExtraParameter) {
        this.ExtraParameter = ExtraParameter;
    }

    public RuleChoicePropertiesItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleChoicePropertiesItem(RuleChoicePropertiesItem source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.ChoicesValue != null) {
            this.ChoicesValue = new String[source.ChoicesValue.length];
            for (int i = 0; i < source.ChoicesValue.length; i++) {
                this.ChoicesValue[i] = new String(source.ChoicesValue[i]);
            }
        }
        if (source.Min != null) {
            this.Min = new Long(source.Min);
        }
        if (source.Max != null) {
            this.Max = new Long(source.Max);
        }
        if (source.IsMultiple != null) {
            this.IsMultiple = new Boolean(source.IsMultiple);
        }
        if (source.IsAllowEmpty != null) {
            this.IsAllowEmpty = new Boolean(source.IsAllowEmpty);
        }
        if (source.ExtraParameter != null) {
            this.ExtraParameter = new RuleExtraParameter(source.ExtraParameter);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArraySimple(map, prefix + "ChoicesValue.", this.ChoicesValue);
        this.setParamSimple(map, prefix + "Min", this.Min);
        this.setParamSimple(map, prefix + "Max", this.Max);
        this.setParamSimple(map, prefix + "IsMultiple", this.IsMultiple);
        this.setParamSimple(map, prefix + "IsAllowEmpty", this.IsAllowEmpty);
        this.setParamObj(map, prefix + "ExtraParameter.", this.ExtraParameter);

    }
}

