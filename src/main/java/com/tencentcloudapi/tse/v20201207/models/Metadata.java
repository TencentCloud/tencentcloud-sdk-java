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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Metadata extends AbstractModel {

    /**
    * 元数据键名。
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 元数据键值。不填则默认为空字符串。
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
     * Get 元数据键名。 
     * @return Key 元数据键名。
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 元数据键名。
     * @param Key 元数据键名。
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 元数据键值。不填则默认为空字符串。 
     * @return Value 元数据键值。不填则默认为空字符串。
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 元数据键值。不填则默认为空字符串。
     * @param Value 元数据键值。不填则默认为空字符串。
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    public Metadata() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Metadata(Metadata source) {
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

