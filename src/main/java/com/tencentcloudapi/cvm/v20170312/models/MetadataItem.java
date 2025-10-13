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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MetadataItem extends AbstractModel {

    /**
    * 自定义metadata键，由大写字母（A-Z）、小写字母（a-z）、数字（0-9）、下划线（_）或连字符（-）组成，大小上限为128 字节。
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 自定义metadata值，大小上限为256 KB。
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
     * Get 自定义metadata键，由大写字母（A-Z）、小写字母（a-z）、数字（0-9）、下划线（_）或连字符（-）组成，大小上限为128 字节。 
     * @return Key 自定义metadata键，由大写字母（A-Z）、小写字母（a-z）、数字（0-9）、下划线（_）或连字符（-）组成，大小上限为128 字节。
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 自定义metadata键，由大写字母（A-Z）、小写字母（a-z）、数字（0-9）、下划线（_）或连字符（-）组成，大小上限为128 字节。
     * @param Key 自定义metadata键，由大写字母（A-Z）、小写字母（a-z）、数字（0-9）、下划线（_）或连字符（-）组成，大小上限为128 字节。
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 自定义metadata值，大小上限为256 KB。 
     * @return Value 自定义metadata值，大小上限为256 KB。
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 自定义metadata值，大小上限为256 KB。
     * @param Value 自定义metadata值，大小上限为256 KB。
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    public MetadataItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MetadataItem(MetadataItem source) {
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

