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

public class CamAuthConfig extends AbstractModel {

    /**
    * 角色名称
    */
    @SerializedName("RoleName")
    @Expose
    private String RoleName;

    /**
    * 密钥位置 HEADER/QUERY

枚举值:
| uint | 描述 |
| --- | --- |
| 0 | 头鉴权 |
| 1 | 请求信息鉴权 |
    */
    @SerializedName("KeyLocation")
    @Expose
    private Long KeyLocation;

    /**
    * SecretId字段名称
    */
    @SerializedName("SecretIdName")
    @Expose
    private String SecretIdName;

    /**
    * SecretKey字段名称
    */
    @SerializedName("SecretKeyName")
    @Expose
    private String SecretKeyName;

    /**
     * Get 角色名称 
     * @return RoleName 角色名称
     */
    public String getRoleName() {
        return this.RoleName;
    }

    /**
     * Set 角色名称
     * @param RoleName 角色名称
     */
    public void setRoleName(String RoleName) {
        this.RoleName = RoleName;
    }

    /**
     * Get 密钥位置 HEADER/QUERY

枚举值:
| uint | 描述 |
| --- | --- |
| 0 | 头鉴权 |
| 1 | 请求信息鉴权 | 
     * @return KeyLocation 密钥位置 HEADER/QUERY

枚举值:
| uint | 描述 |
| --- | --- |
| 0 | 头鉴权 |
| 1 | 请求信息鉴权 |
     */
    public Long getKeyLocation() {
        return this.KeyLocation;
    }

    /**
     * Set 密钥位置 HEADER/QUERY

枚举值:
| uint | 描述 |
| --- | --- |
| 0 | 头鉴权 |
| 1 | 请求信息鉴权 |
     * @param KeyLocation 密钥位置 HEADER/QUERY

枚举值:
| uint | 描述 |
| --- | --- |
| 0 | 头鉴权 |
| 1 | 请求信息鉴权 |
     */
    public void setKeyLocation(Long KeyLocation) {
        this.KeyLocation = KeyLocation;
    }

    /**
     * Get SecretId字段名称 
     * @return SecretIdName SecretId字段名称
     */
    public String getSecretIdName() {
        return this.SecretIdName;
    }

    /**
     * Set SecretId字段名称
     * @param SecretIdName SecretId字段名称
     */
    public void setSecretIdName(String SecretIdName) {
        this.SecretIdName = SecretIdName;
    }

    /**
     * Get SecretKey字段名称 
     * @return SecretKeyName SecretKey字段名称
     */
    public String getSecretKeyName() {
        return this.SecretKeyName;
    }

    /**
     * Set SecretKey字段名称
     * @param SecretKeyName SecretKey字段名称
     */
    public void setSecretKeyName(String SecretKeyName) {
        this.SecretKeyName = SecretKeyName;
    }

    public CamAuthConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CamAuthConfig(CamAuthConfig source) {
        if (source.RoleName != null) {
            this.RoleName = new String(source.RoleName);
        }
        if (source.KeyLocation != null) {
            this.KeyLocation = new Long(source.KeyLocation);
        }
        if (source.SecretIdName != null) {
            this.SecretIdName = new String(source.SecretIdName);
        }
        if (source.SecretKeyName != null) {
            this.SecretKeyName = new String(source.SecretKeyName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoleName", this.RoleName);
        this.setParamSimple(map, prefix + "KeyLocation", this.KeyLocation);
        this.setParamSimple(map, prefix + "SecretIdName", this.SecretIdName);
        this.setParamSimple(map, prefix + "SecretKeyName", this.SecretKeyName);

    }
}

