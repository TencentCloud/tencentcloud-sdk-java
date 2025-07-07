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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SecEntry extends AbstractModel {

    /**
    * 查询维度值。
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 查询维度下详细数据。
    */
    @SerializedName("Value")
    @Expose
    private SecEntryValue [] Value;

    /**
     * Get 查询维度值。 
     * @return Key 查询维度值。
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 查询维度值。
     * @param Key 查询维度值。
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 查询维度下详细数据。 
     * @return Value 查询维度下详细数据。
     */
    public SecEntryValue [] getValue() {
        return this.Value;
    }

    /**
     * Set 查询维度下详细数据。
     * @param Value 查询维度下详细数据。
     */
    public void setValue(SecEntryValue [] Value) {
        this.Value = Value;
    }

    public SecEntry() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SecEntry(SecEntry source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Value != null) {
            this.Value = new SecEntryValue[source.Value.length];
            for (int i = 0; i < source.Value.length; i++) {
                this.Value[i] = new SecEntryValue(source.Value[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamArrayObj(map, prefix + "Value.", this.Value);

    }
}

