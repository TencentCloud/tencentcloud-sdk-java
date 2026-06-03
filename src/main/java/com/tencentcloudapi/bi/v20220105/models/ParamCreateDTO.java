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
package com.tencentcloudapi.bi.v20220105.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ParamCreateDTO extends AbstractModel {

    /**
    * 参数名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParamName")
    @Expose
    private String ParamName;

    /**
    * 默认值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DefaultValue")
    @Expose
    private String DefaultValue;

    /**
    * 参数类型，string/datetime/number
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParamType")
    @Expose
    private String ParamType;

    /**
    * 格式化类型，yyyy-MM-dd HH:mm:ss.SSS（只有时间必填）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FormatRule")
    @Expose
    private String FormatRule;

    /**
    * 复杂类型，格式化的另一种表达，例如YYYY-MM
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ComplexType")
    @Expose
    private String ComplexType;

    /**
    * 作用域
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Scope")
    @Expose
    private String Scope;

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
     * Get 默认值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DefaultValue 默认值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDefaultValue() {
        return this.DefaultValue;
    }

    /**
     * Set 默认值
注意：此字段可能返回 null，表示取不到有效值。
     * @param DefaultValue 默认值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDefaultValue(String DefaultValue) {
        this.DefaultValue = DefaultValue;
    }

    /**
     * Get 参数类型，string/datetime/number
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParamType 参数类型，string/datetime/number
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getParamType() {
        return this.ParamType;
    }

    /**
     * Set 参数类型，string/datetime/number
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParamType 参数类型，string/datetime/number
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParamType(String ParamType) {
        this.ParamType = ParamType;
    }

    /**
     * Get 格式化类型，yyyy-MM-dd HH:mm:ss.SSS（只有时间必填）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FormatRule 格式化类型，yyyy-MM-dd HH:mm:ss.SSS（只有时间必填）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFormatRule() {
        return this.FormatRule;
    }

    /**
     * Set 格式化类型，yyyy-MM-dd HH:mm:ss.SSS（只有时间必填）
注意：此字段可能返回 null，表示取不到有效值。
     * @param FormatRule 格式化类型，yyyy-MM-dd HH:mm:ss.SSS（只有时间必填）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFormatRule(String FormatRule) {
        this.FormatRule = FormatRule;
    }

    /**
     * Get 复杂类型，格式化的另一种表达，例如YYYY-MM
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ComplexType 复杂类型，格式化的另一种表达，例如YYYY-MM
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getComplexType() {
        return this.ComplexType;
    }

    /**
     * Set 复杂类型，格式化的另一种表达，例如YYYY-MM
注意：此字段可能返回 null，表示取不到有效值。
     * @param ComplexType 复杂类型，格式化的另一种表达，例如YYYY-MM
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setComplexType(String ComplexType) {
        this.ComplexType = ComplexType;
    }

    /**
     * Get 作用域
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Scope 作用域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getScope() {
        return this.Scope;
    }

    /**
     * Set 作用域
注意：此字段可能返回 null，表示取不到有效值。
     * @param Scope 作用域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScope(String Scope) {
        this.Scope = Scope;
    }

    public ParamCreateDTO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ParamCreateDTO(ParamCreateDTO source) {
        if (source.ParamName != null) {
            this.ParamName = new String(source.ParamName);
        }
        if (source.DefaultValue != null) {
            this.DefaultValue = new String(source.DefaultValue);
        }
        if (source.ParamType != null) {
            this.ParamType = new String(source.ParamType);
        }
        if (source.FormatRule != null) {
            this.FormatRule = new String(source.FormatRule);
        }
        if (source.ComplexType != null) {
            this.ComplexType = new String(source.ComplexType);
        }
        if (source.Scope != null) {
            this.Scope = new String(source.Scope);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ParamName", this.ParamName);
        this.setParamSimple(map, prefix + "DefaultValue", this.DefaultValue);
        this.setParamSimple(map, prefix + "ParamType", this.ParamType);
        this.setParamSimple(map, prefix + "FormatRule", this.FormatRule);
        this.setParamSimple(map, prefix + "ComplexType", this.ComplexType);
        this.setParamSimple(map, prefix + "Scope", this.Scope);

    }
}

