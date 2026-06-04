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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModelParameter extends AbstractModel {

    /**
    * 默认值
    */
    @SerializedName("DefaultValue")
    @Expose
    private String DefaultValue;

    /**
    * 枚举值列表（仅枚举类型有效）
    */
    @SerializedName("EnumValueList")
    @Expose
    private String [] EnumValueList;

    /**
    * 最大值（仅数值类型有效）
    */
    @SerializedName("MaxValue")
    @Expose
    private Float MaxValue;

    /**
    * 最小值（仅数值类型有效）
    */
    @SerializedName("MinValue")
    @Expose
    private Float MinValue;

    /**
    * 超参名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 超参类型。1-浮点数, 2-整数, 3-字符串, 4-枚举
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
     * Get 默认值 
     * @return DefaultValue 默认值
     */
    public String getDefaultValue() {
        return this.DefaultValue;
    }

    /**
     * Set 默认值
     * @param DefaultValue 默认值
     */
    public void setDefaultValue(String DefaultValue) {
        this.DefaultValue = DefaultValue;
    }

    /**
     * Get 枚举值列表（仅枚举类型有效） 
     * @return EnumValueList 枚举值列表（仅枚举类型有效）
     */
    public String [] getEnumValueList() {
        return this.EnumValueList;
    }

    /**
     * Set 枚举值列表（仅枚举类型有效）
     * @param EnumValueList 枚举值列表（仅枚举类型有效）
     */
    public void setEnumValueList(String [] EnumValueList) {
        this.EnumValueList = EnumValueList;
    }

    /**
     * Get 最大值（仅数值类型有效） 
     * @return MaxValue 最大值（仅数值类型有效）
     */
    public Float getMaxValue() {
        return this.MaxValue;
    }

    /**
     * Set 最大值（仅数值类型有效）
     * @param MaxValue 最大值（仅数值类型有效）
     */
    public void setMaxValue(Float MaxValue) {
        this.MaxValue = MaxValue;
    }

    /**
     * Get 最小值（仅数值类型有效） 
     * @return MinValue 最小值（仅数值类型有效）
     */
    public Float getMinValue() {
        return this.MinValue;
    }

    /**
     * Set 最小值（仅数值类型有效）
     * @param MinValue 最小值（仅数值类型有效）
     */
    public void setMinValue(Float MinValue) {
        this.MinValue = MinValue;
    }

    /**
     * Get 超参名称 
     * @return Name 超参名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 超参名称
     * @param Name 超参名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 超参类型。1-浮点数, 2-整数, 3-字符串, 4-枚举 
     * @return Type 超参类型。1-浮点数, 2-整数, 3-字符串, 4-枚举
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 超参类型。1-浮点数, 2-整数, 3-字符串, 4-枚举
     * @param Type 超参类型。1-浮点数, 2-整数, 3-字符串, 4-枚举
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    public ModelParameter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModelParameter(ModelParameter source) {
        if (source.DefaultValue != null) {
            this.DefaultValue = new String(source.DefaultValue);
        }
        if (source.EnumValueList != null) {
            this.EnumValueList = new String[source.EnumValueList.length];
            for (int i = 0; i < source.EnumValueList.length; i++) {
                this.EnumValueList[i] = new String(source.EnumValueList[i]);
            }
        }
        if (source.MaxValue != null) {
            this.MaxValue = new Float(source.MaxValue);
        }
        if (source.MinValue != null) {
            this.MinValue = new Float(source.MinValue);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DefaultValue", this.DefaultValue);
        this.setParamArraySimple(map, prefix + "EnumValueList.", this.EnumValueList);
        this.setParamSimple(map, prefix + "MaxValue", this.MaxValue);
        this.setParamSimple(map, prefix + "MinValue", this.MinValue);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

