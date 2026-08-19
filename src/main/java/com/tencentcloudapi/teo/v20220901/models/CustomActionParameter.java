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

public class CustomActionParameter extends AbstractModel {

    /**
    * <p>定制配置项下各参数字段名称。</p><p>您可以通过 DescribeAvailableCustomActionsForRuleEngine 接口返回值 CustomActionSet[].Parameters[].Name 获取，如 &quot;Seconds&quot;、&quot;Ports&quot;、&quot;StatusCode&quot;。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>定制配置项下各参数字段值的类型。</p><p>枚举值：</p><ul><li>String： 字符串类型。</li><li>Integer： 整型类型。</li><li>Float： 浮点数类型。</li><li>Boolean： 布尔类型。</li><li>ArrayOfString： 字符串数组类型。</li><li>ArrayOfInteger： 整型数组类型。</li><li>ArrayOfFloat： 浮点数数组类型。</li></ul><p>您可以通过 DescribeAvailableCustomActionsForRuleEngine 接口返回值 CustomActionSet[].Parameters[].Type 获取。</p>
    */
    @SerializedName("ValueType")
    @Expose
    private String ValueType;

    /**
    * <p>字符串类型参数值。当 ValueType 为 String 时，该参数必填。</p><p>您可以通过 DescribeAvailableCustomActionsForRuleEngine 接口返回值 CustomActionSet[].Parameters 获取参数值的默认值、单位、限制等说明。</p>
    */
    @SerializedName("StringValue")
    @Expose
    private String StringValue;

    /**
    * <p>整型类型参数值。当 ValueType 为 Integer 时，该参数必填。</p><p>您可以通过 DescribeAvailableCustomActionsForRuleEngine 接口返回值 CustomActionSet[].Parameters 获取参数值的默认值、单位、限制等说明。</p>
    */
    @SerializedName("IntegerValue")
    @Expose
    private Long IntegerValue;

    /**
    * <p>浮点数类型参数值。当 ValueType 为 Float 时，该参数必填。</p><p>您可以通过 DescribeAvailableCustomActionsForRuleEngine 接口返回值 CustomActionSet[].Parameters 获取参数值的默认值、单位、限制等说明。</p>
    */
    @SerializedName("FloatValue")
    @Expose
    private Float FloatValue;

    /**
    * <p>布尔类型参数值。当 ValueType 为 Boolean 时，该参数必填。</p><p>您可以通过 DescribeAvailableCustomActionsForRuleEngine 接口返回值 CustomActionSet[].Parameters 获取参数值的默认值、单位、限制等说明。</p>
    */
    @SerializedName("BooleanValue")
    @Expose
    private Boolean BooleanValue;

    /**
    * <p>字符串数组类型参数值。当 ValueType 为 ArrayOfString 时，该参数必填。</p><p>您可以通过 DescribeAvailableCustomActionsForRuleEngine 接口返回值 CustomActionSet[].Parameters 获取参数值的默认值、单位、限制等说明。</p>
    */
    @SerializedName("StringArrayValue")
    @Expose
    private String [] StringArrayValue;

    /**
    * <p>整型数组类型参数值。当 ValueType 为 ArrayOfInteger 时，该参数必填。</p><p>您可以通过 DescribeAvailableCustomActionsForRuleEngine 接口返回值 CustomActionSet[].Parameters 获取参数值的默认值、单位、限制等说明。</p>
    */
    @SerializedName("IntegerArrayValue")
    @Expose
    private Long [] IntegerArrayValue;

    /**
    * <p>浮点数数组类型参数值。当 ValueType 为 ArrayOfFloat 时，该参数必填。</p><p>您可以通过 DescribeAvailableCustomActionsForRuleEngine 接口返回值 CustomActionSet[].Parameters 获取参数值的默认值、单位、限制等说明。</p>
    */
    @SerializedName("FloatArrayValue")
    @Expose
    private Float [] FloatArrayValue;

