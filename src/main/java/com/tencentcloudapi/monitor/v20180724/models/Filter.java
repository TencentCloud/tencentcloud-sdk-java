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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Filter extends AbstractModel {

    /**
    * 过滤方式（=, !=, in）
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 过滤维度名
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 过滤值，in过滤方式用逗号分割多个值
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * 过滤条件名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 过滤条件取值范围
    */
    @SerializedName("Values")
    @Expose
    private String [] Values;

    /**
     * Get 过滤方式（=, !=, in） 
     * @return Type 过滤方式（=, !=, in）
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 过滤方式（=, !=, in）
     * @param Type 过滤方式（=, !=, in）
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 过滤维度名 
     * @return Key 过滤维度名
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 过滤维度名
     * @param Key 过滤维度名
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 过滤值，in过滤方式用逗号分割多个值 
     * @return Value 过滤值，in过滤方式用逗号分割多个值
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 过滤值，in过滤方式用逗号分割多个值
     * @param Value 过滤值，in过滤方式用逗号分割多个值
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get 过滤条件名称 
     * @return Name 过滤条件名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 过滤条件名称
     * @param Name 过滤条件名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 过滤条件取值范围 
     * @return Values 过滤条件取值范围
     */
    public String [] getValues() {
        return this.Values;
    }

    /**
     * Set 过滤条件取值范围
     * @param Values 过滤条件取值范围
     */
    public void setValues(String [] Values) {
        this.Values = Values;
    }

    public Filter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Filter(Filter source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Values != null) {
            this.Values = new String[source.Values.length];
            for (int i = 0; i < source.Values.length; i++) {
                this.Values[i] = new String(source.Values[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "Values.", this.Values);

    }
}

