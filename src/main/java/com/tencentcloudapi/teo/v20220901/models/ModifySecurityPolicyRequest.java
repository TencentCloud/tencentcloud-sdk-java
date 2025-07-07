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

public class ModifySecurityPolicyRequest extends AbstractModel {

    /**
    * 站点 ID。
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 安全策略配置。<li>当 SecurityPolicy 参数中的 ExceptionRules 被设置时，SecurityConfig 参数中的 ExceptConfig 将被忽略；</li><li>当 SecurityPolicy 参数中的 CustomRules 被设置时，SecurityConfig 参数中的 AclConfig、 IpTableConfig 将被忽略；</li><li>当 SecurityPolicy 参数中的 HttpDDoSProtection 和 RateLimitingRules 被设置时，SecurityConfig 参数中的 RateLimitConfig 将被忽略；</li><li>当 SecurityPolicy 参数中的 ManagedRule 被设置时，SecurityConfig 参数中的 WafConfig 将被忽略；</li><li>对于例外规则、自定义规则、速率限制以及托管规则策略配置建议使用 SecurityPolicy 参数进行设置。</li>
    */
    @SerializedName("SecurityConfig")
    @Expose
    private SecurityConfig SecurityConfig;

    /**
    * 安全策略配置。对 Web 例外规则、防护自定义策略、速率规则和托管规则配置建议使用，支持表达式语法对安全策略进行配置。
    */
    @SerializedName("SecurityPolicy")
    @Expose
    private SecurityPolicy SecurityPolicy;

    /**
    * 安全策略类型，可使用以下参数值： <li>ZoneDefaultPolicy：用于指定站点级策略；</li><li>Template：用于指定策略模板，需要同时指定 TemplateId 参数；</li><li>Host：用于指定域名级策略（注意：当使用域名来指定域名服务策略时，仅支持已经应用了域名级策略的域名服务或者策略模板）。</li>
    */
    @SerializedName("Entity")
    @Expose
    private String Entity;

    /**
    * 指定域名。当 Entity 参数值为 Host 时，使用本参数指定的域名级策略，例如：使用 www.example.com ，配置该域名的域名级策略。
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * 指定策略模板 ID。当 Entity 参数值为 Template 时，使用本参数指定策略模板的 ID。
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
     * Get 站点 ID。 
     * @return ZoneId 站点 ID。
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 站点 ID。
     * @param ZoneId 站点 ID。
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 安全策略配置。<li>当 SecurityPolicy 参数中的 ExceptionRules 被设置时，SecurityConfig 参数中的 ExceptConfig 将被忽略；</li><li>当 SecurityPolicy 参数中的 CustomRules 被设置时，SecurityConfig 参数中的 AclConfig、 IpTableConfig 将被忽略；</li><li>当 SecurityPolicy 参数中的 HttpDDoSProtection 和 RateLimitingRules 被设置时，SecurityConfig 参数中的 RateLimitConfig 将被忽略；</li><li>当 SecurityPolicy 参数中的 ManagedRule 被设置时，SecurityConfig 参数中的 WafConfig 将被忽略；</li><li>对于例外规则、自定义规则、速率限制以及托管规则策略配置建议使用 SecurityPolicy 参数进行设置。</li> 
     * @return SecurityConfig 安全策略配置。<li>当 SecurityPolicy 参数中的 ExceptionRules 被设置时，SecurityConfig 参数中的 ExceptConfig 将被忽略；</li><li>当 SecurityPolicy 参数中的 CustomRules 被设置时，SecurityConfig 参数中的 AclConfig、 IpTableConfig 将被忽略；</li><li>当 SecurityPolicy 参数中的 HttpDDoSProtection 和 RateLimitingRules 被设置时，SecurityConfig 参数中的 RateLimitConfig 将被忽略；</li><li>当 SecurityPolicy 参数中的 ManagedRule 被设置时，SecurityConfig 参数中的 WafConfig 将被忽略；</li><li>对于例外规则、自定义规则、速率限制以及托管规则策略配置建议使用 SecurityPolicy 参数进行设置。</li>
     */
    public SecurityConfig getSecurityConfig() {
        return this.SecurityConfig;
    }

    /**
     * Set 安全策略配置。<li>当 SecurityPolicy 参数中的 ExceptionRules 被设置时，SecurityConfig 参数中的 ExceptConfig 将被忽略；</li><li>当 SecurityPolicy 参数中的 CustomRules 被设置时，SecurityConfig 参数中的 AclConfig、 IpTableConfig 将被忽略；</li><li>当 SecurityPolicy 参数中的 HttpDDoSProtection 和 RateLimitingRules 被设置时，SecurityConfig 参数中的 RateLimitConfig 将被忽略；</li><li>当 SecurityPolicy 参数中的 ManagedRule 被设置时，SecurityConfig 参数中的 WafConfig 将被忽略；</li><li>对于例外规则、自定义规则、速率限制以及托管规则策略配置建议使用 SecurityPolicy 参数进行设置。</li>
     * @param SecurityConfig 安全策略配置。<li>当 SecurityPolicy 参数中的 ExceptionRules 被设置时，SecurityConfig 参数中的 ExceptConfig 将被忽略；</li><li>当 SecurityPolicy 参数中的 CustomRules 被设置时，SecurityConfig 参数中的 AclConfig、 IpTableConfig 将被忽略；</li><li>当 SecurityPolicy 参数中的 HttpDDoSProtection 和 RateLimitingRules 被设置时，SecurityConfig 参数中的 RateLimitConfig 将被忽略；</li><li>当 SecurityPolicy 参数中的 ManagedRule 被设置时，SecurityConfig 参数中的 WafConfig 将被忽略；</li><li>对于例外规则、自定义规则、速率限制以及托管规则策略配置建议使用 SecurityPolicy 参数进行设置。</li>
     */
    public void setSecurityConfig(SecurityConfig SecurityConfig) {
        this.SecurityConfig = SecurityConfig;
    }

