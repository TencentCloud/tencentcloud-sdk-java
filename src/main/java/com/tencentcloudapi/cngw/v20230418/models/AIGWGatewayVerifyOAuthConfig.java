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

public class AIGWGatewayVerifyOAuthConfig extends AbstractModel {

    /**
    * <p>令牌校验方式</p><p>枚举值：</p><ul><li>JWTJWKS： JWTJWKS</li><li>Introspection： Introspection</li></ul><p>切换方式后另一方式专属字段不生效</p>
    */
    @SerializedName("VerifyMethod")
    @Expose
    private String VerifyMethod;

    /**
    * <p>令牌签发者，校验 iss；VerifyMethod=JWTJWKS 时必填</p>
    */
    @SerializedName("Issuer")
    @Expose
    private String Issuer;

    /**
    * <p>JWKS 地址</p><p>入参限制：VerifyMethod=JWTJWKS 时必填</p>
    */
    @SerializedName("JwksUri")
    @Expose
    private String JwksUri;

    /**
    * <p>校验 aud</p>
    */
    @SerializedName("Audience")
    @Expose
    private String Audience;

    /**
    * <p>JWKS 缓存秒数，默认 3600，必须大于 0</p><p>默认值：3600</p>
    */
    @SerializedName("JwksCacheTtl")
    @Expose
    private Long JwksCacheTtl;

    /**
    * <p>令牌内省端点</p><p>入参限制：VerifyMethod=Introspection 时必填</p>
    */
    @SerializedName("IntrospectionEndpoint")
    @Expose
    private String IntrospectionEndpoint;

    /**
    * <p>调用内省端点的 Client ID</p><p>入参限制：VerifyMethod=Introspection 时必填</p>
    */
    @SerializedName("IntrospectionClientId")
    @Expose
    private String IntrospectionClientId;

    /**
    * <p>调用内省端点的 Client Secret</p><p>入参限制：VerifyMethod=Introspection 时必填</p><p>加密落库，查询时无论 Enable 状态均脱敏</p>
    */
    @SerializedName("IntrospectionClientSecret")
    @Expose
    private String IntrospectionClientSecret;

    /**
    * <p>内省结果缓存秒数</p><p>默认值：60</p><p>0 表示不缓存</p>
    */
    @SerializedName("IntrospectionCacheTtl")
    @Expose
    private Long IntrospectionCacheTtl;

    /**
    * <p>逗号分隔的 scope 白名单；令牌需命中其一，否则 401</p>
    */
    @SerializedName("ScopeWhitelist")
    @Expose
    private String ScopeWhitelist;

    /**
    * <p>读取调用方令牌的 Header 名</p><p>默认值：Authorization</p>
    */
    @SerializedName("TokenHeader")
    @Expose
    private String TokenHeader;

    /**
     * Get <p>令牌校验方式</p><p>枚举值：</p><ul><li>JWTJWKS： JWTJWKS</li><li>Introspection： Introspection</li></ul><p>切换方式后另一方式专属字段不生效</p> 
     * @return VerifyMethod <p>令牌校验方式</p><p>枚举值：</p><ul><li>JWTJWKS： JWTJWKS</li><li>Introspection： Introspection</li></ul><p>切换方式后另一方式专属字段不生效</p>
     */
    public String getVerifyMethod() {
        return this.VerifyMethod;
    }

    /**
     * Set <p>令牌校验方式</p><p>枚举值：</p><ul><li>JWTJWKS： JWTJWKS</li><li>Introspection： Introspection</li></ul><p>切换方式后另一方式专属字段不生效</p>
     * @param VerifyMethod <p>令牌校验方式</p><p>枚举值：</p><ul><li>JWTJWKS： JWTJWKS</li><li>Introspection： Introspection</li></ul><p>切换方式后另一方式专属字段不生效</p>
     */
    public void setVerifyMethod(String VerifyMethod) {
        this.VerifyMethod = VerifyMethod;
    }

    /**
     * Get <p>令牌签发者，校验 iss；VerifyMethod=JWTJWKS 时必填</p> 
     * @return Issuer <p>令牌签发者，校验 iss；VerifyMethod=JWTJWKS 时必填</p>
     */
    public String getIssuer() {
        return this.Issuer;
    }

    /**
     * Set <p>令牌签发者，校验 iss；VerifyMethod=JWTJWKS 时必填</p>
     * @param Issuer <p>令牌签发者，校验 iss；VerifyMethod=JWTJWKS 时必填</p>
     */
    public void setIssuer(String Issuer) {
        this.Issuer = Issuer;
    }

