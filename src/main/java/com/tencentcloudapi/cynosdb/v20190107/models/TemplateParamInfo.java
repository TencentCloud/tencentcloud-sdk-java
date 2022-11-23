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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TemplateParamInfo extends AbstractModel{

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
    * 参数类型为enum时可选的值类型集合
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnumValue")
    @Expose
    private String [] EnumValue;

    /**
    * 参数类型为float/integer时的最大值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Max")
    @Expose
    private String Max;

    /**
    * 参数类型为float/integer时的最小值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Min")
    @Expose
    private String Min;

    /**
    * 参数名称
    */
    @SerializedName("ParamName")
    @Expose
    private String ParamName;

    /**
    * 是否需要重启
    */
    @SerializedName("NeedReboot")
    @Expose
    private Long NeedReboot;

    /**
    * 参数描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 参数类型，integer/float/string/enum
    */
    @SerializedName("ParamType")
    @Expose
    private String ParamType;

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
     * Get 参数类型为enum时可选的值类型集合
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnumValue 参数类型为enum时可选的值类型集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getEnumValue() {
        return this.EnumValue;
    }

    /**
     * Set 参数类型为enum时可选的值类型集合
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnumValue 参数类型为enum时可选的值类型集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnumValue(String [] EnumValue) {
        this.EnumValue = EnumValue;
    }

    /**
     * Get 参数类型为float/integer时的最大值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Max 参数类型为float/integer时的最大值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMax() {
        return this.Max;
    }

    /**
     * Set 参数类型为float/integer时的最大值
注意：此字段可能返回 null，表示取不到有效值。
     * @param Max 参数类型为float/integer时的最大值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMax(String Max) {
        this.Max = Max;
    }

    /**
     * Get 参数类型为float/integer时的最小值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Min 参数类型为float/integer时的最小值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMin() {
        return this.Min;
    }

    /**
     * Set 参数类型为float/integer时的最小值
注意：此字段可能返回 null，表示取不到有效值。
     * @param Min 参数类型为float/integer时的最小值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMin(String Min) {
        this.Min = Min;
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
     * Get 是否需要重启 
     * @return NeedReboot 是否需要重启
     */
    public Long getNeedReboot() {
        return this.NeedReboot;
    }

    /**
     * Set 是否需要重启
     * @param NeedReboot 是否需要重启
     */
    public void setNeedReboot(Long NeedReboot) {
        this.NeedReboot = NeedReboot;
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
     * Get 参数类型，integer/float/string/enum 
     * @return ParamType 参数类型，integer/float/string/enum
     */
    public String getParamType() {
        return this.ParamType;
    }

    /**
     * Set 参数类型，integer/float/string/enum
     * @param ParamType 参数类型，integer/float/string/enum
     */
    public void setParamType(String ParamType) {
        this.ParamType = ParamType;
    }

    public TemplateParamInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TemplateParamInfo(TemplateParamInfo source) {
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
        if (source.Max != null) {
            this.Max = new String(source.Max);
        }
        if (source.Min != null) {
            this.Min = new String(source.Min);
        }
        if (source.ParamName != null) {
            this.ParamName = new String(source.ParamName);
        }
        if (source.NeedReboot != null) {
            this.NeedReboot = new Long(source.NeedReboot);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ParamType != null) {
            this.ParamType = new String(source.ParamType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CurrentValue", this.CurrentValue);
        this.setParamSimple(map, prefix + "Default", this.Default);
        this.setParamArraySimple(map, prefix + "EnumValue.", this.EnumValue);
        this.setParamSimple(map, prefix + "Max", this.Max);
        this.setParamSimple(map, prefix + "Min", this.Min);
        this.setParamSimple(map, prefix + "ParamName", this.ParamName);
        this.setParamSimple(map, prefix + "NeedReboot", this.NeedReboot);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "ParamType", this.ParamType);

    }
}

