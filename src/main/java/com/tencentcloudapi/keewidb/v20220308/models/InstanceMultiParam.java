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
package com.tencentcloudapi.keewidb.v20220308.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceMultiParam extends AbstractModel {

    /**
    * 参数名
    */
    @SerializedName("ParamName")
    @Expose
    private String ParamName;

    /**
    * 参数类型：multi
    */
    @SerializedName("ValueType")
    @Expose
    private String ValueType;

    /**
    * 修改后是否需要重启：true，false
    */
    @SerializedName("NeedRestart")
    @Expose
    private String NeedRestart;

    /**
    * 参数默认值
    */
    @SerializedName("DefaultValue")
    @Expose
    private String DefaultValue;

    /**
    * 当前运行参数值
    */
    @SerializedName("CurrentValue")
    @Expose
    private String CurrentValue;

    /**
    * 参数说明
    */
    @SerializedName("Tips")
    @Expose
    private String Tips;

    /**
    * 参数说明
    */
    @SerializedName("EnumValue")
    @Expose
    private String [] EnumValue;

    /**
    * 参数状态, 1: 修改中， 2：修改完成
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get 参数名 
     * @return ParamName 参数名
     */
    public String getParamName() {
        return this.ParamName;
    }

    /**
     * Set 参数名
     * @param ParamName 参数名
     */
    public void setParamName(String ParamName) {
        this.ParamName = ParamName;
    }

    /**
     * Get 参数类型：multi 
     * @return ValueType 参数类型：multi
     */
    public String getValueType() {
        return this.ValueType;
    }

    /**
     * Set 参数类型：multi
     * @param ValueType 参数类型：multi
     */
    public void setValueType(String ValueType) {
        this.ValueType = ValueType;
    }

    /**
     * Get 修改后是否需要重启：true，false 
     * @return NeedRestart 修改后是否需要重启：true，false
     */
    public String getNeedRestart() {
        return this.NeedRestart;
    }

    /**
     * Set 修改后是否需要重启：true，false
     * @param NeedRestart 修改后是否需要重启：true，false
     */
    public void setNeedRestart(String NeedRestart) {
        this.NeedRestart = NeedRestart;
    }

    /**
     * Get 参数默认值 
     * @return DefaultValue 参数默认值
     */
    public String getDefaultValue() {
        return this.DefaultValue;
    }

    /**
     * Set 参数默认值
     * @param DefaultValue 参数默认值
     */
    public void setDefaultValue(String DefaultValue) {
        this.DefaultValue = DefaultValue;
    }

    /**
     * Get 当前运行参数值 
     * @return CurrentValue 当前运行参数值
     */
    public String getCurrentValue() {
        return this.CurrentValue;
    }

    /**
     * Set 当前运行参数值
     * @param CurrentValue 当前运行参数值
     */
    public void setCurrentValue(String CurrentValue) {
        this.CurrentValue = CurrentValue;
    }

    /**
     * Get 参数说明 
     * @return Tips 参数说明
     */
    public String getTips() {
        return this.Tips;
    }

    /**
     * Set 参数说明
     * @param Tips 参数说明
     */
    public void setTips(String Tips) {
        this.Tips = Tips;
    }

    /**
     * Get 参数说明 
     * @return EnumValue 参数说明
     */
    public String [] getEnumValue() {
        return this.EnumValue;
    }

    /**
     * Set 参数说明
     * @param EnumValue 参数说明
     */
    public void setEnumValue(String [] EnumValue) {
        this.EnumValue = EnumValue;
    }

    /**
     * Get 参数状态, 1: 修改中， 2：修改完成 
     * @return Status 参数状态, 1: 修改中， 2：修改完成
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 参数状态, 1: 修改中， 2：修改完成
     * @param Status 参数状态, 1: 修改中， 2：修改完成
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public InstanceMultiParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceMultiParam(InstanceMultiParam source) {
        if (source.ParamName != null) {
            this.ParamName = new String(source.ParamName);
        }
        if (source.ValueType != null) {
            this.ValueType = new String(source.ValueType);
        }
        if (source.NeedRestart != null) {
            this.NeedRestart = new String(source.NeedRestart);
        }
        if (source.DefaultValue != null) {
            this.DefaultValue = new String(source.DefaultValue);
        }
        if (source.CurrentValue != null) {
            this.CurrentValue = new String(source.CurrentValue);
        }
        if (source.Tips != null) {
            this.Tips = new String(source.Tips);
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
        this.setParamSimple(map, prefix + "ParamName", this.ParamName);
        this.setParamSimple(map, prefix + "ValueType", this.ValueType);
        this.setParamSimple(map, prefix + "NeedRestart", this.NeedRestart);
        this.setParamSimple(map, prefix + "DefaultValue", this.DefaultValue);
        this.setParamSimple(map, prefix + "CurrentValue", this.CurrentValue);
        this.setParamSimple(map, prefix + "Tips", this.Tips);
        this.setParamArraySimple(map, prefix + "EnumValue.", this.EnumValue);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