    /**
     * Get <p>JWKS 地址</p><p>入参限制：VerifyMethod=JWTJWKS 时必填</p> 
     * @return JwksUri <p>JWKS 地址</p><p>入参限制：VerifyMethod=JWTJWKS 时必填</p>
     */
    public String getJwksUri() {
        return this.JwksUri;
    }

    /**
     * Set <p>JWKS 地址</p><p>入参限制：VerifyMethod=JWTJWKS 时必填</p>
     * @param JwksUri <p>JWKS 地址</p><p>入参限制：VerifyMethod=JWTJWKS 时必填</p>
     */
    public void setJwksUri(String JwksUri) {
        this.JwksUri = JwksUri;
    }

    /**
     * Get <p>校验 aud</p> 
     * @return Audience <p>校验 aud</p>
     */
    public String getAudience() {
        return this.Audience;
    }

    /**
     * Set <p>校验 aud</p>
     * @param Audience <p>校验 aud</p>
     */
    public void setAudience(String Audience) {
        this.Audience = Audience;
    }

    /**
     * Get <p>JWKS 缓存秒数，默认 3600，必须大于 0</p><p>默认值：3600</p> 
     * @return JwksCacheTtl <p>JWKS 缓存秒数，默认 3600，必须大于 0</p><p>默认值：3600</p>
     */
    public Long getJwksCacheTtl() {
        return this.JwksCacheTtl;
    }

    /**
     * Set <p>JWKS 缓存秒数，默认 3600，必须大于 0</p><p>默认值：3600</p>
     * @param JwksCacheTtl <p>JWKS 缓存秒数，默认 3600，必须大于 0</p><p>默认值：3600</p>
     */
    public void setJwksCacheTtl(Long JwksCacheTtl) {
        this.JwksCacheTtl = JwksCacheTtl;
    }

    /**
     * Get <p>令牌内省端点</p><p>入参限制：VerifyMethod=Introspection 时必填</p> 
     * @return IntrospectionEndpoint <p>令牌内省端点</p><p>入参限制：VerifyMethod=Introspection 时必填</p>
     */
    public String getIntrospectionEndpoint() {
        return this.IntrospectionEndpoint;
    }

    /**
     * Set <p>令牌内省端点</p><p>入参限制：VerifyMethod=Introspection 时必填</p>
     * @param IntrospectionEndpoint <p>令牌内省端点</p><p>入参限制：VerifyMethod=Introspection 时必填</p>
     */
    public void setIntrospectionEndpoint(String IntrospectionEndpoint) {
        this.IntrospectionEndpoint = IntrospectionEndpoint;
    }

    /**
     * Get <p>调用内省端点的 Client ID</p><p>入参限制：VerifyMethod=Introspection 时必填</p> 
     * @return IntrospectionClientId <p>调用内省端点的 Client ID</p><p>入参限制：VerifyMethod=Introspection 时必填</p>
     */
    public String getIntrospectionClientId() {
        return this.IntrospectionClientId;
    }

    /**
     * Set <p>调用内省端点的 Client ID</p><p>入参限制：VerifyMethod=Introspection 时必填</p>
     * @param IntrospectionClientId <p>调用内省端点的 Client ID</p><p>入参限制：VerifyMethod=Introspection 时必填</p>
     */
    public void setIntrospectionClientId(String IntrospectionClientId) {
        this.IntrospectionClientId = IntrospectionClientId;
    }

    /**
     * Get <p>调用内省端点的 Client Secret</p><p>入参限制：VerifyMethod=Introspection 时必填</p><p>加密落库，查询时无论 Enable 状态均脱敏</p> 
     * @return IntrospectionClientSecret <p>调用内省端点的 Client Secret</p><p>入参限制：VerifyMethod=Introspection 时必填</p><p>加密落库，查询时无论 Enable 状态均脱敏</p>
     */
    public String getIntrospectionClientSecret() {
        return this.IntrospectionClientSecret;
    }

    /**
     * Set <p>调用内省端点的 Client Secret</p><p>入参限制：VerifyMethod=Introspection 时必填</p><p>加密落库，查询时无论 Enable 状态均脱敏</p>
     * @param IntrospectionClientSecret <p>调用内省端点的 Client Secret</p><p>入参限制：VerifyMethod=Introspection 时必填</p><p>加密落库，查询时无论 Enable 状态均脱敏</p>
     */
    public void setIntrospectionClientSecret(String IntrospectionClientSecret) {
        this.IntrospectionClientSecret = IntrospectionClientSecret;
    }

