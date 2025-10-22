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

public class BotManagement extends AbstractModel {

    /**
    * Bot 管理是否开启。取值有：<li>on：开启；</li><li>off：关闭。</li>
    */
    @SerializedName("Enabled")
    @Expose
    private String Enabled;

    /**
    * Bot 管理的自定义规则，组合各类爬虫和请求行为特征，精准定义 Bot 并配置定制化处置方式。
    */
    @SerializedName("CustomRules")
    @Expose
    private BotManagementCustomRules CustomRules;

    /**
    * Bot 管理的基础配置，对策略关联的所有域名生效。可以通过 CustomRules 进行精细化定制。
    */
    @SerializedName("BasicBotSettings")
    @Expose
    private BasicBotSettings BasicBotSettings;

    /**
    * 客户端认证规则的定义列表。该功能内测中，如需使用，请提工单。
    */
    @SerializedName("ClientAttestationRules")
    @Expose
    private ClientAttestationRules ClientAttestationRules;

    /**
    * 配置浏览器伪造识别规则（原主动特征识别规则）。设置注入 JavaScript 的响应页面范围，浏览器校验选项，以及对非浏览器客户端的处置方式。
    */
    @SerializedName("BrowserImpersonationDetection")
    @Expose
    private BrowserImpersonationDetection BrowserImpersonationDetection;

    /**
     * Get Bot 管理是否开启。取值有：<li>on：开启；</li><li>off：关闭。</li> 
     * @return Enabled Bot 管理是否开启。取值有：<li>on：开启；</li><li>off：关闭。</li>
     */
    public String getEnabled() {
        return this.Enabled;
    }

    /**
     * Set Bot 管理是否开启。取值有：<li>on：开启；</li><li>off：关闭。</li>
     * @param Enabled Bot 管理是否开启。取值有：<li>on：开启；</li><li>off：关闭。</li>
     */
    public void setEnabled(String Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get Bot 管理的自定义规则，组合各类爬虫和请求行为特征，精准定义 Bot 并配置定制化处置方式。 
     * @return CustomRules Bot 管理的自定义规则，组合各类爬虫和请求行为特征，精准定义 Bot 并配置定制化处置方式。
     */
    public BotManagementCustomRules getCustomRules() {
        return this.CustomRules;
    }

    /**
     * Set Bot 管理的自定义规则，组合各类爬虫和请求行为特征，精准定义 Bot 并配置定制化处置方式。
     * @param CustomRules Bot 管理的自定义规则，组合各类爬虫和请求行为特征，精准定义 Bot 并配置定制化处置方式。
     */
    public void setCustomRules(BotManagementCustomRules CustomRules) {
        this.CustomRules = CustomRules;
    }

    /**
     * Get Bot 管理的基础配置，对策略关联的所有域名生效。可以通过 CustomRules 进行精细化定制。 
     * @return BasicBotSettings Bot 管理的基础配置，对策略关联的所有域名生效。可以通过 CustomRules 进行精细化定制。
     */
    public BasicBotSettings getBasicBotSettings() {
        return this.BasicBotSettings;
    }

    /**
     * Set Bot 管理的基础配置，对策略关联的所有域名生效。可以通过 CustomRules 进行精细化定制。
     * @param BasicBotSettings Bot 管理的基础配置，对策略关联的所有域名生效。可以通过 CustomRules 进行精细化定制。
     */
    public void setBasicBotSettings(BasicBotSettings BasicBotSettings) {
        this.BasicBotSettings = BasicBotSettings;
    }

    /**
     * Get 客户端认证规则的定义列表。该功能内测中，如需使用，请提工单。 
     * @return ClientAttestationRules 客户端认证规则的定义列表。该功能内测中，如需使用，请提工单。
     */
    public ClientAttestationRules getClientAttestationRules() {
        return this.ClientAttestationRules;
    }

    /**
     * Set 客户端认证规则的定义列表。该功能内测中，如需使用，请提工单。
     * @param ClientAttestationRules 客户端认证规则的定义列表。该功能内测中，如需使用，请提工单。
     */
    public void setClientAttestationRules(ClientAttestationRules ClientAttestationRules) {
        this.ClientAttestationRules = ClientAttestationRules;
    }

    /**
     * Get 配置浏览器伪造识别规则（原主动特征识别规则）。设置注入 JavaScript 的响应页面范围，浏览器校验选项，以及对非浏览器客户端的处置方式。 
     * @return BrowserImpersonationDetection 配置浏览器伪造识别规则（原主动特征识别规则）。设置注入 JavaScript 的响应页面范围，浏览器校验选项，以及对非浏览器客户端的处置方式。
     */
    public BrowserImpersonationDetection getBrowserImpersonationDetection() {
        return this.BrowserImpersonationDetection;
    }

    /**
     * Set 配置浏览器伪造识别规则（原主动特征识别规则）。设置注入 JavaScript 的响应页面范围，浏览器校验选项，以及对非浏览器客户端的处置方式。
     * @param BrowserImpersonationDetection 配置浏览器伪造识别规则（原主动特征识别规则）。设置注入 JavaScript 的响应页面范围，浏览器校验选项，以及对非浏览器客户端的处置方式。
     */
    public void setBrowserImpersonationDetection(BrowserImpersonationDetection BrowserImpersonationDetection) {
        this.BrowserImpersonationDetection = BrowserImpersonationDetection;
    }

    public BotManagement() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BotManagement(BotManagement source) {
        if (source.Enabled != null) {
            this.Enabled = new String(source.Enabled);
        }
        if (source.CustomRules != null) {
            this.CustomRules = new BotManagementCustomRules(source.CustomRules);
        }
        if (source.BasicBotSettings != null) {
            this.BasicBotSettings = new BasicBotSettings(source.BasicBotSettings);
        }
        if (source.ClientAttestationRules != null) {
            this.ClientAttestationRules = new ClientAttestationRules(source.ClientAttestationRules);
        }
        if (source.BrowserImpersonationDetection != null) {
            this.BrowserImpersonationDetection = new BrowserImpersonationDetection(source.BrowserImpersonationDetection);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamObj(map, prefix + "CustomRules.", this.CustomRules);
        this.setParamObj(map, prefix + "BasicBotSettings.", this.BasicBotSettings);
        this.setParamObj(map, prefix + "ClientAttestationRules.", this.ClientAttestationRules);
        this.setParamObj(map, prefix + "BrowserImpersonationDetection.", this.BrowserImpersonationDetection);

    }
}

