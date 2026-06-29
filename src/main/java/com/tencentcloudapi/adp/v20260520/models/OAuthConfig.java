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

public class OAuthConfig extends AbstractModel {

    /**
    * OAuth服务方授权页url地址
    */
    @SerializedName("AuthorizationUrl")
    @Expose
    private String AuthorizationUrl;

    /**
    * 客户端ID
    */
    @SerializedName("ClientId")
    @Expose
    private String ClientId;

    /**
    * 客户端密钥
    */
    @SerializedName("ClientSecret")
    @Expose
    private String ClientSecret;

    /**
    * 请求授权的数据范围
    */
    @SerializedName("ScopeList")
    @Expose
    private String [] ScopeList;

    /**
    * 获取access token的url地址
    */
    @SerializedName("TokenUrl")
    @Expose
    private String TokenUrl;

    /**
     * Get OAuth服务方授权页url地址 
     * @return AuthorizationUrl OAuth服务方授权页url地址
     */
    public String getAuthorizationUrl() {
        return this.AuthorizationUrl;
    }

    /**
     * Set OAuth服务方授权页url地址
     * @param AuthorizationUrl OAuth服务方授权页url地址
     */
    public void setAuthorizationUrl(String AuthorizationUrl) {
        this.AuthorizationUrl = AuthorizationUrl;
    }

    /**
     * Get 客户端ID 
     * @return ClientId 客户端ID
     */
    public String getClientId() {
        return this.ClientId;
    }

    /**
     * Set 客户端ID
     * @param ClientId 客户端ID
     */
    public void setClientId(String ClientId) {
        this.ClientId = ClientId;
    }

    /**
     * Get 客户端密钥 
     * @return ClientSecret 客户端密钥
     */
    public String getClientSecret() {
        return this.ClientSecret;
    }

    /**
     * Set 客户端密钥
     * @param ClientSecret 客户端密钥
     */
    public void setClientSecret(String ClientSecret) {
        this.ClientSecret = ClientSecret;
    }

    /**
     * Get 请求授权的数据范围 
     * @return ScopeList 请求授权的数据范围
     */
    public String [] getScopeList() {
        return this.ScopeList;
    }

    /**
     * Set 请求授权的数据范围
     * @param ScopeList 请求授权的数据范围
     */
    public void setScopeList(String [] ScopeList) {
        this.ScopeList = ScopeList;
    }

    /**
     * Get 获取access token的url地址 
     * @return TokenUrl 获取access token的url地址
     */
    public String getTokenUrl() {
        return this.TokenUrl;
    }

    /**
     * Set 获取access token的url地址
     * @param TokenUrl 获取access token的url地址
     */
    public void setTokenUrl(String TokenUrl) {
        this.TokenUrl = TokenUrl;
    }

    public OAuthConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OAuthConfig(OAuthConfig source) {
        if (source.AuthorizationUrl != null) {
            this.AuthorizationUrl = new String(source.AuthorizationUrl);
        }
        if (source.ClientId != null) {
            this.ClientId = new String(source.ClientId);
        }
        if (source.ClientSecret != null) {
            this.ClientSecret = new String(source.ClientSecret);
        }
        if (source.ScopeList != null) {
            this.ScopeList = new String[source.ScopeList.length];
            for (int i = 0; i < source.ScopeList.length; i++) {
                this.ScopeList[i] = new String(source.ScopeList[i]);
            }
        }
        if (source.TokenUrl != null) {
            this.TokenUrl = new String(source.TokenUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AuthorizationUrl", this.AuthorizationUrl);
        this.setParamSimple(map, prefix + "ClientId", this.ClientId);
        this.setParamSimple(map, prefix + "ClientSecret", this.ClientSecret);
        this.setParamArraySimple(map, prefix + "ScopeList.", this.ScopeList);
        this.setParamSimple(map, prefix + "TokenUrl", this.TokenUrl);

    }
}

