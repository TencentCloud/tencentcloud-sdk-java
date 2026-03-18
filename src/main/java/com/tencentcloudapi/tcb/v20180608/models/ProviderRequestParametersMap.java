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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProviderRequestParametersMap extends AbstractModel {

    /**
    * OAuth 标准协议中的 client_id。不同第三方平台的字段名称可能不同，例如微信平台对应 appid、新浪微博对应 app_id。
    */
    @SerializedName("ClientId")
    @Expose
    private String ClientId;

    /**
    * OAuth 标准协议中的 client_secret，用于身份认证源的密钥鉴权。请妥善保管，避免泄露。
    */
    @SerializedName("ClientSecret")
    @Expose
    private String ClientSecret;

    /**
    * OAuth 标准协议中的 redirect_uri，即授权回调地址。用户完成第三方认证后将重定向至该地址。
    */
    @SerializedName("RedirectUri")
    @Expose
    private String RedirectUri;

    /**
    * 身份源注册用户时自动绑定的角色 ID。配置后，通过该身份源注册的新用户将自动关联指定角色。
    */
    @SerializedName("RegisterUserRoleId")
    @Expose
    private String RegisterUserRoleId;

    /**
    * 身份源注册用户时是否自动授予许可证。取值范围：
TRUE：自动授权许可证
FALSE：不自动授权（默认值）
    */
    @SerializedName("RegisterUserAutoLicense")
    @Expose
    private String RegisterUserAutoLicense;

    /**
    * OAuth 获取 Token 时认证信息的请求位置。取值范围：
URL：将认证信息放在请求 URL 参数中
Headers：将认证信息放在请求 Header 中
Body：将认证信息放在请求 Body 中
    */
    @SerializedName("AuthPosition")
    @Expose
    private String AuthPosition;

    /**
    * OAuth 授权模式匹配的参数字段名。用于指定获取 Token 请求中 grant_type 参数对应的字段名称。
    */
    @SerializedName("GrantType")
    @Expose
    private String GrantType;

    /**
    * OAuth 授权模式类型。用于指定 grant_type 的值，例如 client_credentials 表示客户端凭证模式。
    */
    @SerializedName("ClientCredentials")
    @Expose
    private String ClientCredentials;

    /**
    * OAuth 返回中 access_token 的映射字段名。若第三方平台返回的 Token 字段名不是标准的 access_token，可通过此字段指定实际字段名。
    */
    @SerializedName("AccessToken")
    @Expose
    private String AccessToken;

    /**
    * OAuth 返回中 Token 有效期的映射字段名。若第三方平台返回的有效期字段名不是标准的 expires_in，可通过此字段指定实际字段名。
    */
    @SerializedName("ExpiresIn")
    @Expose
    private String ExpiresIn;

    /**
    * 身份源注册用户时的用户类型。取值范围：
externalUser：外部用户
internalUser：内部用户
默认值为 externalUser。
    */
    @SerializedName("RegisterUserType")
    @Expose
    private String RegisterUserType;

    /**
     * Get OAuth 标准协议中的 client_id。不同第三方平台的字段名称可能不同，例如微信平台对应 appid、新浪微博对应 app_id。 
     * @return ClientId OAuth 标准协议中的 client_id。不同第三方平台的字段名称可能不同，例如微信平台对应 appid、新浪微博对应 app_id。
     */
    public String getClientId() {
        return this.ClientId;
    }

    /**
     * Set OAuth 标准协议中的 client_id。不同第三方平台的字段名称可能不同，例如微信平台对应 appid、新浪微博对应 app_id。
     * @param ClientId OAuth 标准协议中的 client_id。不同第三方平台的字段名称可能不同，例如微信平台对应 appid、新浪微博对应 app_id。
     */
    public void setClientId(String ClientId) {
        this.ClientId = ClientId;
    }

    /**
     * Get OAuth 标准协议中的 client_secret，用于身份认证源的密钥鉴权。请妥善保管，避免泄露。 
     * @return ClientSecret OAuth 标准协议中的 client_secret，用于身份认证源的密钥鉴权。请妥善保管，避免泄露。
     */
    public String getClientSecret() {
        return this.ClientSecret;
    }

    /**
     * Set OAuth 标准协议中的 client_secret，用于身份认证源的密钥鉴权。请妥善保管，避免泄露。
     * @param ClientSecret OAuth 标准协议中的 client_secret，用于身份认证源的密钥鉴权。请妥善保管，避免泄露。
     */
    public void setClientSecret(String ClientSecret) {
        this.ClientSecret = ClientSecret;
    }

    /**
     * Get OAuth 标准协议中的 redirect_uri，即授权回调地址。用户完成第三方认证后将重定向至该地址。 
     * @return RedirectUri OAuth 标准协议中的 redirect_uri，即授权回调地址。用户完成第三方认证后将重定向至该地址。
     */
    public String getRedirectUri() {
        return this.RedirectUri;
    }

    /**
     * Set OAuth 标准协议中的 redirect_uri，即授权回调地址。用户完成第三方认证后将重定向至该地址。
     * @param RedirectUri OAuth 标准协议中的 redirect_uri，即授权回调地址。用户完成第三方认证后将重定向至该地址。
     */
    public void setRedirectUri(String RedirectUri) {
        this.RedirectUri = RedirectUri;
    }

    /**
     * Get 身份源注册用户时自动绑定的角色 ID。配置后，通过该身份源注册的新用户将自动关联指定角色。 
     * @return RegisterUserRoleId 身份源注册用户时自动绑定的角色 ID。配置后，通过该身份源注册的新用户将自动关联指定角色。
     */
    public String getRegisterUserRoleId() {
        return this.RegisterUserRoleId;
    }

    /**
     * Set 身份源注册用户时自动绑定的角色 ID。配置后，通过该身份源注册的新用户将自动关联指定角色。
     * @param RegisterUserRoleId 身份源注册用户时自动绑定的角色 ID。配置后，通过该身份源注册的新用户将自动关联指定角色。
     */
    public void setRegisterUserRoleId(String RegisterUserRoleId) {
        this.RegisterUserRoleId = RegisterUserRoleId;
    }

    /**
     * Get 身份源注册用户时是否自动授予许可证。取值范围：
TRUE：自动授权许可证
FALSE：不自动授权（默认值） 
     * @return RegisterUserAutoLicense 身份源注册用户时是否自动授予许可证。取值范围：
TRUE：自动授权许可证
FALSE：不自动授权（默认值）
     */
    public String getRegisterUserAutoLicense() {
        return this.RegisterUserAutoLicense;
    }

    /**
     * Set 身份源注册用户时是否自动授予许可证。取值范围：
TRUE：自动授权许可证
FALSE：不自动授权（默认值）
     * @param RegisterUserAutoLicense 身份源注册用户时是否自动授予许可证。取值范围：
TRUE：自动授权许可证
FALSE：不自动授权（默认值）
     */
    public void setRegisterUserAutoLicense(String RegisterUserAutoLicense) {
        this.RegisterUserAutoLicense = RegisterUserAutoLicense;
    }

    /**
     * Get OAuth 获取 Token 时认证信息的请求位置。取值范围：
URL：将认证信息放在请求 URL 参数中
Headers：将认证信息放在请求 Header 中
Body：将认证信息放在请求 Body 中 
     * @return AuthPosition OAuth 获取 Token 时认证信息的请求位置。取值范围：
URL：将认证信息放在请求 URL 参数中
Headers：将认证信息放在请求 Header 中
Body：将认证信息放在请求 Body 中
     */
    public String getAuthPosition() {
        return this.AuthPosition;
    }

    /**
     * Set OAuth 获取 Token 时认证信息的请求位置。取值范围：
URL：将认证信息放在请求 URL 参数中
Headers：将认证信息放在请求 Header 中
Body：将认证信息放在请求 Body 中
     * @param AuthPosition OAuth 获取 Token 时认证信息的请求位置。取值范围：
URL：将认证信息放在请求 URL 参数中
Headers：将认证信息放在请求 Header 中
Body：将认证信息放在请求 Body 中
     */
    public void setAuthPosition(String AuthPosition) {
        this.AuthPosition = AuthPosition;
    }

    /**
     * Get OAuth 授权模式匹配的参数字段名。用于指定获取 Token 请求中 grant_type 参数对应的字段名称。 
     * @return GrantType OAuth 授权模式匹配的参数字段名。用于指定获取 Token 请求中 grant_type 参数对应的字段名称。
     */
    public String getGrantType() {
        return this.GrantType;
    }

    /**
     * Set OAuth 授权模式匹配的参数字段名。用于指定获取 Token 请求中 grant_type 参数对应的字段名称。
     * @param GrantType OAuth 授权模式匹配的参数字段名。用于指定获取 Token 请求中 grant_type 参数对应的字段名称。
     */
    public void setGrantType(String GrantType) {
        this.GrantType = GrantType;
    }

    /**
     * Get OAuth 授权模式类型。用于指定 grant_type 的值，例如 client_credentials 表示客户端凭证模式。 
     * @return ClientCredentials OAuth 授权模式类型。用于指定 grant_type 的值，例如 client_credentials 表示客户端凭证模式。
     */
    public String getClientCredentials() {
        return this.ClientCredentials;
    }

    /**
     * Set OAuth 授权模式类型。用于指定 grant_type 的值，例如 client_credentials 表示客户端凭证模式。
     * @param ClientCredentials OAuth 授权模式类型。用于指定 grant_type 的值，例如 client_credentials 表示客户端凭证模式。
     */
    public void setClientCredentials(String ClientCredentials) {
        this.ClientCredentials = ClientCredentials;
    }

    /**
     * Get OAuth 返回中 access_token 的映射字段名。若第三方平台返回的 Token 字段名不是标准的 access_token，可通过此字段指定实际字段名。 
     * @return AccessToken OAuth 返回中 access_token 的映射字段名。若第三方平台返回的 Token 字段名不是标准的 access_token，可通过此字段指定实际字段名。
     */
    public String getAccessToken() {
        return this.AccessToken;
    }

    /**
     * Set OAuth 返回中 access_token 的映射字段名。若第三方平台返回的 Token 字段名不是标准的 access_token，可通过此字段指定实际字段名。
     * @param AccessToken OAuth 返回中 access_token 的映射字段名。若第三方平台返回的 Token 字段名不是标准的 access_token，可通过此字段指定实际字段名。
     */
    public void setAccessToken(String AccessToken) {
        this.AccessToken = AccessToken;
    }

    /**
     * Get OAuth 返回中 Token 有效期的映射字段名。若第三方平台返回的有效期字段名不是标准的 expires_in，可通过此字段指定实际字段名。 
     * @return ExpiresIn OAuth 返回中 Token 有效期的映射字段名。若第三方平台返回的有效期字段名不是标准的 expires_in，可通过此字段指定实际字段名。
     */
    public String getExpiresIn() {
        return this.ExpiresIn;
    }

    /**
     * Set OAuth 返回中 Token 有效期的映射字段名。若第三方平台返回的有效期字段名不是标准的 expires_in，可通过此字段指定实际字段名。
     * @param ExpiresIn OAuth 返回中 Token 有效期的映射字段名。若第三方平台返回的有效期字段名不是标准的 expires_in，可通过此字段指定实际字段名。
     */
    public void setExpiresIn(String ExpiresIn) {
        this.ExpiresIn = ExpiresIn;
    }

    /**
     * Get 身份源注册用户时的用户类型。取值范围：
externalUser：外部用户
internalUser：内部用户
默认值为 externalUser。 
     * @return RegisterUserType 身份源注册用户时的用户类型。取值范围：
externalUser：外部用户
internalUser：内部用户
默认值为 externalUser。
     */
    public String getRegisterUserType() {
        return this.RegisterUserType;
    }

    /**
     * Set 身份源注册用户时的用户类型。取值范围：
externalUser：外部用户
internalUser：内部用户
默认值为 externalUser。
     * @param RegisterUserType 身份源注册用户时的用户类型。取值范围：
externalUser：外部用户
internalUser：内部用户
默认值为 externalUser。
     */
    public void setRegisterUserType(String RegisterUserType) {
        this.RegisterUserType = RegisterUserType;
    }

    public ProviderRequestParametersMap() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProviderRequestParametersMap(ProviderRequestParametersMap source) {
        if (source.ClientId != null) {
            this.ClientId = new String(source.ClientId);
        }
        if (source.ClientSecret != null) {
            this.ClientSecret = new String(source.ClientSecret);
        }
        if (source.RedirectUri != null) {
            this.RedirectUri = new String(source.RedirectUri);
        }
        if (source.RegisterUserRoleId != null) {
            this.RegisterUserRoleId = new String(source.RegisterUserRoleId);
        }
        if (source.RegisterUserAutoLicense != null) {
            this.RegisterUserAutoLicense = new String(source.RegisterUserAutoLicense);
        }
        if (source.AuthPosition != null) {
            this.AuthPosition = new String(source.AuthPosition);
        }
        if (source.GrantType != null) {
            this.GrantType = new String(source.GrantType);
        }
        if (source.ClientCredentials != null) {
            this.ClientCredentials = new String(source.ClientCredentials);
        }
        if (source.AccessToken != null) {
            this.AccessToken = new String(source.AccessToken);
        }
        if (source.ExpiresIn != null) {
            this.ExpiresIn = new String(source.ExpiresIn);
        }
        if (source.RegisterUserType != null) {
            this.RegisterUserType = new String(source.RegisterUserType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClientId", this.ClientId);
        this.setParamSimple(map, prefix + "ClientSecret", this.ClientSecret);
        this.setParamSimple(map, prefix + "RedirectUri", this.RedirectUri);
        this.setParamSimple(map, prefix + "RegisterUserRoleId", this.RegisterUserRoleId);
        this.setParamSimple(map, prefix + "RegisterUserAutoLicense", this.RegisterUserAutoLicense);
        this.setParamSimple(map, prefix + "AuthPosition", this.AuthPosition);
        this.setParamSimple(map, prefix + "GrantType", this.GrantType);
        this.setParamSimple(map, prefix + "ClientCredentials", this.ClientCredentials);
        this.setParamSimple(map, prefix + "AccessToken", this.AccessToken);
        this.setParamSimple(map, prefix + "ExpiresIn", this.ExpiresIn);
        this.setParamSimple(map, prefix + "RegisterUserType", this.RegisterUserType);

    }
}

