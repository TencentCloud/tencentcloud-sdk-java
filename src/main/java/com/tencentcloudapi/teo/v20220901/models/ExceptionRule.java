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

public class ExceptionRule extends AbstractModel {

    /**
    * <p>例外规则的 ID。<br>通过规则 ID 可支持不同的规则配置操作：<br> <li> <b>增加</b>新规则：ID 为空或不指定 ID 参数；</li><li> <b>修改</b>已有规则：指定需要更新/修改的规则 ID；</li><li> <b>删除</b>已有规则：ExceptionRules 参数中，Rules 列表中未包含的已有规则将被删除。</li></p>
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * <p>例外规则的名称。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>例外规则的具体内容，需符合表达式语法，详细规范参见产品文档。</p>
    */
    @SerializedName("Condition")
    @Expose
    private String Condition;

    /**
    * <p>例外规则执行选项，取值有：<li>WebSecurityModules: 指定例外规则的安全防护模块，需配合 WebSecurityModulesForException 使用；</li><li>WebSecuritySubmodules: 指定例外规则的安全防护子模块，需配合 WebSecuritySubmodulesForException 使用；</li><li>ManagedRules：指定例外规则的具体托管规则，需配合 ManagedRulesForException 使用；</li><li>ManagedRuleGroups：指定例外规则的托管规则组，需配合 ManagedRuleGroupsForException 使用。</li></p>
    */
    @SerializedName("SkipScope")
    @Expose
    private String SkipScope;

    /**
    * <p>跳过请求的具体类型，取值有：<li>SkipOnAllRequestFields: 跳过所有请求；</li><li>SkipOnSpecifiedRequestFields: 跳过指定请求字段。</li>仅当 SkipScope 为 ManagedRules 或 ManagedRuleGroups 时有效。</p>
    */
    @SerializedName("SkipOption")
    @Expose
    private String SkipOption;

    /**
    * <p>指定例外规则的安全防护模块，仅当 SkipScope 为 WebSecurityModules 时有效，取值有：<li>websec-mod-managed-rules：托管规则；</li><li>websec-mod-rate-limiting：速率限制；</li><li>websec-mod-custom-rules：自定义规则；</li><li>websec-mod-adaptive-control：自适应频控、智能客户端过滤、慢速攻击防护、流量盗刷防护；</li><li>websec-mod-bot：Bot管理。</li></p>
    */
    @SerializedName("WebSecurityModulesForException")
    @Expose
    private String [] WebSecurityModulesForException;

    /**
    * <p>指定例外规则的安全防护子模块，仅当 SkipScope 为 WebSecuritySubmodules 时有效。</p><p>枚举值：</p><ul><li>websec-mod-managed-rules/semantic-analysis： 托管规则-深度分析</li><li>websec-mod-managed-rules/managed-rule-groups： 托管规则-规则集</li><li>websec-mod-managed-rules/frequent-scanning-protection： 托管规则-高频扫描防护</li><li>websec-mod-rate-limiting-rules： 速率限制规则</li><li>websec-mod-custom-rules： 自定义规则</li><li>websec-mod-http-ddos-protection/adaptive-frequency-control： HTTP DDoS 防护-自适应频控</li><li>websec-mod-http-ddos-protection/client-filtering： HTTP DDoS 防护-智能客户端过滤</li><li>websec-mod-http-ddos-protection/bandwidth-abuse-defense： HTTP DDoS 防护-流量盗刷防护</li><li>websec-mod-bot-management/basic-feature： 高级 Bot 管理-基础特征管理</li><li>websec-mod-bot-management/ip-reputation： 高级 Bot 管理-客户端画像分析</li><li>websec-mod-bot-management/bot-intelligence： 高级 Bot 管理-智能 Bot 分析</li><li>websec-mod-bot-management/custom-rules： 高级 Bot 管理-自定义规则</li><li>websec-mod-bot-management/browser-impersonation-detection： 高级 Bot 管理-主动特征识别</li><li>websec-mod-bot-management/client-attestation-rules： 高级 Bot 管理-客户端认证</li><li>websec-mod-bot-management-lite/ai-crawler-detection： 基础 Bot 管理-AI 爬虫处置</li><li>websec-mod-bot-management-lite/captcha-page-challenge： 基础 Bot 管理-人机校验页</li></ul>
    */
    @SerializedName("WebSecuritySubmodulesForException")
    @Expose
    private String [] WebSecuritySubmodulesForException;

