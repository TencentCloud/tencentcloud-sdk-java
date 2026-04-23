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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HttpParams extends AbstractModel {

    /**
    * 
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * 
    */
    @SerializedName("ValueType")
    @Expose
    private String ValueType;

    /**
     * Get  
     * @return Key 
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 
     * @param Key 
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get  
     * @return Value 
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 
     * @param Value 
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get  
     * @return ValueType 
     */
    public String getValueType() {
        return this.ValueType;
    }

    /**
     * Set 
     * @param ValueType 
     */
    public void setValueType(String ValueType) {
        this.ValueType = ValueType;
    }

    public HttpParams() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HttpParams(HttpParams source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.ValueType != null) {
            this.ValueType = new String(source.ValueType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "ValueType", this.ValueType);

    }
}

