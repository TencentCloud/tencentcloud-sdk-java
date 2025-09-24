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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TokenRuleEntry extends AbstractModel {

    /**
    * 校验方式，可选值：验签校验、字段校验
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 键
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 操作符
    */
    @SerializedName("Op")
    @Expose
    private String Op;

    /**
    * 值
    */
    @SerializedName("Value")
    @Expose
    private TokenRuleEntryValue Value;

    /**
     * Get 校验方式，可选值：验签校验、字段校验 
     * @return Type 校验方式，可选值：验签校验、字段校验
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 校验方式，可选值：验签校验、字段校验
     * @param Type 校验方式，可选值：验签校验、字段校验
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 键 
     * @return Key 键
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 键
     * @param Key 键
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 操作符 
     * @return Op 操作符
     */
    public String getOp() {
        return this.Op;
    }

    /**
     * Set 操作符
     * @param Op 操作符
     */
    public void setOp(String Op) {
        this.Op = Op;
    }

    /**
     * Get 值 
     * @return Value 值
     */
    public TokenRuleEntryValue getValue() {
        return this.Value;
    }

    /**
     * Set 值
     * @param Value 值
     */
    public void setValue(TokenRuleEntryValue Value) {
        this.Value = Value;
    }

    public TokenRuleEntry() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TokenRuleEntry(TokenRuleEntry source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Op != null) {
            this.Op = new String(source.Op);
        }
        if (source.Value != null) {
            this.Value = new TokenRuleEntryValue(source.Value);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Op", this.Op);
        this.setParamObj(map, prefix + "Value.", this.Value);

    }
}

