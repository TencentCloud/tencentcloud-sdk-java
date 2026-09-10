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
    * <p>角色名称</p>
    */
    @SerializedName("RoleName")
    @Expose
    private String RoleName;

    /**
    * <p>密钥位置 HEADER/QUERY</p><p>枚举值:<br>| uint | 描述 |<br>| --- | --- |<br>| 0 | 头鉴权 |<br>| 1 | 请求信息鉴权 |</p>
    */
    @SerializedName("KeyLocation")
    @Expose
    private Long KeyLocation;

    /**
    * <p>SecretId字段名称</p>
    */
    @SerializedName("SecretIdName")
    @Expose
    private String SecretIdName;

    /**
    * <p>SecretKey字段名称</p>
    */
    @SerializedName("SecretKeyName")
    @Expose
    private String SecretKeyName;

    /**
    * <p>CAM Access Key 字段配置</p>
    */
    @SerializedName("ParamList")
    @Expose
    private AccessKeyParamConfig [] ParamList;

    /**
    * <p>是否支持CAM角色授权</p>
    */
    @SerializedName("SupportRoleAuth")
    @Expose
    private Boolean SupportRoleAuth;

    /**
     * Get <p>角色名称</p> 
     * @return RoleName <p>角色名称</p>
     */
    public String getRoleName() {
        return this.RoleName;
    }

    /**
     * Set <p>角色名称</p>
     * @param RoleName <p>角色名称</p>
     */
    public void setRoleName(String RoleName) {
        this.RoleName = RoleName;
    }

    /**
     * Get <p>密钥位置 HEADER/QUERY</p><p>枚举值:<br>| uint | 描述 |<br>| --- | --- |<br>| 0 | 头鉴权 |<br>| 1 | 请求信息鉴权 |</p> 
     * @return KeyLocation <p>密钥位置 HEADER/QUERY</p><p>枚举值:<br>| uint | 描述 |<br>| --- | --- |<br>| 0 | 头鉴权 |<br>| 1 | 请求信息鉴权 |</p>
     */
    public Long getKeyLocation() {
        return this.KeyLocation;
    }

    /**
     * Set <p>密钥位置 HEADER/QUERY</p><p>枚举值:<br>| uint | 描述 |<br>| --- | --- |<br>| 0 | 头鉴权 |<br>| 1 | 请求信息鉴权 |</p>
     * @param KeyLocation <p>密钥位置 HEADER/QUERY</p><p>枚举值:<br>| uint | 描述 |<br>| --- | --- |<br>| 0 | 头鉴权 |<br>| 1 | 请求信息鉴权 |</p>
     */
    public void setKeyLocation(Long KeyLocation) {
        this.KeyLocation = KeyLocation;
    }

    /**
     * Get <p>SecretId字段名称</p> 
     * @return SecretIdName <p>SecretId字段名称</p>
     */
    public String getSecretIdName() {
        return this.SecretIdName;
    }

    /**
     * Set <p>SecretId字段名称</p>
     * @param SecretIdName <p>SecretId字段名称</p>
     */
    public void setSecretIdName(String SecretIdName) {
        this.SecretIdName = SecretIdName;
    }

    /**
     * Get <p>SecretKey字段名称</p> 
     * @return SecretKeyName <p>SecretKey字段名称</p>
     */
    public String getSecretKeyName() {
        return this.SecretKeyName;
    }

    /**
     * Set <p>SecretKey字段名称</p>
     * @param SecretKeyName <p>SecretKey字段名称</p>
     */
    public void setSecretKeyName(String SecretKeyName) {
        this.SecretKeyName = SecretKeyName;
    }

    /**
     * Get <p>CAM Access Key 字段配置</p> 
     * @return ParamList <p>CAM Access Key 字段配置</p>
     */
    public AccessKeyParamConfig [] getParamList() {
        return this.ParamList;
    }

    /**
     * Set <p>CAM Access Key 字段配置</p>
     * @param ParamList <p>CAM Access Key 字段配置</p>
     */
    public void setParamList(AccessKeyParamConfig [] ParamList) {
        this.ParamList = ParamList;
    }

    /**
     * Get <p>是否支持CAM角色授权</p> 
     * @return SupportRoleAuth <p>是否支持CAM角色授权</p>
     */
    public Boolean getSupportRoleAuth() {
        return this.SupportRoleAuth;
    }

    /**
     * Set <p>是否支持CAM角色授权</p>
     * @param SupportRoleAuth <p>是否支持CAM角色授权</p>
     */
    public void setSupportRoleAuth(Boolean SupportRoleAuth) {
        this.SupportRoleAuth = SupportRoleAuth;
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
        if (source.ParamList != null) {
            this.ParamList = new AccessKeyParamConfig[source.ParamList.length];
            for (int i = 0; i < source.ParamList.length; i++) {
                this.ParamList[i] = new AccessKeyParamConfig(source.ParamList[i]);
            }
        }
        if (source.SupportRoleAuth != null) {
            this.SupportRoleAuth = new Boolean(source.SupportRoleAuth);
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
        this.setParamArrayObj(map, prefix + "ParamList.", this.ParamList);
        this.setParamSimple(map, prefix + "SupportRoleAuth", this.SupportRoleAuth);

    }
}