    /**
    * <p>指定例外规则的具体托管规则，仅当 SkipScope 为 ManagedRules 时有效。</p>
    */
    @SerializedName("ManagedRulesForException")
    @Expose
    private String [] ManagedRulesForException;

    /**
    * <p>指定例外规则的托管规则组，仅当 SkipScope 为 ManagedRuleGroups 时有效。</p>
    */
    @SerializedName("ManagedRuleGroupsForException")
    @Expose
    private String [] ManagedRuleGroupsForException;

    /**
    * <p>指定例外规则跳过指定请求字段的具体配置，仅当 SkipScope 为 ManagedRules 或 ManagedRuleGroups 并且 SkipOption 为 SkipOnSpecifiedRequestFields 时有效。</p>
    */
    @SerializedName("RequestFieldsForException")
    @Expose
    private RequestFieldsForException [] RequestFieldsForException;

    /**
    * <p>例外规则是否开启。取值有：<li>on：开启</li><li>off：关闭</li></p>
    */
    @SerializedName("Enabled")
    @Expose
    private String Enabled;

    /**
     * Get <p>例外规则的 ID。<br>通过规则 ID 可支持不同的规则配置操作：<br> <li> <b>增加</b>新规则：ID 为空或不指定 ID 参数；</li><li> <b>修改</b>已有规则：指定需要更新/修改的规则 ID；</li><li> <b>删除</b>已有规则：ExceptionRules 参数中，Rules 列表中未包含的已有规则将被删除。</li></p> 
     * @return Id <p>例外规则的 ID。<br>通过规则 ID 可支持不同的规则配置操作：<br> <li> <b>增加</b>新规则：ID 为空或不指定 ID 参数；</li><li> <b>修改</b>已有规则：指定需要更新/修改的规则 ID；</li><li> <b>删除</b>已有规则：ExceptionRules 参数中，Rules 列表中未包含的已有规则将被删除。</li></p>
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set <p>例外规则的 ID。<br>通过规则 ID 可支持不同的规则配置操作：<br> <li> <b>增加</b>新规则：ID 为空或不指定 ID 参数；</li><li> <b>修改</b>已有规则：指定需要更新/修改的规则 ID；</li><li> <b>删除</b>已有规则：ExceptionRules 参数中，Rules 列表中未包含的已有规则将被删除。</li></p>
     * @param Id <p>例外规则的 ID。<br>通过规则 ID 可支持不同的规则配置操作：<br> <li> <b>增加</b>新规则：ID 为空或不指定 ID 参数；</li><li> <b>修改</b>已有规则：指定需要更新/修改的规则 ID；</li><li> <b>删除</b>已有规则：ExceptionRules 参数中，Rules 列表中未包含的已有规则将被删除。</li></p>
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get <p>例外规则的名称。</p> 
     * @return Name <p>例外规则的名称。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>例外规则的名称。</p>
     * @param Name <p>例外规则的名称。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>例外规则的具体内容，需符合表达式语法，详细规范参见产品文档。</p> 
     * @return Condition <p>例外规则的具体内容，需符合表达式语法，详细规范参见产品文档。</p>
     */
    public String getCondition() {
        return this.Condition;
    }

    /**
     * Set <p>例外规则的具体内容，需符合表达式语法，详细规范参见产品文档。</p>
     * @param Condition <p>例外规则的具体内容，需符合表达式语法，详细规范参见产品文档。</p>
     */
    public void setCondition(String Condition) {
        this.Condition = Condition;
    }

