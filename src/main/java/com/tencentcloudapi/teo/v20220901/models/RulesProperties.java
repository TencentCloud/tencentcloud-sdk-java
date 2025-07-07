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

public class RulesProperties extends AbstractModel {

    /**
    * 值为参数名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 数值参数的最小值，非数值参数或 Min 和 Max 值都为 0 则此项无意义。
    */
    @SerializedName("Min")
    @Expose
    private Long Min;

    /**
    * 参数值的可选值。
注意：若参数值为用户自定义则该数组为空数组。
    */
    @SerializedName("ChoicesValue")
    @Expose
    private String [] ChoicesValue;

    /**
    * 参数值类型。
<li> CHOICE：参数值只能在 ChoicesValue 中选择； </li>
<li> TOGGLE：参数值为开关类型，可在 ChoicesValue 中选择；</li>
<li> OBJECT：参数值为对象类型，ChoiceProperties 为改对象类型关联的属性；</li>
<li> CUSTOM_NUM：参数值用户自定义，整型类型；</li>
<li> CUSTOM_STRING：参数值用户自定义，字符串类型。</li>注意：当参数类型为 OBJECT 类型时，请注意参考 [示例2 参数为 OBJECT 类型的创建](https://cloud.tencent.com/document/product/1552/80622#.E7.A4.BA.E4.BE.8B2-.E4.BF.AE.E6.94.B9.E6.BA.90.E7.AB.99.E4.B8.BAIP.E5.9F.9F.E5.90.8D)
    */
    @SerializedName("Type")
    @Expose
    private String Type;

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
    * 该参数对应的关联配置参数，属于调用接口的必填参数。
注意：如果可选参数无特殊新增参数则该数组为空数组。
    */
    @SerializedName("ChoiceProperties")
    @Expose
    private RuleChoicePropertiesItem [] ChoiceProperties;