    /**
     * Get <p>定制配置项下各参数字段名称。</p><p>您可以通过 DescribeAvailableCustomActionsForRuleEngine 接口返回值 CustomActionSet[].Parameters[].Name 获取，如 &quot;Seconds&quot;、&quot;Ports&quot;、&quot;StatusCode&quot;。</p> 
     * @return Name <p>定制配置项下各参数字段名称。</p><p>您可以通过 DescribeAvailableCustomActionsForRuleEngine 接口返回值 CustomActionSet[].Parameters[].Name 获取，如 &quot;Seconds&quot;、&quot;Ports&quot;、&quot;StatusCode&quot;。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>定制配置项下各参数字段名称。</p><p>您可以通过 DescribeAvailableCustomActionsForRuleEngine 接口返回值 CustomActionSet[].Parameters[].Name 获取，如 &quot;Seconds&quot;、&quot;Ports&quot;、&quot;StatusCode&quot;。</p>
     * @param Name <p>定制配置项下各参数字段名称。</p><p>您可以通过 DescribeAvailableCustomActionsForRuleEngine 接口返回值 CustomActionSet[].Parameters[].Name 获取，如 &quot;Seconds&quot;、&quot;Ports&quot;、&quot;StatusCode&quot;。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>定制配置项下各参数字段值的类型。</p><p>枚举值：</p><ul><li>String： 字符串类型。</li><li>Integer： 整型类型。</li><li>Float： 浮点数类型。</li><li>Boolean： 布尔类型。</li><li>ArrayOfString： 字符串数组类型。</li><li>ArrayOfInteger： 整型数组类型。</li><li>ArrayOfFloat： 浮点数数组类型。</li></ul><p>您可以通过 DescribeAvailableCustomActionsForRuleEngine 接口返回值 CustomActionSet[].Parameters[].Type 获取。</p> 
     * @return ValueType <p>定制配置项下各参数字段值的类型。</p><p>枚举值：</p><ul><li>String： 字符串类型。</li><li>Integer： 整型类型。</li><li>Float： 浮点数类型。</li><li>Boolean： 布尔类型。</li><li>ArrayOfString： 字符串数组类型。</li><li>ArrayOfInteger： 整型数组类型。</li><li>ArrayOfFloat： 浮点数数组类型。</li></ul><p>您可以通过 DescribeAvailableCustomActionsForRuleEngine 接口返回值 CustomActionSet[].Parameters[].Type 获取。</p>
     */
    public String getValueType() {
        return this.ValueType;
    }

    /**
     * Set <p>定制配置项下各参数字段值的类型。</p><p>枚举值：</p><ul><li>String： 字符串类型。</li><li>Integer： 整型类型。</li><li>Float： 浮点数类型。</li><li>Boolean： 布尔类型。</li><li>ArrayOfString： 字符串数组类型。</li><li>ArrayOfInteger： 整型数组类型。</li><li>ArrayOfFloat： 浮点数数组类型。</li></ul><p>您可以通过 DescribeAvailableCustomActionsForRuleEngine 接口返回值 CustomActionSet[].Parameters[].Type 获取。</p>
     * @param ValueType <p>定制配置项下各参数字段值的类型。</p><p>枚举值：</p><ul><li>String： 字符串类型。</li><li>Integer： 整型类型。</li><li>Float： 浮点数类型。</li><li>Boolean： 布尔类型。</li><li>ArrayOfString： 字符串数组类型。</li><li>ArrayOfInteger： 整型数组类型。</li><li>ArrayOfFloat： 浮点数数组类型。</li></ul><p>您可以通过 DescribeAvailableCustomActionsForRuleEngine 接口返回值 CustomActionSet[].Parameters[].Type 获取。</p>
     */
    public void setValueType(String ValueType) {
        this.ValueType = ValueType;
    }

