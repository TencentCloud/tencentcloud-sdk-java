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

public class DescribeApplicationResponse extends AbstractModel{

    /**
    * 密钥id。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * 应用展示名称，长度限制：64个字符。 默认与应用名字相同。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DisplayName")
    @Expose
    private String DisplayName;

    /**
    * 应用最后修改时间，符合 ISO8601 标准。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastModifiedDate")
    @Expose
    private String LastModifiedDate;

    /**
    * 客户端id。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClientId")
    @Expose
    private String ClientId;

    /**
    * 应用类型，即创建应用时所选择的应用模板类型。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApplicationType")
    @Expose
    private String ApplicationType;

    /**
    * 应用创建时间，符合 ISO8601 标准。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatedDate")
    @Expose
    private String CreatedDate;

    /**
    * 应用id，是应用的全局唯一标识。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * 令牌有效时间，单位为秒。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TokenExpired")
    @Expose
    private Long TokenExpired;

    /**
    * 客户端secret。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClientSecret")
    @Expose
    private String ClientSecret;

    /**
    * 公钥信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PublicKey")
    @Expose
    private String PublicKey;

    /**
    * 授权地址。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AuthorizeUrl")
    @Expose
    private String AuthorizeUrl;

    /**
    * 应用图标图片访问地址。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IconUrl")
    @Expose
    private String IconUrl;

    /**
    * 安全等级。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SecureLevel")
    @Expose
    private String SecureLevel;

    /**
    * 应用状态。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppStatus")
    @Expose
    private Boolean AppStatus;

    /**
    * 描述。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 密钥id。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KeyId 密钥id。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set 密钥id。
注意：此字段可能返回 null，表示取不到有效值。
     * @param KeyId 密钥id。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    /**
     * Get 应用展示名称，长度限制：64个字符。 默认与应用名字相同。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DisplayName 应用展示名称，长度限制：64个字符。 默认与应用名字相同。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDisplayName() {
        return this.DisplayName;
    }

    /**
     * Set 应用展示名称，长度限制：64个字符。 默认与应用名字相同。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DisplayName 应用展示名称，长度限制：64个字符。 默认与应用名字相同。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
    }

    /**
     * Get 应用最后修改时间，符合 ISO8601 标准。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastModifiedDate 应用最后修改时间，符合 ISO8601 标准。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastModifiedDate() {
        return this.LastModifiedDate;
    }

    /**
     * Set 应用最后修改时间，符合 ISO8601 标准。
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastModifiedDate 应用最后修改时间，符合 ISO8601 标准。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastModifiedDate(String LastModifiedDate) {
        this.LastModifiedDate = LastModifiedDate;
    }

    /**
     * Get 客户端id。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClientId 客户端id。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClientId() {
        return this.ClientId;
    }

    /**
     * Set 客户端id。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClientId 客户端id。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClientId(String ClientId) {
        this.ClientId = ClientId;
    }

    /**
     * Get 应用类型，即创建应用时所选择的应用模板类型。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApplicationType 应用类型，即创建应用时所选择的应用模板类型。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApplicationType() {
        return this.ApplicationType;
    }

    /**
     * Set 应用类型，即创建应用时所选择的应用模板类型。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApplicationType 应用类型，即创建应用时所选择的应用模板类型。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApplicationType(String ApplicationType) {
        this.ApplicationType = ApplicationType;
    }

    /**
     * Get 应用创建时间，符合 ISO8601 标准。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatedDate 应用创建时间，符合 ISO8601 标准。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatedDate() {
        return this.CreatedDate;
    }

    /**
     * Set 应用创建时间，符合 ISO8601 标准。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatedDate 应用创建时间，符合 ISO8601 标准。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatedDate(String CreatedDate) {
        this.CreatedDate = CreatedDate;
    }

    /**
     * Get 应用id，是应用的全局唯一标识。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApplicationId 应用id，是应用的全局唯一标识。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set 应用id，是应用的全局唯一标识。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApplicationId 应用id，是应用的全局唯一标识。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get 令牌有效时间，单位为秒。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TokenExpired 令牌有效时间，单位为秒。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTokenExpired() {
        return this.TokenExpired;
    }

    /**
     * Set 令牌有效时间，单位为秒。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TokenExpired 令牌有效时间，单位为秒。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTokenExpired(Long TokenExpired) {
        this.TokenExpired = TokenExpired;
    }

    /**
     * Get 客户端secret。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClientSecret 客户端secret。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClientSecret() {
        return this.ClientSecret;
    }

    /**
     * Set 客户端secret。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClientSecret 客户端secret。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClientSecret(String ClientSecret) {
        this.ClientSecret = ClientSecret;
    }

    /**
     * Get 公钥信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PublicKey 公钥信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPublicKey() {
        return this.PublicKey;
    }

    /**
     * Set 公钥信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param PublicKey 公钥信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPublicKey(String PublicKey) {
        this.PublicKey = PublicKey;
    }

    /**
     * Get 授权地址。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AuthorizeUrl 授权地址。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAuthorizeUrl() {
        return this.AuthorizeUrl;
    }

    /**
     * Set 授权地址。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AuthorizeUrl 授权地址。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAuthorizeUrl(String AuthorizeUrl) {
        this.AuthorizeUrl = AuthorizeUrl;
    }

    /**
     * Get 应用图标图片访问地址。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IconUrl 应用图标图片访问地址。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIconUrl() {
        return this.IconUrl;
    }

    /**
     * Set 应用图标图片访问地址。
注意：此字段可能返回 null，表示取不到有效值。
     * @param IconUrl 应用图标图片访问地址。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIconUrl(String IconUrl) {
        this.IconUrl = IconUrl;
    }

    /**
     * Get 安全等级。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SecureLevel 安全等级。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSecureLevel() {
        return this.SecureLevel;
    }

    /**
     * Set 安全等级。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SecureLevel 安全等级。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSecureLevel(String SecureLevel) {
        this.SecureLevel = SecureLevel;
    }

    /**
     * Get 应用状态。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppStatus 应用状态。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getAppStatus() {
        return this.AppStatus;
    }

    /**
     * Set 应用状态。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppStatus 应用状态。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppStatus(Boolean AppStatus) {
        this.AppStatus = AppStatus;
    }

    /**
     * Get 描述。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 描述。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 描述。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeApplicationResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeApplicationResponse(DescribeApplicationResponse source) {
        if (source.KeyId != null) {
            this.KeyId = new String(source.KeyId);
        }
        if (source.DisplayName != null) {
            this.DisplayName = new String(source.DisplayName);
        }
        if (source.LastModifiedDate != null) {
            this.LastModifiedDate = new String(source.LastModifiedDate);
        }
        if (source.ClientId != null) {
            this.ClientId = new String(source.ClientId);
        }
        if (source.ApplicationType != null) {
            this.ApplicationType = new String(source.ApplicationType);
        }
        if (source.CreatedDate != null) {
            this.CreatedDate = new String(source.CreatedDate);
        }
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
        if (source.TokenExpired != null) {
            this.TokenExpired = new Long(source.TokenExpired);
        }
        if (source.ClientSecret != null) {
            this.ClientSecret = new String(source.ClientSecret);
        }
        if (source.PublicKey != null) {
            this.PublicKey = new String(source.PublicKey);
        }
        if (source.AuthorizeUrl != null) {
            this.AuthorizeUrl = new String(source.AuthorizeUrl);
        }
        if (source.IconUrl != null) {
            this.IconUrl = new String(source.IconUrl);
        }
        if (source.SecureLevel != null) {
            this.SecureLevel = new String(source.SecureLevel);
        }
        if (source.AppStatus != null) {
            this.AppStatus = new Boolean(source.AppStatus);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);
        this.setParamSimple(map, prefix + "DisplayName", this.DisplayName);
        this.setParamSimple(map, prefix + "LastModifiedDate", this.LastModifiedDate);
        this.setParamSimple(map, prefix + "ClientId", this.ClientId);
        this.setParamSimple(map, prefix + "ApplicationType", this.ApplicationType);
        this.setParamSimple(map, prefix + "CreatedDate", this.CreatedDate);
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "TokenExpired", this.TokenExpired);
        this.setParamSimple(map, prefix + "ClientSecret", this.ClientSecret);
        this.setParamSimple(map, prefix + "PublicKey", this.PublicKey);
        this.setParamSimple(map, prefix + "AuthorizeUrl", this.AuthorizeUrl);
        this.setParamSimple(map, prefix + "IconUrl", this.IconUrl);
        this.setParamSimple(map, prefix + "SecureLevel", this.SecureLevel);
        this.setParamSimple(map, prefix + "AppStatus", this.AppStatus);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

