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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ParamItemDetail extends AbstractModel {

    /**
    * <p>当前值</p>
    */
    @SerializedName("CurrentValue")
    @Expose
    private String CurrentValue;

    /**
    * <p>默认值</p>
    */
    @SerializedName("Default")
    @Expose
    private String Default;

    /**
    * <p>参数的可选枚举值。如果为非枚举值，则为空</p>
    */
    @SerializedName("EnumValue")
    @Expose
    private String [] EnumValue;

    /**
    * <p>1：全局参数，0：非全局参数</p>
    */
    @SerializedName("IsGlobal")
    @Expose
    private Long IsGlobal;

    /**
    * <p>最大值</p>
    */
    @SerializedName("Max")
    @Expose
    private String Max;

    /**
    * <p>最小值</p>
    */
    @SerializedName("Min")
    @Expose
    private String Min;

    /**
    * <p>修改参数后，是否需要重启数据库以使参数生效。0-不需要重启，1-需要重启。</p>
    */
    @SerializedName("NeedReboot")
    @Expose
    private Long NeedReboot;

    /**
    * <p>参数名称</p>
    */
    @SerializedName("ParamName")
    @Expose
    private String ParamName;

    /**
    * <p>参数类型：integer，enum，float，string，func</p>
    */
    @SerializedName("ParamType")
    @Expose
    private String ParamType;

    /**
    * <p>参数是否可修改</p>
    */
    @SerializedName("ModifiableInfo")
    @Expose
    private ModifiableInfo ModifiableInfo;

    /**
    * <p>参数描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>类型是否为公式</p>
    */
    @SerializedName("IsFunc")
    @Expose
    private Boolean IsFunc;

    /**
    * <p>参数配置公式</p>
    */
    @SerializedName("Func")
    @Expose
    private String Func;

    /**
    * <p>支持公式的参数的默认公式样式</p>
    */
    @SerializedName("FuncPattern")
    @Expose
    private String FuncPattern;

    /**
     * Get <p>当前值</p> 
     * @return CurrentValue <p>当前值</p>
     */
    public String getCurrentValue() {
        return this.CurrentValue;
    }

    /**
     * Set <p>当前值</p>
     * @param CurrentValue <p>当前值</p>
     */
    public void setCurrentValue(String CurrentValue) {
        this.CurrentValue = CurrentValue;
    }

    /**
     * Get <p>默认值</p> 
     * @return Default <p>默认值</p>
     */
    public String getDefault() {
        return this.Default;
    }

    /**
     * Set <p>默认值</p>
     * @param Default <p>默认值</p>
     */
    public void setDefault(String Default) {
        this.Default = Default;
    }

    /**
     * Get <p>参数的可选枚举值。如果为非枚举值，则为空</p> 
     * @return EnumValue <p>参数的可选枚举值。如果为非枚举值，则为空</p>
     */
    public String [] getEnumValue() {
        return this.EnumValue;
    }

    /**
     * Set <p>参数的可选枚举值。如果为非枚举值，则为空</p>
     * @param EnumValue <p>参数的可选枚举值。如果为非枚举值，则为空</p>
     */
    public void setEnumValue(String [] EnumValue) {
        this.EnumValue = EnumValue;
    }

    /**
     * Get <p>1：全局参数，0：非全局参数</p> 
     * @return IsGlobal <p>1：全局参数，0：非全局参数</p>
     */
    public Long getIsGlobal() {
        return this.IsGlobal;
    }

    /**
     * Set <p>1：全局参数，0：非全局参数</p>
     * @param IsGlobal <p>1：全局参数，0：非全局参数</p>
     */
    public void setIsGlobal(Long IsGlobal) {
        this.IsGlobal = IsGlobal;
    }

    /**
     * Get <p>最大值</p> 
     * @return Max <p>最大值</p>
     */
    public String getMax() {
        return this.Max;
    }

    /**
     * Set <p>最大值</p>
     * @param Max <p>最大值</p>
     */
    public void setMax(String Max) {
        this.Max = Max;
    }

    /**
     * Get <p>最小值</p> 
     * @return Min <p>最小值</p>
     */
    public String getMin() {
        return this.Min;
    }

    /**
     * Set <p>最小值</p>
     * @param Min <p>最小值</p>
     */
    public void setMin(String Min) {
        this.Min = Min;
    }

    /**
     * Get <p>修改参数后，是否需要重启数据库以使参数生效。0-不需要重启，1-需要重启。</p> 
     * @return NeedReboot <p>修改参数后，是否需要重启数据库以使参数生效。0-不需要重启，1-需要重启。</p>
     */
    public Long getNeedReboot() {
        return this.NeedReboot;
    }

    /**
     * Set <p>修改参数后，是否需要重启数据库以使参数生效。0-不需要重启，1-需要重启。</p>
     * @param NeedReboot <p>修改参数后，是否需要重启数据库以使参数生效。0-不需要重启，1-需要重启。</p>
     */
    public void setNeedReboot(Long NeedReboot) {
        this.NeedReboot = NeedReboot;
    }

    /**
     * Get <p>参数名称</p> 
     * @return ParamName <p>参数名称</p>
     */
    public String getParamName() {
        return this.ParamName;
    }

    /**
     * Set <p>参数名称</p>
     * @param ParamName <p>参数名称</p>
     */
    public void setParamName(String ParamName) {
        this.ParamName = ParamName;
    }

    /**
     * Get <p>参数类型：integer，enum，float，string，func</p> 
     * @return ParamType <p>参数类型：integer，enum，float，string，func</p>
     */
    public String getParamType() {
        return this.ParamType;
    }

    /**
     * Set <p>参数类型：integer，enum，float，string，func</p>
     * @param ParamType <p>参数类型：integer，enum，float，string，func</p>
     */
    public void setParamType(String ParamType) {
        this.ParamType = ParamType;
    }

    /**
     * Get <p>参数是否可修改</p> 
     * @return ModifiableInfo <p>参数是否可修改</p>
     */
    public ModifiableInfo getModifiableInfo() {
        return this.ModifiableInfo;
    }

    /**
     * Set <p>参数是否可修改</p>
     * @param ModifiableInfo <p>参数是否可修改</p>
     */
    public void setModifiableInfo(ModifiableInfo ModifiableInfo) {
        this.ModifiableInfo = ModifiableInfo;
    }

    /**
     * Get <p>参数描述</p> 
     * @return Description <p>参数描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>参数描述</p>
     * @param Description <p>参数描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>类型是否为公式</p> 
     * @return IsFunc <p>类型是否为公式</p>
     */
    public Boolean getIsFunc() {
        return this.IsFunc;
    }

    /**
     * Set <p>类型是否为公式</p>
     * @param IsFunc <p>类型是否为公式</p>
     */
    public void setIsFunc(Boolean IsFunc) {
        this.IsFunc = IsFunc;
    }

    /**
     * Get <p>参数配置公式</p> 
     * @return Func <p>参数配置公式</p>
     */
    public String getFunc() {
        return this.Func;
    }

    /**
     * Set <p>参数配置公式</p>
     * @param Func <p>参数配置公式</p>
     */
    public void setFunc(String Func) {
        this.Func = Func;
    }

    /**
     * Get <p>支持公式的参数的默认公式样式</p> 
     * @return FuncPattern <p>支持公式的参数的默认公式样式</p>
     */
    public String getFuncPattern() {
        return this.FuncPattern;
    }

    /**
     * Set <p>支持公式的参数的默认公式样式</p>
     * @param FuncPattern <p>支持公式的参数的默认公式样式</p>
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
        if (source.ModifiableInfo != null) {
            this.ModifiableInfo = new ModifiableInfo(source.ModifiableInfo);
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
        this.setParamObj(map, prefix + "ModifiableInfo.", this.ModifiableInfo);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "IsFunc", this.IsFunc);
        this.setParamSimple(map, prefix + "Func", this.Func);
        this.setParamSimple(map, prefix + "FuncPattern", this.FuncPattern);

    }
}