    /**
     * Get <p>例外规则执行选项，取值有：<li>WebSecurityModules: 指定例外规则的安全防护模块，需配合 WebSecurityModulesForException 使用；</li><li>WebSecuritySubmodules: 指定例外规则的安全防护子模块，需配合 WebSecuritySubmodulesForException 使用；</li><li>ManagedRules：指定例外规则的具体托管规则，需配合 ManagedRulesForException 使用；</li><li>ManagedRuleGroups：指定例外规则的托管规则组，需配合 ManagedRuleGroupsForException 使用。</li></p> 
     * @return SkipScope <p>例外规则执行选项，取值有：<li>WebSecurityModules: 指定例外规则的安全防护模块，需配合 WebSecurityModulesForException 使用；</li><li>WebSecuritySubmodules: 指定例外规则的安全防护子模块，需配合 WebSecuritySubmodulesForException 使用；</li><li>ManagedRules：指定例外规则的具体托管规则，需配合 ManagedRulesForException 使用；</li><li>ManagedRuleGroups：指定例外规则的托管规则组，需配合 ManagedRuleGroupsForException 使用。</li></p>
     */
    public String getSkipScope() {
        return this.SkipScope;
    }

    /**
     * Set <p>例外规则执行选项，取值有：<li>WebSecurityModules: 指定例外规则的安全防护模块，需配合 WebSecurityModulesForException 使用；</li><li>WebSecuritySubmodules: 指定例外规则的安全防护子模块，需配合 WebSecuritySubmodulesForException 使用；</li><li>ManagedRules：指定例外规则的具体托管规则，需配合 ManagedRulesForException 使用；</li><li>ManagedRuleGroups：指定例外规则的托管规则组，需配合 ManagedRuleGroupsForException 使用。</li></p>
     * @param SkipScope <p>例外规则执行选项，取值有：<li>WebSecurityModules: 指定例外规则的安全防护模块，需配合 WebSecurityModulesForException 使用；</li><li>WebSecuritySubmodules: 指定例外规则的安全防护子模块，需配合 WebSecuritySubmodulesForException 使用；</li><li>ManagedRules：指定例外规则的具体托管规则，需配合 ManagedRulesForException 使用；</li><li>ManagedRuleGroups：指定例外规则的托管规则组，需配合 ManagedRuleGroupsForException 使用。</li></p>
     */
    public void setSkipScope(String SkipScope) {
        this.SkipScope = SkipScope;
    }

    /**
     * Get <p>跳过请求的具体类型，取值有：<li>SkipOnAllRequestFields: 跳过所有请求；</li><li>SkipOnSpecifiedRequestFields: 跳过指定请求字段。</li>仅当 SkipScope 为 ManagedRules 或 ManagedRuleGroups 时有效。</p> 
     * @return SkipOption <p>跳过请求的具体类型，取值有：<li>SkipOnAllRequestFields: 跳过所有请求；</li><li>SkipOnSpecifiedRequestFields: 跳过指定请求字段。</li>仅当 SkipScope 为 ManagedRules 或 ManagedRuleGroups 时有效。</p>
     */
    public String getSkipOption() {
        return this.SkipOption;
    }

    /**
     * Set <p>跳过请求的具体类型，取值有：<li>SkipOnAllRequestFields: 跳过所有请求；</li><li>SkipOnSpecifiedRequestFields: 跳过指定请求字段。</li>仅当 SkipScope 为 ManagedRules 或 ManagedRuleGroups 时有效。</p>
     * @param SkipOption <p>跳过请求的具体类型，取值有：<li>SkipOnAllRequestFields: 跳过所有请求；</li><li>SkipOnSpecifiedRequestFields: 跳过指定请求字段。</li>仅当 SkipScope 为 ManagedRules 或 ManagedRuleGroups 时有效。</p>
     */
    public void setSkipOption(String SkipOption) {
        this.SkipOption = SkipOption;
    }

