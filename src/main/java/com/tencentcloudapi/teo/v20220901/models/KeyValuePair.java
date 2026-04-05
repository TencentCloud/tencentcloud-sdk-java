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

public class KeyValuePair extends AbstractModel {

    /**
    * 键名。每个键名不能为空，长度为 1-512 个字符，允许的字符为字母、数字、中划线和下划线。
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 键值。入参时不能为空，最大支持 1 MB。出参时若键不存在，则返回空字符串。
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * 过期时间，遵循 ISO 8601 标准，格式为 YYYY-MM-DDThh:mm:ssZ（UTC 时间）。出参时若为空字符串，表示该键值对永不过期。
    */
    @SerializedName("Expiration")
    @Expose
    private String Expiration;

    /**
     * Get 键名。每个键名不能为空，长度为 1-512 个字符，允许的字符为字母、数字、中划线和下划线。 
     * @return Key 键名。每个键名不能为空，长度为 1-512 个字符，允许的字符为字母、数字、中划线和下划线。
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 键名。每个键名不能为空，长度为 1-512 个字符，允许的字符为字母、数字、中划线和下划线。
     * @param Key 键名。每个键名不能为空，长度为 1-512 个字符，允许的字符为字母、数字、中划线和下划线。
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 键值。入参时不能为空，最大支持 1 MB。出参时若键不存在，则返回空字符串。 
     * @return Value 键值。入参时不能为空，最大支持 1 MB。出参时若键不存在，则返回空字符串。
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 键值。入参时不能为空，最大支持 1 MB。出参时若键不存在，则返回空字符串。
     * @param Value 键值。入参时不能为空，最大支持 1 MB。出参时若键不存在，则返回空字符串。
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get 过期时间，遵循 ISO 8601 标准，格式为 YYYY-MM-DDThh:mm:ssZ（UTC 时间）。出参时若为空字符串，表示该键值对永不过期。 
     * @return Expiration 过期时间，遵循 ISO 8601 标准，格式为 YYYY-MM-DDThh:mm:ssZ（UTC 时间）。出参时若为空字符串，表示该键值对永不过期。
     */
    public String getExpiration() {
        return this.Expiration;
    }

    /**
     * Set 过期时间，遵循 ISO 8601 标准，格式为 YYYY-MM-DDThh:mm:ssZ（UTC 时间）。出参时若为空字符串，表示该键值对永不过期。
     * @param Expiration 过期时间，遵循 ISO 8601 标准，格式为 YYYY-MM-DDThh:mm:ssZ（UTC 时间）。出参时若为空字符串，表示该键值对永不过期。
     */
    public void setExpiration(String Expiration) {
        this.Expiration = Expiration;
    }

    public KeyValuePair() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KeyValuePair(KeyValuePair source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.Expiration != null) {
            this.Expiration = new String(source.Expiration);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "Expiration", this.Expiration);

    }
}

