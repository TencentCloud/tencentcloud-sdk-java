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
package com.tencentcloudapi.chc.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TemplateOption extends AbstractModel {

    /**
    * 选项名称
    */
    @SerializedName("OptionName")
    @Expose
    private String OptionName;

    /**
    * 腾讯的标准
    */
    @SerializedName("Standard")
    @Expose
    private String Standard;

    /**
    * 腾讯标准的展示字段
    */
    @SerializedName("StandardInfo")
    @Expose
    private String StandardInfo;

    /**
    * 选项的唯一标识
    */
    @SerializedName("OptionKey")
    @Expose
    private String OptionKey;

    /**
    * 输入的类型
    */
    @SerializedName("InputType")
    @Expose
    private String InputType;

    /**
    * 输入值的类型
    */
    @SerializedName("ValueType")
    @Expose
    private String ValueType;

    /**
    * 是否符合腾讯标准的比较方式，-- 为不做比较
    */
    @SerializedName("CompareType")
    @Expose
    private String CompareType;

    /**
    * 下拉列表中填充的选项值
    */
    @SerializedName("OptionValueSet")
    @Expose
    private OptionValueItem [] OptionValueSet;

    /**
    * 输入框中的占位的提示符
    */
    @SerializedName("InputHint")
    @Expose
    private String InputHint;

    /**
    * 输入框下方的提示文案
    */
    @SerializedName("InputInfo")
    @Expose
    private String InputInfo;

    /**
    * 客户写入的值
    */
    @SerializedName("OptionValue")
    @Expose
    private String OptionValue;

    /**
     * Get 选项名称 
     * @return OptionName 选项名称
     */
    public String getOptionName() {
        return this.OptionName;
    }

    /**
     * Set 选项名称
     * @param OptionName 选项名称
     */
    public void setOptionName(String OptionName) {
        this.OptionName = OptionName;
    }

    /**
     * Get 腾讯的标准 
     * @return Standard 腾讯的标准
     */
    public String getStandard() {
        return this.Standard;
    }

    /**
     * Set 腾讯的标准
     * @param Standard 腾讯的标准
     */
    public void setStandard(String Standard) {
        this.Standard = Standard;
    }

    /**
     * Get 腾讯标准的展示字段 
     * @return StandardInfo 腾讯标准的展示字段
     */
    public String getStandardInfo() {
        return this.StandardInfo;
    }

    /**
     * Set 腾讯标准的展示字段
     * @param StandardInfo 腾讯标准的展示字段
     */
    public void setStandardInfo(String StandardInfo) {
        this.StandardInfo = StandardInfo;
    }

    /**
     * Get 选项的唯一标识 
     * @return OptionKey 选项的唯一标识
     */
    public String getOptionKey() {
        return this.OptionKey;
    }

    /**
     * Set 选项的唯一标识
     * @param OptionKey 选项的唯一标识
     */
    public void setOptionKey(String OptionKey) {
        this.OptionKey = OptionKey;
    }

    /**
     * Get 输入的类型 
     * @return InputType 输入的类型
     */
    public String getInputType() {
        return this.InputType;
    }

    /**
     * Set 输入的类型
     * @param InputType 输入的类型
     */
    public void setInputType(String InputType) {
        this.InputType = InputType;
    }

    /**
     * Get 输入值的类型 
     * @return ValueType 输入值的类型
     */
    public String getValueType() {
        return this.ValueType;
    }

    /**
     * Set 输入值的类型
     * @param ValueType 输入值的类型
     */
    public void setValueType(String ValueType) {
        this.ValueType = ValueType;
    }

    /**
     * Get 是否符合腾讯标准的比较方式，-- 为不做比较 
     * @return CompareType 是否符合腾讯标准的比较方式，-- 为不做比较
     */
    public String getCompareType() {
        return this.CompareType;
    }

    /**
     * Set 是否符合腾讯标准的比较方式，-- 为不做比较
     * @param CompareType 是否符合腾讯标准的比较方式，-- 为不做比较
     */
    public void setCompareType(String CompareType) {
        this.CompareType = CompareType;
    }

    /**
     * Get 下拉列表中填充的选项值 
     * @return OptionValueSet 下拉列表中填充的选项值
     */
    public OptionValueItem [] getOptionValueSet() {
        return this.OptionValueSet;
    }

    /**
     * Set 下拉列表中填充的选项值
     * @param OptionValueSet 下拉列表中填充的选项值
     */
    public void setOptionValueSet(OptionValueItem [] OptionValueSet) {
        this.OptionValueSet = OptionValueSet;
    }

    /**
     * Get 输入框中的占位的提示符 
     * @return InputHint 输入框中的占位的提示符
     */
    public String getInputHint() {
        return this.InputHint;
    }

    /**
     * Set 输入框中的占位的提示符
     * @param InputHint 输入框中的占位的提示符
     */
    public void setInputHint(String InputHint) {
        this.InputHint = InputHint;
    }

    /**
     * Get 输入框下方的提示文案 
     * @return InputInfo 输入框下方的提示文案
     */
    public String getInputInfo() {
        return this.InputInfo;
    }

    /**
     * Set 输入框下方的提示文案
     * @param InputInfo 输入框下方的提示文案
     */
    public void setInputInfo(String InputInfo) {
        this.InputInfo = InputInfo;
    }

    /**
     * Get 客户写入的值 
     * @return OptionValue 客户写入的值
     */
    public String getOptionValue() {
        return this.OptionValue;
    }

    /**
     * Set 客户写入的值
     * @param OptionValue 客户写入的值
     */
    public void setOptionValue(String OptionValue) {
        this.OptionValue = OptionValue;
    }

    public TemplateOption() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TemplateOption(TemplateOption source) {
        if (source.OptionName != null) {
            this.OptionName = new String(source.OptionName);
        }
        if (source.Standard != null) {
            this.Standard = new String(source.Standard);
        }
        if (source.StandardInfo != null) {
            this.StandardInfo = new String(source.StandardInfo);
        }
        if (source.OptionKey != null) {
            this.OptionKey = new String(source.OptionKey);
        }
        if (source.InputType != null) {
            this.InputType = new String(source.InputType);
        }
        if (source.ValueType != null) {
            this.ValueType = new String(source.ValueType);
        }
        if (source.CompareType != null) {
            this.CompareType = new String(source.CompareType);
        }
        if (source.OptionValueSet != null) {
            this.OptionValueSet = new OptionValueItem[source.OptionValueSet.length];
            for (int i = 0; i < source.OptionValueSet.length; i++) {
                this.OptionValueSet[i] = new OptionValueItem(source.OptionValueSet[i]);
            }
        }
        if (source.InputHint != null) {
            this.InputHint = new String(source.InputHint);
        }
        if (source.InputInfo != null) {
            this.InputInfo = new String(source.InputInfo);
        }
        if (source.OptionValue != null) {
            this.OptionValue = new String(source.OptionValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OptionName", this.OptionName);
        this.setParamSimple(map, prefix + "Standard", this.Standard);
        this.setParamSimple(map, prefix + "StandardInfo", this.StandardInfo);
        this.setParamSimple(map, prefix + "OptionKey", this.OptionKey);
        this.setParamSimple(map, prefix + "InputType", this.InputType);
        this.setParamSimple(map, prefix + "ValueType", this.ValueType);
        this.setParamSimple(map, prefix + "CompareType", this.CompareType);
        this.setParamArrayObj(map, prefix + "OptionValueSet.", this.OptionValueSet);
        this.setParamSimple(map, prefix + "InputHint", this.InputHint);
        this.setParamSimple(map, prefix + "InputInfo", this.InputInfo);
        this.setParamSimple(map, prefix + "OptionValue", this.OptionValue);

    }
}