    /**
     * Get <p>内省结果缓存秒数</p><p>默认值：60</p><p>0 表示不缓存</p> 
     * @return IntrospectionCacheTtl <p>内省结果缓存秒数</p><p>默认值：60</p><p>0 表示不缓存</p>
     */
    public Long getIntrospectionCacheTtl() {
        return this.IntrospectionCacheTtl;
    }

    /**
     * Set <p>内省结果缓存秒数</p><p>默认值：60</p><p>0 表示不缓存</p>
     * @param IntrospectionCacheTtl <p>内省结果缓存秒数</p><p>默认值：60</p><p>0 表示不缓存</p>
     */
    public void setIntrospectionCacheTtl(Long IntrospectionCacheTtl) {
        this.IntrospectionCacheTtl = IntrospectionCacheTtl;
    }

    /**
     * Get <p>逗号分隔的 scope 白名单；令牌需命中其一，否则 401</p> 
     * @return ScopeWhitelist <p>逗号分隔的 scope 白名单；令牌需命中其一，否则 401</p>
     */
    public String getScopeWhitelist() {
        return this.ScopeWhitelist;
    }

    /**
     * Set <p>逗号分隔的 scope 白名单；令牌需命中其一，否则 401</p>
     * @param ScopeWhitelist <p>逗号分隔的 scope 白名单；令牌需命中其一，否则 401</p>
     */
    public void setScopeWhitelist(String ScopeWhitelist) {
        this.ScopeWhitelist = ScopeWhitelist;
    }

    /**
     * Get <p>读取调用方令牌的 Header 名</p><p>默认值：Authorization</p> 
     * @return TokenHeader <p>读取调用方令牌的 Header 名</p><p>默认值：Authorization</p>
     */
    public String getTokenHeader() {
        return this.TokenHeader;
    }

    /**
     * Set <p>读取调用方令牌的 Header 名</p><p>默认值：Authorization</p>
     * @param TokenHeader <p>读取调用方令牌的 Header 名</p><p>默认值：Authorization</p>
     */
    public void setTokenHeader(String TokenHeader) {
        this.TokenHeader = TokenHeader;
    }

    public AIGWGatewayVerifyOAuthConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AIGWGatewayVerifyOAuthConfig(AIGWGatewayVerifyOAuthConfig source) {
        if (source.VerifyMethod != null) {
            this.VerifyMethod = new String(source.VerifyMethod);
        }
        if (source.Issuer != null) {
            this.Issuer = new String(source.Issuer);
        }
        if (source.JwksUri != null) {
            this.JwksUri = new String(source.JwksUri);
        }
        if (source.Audience != null) {
            this.Audience = new String(source.Audience);
        }
        if (source.JwksCacheTtl != null) {
            this.JwksCacheTtl = new Long(source.JwksCacheTtl);
        }
        if (source.IntrospectionEndpoint != null) {
            this.IntrospectionEndpoint = new String(source.IntrospectionEndpoint);
        }
        if (source.IntrospectionClientId != null) {
            this.IntrospectionClientId = new String(source.IntrospectionClientId);
        }
        if (source.IntrospectionClientSecret != null) {
            this.IntrospectionClientSecret = new String(source.IntrospectionClientSecret);
        }
        if (source.IntrospectionCacheTtl != null) {
            this.IntrospectionCacheTtl = new Long(source.IntrospectionCacheTtl);
        }
        if (source.ScopeWhitelist != null) {
            this.ScopeWhitelist = new String(source.ScopeWhitelist);
        }
        if (source.TokenHeader != null) {
            this.TokenHeader = new String(source.TokenHeader);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VerifyMethod", this.VerifyMethod);
        this.setParamSimple(map, prefix + "Issuer", this.Issuer);
        this.setParamSimple(map, prefix + "JwksUri", this.JwksUri);
        this.setParamSimple(map, prefix + "Audience", this.Audience);
        this.setParamSimple(map, prefix + "JwksCacheTtl", this.JwksCacheTtl);
        this.setParamSimple(map, prefix + "IntrospectionEndpoint", this.IntrospectionEndpoint);
        this.setParamSimple(map, prefix + "IntrospectionClientId", this.IntrospectionClientId);
        this.setParamSimple(map, prefix + "IntrospectionClientSecret", this.IntrospectionClientSecret);
        this.setParamSimple(map, prefix + "IntrospectionCacheTtl", this.IntrospectionCacheTtl);
        this.setParamSimple(map, prefix + "ScopeWhitelist", this.ScopeWhitelist);
        this.setParamSimple(map, prefix + "TokenHeader", this.TokenHeader);

    }
}

