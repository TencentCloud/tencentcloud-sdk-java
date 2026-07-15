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

public class AIGWOIDCAuthPluginConfig extends AbstractModel {

    /**
    * <p>目标受众</p>
    */
    @SerializedName("Audience")
    @Expose
    private String Audience;

    /**
    * <p>是否BearerOnly</p><p>目前只能为true</p>
    */
    @SerializedName("BearerOnly")
    @Expose
    private Boolean BearerOnly;

    /**
    * <p>授权范围</p>
    */
    @SerializedName("Scopes")
    @Expose
    private String [] Scopes;

    /**
    * <p>消费者标识</p>
    */
    @SerializedName("ConsumerClaim")
    @Expose
    private String ConsumerClaim;

    /**
    * <p>认证域</p>
    */
    @SerializedName("Realm")
    @Expose
    private String Realm;

    /**
    * <p>超时时间</p>
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
    * <p>令牌端点认证方法</p><p>枚举值：</p><ul><li>client_secret_post： client_secret_post</li><li>client_secret_basic： client_secret_basic</li><li>private_key_jwt： private_key_jwt</li></ul>
    */
    @SerializedName("TokenEndpointAuthMethod")
    @Expose
    private String TokenEndpointAuthMethod;

    /**
    * <p>令牌内省端点</p>
    */
    @SerializedName("IntrospectionEndpoint")
    @Expose
    private String IntrospectionEndpoint;

    /**
    * <p>令牌内省端点认证方法</p><p>枚举值：</p><ul><li>client_secret_basic： client_secret_basic</li><li>client_secret_post： client_secret_post</li></ul>
    */
    @SerializedName("IntrospectionEndpointAuthMethod")
    @Expose
    private String IntrospectionEndpointAuthMethod;

    /**
    * <p>签发者地址</p>
    */
    @SerializedName("IssuerURL")
    @Expose
    private String IssuerURL;

    /**
    * <p>客户端 ID</p>
    */
    @SerializedName("ClientId")
    @Expose
    private String ClientId;

    /**
    * <p>客户端密钥</p>
    */
    @SerializedName("ClientSecret")
    @Expose
    private String ClientSecret;

    /**
     * Get <p>目标受众</p> 
     * @return Audience <p>目标受众</p>
     */
    public String getAudience() {
        return this.Audience;
    }

    /**
     * Set <p>目标受众</p>
     * @param Audience <p>目标受众</p>
     */
    public void setAudience(String Audience) {
        this.Audience = Audience;
    }

    /**
     * Get <p>是否BearerOnly</p><p>目前只能为true</p> 
     * @return BearerOnly <p>是否BearerOnly</p><p>目前只能为true</p>
     */
    public Boolean getBearerOnly() {
        return this.BearerOnly;
    }

    /**
     * Set <p>是否BearerOnly</p><p>目前只能为true</p>
     * @param BearerOnly <p>是否BearerOnly</p><p>目前只能为true</p>
     */
    public void setBearerOnly(Boolean BearerOnly) {
        this.BearerOnly = BearerOnly;
    }

    /**
     * Get <p>授权范围</p> 
     * @return Scopes <p>授权范围</p>
     */
    public String [] getScopes() {
        return this.Scopes;
    }

    /**
     * Set <p>授权范围</p>
     * @param Scopes <p>授权范围</p>
     */
    public void setScopes(String [] Scopes) {
        this.Scopes = Scopes;
    }

    /**
     * Get <p>消费者标识</p> 
     * @return ConsumerClaim <p>消费者标识</p>
     */
    public String getConsumerClaim() {
        return this.ConsumerClaim;
    }

    /**
     * Set <p>消费者标识</p>
     * @param ConsumerClaim <p>消费者标识</p>
     */
    public void setConsumerClaim(String ConsumerClaim) {
        this.ConsumerClaim = ConsumerClaim;
    }

    /**
     * Get <p>认证域</p> 
     * @return Realm <p>认证域</p>
     */
    public String getRealm() {
        return this.Realm;
    }

    /**
     * Set <p>认证域</p>
     * @param Realm <p>认证域</p>
     */
    public void setRealm(String Realm) {
        this.Realm = Realm;
    }

    /**
     * Get <p>超时时间</p> 
     * @return Timeout <p>超时时间</p>
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set <p>超时时间</p>
     * @param Timeout <p>超时时间</p>
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get <p>令牌端点认证方法</p><p>枚举值：</p><ul><li>client_secret_post： client_secret_post</li><li>client_secret_basic： client_secret_basic</li><li>private_key_jwt： private_key_jwt</li></ul> 
     * @return TokenEndpointAuthMethod <p>令牌端点认证方法</p><p>枚举值：</p><ul><li>client_secret_post： client_secret_post</li><li>client_secret_basic： client_secret_basic</li><li>private_key_jwt： private_key_jwt</li></ul>
     */
    public String getTokenEndpointAuthMethod() {
        return this.TokenEndpointAuthMethod;
    }

    /**
     * Set <p>令牌端点认证方法</p><p>枚举值：</p><ul><li>client_secret_post： client_secret_post</li><li>client_secret_basic： client_secret_basic</li><li>private_key_jwt： private_key_jwt</li></ul>
     * @param TokenEndpointAuthMethod <p>令牌端点认证方法</p><p>枚举值：</p><ul><li>client_secret_post： client_secret_post</li><li>client_secret_basic： client_secret_basic</li><li>private_key_jwt： private_key_jwt</li></ul>
     */
    public void setTokenEndpointAuthMethod(String TokenEndpointAuthMethod) {
        this.TokenEndpointAuthMethod = TokenEndpointAuthMethod;
    }

