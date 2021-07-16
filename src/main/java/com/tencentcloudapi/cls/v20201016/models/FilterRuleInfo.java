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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FilterRuleInfo extends AbstractModel{

    /**
    * 过滤规则Key
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 过滤规则
    */
    @SerializedName("Regex")
    @Expose
    private String Regex;

    /**
    * 过滤规则Value
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
     * Get 过滤规则Key 
     * @return Key 过滤规则Key
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 过滤规则Key
     * @param Key 过滤规则Key
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 过滤规则 
     * @return Regex 过滤规则
     */
    public String getRegex() {
        return this.Regex;
    }

    /**
     * Set 过滤规则
     * @param Regex 过滤规则
     */
    public void setRegex(String Regex) {
        this.Regex = Regex;
    }

    /**
     * Get 过滤规则Value 
     * @return Value 过滤规则Value
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 过滤规则Value
     * @param Value 过滤规则Value
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    public FilterRuleInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FilterRuleInfo(FilterRuleInfo source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Regex != null) {
            this.Regex = new String(source.Regex);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Regex", this.Regex);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}

