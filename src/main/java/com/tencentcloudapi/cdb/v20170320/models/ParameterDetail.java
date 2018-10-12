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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ParameterDetail  extends AbstractModel{

    /**
    * 参数名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 参数类型
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
    * 修改参数后，是否需要重启数据库以使参数生效。可能的值包括：0-不需要重启；1-需要重启
    */
    @SerializedName("NeedReboot")
    @Expose
    private Integer NeedReboot;

    /**
    * 参数允许的最大值
    */
    @SerializedName("Max")
    @Expose
    private Integer Max;

    /**
    * 参数允许的最小值
    */
    @SerializedName("Min")
    @Expose
    private Integer Min;

    /**
    * 参数的可选枚举值。如果为非枚举参数，则为空
    */
    @SerializedName("EnumValue")
    @Expose
    private String [] EnumValue;

    /**
     * 获取参数名称
     * @return Name 参数名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * 设置参数名称
     * @param Name 参数名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * 获取参数类型
     * @return ParamType 参数类型
     */
    public String getParamType() {
        return this.ParamType;
    }

    /**
     * 设置参数类型
     * @param ParamType 参数类型
     */
    public void setParamType(String ParamType) {
        this.ParamType = ParamType;
    }

    /**
     * 获取参数默认值
     * @return Default 参数默认值
     */
    public String getDefault() {
        return this.Default;
    }

    /**
     * 设置参数默认值
     * @param Default 参数默认值
     */
    public void setDefault(String Default) {
        this.Default = Default;
    }

    /**
     * 获取参数描述
     * @return Description 参数描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * 设置参数描述
     * @param Description 参数描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * 获取参数当前值
     * @return CurrentValue 参数当前值
     */
    public String getCurrentValue() {
        return this.CurrentValue;
    }

    /**
     * 设置参数当前值
     * @param CurrentValue 参数当前值
     */
    public void setCurrentValue(String CurrentValue) {
        this.CurrentValue = CurrentValue;
    }

    /**
     * 获取修改参数后，是否需要重启数据库以使参数生效。可能的值包括：0-不需要重启；1-需要重启
     * @return NeedReboot 修改参数后，是否需要重启数据库以使参数生效。可能的值包括：0-不需要重启；1-需要重启
     */
    public Integer getNeedReboot() {
        return this.NeedReboot;
    }

    /**
     * 设置修改参数后，是否需要重启数据库以使参数生效。可能的值包括：0-不需要重启；1-需要重启
     * @param NeedReboot 修改参数后，是否需要重启数据库以使参数生效。可能的值包括：0-不需要重启；1-需要重启
     */
    public void setNeedReboot(Integer NeedReboot) {
        this.NeedReboot = NeedReboot;
    }

    /**
     * 获取参数允许的最大值
     * @return Max 参数允许的最大值
     */
    public Integer getMax() {
        return this.Max;
    }

    /**
     * 设置参数允许的最大值
     * @param Max 参数允许的最大值
     */
    public void setMax(Integer Max) {
        this.Max = Max;
    }

    /**
     * 获取参数允许的最小值
     * @return Min 参数允许的最小值
     */
    public Integer getMin() {
        return this.Min;
    }

    /**
     * 设置参数允许的最小值
     * @param Min 参数允许的最小值
     */
    public void setMin(Integer Min) {
        this.Min = Min;
    }

    /**
     * 获取参数的可选枚举值。如果为非枚举参数，则为空
     * @return EnumValue 参数的可选枚举值。如果为非枚举参数，则为空
     */
    public String [] getEnumValue() {
        return this.EnumValue;
    }

    /**
     * 设置参数的可选枚举值。如果为非枚举参数，则为空
     * @param EnumValue 参数的可选枚举值。如果为非枚举参数，则为空
     */
    public void setEnumValue(String [] EnumValue) {
        this.EnumValue = EnumValue;
    }

    /**
     * 内部实现，用户禁止调用
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

    }
}

