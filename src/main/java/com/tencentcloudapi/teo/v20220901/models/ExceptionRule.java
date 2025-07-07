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
    * 例外规则的 ID。<br>通过规则 ID 可支持不同的规则配置操作：<br> <li> <b>增加</b>新规则：ID 为空或不指定 ID 参数；</li><li> <b>修改</b>已有规则：指定需要更新/修改的规则 ID；</li><li> <b>删除</b>已有规则：ExceptionRules 参数中，Rules 列表中未包含的已有规则将被删除。</li>
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 例外规则的名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 例外规则的具体内容，需符合表达式语法，详细规范参见产品文档。
    */
    @SerializedName("Condition")
    @Expose
    private String Condition;

    /**
    * 例外规则执行选项，取值有：<li>WebSecurityModules: 指定例外规则的安全防护模块。</li><li>ManagedRules：指定托管规则。</li>
    */
    @SerializedName("SkipScope")
    @Expose
    private String SkipScope;

    /**
    * 跳过请求的具体类型，取值有：<li>SkipOnAllRequestFields: 跳过所有请求；</li><li>SkipOnSpecifiedRequestFields: 跳过指定请求字段。</li>仅当 SkipScope 为 ManagedRules 时有效。
    */
    @SerializedName("SkipOption")
    @Expose
    private String SkipOption;

    /**
    * 指定例外规则的安全防护模块，仅当 SkipScope 为 WebSecurityModules 时有效。取值有：<li>websec-mod-managed-rules：托管规则；</li><li>websec-mod-rate-limiting：速率限制；</li><li>websec-mod-custom-rules：自定义规则；</li><li>websec-mod-adaptive-control：自适应频控、智能客户端过滤、慢速攻击防护、流量盗刷防护；</li><li>websec-mod-bot：Bot管理。</li>
    */
    @SerializedName("WebSecurityModulesForException")
    @Expose
    private String [] WebSecurityModulesForException;

    /**
    * 指定例外规则的具体托管规则，仅当 SkipScope 为 ManagedRules 时有效，且此时不能指定 ManagedRuleGroupsForException 。
    */
    @SerializedName("ManagedRulesForException")
    @Expose
    private String [] ManagedRulesForException;

    /**
    * 指定例外规则的托管规则组，仅当 SkipScope 为 ManagedRules 时有效，且此时不能指定 ManagedRulesForException 。
    */
    @SerializedName("ManagedRuleGroupsForException")
    @Expose
    private String [] ManagedRuleGroupsForException;

    /**
    * 指定例外规则跳过指定请求字段的具体配置，仅当 SkipScope 为 ManagedRules 并且 SkipOption 为 SkipOnSpecifiedRequestFields 时有效。
    */
    @SerializedName("RequestFieldsForException")
    @Expose
    private RequestFieldsForException [] RequestFieldsForException;

    /**
    * 例外规则是否开启。取值有：<li>on：开启</li><li>off：关闭</li>
    */
    @SerializedName("Enabled")
    @Expose
    private String Enabled;

    /**
     * Get 例外规则的 ID。<br>通过规则 ID 可支持不同的规则配置操作：<br> <li> <b>增加</b>新规则：ID 为空或不指定 ID 参数；</li><li> <b>修改</b>已有规则：指定需要更新/修改的规则 ID；</li><li> <b>删除</b>已有规则：ExceptionRules 参数中，Rules 列表中未包含的已有规则将被删除。</li> 
     * @return Id 例外规则的 ID。<br>通过规则 ID 可支持不同的规则配置操作：<br> <li> <b>增加</b>新规则：ID 为空或不指定 ID 参数；</li><li> <b>修改</b>已有规则：指定需要更新/修改的规则 ID；</li><li> <b>删除</b>已有规则：ExceptionRules 参数中，Rules 列表中未包含的已有规则将被删除。</li>
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 例外规则的 ID。<br>通过规则 ID 可支持不同的规则配置操作：<br> <li> <b>增加</b>新规则：ID 为空或不指定 ID 参数；</li><li> <b>修改</b>已有规则：指定需要更新/修改的规则 ID；</li><li> <b>删除</b>已有规则：ExceptionRules 参数中，Rules 列表中未包含的已有规则将被删除。</li>
     * @param Id 例外规则的 ID。<br>通过规则 ID 可支持不同的规则配置操作：<br> <li> <b>增加</b>新规则：ID 为空或不指定 ID 参数；</li><li> <b>修改</b>已有规则：指定需要更新/修改的规则 ID；</li><li> <b>删除</b>已有规则：ExceptionRules 参数中，Rules 列表中未包含的已有规则将被删除。</li>
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 例外规则的名称。 
     * @return Name 例外规则的名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 例外规则的名称。
     * @param Name 例外规则的名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 例外规则的具体内容，需符合表达式语法，详细规范参见产品文档。 
     * @return Condition 例外规则的具体内容，需符合表达式语法，详细规范参见产品文档。
     */
    public String getCondition() {
        return this.Condition;
    }

    /**
     * Set 例外规则的具体内容，需符合表达式语法，详细规范参见产品文档。
     * @param Condition 例外规则的具体内容，需符合表达式语法，详细规范参见产品文档。
     */
    public void setCondition(String Condition) {
        this.Condition = Condition;
    }

    /**
     * Get 例外规则执行选项，取值有：<li>WebSecurityModules: 指定例外规则的安全防护模块。</li><li>ManagedRules：指定托管规则。</li> 
     * @return SkipScope 例外规则执行选项，取值有：<li>WebSecurityModules: 指定例外规则的安全防护模块。</li><li>ManagedRules：指定托管规则。</li>
     */
    public String getSkipScope() {
        return this.SkipScope;
    }

    /**
     * Set 例外规则执行选项，取值有：<li>WebSecurityModules: 指定例外规则的安全防护模块。</li><li>ManagedRules：指定托管规则。</li>
     * @param SkipScope 例外规则执行选项，取值有：<li>WebSecurityModules: 指定例外规则的安全防护模块。</li><li>ManagedRules：指定托管规则。</li>
     */
    public void setSkipScope(String SkipScope) {
        this.SkipScope = SkipScope;
    }

    /**
     * Get 跳过请求的具体类型，取值有：<li>SkipOnAllRequestFields: 跳过所有请求；</li><li>SkipOnSpecifiedRequestFields: 跳过指定请求字段。</li>仅当 SkipScope 为 ManagedRules 时有效。 
     * @return SkipOption 跳过请求的具体类型，取值有：<li>SkipOnAllRequestFields: 跳过所有请求；</li><li>SkipOnSpecifiedRequestFields: 跳过指定请求字段。</li>仅当 SkipScope 为 ManagedRules 时有效。
     */
    public String getSkipOption() {
        return this.SkipOption;
    }

    /**
     * Set 跳过请求的具体类型，取值有：<li>SkipOnAllRequestFields: 跳过所有请求；</li><li>SkipOnSpecifiedRequestFields: 跳过指定请求字段。</li>仅当 SkipScope 为 ManagedRules 时有效。
     * @param SkipOption 跳过请求的具体类型，取值有：<li>SkipOnAllRequestFields: 跳过所有请求；</li><li>SkipOnSpecifiedRequestFields: 跳过指定请求字段。</li>仅当 SkipScope 为 ManagedRules 时有效。
     */
    public void setSkipOption(String SkipOption) {
        this.SkipOption = SkipOption;
    }

    /**
     * Get 指定例外规则的安全防护模块，仅当 SkipScope 为 WebSecurityModules 时有效。取值有：<li>websec-mod-managed-rules：托管规则；</li><li>websec-mod-rate-limiting：速率限制；</li><li>websec-mod-custom-rules：自定义规则；</li><li>websec-mod-adaptive-control：自适应频控、智能客户端过滤、慢速攻击防护、流量盗刷防护；</li><li>websec-mod-bot：Bot管理。</li> 
     * @return WebSecurityModulesForException 指定例外规则的安全防护模块，仅当 SkipScope 为 WebSecurityModules 时有效。取值有：<li>websec-mod-managed-rules：托管规则；</li><li>websec-mod-rate-limiting：速率限制；</li><li>websec-mod-custom-rules：自定义规则；</li><li>websec-mod-adaptive-control：自适应频控、智能客户端过滤、慢速攻击防护、流量盗刷防护；</li><li>websec-mod-bot：Bot管理。</li>
     */
    public String [] getWebSecurityModulesForException() {
        return this.WebSecurityModulesForException;
    }

    /**
     * Set 指定例外规则的安全防护模块，仅当 SkipScope 为 WebSecurityModules 时有效。取值有：<li>websec-mod-managed-rules：托管规则；</li><li>websec-mod-rate-limiting：速率限制；</li><li>websec-mod-custom-rules：自定义规则；</li><li>websec-mod-adaptive-control：自适应频控、智能客户端过滤、慢速攻击防护、流量盗刷防护；</li><li>websec-mod-bot：Bot管理。</li>
     * @param WebSecurityModulesForException 指定例外规则的安全防护模块，仅当 SkipScope 为 WebSecurityModules 时有效。取值有：<li>websec-mod-managed-rules：托管规则；</li><li>websec-mod-rate-limiting：速率限制；</li><li>websec-mod-custom-rules：自定义规则；</li><li>websec-mod-adaptive-control：自适应频控、智能客户端过滤、慢速攻击防护、流量盗刷防护；</li><li>websec-mod-bot：Bot管理。</li>
     */
    public void setWebSecurityModulesForException(String [] WebSecurityModulesForException) {
        this.WebSecurityModulesForException = WebSecurityModulesForException;
    }

    /**
     * Get 指定例外规则的具体托管规则，仅当 SkipScope 为 ManagedRules 时有效，且此时不能指定 ManagedRuleGroupsForException 。 
     * @return ManagedRulesForException 指定例外规则的具体托管规则，仅当 SkipScope 为 ManagedRules 时有效，且此时不能指定 ManagedRuleGroupsForException 。
     */
    public String [] getManagedRulesForException() {
        return this.ManagedRulesForException;
    }

    /**
     * Set 指定例外规则的具体托管规则，仅当 SkipScope 为 ManagedRules 时有效，且此时不能指定 ManagedRuleGroupsForException 。
     * @param ManagedRulesForException 指定例外规则的具体托管规则，仅当 SkipScope 为 ManagedRules 时有效，且此时不能指定 ManagedRuleGroupsForException 。
     */
    public void setManagedRulesForException(String [] ManagedRulesForException) {
        this.ManagedRulesForException = ManagedRulesForException;
    }

    /**
     * Get 指定例外规则的托管规则组，仅当 SkipScope 为 ManagedRules 时有效，且此时不能指定 ManagedRulesForException 。 
     * @return ManagedRuleGroupsForException 指定例外规则的托管规则组，仅当 SkipScope 为 ManagedRules 时有效，且此时不能指定 ManagedRulesForException 。
     */
    public String [] getManagedRuleGroupsForException() {
        return this.ManagedRuleGroupsForException;
    }

    /**
     * Set 指定例外规则的托管规则组，仅当 SkipScope 为 ManagedRules 时有效，且此时不能指定 ManagedRulesForException 。
     * @param ManagedRuleGroupsForException 指定例外规则的托管规则组，仅当 SkipScope 为 ManagedRules 时有效，且此时不能指定 ManagedRulesForException 。
     */
    public void setManagedRuleGroupsForException(String [] ManagedRuleGroupsForException) {
        this.ManagedRuleGroupsForException = ManagedRuleGroupsForException;
    }

    /**
     * Get 指定例外规则跳过指定请求字段的具体配置，仅当 SkipScope 为 ManagedRules 并且 SkipOption 为 SkipOnSpecifiedRequestFields 时有效。 
     * @return RequestFieldsForException 指定例外规则跳过指定请求字段的具体配置，仅当 SkipScope 为 ManagedRules 并且 SkipOption 为 SkipOnSpecifiedRequestFields 时有效。
     */
    public RequestFieldsForException [] getRequestFieldsForException() {
        return this.RequestFieldsForException;
    }

    /**
     * Set 指定例外规则跳过指定请求字段的具体配置，仅当 SkipScope 为 ManagedRules 并且 SkipOption 为 SkipOnSpecifiedRequestFields 时有效。
     * @param RequestFieldsForException 指定例外规则跳过指定请求字段的具体配置，仅当 SkipScope 为 ManagedRules 并且 SkipOption 为 SkipOnSpecifiedRequestFields 时有效。
     */
    public void setRequestFieldsForException(RequestFieldsForException [] RequestFieldsForException) {
        this.RequestFieldsForException = RequestFieldsForException;
    }

    /**
     * Get 例外规则是否开启。取值有：<li>on：开启</li><li>off：关闭</li> 
     * @return Enabled 例外规则是否开启。取值有：<li>on：开启</li><li>off：关闭</li>
     */
    public String getEnabled() {
        return this.Enabled;
    }

    /**
     * Set 例外规则是否开启。取值有：<li>on：开启</li><li>off：关闭</li>
     * @param Enabled 例外规则是否开启。取值有：<li>on：开启</li><li>off：关闭</li>
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
        this.setParamArraySimple(map, prefix + "ManagedRulesForException.", this.ManagedRulesForException);
        this.setParamArraySimple(map, prefix + "ManagedRuleGroupsForException.", this.ManagedRuleGroupsForException);
        this.setParamArrayObj(map, prefix + "RequestFieldsForException.", this.RequestFieldsForException);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);

    }
}

