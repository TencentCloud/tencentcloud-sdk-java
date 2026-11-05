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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceTextParam extends AbstractModel {

    /**
    * <p>参数名称。</p>
    */
    @SerializedName("ParamName")
    @Expose
    private String ParamName;

    /**
    * <p>参数类型。例如：text。</p>
    */
    @SerializedName("ValueType")
    @Expose
    private String ValueType;

    /**
    * <p>参数修改后是否需要重启。</p><ul><li>true：需要。</li><li>false：不需要。</li></ul>
    */
    @SerializedName("NeedRestart")
    @Expose
    private String NeedRestart;

    /**
    * <p>参数默认值。</p>
    */
    @SerializedName("DefaultValue")
    @Expose
    private String DefaultValue;

    /**
    * <p>参数当前运行值。</p>
    */
    @SerializedName("CurrentValue")
    @Expose
    private String CurrentValue;

    /**
    * <p>参数说明。</p>
    */
    @SerializedName("Tips")
    @Expose
    private String Tips;

    /**
    * <p>参数可取值。</p>
    */
    @SerializedName("TextValue")
    @Expose
    private String [] TextValue;

    /**
    * <p>参数修改状态。</p><ul><li>1: 修改中。</li><li>2：修改完成。</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>参数类型</p><p>枚举值：</p><ul><li>redis： cache节点支持的参数</li><li>redis-interface： 代理proxy支持的参数</li><li>tendis： tendis支持的参数</li></ul>
    */
    @SerializedName("ParamType")
    @Expose
    private String ParamType;

    /**
    * <p>当前实例是否支持该特性</p>
    */
    @SerializedName("FeatureSupported")
    @Expose
    private Boolean FeatureSupported;

    /**
    * <p>新特性上线日期</p><p>参数格式：时间格式YYYY-MM-DD</p>
    */
    @SerializedName("NewFeatureOnlineTime")
    @Expose
    private String NewFeatureOnlineTime;

    /**
    * <p>正则校验规则</p>
    */
    @SerializedName("Pattern")
    @Expose
    private String Pattern;

    /**
    * <p>输入格式描述</p>
    */
    @SerializedName("InputDescription")
    @Expose
    private String InputDescription;

    /**
     * Get <p>参数名称。</p> 
     * @return ParamName <p>参数名称。</p>
     */
    public String getParamName() {
        return this.ParamName;
    }

    /**
     * Set <p>参数名称。</p>
     * @param ParamName <p>参数名称。</p>
     */
    public void setParamName(String ParamName) {
        this.ParamName = ParamName;
    }

    /**
     * Get <p>参数类型。例如：text。</p> 
     * @return ValueType <p>参数类型。例如：text。</p>
     */
    public String getValueType() {
        return this.ValueType;
    }

    /**
     * Set <p>参数类型。例如：text。</p>
     * @param ValueType <p>参数类型。例如：text。</p>
     */
    public void setValueType(String ValueType) {
        this.ValueType = ValueType;
    }

    /**
     * Get <p>参数修改后是否需要重启。</p><ul><li>true：需要。</li><li>false：不需要。</li></ul> 
     * @return NeedRestart <p>参数修改后是否需要重启。</p><ul><li>true：需要。</li><li>false：不需要。</li></ul>
     */
    public String getNeedRestart() {
        return this.NeedRestart;
    }

    /**
     * Set <p>参数修改后是否需要重启。</p><ul><li>true：需要。</li><li>false：不需要。</li></ul>
     * @param NeedRestart <p>参数修改后是否需要重启。</p><ul><li>true：需要。</li><li>false：不需要。</li></ul>
     */
    public void setNeedRestart(String NeedRestart) {
        this.NeedRestart = NeedRestart;
    }

    /**
     * Get <p>参数默认值。</p> 
     * @return DefaultValue <p>参数默认值。</p>
     */
    public String getDefaultValue() {
        return this.DefaultValue;
    }

    /**
     * Set <p>参数默认值。</p>
     * @param DefaultValue <p>参数默认值。</p>
     */
    public void setDefaultValue(String DefaultValue) {
        this.DefaultValue = DefaultValue;
    }

    /**
     * Get <p>参数当前运行值。</p> 
     * @return CurrentValue <p>参数当前运行值。</p>
     */
    public String getCurrentValue() {
        return this.CurrentValue;
    }

    /**
     * Set <p>参数当前运行值。</p>
     * @param CurrentValue <p>参数当前运行值。</p>
     */
    public void setCurrentValue(String CurrentValue) {
        this.CurrentValue = CurrentValue;
    }

    /**
     * Get <p>参数说明。</p> 
     * @return Tips <p>参数说明。</p>
     */
    public String getTips() {
        return this.Tips;
    }

    /**
     * Set <p>参数说明。</p>
     * @param Tips <p>参数说明。</p>
     */
    public void setTips(String Tips) {
        this.Tips = Tips;
    }

    /**
     * Get <p>参数可取值。</p> 
     * @return TextValue <p>参数可取值。</p>
     */
    public String [] getTextValue() {
        return this.TextValue;
    }

    /**
     * Set <p>参数可取值。</p>
     * @param TextValue <p>参数可取值。</p>
     */
    public void setTextValue(String [] TextValue) {
        this.TextValue = TextValue;
    }

    /**
     * Get <p>参数修改状态。</p><ul><li>1: 修改中。</li><li>2：修改完成。</li></ul> 
     * @return Status <p>参数修改状态。</p><ul><li>1: 修改中。</li><li>2：修改完成。</li></ul>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>参数修改状态。</p><ul><li>1: 修改中。</li><li>2：修改完成。</li></ul>
     * @param Status <p>参数修改状态。</p><ul><li>1: 修改中。</li><li>2：修改完成。</li></ul>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>参数类型</p><p>枚举值：</p><ul><li>redis： cache节点支持的参数</li><li>redis-interface： 代理proxy支持的参数</li><li>tendis： tendis支持的参数</li></ul> 
     * @return ParamType <p>参数类型</p><p>枚举值：</p><ul><li>redis： cache节点支持的参数</li><li>redis-interface： 代理proxy支持的参数</li><li>tendis： tendis支持的参数</li></ul>
     */
    public String getParamType() {
        return this.ParamType;
    }

    /**
     * Set <p>参数类型</p><p>枚举值：</p><ul><li>redis： cache节点支持的参数</li><li>redis-interface： 代理proxy支持的参数</li><li>tendis： tendis支持的参数</li></ul>
     * @param ParamType <p>参数类型</p><p>枚举值：</p><ul><li>redis： cache节点支持的参数</li><li>redis-interface： 代理proxy支持的参数</li><li>tendis： tendis支持的参数</li></ul>
     */
    public void setParamType(String ParamType) {
        this.ParamType = ParamType;
    }

    /**
     * Get <p>当前实例是否支持该特性</p> 
     * @return FeatureSupported <p>当前实例是否支持该特性</p>
     */
    public Boolean getFeatureSupported() {
        return this.FeatureSupported;
    }

    /**
     * Set <p>当前实例是否支持该特性</p>
     * @param FeatureSupported <p>当前实例是否支持该特性</p>
     */
    public void setFeatureSupported(Boolean FeatureSupported) {
        this.FeatureSupported = FeatureSupported;
    }

    /**
     * Get <p>新特性上线日期</p><p>参数格式：时间格式YYYY-MM-DD</p> 
     * @return NewFeatureOnlineTime <p>新特性上线日期</p><p>参数格式：时间格式YYYY-MM-DD</p>
     */
    public String getNewFeatureOnlineTime() {
        return this.NewFeatureOnlineTime;
    }

    /**
     * Set <p>新特性上线日期</p><p>参数格式：时间格式YYYY-MM-DD</p>
     * @param NewFeatureOnlineTime <p>新特性上线日期</p><p>参数格式：时间格式YYYY-MM-DD</p>
     */
    public void setNewFeatureOnlineTime(String NewFeatureOnlineTime) {
        this.NewFeatureOnlineTime = NewFeatureOnlineTime;
    }

    /**
     * Get <p>正则校验规则</p> 
     * @return Pattern <p>正则校验规则</p>
     */
    public String getPattern() {
        return this.Pattern;
    }

    /**
     * Set <p>正则校验规则</p>
     * @param Pattern <p>正则校验规则</p>
     */
    public void setPattern(String Pattern) {
        this.Pattern = Pattern;
    }

    /**
     * Get <p>输入格式描述</p> 
     * @return InputDescription <p>输入格式描述</p>
     */
    public String getInputDescription() {
        return this.InputDescription;
    }

    /**
     * Set <p>输入格式描述</p>
     * @param InputDescription <p>输入格式描述</p>
     */
    public void setInputDescription(String InputDescription) {
        this.InputDescription = InputDescription;
    }

    public InstanceTextParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceTextParam(InstanceTextParam source) {
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
        if (source.TextValue != null) {
            this.TextValue = new String[source.TextValue.length];
            for (int i = 0; i < source.TextValue.length; i++) {
                this.TextValue[i] = new String(source.TextValue[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.ParamType != null) {
            this.ParamType = new String(source.ParamType);
        }
        if (source.FeatureSupported != null) {
            this.FeatureSupported = new Boolean(source.FeatureSupported);
        }
        if (source.NewFeatureOnlineTime != null) {
            this.NewFeatureOnlineTime = new String(source.NewFeatureOnlineTime);
        }
        if (source.Pattern != null) {
            this.Pattern = new String(source.Pattern);
        }
        if (source.InputDescription != null) {
            this.InputDescription = new String(source.InputDescription);
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
        this.setParamArraySimple(map, prefix + "TextValue.", this.TextValue);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ParamType", this.ParamType);
        this.setParamSimple(map, prefix + "FeatureSupported", this.FeatureSupported);
        this.setParamSimple(map, prefix + "NewFeatureOnlineTime", this.NewFeatureOnlineTime);
        this.setParamSimple(map, prefix + "Pattern", this.Pattern);
        this.setParamSimple(map, prefix + "InputDescription", this.InputDescription);

    }
}

