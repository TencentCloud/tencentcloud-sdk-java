/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAuditRuleTemplateRequest extends AbstractModel {

    /**
    * 审计规则。
    */
    @SerializedName("RuleFilters")
    @Expose
    private RuleFilters [] RuleFilters;

    /**
    * 规则模板名称。最多支持输入30个字符。
    */
    @SerializedName("RuleTemplateName")
    @Expose
    private String RuleTemplateName;

    /**
    * 规则模板描述。最多支持输入200个字符。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 告警等级。1 - 低风险，2 - 中风险，3 - 高风险。默认值为1。
    */
    @SerializedName("AlarmLevel")
    @Expose
    private Long AlarmLevel;

    /**
    * 告警策略。0 - 不告警，1 - 告警。默认值为0。
    */
    @SerializedName("AlarmPolicy")
    @Expose
    private Long AlarmPolicy;

    /**
     * Get 审计规则。 
     * @return RuleFilters 审计规则。
     */
    public RuleFilters [] getRuleFilters() {
        return this.RuleFilters;
    }

    /**
     * Set 审计规则。
     * @param RuleFilters 审计规则。
     */
    public void setRuleFilters(RuleFilters [] RuleFilters) {
        this.RuleFilters = RuleFilters;
    }

    /**
     * Get 规则模板名称。最多支持输入30个字符。 
     * @return RuleTemplateName 规则模板名称。最多支持输入30个字符。
     */
    public String getRuleTemplateName() {
        return this.RuleTemplateName;
    }

    /**
     * Set 规则模板名称。最多支持输入30个字符。
     * @param RuleTemplateName 规则模板名称。最多支持输入30个字符。
     */
    public void setRuleTemplateName(String RuleTemplateName) {
        this.RuleTemplateName = RuleTemplateName;
    }

    /**
     * Get 规则模板描述。最多支持输入200个字符。 
     * @return Description 规则模板描述。最多支持输入200个字符。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 规则模板描述。最多支持输入200个字符。
     * @param Description 规则模板描述。最多支持输入200个字符。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 告警等级。1 - 低风险，2 - 中风险，3 - 高风险。默认值为1。 
     * @return AlarmLevel 告警等级。1 - 低风险，2 - 中风险，3 - 高风险。默认值为1。
     */
    public Long getAlarmLevel() {
        return this.AlarmLevel;
    }

    /**
     * Set 告警等级。1 - 低风险，2 - 中风险，3 - 高风险。默认值为1。
     * @param AlarmLevel 告警等级。1 - 低风险，2 - 中风险，3 - 高风险。默认值为1。
     */
    public void setAlarmLevel(Long AlarmLevel) {
        this.AlarmLevel = AlarmLevel;
    }

    /**
     * Get 告警策略。0 - 不告警，1 - 告警。默认值为0。 
     * @return AlarmPolicy 告警策略。0 - 不告警，1 - 告警。默认值为0。
     */
    public Long getAlarmPolicy() {
        return this.AlarmPolicy;
    }

    /**
     * Set 告警策略。0 - 不告警，1 - 告警。默认值为0。
     * @param AlarmPolicy 告警策略。0 - 不告警，1 - 告警。默认值为0。
     */
    public void setAlarmPolicy(Long AlarmPolicy) {
        this.AlarmPolicy = AlarmPolicy;
    }

    public CreateAuditRuleTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAuditRuleTemplateRequest(CreateAuditRuleTemplateRequest source) {
        if (source.RuleFilters != null) {
            this.RuleFilters = new RuleFilters[source.RuleFilters.length];
            for (int i = 0; i < source.RuleFilters.length; i++) {
                this.RuleFilters[i] = new RuleFilters(source.RuleFilters[i]);
            }
        }
        if (source.RuleTemplateName != null) {
            this.RuleTemplateName = new String(source.RuleTemplateName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.AlarmLevel != null) {
            this.AlarmLevel = new Long(source.AlarmLevel);
        }
        if (source.AlarmPolicy != null) {
            this.AlarmPolicy = new Long(source.AlarmPolicy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "RuleFilters.", this.RuleFilters);
        this.setParamSimple(map, prefix + "RuleTemplateName", this.RuleTemplateName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "AlarmLevel", this.AlarmLevel);
        this.setParamSimple(map, prefix + "AlarmPolicy", this.AlarmPolicy);

    }
}