    /**
     * Get <p>指定例外规则的安全防护模块，仅当 SkipScope 为 WebSecurityModules 时有效，取值有：<li>websec-mod-managed-rules：托管规则；</li><li>websec-mod-rate-limiting：速率限制；</li><li>websec-mod-custom-rules：自定义规则；</li><li>websec-mod-adaptive-control：自适应频控、智能客户端过滤、慢速攻击防护、流量盗刷防护；</li><li>websec-mod-bot：Bot管理。</li></p> 
     * @return WebSecurityModulesForException <p>指定例外规则的安全防护模块，仅当 SkipScope 为 WebSecurityModules 时有效，取值有：<li>websec-mod-managed-rules：托管规则；</li><li>websec-mod-rate-limiting：速率限制；</li><li>websec-mod-custom-rules：自定义规则；</li><li>websec-mod-adaptive-control：自适应频控、智能客户端过滤、慢速攻击防护、流量盗刷防护；</li><li>websec-mod-bot：Bot管理。</li></p>
     */
    public String [] getWebSecurityModulesForException() {
        return this.WebSecurityModulesForException;
    }

    /**
     * Set <p>指定例外规则的安全防护模块，仅当 SkipScope 为 WebSecurityModules 时有效，取值有：<li>websec-mod-managed-rules：托管规则；</li><li>websec-mod-rate-limiting：速率限制；</li><li>websec-mod-custom-rules：自定义规则；</li><li>websec-mod-adaptive-control：自适应频控、智能客户端过滤、慢速攻击防护、流量盗刷防护；</li><li>websec-mod-bot：Bot管理。</li></p>
     * @param WebSecurityModulesForException <p>指定例外规则的安全防护模块，仅当 SkipScope 为 WebSecurityModules 时有效，取值有：<li>websec-mod-managed-rules：托管规则；</li><li>websec-mod-rate-limiting：速率限制；</li><li>websec-mod-custom-rules：自定义规则；</li><li>websec-mod-adaptive-control：自适应频控、智能客户端过滤、慢速攻击防护、流量盗刷防护；</li><li>websec-mod-bot：Bot管理。</li></p>
     */
    public void setWebSecurityModulesForException(String [] WebSecurityModulesForException) {
        this.WebSecurityModulesForException = WebSecurityModulesForException;
    }

    /**
     * Get <p>指定例外规则的安全防护子模块，仅当 SkipScope 为 WebSecuritySubmodules 时有效。</p><p>枚举值：</p><ul><li>websec-mod-managed-rules/semantic-analysis： 托管规则-深度分析</li><li>websec-mod-managed-rules/managed-rule-groups： 托管规则-规则集</li><li>websec-mod-managed-rules/frequent-scanning-protection： 托管规则-高频扫描防护</li><li>websec-mod-rate-limiting-rules： 速率限制规则</li><li>websec-mod-custom-rules： 自定义规则</li><li>websec-mod-http-ddos-protection/adaptive-frequency-control： HTTP DDoS 防护-自适应频控</li><li>websec-mod-http-ddos-protection/client-filtering： HTTP DDoS 防护-智能客户端过滤</li><li>websec-mod-http-ddos-protection/bandwidth-abuse-defense： HTTP DDoS 防护-流量盗刷防护</li><li>websec-mod-bot-management/basic-feature： 高级 Bot 管理-基础特征管理</li><li>websec-mod-bot-management/ip-reputation： 高级 Bot 管理-客户端画像分析</li><li>websec-mod-bot-management/bot-intelligence： 高级 Bot 管理-智能 Bot 分析</li><li>websec-mod-bot-management/custom-rules： 高级 Bot 管理-自定义规则</li><li>websec-mod-bot-management/browser-impersonation-detection： 高级 Bot 管理-主动特征识别</li><li>websec-mod-bot-management/client-attestation-rules： 高级 Bot 管理-客户端认证</li><li>websec-mod-bot-management-lite/ai-crawler-detection： 基础 Bot 管理-AI 爬虫处置</li><li>websec-mod-bot-management-lite/captcha-page-challenge： 基础 Bot 管理-人机校验页</li></ul> 
     * @return WebSecuritySubmodulesForException <p>指定例外规则的安全防护子模块，仅当 SkipScope 为 WebSecuritySubmodules 时有效。</p><p>枚举值：</p><ul><li>websec-mod-managed-rules/semantic-analysis： 托管规则-深度分析</li><li>websec-mod-managed-rules/managed-rule-groups： 托管规则-规则集</li><li>websec-mod-managed-rules/frequent-scanning-protection： 托管规则-高频扫描防护</li><li>websec-mod-rate-limiting-rules： 速率限制规则</li><li>websec-mod-custom-rules： 自定义规则</li><li>websec-mod-http-ddos-protection/adaptive-frequency-control： HTTP DDoS 防护-自适应频控</li><li>websec-mod-http-ddos-protection/client-filtering： HTTP DDoS 防护-智能客户端过滤</li><li>websec-mod-http-ddos-protection/bandwidth-abuse-defense： HTTP DDoS 防护-流量盗刷防护</li><li>websec-mod-bot-management/basic-feature： 高级 Bot 管理-基础特征管理</li><li>websec-mod-bot-management/ip-reputation： 高级 Bot 管理-客户端画像分析</li><li>websec-mod-bot-management/bot-intelligence： 高级 Bot 管理-智能 Bot 分析</li><li>websec-mod-bot-management/custom-rules： 高级 Bot 管理-自定义规则</li><li>websec-mod-bot-management/browser-impersonation-detection： 高级 Bot 管理-主动特征识别</li><li>websec-mod-bot-management/client-attestation-rules： 高级 Bot 管理-客户端认证</li><li>websec-mod-bot-management-lite/ai-crawler-detection： 基础 Bot 管理-AI 爬虫处置</li><li>websec-mod-bot-management-lite/captcha-page-challenge： 基础 Bot 管理-人机校验页</li></ul>
     */
    public String [] getWebSecuritySubmodulesForException() {
        return this.WebSecuritySubmodulesForException;
    }

