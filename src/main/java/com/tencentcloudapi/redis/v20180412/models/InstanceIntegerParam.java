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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceIntegerParam extends AbstractModel{

    /**
    * 参数名
    */
    @SerializedName("ParamName")
    @Expose
    private String ParamName;

    /**
    * 参数类型：integer
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
    * 参数最小值
    */
    @SerializedName("Min")
    @Expose
    private String Min;

    /**
    * 参数最大值
    */
    @SerializedName("Max")
    @Expose
    private String Max;

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
     * Get 参数类型：integer 
     * @return ValueType 参数类型：integer
     */
    public String getValueType() {
        return this.ValueType;
    }

    /**
     * Set 参数类型：integer
     * @param ValueType 参数类型：integer
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
     * Get 参数最小值 
     * @return Min 参数最小值
     */
    public String getMin() {
        return this.Min;
    }

    /**
     * Set 参数最小值
     * @param Min 参数最小值
     */
    public void setMin(String Min) {
        this.Min = Min;
    }

    /**
     * Get 参数最大值 
     * @return Max 参数最大值
     */
    public String getMax() {
        return this.Max;
    }

    /**
     * Set 参数最大值
     * @param Max 参数最大值
     */
    public void setMax(String Max) {
        this.Max = Max;
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
        this.setParamSimple(map, prefix + "Min", this.Min);
        this.setParamSimple(map, prefix + "Max", this.Max);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

