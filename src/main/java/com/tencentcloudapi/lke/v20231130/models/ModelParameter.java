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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModelParameter extends AbstractModel {

    /**
    * <p>超参名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>类型</p><p>枚举值：</p><ul><li>string： 字符类型</li><li>int： 整数类型</li><li>float： 浮点数类型</li><li>array： 数组类型</li></ul>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>默认值</p>
    */
    @SerializedName("DefaultValue")
    @Expose
    private String DefaultValue;

    /**
    * <p>枚举值</p>
    */
    @SerializedName("EnumValues")
    @Expose
    private String [] EnumValues;

    /**
    * <p>默认值</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Default")
    @Expose
    private Float Default;

    /**
    * <p>最小值</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Min")
    @Expose
    private Float Min;

    /**
    * <p>最大值</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Max")
    @Expose
    private Float Max;

    /**
     * Get <p>超参名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name <p>超参名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>超参名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name <p>超参名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>类型</p><p>枚举值：</p><ul><li>string： 字符类型</li><li>int： 整数类型</li><li>float： 浮点数类型</li><li>array： 数组类型</li></ul> 
     * @return Type <p>类型</p><p>枚举值：</p><ul><li>string： 字符类型</li><li>int： 整数类型</li><li>float： 浮点数类型</li><li>array： 数组类型</li></ul>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>类型</p><p>枚举值：</p><ul><li>string： 字符类型</li><li>int： 整数类型</li><li>float： 浮点数类型</li><li>array： 数组类型</li></ul>
     * @param Type <p>类型</p><p>枚举值：</p><ul><li>string： 字符类型</li><li>int： 整数类型</li><li>float： 浮点数类型</li><li>array： 数组类型</li></ul>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>默认值</p> 
     * @return DefaultValue <p>默认值</p>
     */
    public String getDefaultValue() {
        return this.DefaultValue;
    }

    /**
     * Set <p>默认值</p>
     * @param DefaultValue <p>默认值</p>
     */
    public void setDefaultValue(String DefaultValue) {
        this.DefaultValue = DefaultValue;
    }

    /**
     * Get <p>枚举值</p> 
     * @return EnumValues <p>枚举值</p>
     */
    public String [] getEnumValues() {
        return this.EnumValues;
    }

    /**
     * Set <p>枚举值</p>
     * @param EnumValues <p>枚举值</p>
     */
    public void setEnumValues(String [] EnumValues) {
        this.EnumValues = EnumValues;
    }

    /**
     * Get <p>默认值</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Default <p>默认值</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getDefault() {
        return this.Default;
    }

    /**
     * Set <p>默认值</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Default <p>默认值</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDefault(Float Default) {
        this.Default = Default;
    }

    /**
     * Get <p>最小值</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Min <p>最小值</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getMin() {
        return this.Min;
    }

    /**
     * Set <p>最小值</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Min <p>最小值</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMin(Float Min) {
        this.Min = Min;
    }

    /**
     * Get <p>最大值</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Max <p>最大值</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getMax() {
        return this.Max;
    }

    /**
     * Set <p>最大值</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Max <p>最大值</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMax(Float Max) {
        this.Max = Max;
    }

    public ModelParameter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModelParameter(ModelParameter source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.DefaultValue != null) {
            this.DefaultValue = new String(source.DefaultValue);
        }
        if (source.EnumValues != null) {
            this.EnumValues = new String[source.EnumValues.length];
            for (int i = 0; i < source.EnumValues.length; i++) {
                this.EnumValues[i] = new String(source.EnumValues[i]);
            }
        }
        if (source.Default != null) {
            this.Default = new Float(source.Default);
        }
        if (source.Min != null) {
            this.Min = new Float(source.Min);
        }
        if (source.Max != null) {
            this.Max = new Float(source.Max);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "DefaultValue", this.DefaultValue);
        this.setParamArraySimple(map, prefix + "EnumValues.", this.EnumValues);
        this.setParamSimple(map, prefix + "Default", this.Default);
        this.setParamSimple(map, prefix + "Min", this.Min);
        this.setParamSimple(map, prefix + "Max", this.Max);

    }
}