    /**
     * Get <p>令牌内省端点</p> 
     * @return IntrospectionEndpoint <p>令牌内省端点</p>
     */
    public String getIntrospectionEndpoint() {
        return this.IntrospectionEndpoint;
    }

    /**
     * Set <p>令牌内省端点</p>
     * @param IntrospectionEndpoint <p>令牌内省端点</p>
     */
    public void setIntrospectionEndpoint(String IntrospectionEndpoint) {
        this.IntrospectionEndpoint = IntrospectionEndpoint;
    }

    /**
     * Get <p>令牌内省端点认证方法</p><p>枚举值：</p><ul><li>client_secret_basic： client_secret_basic</li><li>client_secret_post： client_secret_post</li></ul> 
     * @return IntrospectionEndpointAuthMethod <p>令牌内省端点认证方法</p><p>枚举值：</p><ul><li>client_secret_basic： client_secret_basic</li><li>client_secret_post： client_secret_post</li></ul>
     */
    public String getIntrospectionEndpointAuthMethod() {
        return this.IntrospectionEndpointAuthMethod;
    }

    /**
     * Set <p>令牌内省端点认证方法</p><p>枚举值：</p><ul><li>client_secret_basic： client_secret_basic</li><li>client_secret_post： client_secret_post</li></ul>
     * @param IntrospectionEndpointAuthMethod <p>令牌内省端点认证方法</p><p>枚举值：</p><ul><li>client_secret_basic： client_secret_basic</li><li>client_secret_post： client_secret_post</li></ul>
     */
    public void setIntrospectionEndpointAuthMethod(String IntrospectionEndpointAuthMethod) {
        this.IntrospectionEndpointAuthMethod = IntrospectionEndpointAuthMethod;
    }

    /**
     * Get <p>签发者地址</p> 
     * @return IssuerURL <p>签发者地址</p>
     */
    public String getIssuerURL() {
        return this.IssuerURL;
    }

    /**
     * Set <p>签发者地址</p>
     * @param IssuerURL <p>签发者地址</p>
     */
    public void setIssuerURL(String IssuerURL) {
        this.IssuerURL = IssuerURL;
    }

    /**
     * Get <p>客户端 ID</p> 
     * @return ClientId <p>客户端 ID</p>
     */
    public String getClientId() {
        return this.ClientId;
    }

    /**
     * Set <p>客户端 ID</p>
     * @param ClientId <p>客户端 ID</p>
     */
    public void setClientId(String ClientId) {
        this.ClientId = ClientId;
    }

    /**
     * Get <p>客户端密钥</p> 
     * @return ClientSecret <p>客户端密钥</p>
     */
    public String getClientSecret() {
        return this.ClientSecret;
    }

    /**
     * Set <p>客户端密钥</p>
     * @param ClientSecret <p>客户端密钥</p>
     */
    public void setClientSecret(String ClientSecret) {
        this.ClientSecret = ClientSecret;
    }

    public AIGWOIDCAuthPluginConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AIGWOIDCAuthPluginConfig(AIGWOIDCAuthPluginConfig source) {
        if (source.Audience != null) {
            this.Audience = new String(source.Audience);
        }
        if (source.BearerOnly != null) {
            this.BearerOnly = new Boolean(source.BearerOnly);
        }
        if (source.Scopes != null) {
            this.Scopes = new String[source.Scopes.length];
            for (int i = 0; i < source.Scopes.length; i++) {
                this.Scopes[i] = new String(source.Scopes[i]);
            }
        }
        if (source.ConsumerClaim != null) {
            this.ConsumerClaim = new String(source.ConsumerClaim);
        }
        if (source.Realm != null) {
            this.Realm = new String(source.Realm);
        }
        if (source.Timeout != null) {
            this.Timeout = new Long(source.Timeout);
        }
        if (source.TokenEndpointAuthMethod != null) {
            this.TokenEndpointAuthMethod = new String(source.TokenEndpointAuthMethod);
        }
        if (source.IntrospectionEndpoint != null) {
            this.IntrospectionEndpoint = new String(source.IntrospectionEndpoint);
        }
        if (source.IntrospectionEndpointAuthMethod != null) {
            this.IntrospectionEndpointAuthMethod = new String(source.IntrospectionEndpointAuthMethod);
        }
        if (source.IssuerURL != null) {
            this.IssuerURL = new String(source.IssuerURL);
        }
        if (source.ClientId != null) {
            this.ClientId = new String(source.ClientId);
        }
        if (source.ClientSecret != null) {
            this.ClientSecret = new String(source.ClientSecret);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Audience", this.Audience);
        this.setParamSimple(map, prefix + "BearerOnly", this.BearerOnly);
        this.setParamArraySimple(map, prefix + "Scopes.", this.Scopes);
        this.setParamSimple(map, prefix + "ConsumerClaim", this.ConsumerClaim);
        this.setParamSimple(map, prefix + "Realm", this.Realm);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);
        this.setParamSimple(map, prefix + "TokenEndpointAuthMethod", this.TokenEndpointAuthMethod);
        this.setParamSimple(map, prefix + "IntrospectionEndpoint", this.IntrospectionEndpoint);
        this.setParamSimple(map, prefix + "IntrospectionEndpointAuthMethod", this.IntrospectionEndpointAuthMethod);
        this.setParamSimple(map, prefix + "IssuerURL", this.IssuerURL);
        this.setParamSimple(map, prefix + "ClientId", this.ClientId);
        this.setParamSimple(map, prefix + "ClientSecret", this.ClientSecret);

    }
}

