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

public class InstanceTextParam extends AbstractModel {

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
    * 修改参数值之后是否需要重启。
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
    * Text 类型参数对应的值。
    */
    @SerializedName("TextValue")
    @Expose
    private String TextValue;

    /**
    * 参数说明。
    */
    @SerializedName("Tips")
    @Expose
    private String [] Tips;

    /**
    * 参数值类型说明。
    */
    @SerializedName("ValueType")
    @Expose
    private String ValueType;

    /**
    * 是否为运行中的参数值。
- 1：运行中参数值。
- 0：非运行中参数值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

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
     * Get 修改参数值之后是否需要重启。 
     * @return NeedRestart 修改参数值之后是否需要重启。
     */
    public String getNeedRestart() {
        return this.NeedRestart;
    }

    /**
     * Set 修改参数值之后是否需要重启。
     * @param NeedRestart 修改参数值之后是否需要重启。
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
     * Get Text 类型参数对应的值。 
     * @return TextValue Text 类型参数对应的值。
     */
    public String getTextValue() {
        return this.TextValue;
    }

    /**
     * Set Text 类型参数对应的值。
     * @param TextValue Text 类型参数对应的值。
     */
    public void setTextValue(String TextValue) {
        this.TextValue = TextValue;
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
     * Get 参数值类型说明。 
     * @return ValueType 参数值类型说明。
     */
    public String getValueType() {
        return this.ValueType;
    }

    /**
     * Set 参数值类型说明。
     * @param ValueType 参数值类型说明。
     */
    public void setValueType(String ValueType) {
        this.ValueType = ValueType;
    }

    /**
     * Get 是否为运行中的参数值。
- 1：运行中参数值。
- 0：非运行中参数值。 
     * @return Status 是否为运行中的参数值。
- 1：运行中参数值。
- 0：非运行中参数值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 是否为运行中的参数值。
- 1：运行中参数值。
- 0：非运行中参数值。
     * @param Status 是否为运行中的参数值。
- 1：运行中参数值。
- 0：非运行中参数值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public InstanceTextParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceTextParam(InstanceTextParam source) {
        if (source.CurrentValue != null) {
            this.CurrentValue = new String(source.CurrentValue);
        }
        if (source.DefaultValue != null) {
            this.DefaultValue = new String(source.DefaultValue);
        }
        if (source.NeedRestart != null) {
            this.NeedRestart = new String(source.NeedRestart);
        }
        if (source.ParamName != null) {
            this.ParamName = new String(source.ParamName);
        }
        if (source.TextValue != null) {
            this.TextValue = new String(source.TextValue);
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
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CurrentValue", this.CurrentValue);
        this.setParamSimple(map, prefix + "DefaultValue", this.DefaultValue);
        this.setParamSimple(map, prefix + "NeedRestart", this.NeedRestart);
        this.setParamSimple(map, prefix + "ParamName", this.ParamName);
        this.setParamSimple(map, prefix + "TextValue", this.TextValue);
        this.setParamArraySimple(map, prefix + "Tips.", this.Tips);
        this.setParamSimple(map, prefix + "ValueType", this.ValueType);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

