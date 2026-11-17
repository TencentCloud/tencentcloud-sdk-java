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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApiKeyAuthConfig extends AbstractModel {

    /**
    * <p>密钥位置 HEADER/QUERY</p><p>枚举值:<br>| uint | 描述 |<br>| --- | --- |<br>| 0 | Header鉴权 |<br>| 1 | Query鉴权 |</p>
    */
    @SerializedName("KeyLocation")
    @Expose
    private Long KeyLocation;

    /**
    * <p>密钥参数名</p>
    */
    @SerializedName("KeyParamName")
    @Expose
    private String KeyParamName;

    /**
    * <p>密钥参数值</p>
    */
    @SerializedName("KeyParamValue")
    @Expose
    private String KeyParamValue;

    /**
    * <p>密钥值用途，未指定按允许工具调用处理</p><p>枚举值：</p><ul><li>1： 允许用于工具调用</li><li>2： 仅用于连接测试和获取工具列表</li></ul>
    */
    @SerializedName("KeyValueUsage")
    @Expose
    private Long KeyValueUsage;

    /**
     * Get <p>密钥位置 HEADER/QUERY</p><p>枚举值:<br>| uint | 描述 |<br>| --- | --- |<br>| 0 | Header鉴权 |<br>| 1 | Query鉴权 |</p> 
     * @return KeyLocation <p>密钥位置 HEADER/QUERY</p><p>枚举值:<br>| uint | 描述 |<br>| --- | --- |<br>| 0 | Header鉴权 |<br>| 1 | Query鉴权 |</p>
     */
    public Long getKeyLocation() {
        return this.KeyLocation;
    }

    /**
     * Set <p>密钥位置 HEADER/QUERY</p><p>枚举值:<br>| uint | 描述 |<br>| --- | --- |<br>| 0 | Header鉴权 |<br>| 1 | Query鉴权 |</p>
     * @param KeyLocation <p>密钥位置 HEADER/QUERY</p><p>枚举值:<br>| uint | 描述 |<br>| --- | --- |<br>| 0 | Header鉴权 |<br>| 1 | Query鉴权 |</p>
     */
    public void setKeyLocation(Long KeyLocation) {
        this.KeyLocation = KeyLocation;
    }

    /**
     * Get <p>密钥参数名</p> 
     * @return KeyParamName <p>密钥参数名</p>
     */
    public String getKeyParamName() {
        return this.KeyParamName;
    }

    /**
     * Set <p>密钥参数名</p>
     * @param KeyParamName <p>密钥参数名</p>
     */
    public void setKeyParamName(String KeyParamName) {
        this.KeyParamName = KeyParamName;
    }

    /**
     * Get <p>密钥参数值</p> 
     * @return KeyParamValue <p>密钥参数值</p>
     */
    public String getKeyParamValue() {
        return this.KeyParamValue;
    }

    /**
     * Set <p>密钥参数值</p>
     * @param KeyParamValue <p>密钥参数值</p>
     */
    public void setKeyParamValue(String KeyParamValue) {
        this.KeyParamValue = KeyParamValue;
    }

    /**
     * Get <p>密钥值用途，未指定按允许工具调用处理</p><p>枚举值：</p><ul><li>1： 允许用于工具调用</li><li>2： 仅用于连接测试和获取工具列表</li></ul> 
     * @return KeyValueUsage <p>密钥值用途，未指定按允许工具调用处理</p><p>枚举值：</p><ul><li>1： 允许用于工具调用</li><li>2： 仅用于连接测试和获取工具列表</li></ul>
     */
    public Long getKeyValueUsage() {
        return this.KeyValueUsage;
    }

    /**
     * Set <p>密钥值用途，未指定按允许工具调用处理</p><p>枚举值：</p><ul><li>1： 允许用于工具调用</li><li>2： 仅用于连接测试和获取工具列表</li></ul>
     * @param KeyValueUsage <p>密钥值用途，未指定按允许工具调用处理</p><p>枚举值：</p><ul><li>1： 允许用于工具调用</li><li>2： 仅用于连接测试和获取工具列表</li></ul>
     */
    public void setKeyValueUsage(Long KeyValueUsage) {
        this.KeyValueUsage = KeyValueUsage;
    }

    public ApiKeyAuthConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApiKeyAuthConfig(ApiKeyAuthConfig source) {
        if (source.KeyLocation != null) {
            this.KeyLocation = new Long(source.KeyLocation);
        }
        if (source.KeyParamName != null) {
            this.KeyParamName = new String(source.KeyParamName);
        }
        if (source.KeyParamValue != null) {
            this.KeyParamValue = new String(source.KeyParamValue);
        }
        if (source.KeyValueUsage != null) {
            this.KeyValueUsage = new Long(source.KeyValueUsage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KeyLocation", this.KeyLocation);
        this.setParamSimple(map, prefix + "KeyParamName", this.KeyParamName);
        this.setParamSimple(map, prefix + "KeyParamValue", this.KeyParamValue);
        this.setParamSimple(map, prefix + "KeyValueUsage", this.KeyValueUsage);

    }
}

