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
package com.tencentcloudapi.apm.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OrderBy extends AbstractModel {

    /**
    * 需要排序的字段，现支持 startTIme, endTime, duration
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * asc 顺序排序 / desc 倒序排序
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
     * Get 需要排序的字段，现支持 startTIme, endTime, duration 
     * @return Key 需要排序的字段，现支持 startTIme, endTime, duration
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 需要排序的字段，现支持 startTIme, endTime, duration
     * @param Key 需要排序的字段，现支持 startTIme, endTime, duration
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get asc 顺序排序 / desc 倒序排序 
     * @return Value asc 顺序排序 / desc 倒序排序
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set asc 顺序排序 / desc 倒序排序
     * @param Value asc 顺序排序 / desc 倒序排序
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    public OrderBy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OrderBy(OrderBy source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
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
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}

