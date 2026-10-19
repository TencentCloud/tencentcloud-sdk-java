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

public class CustomRule extends AbstractModel {

    /**
    * <p>自定义规则的名称。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>自定义规则的具体内容，需符合表达式语法，详细规范参见 <a href="https://cloud.tencent.com/document/product/1552/125343">产品文档</a> 。</p>
    */
    @SerializedName("Condition")
    @Expose
    private String Condition;

    /**
    * <p>自定义规则的处置动作。SecurityAction.Name 取值范围如下：</p><ul><li>Allow：放行，其中 AllowActionParameters 支持 MinDelayTime 和 MaxDelayTime 配置；</li><li>Deny：拦截，其中 DenyActionParameters 中支持 BlockIp、ReturnCustomPage 和 Stall 配置；</li><li>Monitor：观察；</li><li>Challenge：挑战，其中 ChallengeActionParameters.ChallengeOption 支持 JSChallenge 和 ManagedChallenge；</li><li>Redirect：重定向至URL。</li></ul>
    */
    @SerializedName("Action")
    @Expose
    private SecurityAction Action;

    /**
    * <p>自定义规则是否开启。取值有：<ul><li>on：开启；</li><li>off：关闭。</li></ul></p>
    */
    @SerializedName("Enabled")
    @Expose
    private String Enabled;

    /**
    * <p>自定义规则的 ID。通过规则 ID 可支持不同的规则配置操作：<ul><li>增加新规则：ID 为空或不指定 ID 参数；</li><li>修改已有规则：指定需要更新/修改的规则 ID；</li><li>删除已有规则：CustomRules 参数中，Rules 列表中未包含的已有规则将被删除。</li></ul></p>
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * <p>自定义规则的类型。取值有：<ul><li>BasicAccessRule：基础访问管控；</li><li>PreciseMatchRule：精准匹配规则；</li><li>ManagedAccessRule：专家定制规则，仅出参支持。</li></ul>说明：当未指定 RuleType 时，默认为 <code>PreciseMatchRule</code>。</p>
    */
    @SerializedName("RuleType")
    @Expose
    private String RuleType;

    /**
    * <p>自定义规则的优先级，范围是 0 ~ 100，默认为 0，仅支持精准匹配规则（<code>PreciseMatchRule</code>）。</p>
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
     * Get <p>自定义规则的名称。</p> 
     * @return Name <p>自定义规则的名称。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>自定义规则的名称。</p>
     * @param Name <p>自定义规则的名称。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>自定义规则的具体内容，需符合表达式语法，详细规范参见 <a href="https://cloud.tencent.com/document/product/1552/125343">产品文档</a> 。</p> 
     * @return Condition <p>自定义规则的具体内容，需符合表达式语法，详细规范参见 <a href="https://cloud.tencent.com/document/product/1552/125343">产品文档</a> 。</p>
     */
    public String getCondition() {
        return this.Condition;
    }

    /**
     * Set <p>自定义规则的具体内容，需符合表达式语法，详细规范参见 <a href="https://cloud.tencent.com/document/product/1552/125343">产品文档</a> 。</p>
     * @param Condition <p>自定义规则的具体内容，需符合表达式语法，详细规范参见 <a href="https://cloud.tencent.com/document/product/1552/125343">产品文档</a> 。</p>
     */
    public void setCondition(String Condition) {
        this.Condition = Condition;
    }

    /**
     * Get <p>自定义规则的处置动作。SecurityAction.Name 取值范围如下：</p><ul><li>Allow：放行，其中 AllowActionParameters 支持 MinDelayTime 和 MaxDelayTime 配置；</li><li>Deny：拦截，其中 DenyActionParameters 中支持 BlockIp、ReturnCustomPage 和 Stall 配置；</li><li>Monitor：观察；</li><li>Challenge：挑战，其中 ChallengeActionParameters.ChallengeOption 支持 JSChallenge 和 ManagedChallenge；</li><li>Redirect：重定向至URL。</li></ul> 
     * @return Action <p>自定义规则的处置动作。SecurityAction.Name 取值范围如下：</p><ul><li>Allow：放行，其中 AllowActionParameters 支持 MinDelayTime 和 MaxDelayTime 配置；</li><li>Deny：拦截，其中 DenyActionParameters 中支持 BlockIp、ReturnCustomPage 和 Stall 配置；</li><li>Monitor：观察；</li><li>Challenge：挑战，其中 ChallengeActionParameters.ChallengeOption 支持 JSChallenge 和 ManagedChallenge；</li><li>Redirect：重定向至URL。</li></ul>
     */
    public SecurityAction getAction() {
        return this.Action;
    }

    /**
     * Set <p>自定义规则的处置动作。SecurityAction.Name 取值范围如下：</p><ul><li>Allow：放行，其中 AllowActionParameters 支持 MinDelayTime 和 MaxDelayTime 配置；</li><li>Deny：拦截，其中 DenyActionParameters 中支持 BlockIp、ReturnCustomPage 和 Stall 配置；</li><li>Monitor：观察；</li><li>Challenge：挑战，其中 ChallengeActionParameters.ChallengeOption 支持 JSChallenge 和 ManagedChallenge；</li><li>Redirect：重定向至URL。</li></ul>
     * @param Action <p>自定义规则的处置动作。SecurityAction.Name 取值范围如下：</p><ul><li>Allow：放行，其中 AllowActionParameters 支持 MinDelayTime 和 MaxDelayTime 配置；</li><li>Deny：拦截，其中 DenyActionParameters 中支持 BlockIp、ReturnCustomPage 和 Stall 配置；</li><li>Monitor：观察；</li><li>Challenge：挑战，其中 ChallengeActionParameters.ChallengeOption 支持 JSChallenge 和 ManagedChallenge；</li><li>Redirect：重定向至URL。</li></ul>
     */
    public void setAction(SecurityAction Action) {
        this.Action = Action;
    }