    /**
     * Get <p>字符串类型参数值。当 ValueType 为 String 时，该参数必填。</p><p>您可以通过 DescribeAvailableCustomActionsForRuleEngine 接口返回值 CustomActionSet[].Parameters 获取参数值的默认值、单位、限制等说明。</p> 
     * @return StringValue <p>字符串类型参数值。当 ValueType 为 String 时，该参数必填。</p><p>您可以通过 DescribeAvailableCustomActionsForRuleEngine 接口返回值 CustomActionSet[].Parameters 获取参数值的默认值、单位、限制等说明。</p>
     */
    public String getStringValue() {
        return this.StringValue;
    }

    /**
     * Set <p>字符串类型参数值。当 ValueType 为 String 时，该参数必填。</p><p>您可以通过 DescribeAvailableCustomActionsForRuleEngine 接口返回值 CustomActionSet[].Parameters 获取参数值的默认值、单位、限制等说明。</p>
     * @param StringValue <p>字符串类型参数值。当 ValueType 为 String 时，该参数必填。</p><p>您可以通过 DescribeAvailableCustomActionsForRuleEngine 接口返回值 CustomActionSet[].Parameters 获取参数值的默认值、单位、限制等说明。</p>
     */
    public void setStringValue(String StringValue) {
        this.StringValue = StringValue;
    }

    /**
     * Get <p>整型类型参数值。当 ValueType 为 Integer 时，该参数必填。</p><p>您可以通过 DescribeAvailableCustomActionsForRuleEngine 接口返回值 CustomActionSet[].Parameters 获取参数值的默认值、单位、限制等说明。</p> 
     * @return IntegerValue <p>整型类型参数值。当 ValueType 为 Integer 时，该参数必填。</p><p>您可以通过 DescribeAvailableCustomActionsForRuleEngine 接口返回值 CustomActionSet[].Parameters 获取参数值的默认值、单位、限制等说明。</p>
     */
    public Long getIntegerValue() {
        return this.IntegerValue;
    }

    /**
     * Set <p>整型类型参数值。当 ValueType 为 Integer 时，该参数必填。</p><p>您可以通过 DescribeAvailableCustomActionsForRuleEngine 接口返回值 CustomActionSet[].Parameters 获取参数值的默认值、单位、限制等说明。</p>
     * @param IntegerValue <p>整型类型参数值。当 ValueType 为 Integer 时，该参数必填。</p><p>您可以通过 DescribeAvailableCustomActionsForRuleEngine 接口返回值 CustomActionSet[].Parameters 获取参数值的默认值、单位、限制等说明。</p>
     */
    public void setIntegerValue(Long IntegerValue) {
        this.IntegerValue = IntegerValue;
    }

    /**
     * Get <p>浮点数类型参数值。当 ValueType 为 Float 时，该参数必填。</p><p>您可以通过 DescribeAvailableCustomActionsForRuleEngine 接口返回值 CustomActionSet[].Parameters 获取参数值的默认值、单位、限制等说明。</p> 
     * @return FloatValue <p>浮点数类型参数值。当 ValueType 为 Float 时，该参数必填。</p><p>您可以通过 DescribeAvailableCustomActionsForRuleEngine 接口返回值 CustomActionSet[].Parameters 获取参数值的默认值、单位、限制等说明。</p>
     */
    public Float getFloatValue() {
        return this.FloatValue;
    }

    /**
     * Set <p>浮点数类型参数值。当 ValueType 为 Float 时，该参数必填。</p><p>您可以通过 DescribeAvailableCustomActionsForRuleEngine 接口返回值 CustomActionSet[].Parameters 获取参数值的默认值、单位、限制等说明。</p>
     * @param FloatValue <p>浮点数类型参数值。当 ValueType 为 Float 时，该参数必填。</p><p>您可以通过 DescribeAvailableCustomActionsForRuleEngine 接口返回值 CustomActionSet[].Parameters 获取参数值的默认值、单位、限制等说明。</p>
     */
    public void setFloatValue(Float FloatValue) {
        this.FloatValue = FloatValue;
    }

