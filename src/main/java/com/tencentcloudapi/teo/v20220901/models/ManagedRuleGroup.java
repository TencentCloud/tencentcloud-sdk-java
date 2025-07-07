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

public class ManagedRuleGroup extends AbstractModel {

    /**
    * 托管规则的组名称，未指定配置的规则分组将按照默认配置处理，GroupId 的具体取值参考产品文档。
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 托管规则组的防护级别。取值有：<li>loose：宽松，只包含超高风险规则，此时需配置Action，且RuleActions配置无效；</li><li>normal：正常，包含超高风险和高风险规则，此时需配置Action，且RuleActions配置无效；</li><li>strict：严格，包含超高风险、高风险和中风险规则，此时需配置Action，且RuleActions配置无效；</li><li>extreme：超严格，包含超高风险、高风险、中风险和低风险规则，此时需配置Action，且RuleActions配置无效；</li><li>custom：自定义，精细化策略，按单条规则配置处置方式，此时Action字段无效，使用RuleActions配置单条规则的精细化策略。</li>	
    */
    @SerializedName("SensitivityLevel")
    @Expose
    private String SensitivityLevel;

    /**
    * 托管规则组的处置动作。SecurityAction 的 Name 取值支持：<li>Deny：拦截，响应拦截页面；</li><li>Monitor：观察，不处理请求记录安全事件到日志中；</li><li>Disabled：未启用，不扫描请求跳过该规则。</li>
    */
    @SerializedName("Action")
    @Expose
    private SecurityAction Action;

    /**
    * 托管规则组下规则项的具体配置，仅在 SensitivityLevel 为 custom 时配置生效。
    */
    @SerializedName("RuleActions")
    @Expose
    private ManagedRuleAction [] RuleActions;

    /**
    * 托管规则组信息，仅出参。	
    */
    @SerializedName("MetaData")
    @Expose
    private ManagedRuleGroupMeta MetaData;

    /**
     * Get 托管规则的组名称，未指定配置的规则分组将按照默认配置处理，GroupId 的具体取值参考产品文档。 
     * @return GroupId 托管规则的组名称，未指定配置的规则分组将按照默认配置处理，GroupId 的具体取值参考产品文档。
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 托管规则的组名称，未指定配置的规则分组将按照默认配置处理，GroupId 的具体取值参考产品文档。
     * @param GroupId 托管规则的组名称，未指定配置的规则分组将按照默认配置处理，GroupId 的具体取值参考产品文档。
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 托管规则组的防护级别。取值有：<li>loose：宽松，只包含超高风险规则，此时需配置Action，且RuleActions配置无效；</li><li>normal：正常，包含超高风险和高风险规则，此时需配置Action，且RuleActions配置无效；</li><li>strict：严格，包含超高风险、高风险和中风险规则，此时需配置Action，且RuleActions配置无效；</li><li>extreme：超严格，包含超高风险、高风险、中风险和低风险规则，此时需配置Action，且RuleActions配置无效；</li><li>custom：自定义，精细化策略，按单条规则配置处置方式，此时Action字段无效，使用RuleActions配置单条规则的精细化策略。</li>	 
     * @return SensitivityLevel 托管规则组的防护级别。取值有：<li>loose：宽松，只包含超高风险规则，此时需配置Action，且RuleActions配置无效；</li><li>normal：正常，包含超高风险和高风险规则，此时需配置Action，且RuleActions配置无效；</li><li>strict：严格，包含超高风险、高风险和中风险规则，此时需配置Action，且RuleActions配置无效；</li><li>extreme：超严格，包含超高风险、高风险、中风险和低风险规则，此时需配置Action，且RuleActions配置无效；</li><li>custom：自定义，精细化策略，按单条规则配置处置方式，此时Action字段无效，使用RuleActions配置单条规则的精细化策略。</li>	
     */
    public String getSensitivityLevel() {
        return this.SensitivityLevel;
    }