    /**
    * <li> 为 NULL：无特殊参数，RuleAction 选择 NormalAction；</li>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExtraParameter")
    @Expose
    private RuleExtraParameter ExtraParameter;

    /**
     * Get 值为参数名称。 
     * @return Name 值为参数名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 值为参数名称。
     * @param Name 值为参数名称。
     */
    public void setName(String Name) {
        this.Name = Name;
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
     * Get 参数值类型。
<li> CHOICE：参数值只能在 ChoicesValue 中选择； </li>
<li> TOGGLE：参数值为开关类型，可在 ChoicesValue 中选择；</li>
<li> OBJECT：参数值为对象类型，ChoiceProperties 为改对象类型关联的属性；</li>
<li> CUSTOM_NUM：参数值用户自定义，整型类型；</li>
<li> CUSTOM_STRING：参数值用户自定义，字符串类型。</li>注意：当参数类型为 OBJECT 类型时，请注意参考 [示例2 参数为 OBJECT 类型的创建](https://cloud.tencent.com/document/product/1552/80622#.E7.A4.BA.E4.BE.8B2-.E4.BF.AE.E6.94.B9.E6.BA.90.E7.AB.99.E4.B8.BAIP.E5.9F.9F.E5.90.8D) 
     * @return Type 参数值类型。
<li> CHOICE：参数值只能在 ChoicesValue 中选择； </li>
<li> TOGGLE：参数值为开关类型，可在 ChoicesValue 中选择；</li>
<li> OBJECT：参数值为对象类型，ChoiceProperties 为改对象类型关联的属性；</li>
<li> CUSTOM_NUM：参数值用户自定义，整型类型；</li>
<li> CUSTOM_STRING：参数值用户自定义，字符串类型。</li>注意：当参数类型为 OBJECT 类型时，请注意参考 [示例2 参数为 OBJECT 类型的创建](https://cloud.tencent.com/document/product/1552/80622#.E7.A4.BA.E4.BE.8B2-.E4.BF.AE.E6.94.B9.E6.BA.90.E7.AB.99.E4.B8.BAIP.E5.9F.9F.E5.90.8D)
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 参数值类型。
<li> CHOICE：参数值只能在 ChoicesValue 中选择； </li>
<li> TOGGLE：参数值为开关类型，可在 ChoicesValue 中选择；</li>
<li> OBJECT：参数值为对象类型，ChoiceProperties 为改对象类型关联的属性；</li>
<li> CUSTOM_NUM：参数值用户自定义，整型类型；</li>
<li> CUSTOM_STRING：参数值用户自定义，字符串类型。</li>注意：当参数类型为 OBJECT 类型时，请注意参考 [示例2 参数为 OBJECT 类型的创建](https://cloud.tencent.com/document/product/1552/80622#.E7.A4.BA.E4.BE.8B2-.E4.BF.AE.E6.94.B9.E6.BA.90.E7.AB.99.E4.B8.BAIP.E5.9F.9F.E5.90.8D)
     * @param Type 参数值类型。
<li> CHOICE：参数值只能在 ChoicesValue 中选择； </li>
<li> TOGGLE：参数值为开关类型，可在 ChoicesValue 中选择；</li>
<li> OBJECT：参数值为对象类型，ChoiceProperties 为改对象类型关联的属性；</li>
<li> CUSTOM_NUM：参数值用户自定义，整型类型；</li>
<li> CUSTOM_STRING：参数值用户自定义，字符串类型。</li>注意：当参数类型为 OBJECT 类型时，请注意参考 [示例2 参数为 OBJECT 类型的创建](https://cloud.tencent.com/document/product/1552/80622#.E7.A4.BA.E4.BE.8B2-.E4.BF.AE.E6.94.B9.E6.BA.90.E7.AB.99.E4.B8.BAIP.E5.9F.9F.E5.90.8D)
     */
    public void setType(String Type) {
        this.Type = Type;
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
     * Get 该参数对应的关联配置参数，属于调用接口的必填参数。
注意：如果可选参数无特殊新增参数则该数组为空数组。 
     * @return ChoiceProperties 该参数对应的关联配置参数，属于调用接口的必填参数。
注意：如果可选参数无特殊新增参数则该数组为空数组。
     */
    public RuleChoicePropertiesItem [] getChoiceProperties() {
        return this.ChoiceProperties;
    }

    /**
     * Set 该参数对应的关联配置参数，属于调用接口的必填参数。
注意：如果可选参数无特殊新增参数则该数组为空数组。
     * @param ChoiceProperties 该参数对应的关联配置参数，属于调用接口的必填参数。
注意：如果可选参数无特殊新增参数则该数组为空数组。
     */
    public void setChoiceProperties(RuleChoicePropertiesItem [] ChoiceProperties) {
        this.ChoiceProperties = ChoiceProperties;
    }

    /**
     * Get <li> 为 NULL：无特殊参数，RuleAction 选择 NormalAction；</li>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExtraParameter <li> 为 NULL：无特殊参数，RuleAction 选择 NormalAction；</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RuleExtraParameter getExtraParameter() {
        return this.ExtraParameter;
    }

    /**
     * Set <li> 为 NULL：无特殊参数，RuleAction 选择 NormalAction；</li>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExtraParameter <li> 为 NULL：无特殊参数，RuleAction 选择 NormalAction；</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExtraParameter(RuleExtraParameter ExtraParameter) {
        this.ExtraParameter = ExtraParameter;
    }

    public RulesProperties() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RulesProperties(RulesProperties source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Min != null) {
            this.Min = new Long(source.Min);
        }
        if (source.ChoicesValue != null) {
            this.ChoicesValue = new String[source.ChoicesValue.length];
            for (int i = 0; i < source.ChoicesValue.length; i++) {
                this.ChoicesValue[i] = new String(source.ChoicesValue[i]);
            }
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
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
        if (source.ChoiceProperties != null) {
            this.ChoiceProperties = new RuleChoicePropertiesItem[source.ChoiceProperties.length];
            for (int i = 0; i < source.ChoiceProperties.length; i++) {
                this.ChoiceProperties[i] = new RuleChoicePropertiesItem(source.ChoiceProperties[i]);
            }
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
        this.setParamSimple(map, prefix + "Min", this.Min);
        this.setParamArraySimple(map, prefix + "ChoicesValue.", this.ChoicesValue);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Max", this.Max);
        this.setParamSimple(map, prefix + "IsMultiple", this.IsMultiple);
        this.setParamSimple(map, prefix + "IsAllowEmpty", this.IsAllowEmpty);
        this.setParamArrayObj(map, prefix + "ChoiceProperties.", this.ChoiceProperties);
        this.setParamObj(map, prefix + "ExtraParameter.", this.ExtraParameter);

    }
}

