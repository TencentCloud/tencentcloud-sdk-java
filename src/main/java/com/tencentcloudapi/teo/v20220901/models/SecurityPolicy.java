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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SecurityPolicy extends AbstractModel {

    /**
    * <p>自定义规则配置。</p>
    */
    @SerializedName("CustomRules")
    @Expose
    private CustomRules CustomRules;

    /**
    * <p>托管规则配置。</p>
    */
    @SerializedName("ManagedRules")
    @Expose
    private ManagedRules ManagedRules;

    /**
    * <p>HTTP DDOS 防护配置。</p>
    */
    @SerializedName("HttpDDoSProtection")
    @Expose
    private HttpDDoSProtection HttpDDoSProtection;

    /**
    * <p>速率限制规则配置。</p>
    */
    @SerializedName("RateLimitingRules")
    @Expose
    private RateLimitingRules RateLimitingRules;

    /**
    * <p>例外规则配置。</p>
    */
    @SerializedName("ExceptionRules")
    @Expose
    private ExceptionRules ExceptionRules;

    /**
    * <p>Bot 管理配置。</p>
    */
    @SerializedName("BotManagement")
    @Expose
    private BotManagement BotManagement;

    /**
    * <p>基础 Bot 管理配置。</p>
    */
    @SerializedName("BotManagementLite")
    @Expose
    private BotManagementLite BotManagementLite;

    /**
    * <p>默认拦截动作配置。</p>
    */
    @SerializedName("DefaultDenySecurityActionParameters")
    @Expose
    private DefaultDenySecurityActionParameters DefaultDenySecurityActionParameters;

    /**
    * <p>回源请求携带安全头部配置，配置生效后将携带对应 keyname 的请求头部回源。</p>
    */
    @SerializedName("SecurityHeadersToOrigin")
    @Expose
    private SecurityHeadersToOrigin SecurityHeadersToOrigin;

    /**
     * Get <p>自定义规则配置。</p> 
     * @return CustomRules <p>自定义规则配置。</p>
     */
    public CustomRules getCustomRules() {
        return this.CustomRules;
    }

    /**
     * Set <p>自定义规则配置。</p>
     * @param CustomRules <p>自定义规则配置。</p>
     */
    public void setCustomRules(CustomRules CustomRules) {
        this.CustomRules = CustomRules;
    }

    /**
     * Get <p>托管规则配置。</p> 
     * @return ManagedRules <p>托管规则配置。</p>
     */
    public ManagedRules getManagedRules() {
        return this.ManagedRules;
    }

    /**
     * Set <p>托管规则配置。</p>
     * @param ManagedRules <p>托管规则配置。</p>
     */
    public void setManagedRules(ManagedRules ManagedRules) {
        this.ManagedRules = ManagedRules;
    }

    /**
     * Get <p>HTTP DDOS 防护配置。</p> 
     * @return HttpDDoSProtection <p>HTTP DDOS 防护配置。</p>
     */
    public HttpDDoSProtection getHttpDDoSProtection() {
        return this.HttpDDoSProtection;
    }

    /**
     * Set <p>HTTP DDOS 防护配置。</p>
     * @param HttpDDoSProtection <p>HTTP DDOS 防护配置。</p>
     */
    public void setHttpDDoSProtection(HttpDDoSProtection HttpDDoSProtection) {
        this.HttpDDoSProtection = HttpDDoSProtection;
    }

    /**
     * Get <p>速率限制规则配置。</p> 
     * @return RateLimitingRules <p>速率限制规则配置。</p>
     */
    public RateLimitingRules getRateLimitingRules() {
        return this.RateLimitingRules;
    }

    /**
     * Set <p>速率限制规则配置。</p>
     * @param RateLimitingRules <p>速率限制规则配置。</p>
     */
    public void setRateLimitingRules(RateLimitingRules RateLimitingRules) {
        this.RateLimitingRules = RateLimitingRules;
    }

    /**
     * Get <p>例外规则配置。</p> 
     * @return ExceptionRules <p>例外规则配置。</p>
     */
    public ExceptionRules getExceptionRules() {
        return this.ExceptionRules;
    }

    /**
     * Set <p>例外规则配置。</p>
     * @param ExceptionRules <p>例外规则配置。</p>
     */
    public void setExceptionRules(ExceptionRules ExceptionRules) {
        this.ExceptionRules = ExceptionRules;
    }

    /**
     * Get <p>Bot 管理配置。</p> 
     * @return BotManagement <p>Bot 管理配置。</p>
     */
    public BotManagement getBotManagement() {
        return this.BotManagement;
    }

    /**
     * Set <p>Bot 管理配置。</p>
     * @param BotManagement <p>Bot 管理配置。</p>
     */
    public void setBotManagement(BotManagement BotManagement) {
        this.BotManagement = BotManagement;
    }

    /**
     * Get <p>基础 Bot 管理配置。</p> 
     * @return BotManagementLite <p>基础 Bot 管理配置。</p>
     */
    public BotManagementLite getBotManagementLite() {
        return this.BotManagementLite;
    }

    /**
     * Set <p>基础 Bot 管理配置。</p>
     * @param BotManagementLite <p>基础 Bot 管理配置。</p>
     */
    public void setBotManagementLite(BotManagementLite BotManagementLite) {
        this.BotManagementLite = BotManagementLite;
    }

    /**
     * Get <p>默认拦截动作配置。</p> 
     * @return DefaultDenySecurityActionParameters <p>默认拦截动作配置。</p>
     */
    public DefaultDenySecurityActionParameters getDefaultDenySecurityActionParameters() {
        return this.DefaultDenySecurityActionParameters;
    }

    /**
     * Set <p>默认拦截动作配置。</p>
     * @param DefaultDenySecurityActionParameters <p>默认拦截动作配置。</p>
     */
    public void setDefaultDenySecurityActionParameters(DefaultDenySecurityActionParameters DefaultDenySecurityActionParameters) {
        this.DefaultDenySecurityActionParameters = DefaultDenySecurityActionParameters;
    }

    /**
     * Get <p>回源请求携带安全头部配置，配置生效后将携带对应 keyname 的请求头部回源。</p> 
     * @return SecurityHeadersToOrigin <p>回源请求携带安全头部配置，配置生效后将携带对应 keyname 的请求头部回源。</p>
     */
    public SecurityHeadersToOrigin getSecurityHeadersToOrigin() {
        return this.SecurityHeadersToOrigin;
    }

    /**
     * Set <p>回源请求携带安全头部配置，配置生效后将携带对应 keyname 的请求头部回源。</p>
     * @param SecurityHeadersToOrigin <p>回源请求携带安全头部配置，配置生效后将携带对应 keyname 的请求头部回源。</p>
     */
    public void setSecurityHeadersToOrigin(SecurityHeadersToOrigin SecurityHeadersToOrigin) {
        this.SecurityHeadersToOrigin = SecurityHeadersToOrigin;
    }

    public SecurityPolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SecurityPolicy(SecurityPolicy source) {
        if (source.CustomRules != null) {
            this.CustomRules = new CustomRules(source.CustomRules);
        }
        if (source.ManagedRules != null) {
            this.ManagedRules = new ManagedRules(source.ManagedRules);
        }
        if (source.HttpDDoSProtection != null) {
            this.HttpDDoSProtection = new HttpDDoSProtection(source.HttpDDoSProtection);
        }
        if (source.RateLimitingRules != null) {
            this.RateLimitingRules = new RateLimitingRules(source.RateLimitingRules);
        }
        if (source.ExceptionRules != null) {
            this.ExceptionRules = new ExceptionRules(source.ExceptionRules);
        }
        if (source.BotManagement != null) {
            this.BotManagement = new BotManagement(source.BotManagement);
        }
        if (source.BotManagementLite != null) {
            this.BotManagementLite = new BotManagementLite(source.BotManagementLite);
        }
        if (source.DefaultDenySecurityActionParameters != null) {
            this.DefaultDenySecurityActionParameters = new DefaultDenySecurityActionParameters(source.DefaultDenySecurityActionParameters);
        }
        if (source.SecurityHeadersToOrigin != null) {
            this.SecurityHeadersToOrigin = new SecurityHeadersToOrigin(source.SecurityHeadersToOrigin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "CustomRules.", this.CustomRules);
        this.setParamObj(map, prefix + "ManagedRules.", this.ManagedRules);
        this.setParamObj(map, prefix + "HttpDDoSProtection.", this.HttpDDoSProtection);
        this.setParamObj(map, prefix + "RateLimitingRules.", this.RateLimitingRules);
        this.setParamObj(map, prefix + "ExceptionRules.", this.ExceptionRules);
        this.setParamObj(map, prefix + "BotManagement.", this.BotManagement);
        this.setParamObj(map, prefix + "BotManagementLite.", this.BotManagementLite);
        this.setParamObj(map, prefix + "DefaultDenySecurityActionParameters.", this.DefaultDenySecurityActionParameters);
        this.setParamObj(map, prefix + "SecurityHeadersToOrigin.", this.SecurityHeadersToOrigin);

    }
}

