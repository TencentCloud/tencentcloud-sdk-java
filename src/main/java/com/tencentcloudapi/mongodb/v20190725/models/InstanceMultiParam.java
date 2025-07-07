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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceMultiParam extends AbstractModel {

    /**
    * 参数当前值。
    */
    @SerializedName("CurrentValue")
    @Expose
    private String CurrentValue;

    /**
    * 参数默认值。
    */
    @SerializedName("DefaultValue")
    @Expose
    private String DefaultValue;

    /**
    * 参考值范围。
    */
    @SerializedName("EnumValue")
    @Expose
    private String [] EnumValue;

    /**
    * 参数修改后是否需要重启才会生效。
- 1：需要重启后生效。
- 0：无需重启，设置成功即可生效。
    */
    @SerializedName("NeedRestart")
    @Expose
    private String NeedRestart;

    /**
    * 参数名称。
    */
    @SerializedName("ParamName")
    @Expose
    private String ParamName;

    /**
    * 是否为运行中参数值。
- 1：运行中参数值。
- 0：非运行中参数值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 参数说明。
    */
    @SerializedName("Tips")
    @Expose
    private String [] Tips;

    /**
    * 当前值的类型描述，默认为multi。
    */
    @SerializedName("ValueType")
    @Expose
    private String ValueType;

    /**
     * Get 参数当前值。 
     * @return CurrentValue 参数当前值。
     */
    public String getCurrentValue() {
        return this.CurrentValue;
    }

    /**
     * Set 参数当前值。
     * @param CurrentValue 参数当前值。
     */
    public void setCurrentValue(String CurrentValue) {
        this.CurrentValue = CurrentValue;
    }

    /**
     * Get 参数默认值。 
     * @return DefaultValue 参数默认值。
     */
    public String getDefaultValue() {
        return this.DefaultValue;
    }

    /**
     * Set 参数默认值。
     * @param DefaultValue 参数默认值。
     */
    public void setDefaultValue(String DefaultValue) {
        this.DefaultValue = DefaultValue;
    }

    /**
     * Get 参考值范围。 
     * @return EnumValue 参考值范围。
     */
    public String [] getEnumValue() {
        return this.EnumValue;
    }

    /**
     * Set 参考值范围。
     * @param EnumValue 参考值范围。
     */
    public void setEnumValue(String [] EnumValue) {
        this.EnumValue = EnumValue;
    }

    /**
     * Get 参数修改后是否需要重启才会生效。
- 1：需要重启后生效。
- 0：无需重启，设置成功即可生效。 
     * @return NeedRestart 参数修改后是否需要重启才会生效。
- 1：需要重启后生效。
- 0：无需重启，设置成功即可生效。
     */
    public String getNeedRestart() {
        return this.NeedRestart;
    }

    /**
     * Set 参数修改后是否需要重启才会生效。
- 1：需要重启后生效。
- 0：无需重启，设置成功即可生效。
     * @param NeedRestart 参数修改后是否需要重启才会生效。
- 1：需要重启后生效。
- 0：无需重启，设置成功即可生效。
     */
    public void setNeedRestart(String NeedRestart) {
        this.NeedRestart = NeedRestart;
    }

    /**
     * Get 参数名称。 
     * @return ParamName 参数名称。
     */
    public String getParamName() {
        return this.ParamName;
    }

    /**
     * Set 参数名称。
     * @param ParamName 参数名称。
     */
    public void setParamName(String ParamName) {
        this.ParamName = ParamName;
    }

    /**
     * Get 是否为运行中参数值。
- 1：运行中参数值。
- 0：非运行中参数值。 
     * @return Status 是否为运行中参数值。
- 1：运行中参数值。
- 0：非运行中参数值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 是否为运行中参数值。
- 1：运行中参数值。
- 0：非运行中参数值。
     * @param Status 是否为运行中参数值。
- 1：运行中参数值。
- 0：非运行中参数值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 参数说明。 
     * @return Tips 参数说明。
     */
    public String [] getTips() {
        return this.Tips;
    }

    /**
     * Set 参数说明。
     * @param Tips 参数说明。
     */
    public void setTips(String [] Tips) {
        this.Tips = Tips;
    }

    /**
     * Get 当前值的类型描述，默认为multi。 
     * @return ValueType 当前值的类型描述，默认为multi。
     */
    public String getValueType() {
        return this.ValueType;
    }

    /**
     * Set 当前值的类型描述，默认为multi。
     * @param ValueType 当前值的类型描述，默认为multi。
     */
    public void setValueType(String ValueType) {
        this.ValueType = ValueType;
    }

    public InstanceMultiParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceMultiParam(InstanceMultiParam source) {
        if (source.CurrentValue != null) {
            this.CurrentValue = new String(source.CurrentValue);
        }
        if (source.DefaultValue != null) {
            this.DefaultValue = new String(source.DefaultValue);
        }
        if (source.EnumValue != null) {
            this.EnumValue = new String[source.EnumValue.length];
            for (int i = 0; i < source.EnumValue.length; i++) {
                this.EnumValue[i] = new String(source.EnumValue[i]);
            }
        }
        if (source.NeedRestart != null) {
            this.NeedRestart = new String(source.NeedRestart);
        }
        if (source.ParamName != null) {
            this.ParamName = new String(source.ParamName);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CurrentValue", this.CurrentValue);
        this.setParamSimple(map, prefix + "DefaultValue", this.DefaultValue);
        this.setParamArraySimple(map, prefix + "EnumValue.", this.EnumValue);
        this.setParamSimple(map, prefix + "NeedRestart", this.NeedRestart);
        this.setParamSimple(map, prefix + "ParamName", this.ParamName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "Tips.", this.Tips);
        this.setParamSimple(map, prefix + "ValueType", this.ValueType);

    }
}

