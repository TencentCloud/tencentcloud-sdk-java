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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AdvanceFilterRuleInfo extends AbstractModel {

    /**
    * 过滤字段
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 过滤规则，0:等于，1:字段存在，2:字段不存在
    */
    @SerializedName("Rule")
    @Expose
    private Long Rule;

    /**
    * 过滤值
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
     * Get 过滤字段 
     * @return Key 过滤字段
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 过滤字段
     * @param Key 过滤字段
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 过滤规则，0:等于，1:字段存在，2:字段不存在 
     * @return Rule 过滤规则，0:等于，1:字段存在，2:字段不存在
     */
    public Long getRule() {
        return this.Rule;
    }

    /**
     * Set 过滤规则，0:等于，1:字段存在，2:字段不存在
     * @param Rule 过滤规则，0:等于，1:字段存在，2:字段不存在
     */
    public void setRule(Long Rule) {
        this.Rule = Rule;
    }

    /**
     * Get 过滤值 
     * @return Value 过滤值
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 过滤值
     * @param Value 过滤值
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    public AdvanceFilterRuleInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AdvanceFilterRuleInfo(AdvanceFilterRuleInfo source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Rule != null) {
            this.Rule = new Long(source.Rule);
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
        this.setParamSimple(map, prefix + "Rule", this.Rule);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}

