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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceIntegerParam extends AbstractModel{

    /**
    * 当前值
    */
    @SerializedName("CurrentValue")
    @Expose
    private String CurrentValue;

    /**
    * 默认值
    */
    @SerializedName("DefaultValue")
    @Expose
    private String DefaultValue;

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
    * 是否需要重启生效 1:需要重启后生效；0：无需重启，设置成功即可生效；
    */
    @SerializedName("NeedRestart")
    @Expose
    private String NeedRestart;

    /**
    * 参数名称
    */
    @SerializedName("ParamName")
    @Expose
    private String ParamName;

    /**
    * 参数说明
    */
    @SerializedName("Tips")
    @Expose
    private String [] Tips;

    /**
    * 参数类型
    */
    @SerializedName("ValueType")
    @Expose
    private String ValueType;

    /**
    * 是否为运行中参数值 1:运行中参数值；0：非运行中参数值；
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 冗余字段，可忽略
    */
    @SerializedName("Unit")
    @Expose
    private String Unit;

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
     * Get 是否需要重启生效 1:需要重启后生效；0：无需重启，设置成功即可生效； 
     * @return NeedRestart 是否需要重启生效 1:需要重启后生效；0：无需重启，设置成功即可生效；
     */
    public String getNeedRestart() {
        return this.NeedRestart;
    }

    /**
     * Set 是否需要重启生效 1:需要重启后生效；0：无需重启，设置成功即可生效；
     * @param NeedRestart 是否需要重启生效 1:需要重启后生效；0：无需重启，设置成功即可生效；
     */
    public void setNeedRestart(String NeedRestart) {
        this.NeedRestart = NeedRestart;
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
     * Get 参数说明 
     * @return Tips 参数说明
     */
    public String [] getTips() {
        return this.Tips;
    }

    /**
     * Set 参数说明
     * @param Tips 参数说明
     */
    public void setTips(String [] Tips) {
        this.Tips = Tips;
    }

    /**
     * Get 参数类型 
     * @return ValueType 参数类型
     */
    public String getValueType() {
        return this.ValueType;
    }

    /**
     * Set 参数类型
     * @param ValueType 参数类型
     */
    public void setValueType(String ValueType) {
        this.ValueType = ValueType;
    }

    /**
     * Get 是否为运行中参数值 1:运行中参数值；0：非运行中参数值； 
     * @return Status 是否为运行中参数值 1:运行中参数值；0：非运行中参数值；
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 是否为运行中参数值 1:运行中参数值；0：非运行中参数值；
     * @param Status 是否为运行中参数值 1:运行中参数值；0：非运行中参数值；
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 冗余字段，可忽略 
     * @return Unit 冗余字段，可忽略
     */
    public String getUnit() {
        return this.Unit;
    }

    /**
     * Set 冗余字段，可忽略
     * @param Unit 冗余字段，可忽略
     */
    public void setUnit(String Unit) {
        this.Unit = Unit;
    }

    public InstanceIntegerParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceIntegerParam(InstanceIntegerParam source) {
        if (source.CurrentValue != null) {
            this.CurrentValue = new String(source.CurrentValue);
        }
        if (source.DefaultValue != null) {
            this.DefaultValue = new String(source.DefaultValue);
        }
        if (source.Max != null) {
            this.Max = new String(source.Max);
        }
        if (source.Min != null) {
            this.Min = new String(source.Min);
        }
        if (source.NeedRestart != null) {
            this.NeedRestart = new String(source.NeedRestart);
        }
        if (source.ParamName != null) {
            this.ParamName = new String(source.ParamName);
        }
        if (source.Tips != null) {
            this.Tips = new String[source.Tips.length];
            for (int i = 0; i < source.Tips.length; i++) {
                this.Tips[i] = new String(source.Tips[i]);
            }
        }
        if (source.ValueType != null) {
            this.ValueType = new String(source.ValueType);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Unit != null) {
            this.Unit = new String(source.Unit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CurrentValue", this.CurrentValue);
        this.setParamSimple(map, prefix + "DefaultValue", this.DefaultValue);
        this.setParamSimple(map, prefix + "Max", this.Max);
        this.setParamSimple(map, prefix + "Min", this.Min);
        this.setParamSimple(map, prefix + "NeedRestart", this.NeedRestart);
        this.setParamSimple(map, prefix + "ParamName", this.ParamName);
        this.setParamArraySimple(map, prefix + "Tips.", this.Tips);
        this.setParamSimple(map, prefix + "ValueType", this.ValueType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Unit", this.Unit);

    }
}

