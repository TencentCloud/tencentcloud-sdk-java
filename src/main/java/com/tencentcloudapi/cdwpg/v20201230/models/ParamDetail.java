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
package com.tencentcloudapi.cdwpg.v20201230.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ParamDetail extends AbstractModel {

    /**
    * 参数名
    */
    @SerializedName("ParamName")
    @Expose
    private String ParamName;

    /**
    * 默认值
    */
    @SerializedName("DefaultValue")
    @Expose
    private String DefaultValue;

    /**
    * 是否需要重启
    */
    @SerializedName("NeedRestart")
    @Expose
    private Boolean NeedRestart;

    /**
    * 当前运行值
    */
    @SerializedName("RunningValue")
    @Expose
    private String RunningValue;

    /**
    * 取值范围
    */
    @SerializedName("ValueRange")
    @Expose
    private ValueRange ValueRange;

    /**
    * 单位
    */
    @SerializedName("Unit")
    @Expose
    private String Unit;

    /**
    * 英文简介
    */
    @SerializedName("ShortDesc")
    @Expose
    private String ShortDesc;

    /**
    * 参数名
    */
    @SerializedName("ParameterName")
    @Expose
    private String ParameterName;

    /**
    * 最新修改值
    */
    @SerializedName("LatestValue")
    @Expose
    private String LatestValue;

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
     * Get 是否需要重启 
     * @return NeedRestart 是否需要重启
     */
    public Boolean getNeedRestart() {
        return this.NeedRestart;
    }

    /**
     * Set 是否需要重启
     * @param NeedRestart 是否需要重启
     */
    public void setNeedRestart(Boolean NeedRestart) {
        this.NeedRestart = NeedRestart;
    }

    /**
     * Get 当前运行值 
     * @return RunningValue 当前运行值
     */
    public String getRunningValue() {
        return this.RunningValue;
    }

    /**
     * Set 当前运行值
     * @param RunningValue 当前运行值
     */
    public void setRunningValue(String RunningValue) {
        this.RunningValue = RunningValue;
    }

    /**
     * Get 取值范围 
     * @return ValueRange 取值范围
     */
    public ValueRange getValueRange() {
        return this.ValueRange;
    }

    /**
     * Set 取值范围
     * @param ValueRange 取值范围
     */
    public void setValueRange(ValueRange ValueRange) {
        this.ValueRange = ValueRange;
    }

    /**
     * Get 单位 
     * @return Unit 单位
     */
    public String getUnit() {
        return this.Unit;
    }

    /**
     * Set 单位
     * @param Unit 单位
     */
    public void setUnit(String Unit) {
        this.Unit = Unit;
    }

    /**
     * Get 英文简介 
     * @return ShortDesc 英文简介
     */
    public String getShortDesc() {
        return this.ShortDesc;
    }

    /**
     * Set 英文简介
     * @param ShortDesc 英文简介
     */
    public void setShortDesc(String ShortDesc) {
        this.ShortDesc = ShortDesc;
    }

    /**
     * Get 参数名 
     * @return ParameterName 参数名
     */
    public String getParameterName() {
        return this.ParameterName;
    }

    /**
     * Set 参数名
     * @param ParameterName 参数名
     */
    public void setParameterName(String ParameterName) {
        this.ParameterName = ParameterName;
    }

    /**
     * Get 最新修改值 
     * @return LatestValue 最新修改值
     */
    public String getLatestValue() {
        return this.LatestValue;
    }

    /**
     * Set 最新修改值
     * @param LatestValue 最新修改值
     */
    public void setLatestValue(String LatestValue) {
        this.LatestValue = LatestValue;
    }

    public ParamDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ParamDetail(ParamDetail source) {
        if (source.ParamName != null) {
            this.ParamName = new String(source.ParamName);
        }
        if (source.DefaultValue != null) {
            this.DefaultValue = new String(source.DefaultValue);
        }
        if (source.NeedRestart != null) {
            this.NeedRestart = new Boolean(source.NeedRestart);
        }
        if (source.RunningValue != null) {
            this.RunningValue = new String(source.RunningValue);
        }
        if (source.ValueRange != null) {
            this.ValueRange = new ValueRange(source.ValueRange);
        }
        if (source.Unit != null) {
            this.Unit = new String(source.Unit);
        }
        if (source.ShortDesc != null) {
            this.ShortDesc = new String(source.ShortDesc);
        }
        if (source.ParameterName != null) {
            this.ParameterName = new String(source.ParameterName);
        }
        if (source.LatestValue != null) {
            this.LatestValue = new String(source.LatestValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ParamName", this.ParamName);
        this.setParamSimple(map, prefix + "DefaultValue", this.DefaultValue);
        this.setParamSimple(map, prefix + "NeedRestart", this.NeedRestart);
        this.setParamSimple(map, prefix + "RunningValue", this.RunningValue);
        this.setParamObj(map, prefix + "ValueRange.", this.ValueRange);
        this.setParamSimple(map, prefix + "Unit", this.Unit);
        this.setParamSimple(map, prefix + "ShortDesc", this.ShortDesc);
        this.setParamSimple(map, prefix + "ParameterName", this.ParameterName);
        this.setParamSimple(map, prefix + "LatestValue", this.LatestValue);

    }
}

