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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DataServiceRequestParam extends AbstractModel {

    /**
    * 参数名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParamName")
    @Expose
    private String ParamName;

    /**
    * 绑定字段
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BindField")
    @Expose
    private String BindField;

    /**
    * 参数类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParamType")
    @Expose
    private String ParamType;

    /**
    * 参数位置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParamPosition")
    @Expose
    private String ParamPosition;

    /**
    * 操作符
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * 是否为空
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NonEmpty")
    @Expose
    private Long NonEmpty;

    /**
    * 默认值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DefaultValue")
    @Expose
    private String DefaultValue;

    /**
    * 示例值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExampleValue")
    @Expose
    private String ExampleValue;

    /**
    * 参数描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get 参数名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParamName 参数名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getParamName() {
        return this.ParamName;
    }

    /**
     * Set 参数名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParamName 参数名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParamName(String ParamName) {
        this.ParamName = ParamName;
    }

    /**
     * Get 绑定字段
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BindField 绑定字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBindField() {
        return this.BindField;
    }

    /**
     * Set 绑定字段
注意：此字段可能返回 null，表示取不到有效值。
     * @param BindField 绑定字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBindField(String BindField) {
        this.BindField = BindField;
    }

    /**
     * Get 参数类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParamType 参数类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getParamType() {
        return this.ParamType;
    }

    /**
     * Set 参数类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParamType 参数类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParamType(String ParamType) {
        this.ParamType = ParamType;
    }

    /**
     * Get 参数位置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParamPosition 参数位置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getParamPosition() {
        return this.ParamPosition;
    }

    /**
     * Set 参数位置
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParamPosition 参数位置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParamPosition(String ParamPosition) {
        this.ParamPosition = ParamPosition;
    }

    /**
     * Get 操作符
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Operator 操作符
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set 操作符
注意：此字段可能返回 null，表示取不到有效值。
     * @param Operator 操作符
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 是否为空
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NonEmpty 是否为空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getNonEmpty() {
        return this.NonEmpty;
    }

    /**
     * Set 是否为空
注意：此字段可能返回 null，表示取不到有效值。
     * @param NonEmpty 是否为空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNonEmpty(Long NonEmpty) {
        this.NonEmpty = NonEmpty;
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
     * Get 示例值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExampleValue 示例值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExampleValue() {
        return this.ExampleValue;
    }

    /**
     * Set 示例值
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExampleValue 示例值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExampleValue(String ExampleValue) {
        this.ExampleValue = ExampleValue;
    }

    /**
     * Get 参数描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 参数描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 参数描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 参数描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public DataServiceRequestParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DataServiceRequestParam(DataServiceRequestParam source) {
        if (source.ParamName != null) {
            this.ParamName = new String(source.ParamName);
        }
        if (source.BindField != null) {
            this.BindField = new String(source.BindField);
        }
        if (source.ParamType != null) {
            this.ParamType = new String(source.ParamType);
        }
        if (source.ParamPosition != null) {
            this.ParamPosition = new String(source.ParamPosition);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
        if (source.NonEmpty != null) {
            this.NonEmpty = new Long(source.NonEmpty);
        }
        if (source.DefaultValue != null) {
            this.DefaultValue = new String(source.DefaultValue);
        }
        if (source.ExampleValue != null) {
            this.ExampleValue = new String(source.ExampleValue);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ParamName", this.ParamName);
        this.setParamSimple(map, prefix + "BindField", this.BindField);
        this.setParamSimple(map, prefix + "ParamType", this.ParamType);
        this.setParamSimple(map, prefix + "ParamPosition", this.ParamPosition);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "NonEmpty", this.NonEmpty);
        this.setParamSimple(map, prefix + "DefaultValue", this.DefaultValue);
        this.setParamSimple(map, prefix + "ExampleValue", this.ExampleValue);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

