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

public class AuthConfig extends AbstractModel {

    /**
    * <p>授权方式。</p><p>枚举值：</p><ul><li>0：无鉴权</li><li>1：API Key 鉴权</li><li>2：CAM 授权</li><li>3：OAuth 2.0 授权</li></ul>
    */
    @SerializedName("AuthType")
    @Expose
    private Long AuthType;

    /**
    * API Key授权配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApiKeyAuthConfig")
    @Expose
    private ApiKeyAuthConfig ApiKeyAuthConfig;

    /**
    * CAM授权配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CamAuthConfig")
    @Expose
    private CamAuthConfig CamAuthConfig;

    /**
    * OAuth2.0授权配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OAuthConfig")
    @Expose
    private OAuthConfig OAuthConfig;

    /**
     * Get <p>授权方式。</p><p>枚举值：</p><ul><li>0：无鉴权</li><li>1：API Key 鉴权</li><li>2：CAM 授权</li><li>3：OAuth 2.0 授权</li></ul> 
     * @return AuthType <p>授权方式。</p><p>枚举值：</p><ul><li>0：无鉴权</li><li>1：API Key 鉴权</li><li>2：CAM 授权</li><li>3：OAuth 2.0 授权</li></ul>
     */
    public Long getAuthType() {
        return this.AuthType;
    }

    /**
     * Set <p>授权方式。</p><p>枚举值：</p><ul><li>0：无鉴权</li><li>1：API Key 鉴权</li><li>2：CAM 授权</li><li>3：OAuth 2.0 授权</li></ul>
     * @param AuthType <p>授权方式。</p><p>枚举值：</p><ul><li>0：无鉴权</li><li>1：API Key 鉴权</li><li>2：CAM 授权</li><li>3：OAuth 2.0 授权</li></ul>
     */
    public void setAuthType(Long AuthType) {
        this.AuthType = AuthType;
    }

    /**
     * Get API Key授权配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApiKeyAuthConfig API Key授权配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ApiKeyAuthConfig getApiKeyAuthConfig() {
        return this.ApiKeyAuthConfig;
    }

    /**
     * Set API Key授权配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApiKeyAuthConfig API Key授权配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApiKeyAuthConfig(ApiKeyAuthConfig ApiKeyAuthConfig) {
        this.ApiKeyAuthConfig = ApiKeyAuthConfig;
    }

    /**
     * Get CAM授权配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CamAuthConfig CAM授权配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CamAuthConfig getCamAuthConfig() {
        return this.CamAuthConfig;
    }

    /**
     * Set CAM授权配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param CamAuthConfig CAM授权配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCamAuthConfig(CamAuthConfig CamAuthConfig) {
        this.CamAuthConfig = CamAuthConfig;
    }

    /**
     * Get OAuth2.0授权配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OAuthConfig OAuth2.0授权配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public OAuthConfig getOAuthConfig() {
        return this.OAuthConfig;
    }

    /**
     * Set OAuth2.0授权配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param OAuthConfig OAuth2.0授权配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOAuthConfig(OAuthConfig OAuthConfig) {
        this.OAuthConfig = OAuthConfig;
    }

    public AuthConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AuthConfig(AuthConfig source) {
        if (source.AuthType != null) {
            this.AuthType = new Long(source.AuthType);
        }
        if (source.ApiKeyAuthConfig != null) {
            this.ApiKeyAuthConfig = new ApiKeyAuthConfig(source.ApiKeyAuthConfig);
        }
        if (source.CamAuthConfig != null) {
            this.CamAuthConfig = new CamAuthConfig(source.CamAuthConfig);
        }
        if (source.OAuthConfig != null) {
            this.OAuthConfig = new OAuthConfig(source.OAuthConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AuthType", this.AuthType);
        this.setParamObj(map, prefix + "ApiKeyAuthConfig.", this.ApiKeyAuthConfig);
        this.setParamObj(map, prefix + "CamAuthConfig.", this.CamAuthConfig);
        this.setParamObj(map, prefix + "OAuthConfig.", this.OAuthConfig);

    }
}

