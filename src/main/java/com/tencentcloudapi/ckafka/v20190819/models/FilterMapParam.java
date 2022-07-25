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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FilterMapParam extends AbstractModel{

    /**
    * Key值
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 匹配模式，前缀匹配PREFIX，后缀匹配SUFFIX，包含匹配CONTAINS，EXCEPT除外匹配，数值匹配NUMBER，IP匹配IP
    */
    @SerializedName("MatchMode")
    @Expose
    private String MatchMode;

    /**
    * Value值
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * 固定REGULAR
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get Key值 
     * @return Key Key值
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set Key值
     * @param Key Key值
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 匹配模式，前缀匹配PREFIX，后缀匹配SUFFIX，包含匹配CONTAINS，EXCEPT除外匹配，数值匹配NUMBER，IP匹配IP 
     * @return MatchMode 匹配模式，前缀匹配PREFIX，后缀匹配SUFFIX，包含匹配CONTAINS，EXCEPT除外匹配，数值匹配NUMBER，IP匹配IP
     */
    public String getMatchMode() {
        return this.MatchMode;
    }

    /**
     * Set 匹配模式，前缀匹配PREFIX，后缀匹配SUFFIX，包含匹配CONTAINS，EXCEPT除外匹配，数值匹配NUMBER，IP匹配IP
     * @param MatchMode 匹配模式，前缀匹配PREFIX，后缀匹配SUFFIX，包含匹配CONTAINS，EXCEPT除外匹配，数值匹配NUMBER，IP匹配IP
     */
    public void setMatchMode(String MatchMode) {
        this.MatchMode = MatchMode;
    }

    /**
     * Get Value值 
     * @return Value Value值
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set Value值
     * @param Value Value值
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get 固定REGULAR 
     * @return Type 固定REGULAR
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 固定REGULAR
     * @param Type 固定REGULAR
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public FilterMapParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FilterMapParam(FilterMapParam source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.MatchMode != null) {
            this.MatchMode = new String(source.MatchMode);
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
        this.setParamSimple(map, prefix + "MatchMode", this.MatchMode);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