    /**
     * Get <p>布尔类型参数值。当 ValueType 为 Boolean 时，该参数必填。</p><p>您可以通过 DescribeAvailableCustomActionsForRuleEngine 接口返回值 CustomActionSet[].Parameters 获取参数值的默认值、单位、限制等说明。</p> 
     * @return BooleanValue <p>布尔类型参数值。当 ValueType 为 Boolean 时，该参数必填。</p><p>您可以通过 DescribeAvailableCustomActionsForRuleEngine 接口返回值 CustomActionSet[].Parameters 获取参数值的默认值、单位、限制等说明。</p>
     */
    public Boolean getBooleanValue() {
        return this.BooleanValue;
    }

    /**
     * Set <p>布尔类型参数值。当 ValueType 为 Boolean 时，该参数必填。</p><p>您可以通过 DescribeAvailableCustomActionsForRuleEngine 接口返回值 CustomActionSet[].Parameters 获取参数值的默认值、单位、限制等说明。</p>
     * @param BooleanValue <p>布尔类型参数值。当 ValueType 为 Boolean 时，该参数必填。</p><p>您可以通过 DescribeAvailableCustomActionsForRuleEngine 接口返回值 CustomActionSet[].Parameters 获取参数值的默认值、单位、限制等说明。</p>
     */
    public void setBooleanValue(Boolean BooleanValue) {
        this.BooleanValue = BooleanValue;
    }

    /**
     * Get <p>字符串数组类型参数值。当 ValueType 为 ArrayOfString 时，该参数必填。</p><p>您可以通过 DescribeAvailableCustomActionsForRuleEngine 接口返回值 CustomActionSet[].Parameters 获取参数值的默认值、单位、限制等说明。</p> 
     * @return StringArrayValue <p>字符串数组类型参数值。当 ValueType 为 ArrayOfString 时，该参数必填。</p><p>您可以通过 DescribeAvailableCustomActionsForRuleEngine 接口返回值 CustomActionSet[].Parameters 获取参数值的默认值、单位、限制等说明。</p>
     */
    public String [] getStringArrayValue() {
        return this.StringArrayValue;
    }

    /**
     * Set <p>字符串数组类型参数值。当 ValueType 为 ArrayOfString 时，该参数必填。</p><p>您可以通过 DescribeAvailableCustomActionsForRuleEngine 接口返回值 CustomActionSet[].Parameters 获取参数值的默认值、单位、限制等说明。</p>
     * @param StringArrayValue <p>字符串数组类型参数值。当 ValueType 为 ArrayOfString 时，该参数必填。</p><p>您可以通过 DescribeAvailableCustomActionsForRuleEngine 接口返回值 CustomActionSet[].Parameters 获取参数值的默认值、单位、限制等说明。</p>
     */
    public void setStringArrayValue(String [] StringArrayValue) {
        this.StringArrayValue = StringArrayValue;
    }

    /**
     * Get <p>整型数组类型参数值。当 ValueType 为 ArrayOfInteger 时，该参数必填。</p><p>您可以通过 DescribeAvailableCustomActionsForRuleEngine 接口返回值 CustomActionSet[].Parameters 获取参数值的默认值、单位、限制等说明。</p> 
     * @return IntegerArrayValue <p>整型数组类型参数值。当 ValueType 为 ArrayOfInteger 时，该参数必填。</p><p>您可以通过 DescribeAvailableCustomActionsForRuleEngine 接口返回值 CustomActionSet[].Parameters 获取参数值的默认值、单位、限制等说明。</p>
     */
    public Long [] getIntegerArrayValue() {
        return this.IntegerArrayValue;
    }

    /**
     * Set <p>整型数组类型参数值。当 ValueType 为 ArrayOfInteger 时，该参数必填。</p><p>您可以通过 DescribeAvailableCustomActionsForRuleEngine 接口返回值 CustomActionSet[].Parameters 获取参数值的默认值、单位、限制等说明。</p>
     * @param IntegerArrayValue <p>整型数组类型参数值。当 ValueType 为 ArrayOfInteger 时，该参数必填。</p><p>您可以通过 DescribeAvailableCustomActionsForRuleEngine 接口返回值 CustomActionSet[].Parameters 获取参数值的默认值、单位、限制等说明。</p>
     */
    public void setIntegerArrayValue(Long [] IntegerArrayValue) {
        this.IntegerArrayValue = IntegerArrayValue;
    }

