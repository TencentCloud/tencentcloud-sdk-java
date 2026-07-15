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
package com.tencentcloudapi.cngw.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyCloudNativeAPIGatewayMCPServerAuthRequest extends AbstractModel {

    /**
    * <p>网关实例ID</p>
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * <p>MCP服务ID</p>
    */
    @SerializedName("ServerId")
    @Expose
    private String ServerId;

    /**
    * <p>认证类型</p><p>枚举值：</p><ul><li>None： 无认证</li><li>ApiKey： API Key认证</li></ul>
    */
    @SerializedName("AuthType")
    @Expose
    private String AuthType;

    /**
    * <p>JWT认证配置</p>
    */
    @SerializedName("JWTAuthConfig")
    @Expose
    private AIGWJWTAuthPluginConfig JWTAuthConfig;

    /**
    * <p>OAuth认证配置</p>
    */
    @SerializedName("OAuthAuthConfig")
    @Expose
    private AIGWOAuthAuthPluginConfig OAuthAuthConfig;

    /**
    * <p>OIDC认证配置</p>
    */
    @SerializedName("OIDCAuthConfig")
    @Expose
    private AIGWOIDCAuthPluginConfig OIDCAuthConfig;

    /**
     * Get <p>网关实例ID</p> 
     * @return GatewayId <p>网关实例ID</p>
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set <p>网关实例ID</p>
     * @param GatewayId <p>网关实例ID</p>
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get <p>MCP服务ID</p> 
     * @return ServerId <p>MCP服务ID</p>
     */
    public String getServerId() {
        return this.ServerId;
    }

    /**
     * Set <p>MCP服务ID</p>
     * @param ServerId <p>MCP服务ID</p>
     */
    public void setServerId(String ServerId) {
        this.ServerId = ServerId;
    }

    /**
     * Get <p>认证类型</p><p>枚举值：</p><ul><li>None： 无认证</li><li>ApiKey： API Key认证</li></ul> 
     * @return AuthType <p>认证类型</p><p>枚举值：</p><ul><li>None： 无认证</li><li>ApiKey： API Key认证</li></ul>
     */
    public String getAuthType() {
        return this.AuthType;
    }

    /**
     * Set <p>认证类型</p><p>枚举值：</p><ul><li>None： 无认证</li><li>ApiKey： API Key认证</li></ul>
     * @param AuthType <p>认证类型</p><p>枚举值：</p><ul><li>None： 无认证</li><li>ApiKey： API Key认证</li></ul>
     */
    public void setAuthType(String AuthType) {
        this.AuthType = AuthType;
    }

    /**
     * Get <p>JWT认证配置</p> 
     * @return JWTAuthConfig <p>JWT认证配置</p>
     */
    public AIGWJWTAuthPluginConfig getJWTAuthConfig() {
        return this.JWTAuthConfig;
    }

    /**
     * Set <p>JWT认证配置</p>
     * @param JWTAuthConfig <p>JWT认证配置</p>
     */
    public void setJWTAuthConfig(AIGWJWTAuthPluginConfig JWTAuthConfig) {
        this.JWTAuthConfig = JWTAuthConfig;
    }

    /**
     * Get <p>OAuth认证配置</p> 
     * @return OAuthAuthConfig <p>OAuth认证配置</p>
     */
    public AIGWOAuthAuthPluginConfig getOAuthAuthConfig() {
        return this.OAuthAuthConfig;
    }

    /**
     * Set <p>OAuth认证配置</p>
     * @param OAuthAuthConfig <p>OAuth认证配置</p>
     */
    public void setOAuthAuthConfig(AIGWOAuthAuthPluginConfig OAuthAuthConfig) {
        this.OAuthAuthConfig = OAuthAuthConfig;
    }

    /**
     * Get <p>OIDC认证配置</p> 
     * @return OIDCAuthConfig <p>OIDC认证配置</p>
     */
    public AIGWOIDCAuthPluginConfig getOIDCAuthConfig() {
        return this.OIDCAuthConfig;
    }

    /**
     * Set <p>OIDC认证配置</p>
     * @param OIDCAuthConfig <p>OIDC认证配置</p>
     */
    public void setOIDCAuthConfig(AIGWOIDCAuthPluginConfig OIDCAuthConfig) {
        this.OIDCAuthConfig = OIDCAuthConfig;
    }

    public ModifyCloudNativeAPIGatewayMCPServerAuthRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyCloudNativeAPIGatewayMCPServerAuthRequest(ModifyCloudNativeAPIGatewayMCPServerAuthRequest source) {
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.ServerId != null) {
            this.ServerId = new String(source.ServerId);
        }
        if (source.AuthType != null) {
            this.AuthType = new String(source.AuthType);
        }
        if (source.JWTAuthConfig != null) {
            this.JWTAuthConfig = new AIGWJWTAuthPluginConfig(source.JWTAuthConfig);
        }
        if (source.OAuthAuthConfig != null) {
            this.OAuthAuthConfig = new AIGWOAuthAuthPluginConfig(source.OAuthAuthConfig);
        }
        if (source.OIDCAuthConfig != null) {
            this.OIDCAuthConfig = new AIGWOIDCAuthPluginConfig(source.OIDCAuthConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "ServerId", this.ServerId);
        this.setParamSimple(map, prefix + "AuthType", this.AuthType);
        this.setParamObj(map, prefix + "JWTAuthConfig.", this.JWTAuthConfig);
        this.setParamObj(map, prefix + "OAuthAuthConfig.", this.OAuthAuthConfig);
        this.setParamObj(map, prefix + "OIDCAuthConfig.", this.OIDCAuthConfig);

    }
}

