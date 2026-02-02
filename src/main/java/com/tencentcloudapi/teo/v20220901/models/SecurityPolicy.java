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
    * 自定义规则配置。
    */
    @SerializedName("CustomRules")
    @Expose
    private CustomRules CustomRules;

    /**
    * 托管规则配置。
    */
    @SerializedName("ManagedRules")
    @Expose
    private ManagedRules ManagedRules;

    /**
    * HTTP DDOS 防护配置。
    */
    @SerializedName("HttpDDoSProtection")
    @Expose
    private HttpDDoSProtection HttpDDoSProtection;

    /**
    * 速率限制规则配置。
    */
    @SerializedName("RateLimitingRules")
    @Expose
    private RateLimitingRules RateLimitingRules;

    /**
    * 例外规则配置。
    */
    @SerializedName("ExceptionRules")
    @Expose
    private ExceptionRules ExceptionRules;

    /**
    * Bot 管理配置。
    */
    @SerializedName("BotManagement")
    @Expose
    private BotManagement BotManagement;

    /**
    * 基础 Bot 管理配置。
    */
    @SerializedName("BotManagementLite")
    @Expose
    private BotManagementLite BotManagementLite;

    /**
     * Get 自定义规则配置。 
     * @return CustomRules 自定义规则配置。
     */
    public CustomRules getCustomRules() {
        return this.CustomRules;
    }

    /**
     * Set 自定义规则配置。
     * @param CustomRules 自定义规则配置。
     */
    public void setCustomRules(CustomRules CustomRules) {
        this.CustomRules = CustomRules;
    }

    /**
     * Get 托管规则配置。 
     * @return ManagedRules 托管规则配置。
     */
    public ManagedRules getManagedRules() {
        return this.ManagedRules;
    }

    /**
     * Set 托管规则配置。
     * @param ManagedRules 托管规则配置。
     */
    public void setManagedRules(ManagedRules ManagedRules) {
        this.ManagedRules = ManagedRules;
    }

    /**
     * Get HTTP DDOS 防护配置。 
     * @return HttpDDoSProtection HTTP DDOS 防护配置。
     */
    public HttpDDoSProtection getHttpDDoSProtection() {
        return this.HttpDDoSProtection;
    }

    /**
     * Set HTTP DDOS 防护配置。
     * @param HttpDDoSProtection HTTP DDOS 防护配置。
     */
    public void setHttpDDoSProtection(HttpDDoSProtection HttpDDoSProtection) {
        this.HttpDDoSProtection = HttpDDoSProtection;
    }

    /**
     * Get 速率限制规则配置。 
     * @return RateLimitingRules 速率限制规则配置。
     */
    public RateLimitingRules getRateLimitingRules() {
        return this.RateLimitingRules;
    }

    /**
     * Set 速率限制规则配置。
     * @param RateLimitingRules 速率限制规则配置。
     */
    public void setRateLimitingRules(RateLimitingRules RateLimitingRules) {
        this.RateLimitingRules = RateLimitingRules;
    }

    /**
     * Get 例外规则配置。 
     * @return ExceptionRules 例外规则配置。
     */
    public ExceptionRules getExceptionRules() {
        return this.ExceptionRules;
    }

    /**
     * Set 例外规则配置。
     * @param ExceptionRules 例外规则配置。
     */
    public void setExceptionRules(ExceptionRules ExceptionRules) {
        this.ExceptionRules = ExceptionRules;
    }

    /**
     * Get Bot 管理配置。 
     * @return BotManagement Bot 管理配置。
     */
    public BotManagement getBotManagement() {
        return this.BotManagement;
    }

    /**
     * Set Bot 管理配置。
     * @param BotManagement Bot 管理配置。
     */
    public void setBotManagement(BotManagement BotManagement) {
        this.BotManagement = BotManagement;
    }

    /**
     * Get 基础 Bot 管理配置。 
     * @return BotManagementLite 基础 Bot 管理配置。
     */
    public BotManagementLite getBotManagementLite() {
        return this.BotManagementLite;
    }

    /**
     * Set 基础 Bot 管理配置。
     * @param BotManagementLite 基础 Bot 管理配置。
     */
    public void setBotManagementLite(BotManagementLite BotManagementLite) {
        this.BotManagementLite = BotManagementLite;
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

    }
}

