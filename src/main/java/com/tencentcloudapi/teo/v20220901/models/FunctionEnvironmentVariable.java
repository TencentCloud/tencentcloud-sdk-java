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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FunctionEnvironmentVariable extends AbstractModel {

    /**
    * 变量的名称，限制只能包含大小写字母、数字，特殊字符仅支持 @ . - _ ，最大 64 个字节，不支持重复。
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 变量的值，限制最大 5000 字节，默认值为空。
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * 变量的类型，取值有：
<li>string：字符串类型；</li>
<li>json：json 对象类型。</li>默认值为：string。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get 变量的名称，限制只能包含大小写字母、数字，特殊字符仅支持 @ . - _ ，最大 64 个字节，不支持重复。 
     * @return Key 变量的名称，限制只能包含大小写字母、数字，特殊字符仅支持 @ . - _ ，最大 64 个字节，不支持重复。
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 变量的名称，限制只能包含大小写字母、数字，特殊字符仅支持 @ . - _ ，最大 64 个字节，不支持重复。
     * @param Key 变量的名称，限制只能包含大小写字母、数字，特殊字符仅支持 @ . - _ ，最大 64 个字节，不支持重复。
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 变量的值，限制最大 5000 字节，默认值为空。 
     * @return Value 变量的值，限制最大 5000 字节，默认值为空。
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 变量的值，限制最大 5000 字节，默认值为空。
     * @param Value 变量的值，限制最大 5000 字节，默认值为空。
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get 变量的类型，取值有：
<li>string：字符串类型；</li>
<li>json：json 对象类型。</li>默认值为：string。 
     * @return Type 变量的类型，取值有：
<li>string：字符串类型；</li>
<li>json：json 对象类型。</li>默认值为：string。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 变量的类型，取值有：
<li>string：字符串类型；</li>
<li>json：json 对象类型。</li>默认值为：string。
     * @param Type 变量的类型，取值有：
<li>string：字符串类型；</li>
<li>json：json 对象类型。</li>默认值为：string。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public FunctionEnvironmentVariable() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FunctionEnvironmentVariable(FunctionEnvironmentVariable source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