    /**
     * Set 托管规则组的防护级别。取值有：<li>loose：宽松，只包含超高风险规则，此时需配置Action，且RuleActions配置无效；</li><li>normal：正常，包含超高风险和高风险规则，此时需配置Action，且RuleActions配置无效；</li><li>strict：严格，包含超高风险、高风险和中风险规则，此时需配置Action，且RuleActions配置无效；</li><li>extreme：超严格，包含超高风险、高风险、中风险和低风险规则，此时需配置Action，且RuleActions配置无效；</li><li>custom：自定义，精细化策略，按单条规则配置处置方式，此时Action字段无效，使用RuleActions配置单条规则的精细化策略。</li>	
     * @param SensitivityLevel 托管规则组的防护级别。取值有：<li>loose：宽松，只包含超高风险规则，此时需配置Action，且RuleActions配置无效；</li><li>normal：正常，包含超高风险和高风险规则，此时需配置Action，且RuleActions配置无效；</li><li>strict：严格，包含超高风险、高风险和中风险规则，此时需配置Action，且RuleActions配置无效；</li><li>extreme：超严格，包含超高风险、高风险、中风险和低风险规则，此时需配置Action，且RuleActions配置无效；</li><li>custom：自定义，精细化策略，按单条规则配置处置方式，此时Action字段无效，使用RuleActions配置单条规则的精细化策略。</li>	
     */
    public void setSensitivityLevel(String SensitivityLevel) {
        this.SensitivityLevel = SensitivityLevel;
    }

    /**
     * Get 托管规则组的处置动作。SecurityAction 的 Name 取值支持：<li>Deny：拦截，响应拦截页面；</li><li>Monitor：观察，不处理请求记录安全事件到日志中；</li><li>Disabled：未启用，不扫描请求跳过该规则。</li> 
     * @return Action 托管规则组的处置动作。SecurityAction 的 Name 取值支持：<li>Deny：拦截，响应拦截页面；</li><li>Monitor：观察，不处理请求记录安全事件到日志中；</li><li>Disabled：未启用，不扫描请求跳过该规则。</li>
     */
    public SecurityAction getAction() {
        return this.Action;
    }

    /**
     * Set 托管规则组的处置动作。SecurityAction 的 Name 取值支持：<li>Deny：拦截，响应拦截页面；</li><li>Monitor：观察，不处理请求记录安全事件到日志中；</li><li>Disabled：未启用，不扫描请求跳过该规则。</li>
     * @param Action 托管规则组的处置动作。SecurityAction 的 Name 取值支持：<li>Deny：拦截，响应拦截页面；</li><li>Monitor：观察，不处理请求记录安全事件到日志中；</li><li>Disabled：未启用，不扫描请求跳过该规则。</li>
     */
    public void setAction(SecurityAction Action) {
        this.Action = Action;
    }

    /**
     * Get 托管规则组下规则项的具体配置，仅在 SensitivityLevel 为 custom 时配置生效。 
     * @return RuleActions 托管规则组下规则项的具体配置，仅在 SensitivityLevel 为 custom 时配置生效。
     */
    public ManagedRuleAction [] getRuleActions() {
        return this.RuleActions;
    }

    /**
     * Set 托管规则组下规则项的具体配置，仅在 SensitivityLevel 为 custom 时配置生效。
     * @param RuleActions 托管规则组下规则项的具体配置，仅在 SensitivityLevel 为 custom 时配置生效。
     */
    public void setRuleActions(ManagedRuleAction [] RuleActions) {
        this.RuleActions = RuleActions;
    }

    /**
     * Get 托管规则组信息，仅出参。	 
     * @return MetaData 托管规则组信息，仅出参。	
     */
    public ManagedRuleGroupMeta getMetaData() {
        return this.MetaData;
    }

    /**
     * Set 托管规则组信息，仅出参。	
     * @param MetaData 托管规则组信息，仅出参。	
     */
    public void setMetaData(ManagedRuleGroupMeta MetaData) {
        this.MetaData = MetaData;
    }

    public ManagedRuleGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ManagedRuleGroup(ManagedRuleGroup source) {
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.SensitivityLevel != null) {
            this.SensitivityLevel = new String(source.SensitivityLevel);
        }
        if (source.Action != null) {
            this.Action = new SecurityAction(source.Action);
        }
        if (source.RuleActions != null) {
            this.RuleActions = new ManagedRuleAction[source.RuleActions.length];
            for (int i = 0; i < source.RuleActions.length; i++) {
                this.RuleActions[i] = new ManagedRuleAction(source.RuleActions[i]);
            }
        }
        if (source.MetaData != null) {
            this.MetaData = new ManagedRuleGroupMeta(source.MetaData);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "SensitivityLevel", this.SensitivityLevel);
        this.setParamObj(map, prefix + "Action.", this.Action);
        this.setParamArrayObj(map, prefix + "RuleActions.", this.RuleActions);
        this.setParamObj(map, prefix + "MetaData.", this.MetaData);

    }
}

