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
package com.tencentcloudapi.bh.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OAuthSetting extends AbstractModel {

    /**
    * 是否开启OAuth认证
    */
    @SerializedName("Enable")
    @Expose
    private Boolean Enable;

    /**
    * OAuth认证方式。
    */
    @SerializedName("AuthMethod")
    @Expose
    private String AuthMethod;

    /**
    * OAuth认证客户端Id。
    */
    @SerializedName("ClientId")
    @Expose
    private String ClientId;

    /**
    * 获取OAuth认证授权码URL。
    */
    @SerializedName("CodeUrl")
    @Expose
    private String CodeUrl;

    /**
    * 获取OAuth令牌URL。
    */
    @SerializedName("TokenUrl")
    @Expose
    private String TokenUrl;

    /**
    * 获取OAuth用户信息URL。
    */
    @SerializedName("UserInfoUrl")
    @Expose
    private String UserInfoUrl;

    /**
    * 使用Okta认证时指定范围。
    */
    @SerializedName("Scopes")
    @Expose
    private String [] Scopes;

    /**
     * Get 是否开启OAuth认证 
     * @return Enable 是否开启OAuth认证
     */
    public Boolean getEnable() {
        return this.Enable;
    }

    /**
     * Set 是否开启OAuth认证
     * @param Enable 是否开启OAuth认证
     */
    public void setEnable(Boolean Enable) {
        this.Enable = Enable;
    }

    /**
     * Get OAuth认证方式。 
     * @return AuthMethod OAuth认证方式。
     */
    public String getAuthMethod() {
        return this.AuthMethod;
    }

    /**
     * Set OAuth认证方式。
     * @param AuthMethod OAuth认证方式。
     */
    public void setAuthMethod(String AuthMethod) {
        this.AuthMethod = AuthMethod;
    }

    /**
     * Get OAuth认证客户端Id。 
     * @return ClientId OAuth认证客户端Id。
     */
    public String getClientId() {
        return this.ClientId;
    }

    /**
     * Set OAuth认证客户端Id。
     * @param ClientId OAuth认证客户端Id。
     */
    public void setClientId(String ClientId) {
        this.ClientId = ClientId;
    }

    /**
     * Get 获取OAuth认证授权码URL。 
     * @return CodeUrl 获取OAuth认证授权码URL。
     */
    public String getCodeUrl() {
        return this.CodeUrl;
    }

    /**
     * Set 获取OAuth认证授权码URL。
     * @param CodeUrl 获取OAuth认证授权码URL。
     */
    public void setCodeUrl(String CodeUrl) {
        this.CodeUrl = CodeUrl;
    }

    /**
     * Get 获取OAuth令牌URL。 
     * @return TokenUrl 获取OAuth令牌URL。
     */
    public String getTokenUrl() {
        return this.TokenUrl;
    }

    /**
     * Set 获取OAuth令牌URL。
     * @param TokenUrl 获取OAuth令牌URL。
     */
    public void setTokenUrl(String TokenUrl) {
        this.TokenUrl = TokenUrl;
    }

    /**
     * Get 获取OAuth用户信息URL。 
     * @return UserInfoUrl 获取OAuth用户信息URL。
     */
    public String getUserInfoUrl() {
        return this.UserInfoUrl;
    }

    /**
     * Set 获取OAuth用户信息URL。
     * @param UserInfoUrl 获取OAuth用户信息URL。
     */
    public void setUserInfoUrl(String UserInfoUrl) {
        this.UserInfoUrl = UserInfoUrl;
    }

    /**
     * Get 使用Okta认证时指定范围。 
     * @return Scopes 使用Okta认证时指定范围。
     */
    public String [] getScopes() {
        return this.Scopes;
    }

    /**
     * Set 使用Okta认证时指定范围。
     * @param Scopes 使用Okta认证时指定范围。
     */
    public void setScopes(String [] Scopes) {
        this.Scopes = Scopes;
    }

    public OAuthSetting() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OAuthSetting(OAuthSetting source) {
        if (source.Enable != null) {
            this.Enable = new Boolean(source.Enable);
        }
        if (source.AuthMethod != null) {
            this.AuthMethod = new String(source.AuthMethod);
        }
        if (source.ClientId != null) {
            this.ClientId = new String(source.ClientId);
        }
        if (source.CodeUrl != null) {
            this.CodeUrl = new String(source.CodeUrl);
        }
        if (source.TokenUrl != null) {
            this.TokenUrl = new String(source.TokenUrl);
        }
        if (source.UserInfoUrl != null) {
            this.UserInfoUrl = new String(source.UserInfoUrl);
        }
        if (source.Scopes != null) {
            this.Scopes = new String[source.Scopes.length];
            for (int i = 0; i < source.Scopes.length; i++) {
                this.Scopes[i] = new String(source.Scopes[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "AuthMethod", this.AuthMethod);
        this.setParamSimple(map, prefix + "ClientId", this.ClientId);
        this.setParamSimple(map, prefix + "CodeUrl", this.CodeUrl);
        this.setParamSimple(map, prefix + "TokenUrl", this.TokenUrl);
        this.setParamSimple(map, prefix + "UserInfoUrl", this.UserInfoUrl);
        this.setParamArraySimple(map, prefix + "Scopes.", this.Scopes);

    }
}

