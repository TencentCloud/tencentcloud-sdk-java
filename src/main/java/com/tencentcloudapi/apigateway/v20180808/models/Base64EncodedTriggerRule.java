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
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Base64EncodedTriggerRule extends AbstractModel{

    /**
    * 进行编码触发的header，可选值 "Accept"和"Content_Type" 对应实际数据流请求header中的Accept和 Content-Type。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 进行编码触发的header的可选值数组, 数组元素的字符串最大长度为40，元素可以包括数字，英文字母以及特殊字符，特殊字符的可选值为： `.`    `+`    `*`   `-`   `/`  `_` 

例如 [
    "application/x-vpeg005",
    "application/xhtml+xml",
    "application/vnd.ms-project",
    "application/vnd.rn-rn_music_package"
] 等都是合法的。
    */
    @SerializedName("Value")
    @Expose
    private String [] Value;

    /**
     * Get 进行编码触发的header，可选值 "Accept"和"Content_Type" 对应实际数据流请求header中的Accept和 Content-Type。 
     * @return Name 进行编码触发的header，可选值 "Accept"和"Content_Type" 对应实际数据流请求header中的Accept和 Content-Type。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 进行编码触发的header，可选值 "Accept"和"Content_Type" 对应实际数据流请求header中的Accept和 Content-Type。
     * @param Name 进行编码触发的header，可选值 "Accept"和"Content_Type" 对应实际数据流请求header中的Accept和 Content-Type。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 进行编码触发的header的可选值数组, 数组元素的字符串最大长度为40，元素可以包括数字，英文字母以及特殊字符，特殊字符的可选值为： `.`    `+`    `*`   `-`   `/`  `_` 

例如 [
    "application/x-vpeg005",
    "application/xhtml+xml",
    "application/vnd.ms-project",
    "application/vnd.rn-rn_music_package"
] 等都是合法的。 
     * @return Value 进行编码触发的header的可选值数组, 数组元素的字符串最大长度为40，元素可以包括数字，英文字母以及特殊字符，特殊字符的可选值为： `.`    `+`    `*`   `-`   `/`  `_` 

例如 [
    "application/x-vpeg005",
    "application/xhtml+xml",
    "application/vnd.ms-project",
    "application/vnd.rn-rn_music_package"
] 等都是合法的。
     */
    public String [] getValue() {
        return this.Value;
    }

    /**
     * Set 进行编码触发的header的可选值数组, 数组元素的字符串最大长度为40，元素可以包括数字，英文字母以及特殊字符，特殊字符的可选值为： `.`    `+`    `*`   `-`   `/`  `_` 

例如 [
    "application/x-vpeg005",
    "application/xhtml+xml",
    "application/vnd.ms-project",
    "application/vnd.rn-rn_music_package"
] 等都是合法的。
     * @param Value 进行编码触发的header的可选值数组, 数组元素的字符串最大长度为40，元素可以包括数字，英文字母以及特殊字符，特殊字符的可选值为： `.`    `+`    `*`   `-`   `/`  `_` 

例如 [
    "application/x-vpeg005",
    "application/xhtml+xml",
    "application/vnd.ms-project",
    "application/vnd.rn-rn_music_package"
] 等都是合法的。
     */
    public void setValue(String [] Value) {
        this.Value = Value;
    }

    public Base64EncodedTriggerRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Base64EncodedTriggerRule(Base64EncodedTriggerRule source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Value != null) {
            this.Value = new String[source.Value.length];
            for (int i = 0; i < source.Value.length; i++) {
                this.Value[i] = new String(source.Value[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "Value.", this.Value);

    }
}

