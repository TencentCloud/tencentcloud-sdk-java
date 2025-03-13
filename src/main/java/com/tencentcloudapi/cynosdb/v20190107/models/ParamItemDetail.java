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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ParamItemDetail extends AbstractModel {

    /**
    * 当前值
    */
    @SerializedName("CurrentValue")
    @Expose
    private String CurrentValue;

    /**
    * 默认值
    */
    @SerializedName("Default")
    @Expose
    private String Default;

    /**
    * 参数的可选枚举值。如果为非枚举值，则为空
    */
    @SerializedName("EnumValue")
    @Expose
    private String [] EnumValue;

    /**
    * 1：全局参数，0：非全局参数
    */
    @SerializedName("IsGlobal")
    @Expose
    private Long IsGlobal;

    /**
    * 最大值
    */
    @SerializedName("Max")
    @Expose
    private String Max;

    /**
    * 最小值
    */
    @SerializedName("Min")
    @Expose
    private String Min;

    /**
    * 修改参数后，是否需要重启数据库以使参数生效。0-不需要重启，1-需要重启。
    */
    @SerializedName("NeedReboot")
    @Expose
    private Long NeedReboot;

    /**
    * 参数名称
    */
    @SerializedName("ParamName")
    @Expose
    private String ParamName;

    /**
    * 参数类型：integer，enum，float，string，func
    */
    @SerializedName("ParamType")
    @Expose
    private String ParamType;

    /**
    * 参数描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 类型是否为公式
    */
    @SerializedName("IsFunc")
    @Expose
    private Boolean IsFunc;

    /**
    * 参数配置公式
    */
    @SerializedName("Func")
    @Expose
    private String Func;

    /**
    * 支持公式的参数的默认公式样式
    */
    @SerializedName("FuncPattern")
    @Expose
    private String FuncPattern;

    /**
     * Get 当前值 
     * @return CurrentValue 当前值
     */
    public String getCurrentValue() {
        return this.CurrentValue;
    }

    /**
     * Set 当前值
     * @param CurrentValue 当前值
     */
    public void setCurrentValue(String CurrentValue) {
        this.CurrentValue = CurrentValue;
    }

    /**
     * Get 默认值 
     * @return Default 默认值
     */
    public String getDefault() {
        return this.Default;
    }

    /**
     * Set 默认值
     * @param Default 默认值
     */
    public void setDefault(String Default) {
        this.Default = Default;
    }

    /**
     * Get 参数的可选枚举值。如果为非枚举值，则为空 
     * @return EnumValue 参数的可选枚举值。如果为非枚举值，则为空
     */
    public String [] getEnumValue() {
        return this.EnumValue;
    }

    /**
     * Set 参数的可选枚举值。如果为非枚举值，则为空
     * @param EnumValue 参数的可选枚举值。如果为非枚举值，则为空
     */
    public void setEnumValue(String [] EnumValue) {
        this.EnumValue = EnumValue;
    }

    /**
     * Get 1：全局参数，0：非全局参数 
     * @return IsGlobal 1：全局参数，0：非全局参数
     */
    public Long getIsGlobal() {
        return this.IsGlobal;
    }

    /**
     * Set 1：全局参数，0：非全局参数
     * @param IsGlobal 1：全局参数，0：非全局参数
     */
    public void setIsGlobal(Long IsGlobal) {
        this.IsGlobal = IsGlobal;
    }

    /**
     * Get 最大值 
     * @return Max 最大值
     */
    public String getMax() {
        return this.Max;
    }

    /**
     * Set 最大值
     * @param Max 最大值
     */
    public void setMax(String Max) {
        this.Max = Max;
    }

    /**
     * Get 最小值 
     * @return Min 最小值
     */
    public String getMin() {
        return this.Min;
    }

    /**
     * Set 最小值
     * @param Min 最小值
     */
    public void setMin(String Min) {
        this.Min = Min;
    }

    /**
     * Get 修改参数后，是否需要重启数据库以使参数生效。0-不需要重启，1-需要重启。 
     * @return NeedReboot 修改参数后，是否需要重启数据库以使参数生效。0-不需要重启，1-需要重启。
     */
    public Long getNeedReboot() {
        return this.NeedReboot;
    }

    /**
     * Set 修改参数后，是否需要重启数据库以使参数生效。0-不需要重启，1-需要重启。
     * @param NeedReboot 修改参数后，是否需要重启数据库以使参数生效。0-不需要重启，1-需要重启。
     */
    public void setNeedReboot(Long NeedReboot) {
        this.NeedReboot = NeedReboot;
    }

    /**
     * Get 参数名称 
     * @return ParamName 参数名称
     */
    public String getParamName() {
        return this.ParamName;
    }

    /**
     * Set 参数名称
     * @param ParamName 参数名称
     */
    public void setParamName(String ParamName) {
        this.ParamName = ParamName;
    }

    /**
     * Get 参数类型：integer，enum，float，string，func 
     * @return ParamType 参数类型：integer，enum，float，string，func
     */
    public String getParamType() {
        return this.ParamType;
    }

    /**
     * Set 参数类型：integer，enum，float，string，func
     * @param ParamType 参数类型：integer，enum，float，string，func
     */
    public void setParamType(String ParamType) {
        this.ParamType = ParamType;
    }

    /**
     * Get 参数描述 
     * @return Description 参数描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 参数描述
     * @param Description 参数描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 类型是否为公式 
     * @return IsFunc 类型是否为公式
     */
    public Boolean getIsFunc() {
        return this.IsFunc;
    }

    /**
     * Set 类型是否为公式
     * @param IsFunc 类型是否为公式
     */
    public void setIsFunc(Boolean IsFunc) {
        this.IsFunc = IsFunc;
    }

    /**
     * Get 参数配置公式 
     * @return Func 参数配置公式
     */
    public String getFunc() {
        return this.Func;
    }

    /**
     * Set 参数配置公式
     * @param Func 参数配置公式
     */
    public void setFunc(String Func) {
        this.Func = Func;
    }

    /**
     * Get 支持公式的参数的默认公式样式 
     * @return FuncPattern 支持公式的参数的默认公式样式
     */
    public String getFuncPattern() {
        return this.FuncPattern;
    }

    /**
     * Set 支持公式的参数的默认公式样式
     * @param FuncPattern 支持公式的参数的默认公式样式
     */
    public void setFuncPattern(String FuncPattern) {
        this.FuncPattern = FuncPattern;
    }

    public ParamItemDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ParamItemDetail(ParamItemDetail source) {
        if (source.CurrentValue != null) {
            this.CurrentValue = new String(source.CurrentValue);
        }
        if (source.Default != null) {
            this.Default = new String(source.Default);
        }
        if (source.EnumValue != null) {
            this.EnumValue = new String[source.EnumValue.length];
            for (int i = 0; i < source.EnumValue.length; i++) {
                this.EnumValue[i] = new String(source.EnumValue[i]);
            }
        }
        if (source.IsGlobal != null) {
            this.IsGlobal = new Long(source.IsGlobal);
        }
        if (source.Max != null) {
            this.Max = new String(source.Max);
        }
        if (source.Min != null) {
            this.Min = new String(source.Min);
        }
        if (source.NeedReboot != null) {
            this.NeedReboot = new Long(source.NeedReboot);
        }
        if (source.ParamName != null) {
            this.ParamName = new String(source.ParamName);
        }
        if (source.ParamType != null) {
            this.ParamType = new String(source.ParamType);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.IsFunc != null) {
            this.IsFunc = new Boolean(source.IsFunc);
        }
        if (source.Func != null) {
            this.Func = new String(source.Func);
        }
        if (source.FuncPattern != null) {
            this.FuncPattern = new String(source.FuncPattern);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CurrentValue", this.CurrentValue);
        this.setParamSimple(map, prefix + "Default", this.Default);
        this.setParamArraySimple(map, prefix + "EnumValue.", this.EnumValue);
        this.setParamSimple(map, prefix + "IsGlobal", this.IsGlobal);
        this.setParamSimple(map, prefix + "Max", this.Max);
        this.setParamSimple(map, prefix + "Min", this.Min);
        this.setParamSimple(map, prefix + "NeedReboot", this.NeedReboot);
        this.setParamSimple(map, prefix + "ParamName", this.ParamName);
        this.setParamSimple(map, prefix + "ParamType", this.ParamType);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "IsFunc", this.IsFunc);
        this.setParamSimple(map, prefix + "Func", this.Func);
        this.setParamSimple(map, prefix + "FuncPattern", this.FuncPattern);

    }
}

