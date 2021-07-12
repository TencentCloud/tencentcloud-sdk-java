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
package com.tencentcloudapi.eiam.v20210420.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AuthorizationInfo extends AbstractModel{

    /**
    * 应用唯一ID。
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * 应用名称。
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * 类型名称。
    */
    @SerializedName("EntityName")
    @Expose
    private String EntityName;

    /**
    * 类型唯一ID。
    */
    @SerializedName("EntityId")
    @Expose
    private String EntityId;

    /**
    * 上次更新时间，符合 ISO8601 标准。
    */
    @SerializedName("LastModifiedDate")
    @Expose
    private String LastModifiedDate;

    /**
    * 授权类型唯一ID。
    */
    @SerializedName("AuthorizationId")
    @Expose
    private String AuthorizationId;

    /**
     * Get 应用唯一ID。 
     * @return AppId 应用唯一ID。
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set 应用唯一ID。
     * @param AppId 应用唯一ID。
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 应用名称。 
     * @return AppName 应用名称。
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set 应用名称。
     * @param AppName 应用名称。
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get 类型名称。 
     * @return EntityName 类型名称。
     */
    public String getEntityName() {
        return this.EntityName;
    }

    /**
     * Set 类型名称。
     * @param EntityName 类型名称。
     */
    public void setEntityName(String EntityName) {
        this.EntityName = EntityName;
    }

    /**
     * Get 类型唯一ID。 
     * @return EntityId 类型唯一ID。
     */
    public String getEntityId() {
        return this.EntityId;
    }

    /**
     * Set 类型唯一ID。
     * @param EntityId 类型唯一ID。
     */
    public void setEntityId(String EntityId) {
        this.EntityId = EntityId;
    }

    /**
     * Get 上次更新时间，符合 ISO8601 标准。 
     * @return LastModifiedDate 上次更新时间，符合 ISO8601 标准。
     */
    public String getLastModifiedDate() {
        return this.LastModifiedDate;
    }

    /**
     * Set 上次更新时间，符合 ISO8601 标准。
     * @param LastModifiedDate 上次更新时间，符合 ISO8601 标准。
     */
    public void setLastModifiedDate(String LastModifiedDate) {
        this.LastModifiedDate = LastModifiedDate;
    }

    /**
     * Get 授权类型唯一ID。 
     * @return AuthorizationId 授权类型唯一ID。
     */
    public String getAuthorizationId() {
        return this.AuthorizationId;
    }

    /**
     * Set 授权类型唯一ID。
     * @param AuthorizationId 授权类型唯一ID。
     */
    public void setAuthorizationId(String AuthorizationId) {
        this.AuthorizationId = AuthorizationId;
    }

    public AuthorizationInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AuthorizationInfo(AuthorizationInfo source) {
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.AppName != null) {
            this.AppName = new String(source.AppName);
        }
        if (source.EntityName != null) {
            this.EntityName = new String(source.EntityName);
        }
        if (source.EntityId != null) {
            this.EntityId = new String(source.EntityId);
        }
        if (source.LastModifiedDate != null) {
            this.LastModifiedDate = new String(source.LastModifiedDate);
        }
        if (source.AuthorizationId != null) {
            this.AuthorizationId = new String(source.AuthorizationId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "EntityName", this.EntityName);
        this.setParamSimple(map, prefix + "EntityId", this.EntityId);
        this.setParamSimple(map, prefix + "LastModifiedDate", this.LastModifiedDate);
        this.setParamSimple(map, prefix + "AuthorizationId", this.AuthorizationId);

    }
}

