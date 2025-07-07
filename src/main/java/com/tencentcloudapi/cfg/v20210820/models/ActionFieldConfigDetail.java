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
package com.tencentcloudapi.cfg.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ActionFieldConfigDetail extends AbstractModel {

    /**
    * 组件类型
可选项如下：
input  文本框
textarea  多行文本框
number  数值输入框
select   选择器
cascader  级联选择器
radio  单选
time   时间选择
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 组件label
    */
    @SerializedName("Lable")
    @Expose
    private String Lable;

    /**
    * 组件唯一标识， 传回后端时的key
    */
    @SerializedName("Field")
    @Expose
    private String Field;

    /**
    * 默认值
    */
    @SerializedName("DefaultValue")
    @Expose
    private String DefaultValue;

    /**
    * 支持配置项如下,可根据需要选择配置项，不需要配置是设置空{}：

{

  placeholder: string (占位符)

  tooltip: string (提示信息)

  reg: RegExp (对输入内容格式进行正则校验的规则)

  max: number (对于输入框，限制最大输入字符数，对于数值输入框，设置上限)

  min: number (对于数值输入框，设置下限)

  step: number (设置数值输入框的步长，默认为1)

  format: string (时间选择的格式，如YYYY-MM-DD表示年月日, YYYY-MM-DD HH:mm:ss 表示时分秒)

  separator:  string[] (多行输入框的分隔符，不传或者为空时表示不分隔，直接返回用户输入的文本字符串)

  multiple: boolean (是否多选,对选择器和级联选择器有效)

  options:  选择器的选项【支持以下两种形式】

直接给定选项数组  { value: string; label: string }[]
通过调接口获取选项                                                                                                                                       { api: string(接口地址),                                                                                                                                       params: string[] (接口参数,对应于参数配置的field，前端根据field对应的所有组件的输入值作为参数查询数据， 为空时在组件加载时直接请求数据)                                                                                                    }
}
    */
    @SerializedName("Config")
    @Expose
    private String Config;

    /**
    * 是否必填 (0 -- 否   1-- 是)
    */
    @SerializedName("Required")
    @Expose
    private Long Required;

    /**
    * compute配置依赖的其他field满足的条件时通过校验（如：三个表单项中必须至少有一个填写了）

[fieldName,

{ config:  此项保留，等待后面具体场景细化  }

]
    */
    @SerializedName("Validate")
    @Expose
    private String Validate;

    /**
    * 是否可见
    */
    @SerializedName("Visible")
    @Expose
    private String Visible;

    /**
     * Get 组件类型
可选项如下：
input  文本框
textarea  多行文本框
number  数值输入框
select   选择器
cascader  级联选择器
radio  单选
time   时间选择 
     * @return Type 组件类型
可选项如下：
input  文本框
textarea  多行文本框
number  数值输入框
select   选择器
cascader  级联选择器
radio  单选
time   时间选择
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 组件类型
可选项如下：
input  文本框
textarea  多行文本框
number  数值输入框
select   选择器
cascader  级联选择器
radio  单选
time   时间选择
     * @param Type 组件类型
可选项如下：
input  文本框
textarea  多行文本框
number  数值输入框
select   选择器
cascader  级联选择器
radio  单选
time   时间选择
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 组件label 
     * @return Lable 组件label
     */
    public String getLable() {
        return this.Lable;
    }

    /**
     * Set 组件label
     * @param Lable 组件label
     */
    public void setLable(String Lable) {
        this.Lable = Lable;
    }

    /**
     * Get 组件唯一标识， 传回后端时的key 
     * @return Field 组件唯一标识， 传回后端时的key
     */
    public String getField() {
        return this.Field;
    }

    /**
     * Set 组件唯一标识， 传回后端时的key
     * @param Field 组件唯一标识， 传回后端时的key
     */
    public void setField(String Field) {
        this.Field = Field;
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
     * Get 支持配置项如下,可根据需要选择配置项，不需要配置是设置空{}：

{

  placeholder: string (占位符)

  tooltip: string (提示信息)

  reg: RegExp (对输入内容格式进行正则校验的规则)

  max: number (对于输入框，限制最大输入字符数，对于数值输入框，设置上限)

  min: number (对于数值输入框，设置下限)

  step: number (设置数值输入框的步长，默认为1)

  format: string (时间选择的格式，如YYYY-MM-DD表示年月日, YYYY-MM-DD HH:mm:ss 表示时分秒)

  separator:  string[] (多行输入框的分隔符，不传或者为空时表示不分隔，直接返回用户输入的文本字符串)

  multiple: boolean (是否多选,对选择器和级联选择器有效)

  options:  选择器的选项【支持以下两种形式】

直接给定选项数组  { value: string; label: string }[]
通过调接口获取选项                                                                                                                                       { api: string(接口地址),                                                                                                                                       params: string[] (接口参数,对应于参数配置的field，前端根据field对应的所有组件的输入值作为参数查询数据， 为空时在组件加载时直接请求数据)                                                                                                    }
} 
     * @return Config 支持配置项如下,可根据需要选择配置项，不需要配置是设置空{}：

{

  placeholder: string (占位符)

  tooltip: string (提示信息)

  reg: RegExp (对输入内容格式进行正则校验的规则)

  max: number (对于输入框，限制最大输入字符数，对于数值输入框，设置上限)

  min: number (对于数值输入框，设置下限)

  step: number (设置数值输入框的步长，默认为1)

  format: string (时间选择的格式，如YYYY-MM-DD表示年月日, YYYY-MM-DD HH:mm:ss 表示时分秒)

  separator:  string[] (多行输入框的分隔符，不传或者为空时表示不分隔，直接返回用户输入的文本字符串)

  multiple: boolean (是否多选,对选择器和级联选择器有效)

  options:  选择器的选项【支持以下两种形式】

直接给定选项数组  { value: string; label: string }[]
通过调接口获取选项                                                                                                                                       { api: string(接口地址),                                                                                                                                       params: string[] (接口参数,对应于参数配置的field，前端根据field对应的所有组件的输入值作为参数查询数据， 为空时在组件加载时直接请求数据)                                                                                                    }
}
     */
    public String getConfig() {
        return this.Config;
    }

    /**
     * Set 支持配置项如下,可根据需要选择配置项，不需要配置是设置空{}：

{

  placeholder: string (占位符)

  tooltip: string (提示信息)

  reg: RegExp (对输入内容格式进行正则校验的规则)

  max: number (对于输入框，限制最大输入字符数，对于数值输入框，设置上限)

  min: number (对于数值输入框，设置下限)

  step: number (设置数值输入框的步长，默认为1)

  format: string (时间选择的格式，如YYYY-MM-DD表示年月日, YYYY-MM-DD HH:mm:ss 表示时分秒)

  separator:  string[] (多行输入框的分隔符，不传或者为空时表示不分隔，直接返回用户输入的文本字符串)

  multiple: boolean (是否多选,对选择器和级联选择器有效)

  options:  选择器的选项【支持以下两种形式】

直接给定选项数组  { value: string; label: string }[]
通过调接口获取选项                                                                                                                                       { api: string(接口地址),                                                                                                                                       params: string[] (接口参数,对应于参数配置的field，前端根据field对应的所有组件的输入值作为参数查询数据， 为空时在组件加载时直接请求数据)                                                                                                    }
}
     * @param Config 支持配置项如下,可根据需要选择配置项，不需要配置是设置空{}：

{

  placeholder: string (占位符)

  tooltip: string (提示信息)

  reg: RegExp (对输入内容格式进行正则校验的规则)

  max: number (对于输入框，限制最大输入字符数，对于数值输入框，设置上限)

  min: number (对于数值输入框，设置下限)

  step: number (设置数值输入框的步长，默认为1)

  format: string (时间选择的格式，如YYYY-MM-DD表示年月日, YYYY-MM-DD HH:mm:ss 表示时分秒)

  separator:  string[] (多行输入框的分隔符，不传或者为空时表示不分隔，直接返回用户输入的文本字符串)

  multiple: boolean (是否多选,对选择器和级联选择器有效)

  options:  选择器的选项【支持以下两种形式】

直接给定选项数组  { value: string; label: string }[]
通过调接口获取选项                                                                                                                                       { api: string(接口地址),                                                                                                                                       params: string[] (接口参数,对应于参数配置的field，前端根据field对应的所有组件的输入值作为参数查询数据， 为空时在组件加载时直接请求数据)                                                                                                    }
}
     */
    public void setConfig(String Config) {
        this.Config = Config;
    }

    /**
     * Get 是否必填 (0 -- 否   1-- 是) 
     * @return Required 是否必填 (0 -- 否   1-- 是)
     */
    public Long getRequired() {
        return this.Required;
    }

    /**
     * Set 是否必填 (0 -- 否   1-- 是)
     * @param Required 是否必填 (0 -- 否   1-- 是)
     */
    public void setRequired(Long Required) {
        this.Required = Required;
    }

    /**
     * Get compute配置依赖的其他field满足的条件时通过校验（如：三个表单项中必须至少有一个填写了）

[fieldName,

{ config:  此项保留，等待后面具体场景细化  }

] 
     * @return Validate compute配置依赖的其他field满足的条件时通过校验（如：三个表单项中必须至少有一个填写了）

[fieldName,

{ config:  此项保留，等待后面具体场景细化  }

]
     */
    public String getValidate() {
        return this.Validate;
    }

    /**
     * Set compute配置依赖的其他field满足的条件时通过校验（如：三个表单项中必须至少有一个填写了）

[fieldName,

{ config:  此项保留，等待后面具体场景细化  }

]
     * @param Validate compute配置依赖的其他field满足的条件时通过校验（如：三个表单项中必须至少有一个填写了）

[fieldName,

{ config:  此项保留，等待后面具体场景细化  }

]
     */
    public void setValidate(String Validate) {
        this.Validate = Validate;
    }

    /**
     * Get 是否可见 
     * @return Visible 是否可见
     */
    public String getVisible() {
        return this.Visible;
    }

    /**
     * Set 是否可见
     * @param Visible 是否可见
     */
    public void setVisible(String Visible) {
        this.Visible = Visible;
    }

    public ActionFieldConfigDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ActionFieldConfigDetail(ActionFieldConfigDetail source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Lable != null) {
            this.Lable = new String(source.Lable);
        }
        if (source.Field != null) {
            this.Field = new String(source.Field);
        }
        if (source.DefaultValue != null) {
            this.DefaultValue = new String(source.DefaultValue);
        }
        if (source.Config != null) {
            this.Config = new String(source.Config);
        }
        if (source.Required != null) {
            this.Required = new Long(source.Required);
        }
        if (source.Validate != null) {
            this.Validate = new String(source.Validate);
        }
        if (source.Visible != null) {
            this.Visible = new String(source.Visible);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Lable", this.Lable);
        this.setParamSimple(map, prefix + "Field", this.Field);
        this.setParamSimple(map, prefix + "DefaultValue", this.DefaultValue);
        this.setParamSimple(map, prefix + "Config", this.Config);
        this.setParamSimple(map, prefix + "Required", this.Required);
        this.setParamSimple(map, prefix + "Validate", this.Validate);
        this.setParamSimple(map, prefix + "Visible", this.Visible);

    }
}

