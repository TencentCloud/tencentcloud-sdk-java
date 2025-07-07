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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ParameterDetail extends AbstractModel {

    /**
    * 参数名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 参数类型，integer-整型，enum-枚举型
    */
    @SerializedName("ParamType")
    @Expose
    private String ParamType;

    /**
    * 参数默认值
    */
    @SerializedName("Default")
    @Expose
    private String Default;

    /**
    * 参数描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 参数当前值
    */
    @SerializedName("CurrentValue")
    @Expose
    private String CurrentValue;

    /**
    * 修改参数后，是否需要重启数据库以使参数生效，0-不需要重启，1-需要重启
    */
    @SerializedName("NeedReboot")
    @Expose
    private Long NeedReboot;

    /**
    * 参数允许的最大值
    */
    @SerializedName("Max")
    @Expose
    private Long Max;

    /**
    * 参数允许的最小值
    */
    @SerializedName("Min")
    @Expose
    private Long Min;

    /**
    * 参数允许的枚举类型
    */
    @SerializedName("EnumValue")
    @Expose
    private String [] EnumValue;

    /**
    * 参数状态 0-状态正常 1-在修改中
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get 参数名称 
     * @return Name 参数名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 参数名称
     * @param Name 参数名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 参数类型，integer-整型，enum-枚举型 
     * @return ParamType 参数类型，integer-整型，enum-枚举型
     */
    public String getParamType() {
        return this.ParamType;
    }

    /**
     * Set 参数类型，integer-整型，enum-枚举型
     * @param ParamType 参数类型，integer-整型，enum-枚举型
     */
    public void setParamType(String ParamType) {
        this.ParamType = ParamType;
    }

    /**
     * Get 参数默认值 
     * @return Default 参数默认值
     */
    public String getDefault() {
        return this.Default;
    }

    /**
     * Set 参数默认值
     * @param Default 参数默认值
     */
    public void setDefault(String Default) {
        this.Default = Default;
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
     * Get 参数当前值 
     * @return CurrentValue 参数当前值
     */
    public String getCurrentValue() {
        return this.CurrentValue;
    }

    /**
     * Set 参数当前值
     * @param CurrentValue 参数当前值
     */
    public void setCurrentValue(String CurrentValue) {
        this.CurrentValue = CurrentValue;
    }

    /**
     * Get 修改参数后，是否需要重启数据库以使参数生效，0-不需要重启，1-需要重启 
     * @return NeedReboot 修改参数后，是否需要重启数据库以使参数生效，0-不需要重启，1-需要重启
     */
    public Long getNeedReboot() {
        return this.NeedReboot;
    }

    /**
     * Set 修改参数后，是否需要重启数据库以使参数生效，0-不需要重启，1-需要重启
     * @param NeedReboot 修改参数后，是否需要重启数据库以使参数生效，0-不需要重启，1-需要重启
     */
    public void setNeedReboot(Long NeedReboot) {
        this.NeedReboot = NeedReboot;
    }

    /**
     * Get 参数允许的最大值 
     * @return Max 参数允许的最大值
     */
    public Long getMax() {
        return this.Max;
    }

    /**
     * Set 参数允许的最大值
     * @param Max 参数允许的最大值
     */
    public void setMax(Long Max) {
        this.Max = Max;
    }

    /**
     * Get 参数允许的最小值 
     * @return Min 参数允许的最小值
     */
    public Long getMin() {
        return this.Min;
    }

    /**
     * Set 参数允许的最小值
     * @param Min 参数允许的最小值
     */
    public void setMin(Long Min) {
        this.Min = Min;
    }

    /**
     * Get 参数允许的枚举类型 
     * @return EnumValue 参数允许的枚举类型
     */
    public String [] getEnumValue() {
        return this.EnumValue;
    }

    /**
     * Set 参数允许的枚举类型
     * @param EnumValue 参数允许的枚举类型
     */
    public void setEnumValue(String [] EnumValue) {
        this.EnumValue = EnumValue;
    }

    /**
     * Get 参数状态 0-状态正常 1-在修改中 
     * @return Status 参数状态 0-状态正常 1-在修改中
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 参数状态 0-状态正常 1-在修改中
     * @param Status 参数状态 0-状态正常 1-在修改中
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public ParameterDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ParameterDetail(ParameterDetail source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ParamType != null) {
            this.ParamType = new String(source.ParamType);
        }
        if (source.Default != null) {
            this.Default = new String(source.Default);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CurrentValue != null) {
            this.CurrentValue = new String(source.CurrentValue);
        }
        if (source.NeedReboot != null) {
            this.NeedReboot = new Long(source.NeedReboot);
        }
        if (source.Max != null) {
            this.Max = new Long(source.Max);
        }
        if (source.Min != null) {
            this.Min = new Long(source.Min);
        }
        if (source.EnumValue != null) {
            this.EnumValue = new String[source.EnumValue.length];
            for (int i = 0; i < source.EnumValue.length; i++) {
                this.EnumValue[i] = new String(source.EnumValue[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ParamType", this.ParamType);
        this.setParamSimple(map, prefix + "Default", this.Default);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CurrentValue", this.CurrentValue);
        this.setParamSimple(map, prefix + "NeedReboot", this.NeedReboot);
        this.setParamSimple(map, prefix + "Max", this.Max);
        this.setParamSimple(map, prefix + "Min", this.Min);
        this.setParamArraySimple(map, prefix + "EnumValue.", this.EnumValue);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

