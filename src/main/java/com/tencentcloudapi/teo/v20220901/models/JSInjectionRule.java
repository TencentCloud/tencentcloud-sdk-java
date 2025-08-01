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

public class JSInjectionRule extends AbstractModel {

    /**
    * 规则 ID。
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * 规则名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 规则优先级，数值越小越优先执行，范围是 0 ~ 100，默认为 0。
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * 匹配条件内容。需符合表达式语法，详细规范参见产品文档。
    */
    @SerializedName("Condition")
    @Expose
    private String Condition;

    /**
    * JavaScript 注入选项。默认值为 run-attestations，取值有：
<li> no-injection: 不注入 JavaScript;</li>
<li> inject-sdk-only: 注入当前支持的所有认证方式的 SDK，当前支持：TC-RCE 和 TC-CAPTCHA。注意：若需执行认证检测，请配置挑战规则。</li>

    */
    @SerializedName("InjectJS")
    @Expose
    private String InjectJS;

    /**
     * Get 规则 ID。 
     * @return RuleId 规则 ID。
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 规则 ID。
     * @param RuleId 规则 ID。
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 规则名称。 
     * @return Name 规则名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 规则名称。
     * @param Name 规则名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 规则优先级，数值越小越优先执行，范围是 0 ~ 100，默认为 0。 
     * @return Priority 规则优先级，数值越小越优先执行，范围是 0 ~ 100，默认为 0。
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set 规则优先级，数值越小越优先执行，范围是 0 ~ 100，默认为 0。
     * @param Priority 规则优先级，数值越小越优先执行，范围是 0 ~ 100，默认为 0。
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get 匹配条件内容。需符合表达式语法，详细规范参见产品文档。 
     * @return Condition 匹配条件内容。需符合表达式语法，详细规范参见产品文档。
     */
    public String getCondition() {
        return this.Condition;
    }

    /**
     * Set 匹配条件内容。需符合表达式语法，详细规范参见产品文档。
     * @param Condition 匹配条件内容。需符合表达式语法，详细规范参见产品文档。
     */
    public void setCondition(String Condition) {
        this.Condition = Condition;
    }

    /**
     * Get JavaScript 注入选项。默认值为 run-attestations，取值有：
<li> no-injection: 不注入 JavaScript;</li>
<li> inject-sdk-only: 注入当前支持的所有认证方式的 SDK，当前支持：TC-RCE 和 TC-CAPTCHA。注意：若需执行认证检测，请配置挑战规则。</li>
 
     * @return InjectJS JavaScript 注入选项。默认值为 run-attestations，取值有：
<li> no-injection: 不注入 JavaScript;</li>
<li> inject-sdk-only: 注入当前支持的所有认证方式的 SDK，当前支持：TC-RCE 和 TC-CAPTCHA。注意：若需执行认证检测，请配置挑战规则。</li>

     */
    public String getInjectJS() {
        return this.InjectJS;
    }

    /**
     * Set JavaScript 注入选项。默认值为 run-attestations，取值有：
<li> no-injection: 不注入 JavaScript;</li>
<li> inject-sdk-only: 注入当前支持的所有认证方式的 SDK，当前支持：TC-RCE 和 TC-CAPTCHA。注意：若需执行认证检测，请配置挑战规则。</li>

     * @param InjectJS JavaScript 注入选项。默认值为 run-attestations，取值有：
<li> no-injection: 不注入 JavaScript;</li>
<li> inject-sdk-only: 注入当前支持的所有认证方式的 SDK，当前支持：TC-RCE 和 TC-CAPTCHA。注意：若需执行认证检测，请配置挑战规则。</li>

     */
    public void setInjectJS(String InjectJS) {
        this.InjectJS = InjectJS;
    }

    public JSInjectionRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public JSInjectionRule(JSInjectionRule source) {
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
        if (source.Condition != null) {
            this.Condition = new String(source.Condition);
        }
        if (source.InjectJS != null) {
            this.InjectJS = new String(source.InjectJS);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamSimple(map, prefix + "Condition", this.Condition);
        this.setParamSimple(map, prefix + "InjectJS", this.InjectJS);

    }
}

