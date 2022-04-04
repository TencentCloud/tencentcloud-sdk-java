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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateUserOIDCConfigRequest extends AbstractModel{

    /**
    * 身份提供商URL。OpenID Connect身份提供商标识。
对应企业IdP提供的Openid-configuration中"issuer"字段的值。
    */
    @SerializedName("IdentityUrl")
    @Expose
    private String IdentityUrl;

    /**
    * 签名公钥，需要base64_encode。验证OpenID Connect身份提供商ID Token签名的公钥。为了您的帐号安全，建议您定期轮换签名公钥。
    */
    @SerializedName("IdentityKey")
    @Expose
    private String IdentityKey;

    /**
    * 客户端ID，在OpenID Connect身份提供商注册的客户端ID。
    */
    @SerializedName("ClientId")
    @Expose
    private String ClientId;

    /**
    * 授权请求Endpoint，OpenID Connect身份提供商授权地址。对应企业IdP提供的Openid-configuration中"authorization_endpoint"字段的值。
    */
    @SerializedName("AuthorizationEndpoint")
    @Expose
    private String AuthorizationEndpoint;

    /**
    * 授权请求Response type，固定值id_token
    */
    @SerializedName("ResponseType")
    @Expose
    private String ResponseType;

    /**
    * 授权请求Response mode。授权请求返回模式，form_post和fragment两种可选模式，推荐选择form_post模式。
    */
    @SerializedName("ResponseMode")
    @Expose
    private String ResponseMode;

    /**
    * 映射字段名称。IdP的id_token中哪一个字段映射到子用户的用户名，通常是sub或者name字段
    */
    @SerializedName("MappingFiled")
    @Expose
    private String MappingFiled;

    /**
    * 授权请求Scope。openid; email;profile。授权请求信息范围。默认必选openid。
    */
    @SerializedName("Scope")
    @Expose
    private String [] Scope;

    /**
    * 描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get 身份提供商URL。OpenID Connect身份提供商标识。
对应企业IdP提供的Openid-configuration中"issuer"字段的值。 
     * @return IdentityUrl 身份提供商URL。OpenID Connect身份提供商标识。
对应企业IdP提供的Openid-configuration中"issuer"字段的值。
     */
    public String getIdentityUrl() {
        return this.IdentityUrl;
    }

    /**
     * Set 身份提供商URL。OpenID Connect身份提供商标识。
对应企业IdP提供的Openid-configuration中"issuer"字段的值。
     * @param IdentityUrl 身份提供商URL。OpenID Connect身份提供商标识。
对应企业IdP提供的Openid-configuration中"issuer"字段的值。
     */
    public void setIdentityUrl(String IdentityUrl) {
        this.IdentityUrl = IdentityUrl;
    }

    /**
     * Get 签名公钥，需要base64_encode。验证OpenID Connect身份提供商ID Token签名的公钥。为了您的帐号安全，建议您定期轮换签名公钥。 
     * @return IdentityKey 签名公钥，需要base64_encode。验证OpenID Connect身份提供商ID Token签名的公钥。为了您的帐号安全，建议您定期轮换签名公钥。
     */
    public String getIdentityKey() {
        return this.IdentityKey;
    }

    /**
     * Set 签名公钥，需要base64_encode。验证OpenID Connect身份提供商ID Token签名的公钥。为了您的帐号安全，建议您定期轮换签名公钥。
     * @param IdentityKey 签名公钥，需要base64_encode。验证OpenID Connect身份提供商ID Token签名的公钥。为了您的帐号安全，建议您定期轮换签名公钥。
     */
    public void setIdentityKey(String IdentityKey) {
        this.IdentityKey = IdentityKey;
    }

    /**
     * Get 客户端ID，在OpenID Connect身份提供商注册的客户端ID。 
     * @return ClientId 客户端ID，在OpenID Connect身份提供商注册的客户端ID。
     */
    public String getClientId() {
        return this.ClientId;
    }

    /**
     * Set 客户端ID，在OpenID Connect身份提供商注册的客户端ID。
     * @param ClientId 客户端ID，在OpenID Connect身份提供商注册的客户端ID。
     */
    public void setClientId(String ClientId) {
        this.ClientId = ClientId;
    }

    /**
     * Get 授权请求Endpoint，OpenID Connect身份提供商授权地址。对应企业IdP提供的Openid-configuration中"authorization_endpoint"字段的值。 
     * @return AuthorizationEndpoint 授权请求Endpoint，OpenID Connect身份提供商授权地址。对应企业IdP提供的Openid-configuration中"authorization_endpoint"字段的值。
     */
    public String getAuthorizationEndpoint() {
        return this.AuthorizationEndpoint;
    }

    /**
     * Set 授权请求Endpoint，OpenID Connect身份提供商授权地址。对应企业IdP提供的Openid-configuration中"authorization_endpoint"字段的值。
     * @param AuthorizationEndpoint 授权请求Endpoint，OpenID Connect身份提供商授权地址。对应企业IdP提供的Openid-configuration中"authorization_endpoint"字段的值。
     */
    public void setAuthorizationEndpoint(String AuthorizationEndpoint) {
        this.AuthorizationEndpoint = AuthorizationEndpoint;
    }

    /**
     * Get 授权请求Response type，固定值id_token 
     * @return ResponseType 授权请求Response type，固定值id_token
     */
    public String getResponseType() {
        return this.ResponseType;
    }

    /**
     * Set 授权请求Response type，固定值id_token
     * @param ResponseType 授权请求Response type，固定值id_token
     */
    public void setResponseType(String ResponseType) {
        this.ResponseType = ResponseType;
    }

    /**
     * Get 授权请求Response mode。授权请求返回模式，form_post和fragment两种可选模式，推荐选择form_post模式。 
     * @return ResponseMode 授权请求Response mode。授权请求返回模式，form_post和fragment两种可选模式，推荐选择form_post模式。
     */
    public String getResponseMode() {
        return this.ResponseMode;
    }

    /**
     * Set 授权请求Response mode。授权请求返回模式，form_post和fragment两种可选模式，推荐选择form_post模式。
     * @param ResponseMode 授权请求Response mode。授权请求返回模式，form_post和fragment两种可选模式，推荐选择form_post模式。
     */
    public void setResponseMode(String ResponseMode) {
        this.ResponseMode = ResponseMode;
    }

    /**
     * Get 映射字段名称。IdP的id_token中哪一个字段映射到子用户的用户名，通常是sub或者name字段 
     * @return MappingFiled 映射字段名称。IdP的id_token中哪一个字段映射到子用户的用户名，通常是sub或者name字段
     */
    public String getMappingFiled() {
        return this.MappingFiled;
    }

    /**
     * Set 映射字段名称。IdP的id_token中哪一个字段映射到子用户的用户名，通常是sub或者name字段
     * @param MappingFiled 映射字段名称。IdP的id_token中哪一个字段映射到子用户的用户名，通常是sub或者name字段
     */
    public void setMappingFiled(String MappingFiled) {
        this.MappingFiled = MappingFiled;
    }

    /**
     * Get 授权请求Scope。openid; email;profile。授权请求信息范围。默认必选openid。 
     * @return Scope 授权请求Scope。openid; email;profile。授权请求信息范围。默认必选openid。
     */
    public String [] getScope() {
        return this.Scope;
    }

    /**
     * Set 授权请求Scope。openid; email;profile。授权请求信息范围。默认必选openid。
     * @param Scope 授权请求Scope。openid; email;profile。授权请求信息范围。默认必选openid。
     */
    public void setScope(String [] Scope) {
        this.Scope = Scope;
    }

    /**
     * Get 描述 
     * @return Description 描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述
     * @param Description 描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public CreateUserOIDCConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateUserOIDCConfigRequest(CreateUserOIDCConfigRequest source) {
        if (source.IdentityUrl != null) {
            this.IdentityUrl = new String(source.IdentityUrl);
        }
        if (source.IdentityKey != null) {
            this.IdentityKey = new String(source.IdentityKey);
        }
        if (source.ClientId != null) {
            this.ClientId = new String(source.ClientId);
        }
        if (source.AuthorizationEndpoint != null) {
            this.AuthorizationEndpoint = new String(source.AuthorizationEndpoint);
        }
        if (source.ResponseType != null) {
            this.ResponseType = new String(source.ResponseType);
        }
        if (source.ResponseMode != null) {
            this.ResponseMode = new String(source.ResponseMode);
        }
        if (source.MappingFiled != null) {
            this.MappingFiled = new String(source.MappingFiled);
        }
        if (source.Scope != null) {
            this.Scope = new String[source.Scope.length];
            for (int i = 0; i < source.Scope.length; i++) {
                this.Scope[i] = new String(source.Scope[i]);
            }
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IdentityUrl", this.IdentityUrl);
        this.setParamSimple(map, prefix + "IdentityKey", this.IdentityKey);
        this.setParamSimple(map, prefix + "ClientId", this.ClientId);
        this.setParamSimple(map, prefix + "AuthorizationEndpoint", this.AuthorizationEndpoint);
        this.setParamSimple(map, prefix + "ResponseType", this.ResponseType);
        this.setParamSimple(map, prefix + "ResponseMode", this.ResponseMode);
        this.setParamSimple(map, prefix + "MappingFiled", this.MappingFiled);
        this.setParamArraySimple(map, prefix + "Scope.", this.Scope);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

