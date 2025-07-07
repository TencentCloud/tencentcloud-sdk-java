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
package com.tencentcloudapi.cdb.v20170320.models;

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
    * 参数类型：integer，enum，float，string，func
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
    * 参数的可选枚举值。如果为非枚举参数，则为空
    */
    @SerializedName("EnumValue")
    @Expose
    private String [] EnumValue;

    /**
    * 参数是公式类型时，该字段有效，表示公式类型最大值
    */
    @SerializedName("MaxFunc")
    @Expose
    private String MaxFunc;

    /**
    * 参数是公式类型时，该字段有效，表示公式类型最小值
    */
    @SerializedName("MinFunc")
    @Expose
    private String MinFunc;

    /**
    * 参数是否不支持修改
    */
    @SerializedName("IsNotSupportEdit")
    @Expose
    private Boolean IsNotSupportEdit;

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
     * Get 修改参数后，是否需要重启数据库以使参数生效。可能的值包括：0-不需要重启；1-需要重启 
     * @return NeedReboot 修改参数后，是否需要重启数据库以使参数生效。可能的值包括：0-不需要重启；1-需要重启
     */
    public Long getNeedReboot() {
        return this.NeedReboot;
    }

    /**
     * Set 修改参数后，是否需要重启数据库以使参数生效。可能的值包括：0-不需要重启；1-需要重启
     * @param NeedReboot 修改参数后，是否需要重启数据库以使参数生效。可能的值包括：0-不需要重启；1-需要重启
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
     * Get 参数的可选枚举值。如果为非枚举参数，则为空 
     * @return EnumValue 参数的可选枚举值。如果为非枚举参数，则为空
     */
    public String [] getEnumValue() {
        return this.EnumValue;
    }

    /**
     * Set 参数的可选枚举值。如果为非枚举参数，则为空
     * @param EnumValue 参数的可选枚举值。如果为非枚举参数，则为空
     */
    public void setEnumValue(String [] EnumValue) {
        this.EnumValue = EnumValue;
    }

    /**
     * Get 参数是公式类型时，该字段有效，表示公式类型最大值 
     * @return MaxFunc 参数是公式类型时，该字段有效，表示公式类型最大值
     */
    public String getMaxFunc() {
        return this.MaxFunc;
    }

    /**
     * Set 参数是公式类型时，该字段有效，表示公式类型最大值
     * @param MaxFunc 参数是公式类型时，该字段有效，表示公式类型最大值
     */
    public void setMaxFunc(String MaxFunc) {
        this.MaxFunc = MaxFunc;
    }

    /**
     * Get 参数是公式类型时，该字段有效，表示公式类型最小值 
     * @return MinFunc 参数是公式类型时，该字段有效，表示公式类型最小值
     */
    public String getMinFunc() {
        return this.MinFunc;
    }

    /**
     * Set 参数是公式类型时，该字段有效，表示公式类型最小值
     * @param MinFunc 参数是公式类型时，该字段有效，表示公式类型最小值
     */
    public void setMinFunc(String MinFunc) {
        this.MinFunc = MinFunc;
    }

    /**
     * Get 参数是否不支持修改 
     * @return IsNotSupportEdit 参数是否不支持修改
     */
    public Boolean getIsNotSupportEdit() {
        return this.IsNotSupportEdit;
    }

    /**
     * Set 参数是否不支持修改
     * @param IsNotSupportEdit 参数是否不支持修改
     */
    public void setIsNotSupportEdit(Boolean IsNotSupportEdit) {
        this.IsNotSupportEdit = IsNotSupportEdit;
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
        if (source.MaxFunc != null) {
            this.MaxFunc = new String(source.MaxFunc);
        }
        if (source.MinFunc != null) {
            this.MinFunc = new String(source.MinFunc);
        }
        if (source.IsNotSupportEdit != null) {
            this.IsNotSupportEdit = new Boolean(source.IsNotSupportEdit);
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
        this.setParamSimple(map, prefix + "MaxFunc", this.MaxFunc);
        this.setParamSimple(map, prefix + "MinFunc", this.MinFunc);
        this.setParamSimple(map, prefix + "IsNotSupportEdit", this.IsNotSupportEdit);

    }
}