    /**
     * Set <p>指定例外规则的安全防护子模块，仅当 SkipScope 为 WebSecuritySubmodules 时有效。</p><p>枚举值：</p><ul><li>websec-mod-managed-rules/semantic-analysis： 托管规则-深度分析</li><li>websec-mod-managed-rules/managed-rule-groups： 托管规则-规则集</li><li>websec-mod-managed-rules/frequent-scanning-protection： 托管规则-高频扫描防护</li><li>websec-mod-rate-limiting-rules： 速率限制规则</li><li>websec-mod-custom-rules： 自定义规则</li><li>websec-mod-http-ddos-protection/adaptive-frequency-control： HTTP DDoS 防护-自适应频控</li><li>websec-mod-http-ddos-protection/client-filtering： HTTP DDoS 防护-智能客户端过滤</li><li>websec-mod-http-ddos-protection/bandwidth-abuse-defense： HTTP DDoS 防护-流量盗刷防护</li><li>websec-mod-bot-management/basic-feature： 高级 Bot 管理-基础特征管理</li><li>websec-mod-bot-management/ip-reputation： 高级 Bot 管理-客户端画像分析</li><li>websec-mod-bot-management/bot-intelligence： 高级 Bot 管理-智能 Bot 分析</li><li>websec-mod-bot-management/custom-rules： 高级 Bot 管理-自定义规则</li><li>websec-mod-bot-management/browser-impersonation-detection： 高级 Bot 管理-主动特征识别</li><li>websec-mod-bot-management/client-attestation-rules： 高级 Bot 管理-客户端认证</li><li>websec-mod-bot-management-lite/ai-crawler-detection： 基础 Bot 管理-AI 爬虫处置</li><li>websec-mod-bot-management-lite/captcha-page-challenge： 基础 Bot 管理-人机校验页</li></ul>
     * @param WebSecuritySubmodulesForException <p>指定例外规则的安全防护子模块，仅当 SkipScope 为 WebSecuritySubmodules 时有效。</p><p>枚举值：</p><ul><li>websec-mod-managed-rules/semantic-analysis： 托管规则-深度分析</li><li>websec-mod-managed-rules/managed-rule-groups： 托管规则-规则集</li><li>websec-mod-managed-rules/frequent-scanning-protection： 托管规则-高频扫描防护</li><li>websec-mod-rate-limiting-rules： 速率限制规则</li><li>websec-mod-custom-rules： 自定义规则</li><li>websec-mod-http-ddos-protection/adaptive-frequency-control： HTTP DDoS 防护-自适应频控</li><li>websec-mod-http-ddos-protection/client-filtering： HTTP DDoS 防护-智能客户端过滤</li><li>websec-mod-http-ddos-protection/bandwidth-abuse-defense： HTTP DDoS 防护-流量盗刷防护</li><li>websec-mod-bot-management/basic-feature： 高级 Bot 管理-基础特征管理</li><li>websec-mod-bot-management/ip-reputation： 高级 Bot 管理-客户端画像分析</li><li>websec-mod-bot-management/bot-intelligence： 高级 Bot 管理-智能 Bot 分析</li><li>websec-mod-bot-management/custom-rules： 高级 Bot 管理-自定义规则</li><li>websec-mod-bot-management/browser-impersonation-detection： 高级 Bot 管理-主动特征识别</li><li>websec-mod-bot-management/client-attestation-rules： 高级 Bot 管理-客户端认证</li><li>websec-mod-bot-management-lite/ai-crawler-detection： 基础 Bot 管理-AI 爬虫处置</li><li>websec-mod-bot-management-lite/captcha-page-challenge： 基础 Bot 管理-人机校验页</li></ul>
     */
    public void setWebSecuritySubmodulesForException(String [] WebSecuritySubmodulesForException) {
        this.WebSecuritySubmodulesForException = WebSecuritySubmodulesForException;
    }

