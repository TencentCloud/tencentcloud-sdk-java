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

public class BotActionScopeRuleEntry extends AbstractModel {

    /**
    * 参数
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 匹配符
    */
    @SerializedName("Op")
    @Expose
    private String Op;

    /**
    * 参数值
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * 对于头部字段匹配value的时候指定的头部名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 470后使用此字段存储多值
    */
    @SerializedName("ValueArray")
    @Expose
    private String [] ValueArray;

    /**
     * Get 参数 
     * @return Key 参数
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 参数
     * @param Key 参数
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 匹配符 
     * @return Op 匹配符
     */
    public String getOp() {
        return this.Op;
    }

    /**
     * Set 匹配符
     * @param Op 匹配符
     */
    public void setOp(String Op) {
        this.Op = Op;
    }

    /**
     * Get 参数值 
     * @return Value 参数值
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 参数值
     * @param Value 参数值
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get 对于头部字段匹配value的时候指定的头部名 
     * @return Name 对于头部字段匹配value的时候指定的头部名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 对于头部字段匹配value的时候指定的头部名
     * @param Name 对于头部字段匹配value的时候指定的头部名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 470后使用此字段存储多值 
     * @return ValueArray 470后使用此字段存储多值
     */
    public String [] getValueArray() {
        return this.ValueArray;
    }

    /**
     * Set 470后使用此字段存储多值
     * @param ValueArray 470后使用此字段存储多值
     */
    public void setValueArray(String [] ValueArray) {
        this.ValueArray = ValueArray;
    }

    public BotActionScopeRuleEntry() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BotActionScopeRuleEntry(BotActionScopeRuleEntry source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Op != null) {
            this.Op = new String(source.Op);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ValueArray != null) {
            this.ValueArray = new String[source.ValueArray.length];
            for (int i = 0; i < source.ValueArray.length; i++) {
                this.ValueArray[i] = new String(source.ValueArray[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Op", this.Op);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "ValueArray.", this.ValueArray);

    }
}