    /**
     * Get 安全策略配置。对 Web 例外规则、防护自定义策略、速率规则和托管规则配置建议使用，支持表达式语法对安全策略进行配置。 
     * @return SecurityPolicy 安全策略配置。对 Web 例外规则、防护自定义策略、速率规则和托管规则配置建议使用，支持表达式语法对安全策略进行配置。
     */
    public SecurityPolicy getSecurityPolicy() {
        return this.SecurityPolicy;
    }

    /**
     * Set 安全策略配置。对 Web 例外规则、防护自定义策略、速率规则和托管规则配置建议使用，支持表达式语法对安全策略进行配置。
     * @param SecurityPolicy 安全策略配置。对 Web 例外规则、防护自定义策略、速率规则和托管规则配置建议使用，支持表达式语法对安全策略进行配置。
     */
    public void setSecurityPolicy(SecurityPolicy SecurityPolicy) {
        this.SecurityPolicy = SecurityPolicy;
    }

    /**
     * Get 安全策略类型，可使用以下参数值： <li>ZoneDefaultPolicy：用于指定站点级策略；</li><li>Template：用于指定策略模板，需要同时指定 TemplateId 参数；</li><li>Host：用于指定域名级策略（注意：当使用域名来指定域名服务策略时，仅支持已经应用了域名级策略的域名服务或者策略模板）。</li> 
     * @return Entity 安全策略类型，可使用以下参数值： <li>ZoneDefaultPolicy：用于指定站点级策略；</li><li>Template：用于指定策略模板，需要同时指定 TemplateId 参数；</li><li>Host：用于指定域名级策略（注意：当使用域名来指定域名服务策略时，仅支持已经应用了域名级策略的域名服务或者策略模板）。</li>
     */
    public String getEntity() {
        return this.Entity;
    }

    /**
     * Set 安全策略类型，可使用以下参数值： <li>ZoneDefaultPolicy：用于指定站点级策略；</li><li>Template：用于指定策略模板，需要同时指定 TemplateId 参数；</li><li>Host：用于指定域名级策略（注意：当使用域名来指定域名服务策略时，仅支持已经应用了域名级策略的域名服务或者策略模板）。</li>
     * @param Entity 安全策略类型，可使用以下参数值： <li>ZoneDefaultPolicy：用于指定站点级策略；</li><li>Template：用于指定策略模板，需要同时指定 TemplateId 参数；</li><li>Host：用于指定域名级策略（注意：当使用域名来指定域名服务策略时，仅支持已经应用了域名级策略的域名服务或者策略模板）。</li>
     */
    public void setEntity(String Entity) {
        this.Entity = Entity;
    }

    /**
     * Get 指定域名。当 Entity 参数值为 Host 时，使用本参数指定的域名级策略，例如：使用 www.example.com ，配置该域名的域名级策略。 
     * @return Host 指定域名。当 Entity 参数值为 Host 时，使用本参数指定的域名级策略，例如：使用 www.example.com ，配置该域名的域名级策略。
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set 指定域名。当 Entity 参数值为 Host 时，使用本参数指定的域名级策略，例如：使用 www.example.com ，配置该域名的域名级策略。
     * @param Host 指定域名。当 Entity 参数值为 Host 时，使用本参数指定的域名级策略，例如：使用 www.example.com ，配置该域名的域名级策略。
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get 指定策略模板 ID。当 Entity 参数值为 Template 时，使用本参数指定策略模板的 ID。 
     * @return TemplateId 指定策略模板 ID。当 Entity 参数值为 Template 时，使用本参数指定策略模板的 ID。
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 指定策略模板 ID。当 Entity 参数值为 Template 时，使用本参数指定策略模板的 ID。
     * @param TemplateId 指定策略模板 ID。当 Entity 参数值为 Template 时，使用本参数指定策略模板的 ID。
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    public ModifySecurityPolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifySecurityPolicyRequest(ModifySecurityPolicyRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.SecurityConfig != null) {
            this.SecurityConfig = new SecurityConfig(source.SecurityConfig);
        }
        if (source.SecurityPolicy != null) {
            this.SecurityPolicy = new SecurityPolicy(source.SecurityPolicy);
        }
        if (source.Entity != null) {
            this.Entity = new String(source.Entity);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamObj(map, prefix + "SecurityConfig.", this.SecurityConfig);
        this.setParamObj(map, prefix + "SecurityPolicy.", this.SecurityPolicy);
        this.setParamSimple(map, prefix + "Entity", this.Entity);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);

    }
}

