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
    * 参数名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 参数类型
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 子参数
    */
    @SerializedName("SubParams")
    @Expose
    private WidgetParam [] SubParams;

    /**
    * 默认值, Input未指定时，使用该值
    */
    @SerializedName("DefaultValue")
    @Expose
    private String DefaultValue;

    /**
    * 输入的值
    */
    @SerializedName("Input")
    @Expose
    private AgentInput Input;

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
     * Get 参数类型 
     * @return Type 参数类型
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 参数类型
     * @param Type 参数类型
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 子参数 
     * @return SubParams 子参数
     */
    public WidgetParam [] getSubParams() {
        return this.SubParams;
    }

    /**
     * Set 子参数
     * @param SubParams 子参数
     */
    public void setSubParams(WidgetParam [] SubParams) {
        this.SubParams = SubParams;
    }

    /**
     * Get 默认值, Input未指定时，使用该值 
     * @return DefaultValue 默认值, Input未指定时，使用该值
     */
    public String getDefaultValue() {
        return this.DefaultValue;
    }

    /**
     * Set 默认值, Input未指定时，使用该值
     * @param DefaultValue 默认值, Input未指定时，使用该值
     */
    public void setDefaultValue(String DefaultValue) {
        this.DefaultValue = DefaultValue;
    }

    /**
     * Get 输入的值 
     * @return Input 输入的值
     */
    public AgentInput getInput() {
        return this.Input;
    }

    /**
     * Set 输入的值
     * @param Input 输入的值
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

