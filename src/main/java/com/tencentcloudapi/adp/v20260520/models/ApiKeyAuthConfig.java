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
    * 密钥位置 HEADER/QUERY

枚举值:
| uint | 描述 |
| --- | --- |
| 0 | Header鉴权 |
| 1 | Query鉴权 |
    */
    @SerializedName("KeyLocation")
    @Expose
    private Long KeyLocation;

    /**
    * 密钥参数名
    */
    @SerializedName("KeyParamName")
    @Expose
    private String KeyParamName;

    /**
    * 密钥参数值
    */
    @SerializedName("KeyParamValue")
    @Expose
    private String KeyParamValue;

    /**
     * Get 密钥位置 HEADER/QUERY

枚举值:
| uint | 描述 |
| --- | --- |
| 0 | Header鉴权 |
| 1 | Query鉴权 | 
     * @return KeyLocation 密钥位置 HEADER/QUERY

枚举值:
| uint | 描述 |
| --- | --- |
| 0 | Header鉴权 |
| 1 | Query鉴权 |
     */
    public Long getKeyLocation() {
        return this.KeyLocation;
    }

    /**
     * Set 密钥位置 HEADER/QUERY

枚举值:
| uint | 描述 |
| --- | --- |
| 0 | Header鉴权 |
| 1 | Query鉴权 |
     * @param KeyLocation 密钥位置 HEADER/QUERY

枚举值:
| uint | 描述 |
| --- | --- |
| 0 | Header鉴权 |
| 1 | Query鉴权 |
     */
    public void setKeyLocation(Long KeyLocation) {
        this.KeyLocation = KeyLocation;
    }

    /**
     * Get 密钥参数名 
     * @return KeyParamName 密钥参数名
     */
    public String getKeyParamName() {
        return this.KeyParamName;
    }

    /**
     * Set 密钥参数名
     * @param KeyParamName 密钥参数名
     */
    public void setKeyParamName(String KeyParamName) {
        this.KeyParamName = KeyParamName;
    }

    /**
     * Get 密钥参数值 
     * @return KeyParamValue 密钥参数值
     */
    public String getKeyParamValue() {
        return this.KeyParamValue;
    }

    /**
     * Set 密钥参数值
     * @param KeyParamValue 密钥参数值
     */
    public void setKeyParamValue(String KeyParamValue) {
        this.KeyParamValue = KeyParamValue;
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KeyLocation", this.KeyLocation);
        this.setParamSimple(map, prefix + "KeyParamName", this.KeyParamName);
        this.setParamSimple(map, prefix + "KeyParamValue", this.KeyParamValue);

    }
}

