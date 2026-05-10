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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WidgetParam extends AbstractModel {

    /**
    * <p>参数名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>参数类型</p><p>枚举值：</p><ul><li>0： string</li><li>1： int</li><li>2： float</li><li>3： bool</li><li>4： object</li><li>5： array_string</li><li>6： array_int</li><li>7： array_float</li><li>8： array_bool</li><li>9： array_object</li><li>20： array_array</li></ul>
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * <p>子参数</p>
    */
    @SerializedName("SubParams")
    @Expose
    private WidgetParam [] SubParams;

    /**
    * <p>默认值, Input未指定时，使用该值</p>
    */
    @SerializedName("DefaultValue")
    @Expose
    private String DefaultValue;

    /**
    * <p>输入的值</p>
    */
    @SerializedName("Input")
    @Expose
    private AgentInput Input;

    /**
     * Get <p>参数名称</p> 
     * @return Name <p>参数名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>参数名称</p>
     * @param Name <p>参数名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>参数类型</p><p>枚举值：</p><ul><li>0： string</li><li>1： int</li><li>2： float</li><li>3： bool</li><li>4： object</li><li>5： array_string</li><li>6： array_int</li><li>7： array_float</li><li>8： array_bool</li><li>9： array_object</li><li>20： array_array</li></ul> 
     * @return Type <p>参数类型</p><p>枚举值：</p><ul><li>0： string</li><li>1： int</li><li>2： float</li><li>3： bool</li><li>4： object</li><li>5： array_string</li><li>6： array_int</li><li>7： array_float</li><li>8： array_bool</li><li>9： array_object</li><li>20： array_array</li></ul>
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set <p>参数类型</p><p>枚举值：</p><ul><li>0： string</li><li>1： int</li><li>2： float</li><li>3： bool</li><li>4： object</li><li>5： array_string</li><li>6： array_int</li><li>7： array_float</li><li>8： array_bool</li><li>9： array_object</li><li>20： array_array</li></ul>
     * @param Type <p>参数类型</p><p>枚举值：</p><ul><li>0： string</li><li>1： int</li><li>2： float</li><li>3： bool</li><li>4： object</li><li>5： array_string</li><li>6： array_int</li><li>7： array_float</li><li>8： array_bool</li><li>9： array_object</li><li>20： array_array</li></ul>
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get <p>子参数</p> 
     * @return SubParams <p>子参数</p>
     */
    public WidgetParam [] getSubParams() {
        return this.SubParams;
    }

    /**
     * Set <p>子参数</p>
     * @param SubParams <p>子参数</p>
     */
    public void setSubParams(WidgetParam [] SubParams) {
        this.SubParams = SubParams;
    }

    /**
     * Get <p>默认值, Input未指定时，使用该值</p> 
     * @return DefaultValue <p>默认值, Input未指定时，使用该值</p>
     */
    public String getDefaultValue() {
        return this.DefaultValue;
    }

    /**
     * Set <p>默认值, Input未指定时，使用该值</p>
     * @param DefaultValue <p>默认值, Input未指定时，使用该值</p>
     */
    public void setDefaultValue(String DefaultValue) {
        this.DefaultValue = DefaultValue;
    }

    /**
     * Get <p>输入的值</p> 
     * @return Input <p>输入的值</p>
     */
    public AgentInput getInput() {
        return this.Input;
    }

    /**
     * Set <p>输入的值</p>
     * @param Input <p>输入的值</p>
     */
    public void setInput(AgentInput Input) {
        this.Input = Input;
    }

    public WidgetParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WidgetParam(WidgetParam source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.SubParams != null) {
            this.SubParams = new WidgetParam[source.SubParams.length];
            for (int i = 0; i < source.SubParams.length; i++) {
                this.SubParams[i] = new WidgetParam(source.SubParams[i]);
            }
        }
        if (source.DefaultValue != null) {
            this.DefaultValue = new String(source.DefaultValue);
        }
        if (source.Input != null) {
            this.Input = new AgentInput(source.Input);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArrayObj(map, prefix + "SubParams.", this.SubParams);
        this.setParamSimple(map, prefix + "DefaultValue", this.DefaultValue);
        this.setParamObj(map, prefix + "Input.", this.Input);

    }
}