    /**
     * Get <p>指定例外规则的具体托管规则，仅当 SkipScope 为 ManagedRules 时有效。</p> 
     * @return ManagedRulesForException <p>指定例外规则的具体托管规则，仅当 SkipScope 为 ManagedRules 时有效。</p>
     */
    public String [] getManagedRulesForException() {
        return this.ManagedRulesForException;
    }

    /**
     * Set <p>指定例外规则的具体托管规则，仅当 SkipScope 为 ManagedRules 时有效。</p>
     * @param ManagedRulesForException <p>指定例外规则的具体托管规则，仅当 SkipScope 为 ManagedRules 时有效。</p>
     */
    public void setManagedRulesForException(String [] ManagedRulesForException) {
        this.ManagedRulesForException = ManagedRulesForException;
    }

    /**
     * Get <p>指定例外规则的托管规则组，仅当 SkipScope 为 ManagedRuleGroups 时有效。</p> 
     * @return ManagedRuleGroupsForException <p>指定例外规则的托管规则组，仅当 SkipScope 为 ManagedRuleGroups 时有效。</p>
     */
    public String [] getManagedRuleGroupsForException() {
        return this.ManagedRuleGroupsForException;
    }

    /**
     * Set <p>指定例外规则的托管规则组，仅当 SkipScope 为 ManagedRuleGroups 时有效。</p>
     * @param ManagedRuleGroupsForException <p>指定例外规则的托管规则组，仅当 SkipScope 为 ManagedRuleGroups 时有效。</p>
     */
    public void setManagedRuleGroupsForException(String [] ManagedRuleGroupsForException) {
        this.ManagedRuleGroupsForException = ManagedRuleGroupsForException;
    }

    /**
     * Get <p>指定例外规则跳过指定请求字段的具体配置，仅当 SkipScope 为 ManagedRules 或 ManagedRuleGroups 并且 SkipOption 为 SkipOnSpecifiedRequestFields 时有效。</p> 
     * @return RequestFieldsForException <p>指定例外规则跳过指定请求字段的具体配置，仅当 SkipScope 为 ManagedRules 或 ManagedRuleGroups 并且 SkipOption 为 SkipOnSpecifiedRequestFields 时有效。</p>
     */
    public RequestFieldsForException [] getRequestFieldsForException() {
        return this.RequestFieldsForException;
    }