    /**
     * Get <p>浮点数数组类型参数值。当 ValueType 为 ArrayOfFloat 时，该参数必填。</p><p>您可以通过 DescribeAvailableCustomActionsForRuleEngine 接口返回值 CustomActionSet[].Parameters 获取参数值的默认值、单位、限制等说明。</p> 
     * @return FloatArrayValue <p>浮点数数组类型参数值。当 ValueType 为 ArrayOfFloat 时，该参数必填。</p><p>您可以通过 DescribeAvailableCustomActionsForRuleEngine 接口返回值 CustomActionSet[].Parameters 获取参数值的默认值、单位、限制等说明。</p>
     */
    public Float [] getFloatArrayValue() {
        return this.FloatArrayValue;
    }

    /**
     * Set <p>浮点数数组类型参数值。当 ValueType 为 ArrayOfFloat 时，该参数必填。</p><p>您可以通过 DescribeAvailableCustomActionsForRuleEngine 接口返回值 CustomActionSet[].Parameters 获取参数值的默认值、单位、限制等说明。</p>
     * @param FloatArrayValue <p>浮点数数组类型参数值。当 ValueType 为 ArrayOfFloat 时，该参数必填。</p><p>您可以通过 DescribeAvailableCustomActionsForRuleEngine 接口返回值 CustomActionSet[].Parameters 获取参数值的默认值、单位、限制等说明。</p>
     */
    public void setFloatArrayValue(Float [] FloatArrayValue) {
        this.FloatArrayValue = FloatArrayValue;
    }

    public CustomActionParameter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CustomActionParameter(CustomActionParameter source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ValueType != null) {
            this.ValueType = new String(source.ValueType);
        }
        if (source.StringValue != null) {
            this.StringValue = new String(source.StringValue);
        }
        if (source.IntegerValue != null) {
            this.IntegerValue = new Long(source.IntegerValue);
        }
        if (source.FloatValue != null) {
            this.FloatValue = new Float(source.FloatValue);
        }
        if (source.BooleanValue != null) {
            this.BooleanValue = new Boolean(source.BooleanValue);
        }
        if (source.StringArrayValue != null) {
            this.StringArrayValue = new String[source.StringArrayValue.length];
            for (int i = 0; i < source.StringArrayValue.length; i++) {
                this.StringArrayValue[i] = new String(source.StringArrayValue[i]);
            }
        }
        if (source.IntegerArrayValue != null) {
            this.IntegerArrayValue = new Long[source.IntegerArrayValue.length];
            for (int i = 0; i < source.IntegerArrayValue.length; i++) {
                this.IntegerArrayValue[i] = new Long(source.IntegerArrayValue[i]);
            }
        }
        if (source.FloatArrayValue != null) {
            this.FloatArrayValue = new Float[source.FloatArrayValue.length];
            for (int i = 0; i < source.FloatArrayValue.length; i++) {
                this.FloatArrayValue[i] = new Float(source.FloatArrayValue[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ValueType", this.ValueType);
        this.setParamSimple(map, prefix + "StringValue", this.StringValue);
        this.setParamSimple(map, prefix + "IntegerValue", this.IntegerValue);
        this.setParamSimple(map, prefix + "FloatValue", this.FloatValue);
        this.setParamSimple(map, prefix + "BooleanValue", this.BooleanValue);
        this.setParamArraySimple(map, prefix + "StringArrayValue.", this.StringArrayValue);
        this.setParamArraySimple(map, prefix + "IntegerArrayValue.", this.IntegerArrayValue);
        this.setParamArraySimple(map, prefix + "FloatArrayValue.", this.FloatArrayValue);

    }
}

