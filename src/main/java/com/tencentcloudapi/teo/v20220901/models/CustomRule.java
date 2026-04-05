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
    * 自定义规则的名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 自定义规则的具体内容，需符合表达式语法，详细规范参见 [产品文档](https://cloud.tencent.com/document/product/1552/125343) 。
    */
    @SerializedName("Condition")
    @Expose
    private String Condition;

    /**
    * 自定义规则的处置动作。SecurityAction.Name 取值范围如下：<ul><li>Deny：拦截；</li><li>Monitor：观察；</li><li>ReturnCustomPage：使用指定页面拦截；</li><li>Redirect：重定向至 URL；</li><li>BlockIP：IP 封禁；</li><li>JSChallenge：JavaScript 挑战；</li><li>ManagedChallenge：托管挑战；</li><li>Allow：放行。</li></ul>
    */
    @SerializedName("Action")
    @Expose
    private SecurityAction Action;

    /**
    * 自定义规则是否开启。取值有：<ul><li>on：开启</li><li>off：关闭</li></ul>
    */
    @SerializedName("Enabled")
    @Expose
    private String Enabled;

    /**
    * 自定义规则的 ID。通过规则 ID 可支持不同的规则配置操作：<ul><li>增加新规则：ID 为空或不指定 ID 参数；</li><li>修改已有规则：指定需要更新/修改的规则 ID；</li><li>删除已有规则：CustomRules 参数中，Rules 列表中未包含的已有规则将被删除。</li></ul>
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 自定义规则的类型。取值有：<ul><li>BasicAccessRule：基础访问管控；</li><li>PreciseMatchRule：精准匹配规则；</li><li>ManagedAccessRule：专家定制规则，仅出参支持。</li></ul>说明：当未指定 RuleType 时，默认为 `PreciseMatchRule`。
    */
    @SerializedName("RuleType")
    @Expose
    private String RuleType;

    /**
    * 自定义规则的优先级，范围是 0 ~ 100，默认为 0，仅支持精准匹配规则（`PreciseMatchRule`）。
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
     * Get 自定义规则的名称。 
     * @return Name 自定义规则的名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 自定义规则的名称。
     * @param Name 自定义规则的名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 自定义规则的具体内容，需符合表达式语法，详细规范参见 [产品文档](https://cloud.tencent.com/document/product/1552/125343) 。 
     * @return Condition 自定义规则的具体内容，需符合表达式语法，详细规范参见 [产品文档](https://cloud.tencent.com/document/product/1552/125343) 。
     */
    public String getCondition() {
        return this.Condition;
    }

    /**
     * Set 自定义规则的具体内容，需符合表达式语法，详细规范参见 [产品文档](https://cloud.tencent.com/document/product/1552/125343) 。
     * @param Condition 自定义规则的具体内容，需符合表达式语法，详细规范参见 [产品文档](https://cloud.tencent.com/document/product/1552/125343) 。
     */
    public void setCondition(String Condition) {
        this.Condition = Condition;
    }

    /**
     * Get 自定义规则的处置动作。SecurityAction.Name 取值范围如下：<ul><li>Deny：拦截；</li><li>Monitor：观察；</li><li>ReturnCustomPage：使用指定页面拦截；</li><li>Redirect：重定向至 URL；</li><li>BlockIP：IP 封禁；</li><li>JSChallenge：JavaScript 挑战；</li><li>ManagedChallenge：托管挑战；</li><li>Allow：放行。</li></ul> 
     * @return Action 自定义规则的处置动作。SecurityAction.Name 取值范围如下：<ul><li>Deny：拦截；</li><li>Monitor：观察；</li><li>ReturnCustomPage：使用指定页面拦截；</li><li>Redirect：重定向至 URL；</li><li>BlockIP：IP 封禁；</li><li>JSChallenge：JavaScript 挑战；</li><li>ManagedChallenge：托管挑战；</li><li>Allow：放行。</li></ul>
     */
    public SecurityAction getAction() {
        return this.Action;
    }

    /**
     * Set 自定义规则的处置动作。SecurityAction.Name 取值范围如下：<ul><li>Deny：拦截；</li><li>Monitor：观察；</li><li>ReturnCustomPage：使用指定页面拦截；</li><li>Redirect：重定向至 URL；</li><li>BlockIP：IP 封禁；</li><li>JSChallenge：JavaScript 挑战；</li><li>ManagedChallenge：托管挑战；</li><li>Allow：放行。</li></ul>
     * @param Action 自定义规则的处置动作。SecurityAction.Name 取值范围如下：<ul><li>Deny：拦截；</li><li>Monitor：观察；</li><li>ReturnCustomPage：使用指定页面拦截；</li><li>Redirect：重定向至 URL；</li><li>BlockIP：IP 封禁；</li><li>JSChallenge：JavaScript 挑战；</li><li>ManagedChallenge：托管挑战；</li><li>Allow：放行。</li></ul>
     */
    public void setAction(SecurityAction Action) {
        this.Action = Action;
    }

    /**
     * Get 自定义规则是否开启。取值有：<ul><li>on：开启</li><li>off：关闭</li></ul> 
     * @return Enabled 自定义规则是否开启。取值有：<ul><li>on：开启</li><li>off：关闭</li></ul>
     */
    public String getEnabled() {
        return this.Enabled;
    }

    /**
     * Set 自定义规则是否开启。取值有：<ul><li>on：开启</li><li>off：关闭</li></ul>
     * @param Enabled 自定义规则是否开启。取值有：<ul><li>on：开启</li><li>off：关闭</li></ul>
     */
    public void setEnabled(String Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get 自定义规则的 ID。通过规则 ID 可支持不同的规则配置操作：<ul><li>增加新规则：ID 为空或不指定 ID 参数；</li><li>修改已有规则：指定需要更新/修改的规则 ID；</li><li>删除已有规则：CustomRules 参数中，Rules 列表中未包含的已有规则将被删除。</li></ul> 
     * @return Id 自定义规则的 ID。通过规则 ID 可支持不同的规则配置操作：<ul><li>增加新规则：ID 为空或不指定 ID 参数；</li><li>修改已有规则：指定需要更新/修改的规则 ID；</li><li>删除已有规则：CustomRules 参数中，Rules 列表中未包含的已有规则将被删除。</li></ul>
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 自定义规则的 ID。通过规则 ID 可支持不同的规则配置操作：<ul><li>增加新规则：ID 为空或不指定 ID 参数；</li><li>修改已有规则：指定需要更新/修改的规则 ID；</li><li>删除已有规则：CustomRules 参数中，Rules 列表中未包含的已有规则将被删除。</li></ul>
     * @param Id 自定义规则的 ID。通过规则 ID 可支持不同的规则配置操作：<ul><li>增加新规则：ID 为空或不指定 ID 参数；</li><li>修改已有规则：指定需要更新/修改的规则 ID；</li><li>删除已有规则：CustomRules 参数中，Rules 列表中未包含的已有规则将被删除。</li></ul>
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 自定义规则的类型。取值有：<ul><li>BasicAccessRule：基础访问管控；</li><li>PreciseMatchRule：精准匹配规则；</li><li>ManagedAccessRule：专家定制规则，仅出参支持。</li></ul>说明：当未指定 RuleType 时，默认为 `PreciseMatchRule`。 
     * @return RuleType 自定义规则的类型。取值有：<ul><li>BasicAccessRule：基础访问管控；</li><li>PreciseMatchRule：精准匹配规则；</li><li>ManagedAccessRule：专家定制规则，仅出参支持。</li></ul>说明：当未指定 RuleType 时，默认为 `PreciseMatchRule`。
     */
    public String getRuleType() {
        return this.RuleType;
    }

    /**
     * Set 自定义规则的类型。取值有：<ul><li>BasicAccessRule：基础访问管控；</li><li>PreciseMatchRule：精准匹配规则；</li><li>ManagedAccessRule：专家定制规则，仅出参支持。</li></ul>说明：当未指定 RuleType 时，默认为 `PreciseMatchRule`。
     * @param RuleType 自定义规则的类型。取值有：<ul><li>BasicAccessRule：基础访问管控；</li><li>PreciseMatchRule：精准匹配规则；</li><li>ManagedAccessRule：专家定制规则，仅出参支持。</li></ul>说明：当未指定 RuleType 时，默认为 `PreciseMatchRule`。
     */
    public void setRuleType(String RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get 自定义规则的优先级，范围是 0 ~ 100，默认为 0，仅支持精准匹配规则（`PreciseMatchRule`）。 
     * @return Priority 自定义规则的优先级，范围是 0 ~ 100，默认为 0，仅支持精准匹配规则（`PreciseMatchRule`）。
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set 自定义规则的优先级，范围是 0 ~ 100，默认为 0，仅支持精准匹配规则（`PreciseMatchRule`）。
     * @param Priority 自定义规则的优先级，范围是 0 ~ 100，默认为 0，仅支持精准匹配规则（`PreciseMatchRule`）。
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