    /**
     * Set <p>指定例外规则跳过指定请求字段的具体配置，仅当 SkipScope 为 ManagedRules 或 ManagedRuleGroups 并且 SkipOption 为 SkipOnSpecifiedRequestFields 时有效。</p>
     * @param RequestFieldsForException <p>指定例外规则跳过指定请求字段的具体配置，仅当 SkipScope 为 ManagedRules 或 ManagedRuleGroups 并且 SkipOption 为 SkipOnSpecifiedRequestFields 时有效。</p>
     */
    public void setRequestFieldsForException(RequestFieldsForException [] RequestFieldsForException) {
        this.RequestFieldsForException = RequestFieldsForException;
    }

    /**
     * Get <p>例外规则是否开启。取值有：<li>on：开启</li><li>off：关闭</li></p> 
     * @return Enabled <p>例外规则是否开启。取值有：<li>on：开启</li><li>off：关闭</li></p>
     */
    public String getEnabled() {
        return this.Enabled;
    }

    /**
     * Set <p>例外规则是否开启。取值有：<li>on：开启</li><li>off：关闭</li></p>
     * @param Enabled <p>例外规则是否开启。取值有：<li>on：开启</li><li>off：关闭</li></p>
     */
    public void setEnabled(String Enabled) {
        this.Enabled = Enabled;
    }

    public ExceptionRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExceptionRule(ExceptionRule source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Condition != null) {
            this.Condition = new String(source.Condition);
        }
        if (source.SkipScope != null) {
            this.SkipScope = new String(source.SkipScope);
        }
        if (source.SkipOption != null) {
            this.SkipOption = new String(source.SkipOption);
        }
        if (source.WebSecurityModulesForException != null) {
            this.WebSecurityModulesForException = new String[source.WebSecurityModulesForException.length];
            for (int i = 0; i < source.WebSecurityModulesForException.length; i++) {
                this.WebSecurityModulesForException[i] = new String(source.WebSecurityModulesForException[i]);
            }
        }
        if (source.WebSecuritySubmodulesForException != null) {
            this.WebSecuritySubmodulesForException = new String[source.WebSecuritySubmodulesForException.length];
            for (int i = 0; i < source.WebSecuritySubmodulesForException.length; i++) {
                this.WebSecuritySubmodulesForException[i] = new String(source.WebSecuritySubmodulesForException[i]);
            }
        }
        if (source.ManagedRulesForException != null) {
            this.ManagedRulesForException = new String[source.ManagedRulesForException.length];
            for (int i = 0; i < source.ManagedRulesForException.length; i++) {
                this.ManagedRulesForException[i] = new String(source.ManagedRulesForException[i]);
            }
        }
        if (source.ManagedRuleGroupsForException != null) {
            this.ManagedRuleGroupsForException = new String[source.ManagedRuleGroupsForException.length];
            for (int i = 0; i < source.ManagedRuleGroupsForException.length; i++) {
                this.ManagedRuleGroupsForException[i] = new String(source.ManagedRuleGroupsForException[i]);
            }
        }
        if (source.RequestFieldsForException != null) {
            this.RequestFieldsForException = new RequestFieldsForException[source.RequestFieldsForException.length];
            for (int i = 0; i < source.RequestFieldsForException.length; i++) {
                this.RequestFieldsForException[i] = new RequestFieldsForException(source.RequestFieldsForException[i]);
            }
        }
        if (source.Enabled != null) {
            this.Enabled = new String(source.Enabled);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Condition", this.Condition);
        this.setParamSimple(map, prefix + "SkipScope", this.SkipScope);
        this.setParamSimple(map, prefix + "SkipOption", this.SkipOption);
        this.setParamArraySimple(map, prefix + "WebSecurityModulesForException.", this.WebSecurityModulesForException);
        this.setParamArraySimple(map, prefix + "WebSecuritySubmodulesForException.", this.WebSecuritySubmodulesForException);
        this.setParamArraySimple(map, prefix + "ManagedRulesForException.", this.ManagedRulesForException);
        this.setParamArraySimple(map, prefix + "ManagedRuleGroupsForException.", this.ManagedRuleGroupsForException);
        this.setParamArrayObj(map, prefix + "RequestFieldsForException.", this.RequestFieldsForException);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);

    }
}