    /**
     * Get <p>自定义规则是否开启。取值有：<ul><li>on：开启；</li><li>off：关闭。</li></ul></p> 
     * @return Enabled <p>自定义规则是否开启。取值有：<ul><li>on：开启；</li><li>off：关闭。</li></ul></p>
     */
    public String getEnabled() {
        return this.Enabled;
    }

    /**
     * Set <p>自定义规则是否开启。取值有：<ul><li>on：开启；</li><li>off：关闭。</li></ul></p>
     * @param Enabled <p>自定义规则是否开启。取值有：<ul><li>on：开启；</li><li>off：关闭。</li></ul></p>
     */
    public void setEnabled(String Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get <p>自定义规则的 ID。通过规则 ID 可支持不同的规则配置操作：<ul><li>增加新规则：ID 为空或不指定 ID 参数；</li><li>修改已有规则：指定需要更新/修改的规则 ID；</li><li>删除已有规则：CustomRules 参数中，Rules 列表中未包含的已有规则将被删除。</li></ul></p> 
     * @return Id <p>自定义规则的 ID。通过规则 ID 可支持不同的规则配置操作：<ul><li>增加新规则：ID 为空或不指定 ID 参数；</li><li>修改已有规则：指定需要更新/修改的规则 ID；</li><li>删除已有规则：CustomRules 参数中，Rules 列表中未包含的已有规则将被删除。</li></ul></p>
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set <p>自定义规则的 ID。通过规则 ID 可支持不同的规则配置操作：<ul><li>增加新规则：ID 为空或不指定 ID 参数；</li><li>修改已有规则：指定需要更新/修改的规则 ID；</li><li>删除已有规则：CustomRules 参数中，Rules 列表中未包含的已有规则将被删除。</li></ul></p>
     * @param Id <p>自定义规则的 ID。通过规则 ID 可支持不同的规则配置操作：<ul><li>增加新规则：ID 为空或不指定 ID 参数；</li><li>修改已有规则：指定需要更新/修改的规则 ID；</li><li>删除已有规则：CustomRules 参数中，Rules 列表中未包含的已有规则将被删除。</li></ul></p>
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get <p>自定义规则的类型。取值有：<ul><li>BasicAccessRule：基础访问管控；</li><li>PreciseMatchRule：精准匹配规则；</li><li>ManagedAccessRule：专家定制规则，仅出参支持。</li></ul>说明：当未指定 RuleType 时，默认为 <code>PreciseMatchRule</code>。</p> 
     * @return RuleType <p>自定义规则的类型。取值有：<ul><li>BasicAccessRule：基础访问管控；</li><li>PreciseMatchRule：精准匹配规则；</li><li>ManagedAccessRule：专家定制规则，仅出参支持。</li></ul>说明：当未指定 RuleType 时，默认为 <code>PreciseMatchRule</code>。</p>
     */
    public String getRuleType() {
        return this.RuleType;
    }

    /**
     * Set <p>自定义规则的类型。取值有：<ul><li>BasicAccessRule：基础访问管控；</li><li>PreciseMatchRule：精准匹配规则；</li><li>ManagedAccessRule：专家定制规则，仅出参支持。</li></ul>说明：当未指定 RuleType 时，默认为 <code>PreciseMatchRule</code>。</p>
     * @param RuleType <p>自定义规则的类型。取值有：<ul><li>BasicAccessRule：基础访问管控；</li><li>PreciseMatchRule：精准匹配规则；</li><li>ManagedAccessRule：专家定制规则，仅出参支持。</li></ul>说明：当未指定 RuleType 时，默认为 <code>PreciseMatchRule</code>。</p>
     */
    public void setRuleType(String RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get <p>自定义规则的优先级，范围是 0 ~ 100，默认为 0，仅支持精准匹配规则（<code>PreciseMatchRule</code>）。</p> 
     * @return Priority <p>自定义规则的优先级，范围是 0 ~ 100，默认为 0，仅支持精准匹配规则（<code>PreciseMatchRule</code>）。</p>
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set <p>自定义规则的优先级，范围是 0 ~ 100，默认为 0，仅支持精准匹配规则（<code>PreciseMatchRule</code>）。</p>
     * @param Priority <p>自定义规则的优先级，范围是 0 ~ 100，默认为 0，仅支持精准匹配规则（<code>PreciseMatchRule</code>）。</p>
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    public CustomRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CustomRule(CustomRule source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Condition != null) {
            this.Condition = new String(source.Condition);
        }
        if (source.Action != null) {
            this.Action = new SecurityAction(source.Action);
        }
        if (source.Enabled != null) {
            this.Enabled = new String(source.Enabled);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.RuleType != null) {
            this.RuleType = new String(source.RuleType);
        }
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Condition", this.Condition);
        this.setParamObj(map, prefix + "Action.", this.Action);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamSimple(map, prefix + "Priority", this.Priority);

    }
}

