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
package com.tencentcloudapi.tat.v20201028.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PreviewReplacedCommandContentRequest extends AbstractModel{

    /**
    * 本次预览采用的自定义参数。字段类型为 json encoded string，如：{\"varA\": \"222\"}。
key 为自定义参数名称，value 为该参数的取值。kv 均为字符串型。
自定义参数最多 20 个。
自定义参数名称需符合以下规范：字符数目上限 64，可选范围【a-zA-Z0-9-_】。
如果将预览的 CommandId 设置过 DefaultParameters，本参数可以为空。
    */
    @SerializedName("Parameters")
    @Expose
    private String Parameters;

    /**
    * 要进行替换预览的命令，如果有设置过 DefaultParameters，会与 Parameters 进行叠加，后者覆盖前者。
CommandId 与 Content，必须且只能提供一个。
    */
    @SerializedName("CommandId")
    @Expose
    private String CommandId;

    /**
    * 要预览的命令内容，经 Base64 编码，长度不可超过 64KB。
CommandId 与 Content，必须且只能提供一个。
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
     * Get 本次预览采用的自定义参数。字段类型为 json encoded string，如：{\"varA\": \"222\"}。
key 为自定义参数名称，value 为该参数的取值。kv 均为字符串型。
自定义参数最多 20 个。
自定义参数名称需符合以下规范：字符数目上限 64，可选范围【a-zA-Z0-9-_】。
如果将预览的 CommandId 设置过 DefaultParameters，本参数可以为空。 
     * @return Parameters 本次预览采用的自定义参数。字段类型为 json encoded string，如：{\"varA\": \"222\"}。
key 为自定义参数名称，value 为该参数的取值。kv 均为字符串型。
自定义参数最多 20 个。
自定义参数名称需符合以下规范：字符数目上限 64，可选范围【a-zA-Z0-9-_】。
如果将预览的 CommandId 设置过 DefaultParameters，本参数可以为空。
     */
    public String getParameters() {
        return this.Parameters;
    }

    /**
     * Set 本次预览采用的自定义参数。字段类型为 json encoded string，如：{\"varA\": \"222\"}。
key 为自定义参数名称，value 为该参数的取值。kv 均为字符串型。
自定义参数最多 20 个。
自定义参数名称需符合以下规范：字符数目上限 64，可选范围【a-zA-Z0-9-_】。
如果将预览的 CommandId 设置过 DefaultParameters，本参数可以为空。
     * @param Parameters 本次预览采用的自定义参数。字段类型为 json encoded string，如：{\"varA\": \"222\"}。
key 为自定义参数名称，value 为该参数的取值。kv 均为字符串型。
自定义参数最多 20 个。
自定义参数名称需符合以下规范：字符数目上限 64，可选范围【a-zA-Z0-9-_】。
如果将预览的 CommandId 设置过 DefaultParameters，本参数可以为空。
     */
    public void setParameters(String Parameters) {
        this.Parameters = Parameters;
    }

    /**
     * Get 要进行替换预览的命令，如果有设置过 DefaultParameters，会与 Parameters 进行叠加，后者覆盖前者。
CommandId 与 Content，必须且只能提供一个。 
     * @return CommandId 要进行替换预览的命令，如果有设置过 DefaultParameters，会与 Parameters 进行叠加，后者覆盖前者。
CommandId 与 Content，必须且只能提供一个。
     */
    public String getCommandId() {
        return this.CommandId;
    }

    /**
     * Set 要进行替换预览的命令，如果有设置过 DefaultParameters，会与 Parameters 进行叠加，后者覆盖前者。
CommandId 与 Content，必须且只能提供一个。
     * @param CommandId 要进行替换预览的命令，如果有设置过 DefaultParameters，会与 Parameters 进行叠加，后者覆盖前者。
CommandId 与 Content，必须且只能提供一个。
     */
    public void setCommandId(String CommandId) {
        this.CommandId = CommandId;
    }

    /**
     * Get 要预览的命令内容，经 Base64 编码，长度不可超过 64KB。
CommandId 与 Content，必须且只能提供一个。 
     * @return Content 要预览的命令内容，经 Base64 编码，长度不可超过 64KB。
CommandId 与 Content，必须且只能提供一个。
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 要预览的命令内容，经 Base64 编码，长度不可超过 64KB。
CommandId 与 Content，必须且只能提供一个。
     * @param Content 要预览的命令内容，经 Base64 编码，长度不可超过 64KB。
CommandId 与 Content，必须且只能提供一个。
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    public PreviewReplacedCommandContentRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PreviewReplacedCommandContentRequest(PreviewReplacedCommandContentRequest source) {
        if (source.Parameters != null) {
            this.Parameters = new String(source.Parameters);
        }
        if (source.CommandId != null) {
            this.CommandId = new String(source.CommandId);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Parameters", this.Parameters);
        this.setParamSimple(map, prefix + "CommandId", this.CommandId);
        this.setParamSimple(map, prefix + "Content", this.Content);

    }
}

