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
package com.tencentcloudapi.tdai.v20250717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExtraInfo extends AbstractModel {

    /**
    * 出参额外信息的Key
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 额外信息描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * ExtraInfo的值
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * 值的数据结构类型
    */
    @SerializedName("ValueType")
    @Expose
    private String ValueType;

    /**
     * Get 出参额外信息的Key 
     * @return Key 出参额外信息的Key
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 出参额外信息的Key
     * @param Key 出参额外信息的Key
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 额外信息描述 
     * @return Description 额外信息描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 额外信息描述
     * @param Description 额外信息描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get ExtraInfo的值 
     * @return Value ExtraInfo的值
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set ExtraInfo的值
     * @param Value ExtraInfo的值
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get 值的数据结构类型 
     * @return ValueType 值的数据结构类型
     */
    public String getValueType() {
        return this.ValueType;
    }

    /**
     * Set 值的数据结构类型
     * @param ValueType 值的数据结构类型
     */
    public void setValueType(String ValueType) {
        this.ValueType = ValueType;
    }

    public ExtraInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExtraInfo(ExtraInfo source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
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
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "ValueType", this.ValueType);

    }
}

